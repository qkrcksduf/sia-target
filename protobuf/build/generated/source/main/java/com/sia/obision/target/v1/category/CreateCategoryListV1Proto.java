// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/category/CreateCategoryListV1.proto

package com.sia.obision.target.v1.category;

public final class CreateCategoryListV1Proto {
  private CreateCategoryListV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sia_obision_target_v1_category_CreateCategoryListRequestV1_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sia_obision_target_v1_category_CreateCategoryListRequestV1_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sia_obision_target_v1_category_CreateCategoryListResponseV1_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sia_obision_target_v1_category_CreateCategoryListResponseV1_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=com/sia/obision/target/v1/category/Cre" +
      "ateCategoryListV1.proto\022\"com.sia.obision" +
      ".target.v1.category\0329com/sia/obision/tar" +
      "get/v1/category/CreateCategoryV1.proto\"l" +
      "\n\033CreateCategoryListRequestV1\022M\n\010categor" +
      "y\030\001 \003(\0132;.com.sia.obision.target.v1.cate" +
      "gory.CreateCategoryRequestV1\"n\n\034CreateCa" +
      "tegoryListResponseV1\022N\n\010category\030\001 \003(\0132<" +
      ".com.sia.obision.target.v1.category.Crea" +
      "teCategoryResponseV1B\035B\031CreateCategoryLi" +
      "stV1ProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.sia.obision.target.v1.category.CreateCategoryV1Proto.getDescriptor(),
        });
    internal_static_com_sia_obision_target_v1_category_CreateCategoryListRequestV1_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sia_obision_target_v1_category_CreateCategoryListRequestV1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sia_obision_target_v1_category_CreateCategoryListRequestV1_descriptor,
        new java.lang.String[] { "Category", });
    internal_static_com_sia_obision_target_v1_category_CreateCategoryListResponseV1_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_sia_obision_target_v1_category_CreateCategoryListResponseV1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sia_obision_target_v1_category_CreateCategoryListResponseV1_descriptor,
        new java.lang.String[] { "Category", });
    com.sia.obision.target.v1.category.CreateCategoryV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}