// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/category/CategoryV1.proto

package com.sia.obision.target.v1.category;

public final class CategoryV1Proto {
  private CategoryV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sia_obision_target_v1_category_Category_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sia_obision_target_v1_category_Category_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3com/sia/obision/target/v1/category/Cat" +
      "egoryV1.proto\022\"com.sia.obision.target.v1" +
      ".category\032\031com/sia/common/UUID.proto\"o\n\010" +
      "Category\022 \n\002id\030\001 \001(\0132\024.com.sia.common.UU" +
      "ID\022\024\n\014mainCategory\030\002 \001(\t\022\026\n\016middleCatego" +
      "ry\030\003 \001(\t\022\023\n\013subCategory\030\004 \001(\tB\023B\017Categor" +
      "yV1ProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.sia.common.UUIDProto.getDescriptor(),
        });
    internal_static_com_sia_obision_target_v1_category_Category_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sia_obision_target_v1_category_Category_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sia_obision_target_v1_category_Category_descriptor,
        new java.lang.String[] { "Id", "MainCategory", "MiddleCategory", "SubCategory", });
    com.sia.common.UUIDProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
