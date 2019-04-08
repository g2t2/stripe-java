// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

public class CardholderListParams extends ApiRequestParams {
  /** Only return cardholders that were created during the given date interval. */
  @SerializedName("created")
  Object created;

  /** Only return cardholders that have the given email address. */
  @SerializedName("email")
  String email;

  /**
   * A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with
   * `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the
   * previous page of the list.
   */
  @SerializedName("ending_before")
  String endingBefore;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /** Only return the default cardholder. */
  @SerializedName("is_default")
  Boolean isDefault;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /** Only return cardholders that have the given phone number. */
  @SerializedName("phone_number")
  String phoneNumber;

  /**
   * A cursor for use in pagination. `starting_after` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`,
   * your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of
   * the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /**
   * Only return cardholders that have the given status. One of `active`, `inactive`, or `blocked`.
   */
  @SerializedName("status")
  Status status;

  /** Only return cardholders that have the given type. One of `individual` or `business_entity`. */
  @SerializedName("type")
  Type type;

  private CardholderListParams(
      Object created,
      String email,
      String endingBefore,
      List<String> expand,
      Boolean isDefault,
      Long limit,
      String phoneNumber,
      String startingAfter,
      Status status,
      Type type) {
    this.created = created;
    this.email = email;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.isDefault = isDefault;
    this.limit = limit;
    this.phoneNumber = phoneNumber;
    this.startingAfter = startingAfter;
    this.status = status;
    this.type = type;
  }

  public static Builder builder() {
    return new com.stripe.param.issuing.CardholderListParams.Builder();
  }

  public static class Builder {
    private Object created;

    private String email;

    private String endingBefore;

    private List<String> expand;

    private Boolean isDefault;

    private Long limit;

    private String phoneNumber;

    private String startingAfter;

    private Status status;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public CardholderListParams build() {
      return new CardholderListParams(
          this.created,
          this.email,
          this.endingBefore,
          this.expand,
          this.isDefault,
          this.limit,
          this.phoneNumber,
          this.startingAfter,
          this.status,
          this.type);
    }

    /** Only return cardholders that were created during the given date interval. */
    public Builder setCreated(Created created) {
      this.created = created;
      return this;
    }

    /** Only return cardholders that were created during the given date interval. */
    public Builder setCreated(Long created) {
      this.created = created;
      return this;
    }

    /** Only return cardholders that have the given email address. */
    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    /**
     * A cursor for use in pagination. `ending_before` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, starting with
     * `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the
     * previous page of the list.
     */
    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CardholderListParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CardholderListParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /** Only return the default cardholder. */
    public Builder setIsDefault(Boolean isDefault) {
      this.isDefault = isDefault;
      return this;
    }

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 10.
     */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /** Only return cardholders that have the given phone number. */
    public Builder setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    /**
     * A cursor for use in pagination. `starting_after` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, ending with
     * `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the
     * next page of the list.
     */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }

    /**
     * Only return cardholders that have the given status. One of `active`, `inactive`, or
     * `blocked`.
     */
    public Builder setStatus(Status status) {
      this.status = status;
      return this;
    }

    /**
     * Only return cardholders that have the given type. One of `individual` or `business_entity`.
     */
    public Builder setType(Type type) {
      this.type = type;
      return this;
    }
  }

  public static class Created {
    /** Minimum value to filter by (exclusive). */
    @SerializedName("gt")
    Long gt;

    /** Minimum value to filter by (inclusive). */
    @SerializedName("gte")
    Long gte;

    /** Maximum value to filter by (exclusive). */
    @SerializedName("lt")
    Long lt;

    /** Maximum value to filter by (inclusive). */
    @SerializedName("lte")
    Long lte;

    private Created(Long gt, Long gte, Long lt, Long lte) {
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static Builder builder() {
      return new com.stripe.param.issuing.CardholderListParams.Created.Builder();
    }

    public static class Builder {
      private Long gt;

      private Long gte;

      private Long lt;

      private Long lte;

      /** Finalize and obtain parameter instance from this builder. */
      public Created build() {
        return new Created(this.gt, this.gte, this.lt, this.lte);
      }

      /** Minimum value to filter by (exclusive). */
      public Builder setGt(Long gt) {
        this.gt = gt;
        return this;
      }

      /** Minimum value to filter by (inclusive). */
      public Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public Builder setLt(Long lt) {
        this.lt = lt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public Builder setLte(Long lte) {
        this.lte = lte;
        return this;
      }
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("active")
    ACTIVE("active"),

    @SerializedName("blocked")
    BLOCKED("blocked"),

    @SerializedName("inactive")
    INACTIVE("inactive");

    @Getter(onMethod = @__({@Override}))
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("business_entity")
    BUSINESS_ENTITY("business_entity"),

    @SerializedName("individual")
    INDIVIDUAL("individual");

    @Getter(onMethod = @__({@Override}))
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
