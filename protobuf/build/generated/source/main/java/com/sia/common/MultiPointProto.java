// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/common/MultiPoint.proto

package com.sia.common;

public final class MultiPointProto {
  private MultiPointProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sia_common_MultiPoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sia_common_MultiPoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037com/sia/common/MultiPoint.proto\022\016com.s" +
      "ia.common\032\032com/sia/common/Point.proto\"2\n" +
      "\nMultiPoint\022$\n\005point\030\001 \003(\0132\025.com.sia.com" +
      "mon.PointB\023B\017MultiPointProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.sia.common.PointProto.getDescriptor(),
        });
    internal_static_com_sia_common_MultiPoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sia_common_MultiPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sia_common_MultiPoint_descriptor,
        new java.lang.String[] { "Point", });
    com.sia.common.PointProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}