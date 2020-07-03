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
 * AlertSyslogServer
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class AlertSyslogServer {
  @JsonProperty("anon_auth")
  private Boolean anonAuth = null;

  @JsonProperty("format")
  private String format = "SYSLOG_LEGACY";

  @JsonProperty("pkiprofile_ref")
  private String pkiprofileRef = null;

  @JsonProperty("ssl_key_and_certificate_ref")
  private String sslKeyAndCertificateRef = null;

  @JsonProperty("syslog_server")
  private String syslogServer = null;

  @JsonProperty("syslog_server_port")
  private Integer syslogServerPort = 514;

  @JsonProperty("tls_enable")
  private Boolean tlsEnable = null;

  @JsonProperty("udp")
  private Boolean udp = true;

  public AlertSyslogServer anonAuth(Boolean anonAuth) {
    this.anonAuth = anonAuth;
    return this;
  }

   /**
   * Enable anonymous authentication of Syslog Serverwhich will disable server certificate authentication. Field introduced in 17.2.17, 18.2.5.
   * @return anonAuth
  **/
  @Schema(description = "Enable anonymous authentication of Syslog Serverwhich will disable server certificate authentication. Field introduced in 17.2.17, 18.2.5.")
  public Boolean isAnonAuth() {
    return anonAuth;
  }

  public void setAnonAuth(Boolean anonAuth) {
    this.anonAuth = anonAuth;
  }

  public AlertSyslogServer format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Syslog output format - legacy, RFC 5424, JSON. Enum options - SYSLOG_LEGACY, SYSLOG_RFC5424, SYSLOG_JSON. Field introduced in 17.2.8.
   * @return format
  **/
  @Schema(description = "Syslog output format - legacy, RFC 5424, JSON. Enum options - SYSLOG_LEGACY, SYSLOG_RFC5424, SYSLOG_JSON. Field introduced in 17.2.8.")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public AlertSyslogServer pkiprofileRef(String pkiprofileRef) {
    this.pkiprofileRef = pkiprofileRef;
    return this;
  }

   /**
   * Select the PKIProfile containing a CA or list of CA chainswhich will validate the certificate of the syslog server. It is a reference to an object of type PKIProfile. Field introduced in 17.2.17, 18.2.5.
   * @return pkiprofileRef
  **/
  @Schema(description = "Select the PKIProfile containing a CA or list of CA chainswhich will validate the certificate of the syslog server. It is a reference to an object of type PKIProfile. Field introduced in 17.2.17, 18.2.5.")
  public String getPkiprofileRef() {
    return pkiprofileRef;
  }

  public void setPkiprofileRef(String pkiprofileRef) {
    this.pkiprofileRef = pkiprofileRef;
  }

  public AlertSyslogServer sslKeyAndCertificateRef(String sslKeyAndCertificateRef) {
    this.sslKeyAndCertificateRef = sslKeyAndCertificateRef;
    return this;
  }

   /**
   * Select a certificate and key which will be used to authenticate to the syslog server. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 17.2.17, 18.2.5.
   * @return sslKeyAndCertificateRef
  **/
  @Schema(description = "Select a certificate and key which will be used to authenticate to the syslog server. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 17.2.17, 18.2.5.")
  public String getSslKeyAndCertificateRef() {
    return sslKeyAndCertificateRef;
  }

  public void setSslKeyAndCertificateRef(String sslKeyAndCertificateRef) {
    this.sslKeyAndCertificateRef = sslKeyAndCertificateRef;
  }

  public AlertSyslogServer syslogServer(String syslogServer) {
    this.syslogServer = syslogServer;
    return this;
  }

   /**
   * The destination Syslog server IP address or hostname.
   * @return syslogServer
  **/
  @Schema(required = true, description = "The destination Syslog server IP address or hostname.")
  public String getSyslogServer() {
    return syslogServer;
  }

  public void setSyslogServer(String syslogServer) {
    this.syslogServer = syslogServer;
  }

  public AlertSyslogServer syslogServerPort(Integer syslogServerPort) {
    this.syslogServerPort = syslogServerPort;
    return this;
  }

   /**
   * The destination Syslog server&#x27;s service port.
   * @return syslogServerPort
  **/
  @Schema(description = "The destination Syslog server's service port.")
  public Integer getSyslogServerPort() {
    return syslogServerPort;
  }

  public void setSyslogServerPort(Integer syslogServerPort) {
    this.syslogServerPort = syslogServerPort;
  }

  public AlertSyslogServer tlsEnable(Boolean tlsEnable) {
    this.tlsEnable = tlsEnable;
    return this;
  }

   /**
   * Enable TLS to the syslog server. Field introduced in 17.2.16, 18.2.3.
   * @return tlsEnable
  **/
  @Schema(description = "Enable TLS to the syslog server. Field introduced in 17.2.16, 18.2.3.")
  public Boolean isTlsEnable() {
    return tlsEnable;
  }

  public void setTlsEnable(Boolean tlsEnable) {
    this.tlsEnable = tlsEnable;
  }

  public AlertSyslogServer udp(Boolean udp) {
    this.udp = udp;
    return this;
  }

   /**
   * Network protocol to establish syslog session.
   * @return udp
  **/
  @Schema(required = true, description = "Network protocol to establish syslog session.")
  public Boolean isUdp() {
    return udp;
  }

  public void setUdp(Boolean udp) {
    this.udp = udp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertSyslogServer alertSyslogServer = (AlertSyslogServer) o;
    return Objects.equals(this.anonAuth, alertSyslogServer.anonAuth) &&
        Objects.equals(this.format, alertSyslogServer.format) &&
        Objects.equals(this.pkiprofileRef, alertSyslogServer.pkiprofileRef) &&
        Objects.equals(this.sslKeyAndCertificateRef, alertSyslogServer.sslKeyAndCertificateRef) &&
        Objects.equals(this.syslogServer, alertSyslogServer.syslogServer) &&
        Objects.equals(this.syslogServerPort, alertSyslogServer.syslogServerPort) &&
        Objects.equals(this.tlsEnable, alertSyslogServer.tlsEnable) &&
        Objects.equals(this.udp, alertSyslogServer.udp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anonAuth, format, pkiprofileRef, sslKeyAndCertificateRef, syslogServer, syslogServerPort, tlsEnable, udp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertSyslogServer {\n");
    
    sb.append("    anonAuth: ").append(toIndentedString(anonAuth)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    pkiprofileRef: ").append(toIndentedString(pkiprofileRef)).append("\n");
    sb.append("    sslKeyAndCertificateRef: ").append(toIndentedString(sslKeyAndCertificateRef)).append("\n");
    sb.append("    syslogServer: ").append(toIndentedString(syslogServer)).append("\n");
    sb.append("    syslogServerPort: ").append(toIndentedString(syslogServerPort)).append("\n");
    sb.append("    tlsEnable: ").append(toIndentedString(tlsEnable)).append("\n");
    sb.append("    udp: ").append(toIndentedString(udp)).append("\n");
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