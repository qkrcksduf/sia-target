// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/common/MultiPolygon.proto

package com.sia.common;

public interface MultiPolygonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.sia.common.MultiPolygon)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
   */
  java.util.List<com.sia.common.Polygon> 
      getPolygonList();
  /**
   * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
   */
  com.sia.common.Polygon getPolygon(int index);
  /**
   * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
   */
  int getPolygonCount();
  /**
   * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
   */
  java.util.List<? extends com.sia.common.PolygonOrBuilder> 
      getPolygonOrBuilderList();
  /**
   * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
   */
  com.sia.common.PolygonOrBuilder getPolygonOrBuilder(
      int index);

  /**
   * <code>bytes wkb = 2;</code>
   * @return The wkb.
   */
  com.google.protobuf.ByteString getWkb();
}