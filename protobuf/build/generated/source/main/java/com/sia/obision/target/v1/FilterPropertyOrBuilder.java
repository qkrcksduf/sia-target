// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/FilterPropertyV1.proto

package com.sia.obision.target.v1;

public interface FilterPropertyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.sia.obision.target.v1.FilterProperty)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.sia.common.UUID categoryId = 1;</code>
   */
  java.util.List<com.sia.common.UUID> 
      getCategoryIdList();
  /**
   * <code>repeated .com.sia.common.UUID categoryId = 1;</code>
   */
  com.sia.common.UUID getCategoryId(int index);
  /**
   * <code>repeated .com.sia.common.UUID categoryId = 1;</code>
   */
  int getCategoryIdCount();
  /**
   * <code>repeated .com.sia.common.UUID categoryId = 1;</code>
   */
  java.util.List<? extends com.sia.common.UUIDOrBuilder> 
      getCategoryIdOrBuilderList();
  /**
   * <code>repeated .com.sia.common.UUID categoryId = 1;</code>
   */
  com.sia.common.UUIDOrBuilder getCategoryIdOrBuilder(
      int index);

  /**
   * <code>.com.sia.common.TimestampRange timeRange = 2;</code>
   * @return Whether the timeRange field is set.
   */
  boolean hasTimeRange();
  /**
   * <code>.com.sia.common.TimestampRange timeRange = 2;</code>
   * @return The timeRange.
   */
  com.sia.common.TimestampRange getTimeRange();
  /**
   * <code>.com.sia.common.TimestampRange timeRange = 2;</code>
   */
  com.sia.common.TimestampRangeOrBuilder getTimeRangeOrBuilder();
}
