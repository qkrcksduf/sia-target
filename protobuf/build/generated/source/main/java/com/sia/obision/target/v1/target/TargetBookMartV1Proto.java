// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/target/TargetBookMarkV1.proto

package com.sia.obision.target.v1.target;

public final class TargetBookMartV1Proto {
  private TargetBookMartV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sia_obision_target_v1_target_TargetBookMarkRequestV1_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sia_obision_target_v1_target_TargetBookMarkRequestV1_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7com/sia/obision/target/v1/target/Targe" +
      "tBookMarkV1.proto\022 com.sia.obision.targe" +
      "t.v1.target\"?\n\027TargetBookMarkRequestV1\022\020" +
      "\n\010targetId\030\001 \001(\t\022\022\n\nisFavorite\030\002 \001(\010B\031B\025" +
      "TargetBookMartV1ProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_sia_obision_target_v1_target_TargetBookMarkRequestV1_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sia_obision_target_v1_target_TargetBookMarkRequestV1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sia_obision_target_v1_target_TargetBookMarkRequestV1_descriptor,
        new java.lang.String[] { "TargetId", "IsFavorite", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}