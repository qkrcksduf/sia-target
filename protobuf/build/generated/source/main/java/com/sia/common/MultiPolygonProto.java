// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/common/MultiPolygon.proto

package com.sia.common;

public final class MultiPolygonProto {
  private MultiPolygonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sia_common_MultiPolygon_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sia_common_MultiPolygon_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!com/sia/common/MultiPolygon.proto\022\016com" +
      ".sia.common\032\034com/sia/common/Polygon.prot" +
      "o\"E\n\014MultiPolygon\022(\n\007polygon\030\001 \003(\0132\027.com" +
      ".sia.common.Polygon\022\013\n\003wkb\030\002 \001(\014B\025B\021Mult" +
      "iPolygonProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.sia.common.PolygonProto.getDescriptor(),
        });
    internal_static_com_sia_common_MultiPolygon_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sia_common_MultiPolygon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sia_common_MultiPolygon_descriptor,
        new java.lang.String[] { "Polygon", "Wkb", });
    com.sia.common.PolygonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
