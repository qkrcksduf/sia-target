// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/common/DoubleRange.proto

package com.sia.common;

public final class DoubleRangeProto {
  private DoubleRangeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sia_common_DoubleRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sia_common_DoubleRange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n com/sia/common/DoubleRange.proto\022\016com." +
      "sia.common\")\n\013DoubleRange\022\r\n\005start\030\001 \001(\001" +
      "\022\013\n\003end\030\002 \001(\001B\024B\020DoubleRangeProtoP\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_sia_common_DoubleRange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sia_common_DoubleRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sia_common_DoubleRange_descriptor,
        new java.lang.String[] { "Start", "End", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
