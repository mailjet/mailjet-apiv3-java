package com.mailjet.client;

import lombok.Builder;
import lombok.Data;
import okhttp3.OkHttpClient;

/**
 * Class used to configure MailJet client
 *
 */
@Builder
@Data
public class ClientOptions {

  private static final String defaultBaseURL = "https://api.mailjet.com";

  /**
   * base Url for all API calls
   */
  @Builder.Default
  private String baseUrl = defaultBaseURL;

  /**
   * Bearer token used for SMS Api calls
   */
  private String apiAccessToken;

  /**
   * API key to authenticate Email Api calls
   */
  private String apiKey;

  /**
   * API secret key to authenticate Email Api calls
   */
  private String apiSecretKey;

  /**
   * If set to the customly created OkHttp client, mailJet client will use provided client
   * Instead of creating the new one internally
   * use this to add custom calls interceptors/logging/etc
   */
  private OkHttpClient okHttpClient;
}
