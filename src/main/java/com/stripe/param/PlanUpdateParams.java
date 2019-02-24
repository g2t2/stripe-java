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
public class PlanUpdateParams extends ApiRequestParams {
  /** Whether the plan is currently available for new subscriptions. */
  @SerializedName("active")
  Boolean active;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * A set of key-value pairs that you can attach to a plan object. It can be useful for storing
   * additional information about the plan in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The plan name. Customers may see this value on Stripe-generated invoices and receipts. */
  @SerializedName("name")
  String name;

  /** A brief description of the plan, hidden from customers. */
  @SerializedName("nickname")
  String nickname;

  /**
   * The product the plan belongs to. Note that after updating, statement descriptors and line items
   * of the plan in active subscriptions will be affected.
   */
  @SerializedName("product")
  String product;

  /**
   * An arbitrary string to be displayed on your customer's credit card statement. This may be up to
   * 22 characters. The statement description may not include "' characters, and will appear on your
   * customer's statement in capital letters. Non-ASCII characters are automatically stripped. While
   * most banks display this information consistently, some may display it incorrectly or not at
   * all. It must contain at least one letter.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * Default number of trial days when subscribing a customer to this plan using
   * [`trial_from_plan=true`](https://stripe.com/docs/api#create_subscription-trial_from_plan).
   */
  @SerializedName("trial_period_days")
  Long trialPeriodDays;

  private PlanUpdateParams(
      Boolean active,
      List<String> expand,
      Map<String, String> metadata,
      String name,
      String nickname,
      String product,
      String statementDescriptor,
      Long trialPeriodDays) {
    this.active = active;
    this.expand = expand;
    this.metadata = metadata;
    this.name = name;
    this.nickname = nickname;
    this.product = product;
    this.statementDescriptor = statementDescriptor;
    this.trialPeriodDays = trialPeriodDays;
  }

  public static Builder builder() {
    return new com.stripe.param.PlanUpdateParams.Builder();
  }

  public static class Builder {
    private Boolean active;

    private List<String> expand;

    private Map<String, String> metadata;

    private String name;

    private String nickname;

    private String product;

    private String statementDescriptor;

    private Long trialPeriodDays;

    /** Finalize and obtain parameter instance from this builder. */
    public PlanUpdateParams build() {
      return new PlanUpdateParams(
          this.active,
          this.expand,
          this.metadata,
          this.name,
          this.nickname,
          this.product,
          this.statementDescriptor,
          this.trialPeriodDays);
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PlanUpdateParams#expand} for the field documentation.
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
     * PlanUpdateParams#expand} for the field documentation.
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
     * See {@link PlanUpdateParams#metadata} for the field documentation.
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
     * PlanUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /** Whether the plan is currently available for new subscriptions. */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /** The plan name. Customers may see this value on Stripe-generated invoices and receipts. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** A brief description of the plan, hidden from customers. */
    public Builder setNickname(String nickname) {
      this.nickname = nickname;
      return this;
    }

    /**
     * The product the plan belongs to. Note that after updating, statement descriptors and line
     * items of the plan in active subscriptions will be affected.
     */
    public Builder setProduct(String product) {
      this.product = product;
      return this;
    }

    /**
     * An arbitrary string to be displayed on your customer's credit card statement. This may be up
     * to 22 characters. The statement description may not include "' characters, and will appear on
     * your customer's statement in capital letters. Non-ASCII characters are automatically
     * stripped. While most banks display this information consistently, some may display it
     * incorrectly or not at all. It must contain at least one letter.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * Default number of trial days when subscribing a customer to this plan using
     * [`trial_from_plan=true`](https://stripe.com/docs/api#create_subscription-trial_from_plan).
     */
    public Builder setTrialPeriodDays(Long trialPeriodDays) {
      this.trialPeriodDays = trialPeriodDays;
      return this;
    }
  }
}