// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/record/RecordEmergencyV1.proto

package com.sia.obision.target.v1.record;

public final class RecordEmergencyV1Proto {
  private RecordEmergencyV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sia_obision_target_v1_record_RecordEmergencyRequestV1_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sia_obision_target_v1_record_RecordEmergencyRequestV1_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8com/sia/obision/target/v1/record/Recor" +
      "dEmergencyV1.proto\022 com.sia.obision.targ" +
      "et.v1.record\"A\n\030RecordEmergencyRequestV1" +
      "\022\020\n\010recordId\030\001 \001(\t\022\023\n\013isEmergency\030\002 \001(\010B" +
      "\032B\026RecordEmergencyV1ProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_sia_obision_target_v1_record_RecordEmergencyRequestV1_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sia_obision_target_v1_record_RecordEmergencyRequestV1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sia_obision_target_v1_record_RecordEmergencyRequestV1_descriptor,
        new java.lang.String[] { "RecordId", "IsEmergency", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
