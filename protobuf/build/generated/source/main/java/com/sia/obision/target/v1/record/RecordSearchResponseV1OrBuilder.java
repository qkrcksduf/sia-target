// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/record/RecordSearchV1.proto

package com.sia.obision.target.v1.record;

public interface RecordSearchResponseV1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.sia.obision.target.v1.record.RecordSearchResponseV1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.sia.obision.target.v1.record.Record record = 1;</code>
   */
  java.util.List<com.sia.obision.target.v1.record.Record> 
      getRecordList();
  /**
   * <code>repeated .com.sia.obision.target.v1.record.Record record = 1;</code>
   */
  com.sia.obision.target.v1.record.Record getRecord(int index);
  /**
   * <code>repeated .com.sia.obision.target.v1.record.Record record = 1;</code>
   */
  int getRecordCount();
  /**
   * <code>repeated .com.sia.obision.target.v1.record.Record record = 1;</code>
   */
  java.util.List<? extends com.sia.obision.target.v1.record.RecordOrBuilder> 
      getRecordOrBuilderList();
  /**
   * <code>repeated .com.sia.obision.target.v1.record.Record record = 1;</code>
   */
  com.sia.obision.target.v1.record.RecordOrBuilder getRecordOrBuilder(
      int index);

  /**
   * <code>int32 totalCount = 2;</code>
   * @return The totalCount.
   */
  int getTotalCount();
}
