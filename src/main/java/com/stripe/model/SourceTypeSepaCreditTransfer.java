// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceTypeSepaCreditTransfer extends StripeObject {
  @SerializedName("bank_name")
  String bankName;

  @SerializedName("bic")
  String bic;

  @SerializedName("iban")
  String iban;

  @SerializedName("refund_account_holder_address_city")
  String refundAccountHolderAddressCity;

  @SerializedName("refund_account_holder_address_country")
  String refundAccountHolderAddressCountry;

  @SerializedName("refund_account_holder_address_line1")
  String refundAccountHolderAddressLine1;

  @SerializedName("refund_account_holder_address_line2")
  String refundAccountHolderAddressLine2;

  @SerializedName("refund_account_holder_address_postal_code")
  String refundAccountHolderAddressPostalCode;

  @SerializedName("refund_account_holder_address_state")
  String refundAccountHolderAddressState;

  @SerializedName("refund_account_holder_name")
  String refundAccountHolderName;

  @SerializedName("refund_iban")
  String refundIban;
}