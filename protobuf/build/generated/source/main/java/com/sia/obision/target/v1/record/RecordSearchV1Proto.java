// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/record/RecordSearchV1.proto

package com.sia.obision.target.v1.record;

public final class RecordSearchV1Proto {
  private RecordSearchV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sia_obision_target_v1_record_RecordSearchRequestV1_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sia_obision_target_v1_record_RecordSearchRequestV1_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sia_obision_target_v1_record_RecordSearchResponseV1_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sia_obision_target_v1_record_RecordSearchResponseV1_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sia_obision_target_v1_record_RecordSearchProperty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sia_obision_target_v1_record_RecordSearchProperty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5com/sia/obision/target/v1/record/Recor" +
      "dSearchV1.proto\022 com.sia.obision.target." +
      "v1.record\032;com/sia/obision/target/v1/rec" +
      "ord/RecordSelectOptionV1.proto\032;com/sia/" +
      "obision/target/v1/record/RecordSortPrope" +
      "rtyV1.proto\032/com/sia/obision/target/v1/r" +
      "ecord/RecordV1.proto\032\"com/sia/common/Sor" +
      "tDirection.proto\032\033com/sia/common/Paging." +
      "proto\"\343\002\n\025RecordSearchRequestV1\022N\n\016searc" +
      "hProperty\030\001 \001(\01326.com.sia.obision.target" +
      ".v1.record.RecordSearchProperty\022J\n\014selec" +
      "tOption\030\002 \001(\01324.com.sia.obision.target.v" +
      "1.record.RecordSelectOption\0224\n\rsortDirec" +
      "tion\030\003 \001(\0162\035.com.sia.common.SortDirectio" +
      "n\022P\n\022recordSortProperty\030\004 \001(\01624.com.sia." +
      "obision.target.v1.record.RecordSortPrope" +
      "rty\022&\n\006paging\030\005 \001(\0132\026.com.sia.common.Pag" +
      "ing\"f\n\026RecordSearchResponseV1\0228\n\006record\030" +
      "\001 \003(\0132(.com.sia.obision.target.v1.record" +
      ".Record\022\022\n\ntotalCount\030\002 \001(\005\"M\n\024RecordSea" +
      "rchProperty\022\022\n\ntargetName\030\001 \001(\t\022\017\n\007creat" +
      "or\030\002 \001(\t\022\020\n\010contents\030\003 \001(\tB\027B\023RecordSear" +
      "chV1ProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.sia.obision.target.v1.record.RecordSelectOptionV1Proto.getDescriptor(),
          com.sia.obision.target.v1.record.RecordSortPropertyV1Proto.getDescriptor(),
          com.sia.obision.target.v1.record.RecordV1Proto.getDescriptor(),
          com.sia.common.SortDirectionProto.getDescriptor(),
          com.sia.common.PagingProto.getDescriptor(),
        });
    internal_static_com_sia_obision_target_v1_record_RecordSearchRequestV1_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sia_obision_target_v1_record_RecordSearchRequestV1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sia_obision_target_v1_record_RecordSearchRequestV1_descriptor,
        new java.lang.String[] { "SearchProperty", "SelectOption", "SortDirection", "RecordSortProperty", "Paging", });
    internal_static_com_sia_obision_target_v1_record_RecordSearchResponseV1_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_sia_obision_target_v1_record_RecordSearchResponseV1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sia_obision_target_v1_record_RecordSearchResponseV1_descriptor,
        new java.lang.String[] { "Record", "TotalCount", });
    internal_static_com_sia_obision_target_v1_record_RecordSearchProperty_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_sia_obision_target_v1_record_RecordSearchProperty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sia_obision_target_v1_record_RecordSearchProperty_descriptor,
        new java.lang.String[] { "TargetName", "Creator", "Contents", });
    com.sia.obision.target.v1.record.RecordSelectOptionV1Proto.getDescriptor();
    com.sia.obision.target.v1.record.RecordSortPropertyV1Proto.getDescriptor();
    com.sia.obision.target.v1.record.RecordV1Proto.getDescriptor();
    com.sia.common.SortDirectionProto.getDescriptor();
    com.sia.common.PagingProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}