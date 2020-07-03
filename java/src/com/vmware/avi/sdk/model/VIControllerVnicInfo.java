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
import com.vmware.avi.sdk.model.VIGuestvNicIPAddr;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * VIControllerVnicInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class VIControllerVnicInfo {
  @JsonProperty("portgroup")
  private String portgroup = null;

  @JsonProperty("vnic_ip")
  private List<VIGuestvNicIPAddr> vnicIp = null;

  public VIControllerVnicInfo portgroup(String portgroup) {
    this.portgroup = portgroup;
    return this;
  }

   /**
   * portgroup of VIControllerVnicInfo.
   * @return portgroup
  **/
  @Schema(required = true, description = "portgroup of VIControllerVnicInfo.")
  public String getPortgroup() {
    return portgroup;
  }

  public void setPortgroup(String portgroup) {
    this.portgroup = portgroup;
  }

  public VIControllerVnicInfo vnicIp(List<VIGuestvNicIPAddr> vnicIp) {
    this.vnicIp = vnicIp;
    return this;
  }

  public VIControllerVnicInfo addVnicIpItem(VIGuestvNicIPAddr vnicIpItem) {
    if (this.vnicIp == null) {
      this.vnicIp = new ArrayList<VIGuestvNicIPAddr>();
    }
    this.vnicIp.add(vnicIpItem);
    return this;
  }

   /**
   * Placeholder for description of property vnic_ip of obj type VIControllerVnicInfo field type str  type object
   * @return vnicIp
  **/
  @Schema(description = "Placeholder for description of property vnic_ip of obj type VIControllerVnicInfo field type str  type object")
  public List<VIGuestvNicIPAddr> getVnicIp() {
    return vnicIp;
  }

  public void setVnicIp(List<VIGuestvNicIPAddr> vnicIp) {
    this.vnicIp = vnicIp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIControllerVnicInfo viControllerVnicInfo = (VIControllerVnicInfo) o;
    return Objects.equals(this.portgroup, viControllerVnicInfo.portgroup) &&
        Objects.equals(this.vnicIp, viControllerVnicInfo.vnicIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portgroup, vnicIp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIControllerVnicInfo {\n");
    
    sb.append("    portgroup: ").append(toIndentedString(portgroup)).append("\n");
    sb.append("    vnicIp: ").append(toIndentedString(vnicIp)).append("\n");
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