// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/record/RecordFilterV1.proto

package com.sia.obision.target.v1.record;

public final class RecordFilterV1Proto {
  private RecordFilterV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sia_obision_target_v1_record_RecordFilterRequestV1_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sia_obision_target_v1_record_RecordFilterRequestV1_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sia_obision_target_v1_record_RecordFilterResponseV1_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sia_obision_target_v1_record_RecordFilterResponseV1_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5com/sia/obision/target/v1/record/Recor" +
      "dFilterV1.proto\022 com.sia.obision.target." +
      "v1.record\032#com/sia/common/TimestampRange" +
      ".proto\032\033com/sia/common/Paging.proto\032\"com" +
      "/sia/common/SortDirection.proto\0320com/sia" +
      "/obision/target/v1/FilterPropertyV1.prot" +
      "o\032;com/sia/obision/target/v1/record/Reco" +
      "rdSortPropertyV1.proto\032/com/sia/obision/" +
      "target/v1/record/RecordV1.proto\032;com/sia" +
      "/obision/target/v1/record/RecordSelectOp" +
      "tionV1.proto\"\326\002\n\025RecordFilterRequestV1\022A" +
      "\n\016filterProperty\030\001 \001(\0132).com.sia.obision" +
      ".target.v1.FilterProperty\022J\n\014selectOptio" +
      "n\030\002 \001(\01324.com.sia.obision.target.v1.reco" +
      "rd.RecordSelectOption\0224\n\rsortDirection\030\003" +
      " \001(\0162\035.com.sia.common.SortDirection\022P\n\022r" +
      "ecordSortProperty\030\004 \001(\01624.com.sia.obisio" +
      "n.target.v1.record.RecordSortProperty\022&\n" +
      "\006paging\030\005 \001(\0132\026.com.sia.common.Paging\"f\n" +
      "\026RecordFilterResponseV1\0228\n\006record\030\001 \003(\0132" +
      "(.com.sia.obision.target.v1.record.Recor" +
      "d\022\022\n\ntotalCount\030\002 \001(\005B\027B\023RecordFilterV1P" +
      "rotoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.sia.common.TimestampRangeProto.getDescriptor(),
          com.sia.common.PagingProto.getDescriptor(),
          com.sia.common.SortDirectionProto.getDescriptor(),
          com.sia.obision.target.v1.FilterPropertyV1Proto.getDescriptor(),
          com.sia.obision.target.v1.record.RecordSortPropertyV1Proto.getDescriptor(),
          com.sia.obision.target.v1.record.RecordV1Proto.getDescriptor(),
          com.sia.obision.target.v1.record.RecordSelectOptionV1Proto.getDescriptor(),
        });
    internal_static_com_sia_obision_target_v1_record_RecordFilterRequestV1_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sia_obision_target_v1_record_RecordFilterRequestV1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sia_obision_target_v1_record_RecordFilterRequestV1_descriptor,
        new java.lang.String[] { "FilterProperty", "SelectOption", "SortDirection", "RecordSortProperty", "Paging", });
    internal_static_com_sia_obision_target_v1_record_RecordFilterResponseV1_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_sia_obision_target_v1_record_RecordFilterResponseV1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sia_obision_target_v1_record_RecordFilterResponseV1_descriptor,
        new java.lang.String[] { "Record", "TotalCount", });
    com.sia.common.TimestampRangeProto.getDescriptor();
    com.sia.common.PagingProto.getDescriptor();
    com.sia.common.SortDirectionProto.getDescriptor();
    com.sia.obision.target.v1.FilterPropertyV1Proto.getDescriptor();
    com.sia.obision.target.v1.record.RecordSortPropertyV1Proto.getDescriptor();
    com.sia.obision.target.v1.record.RecordV1Proto.getDescriptor();
    com.sia.obision.target.v1.record.RecordSelectOptionV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
