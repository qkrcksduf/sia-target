// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/attach/CreateAttachV1.proto

package com.sia.obision.target.v1.attach;

public final class CreateAttachV1Proto {
  private CreateAttachV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sia_obision_target_v1_attach_CreateAttachRequestV1_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sia_obision_target_v1_attach_CreateAttachRequestV1_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5com/sia/obision/target/v1/attach/Creat" +
      "eAttachV1.proto\022 com.sia.obision.target." +
      "v1.attach\032\031com/sia/common/UUID.proto\032/co" +
      "m/sia/obision/target/v1/attach/AttachV1." +
      "proto\"\265\001\n\025CreateAttachRequestV1\022&\n\010recor" +
      "dId\030\001 \001(\0132\024.com.sia.common.UUID\022\014\n\004file\030" +
      "\002 \001(\014\022\020\n\010fileName\030\003 \001(\t\022\014\n\004size\030\004 \001(\005\022F\n" +
      "\rfileExtension\030\005 \001(\0162/.com.sia.obision.t" +
      "arget.v1.attach.FileExtensionB\027B\023CreateA" +
      "ttachV1ProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.sia.common.UUIDProto.getDescriptor(),
          com.sia.obision.target.v1.attach.AttachV1Proto.getDescriptor(),
        });
    internal_static_com_sia_obision_target_v1_attach_CreateAttachRequestV1_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sia_obision_target_v1_attach_CreateAttachRequestV1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sia_obision_target_v1_attach_CreateAttachRequestV1_descriptor,
        new java.lang.String[] { "RecordId", "File", "FileName", "Size", "FileExtension", });
    com.sia.common.UUIDProto.getDescriptor();
    com.sia.obision.target.v1.attach.AttachV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
