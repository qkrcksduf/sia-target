// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/AttachRouter.proto

package com.sia.obision.target;

public final class AttachRouterOuterClass {
  private AttachRouterOuterClass() {}
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
      "\n)com/sia/obision/target/AttachRouter.pr" +
      "oto\022\026com.sia.obision.target\0325com/sia/obi" +
      "sion/target/v1/attach/UploadAttachV1.pro" +
      "to\0327com/sia/obision/target/v1/attach/Dow" +
      "nloadAttachV1.proto\0325com/sia/obision/tar" +
      "get/v1/attach/DeleteAttachV1.proto\032\033goog" +
      "le/protobuf/empty.proto2\203\003\n\014AttachRouter" +
      "\022\203\001\n\014uploadAttach\0227.com.sia.obision.targ" +
      "et.v1.attach.UploadAttachRequestV1\0328.com" +
      ".sia.obision.target.v1.attach.UploadAtta" +
      "chResponseV1\"\000\022\211\001\n\016downloadAttach\0229.com." +
      "sia.obision.target.v1.attach.DownloadAtt" +
      "achRequestV1\032:.com.sia.obision.target.v1" +
      ".attach.DownloadAttachResponseV1\"\000\022a\n\014de" +
      "leteAttach\0227.com.sia.obision.target.v1.a" +
      "ttach.DeleteAttachRequestV1\032\026.google.pro" +
      "tobuf.Empty\"\000B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.sia.obision.target.v1.attach.UploadAttachV1Proto.getDescriptor(),
          com.sia.obision.target.v1.attach.DownloadAttachV1Proto.getDescriptor(),
          com.sia.obision.target.v1.attach.DeleteAttachV1Proto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    com.sia.obision.target.v1.attach.UploadAttachV1Proto.getDescriptor();
    com.sia.obision.target.v1.attach.DownloadAttachV1Proto.getDescriptor();
    com.sia.obision.target.v1.attach.DeleteAttachV1Proto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
