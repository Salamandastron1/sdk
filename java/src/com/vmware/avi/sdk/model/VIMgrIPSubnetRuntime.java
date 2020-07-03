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
import com.vmware.avi.sdk.model.FloatingIpSubnet;
import com.vmware.avi.sdk.model.IpAddrPrefix;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * VIMgrIPSubnetRuntime
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class VIMgrIPSubnetRuntime {
  @JsonProperty("fip_available")
  private Boolean fipAvailable = null;

  @JsonProperty("fip_subnet_uuids")
  private List<String> fipSubnetUuids = null;

  @JsonProperty("floatingip_subnets")
  private List<FloatingIpSubnet> floatingipSubnets = null;

  @JsonProperty("ip_subnet")
  private String ipSubnet = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("prefix")
  private IpAddrPrefix prefix = null;

  @JsonProperty("primary")
  private Boolean primary = null;

  @JsonProperty("ref_count")
  private Integer refCount = null;

  @JsonProperty("se_ref_count")
  private Integer seRefCount = null;

  @JsonProperty("uuid")
  private String uuid = null;

  public VIMgrIPSubnetRuntime fipAvailable(Boolean fipAvailable) {
    this.fipAvailable = fipAvailable;
    return this;
  }

   /**
   * If true, capable of floating/elastic IP association.
   * @return fipAvailable
  **/
  @Schema(description = "If true, capable of floating/elastic IP association.")
  public Boolean isFipAvailable() {
    return fipAvailable;
  }

  public void setFipAvailable(Boolean fipAvailable) {
    this.fipAvailable = fipAvailable;
  }

  public VIMgrIPSubnetRuntime fipSubnetUuids(List<String> fipSubnetUuids) {
    this.fipSubnetUuids = fipSubnetUuids;
    return this;
  }

  public VIMgrIPSubnetRuntime addFipSubnetUuidsItem(String fipSubnetUuidsItem) {
    if (this.fipSubnetUuids == null) {
      this.fipSubnetUuids = new ArrayList<String>();
    }
    this.fipSubnetUuids.add(fipSubnetUuidsItem);
    return this;
  }

   /**
   * If fip_available is True, this is list of supported FIP subnets, possibly empty if Cloud does not support such a network list.
   * @return fipSubnetUuids
  **/
  @Schema(description = "If fip_available is True, this is list of supported FIP subnets, possibly empty if Cloud does not support such a network list.")
  public List<String> getFipSubnetUuids() {
    return fipSubnetUuids;
  }

  public void setFipSubnetUuids(List<String> fipSubnetUuids) {
    this.fipSubnetUuids = fipSubnetUuids;
  }

  public VIMgrIPSubnetRuntime floatingipSubnets(List<FloatingIpSubnet> floatingipSubnets) {
    this.floatingipSubnets = floatingipSubnets;
    return this;
  }

  public VIMgrIPSubnetRuntime addFloatingipSubnetsItem(FloatingIpSubnet floatingipSubnetsItem) {
    if (this.floatingipSubnets == null) {
      this.floatingipSubnets = new ArrayList<FloatingIpSubnet>();
    }
    this.floatingipSubnets.add(floatingipSubnetsItem);
    return this;
  }

   /**
   * If fip_available is True, the list of associated FloatingIP subnets, possibly empty if unsupported or implictly defined by the Cloud. Field introduced in 17.2.1.
   * @return floatingipSubnets
  **/
  @Schema(description = "If fip_available is True, the list of associated FloatingIP subnets, possibly empty if unsupported or implictly defined by the Cloud. Field introduced in 17.2.1.")
  public List<FloatingIpSubnet> getFloatingipSubnets() {
    return floatingipSubnets;
  }

  public void setFloatingipSubnets(List<FloatingIpSubnet> floatingipSubnets) {
    this.floatingipSubnets = floatingipSubnets;
  }

  public VIMgrIPSubnetRuntime ipSubnet(String ipSubnet) {
    this.ipSubnet = ipSubnet;
    return this;
  }

   /**
   * ip_subnet of VIMgrIPSubnetRuntime.
   * @return ipSubnet
  **/
  @Schema(description = "ip_subnet of VIMgrIPSubnetRuntime.")
  public String getIpSubnet() {
    return ipSubnet;
  }

  public void setIpSubnet(String ipSubnet) {
    this.ipSubnet = ipSubnet;
  }

  public VIMgrIPSubnetRuntime name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the object.
   * @return name
  **/
  @Schema(description = "Name of the object.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VIMgrIPSubnetRuntime prefix(IpAddrPrefix prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @Schema(required = true, description = "")
  public IpAddrPrefix getPrefix() {
    return prefix;
  }

  public void setPrefix(IpAddrPrefix prefix) {
    this.prefix = prefix;
  }

  public VIMgrIPSubnetRuntime primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

   /**
   * True if prefix is primary IP on interface, else false.
   * @return primary
  **/
  @Schema(description = "True if prefix is primary IP on interface, else false.")
  public Boolean isPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public VIMgrIPSubnetRuntime refCount(Integer refCount) {
    this.refCount = refCount;
    return this;
  }

   /**
   * Number of ref_count.
   * @return refCount
  **/
  @Schema(description = "Number of ref_count.")
  public Integer getRefCount() {
    return refCount;
  }

  public void setRefCount(Integer refCount) {
    this.refCount = refCount;
  }

  public VIMgrIPSubnetRuntime seRefCount(Integer seRefCount) {
    this.seRefCount = seRefCount;
    return this;
  }

   /**
   * Number of se_ref_count.
   * @return seRefCount
  **/
  @Schema(description = "Number of se_ref_count.")
  public Integer getSeRefCount() {
    return seRefCount;
  }

  public void setSeRefCount(Integer seRefCount) {
    this.seRefCount = seRefCount;
  }

  public VIMgrIPSubnetRuntime uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @Schema(description = "Unique object identifier of the object.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIMgrIPSubnetRuntime viMgrIPSubnetRuntime = (VIMgrIPSubnetRuntime) o;
    return Objects.equals(this.fipAvailable, viMgrIPSubnetRuntime.fipAvailable) &&
        Objects.equals(this.fipSubnetUuids, viMgrIPSubnetRuntime.fipSubnetUuids) &&
        Objects.equals(this.floatingipSubnets, viMgrIPSubnetRuntime.floatingipSubnets) &&
        Objects.equals(this.ipSubnet, viMgrIPSubnetRuntime.ipSubnet) &&
        Objects.equals(this.name, viMgrIPSubnetRuntime.name) &&
        Objects.equals(this.prefix, viMgrIPSubnetRuntime.prefix) &&
        Objects.equals(this.primary, viMgrIPSubnetRuntime.primary) &&
        Objects.equals(this.refCount, viMgrIPSubnetRuntime.refCount) &&
        Objects.equals(this.seRefCount, viMgrIPSubnetRuntime.seRefCount) &&
        Objects.equals(this.uuid, viMgrIPSubnetRuntime.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fipAvailable, fipSubnetUuids, floatingipSubnets, ipSubnet, name, prefix, primary, refCount, seRefCount, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIMgrIPSubnetRuntime {\n");
    
    sb.append("    fipAvailable: ").append(toIndentedString(fipAvailable)).append("\n");
    sb.append("    fipSubnetUuids: ").append(toIndentedString(fipSubnetUuids)).append("\n");
    sb.append("    floatingipSubnets: ").append(toIndentedString(floatingipSubnets)).append("\n");
    sb.append("    ipSubnet: ").append(toIndentedString(ipSubnet)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    refCount: ").append(toIndentedString(refCount)).append("\n");
    sb.append("    seRefCount: ").append(toIndentedString(seRefCount)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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