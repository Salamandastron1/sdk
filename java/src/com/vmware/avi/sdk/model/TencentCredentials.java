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
 * TencentCredentials
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class TencentCredentials {
  @JsonProperty("secret_id")
  private String secretId = null;

  @JsonProperty("secret_key")
  private String secretKey = null;

  public TencentCredentials secretId(String secretId) {
    this.secretId = secretId;
    return this;
  }

   /**
   * Tencent secret ID. Field introduced in 18.2.3.
   * @return secretId
  **/
  @Schema(required = true, description = "Tencent secret ID. Field introduced in 18.2.3.")
  public String getSecretId() {
    return secretId;
  }

  public void setSecretId(String secretId) {
    this.secretId = secretId;
  }

  public TencentCredentials secretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Tencent secret key. Field introduced in 18.2.3.
   * @return secretKey
  **/
  @Schema(required = true, description = "Tencent secret key. Field introduced in 18.2.3.")
  public String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TencentCredentials tencentCredentials = (TencentCredentials) o;
    return Objects.equals(this.secretId, tencentCredentials.secretId) &&
        Objects.equals(this.secretKey, tencentCredentials.secretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secretId, secretKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TencentCredentials {\n");
    
    sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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