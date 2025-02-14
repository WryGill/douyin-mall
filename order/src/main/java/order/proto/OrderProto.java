// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

// Protobuf Java Version: 3.25.6
package order.proto;

public final class OrderProto {
  private OrderProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_order_Address_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_order_Address_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_order_PlaceOrderReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_order_PlaceOrderReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_order_OrderItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_order_OrderItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_order_OrderResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_order_OrderResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_order_PlaceOrderResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_order_PlaceOrderResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_order_ListOrderReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_order_ListOrderReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_order_Order_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_order_Order_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_order_ListOrderResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_order_ListOrderResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_order_MarkOrderPaidReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_order_MarkOrderPaidReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_order_MarkOrderPaidResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_order_MarkOrderPaidResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013order.proto\022\005order\032\ncart.proto\"a\n\007Addr" +
      "ess\022\026\n\016street_address\030\001 \001(\t\022\014\n\004city\030\002 \001(" +
      "\t\022\r\n\005state\030\003 \001(\t\022\017\n\007country\030\004 \001(\t\022\020\n\010zip" +
      "_code\030\005 \001(\005\"\216\001\n\rPlaceOrderReq\022\017\n\007user_id" +
      "\030\001 \001(\r\022\025\n\ruser_currency\030\002 \001(\t\022\037\n\007address" +
      "\030\003 \001(\0132\016.order.Address\022\r\n\005email\030\004 \001(\t\022%\n" +
      "\013order_items\030\005 \003(\0132\020.order.OrderItem\"7\n\t" +
      "OrderItem\022\034\n\004item\030\001 \001(\0132\016.cart.CartItem\022" +
      "\014\n\004cost\030\002 \001(\002\"\037\n\013OrderResult\022\020\n\010order_id" +
      "\030\001 \001(\t\"3\n\016PlaceOrderResp\022!\n\005order\030\001 \001(\0132" +
      "\022.order.OrderResult\"\037\n\014ListOrderReq\022\017\n\007u" +
      "ser_id\030\001 \001(\r\"\254\001\n\005Order\022%\n\013order_items\030\001 " +
      "\003(\0132\020.order.OrderItem\022\020\n\010order_id\030\002 \001(\t\022" +
      "\017\n\007user_id\030\003 \001(\r\022\025\n\ruser_currency\030\004 \001(\t\022" +
      "\037\n\007address\030\005 \001(\0132\016.order.Address\022\r\n\005emai" +
      "l\030\006 \001(\t\022\022\n\ncreated_at\030\007 \001(\005\"-\n\rListOrder" +
      "Resp\022\034\n\006orders\030\001 \003(\0132\014.order.Order\"5\n\020Ma" +
      "rkOrderPaidReq\022\017\n\007user_id\030\001 \001(\r\022\020\n\010order" +
      "_id\030\002 \001(\t\"\023\n\021MarkOrderPaidResp2\313\001\n\014Order" +
      "Service\022;\n\nPlaceOrder\022\024.order.PlaceOrder" +
      "Req\032\025.order.PlaceOrderResp\"\000\0228\n\tListOrde" +
      "r\022\023.order.ListOrderReq\032\024.order.ListOrder" +
      "Resp\"\000\022D\n\rMarkOrderPaid\022\027.order.MarkOrde" +
      "rPaidReq\032\030.order.MarkOrderPaidResp\"\000B\033\n\013" +
      "order.protoB\nOrderProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          order.proto.CartProto.getDescriptor(),
        });
    internal_static_order_Address_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_order_Address_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_order_Address_descriptor,
        new java.lang.String[] { "StreetAddress", "City", "State", "Country", "ZipCode", });
    internal_static_order_PlaceOrderReq_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_order_PlaceOrderReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_order_PlaceOrderReq_descriptor,
        new java.lang.String[] { "UserId", "UserCurrency", "Address", "Email", "OrderItems", });
    internal_static_order_OrderItem_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_order_OrderItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_order_OrderItem_descriptor,
        new java.lang.String[] { "Item", "Cost", });
    internal_static_order_OrderResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_order_OrderResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_order_OrderResult_descriptor,
        new java.lang.String[] { "OrderId", });
    internal_static_order_PlaceOrderResp_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_order_PlaceOrderResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_order_PlaceOrderResp_descriptor,
        new java.lang.String[] { "Order", });
    internal_static_order_ListOrderReq_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_order_ListOrderReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_order_ListOrderReq_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_order_Order_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_order_Order_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_order_Order_descriptor,
        new java.lang.String[] { "OrderItems", "OrderId", "UserId", "UserCurrency", "Address", "Email", "CreatedAt", });
    internal_static_order_ListOrderResp_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_order_ListOrderResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_order_ListOrderResp_descriptor,
        new java.lang.String[] { "Orders", });
    internal_static_order_MarkOrderPaidReq_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_order_MarkOrderPaidReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_order_MarkOrderPaidReq_descriptor,
        new java.lang.String[] { "UserId", "OrderId", });
    internal_static_order_MarkOrderPaidResp_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_order_MarkOrderPaidResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_order_MarkOrderPaidResp_descriptor,
        new java.lang.String[] { });
    order.proto.CartProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
