// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/common/GeoPoint.proto

package com.sia.common;

public final class GeoPointProto {
  private GeoPointProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sia_common_GeoPoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sia_common_GeoPoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035com/sia/common/GeoPoint.proto\022\016com.sia" +
      ".common\"/\n\010GeoPoint\022\020\n\010latitude\030\001 \001(\001\022\021\n" +
      "\tlongitude\030\002 \001(\001B\021B\rGeoPointProtoP\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_sia_common_GeoPoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sia_common_GeoPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sia_common_GeoPoint_descriptor,
        new java.lang.String[] { "Latitude", "Longitude", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}