// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/target/TargetFilterV1.proto

package com.sia.obision.target.v1.target;

public interface TargetFilterResponseV1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.sia.obision.target.v1.target.TargetFilterResponseV1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
   */
  java.util.List<com.sia.obision.target.v1.target.Target> 
      getTargetList();
  /**
   * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
   */
  com.sia.obision.target.v1.target.Target getTarget(int index);
  /**
   * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
   */
  int getTargetCount();
  /**
   * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
   */
  java.util.List<? extends com.sia.obision.target.v1.target.TargetOrBuilder> 
      getTargetOrBuilderList();
  /**
   * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
   */
  com.sia.obision.target.v1.target.TargetOrBuilder getTargetOrBuilder(
      int index);

  /**
   * <code>int32 totalCount = 2;</code>
   * @return The totalCount.
   */
  int getTotalCount();
}
