""" This file having all configuration conversion """

import logging
from avi.migrationtools.avi_migration_utils import MigrationUtil
from avi.migrationtools.avi_converter import AviConverter
from avi.migrationtools.ace_converter.ace_utils import update_excel
from avi.migrationtools.ace_converter.pool_converter import PoolConverter
from avi.migrationtools.ace_converter.monitor_converter import MonitorConverter
from avi.migrationtools.ace_converter.vs_converter import VSConverter
from avi.migrationtools.ace_converter.persistance_conversion import\
                                                PersistanceConverter
from avi.migrationtools.ace_converter.ssl_converter import SSLConverter

# init logger
LOG = logging.getLogger(__name__)

class ConfigConverter(object):
    """ Configuration conversion happens here """

    def __init__(self, parsed_output, enable_vs=False, version='17.1.1',
                 input_folder_loc=None, tenant=None, cloud=None):
        """ Create Some common Objects over here """
        self.aviobj = AviConverter()
        self.parsed = parsed_output
        self.common_utils = MigrationUtil()
        self.version = version
        self.enable_vs = enable_vs
        self.input_file_loc = input_folder_loc
        self.tenant = tenant
        self.cloud = cloud

        self.tenant_ref = self.common_utils.get_object_ref(self.tenant, 'tenant')
        self.cloud_ref = self.common_utils.get_object_ref(self.cloud, 'cloud')
        #creating objects for converters
        self.pool = PoolConverter(parsed=self.parsed,
                                  tenant_ref=self.tenant_ref,
                                  common_utils=self.common_utils,
                                  cloud_ref=self.cloud_ref,
                                  tenant=self.tenant
                                  )
        self.monitor = MonitorConverter(parsed=self.parsed,
                                        tenant_ref=self.tenant_ref,
                                        common_utils=self.common_utils,
                                        tenant=self.tenant
                                       )

        self.vs = VSConverter(parsed=self.parsed,
                              tenant_ref=self.tenant_ref,
                              common_utils=self.common_utils,
                              enable_vs=self.enable_vs,
                              cloud_ref=self.cloud_ref,
                              tenant=self.tenant
                              )

        self.persistance = PersistanceConverter(parsed=self.parsed,
                                                tenant_ref=self.tenant_ref,
                                                common_utils=self.common_utils,
                                                tenant=self.tenant
                                                )

        self.ssl = SSLConverter(parsed=self.parsed,
                                tenant_ref=self.tenant_ref,
                                common_utils=self.common_utils,
                                in_path=self.input_file_loc,
                                tenant=self.tenant
                                )

    def conversion(self):
        """ All conversion controller over here """
        data = dict()
        data['META'] = self.aviobj.meta(tenant=self.tenant, controller_version=self.version)
        data['Pool'] = self.pool.pool_conversion()
        data['HealthMonitor'] = self.monitor.healthmonitor_conversion()
        data['ApplicationPersistenceProfile'] = self.persistance.app_persistance_conversion()
        data['VsVip'] = self.vs.vsvip_conversion()
        vs_list, cloned_pool_list = self.vs.virtual_service_conversion(data)
        data['VirtualService'] = vs_list
        data['Pool'].extend(cloned_pool_list)
        data['SSLProfile'] = self.ssl.ssl_profile()
        data['SSLKeyAndCertificate'] = self.ssl.ssl_key_and_cert()

        if self.tenant != 'admin':
            data['Tenant'] = [
                {
                "local": True, 
                "name": self.tenant
                }, 
                {
                "local": True, 
                "name": "admin"
                }
            ]
 
        return data