// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/target/TargetFilterV1.proto

package com.sia.obision.target.v1.target;

public final class TargetFilterV1Proto {
  private TargetFilterV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sia_obision_target_v1_target_TargetFilterRequestV1_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sia_obision_target_v1_target_TargetFilterRequestV1_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sia_obision_target_v1_target_TargetFilterResponseV1_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sia_obision_target_v1_target_TargetFilterResponseV1_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5com/sia/obision/target/v1/target/Targe" +
      "tFilterV1.proto\022 com.sia.obision.target." +
      "v1.target\032\031com/sia/common/UUID.proto\032#co" +
      "m/sia/common/TimestampRange.proto\032\"com/s" +
      "ia/common/SortDirection.proto\032\033com/sia/c" +
      "ommon/Paging.proto\032/com/sia/obision/targ" +
      "et/v1/target/TargetV1.proto\032;com/sia/obi" +
      "sion/target/v1/target/TargetSortProperty" +
      "V1.proto\0320com/sia/obision/target/v1/Filt" +
      "erPropertyV1.proto\032;com/sia/obision/targ" +
      "et/v1/target/TargetSelectOptionV1.proto\"" +
      "\326\002\n\025TargetFilterRequestV1\022A\n\016filterPrope" +
      "rty\030\001 \001(\0132).com.sia.obision.target.v1.Fi" +
      "lterProperty\022J\n\014selectOption\030\002 \001(\01324.com" +
      ".sia.obision.target.v1.target.TargetSele" +
      "ctOption\0224\n\rsortDirection\030\003 \001(\0162\035.com.si" +
      "a.common.SortDirection\022P\n\022targetSortProp" +
      "erty\030\004 \001(\01624.com.sia.obision.target.v1.t" +
      "arget.TargetSortProperty\022&\n\006paging\030\005 \001(\013" +
      "2\026.com.sia.common.Paging\"f\n\026TargetFilter" +
      "ResponseV1\0228\n\006target\030\001 \003(\0132(.com.sia.obi" +
      "sion.target.v1.target.Target\022\022\n\ntotalCou" +
      "nt\030\002 \001(\005B\027B\023TargetFilterV1ProtoP\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.sia.common.UUIDProto.getDescriptor(),
          com.sia.common.TimestampRangeProto.getDescriptor(),
          com.sia.common.SortDirectionProto.getDescriptor(),
          com.sia.common.PagingProto.getDescriptor(),
          com.sia.obision.target.v1.target.TargetV1Proto.getDescriptor(),
          com.sia.obision.target.v1.target.TargetSortPropertyV1Proto.getDescriptor(),
          com.sia.obision.target.v1.FilterPropertyV1Proto.getDescriptor(),
          com.sia.obision.target.v1.target.TargetSelectOptionV1Proto.getDescriptor(),
        });
    internal_static_com_sia_obision_target_v1_target_TargetFilterRequestV1_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sia_obision_target_v1_target_TargetFilterRequestV1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sia_obision_target_v1_target_TargetFilterRequestV1_descriptor,
        new java.lang.String[] { "FilterProperty", "SelectOption", "SortDirection", "TargetSortProperty", "Paging", });
    internal_static_com_sia_obision_target_v1_target_TargetFilterResponseV1_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_sia_obision_target_v1_target_TargetFilterResponseV1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sia_obision_target_v1_target_TargetFilterResponseV1_descriptor,
        new java.lang.String[] { "Target", "TotalCount", });
    com.sia.common.UUIDProto.getDescriptor();
    com.sia.common.TimestampRangeProto.getDescriptor();
    com.sia.common.SortDirectionProto.getDescriptor();
    com.sia.common.PagingProto.getDescriptor();
    com.sia.obision.target.v1.target.TargetV1Proto.getDescriptor();
    com.sia.obision.target.v1.target.TargetSortPropertyV1Proto.getDescriptor();
    com.sia.obision.target.v1.FilterPropertyV1Proto.getDescriptor();
    com.sia.obision.target.v1.target.TargetSelectOptionV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
