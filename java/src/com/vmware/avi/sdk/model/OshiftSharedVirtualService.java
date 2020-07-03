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
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * OshiftSharedVirtualService
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class OshiftSharedVirtualService {
  @JsonProperty("virtualservice_name")
  private String virtualserviceName = null;

  public OshiftSharedVirtualService virtualserviceName(String virtualserviceName) {
    this.virtualserviceName = virtualserviceName;
    return this;
  }

   /**
   * Name of shared virtualservice. VirtualService will be created automatically by Cloud Connector. Field introduced in 17.1.1.
   * @return virtualserviceName
  **/
  @Schema(required = true, description = "Name of shared virtualservice. VirtualService will be created automatically by Cloud Connector. Field introduced in 17.1.1.")
  public String getVirtualserviceName() {
    return virtualserviceName;
  }

  public void setVirtualserviceName(String virtualserviceName) {
    this.virtualserviceName = virtualserviceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OshiftSharedVirtualService oshiftSharedVirtualService = (OshiftSharedVirtualService) o;
    return Objects.equals(this.virtualserviceName, oshiftSharedVirtualService.virtualserviceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(virtualserviceName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OshiftSharedVirtualService {\n");
    
    sb.append("    virtualserviceName: ").append(toIndentedString(virtualserviceName)).append("\n");
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