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
import com.vmware.avi.sdk.model.GslbPoolMember;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * GslbPool
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class GslbPool {
  @JsonProperty("algorithm")
  private String algorithm = "GSLB_ALGORITHM_ROUND_ROBIN";

  @JsonProperty("consistent_hash_mask")
  private Integer consistentHashMask = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("enabled")
  private Boolean enabled = true;

  @JsonProperty("fallback_algorithm")
  private String fallbackAlgorithm = null;

  @JsonProperty("members")
  private List<GslbPoolMember> members = null;

  @JsonProperty("min_health_monitors_up")
  private Integer minHealthMonitorsUp = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("priority")
  private Integer priority = 10;

  public GslbPool algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

   /**
   * The load balancing algorithm will pick a local member within the GSLB service list of available Members. Enum options - GSLB_ALGORITHM_ROUND_ROBIN, GSLB_ALGORITHM_CONSISTENT_HASH, GSLB_ALGORITHM_GEO, GSLB_ALGORITHM_TOPOLOGY.
   * @return algorithm
  **/
  @Schema(required = true, description = "The load balancing algorithm will pick a local member within the GSLB service list of available Members. Enum options - GSLB_ALGORITHM_ROUND_ROBIN, GSLB_ALGORITHM_CONSISTENT_HASH, GSLB_ALGORITHM_GEO, GSLB_ALGORITHM_TOPOLOGY.")
  public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  public GslbPool consistentHashMask(Integer consistentHashMask) {
    this.consistentHashMask = consistentHashMask;
    return this;
  }

   /**
   * Mask to be applied on client IP for consistent hash algorithm. Allowed values are 1-31.
   * @return consistentHashMask
  **/
  @Schema(description = "Mask to be applied on client IP for consistent hash algorithm. Allowed values are 1-31.")
  public Integer getConsistentHashMask() {
    return consistentHashMask;
  }

  public void setConsistentHashMask(Integer consistentHashMask) {
    this.consistentHashMask = consistentHashMask;
  }

  public GslbPool description(String description) {
    this.description = description;
    return this;
  }

   /**
   * User provided information that records member details such as application owner name, contact, etc. Field introduced in 17.1.3.
   * @return description
  **/
  @Schema(description = "User provided information that records member details such as application owner name, contact, etc. Field introduced in 17.1.3.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GslbPool enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Enable or disable a GSLB service pool. Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * @return enabled
  **/
  @Schema(description = "Enable or disable a GSLB service pool. Field introduced in 17.2.14, 18.1.5, 18.2.1.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public GslbPool fallbackAlgorithm(String fallbackAlgorithm) {
    this.fallbackAlgorithm = fallbackAlgorithm;
    return this;
  }

   /**
   * The fallback load balancing algorithm used to pick a member when the pool algorithm fails to find a valid member. For instance when algorithm is Geo and client/server do not have valid geo location. Enum options - GSLB_ALGORITHM_ROUND_ROBIN, GSLB_ALGORITHM_CONSISTENT_HASH, GSLB_ALGORITHM_GEO, GSLB_ALGORITHM_TOPOLOGY. Field introduced in 18.2.3.
   * @return fallbackAlgorithm
  **/
  @Schema(description = "The fallback load balancing algorithm used to pick a member when the pool algorithm fails to find a valid member. For instance when algorithm is Geo and client/server do not have valid geo location. Enum options - GSLB_ALGORITHM_ROUND_ROBIN, GSLB_ALGORITHM_CONSISTENT_HASH, GSLB_ALGORITHM_GEO, GSLB_ALGORITHM_TOPOLOGY. Field introduced in 18.2.3.")
  public String getFallbackAlgorithm() {
    return fallbackAlgorithm;
  }

  public void setFallbackAlgorithm(String fallbackAlgorithm) {
    this.fallbackAlgorithm = fallbackAlgorithm;
  }

  public GslbPool members(List<GslbPoolMember> members) {
    this.members = members;
    return this;
  }

  public GslbPool addMembersItem(GslbPoolMember membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<GslbPoolMember>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Select list of VIPs belonging to this GSLB service.
   * @return members
  **/
  @Schema(description = "Select list of VIPs belonging to this GSLB service.")
  public List<GslbPoolMember> getMembers() {
    return members;
  }

  public void setMembers(List<GslbPoolMember> members) {
    this.members = members;
  }

  public GslbPool minHealthMonitorsUp(Integer minHealthMonitorsUp) {
    this.minHealthMonitorsUp = minHealthMonitorsUp;
    return this;
  }

   /**
   * Minimum number of health monitors in UP state to mark the member UP. Field introduced in 20.1.1.
   * @return minHealthMonitorsUp
  **/
  @Schema(description = "Minimum number of health monitors in UP state to mark the member UP. Field introduced in 20.1.1.")
  public Integer getMinHealthMonitorsUp() {
    return minHealthMonitorsUp;
  }

  public void setMinHealthMonitorsUp(Integer minHealthMonitorsUp) {
    this.minHealthMonitorsUp = minHealthMonitorsUp;
  }

  public GslbPool name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the GSLB service pool.
   * @return name
  **/
  @Schema(required = true, description = "Name of the GSLB service pool.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GslbPool priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Priority of this pool of Members. The higher the number, the higher is the priority of the pool. The DNS Service chooses the pool with the highest priority that is operationally up. Allowed values are 0-100. Special values are 0 - &#x27;Do not choose members from this pool.A priority of 0 is equivalent to disabling the pool.&#x27;.
   * @return priority
  **/
  @Schema(description = "Priority of this pool of Members. The higher the number, the higher is the priority of the pool. The DNS Service chooses the pool with the highest priority that is operationally up. Allowed values are 0-100. Special values are 0 - 'Do not choose members from this pool.A priority of 0 is equivalent to disabling the pool.'.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GslbPool gslbPool = (GslbPool) o;
    return Objects.equals(this.algorithm, gslbPool.algorithm) &&
        Objects.equals(this.consistentHashMask, gslbPool.consistentHashMask) &&
        Objects.equals(this.description, gslbPool.description) &&
        Objects.equals(this.enabled, gslbPool.enabled) &&
        Objects.equals(this.fallbackAlgorithm, gslbPool.fallbackAlgorithm) &&
        Objects.equals(this.members, gslbPool.members) &&
        Objects.equals(this.minHealthMonitorsUp, gslbPool.minHealthMonitorsUp) &&
        Objects.equals(this.name, gslbPool.name) &&
        Objects.equals(this.priority, gslbPool.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, consistentHashMask, description, enabled, fallbackAlgorithm, members, minHealthMonitorsUp, name, priority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GslbPool {\n");
    
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    consistentHashMask: ").append(toIndentedString(consistentHashMask)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    fallbackAlgorithm: ").append(toIndentedString(fallbackAlgorithm)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    minHealthMonitorsUp: ").append(toIndentedString(minHealthMonitorsUp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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