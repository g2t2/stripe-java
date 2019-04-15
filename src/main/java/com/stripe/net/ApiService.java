package com.stripe.net;

import com.stripe.Stripe;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollectionInterface;
import java.util.Arrays;
import java.util.List;

public abstract class ApiService {

  protected String resourceUrl(String url, String... urlVariables) throws InvalidRequestException {
    List<String> urlVariableList = Arrays.asList(urlVariables);
    for (int i = 0; i < urlVariableList.size(); i++) {
      urlVariableList.set(i, ApiResource.urlEncodeId(urlVariableList.get(i)));
    }
    return String.format("%s%s",
        Stripe.getApiBase(),
        String.format(url, urlVariableList.toArray()));
  }

  public static <T> T request(ApiResource.RequestMethod method,
                              String url, ApiRequestParams params, Class<T> clazz,
                              RequestOptions options) throws StripeException {
    return ApiResource.request(method, url, params, clazz, options);
  }

  public static <T extends StripeCollectionInterface<?>> T requestCollection(
      String url, ApiRequestParams params, Class<T> clazz, RequestOptions options)
      throws StripeException {
    return ApiResource.requestCollection(url, params, clazz, options);
  }
}
