// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/target/TargetSearchV1.proto

package com.sia.obision.target.v1.target;

/**
 * Protobuf type {@code com.sia.obision.target.v1.target.TargetSearchResponseV1}
 */
public final class TargetSearchResponseV1 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sia.obision.target.v1.target.TargetSearchResponseV1)
    TargetSearchResponseV1OrBuilder {
private static final long serialVersionUID = 0L;
  // Use TargetSearchResponseV1.newBuilder() to construct.
  private TargetSearchResponseV1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TargetSearchResponseV1() {
    target_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TargetSearchResponseV1();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TargetSearchResponseV1(
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
              target_ = new java.util.ArrayList<com.sia.obision.target.v1.target.Target>();
              mutable_bitField0_ |= 0x00000001;
            }
            target_.add(
                input.readMessage(com.sia.obision.target.v1.target.Target.parser(), extensionRegistry));
            break;
          }
          case 16: {

            totalCount_ = input.readInt32();
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
        target_ = java.util.Collections.unmodifiableList(target_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sia.obision.target.v1.target.TargetSearchV1Proto.internal_static_com_sia_obision_target_v1_target_TargetSearchResponseV1_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sia.obision.target.v1.target.TargetSearchV1Proto.internal_static_com_sia_obision_target_v1_target_TargetSearchResponseV1_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sia.obision.target.v1.target.TargetSearchResponseV1.class, com.sia.obision.target.v1.target.TargetSearchResponseV1.Builder.class);
  }

  public static final int TARGET_FIELD_NUMBER = 1;
  private java.util.List<com.sia.obision.target.v1.target.Target> target_;
  /**
   * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.sia.obision.target.v1.target.Target> getTargetList() {
    return target_;
  }
  /**
   * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.sia.obision.target.v1.target.TargetOrBuilder> 
      getTargetOrBuilderList() {
    return target_;
  }
  /**
   * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
   */
  @java.lang.Override
  public int getTargetCount() {
    return target_.size();
  }
  /**
   * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
   */
  @java.lang.Override
  public com.sia.obision.target.v1.target.Target getTarget(int index) {
    return target_.get(index);
  }
  /**
   * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
   */
  @java.lang.Override
  public com.sia.obision.target.v1.target.TargetOrBuilder getTargetOrBuilder(
      int index) {
    return target_.get(index);
  }

  public static final int TOTALCOUNT_FIELD_NUMBER = 2;
  private int totalCount_;
  /**
   * <code>int32 totalCount = 2;</code>
   * @return The totalCount.
   */
  @java.lang.Override
  public int getTotalCount() {
    return totalCount_;
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
    for (int i = 0; i < target_.size(); i++) {
      output.writeMessage(1, target_.get(i));
    }
    if (totalCount_ != 0) {
      output.writeInt32(2, totalCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < target_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, target_.get(i));
    }
    if (totalCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, totalCount_);
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
    if (!(obj instanceof com.sia.obision.target.v1.target.TargetSearchResponseV1)) {
      return super.equals(obj);
    }
    com.sia.obision.target.v1.target.TargetSearchResponseV1 other = (com.sia.obision.target.v1.target.TargetSearchResponseV1) obj;

    if (!getTargetList()
        .equals(other.getTargetList())) return false;
    if (getTotalCount()
        != other.getTotalCount()) return false;
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
    if (getTargetCount() > 0) {
      hash = (37 * hash) + TARGET_FIELD_NUMBER;
      hash = (53 * hash) + getTargetList().hashCode();
    }
    hash = (37 * hash) + TOTALCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getTotalCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sia.obision.target.v1.target.TargetSearchResponseV1 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.obision.target.v1.target.TargetSearchResponseV1 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.obision.target.v1.target.TargetSearchResponseV1 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.obision.target.v1.target.TargetSearchResponseV1 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.obision.target.v1.target.TargetSearchResponseV1 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.obision.target.v1.target.TargetSearchResponseV1 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.obision.target.v1.target.TargetSearchResponseV1 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sia.obision.target.v1.target.TargetSearchResponseV1 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sia.obision.target.v1.target.TargetSearchResponseV1 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sia.obision.target.v1.target.TargetSearchResponseV1 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sia.obision.target.v1.target.TargetSearchResponseV1 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sia.obision.target.v1.target.TargetSearchResponseV1 parseFrom(
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
  public static Builder newBuilder(com.sia.obision.target.v1.target.TargetSearchResponseV1 prototype) {
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
   * Protobuf type {@code com.sia.obision.target.v1.target.TargetSearchResponseV1}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sia.obision.target.v1.target.TargetSearchResponseV1)
      com.sia.obision.target.v1.target.TargetSearchResponseV1OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sia.obision.target.v1.target.TargetSearchV1Proto.internal_static_com_sia_obision_target_v1_target_TargetSearchResponseV1_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sia.obision.target.v1.target.TargetSearchV1Proto.internal_static_com_sia_obision_target_v1_target_TargetSearchResponseV1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sia.obision.target.v1.target.TargetSearchResponseV1.class, com.sia.obision.target.v1.target.TargetSearchResponseV1.Builder.class);
    }

    // Construct using com.sia.obision.target.v1.target.TargetSearchResponseV1.newBuilder()
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
        getTargetFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (targetBuilder_ == null) {
        target_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        targetBuilder_.clear();
      }
      totalCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sia.obision.target.v1.target.TargetSearchV1Proto.internal_static_com_sia_obision_target_v1_target_TargetSearchResponseV1_descriptor;
    }

    @java.lang.Override
    public com.sia.obision.target.v1.target.TargetSearchResponseV1 getDefaultInstanceForType() {
      return com.sia.obision.target.v1.target.TargetSearchResponseV1.getDefaultInstance();
    }

    @java.lang.Override
    public com.sia.obision.target.v1.target.TargetSearchResponseV1 build() {
      com.sia.obision.target.v1.target.TargetSearchResponseV1 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sia.obision.target.v1.target.TargetSearchResponseV1 buildPartial() {
      com.sia.obision.target.v1.target.TargetSearchResponseV1 result = new com.sia.obision.target.v1.target.TargetSearchResponseV1(this);
      int from_bitField0_ = bitField0_;
      if (targetBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          target_ = java.util.Collections.unmodifiableList(target_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.target_ = target_;
      } else {
        result.target_ = targetBuilder_.build();
      }
      result.totalCount_ = totalCount_;
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
      if (other instanceof com.sia.obision.target.v1.target.TargetSearchResponseV1) {
        return mergeFrom((com.sia.obision.target.v1.target.TargetSearchResponseV1)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sia.obision.target.v1.target.TargetSearchResponseV1 other) {
      if (other == com.sia.obision.target.v1.target.TargetSearchResponseV1.getDefaultInstance()) return this;
      if (targetBuilder_ == null) {
        if (!other.target_.isEmpty()) {
          if (target_.isEmpty()) {
            target_ = other.target_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTargetIsMutable();
            target_.addAll(other.target_);
          }
          onChanged();
        }
      } else {
        if (!other.target_.isEmpty()) {
          if (targetBuilder_.isEmpty()) {
            targetBuilder_.dispose();
            targetBuilder_ = null;
            target_ = other.target_;
            bitField0_ = (bitField0_ & ~0x00000001);
            targetBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTargetFieldBuilder() : null;
          } else {
            targetBuilder_.addAllMessages(other.target_);
          }
        }
      }
      if (other.getTotalCount() != 0) {
        setTotalCount(other.getTotalCount());
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
      com.sia.obision.target.v1.target.TargetSearchResponseV1 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sia.obision.target.v1.target.TargetSearchResponseV1) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.sia.obision.target.v1.target.Target> target_ =
      java.util.Collections.emptyList();
    private void ensureTargetIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        target_ = new java.util.ArrayList<com.sia.obision.target.v1.target.Target>(target_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sia.obision.target.v1.target.Target, com.sia.obision.target.v1.target.Target.Builder, com.sia.obision.target.v1.target.TargetOrBuilder> targetBuilder_;

    /**
     * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
     */
    public java.util.List<com.sia.obision.target.v1.target.Target> getTargetList() {
      if (targetBuilder_ == null) {
        return java.util.Collections.unmodifiableList(target_);
      } else {
        return targetBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
     */
    public int getTargetCount() {
      if (targetBuilder_ == null) {
        return target_.size();
      } else {
        return targetBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
     */
    public com.sia.obision.target.v1.target.Target getTarget(int index) {
      if (targetBuilder_ == null) {
        return target_.get(index);
      } else {
        return targetBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
     */
    public Builder setTarget(
        int index, com.sia.obision.target.v1.target.Target value) {
      if (targetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetIsMutable();
        target_.set(index, value);
        onChanged();
      } else {
        targetBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
     */
    public Builder setTarget(
        int index, com.sia.obision.target.v1.target.Target.Builder builderForValue) {
      if (targetBuilder_ == null) {
        ensureTargetIsMutable();
        target_.set(index, builderForValue.build());
        onChanged();
      } else {
        targetBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
     */
    public Builder addTarget(com.sia.obision.target.v1.target.Target value) {
      if (targetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetIsMutable();
        target_.add(value);
        onChanged();
      } else {
        targetBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
     */
    public Builder addTarget(
        int index, com.sia.obision.target.v1.target.Target value) {
      if (targetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetIsMutable();
        target_.add(index, value);
        onChanged();
      } else {
        targetBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
     */
    public Builder addTarget(
        com.sia.obision.target.v1.target.Target.Builder builderForValue) {
      if (targetBuilder_ == null) {
        ensureTargetIsMutable();
        target_.add(builderForValue.build());
        onChanged();
      } else {
        targetBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
     */
    public Builder addTarget(
        int index, com.sia.obision.target.v1.target.Target.Builder builderForValue) {
      if (targetBuilder_ == null) {
        ensureTargetIsMutable();
        target_.add(index, builderForValue.build());
        onChanged();
      } else {
        targetBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
     */
    public Builder addAllTarget(
        java.lang.Iterable<? extends com.sia.obision.target.v1.target.Target> values) {
      if (targetBuilder_ == null) {
        ensureTargetIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, target_);
        onChanged();
      } else {
        targetBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
     */
    public Builder clearTarget() {
      if (targetBuilder_ == null) {
        target_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        targetBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
     */
    public Builder removeTarget(int index) {
      if (targetBuilder_ == null) {
        ensureTargetIsMutable();
        target_.remove(index);
        onChanged();
      } else {
        targetBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
     */
    public com.sia.obision.target.v1.target.Target.Builder getTargetBuilder(
        int index) {
      return getTargetFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
     */
    public com.sia.obision.target.v1.target.TargetOrBuilder getTargetOrBuilder(
        int index) {
      if (targetBuilder_ == null) {
        return target_.get(index);  } else {
        return targetBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
     */
    public java.util.List<? extends com.sia.obision.target.v1.target.TargetOrBuilder> 
         getTargetOrBuilderList() {
      if (targetBuilder_ != null) {
        return targetBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(target_);
      }
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
     */
    public com.sia.obision.target.v1.target.Target.Builder addTargetBuilder() {
      return getTargetFieldBuilder().addBuilder(
          com.sia.obision.target.v1.target.Target.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
     */
    public com.sia.obision.target.v1.target.Target.Builder addTargetBuilder(
        int index) {
      return getTargetFieldBuilder().addBuilder(
          index, com.sia.obision.target.v1.target.Target.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.target.Target target = 1;</code>
     */
    public java.util.List<com.sia.obision.target.v1.target.Target.Builder> 
         getTargetBuilderList() {
      return getTargetFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sia.obision.target.v1.target.Target, com.sia.obision.target.v1.target.Target.Builder, com.sia.obision.target.v1.target.TargetOrBuilder> 
        getTargetFieldBuilder() {
      if (targetBuilder_ == null) {
        targetBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.sia.obision.target.v1.target.Target, com.sia.obision.target.v1.target.Target.Builder, com.sia.obision.target.v1.target.TargetOrBuilder>(
                target_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        target_ = null;
      }
      return targetBuilder_;
    }

    private int totalCount_ ;
    /**
     * <code>int32 totalCount = 2;</code>
     * @return The totalCount.
     */
    @java.lang.Override
    public int getTotalCount() {
      return totalCount_;
    }
    /**
     * <code>int32 totalCount = 2;</code>
     * @param value The totalCount to set.
     * @return This builder for chaining.
     */
    public Builder setTotalCount(int value) {
      
      totalCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 totalCount = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalCount() {
      
      totalCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.sia.obision.target.v1.target.TargetSearchResponseV1)
  }

  // @@protoc_insertion_point(class_scope:com.sia.obision.target.v1.target.TargetSearchResponseV1)
  private static final com.sia.obision.target.v1.target.TargetSearchResponseV1 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sia.obision.target.v1.target.TargetSearchResponseV1();
  }

  public static com.sia.obision.target.v1.target.TargetSearchResponseV1 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetSearchResponseV1>
      PARSER = new com.google.protobuf.AbstractParser<TargetSearchResponseV1>() {
    @java.lang.Override
    public TargetSearchResponseV1 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TargetSearchResponseV1(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TargetSearchResponseV1> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetSearchResponseV1> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sia.obision.target.v1.target.TargetSearchResponseV1 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
