// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/common/TimestampRange.proto

package com.sia.common;

public final class TimestampRangeProto {
  private TimestampRangeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sia_common_TimestampRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sia_common_TimestampRange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#com/sia/common/TimestampRange.proto\022\016c" +
      "om.sia.common\032\037google/protobuf/timestamp" +
      ".proto\"d\n\016TimestampRange\022)\n\005start\030\001 \001(\0132" +
      "\032.google.protobuf.Timestamp\022\'\n\003end\030\002 \001(\013" +
      "2\032.google.protobuf.TimestampB\027B\023Timestam" +
      "pRangeProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_com_sia_common_TimestampRange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sia_common_TimestampRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sia_common_TimestampRange_descriptor,
        new java.lang.String[] { "Start", "End", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
