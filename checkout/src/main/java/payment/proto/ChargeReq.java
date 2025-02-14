// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: payment.proto

// Protobuf Java Version: 3.25.6
package payment.proto;

/**
 * Protobuf type {@code payment.ChargeReq}
 */
public final class ChargeReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:payment.ChargeReq)
    ChargeReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChargeReq.newBuilder() to construct.
  private ChargeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChargeReq() {
    orderId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChargeReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return payment.proto.PaymentProto.internal_static_payment_ChargeReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return payment.proto.PaymentProto.internal_static_payment_ChargeReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            payment.proto.ChargeReq.class, payment.proto.ChargeReq.Builder.class);
  }

  private int bitField0_;
  public static final int AMOUNT_FIELD_NUMBER = 1;
  private float amount_ = 0F;
  /**
   * <code>float amount = 1;</code>
   * @return The amount.
   */
  @java.lang.Override
  public float getAmount() {
    return amount_;
  }

  public static final int CREDIT_CARD_FIELD_NUMBER = 2;
  private payment.proto.CreditCardInfo creditCard_;
  /**
   * <code>.payment.CreditCardInfo credit_card = 2;</code>
   * @return Whether the creditCard field is set.
   */
  @java.lang.Override
  public boolean hasCreditCard() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.payment.CreditCardInfo credit_card = 2;</code>
   * @return The creditCard.
   */
  @java.lang.Override
  public payment.proto.CreditCardInfo getCreditCard() {
    return creditCard_ == null ? payment.proto.CreditCardInfo.getDefaultInstance() : creditCard_;
  }
  /**
   * <code>.payment.CreditCardInfo credit_card = 2;</code>
   */
  @java.lang.Override
  public payment.proto.CreditCardInfoOrBuilder getCreditCardOrBuilder() {
    return creditCard_ == null ? payment.proto.CreditCardInfo.getDefaultInstance() : creditCard_;
  }

  public static final int ORDER_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orderId_ = "";
  /**
   * <code>string order_id = 3;</code>
   * @return The orderId.
   */
  @java.lang.Override
  public java.lang.String getOrderId() {
    java.lang.Object ref = orderId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderId_ = s;
      return s;
    }
  }
  /**
   * <code>string order_id = 3;</code>
   * @return The bytes for orderId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrderIdBytes() {
    java.lang.Object ref = orderId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_ID_FIELD_NUMBER = 4;
  private int userId_ = 0;
  /**
   * <code>uint32 user_id = 4;</code>
   * @return The userId.
   */
  @java.lang.Override
  public int getUserId() {
    return userId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (java.lang.Float.floatToRawIntBits(amount_) != 0) {
      output.writeFloat(1, amount_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getCreditCard());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orderId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, orderId_);
    }
    if (userId_ != 0) {
      output.writeUInt32(4, userId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(amount_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, amount_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCreditCard());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orderId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, orderId_);
    }
    if (userId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, userId_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof payment.proto.ChargeReq)) {
      return super.equals(obj);
    }
    payment.proto.ChargeReq other = (payment.proto.ChargeReq) obj;

    if (java.lang.Float.floatToIntBits(getAmount())
        != java.lang.Float.floatToIntBits(
            other.getAmount())) return false;
    if (hasCreditCard() != other.hasCreditCard()) return false;
    if (hasCreditCard()) {
      if (!getCreditCard()
          .equals(other.getCreditCard())) return false;
    }
    if (!getOrderId()
        .equals(other.getOrderId())) return false;
    if (getUserId()
        != other.getUserId()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getAmount());
    if (hasCreditCard()) {
      hash = (37 * hash) + CREDIT_CARD_FIELD_NUMBER;
      hash = (53 * hash) + getCreditCard().hashCode();
    }
    hash = (37 * hash) + ORDER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOrderId().hashCode();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static payment.proto.ChargeReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static payment.proto.ChargeReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static payment.proto.ChargeReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static payment.proto.ChargeReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static payment.proto.ChargeReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static payment.proto.ChargeReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static payment.proto.ChargeReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static payment.proto.ChargeReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static payment.proto.ChargeReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static payment.proto.ChargeReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static payment.proto.ChargeReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static payment.proto.ChargeReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(payment.proto.ChargeReq prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code payment.ChargeReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:payment.ChargeReq)
      payment.proto.ChargeReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return payment.proto.PaymentProto.internal_static_payment_ChargeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return payment.proto.PaymentProto.internal_static_payment_ChargeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              payment.proto.ChargeReq.class, payment.proto.ChargeReq.Builder.class);
    }

    // Construct using payment.proto.ChargeReq.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getCreditCardFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      amount_ = 0F;
      creditCard_ = null;
      if (creditCardBuilder_ != null) {
        creditCardBuilder_.dispose();
        creditCardBuilder_ = null;
      }
      orderId_ = "";
      userId_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return payment.proto.PaymentProto.internal_static_payment_ChargeReq_descriptor;
    }

    @java.lang.Override
    public payment.proto.ChargeReq getDefaultInstanceForType() {
      return payment.proto.ChargeReq.getDefaultInstance();
    }

    @java.lang.Override
    public payment.proto.ChargeReq build() {
      payment.proto.ChargeReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public payment.proto.ChargeReq buildPartial() {
      payment.proto.ChargeReq result = new payment.proto.ChargeReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(payment.proto.ChargeReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.amount_ = amount_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.creditCard_ = creditCardBuilder_ == null
            ? creditCard_
            : creditCardBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.orderId_ = orderId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.userId_ = userId_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof payment.proto.ChargeReq) {
        return mergeFrom((payment.proto.ChargeReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(payment.proto.ChargeReq other) {
      if (other == payment.proto.ChargeReq.getDefaultInstance()) return this;
      if (other.getAmount() != 0F) {
        setAmount(other.getAmount());
      }
      if (other.hasCreditCard()) {
        mergeCreditCard(other.getCreditCard());
      }
      if (!other.getOrderId().isEmpty()) {
        orderId_ = other.orderId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getUserId() != 0) {
        setUserId(other.getUserId());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 13: {
              amount_ = input.readFloat();
              bitField0_ |= 0x00000001;
              break;
            } // case 13
            case 18: {
              input.readMessage(
                  getCreditCardFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              orderId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              userId_ = input.readUInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private float amount_ ;
    /**
     * <code>float amount = 1;</code>
     * @return The amount.
     */
    @java.lang.Override
    public float getAmount() {
      return amount_;
    }
    /**
     * <code>float amount = 1;</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(float value) {

      amount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>float amount = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      amount_ = 0F;
      onChanged();
      return this;
    }

    private payment.proto.CreditCardInfo creditCard_;
    private com.google.protobuf.SingleFieldBuilderV3<
        payment.proto.CreditCardInfo, payment.proto.CreditCardInfo.Builder, payment.proto.CreditCardInfoOrBuilder> creditCardBuilder_;
    /**
     * <code>.payment.CreditCardInfo credit_card = 2;</code>
     * @return Whether the creditCard field is set.
     */
    public boolean hasCreditCard() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.payment.CreditCardInfo credit_card = 2;</code>
     * @return The creditCard.
     */
    public payment.proto.CreditCardInfo getCreditCard() {
      if (creditCardBuilder_ == null) {
        return creditCard_ == null ? payment.proto.CreditCardInfo.getDefaultInstance() : creditCard_;
      } else {
        return creditCardBuilder_.getMessage();
      }
    }
    /**
     * <code>.payment.CreditCardInfo credit_card = 2;</code>
     */
    public Builder setCreditCard(payment.proto.CreditCardInfo value) {
      if (creditCardBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        creditCard_ = value;
      } else {
        creditCardBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.payment.CreditCardInfo credit_card = 2;</code>
     */
    public Builder setCreditCard(
        payment.proto.CreditCardInfo.Builder builderForValue) {
      if (creditCardBuilder_ == null) {
        creditCard_ = builderForValue.build();
      } else {
        creditCardBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.payment.CreditCardInfo credit_card = 2;</code>
     */
    public Builder mergeCreditCard(payment.proto.CreditCardInfo value) {
      if (creditCardBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          creditCard_ != null &&
          creditCard_ != payment.proto.CreditCardInfo.getDefaultInstance()) {
          getCreditCardBuilder().mergeFrom(value);
        } else {
          creditCard_ = value;
        }
      } else {
        creditCardBuilder_.mergeFrom(value);
      }
      if (creditCard_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.payment.CreditCardInfo credit_card = 2;</code>
     */
    public Builder clearCreditCard() {
      bitField0_ = (bitField0_ & ~0x00000002);
      creditCard_ = null;
      if (creditCardBuilder_ != null) {
        creditCardBuilder_.dispose();
        creditCardBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.payment.CreditCardInfo credit_card = 2;</code>
     */
    public payment.proto.CreditCardInfo.Builder getCreditCardBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCreditCardFieldBuilder().getBuilder();
    }
    /**
     * <code>.payment.CreditCardInfo credit_card = 2;</code>
     */
    public payment.proto.CreditCardInfoOrBuilder getCreditCardOrBuilder() {
      if (creditCardBuilder_ != null) {
        return creditCardBuilder_.getMessageOrBuilder();
      } else {
        return creditCard_ == null ?
            payment.proto.CreditCardInfo.getDefaultInstance() : creditCard_;
      }
    }
    /**
     * <code>.payment.CreditCardInfo credit_card = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        payment.proto.CreditCardInfo, payment.proto.CreditCardInfo.Builder, payment.proto.CreditCardInfoOrBuilder> 
        getCreditCardFieldBuilder() {
      if (creditCardBuilder_ == null) {
        creditCardBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            payment.proto.CreditCardInfo, payment.proto.CreditCardInfo.Builder, payment.proto.CreditCardInfoOrBuilder>(
                getCreditCard(),
                getParentForChildren(),
                isClean());
        creditCard_ = null;
      }
      return creditCardBuilder_;
    }

    private java.lang.Object orderId_ = "";
    /**
     * <code>string order_id = 3;</code>
     * @return The orderId.
     */
    public java.lang.String getOrderId() {
      java.lang.Object ref = orderId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string order_id = 3;</code>
     * @return The bytes for orderId.
     */
    public com.google.protobuf.ByteString
        getOrderIdBytes() {
      java.lang.Object ref = orderId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string order_id = 3;</code>
     * @param value The orderId to set.
     * @return This builder for chaining.
     */
    public Builder setOrderId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      orderId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string order_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderId() {
      orderId_ = getDefaultInstance().getOrderId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string order_id = 3;</code>
     * @param value The bytes for orderId to set.
     * @return This builder for chaining.
     */
    public Builder setOrderIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      orderId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int userId_ ;
    /**
     * <code>uint32 user_id = 4;</code>
     * @return The userId.
     */
    @java.lang.Override
    public int getUserId() {
      return userId_;
    }
    /**
     * <code>uint32 user_id = 4;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(int value) {

      userId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 user_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      bitField0_ = (bitField0_ & ~0x00000008);
      userId_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:payment.ChargeReq)
  }

  // @@protoc_insertion_point(class_scope:payment.ChargeReq)
  private static final payment.proto.ChargeReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new payment.proto.ChargeReq();
  }

  public static payment.proto.ChargeReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChargeReq>
      PARSER = new com.google.protobuf.AbstractParser<ChargeReq>() {
    @java.lang.Override
    public ChargeReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ChargeReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChargeReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public payment.proto.ChargeReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

