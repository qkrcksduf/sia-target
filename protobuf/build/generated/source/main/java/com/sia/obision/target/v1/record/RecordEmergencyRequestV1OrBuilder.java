// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/record/RecordEmergencyV1.proto

package com.sia.obision.target.v1.record;

public interface RecordEmergencyRequestV1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.sia.obision.target.v1.record.RecordEmergencyRequestV1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string recordId = 1;</code>
   * @return The recordId.
   */
  java.lang.String getRecordId();
  /**
   * <code>string recordId = 1;</code>
   * @return The bytes for recordId.
   */
  com.google.protobuf.ByteString
      getRecordIdBytes();

  /**
   * <code>bool isEmergency = 2;</code>
   * @return The isEmergency.
   */
  boolean getIsEmergency();
}