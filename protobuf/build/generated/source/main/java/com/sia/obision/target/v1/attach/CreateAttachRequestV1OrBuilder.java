// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/attach/CreateAttachV1.proto

package com.sia.obision.target.v1.attach;

public interface CreateAttachRequestV1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.sia.obision.target.v1.attach.CreateAttachRequestV1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.sia.common.UUID recordId = 1;</code>
   * @return Whether the recordId field is set.
   */
  boolean hasRecordId();
  /**
   * <code>.com.sia.common.UUID recordId = 1;</code>
   * @return The recordId.
   */
  com.sia.common.UUID getRecordId();
  /**
   * <code>.com.sia.common.UUID recordId = 1;</code>
   */
  com.sia.common.UUIDOrBuilder getRecordIdOrBuilder();

  /**
   * <code>bytes file = 2;</code>
   * @return The file.
   */
  com.google.protobuf.ByteString getFile();

  /**
   * <code>string fileName = 3;</code>
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   * <code>string fileName = 3;</code>
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString
      getFileNameBytes();

  /**
   * <code>int32 size = 4;</code>
   * @return The size.
   */
  int getSize();

  /**
   * <code>.com.sia.obision.target.v1.attach.FileExtension fileExtension = 5;</code>
   * @return The enum numeric value on the wire for fileExtension.
   */
  int getFileExtensionValue();
  /**
   * <code>.com.sia.obision.target.v1.attach.FileExtension fileExtension = 5;</code>
   * @return The fileExtension.
   */
  com.sia.obision.target.v1.attach.FileExtension getFileExtension();
}
