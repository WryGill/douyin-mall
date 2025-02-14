// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

// Protobuf Java Version: 3.25.6
package order.proto;

/**
 * Protobuf type {@code order.PlaceOrderResp}
 */
public final class PlaceOrderResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:order.PlaceOrderResp)
    PlaceOrderRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlaceOrderResp.newBuilder() to construct.
  private PlaceOrderResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlaceOrderResp() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlaceOrderResp();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return order.proto.OrderProto.internal_static_order_PlaceOrderResp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return order.proto.OrderProto.internal_static_order_PlaceOrderResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            order.proto.PlaceOrderResp.class, order.proto.PlaceOrderResp.Builder.class);
  }

  private int bitField0_;
  public static final int ORDER_FIELD_NUMBER = 1;
  private order.proto.OrderResult order_;
  /**
   * <code>.order.OrderResult order = 1;</code>
   * @return Whether the order field is set.
   */
  @java.lang.Override
  public boolean hasOrder() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.order.OrderResult order = 1;</code>
   * @return The order.
   */
  @java.lang.Override
  public order.proto.OrderResult getOrder() {
    return order_ == null ? order.proto.OrderResult.getDefaultInstance() : order_;
  }
  /**
   * <code>.order.OrderResult order = 1;</code>
   */
  @java.lang.Override
  public order.proto.OrderResultOrBuilder getOrderOrBuilder() {
    return order_ == null ? order.proto.OrderResult.getDefaultInstance() : order_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getOrder());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOrder());
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
    if (!(obj instanceof order.proto.PlaceOrderResp)) {
      return super.equals(obj);
    }
    order.proto.PlaceOrderResp other = (order.proto.PlaceOrderResp) obj;

    if (hasOrder() != other.hasOrder()) return false;
    if (hasOrder()) {
      if (!getOrder()
          .equals(other.getOrder())) return false;
    }
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
    if (hasOrder()) {
      hash = (37 * hash) + ORDER_FIELD_NUMBER;
      hash = (53 * hash) + getOrder().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static order.proto.PlaceOrderResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static order.proto.PlaceOrderResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static order.proto.PlaceOrderResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static order.proto.PlaceOrderResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static order.proto.PlaceOrderResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static order.proto.PlaceOrderResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static order.proto.PlaceOrderResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static order.proto.PlaceOrderResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static order.proto.PlaceOrderResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static order.proto.PlaceOrderResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static order.proto.PlaceOrderResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static order.proto.PlaceOrderResp parseFrom(
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
  public static Builder newBuilder(order.proto.PlaceOrderResp prototype) {
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
   * Protobuf type {@code order.PlaceOrderResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:order.PlaceOrderResp)
      order.proto.PlaceOrderRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return order.proto.OrderProto.internal_static_order_PlaceOrderResp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return order.proto.OrderProto.internal_static_order_PlaceOrderResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              order.proto.PlaceOrderResp.class, order.proto.PlaceOrderResp.Builder.class);
    }

    // Construct using order.proto.PlaceOrderResp.newBuilder()
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
        getOrderFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      order_ = null;
      if (orderBuilder_ != null) {
        orderBuilder_.dispose();
        orderBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return order.proto.OrderProto.internal_static_order_PlaceOrderResp_descriptor;
    }

    @java.lang.Override
    public order.proto.PlaceOrderResp getDefaultInstanceForType() {
      return order.proto.PlaceOrderResp.getDefaultInstance();
    }

    @java.lang.Override
    public order.proto.PlaceOrderResp build() {
      order.proto.PlaceOrderResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public order.proto.PlaceOrderResp buildPartial() {
      order.proto.PlaceOrderResp result = new order.proto.PlaceOrderResp(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(order.proto.PlaceOrderResp result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.order_ = orderBuilder_ == null
            ? order_
            : orderBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof order.proto.PlaceOrderResp) {
        return mergeFrom((order.proto.PlaceOrderResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(order.proto.PlaceOrderResp other) {
      if (other == order.proto.PlaceOrderResp.getDefaultInstance()) return this;
      if (other.hasOrder()) {
        mergeOrder(other.getOrder());
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
            case 10: {
              input.readMessage(
                  getOrderFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private order.proto.OrderResult order_;
    private com.google.protobuf.SingleFieldBuilderV3<
        order.proto.OrderResult, order.proto.OrderResult.Builder, order.proto.OrderResultOrBuilder> orderBuilder_;
    /**
     * <code>.order.OrderResult order = 1;</code>
     * @return Whether the order field is set.
     */
    public boolean hasOrder() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.order.OrderResult order = 1;</code>
     * @return The order.
     */
    public order.proto.OrderResult getOrder() {
      if (orderBuilder_ == null) {
        return order_ == null ? order.proto.OrderResult.getDefaultInstance() : order_;
      } else {
        return orderBuilder_.getMessage();
      }
    }
    /**
     * <code>.order.OrderResult order = 1;</code>
     */
    public Builder setOrder(order.proto.OrderResult value) {
      if (orderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        order_ = value;
      } else {
        orderBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.order.OrderResult order = 1;</code>
     */
    public Builder setOrder(
        order.proto.OrderResult.Builder builderForValue) {
      if (orderBuilder_ == null) {
        order_ = builderForValue.build();
      } else {
        orderBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.order.OrderResult order = 1;</code>
     */
    public Builder mergeOrder(order.proto.OrderResult value) {
      if (orderBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          order_ != null &&
          order_ != order.proto.OrderResult.getDefaultInstance()) {
          getOrderBuilder().mergeFrom(value);
        } else {
          order_ = value;
        }
      } else {
        orderBuilder_.mergeFrom(value);
      }
      if (order_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.order.OrderResult order = 1;</code>
     */
    public Builder clearOrder() {
      bitField0_ = (bitField0_ & ~0x00000001);
      order_ = null;
      if (orderBuilder_ != null) {
        orderBuilder_.dispose();
        orderBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.order.OrderResult order = 1;</code>
     */
    public order.proto.OrderResult.Builder getOrderBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getOrderFieldBuilder().getBuilder();
    }
    /**
     * <code>.order.OrderResult order = 1;</code>
     */
    public order.proto.OrderResultOrBuilder getOrderOrBuilder() {
      if (orderBuilder_ != null) {
        return orderBuilder_.getMessageOrBuilder();
      } else {
        return order_ == null ?
            order.proto.OrderResult.getDefaultInstance() : order_;
      }
    }
    /**
     * <code>.order.OrderResult order = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        order.proto.OrderResult, order.proto.OrderResult.Builder, order.proto.OrderResultOrBuilder> 
        getOrderFieldBuilder() {
      if (orderBuilder_ == null) {
        orderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            order.proto.OrderResult, order.proto.OrderResult.Builder, order.proto.OrderResultOrBuilder>(
                getOrder(),
                getParentForChildren(),
                isClean());
        order_ = null;
      }
      return orderBuilder_;
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


    // @@protoc_insertion_point(builder_scope:order.PlaceOrderResp)
  }

  // @@protoc_insertion_point(class_scope:order.PlaceOrderResp)
  private static final order.proto.PlaceOrderResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new order.proto.PlaceOrderResp();
  }

  public static order.proto.PlaceOrderResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlaceOrderResp>
      PARSER = new com.google.protobuf.AbstractParser<PlaceOrderResp>() {
    @java.lang.Override
    public PlaceOrderResp parsePartialFrom(
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

  public static com.google.protobuf.Parser<PlaceOrderResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlaceOrderResp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public order.proto.PlaceOrderResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

