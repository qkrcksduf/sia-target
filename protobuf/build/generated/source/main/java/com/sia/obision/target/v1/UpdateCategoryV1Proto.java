// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/UpdateCategoryV1.proto

package com.sia.obision.target.v1;

public final class UpdateCategoryV1Proto {
  private UpdateCategoryV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sia_obision_target_v1_UpdateCategoryRequestV1_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sia_obision_target_v1_UpdateCategoryRequestV1_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0com/sia/obision/target/v1/UpdateCatego" +
      "ryV1.proto\022\031com.sia.obision.target.v1\032\031c" +
      "om/sia/common/UUID.proto\"~\n\027UpdateCatego" +
      "ryRequestV1\022 \n\002id\030\001 \001(\0132\024.com.sia.common" +
      ".UUID\022\024\n\014mainCategory\030\002 \001(\t\022\026\n\016middleCat" +
      "egory\030\003 \001(\t\022\023\n\013subCategory\030\004 \001(\tB\031B\025Upda" +
      "teCategoryV1ProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.sia.common.UUIDProto.getDescriptor(),
        });
    internal_static_com_sia_obision_target_v1_UpdateCategoryRequestV1_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sia_obision_target_v1_UpdateCategoryRequestV1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sia_obision_target_v1_UpdateCategoryRequestV1_descriptor,
        new java.lang.String[] { "Id", "MainCategory", "MiddleCategory", "SubCategory", });
    com.sia.common.UUIDProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
