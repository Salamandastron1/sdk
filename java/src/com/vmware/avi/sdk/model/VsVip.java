/*
 * Avi avi_global_spec Object API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 20.1.1
 * Contact: support@avinetworks.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.avi.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.vmware.avi.sdk.model.DnsInfo;
import com.vmware.avi.sdk.model.Vip;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * VsVip
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class VsVip {
  @JsonProperty("_last_modified")
  private String _lastModified = null;

  @JsonProperty("cloud_ref")
  private String cloudRef = null;

  @JsonProperty("dns_info")
  private List<DnsInfo> dnsInfo = null;

  @JsonProperty("east_west_placement")
  private Boolean eastWestPlacement = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("use_standard_alb")
  private Boolean useStandardAlb = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vip")
  private List<Vip> vip = null;

  @JsonProperty("vrf_context_ref")
  private String vrfContextRef = null;

  @JsonProperty("vsvip_cloud_config_cksum")
  private String vsvipCloudConfigCksum = null;

   /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return _lastModified
  **/
  @Schema(description = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")
  public String getLastModified() {
    return _lastModified;
  }

  public VsVip cloudRef(String cloudRef) {
    this.cloudRef = cloudRef;
    return this;
  }

   /**
   *  It is a reference to an object of type Cloud. Field introduced in 17.1.1.
   * @return cloudRef
  **/
  @Schema(description = " It is a reference to an object of type Cloud. Field introduced in 17.1.1.")
  public String getCloudRef() {
    return cloudRef;
  }

  public void setCloudRef(String cloudRef) {
    this.cloudRef = cloudRef;
  }

  public VsVip dnsInfo(List<DnsInfo> dnsInfo) {
    this.dnsInfo = dnsInfo;
    return this;
  }

  public VsVip addDnsInfoItem(DnsInfo dnsInfoItem) {
    if (this.dnsInfo == null) {
      this.dnsInfo = new ArrayList<DnsInfo>();
    }
    this.dnsInfo.add(dnsInfoItem);
    return this;
  }

   /**
   * Service discovery specific data including fully qualified domain name, type and Time-To-Live of the DNS record. Field introduced in 17.1.1.
   * @return dnsInfo
  **/
  @Schema(description = "Service discovery specific data including fully qualified domain name, type and Time-To-Live of the DNS record. Field introduced in 17.1.1.")
  public List<DnsInfo> getDnsInfo() {
    return dnsInfo;
  }

  public void setDnsInfo(List<DnsInfo> dnsInfo) {
    this.dnsInfo = dnsInfo;
  }

  public VsVip eastWestPlacement(Boolean eastWestPlacement) {
    this.eastWestPlacement = eastWestPlacement;
    return this;
  }

   /**
   * Force placement on all Service Engines in the Service Engine Group (Container clouds only). Field introduced in 17.1.1.
   * @return eastWestPlacement
  **/
  @Schema(description = "Force placement on all Service Engines in the Service Engine Group (Container clouds only). Field introduced in 17.1.1.")
  public Boolean isEastWestPlacement() {
    return eastWestPlacement;
  }

  public void setEastWestPlacement(Boolean eastWestPlacement) {
    this.eastWestPlacement = eastWestPlacement;
  }

  public VsVip name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name for the VsVip object. Field introduced in 17.1.1.
   * @return name
  **/
  @Schema(required = true, description = "Name for the VsVip object. Field introduced in 17.1.1.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VsVip tenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
    return this;
  }

   /**
   *  It is a reference to an object of type Tenant. Field introduced in 17.1.1.
   * @return tenantRef
  **/
  @Schema(description = " It is a reference to an object of type Tenant. Field introduced in 17.1.1.")
  public String getTenantRef() {
    return tenantRef;
  }

  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

   /**
   * url
   * @return url
  **/
  @Schema(description = "url")
  public String getUrl() {
    return url;
  }

  public VsVip useStandardAlb(Boolean useStandardAlb) {
    this.useStandardAlb = useStandardAlb;
    return this;
  }

   /**
   * This overrides the cloud level default and needs to match the SE Group value in which it will be used if the SE Group use_standard_alb value is set. This is only used when FIP is used for VS on Azure Cloud. Field introduced in 18.2.3.
   * @return useStandardAlb
  **/
  @Schema(description = "This overrides the cloud level default and needs to match the SE Group value in which it will be used if the SE Group use_standard_alb value is set. This is only used when FIP is used for VS on Azure Cloud. Field introduced in 18.2.3.")
  public Boolean isUseStandardAlb() {
    return useStandardAlb;
  }

  public void setUseStandardAlb(Boolean useStandardAlb) {
    this.useStandardAlb = useStandardAlb;
  }

  public VsVip uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID of the VsVip object. Field introduced in 17.1.1.
   * @return uuid
  **/
  @Schema(description = "UUID of the VsVip object. Field introduced in 17.1.1.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public VsVip vip(List<Vip> vip) {
    this.vip = vip;
    return this;
  }

  public VsVip addVipItem(Vip vipItem) {
    if (this.vip == null) {
      this.vip = new ArrayList<Vip>();
    }
    this.vip.add(vipItem);
    return this;
  }

   /**
   * List of Virtual Service IPs and other shareable entities. Field introduced in 17.1.1.
   * @return vip
  **/
  @Schema(description = "List of Virtual Service IPs and other shareable entities. Field introduced in 17.1.1.")
  public List<Vip> getVip() {
    return vip;
  }

  public void setVip(List<Vip> vip) {
    this.vip = vip;
  }

  public VsVip vrfContextRef(String vrfContextRef) {
    this.vrfContextRef = vrfContextRef;
    return this;
  }

   /**
   * Virtual Routing Context that the Virtual Service is bound to. This is used to provide the isolation of the set of networks the application is attached to. It is a reference to an object of type VrfContext. Field introduced in 17.1.1.
   * @return vrfContextRef
  **/
  @Schema(description = "Virtual Routing Context that the Virtual Service is bound to. This is used to provide the isolation of the set of networks the application is attached to. It is a reference to an object of type VrfContext. Field introduced in 17.1.1.")
  public String getVrfContextRef() {
    return vrfContextRef;
  }

  public void setVrfContextRef(String vrfContextRef) {
    this.vrfContextRef = vrfContextRef;
  }

  public VsVip vsvipCloudConfigCksum(String vsvipCloudConfigCksum) {
    this.vsvipCloudConfigCksum = vsvipCloudConfigCksum;
    return this;
  }

   /**
   * Checksum of cloud configuration for VsVip. Internally set by cloud connector. Field introduced in 17.2.9, 18.1.2.
   * @return vsvipCloudConfigCksum
  **/
  @Schema(description = "Checksum of cloud configuration for VsVip. Internally set by cloud connector. Field introduced in 17.2.9, 18.1.2.")
  public String getVsvipCloudConfigCksum() {
    return vsvipCloudConfigCksum;
  }

  public void setVsvipCloudConfigCksum(String vsvipCloudConfigCksum) {
    this.vsvipCloudConfigCksum = vsvipCloudConfigCksum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VsVip vsVip = (VsVip) o;
    return Objects.equals(this._lastModified, vsVip._lastModified) &&
        Objects.equals(this.cloudRef, vsVip.cloudRef) &&
        Objects.equals(this.dnsInfo, vsVip.dnsInfo) &&
        Objects.equals(this.eastWestPlacement, vsVip.eastWestPlacement) &&
        Objects.equals(this.name, vsVip.name) &&
        Objects.equals(this.tenantRef, vsVip.tenantRef) &&
        Objects.equals(this.url, vsVip.url) &&
        Objects.equals(this.useStandardAlb, vsVip.useStandardAlb) &&
        Objects.equals(this.uuid, vsVip.uuid) &&
        Objects.equals(this.vip, vsVip.vip) &&
        Objects.equals(this.vrfContextRef, vsVip.vrfContextRef) &&
        Objects.equals(this.vsvipCloudConfigCksum, vsVip.vsvipCloudConfigCksum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_lastModified, cloudRef, dnsInfo, eastWestPlacement, name, tenantRef, url, useStandardAlb, uuid, vip, vrfContextRef, vsvipCloudConfigCksum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VsVip {\n");
    
    sb.append("    _lastModified: ").append(toIndentedString(_lastModified)).append("\n");
    sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
    sb.append("    dnsInfo: ").append(toIndentedString(dnsInfo)).append("\n");
    sb.append("    eastWestPlacement: ").append(toIndentedString(eastWestPlacement)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    useStandardAlb: ").append(toIndentedString(useStandardAlb)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
    sb.append("    vrfContextRef: ").append(toIndentedString(vrfContextRef)).append("\n");
    sb.append("    vsvipCloudConfigCksum: ").append(toIndentedString(vsvipCloudConfigCksum)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}