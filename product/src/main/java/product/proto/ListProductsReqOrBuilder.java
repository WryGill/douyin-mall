// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

// Protobuf Java Version: 3.25.6
package product.proto;

public interface ListProductsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:product.ListProductsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 page = 1;</code>
   * @return The page.
   */
  int getPage();

  /**
   * <code>int64 pageSize = 2;</code>
   * @return The pageSize.
   */
  long getPageSize();

  /**
   * <code>string categoryName = 3;</code>
   * @return The categoryName.
   */
  java.lang.String getCategoryName();
  /**
   * <code>string categoryName = 3;</code>
   * @return The bytes for categoryName.
   */
  com.google.protobuf.ByteString
      getCategoryNameBytes();
}
