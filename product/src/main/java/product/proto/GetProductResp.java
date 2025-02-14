// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

// Protobuf Java Version: 3.25.6
package product.proto;

/**
 * Protobuf type {@code product.GetProductResp}
 */
public final class GetProductResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:product.GetProductResp)
    GetProductRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetProductResp.newBuilder() to construct.
  private GetProductResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetProductResp() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetProductResp();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return product.proto.ProductProto.internal_static_product_GetProductResp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return product.proto.ProductProto.internal_static_product_GetProductResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            product.proto.GetProductResp.class, product.proto.GetProductResp.Builder.class);
  }

  private int bitField0_;
  public static final int PRODUCT_FIELD_NUMBER = 1;
  private product.proto.Product product_;
  /**
   * <code>.product.Product product = 1;</code>
   * @return Whether the product field is set.
   */
  @java.lang.Override
  public boolean hasProduct() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.product.Product product = 1;</code>
   * @return The product.
   */
  @java.lang.Override
  public product.proto.Product getProduct() {
    return product_ == null ? product.proto.Product.getDefaultInstance() : product_;
  }
  /**
   * <code>.product.Product product = 1;</code>
   */
  @java.lang.Override
  public product.proto.ProductOrBuilder getProductOrBuilder() {
    return product_ == null ? product.proto.Product.getDefaultInstance() : product_;
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
      output.writeMessage(1, getProduct());
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
        .computeMessageSize(1, getProduct());
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
    if (!(obj instanceof product.proto.GetProductResp)) {
      return super.equals(obj);
    }
    product.proto.GetProductResp other = (product.proto.GetProductResp) obj;

    if (hasProduct() != other.hasProduct()) return false;
    if (hasProduct()) {
      if (!getProduct()
          .equals(other.getProduct())) return false;
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
    if (hasProduct()) {
      hash = (37 * hash) + PRODUCT_FIELD_NUMBER;
      hash = (53 * hash) + getProduct().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static product.proto.GetProductResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static product.proto.GetProductResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static product.proto.GetProductResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static product.proto.GetProductResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static product.proto.GetProductResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static product.proto.GetProductResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static product.proto.GetProductResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static product.proto.GetProductResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static product.proto.GetProductResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static product.proto.GetProductResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static product.proto.GetProductResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static product.proto.GetProductResp parseFrom(
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
  public static Builder newBuilder(product.proto.GetProductResp prototype) {
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
   * Protobuf type {@code product.GetProductResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:product.GetProductResp)
      product.proto.GetProductRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return product.proto.ProductProto.internal_static_product_GetProductResp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return product.proto.ProductProto.internal_static_product_GetProductResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              product.proto.GetProductResp.class, product.proto.GetProductResp.Builder.class);
    }

    // Construct using product.proto.GetProductResp.newBuilder()
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
        getProductFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      product_ = null;
      if (productBuilder_ != null) {
        productBuilder_.dispose();
        productBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return product.proto.ProductProto.internal_static_product_GetProductResp_descriptor;
    }

    @java.lang.Override
    public product.proto.GetProductResp getDefaultInstanceForType() {
      return product.proto.GetProductResp.getDefaultInstance();
    }

    @java.lang.Override
    public product.proto.GetProductResp build() {
      product.proto.GetProductResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public product.proto.GetProductResp buildPartial() {
      product.proto.GetProductResp result = new product.proto.GetProductResp(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(product.proto.GetProductResp result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.product_ = productBuilder_ == null
            ? product_
            : productBuilder_.build();
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
      if (other instanceof product.proto.GetProductResp) {
        return mergeFrom((product.proto.GetProductResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(product.proto.GetProductResp other) {
      if (other == product.proto.GetProductResp.getDefaultInstance()) return this;
      if (other.hasProduct()) {
        mergeProduct(other.getProduct());
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
                  getProductFieldBuilder().getBuilder(),
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

    private product.proto.Product product_;
    private com.google.protobuf.SingleFieldBuilderV3<
        product.proto.Product, product.proto.Product.Builder, product.proto.ProductOrBuilder> productBuilder_;
    /**
     * <code>.product.Product product = 1;</code>
     * @return Whether the product field is set.
     */
    public boolean hasProduct() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.product.Product product = 1;</code>
     * @return The product.
     */
    public product.proto.Product getProduct() {
      if (productBuilder_ == null) {
        return product_ == null ? product.proto.Product.getDefaultInstance() : product_;
      } else {
        return productBuilder_.getMessage();
      }
    }
    /**
     * <code>.product.Product product = 1;</code>
     */
    public Builder setProduct(product.proto.Product value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        product_ = value;
      } else {
        productBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.product.Product product = 1;</code>
     */
    public Builder setProduct(
        product.proto.Product.Builder builderForValue) {
      if (productBuilder_ == null) {
        product_ = builderForValue.build();
      } else {
        productBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.product.Product product = 1;</code>
     */
    public Builder mergeProduct(product.proto.Product value) {
      if (productBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          product_ != null &&
          product_ != product.proto.Product.getDefaultInstance()) {
          getProductBuilder().mergeFrom(value);
        } else {
          product_ = value;
        }
      } else {
        productBuilder_.mergeFrom(value);
      }
      if (product_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.product.Product product = 1;</code>
     */
    public Builder clearProduct() {
      bitField0_ = (bitField0_ & ~0x00000001);
      product_ = null;
      if (productBuilder_ != null) {
        productBuilder_.dispose();
        productBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.product.Product product = 1;</code>
     */
    public product.proto.Product.Builder getProductBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getProductFieldBuilder().getBuilder();
    }
    /**
     * <code>.product.Product product = 1;</code>
     */
    public product.proto.ProductOrBuilder getProductOrBuilder() {
      if (productBuilder_ != null) {
        return productBuilder_.getMessageOrBuilder();
      } else {
        return product_ == null ?
            product.proto.Product.getDefaultInstance() : product_;
      }
    }
    /**
     * <code>.product.Product product = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        product.proto.Product, product.proto.Product.Builder, product.proto.ProductOrBuilder> 
        getProductFieldBuilder() {
      if (productBuilder_ == null) {
        productBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            product.proto.Product, product.proto.Product.Builder, product.proto.ProductOrBuilder>(
                getProduct(),
                getParentForChildren(),
                isClean());
        product_ = null;
      }
      return productBuilder_;
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


    // @@protoc_insertion_point(builder_scope:product.GetProductResp)
  }

  // @@protoc_insertion_point(class_scope:product.GetProductResp)
  private static final product.proto.GetProductResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new product.proto.GetProductResp();
  }

  public static product.proto.GetProductResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetProductResp>
      PARSER = new com.google.protobuf.AbstractParser<GetProductResp>() {
    @java.lang.Override
    public GetProductResp parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetProductResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetProductResp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public product.proto.GetProductResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

