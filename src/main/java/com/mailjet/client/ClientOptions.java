
/*
 * This is a generated class.
 */

package com.mailjet.client;

/**
 *
 * @author Guillaume Badi
 */
public class ClientOptions {

  private static String defaultBaseURL = "https://api.mailjet.com";
  private static String defaultVersion = "v3";
  private static Integer defaultTimeout = 8000;

  private String baseUrl;
  private String version;
  private Integer timeout;

  public ClientOptions() {
    this.baseUrl = ClientOptions.defaultBaseURL;
    this.version = ClientOptions.defaultVersion;
    this.timeout = ClientOptions.defaultTimeout;
  }

  public ClientOptions(String version, String baseUrl, Integer timeout) {
    this.baseUrl = baseUrl;
    this.version = version;
    this.timeout = timeout;
  }

  public ClientOptions(Integer timeout) {
    this.baseUrl = ClientOptions.defaultBaseURL;
    this.version = ClientOptions.defaultVersion;
    this.timeout = timeout;
  }

  public ClientOptions(String version, String baseUrl) {
    this.baseUrl = baseUrl;
    this.version = version;
    this.timeout = ClientOptions.defaultTimeout;
  }

  public ClientOptions(String version) {
    this.baseUrl = ClientOptions.defaultBaseURL;
    this.version = version;
    this.timeout = ClientOptions.defaultTimeout;
  }

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public String getBaseUrl() {
    return this.baseUrl;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getVersion() {
    return this.version;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public Integer getTimeout() {
    return this.timeout;
  }
}
