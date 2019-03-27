
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

  private String baseUrl;
  private String version;
  private Integer connectionTimeout;
  private Integer readTimeout;

  public ClientOptions() {
    this.baseUrl = ClientOptions.defaultBaseURL;
    this.version = ClientOptions.defaultVersion;
    this.readTimeout = null;
    this.connectionTimeout = null;
  }

  public ClientOptions(String version, String baseUrl) {
    this.baseUrl = baseUrl;
    this.version = version;
    this.readTimeout = null;
    this.connectionTimeout = null;
  }

  public ClientOptions(String version) {
    this.baseUrl = ClientOptions.defaultBaseURL;
    this.version = version;
    this.readTimeout = null;
    this.connectionTimeout = null;
  }

  public ClientOptions(String version, Integer connectionTimeout, Integer readTimeout) {
    this.baseUrl = ClientOptions.defaultBaseURL;
    this.version = version;
    this.connectionTimeout = connectionTimeout;
    this.readTimeout = readTimeout;
  }

  public ClientOptions( String version, String baseUrl,Integer connectionTimeout, Integer readTimeout) {
    this.baseUrl = baseUrl;
    this.version = version;
    this.connectionTimeout = connectionTimeout;
    this.readTimeout = readTimeout;
  }

  public ClientOptions(Integer connectionTimeout, Integer readTimeout) {
    this.baseUrl = ClientOptions.defaultBaseURL;
    this.version = ClientOptions.defaultVersion;
    this.connectionTimeout = connectionTimeout;
    this.readTimeout = readTimeout;
  }

  public String getBaseUrl() {
    return this.baseUrl;
  }

  public String getVersion() {
    return this.version;
  }

  public Integer getConnectionTimeout() {
    return connectionTimeout;
  }

  public Integer getReadTimeout() {
    return readTimeout;
  }
}
