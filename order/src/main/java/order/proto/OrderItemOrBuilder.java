// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

// Protobuf Java Version: 3.25.6
package order.proto;

public interface OrderItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:order.OrderItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cart.CartItem item = 1;</code>
   * @return Whether the item field is set.
   */
  boolean hasItem();
  /**
   * <code>.cart.CartItem item = 1;</code>
   * @return The item.
   */
  order.proto.CartItem getItem();
  /**
   * <code>.cart.CartItem item = 1;</code>
   */
  order.proto.CartItemOrBuilder getItemOrBuilder();

  /**
   * <code>float cost = 2;</code>
   * @return The cost.
   */
  float getCost();
}
