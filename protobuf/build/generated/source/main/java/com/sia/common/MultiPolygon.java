// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/common/MultiPolygon.proto

package com.sia.common;

/**
 * Protobuf type {@code com.sia.common.MultiPolygon}
 */
public final class MultiPolygon extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sia.common.MultiPolygon)
    MultiPolygonOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiPolygon.newBuilder() to construct.
  private MultiPolygon(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiPolygon() {
    polygon_ = java.util.Collections.emptyList();
    wkb_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultiPolygon();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MultiPolygon(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              polygon_ = new java.util.ArrayList<com.sia.common.Polygon>();
              mutable_bitField0_ |= 0x00000001;
            }
            polygon_.add(
                input.readMessage(com.sia.common.Polygon.parser(), extensionRegistry));
            break;
          }
          case 18: {

            wkb_ = input.readBytes();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        polygon_ = java.util.Collections.unmodifiableList(polygon_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sia.common.MultiPolygonProto.internal_static_com_sia_common_MultiPolygon_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sia.common.MultiPolygonProto.internal_static_com_sia_common_MultiPolygon_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sia.common.MultiPolygon.class, com.sia.common.MultiPolygon.Builder.class);
  }

  public static final int POLYGON_FIELD_NUMBER = 1;
  private java.util.List<com.sia.common.Polygon> polygon_;
  /**
   * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.sia.common.Polygon> getPolygonList() {
    return polygon_;
  }
  /**
   * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.sia.common.PolygonOrBuilder> 
      getPolygonOrBuilderList() {
    return polygon_;
  }
  /**
   * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
   */
  @java.lang.Override
  public int getPolygonCount() {
    return polygon_.size();
  }
  /**
   * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
   */
  @java.lang.Override
  public com.sia.common.Polygon getPolygon(int index) {
    return polygon_.get(index);
  }
  /**
   * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
   */
  @java.lang.Override
  public com.sia.common.PolygonOrBuilder getPolygonOrBuilder(
      int index) {
    return polygon_.get(index);
  }

  public static final int WKB_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString wkb_;
  /**
   * <code>bytes wkb = 2;</code>
   * @return The wkb.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getWkb() {
    return wkb_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < polygon_.size(); i++) {
      output.writeMessage(1, polygon_.get(i));
    }
    if (!wkb_.isEmpty()) {
      output.writeBytes(2, wkb_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < polygon_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, polygon_.get(i));
    }
    if (!wkb_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, wkb_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.sia.common.MultiPolygon)) {
      return super.equals(obj);
    }
    com.sia.common.MultiPolygon other = (com.sia.common.MultiPolygon) obj;

    if (!getPolygonList()
        .equals(other.getPolygonList())) return false;
    if (!getWkb()
        .equals(other.getWkb())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getPolygonCount() > 0) {
      hash = (37 * hash) + POLYGON_FIELD_NUMBER;
      hash = (53 * hash) + getPolygonList().hashCode();
    }
    hash = (37 * hash) + WKB_FIELD_NUMBER;
    hash = (53 * hash) + getWkb().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sia.common.MultiPolygon parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.common.MultiPolygon parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.common.MultiPolygon parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.common.MultiPolygon parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.common.MultiPolygon parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.common.MultiPolygon parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.common.MultiPolygon parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sia.common.MultiPolygon parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sia.common.MultiPolygon parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sia.common.MultiPolygon parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sia.common.MultiPolygon parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sia.common.MultiPolygon parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.sia.common.MultiPolygon prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.sia.common.MultiPolygon}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sia.common.MultiPolygon)
      com.sia.common.MultiPolygonOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sia.common.MultiPolygonProto.internal_static_com_sia_common_MultiPolygon_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sia.common.MultiPolygonProto.internal_static_com_sia_common_MultiPolygon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sia.common.MultiPolygon.class, com.sia.common.MultiPolygon.Builder.class);
    }

    // Construct using com.sia.common.MultiPolygon.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getPolygonFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (polygonBuilder_ == null) {
        polygon_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        polygonBuilder_.clear();
      }
      wkb_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sia.common.MultiPolygonProto.internal_static_com_sia_common_MultiPolygon_descriptor;
    }

    @java.lang.Override
    public com.sia.common.MultiPolygon getDefaultInstanceForType() {
      return com.sia.common.MultiPolygon.getDefaultInstance();
    }

    @java.lang.Override
    public com.sia.common.MultiPolygon build() {
      com.sia.common.MultiPolygon result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sia.common.MultiPolygon buildPartial() {
      com.sia.common.MultiPolygon result = new com.sia.common.MultiPolygon(this);
      int from_bitField0_ = bitField0_;
      if (polygonBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          polygon_ = java.util.Collections.unmodifiableList(polygon_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.polygon_ = polygon_;
      } else {
        result.polygon_ = polygonBuilder_.build();
      }
      result.wkb_ = wkb_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.sia.common.MultiPolygon) {
        return mergeFrom((com.sia.common.MultiPolygon)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sia.common.MultiPolygon other) {
      if (other == com.sia.common.MultiPolygon.getDefaultInstance()) return this;
      if (polygonBuilder_ == null) {
        if (!other.polygon_.isEmpty()) {
          if (polygon_.isEmpty()) {
            polygon_ = other.polygon_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePolygonIsMutable();
            polygon_.addAll(other.polygon_);
          }
          onChanged();
        }
      } else {
        if (!other.polygon_.isEmpty()) {
          if (polygonBuilder_.isEmpty()) {
            polygonBuilder_.dispose();
            polygonBuilder_ = null;
            polygon_ = other.polygon_;
            bitField0_ = (bitField0_ & ~0x00000001);
            polygonBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPolygonFieldBuilder() : null;
          } else {
            polygonBuilder_.addAllMessages(other.polygon_);
          }
        }
      }
      if (other.getWkb() != com.google.protobuf.ByteString.EMPTY) {
        setWkb(other.getWkb());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.sia.common.MultiPolygon parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sia.common.MultiPolygon) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.sia.common.Polygon> polygon_ =
      java.util.Collections.emptyList();
    private void ensurePolygonIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        polygon_ = new java.util.ArrayList<com.sia.common.Polygon>(polygon_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sia.common.Polygon, com.sia.common.Polygon.Builder, com.sia.common.PolygonOrBuilder> polygonBuilder_;

    /**
     * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
     */
    public java.util.List<com.sia.common.Polygon> getPolygonList() {
      if (polygonBuilder_ == null) {
        return java.util.Collections.unmodifiableList(polygon_);
      } else {
        return polygonBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
     */
    public int getPolygonCount() {
      if (polygonBuilder_ == null) {
        return polygon_.size();
      } else {
        return polygonBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
     */
    public com.sia.common.Polygon getPolygon(int index) {
      if (polygonBuilder_ == null) {
        return polygon_.get(index);
      } else {
        return polygonBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
     */
    public Builder setPolygon(
        int index, com.sia.common.Polygon value) {
      if (polygonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolygonIsMutable();
        polygon_.set(index, value);
        onChanged();
      } else {
        polygonBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
     */
    public Builder setPolygon(
        int index, com.sia.common.Polygon.Builder builderForValue) {
      if (polygonBuilder_ == null) {
        ensurePolygonIsMutable();
        polygon_.set(index, builderForValue.build());
        onChanged();
      } else {
        polygonBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
     */
    public Builder addPolygon(com.sia.common.Polygon value) {
      if (polygonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolygonIsMutable();
        polygon_.add(value);
        onChanged();
      } else {
        polygonBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
     */
    public Builder addPolygon(
        int index, com.sia.common.Polygon value) {
      if (polygonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolygonIsMutable();
        polygon_.add(index, value);
        onChanged();
      } else {
        polygonBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
     */
    public Builder addPolygon(
        com.sia.common.Polygon.Builder builderForValue) {
      if (polygonBuilder_ == null) {
        ensurePolygonIsMutable();
        polygon_.add(builderForValue.build());
        onChanged();
      } else {
        polygonBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
     */
    public Builder addPolygon(
        int index, com.sia.common.Polygon.Builder builderForValue) {
      if (polygonBuilder_ == null) {
        ensurePolygonIsMutable();
        polygon_.add(index, builderForValue.build());
        onChanged();
      } else {
        polygonBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
     */
    public Builder addAllPolygon(
        java.lang.Iterable<? extends com.sia.common.Polygon> values) {
      if (polygonBuilder_ == null) {
        ensurePolygonIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, polygon_);
        onChanged();
      } else {
        polygonBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
     */
    public Builder clearPolygon() {
      if (polygonBuilder_ == null) {
        polygon_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        polygonBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
     */
    public Builder removePolygon(int index) {
      if (polygonBuilder_ == null) {
        ensurePolygonIsMutable();
        polygon_.remove(index);
        onChanged();
      } else {
        polygonBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
     */
    public com.sia.common.Polygon.Builder getPolygonBuilder(
        int index) {
      return getPolygonFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
     */
    public com.sia.common.PolygonOrBuilder getPolygonOrBuilder(
        int index) {
      if (polygonBuilder_ == null) {
        return polygon_.get(index);  } else {
        return polygonBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
     */
    public java.util.List<? extends com.sia.common.PolygonOrBuilder> 
         getPolygonOrBuilderList() {
      if (polygonBuilder_ != null) {
        return polygonBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(polygon_);
      }
    }
    /**
     * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
     */
    public com.sia.common.Polygon.Builder addPolygonBuilder() {
      return getPolygonFieldBuilder().addBuilder(
          com.sia.common.Polygon.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
     */
    public com.sia.common.Polygon.Builder addPolygonBuilder(
        int index) {
      return getPolygonFieldBuilder().addBuilder(
          index, com.sia.common.Polygon.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sia.common.Polygon polygon = 1;</code>
     */
    public java.util.List<com.sia.common.Polygon.Builder> 
         getPolygonBuilderList() {
      return getPolygonFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sia.common.Polygon, com.sia.common.Polygon.Builder, com.sia.common.PolygonOrBuilder> 
        getPolygonFieldBuilder() {
      if (polygonBuilder_ == null) {
        polygonBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.sia.common.Polygon, com.sia.common.Polygon.Builder, com.sia.common.PolygonOrBuilder>(
                polygon_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        polygon_ = null;
      }
      return polygonBuilder_;
    }

    private com.google.protobuf.ByteString wkb_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes wkb = 2;</code>
     * @return The wkb.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getWkb() {
      return wkb_;
    }
    /**
     * <code>bytes wkb = 2;</code>
     * @param value The wkb to set.
     * @return This builder for chaining.
     */
    public Builder setWkb(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      wkb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes wkb = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWkb() {
      
      wkb_ = getDefaultInstance().getWkb();
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.sia.common.MultiPolygon)
  }

  // @@protoc_insertion_point(class_scope:com.sia.common.MultiPolygon)
  private static final com.sia.common.MultiPolygon DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sia.common.MultiPolygon();
  }

  public static com.sia.common.MultiPolygon getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiPolygon>
      PARSER = new com.google.protobuf.AbstractParser<MultiPolygon>() {
    @java.lang.Override
    public MultiPolygon parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MultiPolygon(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiPolygon> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiPolygon> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sia.common.MultiPolygon getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

