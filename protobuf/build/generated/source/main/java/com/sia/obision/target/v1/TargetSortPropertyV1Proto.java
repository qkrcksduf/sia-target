// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/TargetSortPropertyV1.proto

package com.sia.obision.target.v1;

public final class TargetSortPropertyV1Proto {
  private TargetSortPropertyV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4com/sia/obision/target/v1/TargetSortPr" +
      "opertyV1.proto\022\031com.sia.obision.target.v" +
      "1\032\035com/sia/common/GeoPoint.proto*S\n\022Targ" +
      "etSortProperty\022\013\n\007DEFAULT\020\000\022\r\n\tTARGET_ID" +
      "\020\001\022\017\n\013TARGET_NAME\020\002\022\020\n\014CREATED_TIME\020\003B\035B" +
      "\031TargetSortPropertyV1ProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.sia.common.GeoPointProto.getDescriptor(),
        });
    com.sia.common.GeoPointProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}