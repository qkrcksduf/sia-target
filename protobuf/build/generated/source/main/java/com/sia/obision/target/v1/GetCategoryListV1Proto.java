// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/GetCategoryListV1.proto

package com.sia.obision.target.v1;

public final class GetCategoryListV1Proto {
  private GetCategoryListV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sia_obision_target_v1_GetCategoryListResponseV1_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sia_obision_target_v1_GetCategoryListResponseV1_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1com/sia/obision/target/v1/GetCategoryL" +
      "istV1.proto\022\031com.sia.obision.target.v1\032*" +
      "com/sia/obision/target/v1/CategoryV1.pro" +
      "to\"R\n\031GetCategoryListResponseV1\0225\n\010categ" +
      "ory\030\001 \003(\0132#.com.sia.obision.target.v1.Ca" +
      "tegoryB\032B\026GetCategoryListV1ProtoP\001b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.sia.obision.target.v1.CategoryV1Proto.getDescriptor(),
        });
    internal_static_com_sia_obision_target_v1_GetCategoryListResponseV1_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sia_obision_target_v1_GetCategoryListResponseV1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sia_obision_target_v1_GetCategoryListResponseV1_descriptor,
        new java.lang.String[] { "Category", });
    com.sia.obision.target.v1.CategoryV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}