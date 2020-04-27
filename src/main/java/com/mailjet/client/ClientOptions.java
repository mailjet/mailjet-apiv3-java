
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

  public ClientOptions() {
    this.baseUrl = ClientOptions.defaultBaseURL;
    this.version = ClientOptions.defaultVersion;
  }

  public ClientOptions(String version, String baseUrl) {
    this.baseUrl = baseUrl;
    this.version = version;
  }

  public ClientOptions(String version) {
    this.baseUrl = ClientOptions.defaultBaseURL;
    this.version = version;
  }

  public String getBaseUrl() {
    return this.baseUrl;
  }

  public String getVersion() {
    return this.version;
  }

}
