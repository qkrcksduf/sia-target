// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/record/RecordSelectOptionV1.proto

package com.sia.obision.target.v1.record;

public final class RecordSelectOptionV1Proto {
  private RecordSelectOptionV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sia_obision_target_v1_record_RecordSelectOption_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sia_obision_target_v1_record_RecordSelectOption_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;com/sia/obision/target/v1/record/Recor" +
      "dSelectOptionV1.proto\022 com.sia.obision.t" +
      "arget.v1.record\"]\n\022RecordSelectOption\022\030\n" +
      "\020isFavoriteRecord\030\002 \001(\010\022\030\n\020isFavoriteTar" +
      "get\030\003 \001(\010\022\023\n\013isEmergency\030\004 \001(\010B\035B\031Record" +
      "SelectOptionV1ProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_sia_obision_target_v1_record_RecordSelectOption_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sia_obision_target_v1_record_RecordSelectOption_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sia_obision_target_v1_record_RecordSelectOption_descriptor,
        new java.lang.String[] { "IsFavoriteRecord", "IsFavoriteTarget", "IsEmergency", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}