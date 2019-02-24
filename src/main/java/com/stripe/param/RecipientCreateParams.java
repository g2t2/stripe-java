// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class RecipientCreateParams extends ApiRequestParams {
  /**
   * A bank account to attach to the recipient. You can provide either a token, like the ones
   * returned by [Stripe.js](https://stripe.com/docs/stripe-js), or a dictionary containing a user's
   * bank account details, with the options described below.
   */
  @SerializedName("bank_account")
  Object bankAccount;

  /**
   * A U.S. Visa or MasterCard debit card (_not_ prepaid) to attach to the recipient. If the debit
   * card is not valid, recipient creation will fail. You can provide either a token, like the ones
   * returned by [Stripe.js](https://stripe.com/docs/stripe-js), or a dictionary containing a user's
   * debit card details, with the options described below. Although not all information is required,
   * the extra info helps prevent fraud.
   */
  @SerializedName("card")
  Object card;

  /**
   * An arbitrary string which you can attach to a `Recipient` object. It is displayed alongside the
   * recipient in the web interface.
   */
  @SerializedName("description")
  String description;

  /**
   * The recipient's email address. It is displayed alongside the recipient in the web interface,
   * and can be useful for searching and tracking.
   */
  @SerializedName("email")
  String email;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format. Individual keys can be unset by
   * posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The recipient's full, legal name. For type `individual`, should be in the format `First Last`,
   * `First Middle Last`, or `First M Last` (no prefixes or suffixes). For `corporation`, the full,
   * incorporated name.
   */
  @SerializedName("name")
  String name;

  /**
   * The recipient's tax ID, as a string. For type `individual`, the full SSN; for type
   * `corporation`, the full EIN.
   */
  @SerializedName("tax_id")
  String taxId;

  /** Type of the recipient: either `individual` or `corporation`. */
  @SerializedName("type")
  String type;

  private RecipientCreateParams(
      Object bankAccount,
      Object card,
      String description,
      String email,
      List<String> expand,
      Map<String, String> metadata,
      String name,
      String taxId,
      String type) {
    this.bankAccount = bankAccount;
    this.card = card;
    this.description = description;
    this.email = email;
    this.expand = expand;
    this.metadata = metadata;
    this.name = name;
    this.taxId = taxId;
    this.type = type;
  }

  public static Builder builder() {
    return new com.stripe.param.RecipientCreateParams.Builder();
  }

  public static class Builder {
    private Object bankAccount;

    private Object card;

    private String description;

    private String email;

    private List<String> expand;

    private Map<String, String> metadata;

    private String name;

    private String taxId;

    private String type;

    /** Finalize and obtain parameter instance from this builder. */
    public RecipientCreateParams build() {
      return new RecipientCreateParams(
          this.bankAccount,
          this.card,
          this.description,
          this.email,
          this.expand,
          this.metadata,
          this.name,
          this.taxId,
          this.type);
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * RecipientCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * RecipientCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link RecipientCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * RecipientCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * A bank account to attach to the recipient. You can provide either a token, like the ones
     * returned by [Stripe.js](https://stripe.com/docs/stripe-js), or a dictionary containing a
     * user's bank account details, with the options described below.
     */
    public Builder setBankAccount(String bankAccount) {
      this.bankAccount = bankAccount;
      return this;
    }

    /**
     * A bank account to attach to the recipient. You can provide either a token, like the ones
     * returned by [Stripe.js](https://stripe.com/docs/stripe-js), or a dictionary containing a
     * user's bank account details, with the options described below.
     */
    public Builder setBankAccount(Map<String, Object> bankAccount) {
      this.bankAccount = bankAccount;
      return this;
    }

    /**
     * A U.S. Visa or MasterCard debit card (_not_ prepaid) to attach to the recipient. If the debit
     * card is not valid, recipient creation will fail. You can provide either a token, like the
     * ones returned by [Stripe.js](https://stripe.com/docs/stripe-js), or a dictionary containing a
     * user's debit card details, with the options described below. Although not all information is
     * required, the extra info helps prevent fraud.
     */
    public Builder setCard(String card) {
      this.card = card;
      return this;
    }

    /**
     * A U.S. Visa or MasterCard debit card (_not_ prepaid) to attach to the recipient. If the debit
     * card is not valid, recipient creation will fail. You can provide either a token, like the
     * ones returned by [Stripe.js](https://stripe.com/docs/stripe-js), or a dictionary containing a
     * user's debit card details, with the options described below. Although not all information is
     * required, the extra info helps prevent fraud.
     */
    public Builder setCard(Map<String, Object> card) {
      this.card = card;
      return this;
    }

    /**
     * An arbitrary string which you can attach to a `Recipient` object. It is displayed alongside
     * the recipient in the web interface.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * The recipient's email address. It is displayed alongside the recipient in the web interface,
     * and can be useful for searching and tracking.
     */
    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    /**
     * The recipient's full, legal name. For type `individual`, should be in the format `First
     * Last`, `First Middle Last`, or `First M Last` (no prefixes or suffixes). For `corporation`,
     * the full, incorporated name.
     */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * The recipient's tax ID, as a string. For type `individual`, the full SSN; for type
     * `corporation`, the full EIN.
     */
    public Builder setTaxId(String taxId) {
      this.taxId = taxId;
      return this;
    }

    /** Type of the recipient: either `individual` or `corporation`. */
    public Builder setType(String type) {
      this.type = type;
      return this;
    }
  }
}