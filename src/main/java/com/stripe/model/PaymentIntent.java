// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentIntent extends ApiResource implements HasId, MetadataStore<PaymentIntent> {
  /** Amount intended to be collected by this PaymentIntent. */
  @SerializedName("amount")
  Long amount;

  /** Amount that can be captured from this PaymentIntent. */
  @SerializedName("amount_capturable")
  Long amountCapturable;

  /** Amount that was collected by this PaymentIntent. */
  @SerializedName("amount_received")
  Long amountReceived;

  /** ID of the Connect application that created the PaymentIntent. */
  @SerializedName("application")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Application> application;

  /**
   * The amount of the application fee (if any) for the resulting payment. See the PaymentIntents
   * [Connect usage guide](https://stripe.com/docs/payments/payment-intents/usage#connect) for
   * details.
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  /**
   * Populated when `status` is `canceled`, this is the time at which the PaymentIntent was
   * canceled. Measured in seconds since the Unix epoch.
   */
  @SerializedName("canceled_at")
  Long canceledAt;

  /**
   * User-given reason for cancellation of this PaymentIntent, one of `duplicate`, `fraudulent`,
   * `requested_by_customer`, or `failed_invoice`.
   */
  @SerializedName("cancellation_reason")
  String cancellationReason;

  /** Capture method of this PaymentIntent, one of `automatic` or `manual`. */
  @SerializedName("capture_method")
  String captureMethod;

  /** Charges that were created by this PaymentIntent, if any. */
  @SerializedName("charges")
  ChargeCollection charges;

  /**
   * The client secret of this PaymentIntent. Used for client-side retrieval using a publishable
   * key. Please refer to [dynamic
   * authentication](https://stripe.com/docs/payments/dynamic-authentication) guide on how
   * `client_secret` should be handled.
   */
  @SerializedName("client_secret")
  String clientSecret;

  /** Confirmation method of this PaymentIntent, one of `manual` or `automatic`. */
  @SerializedName("confirmation_method")
  String confirmationMethod;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  String currency;

  /** ID of the Customer this PaymentIntent is for if one exists. */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  @SerializedName("id")
  String id;

  /** ID of the invoice that created this PaymentIntent, if it exists. */
  @SerializedName("invoice")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Invoice> invoice;

  /** The payment error encountered in the previous PaymentIntent confirmation. */
  @SerializedName("last_payment_error")
  StripeError lastPaymentError;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format. For more information, see the
   * [documentation](https://stripe.com/docs/payments/payment-intents/creating-payment-intents#storing-information-in-metadata).
   */
  @Getter(onMethod = @__({@Override}))
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * If present, this property tells you what actions you need to take in order for your customer to
   * fulfill a payment using the provided source.
   */
  @SerializedName("next_action")
  NextAction nextAction;

  /** String representing the object's type. Objects of the same type share the same value. */
  @SerializedName("object")
  String object;

  /**
   * The account (if any) for which the funds of the PaymentIntent are intended. See the
   * PaymentIntents [Connect usage
   * guide](https://stripe.com/docs/payments/payment-intents/usage#connect) for details.
   */
  @SerializedName("on_behalf_of")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> onBehalfOf;

  /** ID of the payment method used in this PaymentIntent. */
  @SerializedName("payment_method")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentMethod> paymentMethod;

  /** The list of payment method types (e.g. card) that this PaymentIntent is allowed to use. */
  @SerializedName("payment_method_types")
  List<String> paymentMethodTypes;

  /** Email address that the receipt for the resulting payment will be sent to. */
  @SerializedName("receipt_email")
  String receiptEmail;

  /** ID of the review associated with this PaymentIntent, if any. */
  @SerializedName("review")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Review> review;

  /** Shipping information for this PaymentIntent. */
  @SerializedName("shipping")
  ShippingDetails shipping;

  /** ID of the source used in this PaymentIntent. */
  @SerializedName("source")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentSource> source;

  /**
   * Extra information about a PaymentIntent. This will appear on your customer's statement when
   * this PaymentIntent succeeds in creating a charge.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * Status of this PaymentIntent, one of `requires_payment_method`, `requires_confirmation`,
   * `requires_action`, `processing`, `requires_authorization`, `requires_capture`, `canceled`, or
   * `succeeded`.
   */
  @SerializedName("status")
  String status;

  /**
   * The data with which to automatically create a Transfer when the payment is finalized. See the
   * PaymentIntents [Connect usage
   * guide](https://stripe.com/docs/payments/payment-intents/usage#connect) for details.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  /**
   * A string that identifies the resulting payment as part of a group. See the PaymentIntents
   * [Connect usage guide](https://stripe.com/docs/payments/payment-intents/usage#connect) for
   * details.
   */
  @SerializedName("transfer_group")
  String transferGroup;

  /** Get id of expandable `application` object. */
  public String getApplication() {
    return (this.application != null) ? this.application.getId() : null;
  }

  public void setApplication(String id) {
    this.application = ApiResource.setExpandableFieldId(id, this.application);
  }

  /** Get expanded `application`. */
  public Application getApplicationObject() {
    return (this.application != null) ? this.application.getExpanded() : null;
  }

  public void setApplicationObject(Application expandableObject) {
    this.application = new ExpandableField<Application>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `customer` object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded `customer`. */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `invoice` object. */
  public String getInvoice() {
    return (this.invoice != null) ? this.invoice.getId() : null;
  }

  public void setInvoice(String id) {
    this.invoice = ApiResource.setExpandableFieldId(id, this.invoice);
  }

  /** Get expanded `invoice`. */
  public Invoice getInvoiceObject() {
    return (this.invoice != null) ? this.invoice.getExpanded() : null;
  }

  public void setInvoiceObject(Invoice expandableObject) {
    this.invoice = new ExpandableField<Invoice>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `onBehalfOf` object. */
  public String getOnBehalfOf() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getId() : null;
  }

  public void setOnBehalfOf(String id) {
    this.onBehalfOf = ApiResource.setExpandableFieldId(id, this.onBehalfOf);
  }

  /** Get expanded `onBehalfOf`. */
  public Account getOnBehalfOfObject() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getExpanded() : null;
  }

  public void setOnBehalfOfObject(Account expandableObject) {
    this.onBehalfOf = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `paymentMethod` object. */
  public String getPaymentMethod() {
    return (this.paymentMethod != null) ? this.paymentMethod.getId() : null;
  }

  public void setPaymentMethod(String id) {
    this.paymentMethod = ApiResource.setExpandableFieldId(id, this.paymentMethod);
  }

  /** Get expanded `paymentMethod`. */
  public PaymentMethod getPaymentMethodObject() {
    return (this.paymentMethod != null) ? this.paymentMethod.getExpanded() : null;
  }

  public void setPaymentMethodObject(PaymentMethod expandableObject) {
    this.paymentMethod =
        new ExpandableField<PaymentMethod>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `review` object. */
  public String getReview() {
    return (this.review != null) ? this.review.getId() : null;
  }

  public void setReview(String id) {
    this.review = ApiResource.setExpandableFieldId(id, this.review);
  }

  /** Get expanded `review`. */
  public Review getReviewObject() {
    return (this.review != null) ? this.review.getExpanded() : null;
  }

  public void setReviewObject(Review expandableObject) {
    this.review = new ExpandableField<Review>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `source` object. */
  public String getSource() {
    return (this.source != null) ? this.source.getId() : null;
  }

  public void setSource(String id) {
    this.source = ApiResource.setExpandableFieldId(id, this.source);
  }

  /** Get expanded `source`. */
  public PaymentSource getSourceObject() {
    return (this.source != null) ? this.source.getExpanded() : null;
  }

  public void setSourceObject(PaymentSource expandableObject) {
    this.source = new ExpandableField<PaymentSource>(expandableObject.getId(), expandableObject);
  }

  /** Creates a PaymentIntent object. */
  public static PaymentIntent create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a PaymentIntent object. */
  public static PaymentIntent create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payment_intents");
    return request(ApiResource.RequestMethod.POST, url, params, PaymentIntent.class, options);
  }

  /** Returns a list of PaymentIntents. */
  public static PaymentIntentCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of PaymentIntents. */
  public static PaymentIntentCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payment_intents");
    return requestCollection(url, params, PaymentIntentCollection.class, options);
  }

  /**
   * Retrieves the details of a PaymentIntent that has previously been created.
   *
   * <p>Client-side retrieval using a publishable key is allowed when the <code>client_secret</code>
   * is provided in the query string.
   *
   * <p>When retrieved with a publishable key, only a subset of properties will be returned. Please
   * refer to the <a href="#payment_intent_object">payment intent</a> object reference for more
   * details.
   */
  public static PaymentIntent retrieve(String intent) throws StripeException {
    return retrieve(intent, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of a PaymentIntent that has previously been created.
   *
   * <p>Client-side retrieval using a publishable key is allowed when the <code>client_secret</code>
   * is provided in the query string.
   *
   * <p>When retrieved with a publishable key, only a subset of properties will be returned. Please
   * refer to the <a href="#payment_intent_object">payment intent</a> object reference for more
   * details.
   */
  public static PaymentIntent retrieve(String intent, RequestOptions options)
      throws StripeException {
    return retrieve(intent, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of a PaymentIntent that has previously been created.
   *
   * <p>Client-side retrieval using a publishable key is allowed when the <code>client_secret</code>
   * is provided in the query string.
   *
   * <p>When retrieved with a publishable key, only a subset of properties will be returned. Please
   * refer to the <a href="#payment_intent_object">payment intent</a> object reference for more
   * details.
   */
  public static PaymentIntent retrieve(
      String intent, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format("%s%s", Stripe.getApiBase(), String.format("/v1/payment_intents/%s", intent));
    return request(ApiResource.RequestMethod.GET, url, params, PaymentIntent.class, options);
  }

  /** Updates a PaymentIntent object. */
  @Override
  public PaymentIntent update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a PaymentIntent object. */
  @Override
  public PaymentIntent update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/payment_intents/%s", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, PaymentIntent.class, options);
  }

  /**
   * Confirm that your customer intends to pay with current or provided payment method. Upon
   * confirmation, the PaymentIntent will attempt to initiate a payment.
   *
   * <p>If the selected payment method requires additional authentication steps, the PaymentIntent
   * will transition to the <code>requires_action</code> status and suggest additional actions via
   * <code>next_action</code>. If payment fails, the PaymentIntent will transition to the <code>
   * requires_payment_method</code> status. If payment succeeds, the PaymentIntent will transition
   * to the <code>succeeded</code> status (or <code>requires_capture</code>, if <code>capture_method
   * </code> is set to <code>manual</code>). Read the <a
   * href="/docs/payments/payment-intents/server-confirmation">expanded documentation</a> to learn
   * more about server-side confirmation.
   *
   * <p>If the <code>confirmation_method</code> is <code>automatic</code>, payment may be attempted
   * using our <a href="/docs/stripe-js/reference#stripe-handle-card-payment">client SDKs</a> and
   * the PaymentIntent’s <a href="#payment_intent_object-client_secret">client_secret</a>. After
   * <code>next_action</code>s are handled by the client, no additional confirmation is required to
   * complete the payment.
   *
   * <p>If the <code>confirmation_method</code> is <code>manual</code>, all payment attempts must be
   * initiated using a secret key. If any actions are required for the payment, the PaymentIntent
   * will return to the <code>requires_confirmation</code> state after those actions are completed.
   * Your server needs to then explicitly re-confirm the PaymentIntent to initiate the next payment
   * attempt.
   */
  public PaymentIntent confirm() throws StripeException {
    return confirm((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Confirm that your customer intends to pay with current or provided payment method. Upon
   * confirmation, the PaymentIntent will attempt to initiate a payment.
   *
   * <p>If the selected payment method requires additional authentication steps, the PaymentIntent
   * will transition to the <code>requires_action</code> status and suggest additional actions via
   * <code>next_action</code>. If payment fails, the PaymentIntent will transition to the <code>
   * requires_payment_method</code> status. If payment succeeds, the PaymentIntent will transition
   * to the <code>succeeded</code> status (or <code>requires_capture</code>, if <code>capture_method
   * </code> is set to <code>manual</code>). Read the <a
   * href="/docs/payments/payment-intents/server-confirmation">expanded documentation</a> to learn
   * more about server-side confirmation.
   *
   * <p>If the <code>confirmation_method</code> is <code>automatic</code>, payment may be attempted
   * using our <a href="/docs/stripe-js/reference#stripe-handle-card-payment">client SDKs</a> and
   * the PaymentIntent’s <a href="#payment_intent_object-client_secret">client_secret</a>. After
   * <code>next_action</code>s are handled by the client, no additional confirmation is required to
   * complete the payment.
   *
   * <p>If the <code>confirmation_method</code> is <code>manual</code>, all payment attempts must be
   * initiated using a secret key. If any actions are required for the payment, the PaymentIntent
   * will return to the <code>requires_confirmation</code> state after those actions are completed.
   * Your server needs to then explicitly re-confirm the PaymentIntent to initiate the next payment
   * attempt.
   */
  public PaymentIntent confirm(RequestOptions options) throws StripeException {
    return confirm((Map<String, Object>) null, options);
  }

  /**
   * Confirm that your customer intends to pay with current or provided payment method. Upon
   * confirmation, the PaymentIntent will attempt to initiate a payment.
   *
   * <p>If the selected payment method requires additional authentication steps, the PaymentIntent
   * will transition to the <code>requires_action</code> status and suggest additional actions via
   * <code>next_action</code>. If payment fails, the PaymentIntent will transition to the <code>
   * requires_payment_method</code> status. If payment succeeds, the PaymentIntent will transition
   * to the <code>succeeded</code> status (or <code>requires_capture</code>, if <code>capture_method
   * </code> is set to <code>manual</code>). Read the <a
   * href="/docs/payments/payment-intents/server-confirmation">expanded documentation</a> to learn
   * more about server-side confirmation.
   *
   * <p>If the <code>confirmation_method</code> is <code>automatic</code>, payment may be attempted
   * using our <a href="/docs/stripe-js/reference#stripe-handle-card-payment">client SDKs</a> and
   * the PaymentIntent’s <a href="#payment_intent_object-client_secret">client_secret</a>. After
   * <code>next_action</code>s are handled by the client, no additional confirmation is required to
   * complete the payment.
   *
   * <p>If the <code>confirmation_method</code> is <code>manual</code>, all payment attempts must be
   * initiated using a secret key. If any actions are required for the payment, the PaymentIntent
   * will return to the <code>requires_confirmation</code> state after those actions are completed.
   * Your server needs to then explicitly re-confirm the PaymentIntent to initiate the next payment
   * attempt.
   */
  public PaymentIntent confirm(Map<String, Object> params) throws StripeException {
    return confirm(params, (RequestOptions) null);
  }

  /**
   * Confirm that your customer intends to pay with current or provided payment method. Upon
   * confirmation, the PaymentIntent will attempt to initiate a payment.
   *
   * <p>If the selected payment method requires additional authentication steps, the PaymentIntent
   * will transition to the <code>requires_action</code> status and suggest additional actions via
   * <code>next_action</code>. If payment fails, the PaymentIntent will transition to the <code>
   * requires_payment_method</code> status. If payment succeeds, the PaymentIntent will transition
   * to the <code>succeeded</code> status (or <code>requires_capture</code>, if <code>capture_method
   * </code> is set to <code>manual</code>). Read the <a
   * href="/docs/payments/payment-intents/server-confirmation">expanded documentation</a> to learn
   * more about server-side confirmation.
   *
   * <p>If the <code>confirmation_method</code> is <code>automatic</code>, payment may be attempted
   * using our <a href="/docs/stripe-js/reference#stripe-handle-card-payment">client SDKs</a> and
   * the PaymentIntent’s <a href="#payment_intent_object-client_secret">client_secret</a>. After
   * <code>next_action</code>s are handled by the client, no additional confirmation is required to
   * complete the payment.
   *
   * <p>If the <code>confirmation_method</code> is <code>manual</code>, all payment attempts must be
   * initiated using a secret key. If any actions are required for the payment, the PaymentIntent
   * will return to the <code>requires_confirmation</code> state after those actions are completed.
   * Your server needs to then explicitly re-confirm the PaymentIntent to initiate the next payment
   * attempt.
   */
  public PaymentIntent confirm(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/payment_intents/%s/confirm", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, PaymentIntent.class, options);
  }

  /**
   * A PaymentIntent object can be canceled when it is in one of these statuses: <code>
   * requires_payment_method</code>, <code>requires_capture</code>, <code>requires_confirmation
   * </code>, <code>requires_action</code>.
   *
   * <p>Once canceled, no additional charges will be made by the PaymentIntent and any operations on
   * the PaymentIntent will fail with an error. For PaymentIntents with <code>
   * status='requires_capture'</code>, the remaining <code>amount_capturable</code> will
   * automatically be refunded.
   */
  public PaymentIntent cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * A PaymentIntent object can be canceled when it is in one of these statuses: <code>
   * requires_payment_method</code>, <code>requires_capture</code>, <code>requires_confirmation
   * </code>, <code>requires_action</code>.
   *
   * <p>Once canceled, no additional charges will be made by the PaymentIntent and any operations on
   * the PaymentIntent will fail with an error. For PaymentIntents with <code>
   * status='requires_capture'</code>, the remaining <code>amount_capturable</code> will
   * automatically be refunded.
   */
  public PaymentIntent cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /**
   * A PaymentIntent object can be canceled when it is in one of these statuses: <code>
   * requires_payment_method</code>, <code>requires_capture</code>, <code>requires_confirmation
   * </code>, <code>requires_action</code>.
   *
   * <p>Once canceled, no additional charges will be made by the PaymentIntent and any operations on
   * the PaymentIntent will fail with an error. For PaymentIntents with <code>
   * status='requires_capture'</code>, the remaining <code>amount_capturable</code> will
   * automatically be refunded.
   */
  public PaymentIntent cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * A PaymentIntent object can be canceled when it is in one of these statuses: <code>
   * requires_payment_method</code>, <code>requires_capture</code>, <code>requires_confirmation
   * </code>, <code>requires_action</code>.
   *
   * <p>Once canceled, no additional charges will be made by the PaymentIntent and any operations on
   * the PaymentIntent will fail with an error. For PaymentIntents with <code>
   * status='requires_capture'</code>, the remaining <code>amount_capturable</code> will
   * automatically be refunded.
   */
  public PaymentIntent cancel(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/payment_intents/%s/cancel", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, PaymentIntent.class, options);
  }

  /**
   * Capture the funds of an existing uncaptured PaymentIntent when its status is <code>
   * requires_capture</code>.
   *
   * <p>Uncaptured PaymentIntents will be canceled exactly seven days after they are created.
   *
   * <p>Read the <a
   * href="/docs/payments/payment-intents/creating-payment-intents#separate-auth-capture">expanded
   * documentation</a> to learn more about separate authorization and capture.
   */
  public PaymentIntent capture() throws StripeException {
    return capture((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Capture the funds of an existing uncaptured PaymentIntent when its status is <code>
   * requires_capture</code>.
   *
   * <p>Uncaptured PaymentIntents will be canceled exactly seven days after they are created.
   *
   * <p>Read the <a
   * href="/docs/payments/payment-intents/creating-payment-intents#separate-auth-capture">expanded
   * documentation</a> to learn more about separate authorization and capture.
   */
  public PaymentIntent capture(RequestOptions options) throws StripeException {
    return capture((Map<String, Object>) null, options);
  }

  /**
   * Capture the funds of an existing uncaptured PaymentIntent when its status is <code>
   * requires_capture</code>.
   *
   * <p>Uncaptured PaymentIntents will be canceled exactly seven days after they are created.
   *
   * <p>Read the <a
   * href="/docs/payments/payment-intents/creating-payment-intents#separate-auth-capture">expanded
   * documentation</a> to learn more about separate authorization and capture.
   */
  public PaymentIntent capture(Map<String, Object> params) throws StripeException {
    return capture(params, (RequestOptions) null);
  }

  /**
   * Capture the funds of an existing uncaptured PaymentIntent when its status is <code>
   * requires_capture</code>.
   *
   * <p>Uncaptured PaymentIntents will be canceled exactly seven days after they are created.
   *
   * <p>Read the <a
   * href="/docs/payments/payment-intents/creating-payment-intents#separate-auth-capture">expanded
   * documentation</a> to learn more about separate authorization and capture.
   */
  public PaymentIntent capture(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/payment_intents/%s/capture", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, PaymentIntent.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NextAction extends StripeObject {
    @SerializedName("redirect_to_url")
    NextActionRedirectToUrl redirectToUrl;

    /** Type of the next action to perform, one of `redirect_to_url` or `use_stripe_sdk`. */
    @SerializedName("type")
    String type;

    /**
     * When confirming a PaymentIntent with Stripe.js, Stripe.js depends on the contents of this
     * dictionary to invoke authentication flows. The shape of the contents is subject to change and
     * is only intended to be used by Stripe.js.
     */
    @SerializedName("use_stripe_sdk")
    Map<String, Object> useStripeSdk;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NextActionRedirectToUrl extends StripeObject {
    /**
     * If the customer does not exit their browser while authenticating, they will be redirected to
     * this specified URL after completion.
     */
    @SerializedName("return_url")
    String returnUrl;

    /** The URL you must redirect your customer to in order to authenticate the payment. */
    @SerializedName("url")
    String url;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransferData extends StripeObject {
    /**
     * The account (if any) the payment will be attributed to for tax reporting, and where funds
     * from the payment will be transferred to upon payment success.
     */
    @SerializedName("destination")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Account> destination;

    /** Get id of expandable `destination` object. */
    public String getDestination() {
      return (this.destination != null) ? this.destination.getId() : null;
    }

    public void setDestination(String id) {
      this.destination = ApiResource.setExpandableFieldId(id, this.destination);
    }

    /** Get expanded `destination`. */
    public Account getDestinationObject() {
      return (this.destination != null) ? this.destination.getExpanded() : null;
    }

    public void setDestinationObject(Account expandableObject) {
      this.destination = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
    }
  }
}
