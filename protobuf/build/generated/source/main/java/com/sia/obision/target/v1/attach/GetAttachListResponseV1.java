// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/attach/GetAttachListV1.proto

package com.sia.obision.target.v1.attach;

/**
 * Protobuf type {@code com.sia.obision.target.v1.attach.GetAttachListResponseV1}
 */
public final class GetAttachListResponseV1 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sia.obision.target.v1.attach.GetAttachListResponseV1)
    GetAttachListResponseV1OrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAttachListResponseV1.newBuilder() to construct.
  private GetAttachListResponseV1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAttachListResponseV1() {
    attach_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAttachListResponseV1();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAttachListResponseV1(
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
              attach_ = new java.util.ArrayList<com.sia.obision.target.v1.attach.Attach>();
              mutable_bitField0_ |= 0x00000001;
            }
            attach_.add(
                input.readMessage(com.sia.obision.target.v1.attach.Attach.parser(), extensionRegistry));
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
        attach_ = java.util.Collections.unmodifiableList(attach_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sia.obision.target.v1.attach.GetAttachListV1Proto.internal_static_com_sia_obision_target_v1_attach_GetAttachListResponseV1_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sia.obision.target.v1.attach.GetAttachListV1Proto.internal_static_com_sia_obision_target_v1_attach_GetAttachListResponseV1_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sia.obision.target.v1.attach.GetAttachListResponseV1.class, com.sia.obision.target.v1.attach.GetAttachListResponseV1.Builder.class);
  }

  public static final int ATTACH_FIELD_NUMBER = 1;
  private java.util.List<com.sia.obision.target.v1.attach.Attach> attach_;
  /**
   * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.sia.obision.target.v1.attach.Attach> getAttachList() {
    return attach_;
  }
  /**
   * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.sia.obision.target.v1.attach.AttachOrBuilder> 
      getAttachOrBuilderList() {
    return attach_;
  }
  /**
   * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
   */
  @java.lang.Override
  public int getAttachCount() {
    return attach_.size();
  }
  /**
   * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
   */
  @java.lang.Override
  public com.sia.obision.target.v1.attach.Attach getAttach(int index) {
    return attach_.get(index);
  }
  /**
   * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
   */
  @java.lang.Override
  public com.sia.obision.target.v1.attach.AttachOrBuilder getAttachOrBuilder(
      int index) {
    return attach_.get(index);
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
    for (int i = 0; i < attach_.size(); i++) {
      output.writeMessage(1, attach_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < attach_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, attach_.get(i));
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
    if (!(obj instanceof com.sia.obision.target.v1.attach.GetAttachListResponseV1)) {
      return super.equals(obj);
    }
    com.sia.obision.target.v1.attach.GetAttachListResponseV1 other = (com.sia.obision.target.v1.attach.GetAttachListResponseV1) obj;

    if (!getAttachList()
        .equals(other.getAttachList())) return false;
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
    if (getAttachCount() > 0) {
      hash = (37 * hash) + ATTACH_FIELD_NUMBER;
      hash = (53 * hash) + getAttachList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sia.obision.target.v1.attach.GetAttachListResponseV1 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.obision.target.v1.attach.GetAttachListResponseV1 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.obision.target.v1.attach.GetAttachListResponseV1 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.obision.target.v1.attach.GetAttachListResponseV1 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.obision.target.v1.attach.GetAttachListResponseV1 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.obision.target.v1.attach.GetAttachListResponseV1 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.obision.target.v1.attach.GetAttachListResponseV1 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sia.obision.target.v1.attach.GetAttachListResponseV1 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sia.obision.target.v1.attach.GetAttachListResponseV1 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sia.obision.target.v1.attach.GetAttachListResponseV1 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sia.obision.target.v1.attach.GetAttachListResponseV1 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sia.obision.target.v1.attach.GetAttachListResponseV1 parseFrom(
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
  public static Builder newBuilder(com.sia.obision.target.v1.attach.GetAttachListResponseV1 prototype) {
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
   * Protobuf type {@code com.sia.obision.target.v1.attach.GetAttachListResponseV1}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sia.obision.target.v1.attach.GetAttachListResponseV1)
      com.sia.obision.target.v1.attach.GetAttachListResponseV1OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sia.obision.target.v1.attach.GetAttachListV1Proto.internal_static_com_sia_obision_target_v1_attach_GetAttachListResponseV1_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sia.obision.target.v1.attach.GetAttachListV1Proto.internal_static_com_sia_obision_target_v1_attach_GetAttachListResponseV1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sia.obision.target.v1.attach.GetAttachListResponseV1.class, com.sia.obision.target.v1.attach.GetAttachListResponseV1.Builder.class);
    }

    // Construct using com.sia.obision.target.v1.attach.GetAttachListResponseV1.newBuilder()
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
        getAttachFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (attachBuilder_ == null) {
        attach_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        attachBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sia.obision.target.v1.attach.GetAttachListV1Proto.internal_static_com_sia_obision_target_v1_attach_GetAttachListResponseV1_descriptor;
    }

    @java.lang.Override
    public com.sia.obision.target.v1.attach.GetAttachListResponseV1 getDefaultInstanceForType() {
      return com.sia.obision.target.v1.attach.GetAttachListResponseV1.getDefaultInstance();
    }

    @java.lang.Override
    public com.sia.obision.target.v1.attach.GetAttachListResponseV1 build() {
      com.sia.obision.target.v1.attach.GetAttachListResponseV1 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sia.obision.target.v1.attach.GetAttachListResponseV1 buildPartial() {
      com.sia.obision.target.v1.attach.GetAttachListResponseV1 result = new com.sia.obision.target.v1.attach.GetAttachListResponseV1(this);
      int from_bitField0_ = bitField0_;
      if (attachBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          attach_ = java.util.Collections.unmodifiableList(attach_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.attach_ = attach_;
      } else {
        result.attach_ = attachBuilder_.build();
      }
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
      if (other instanceof com.sia.obision.target.v1.attach.GetAttachListResponseV1) {
        return mergeFrom((com.sia.obision.target.v1.attach.GetAttachListResponseV1)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sia.obision.target.v1.attach.GetAttachListResponseV1 other) {
      if (other == com.sia.obision.target.v1.attach.GetAttachListResponseV1.getDefaultInstance()) return this;
      if (attachBuilder_ == null) {
        if (!other.attach_.isEmpty()) {
          if (attach_.isEmpty()) {
            attach_ = other.attach_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAttachIsMutable();
            attach_.addAll(other.attach_);
          }
          onChanged();
        }
      } else {
        if (!other.attach_.isEmpty()) {
          if (attachBuilder_.isEmpty()) {
            attachBuilder_.dispose();
            attachBuilder_ = null;
            attach_ = other.attach_;
            bitField0_ = (bitField0_ & ~0x00000001);
            attachBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAttachFieldBuilder() : null;
          } else {
            attachBuilder_.addAllMessages(other.attach_);
          }
        }
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
      com.sia.obision.target.v1.attach.GetAttachListResponseV1 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sia.obision.target.v1.attach.GetAttachListResponseV1) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.sia.obision.target.v1.attach.Attach> attach_ =
      java.util.Collections.emptyList();
    private void ensureAttachIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        attach_ = new java.util.ArrayList<com.sia.obision.target.v1.attach.Attach>(attach_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sia.obision.target.v1.attach.Attach, com.sia.obision.target.v1.attach.Attach.Builder, com.sia.obision.target.v1.attach.AttachOrBuilder> attachBuilder_;

    /**
     * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
     */
    public java.util.List<com.sia.obision.target.v1.attach.Attach> getAttachList() {
      if (attachBuilder_ == null) {
        return java.util.Collections.unmodifiableList(attach_);
      } else {
        return attachBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
     */
    public int getAttachCount() {
      if (attachBuilder_ == null) {
        return attach_.size();
      } else {
        return attachBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
     */
    public com.sia.obision.target.v1.attach.Attach getAttach(int index) {
      if (attachBuilder_ == null) {
        return attach_.get(index);
      } else {
        return attachBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
     */
    public Builder setAttach(
        int index, com.sia.obision.target.v1.attach.Attach value) {
      if (attachBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttachIsMutable();
        attach_.set(index, value);
        onChanged();
      } else {
        attachBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
     */
    public Builder setAttach(
        int index, com.sia.obision.target.v1.attach.Attach.Builder builderForValue) {
      if (attachBuilder_ == null) {
        ensureAttachIsMutable();
        attach_.set(index, builderForValue.build());
        onChanged();
      } else {
        attachBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
     */
    public Builder addAttach(com.sia.obision.target.v1.attach.Attach value) {
      if (attachBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttachIsMutable();
        attach_.add(value);
        onChanged();
      } else {
        attachBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
     */
    public Builder addAttach(
        int index, com.sia.obision.target.v1.attach.Attach value) {
      if (attachBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttachIsMutable();
        attach_.add(index, value);
        onChanged();
      } else {
        attachBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
     */
    public Builder addAttach(
        com.sia.obision.target.v1.attach.Attach.Builder builderForValue) {
      if (attachBuilder_ == null) {
        ensureAttachIsMutable();
        attach_.add(builderForValue.build());
        onChanged();
      } else {
        attachBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
     */
    public Builder addAttach(
        int index, com.sia.obision.target.v1.attach.Attach.Builder builderForValue) {
      if (attachBuilder_ == null) {
        ensureAttachIsMutable();
        attach_.add(index, builderForValue.build());
        onChanged();
      } else {
        attachBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
     */
    public Builder addAllAttach(
        java.lang.Iterable<? extends com.sia.obision.target.v1.attach.Attach> values) {
      if (attachBuilder_ == null) {
        ensureAttachIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, attach_);
        onChanged();
      } else {
        attachBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
     */
    public Builder clearAttach() {
      if (attachBuilder_ == null) {
        attach_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        attachBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
     */
    public Builder removeAttach(int index) {
      if (attachBuilder_ == null) {
        ensureAttachIsMutable();
        attach_.remove(index);
        onChanged();
      } else {
        attachBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
     */
    public com.sia.obision.target.v1.attach.Attach.Builder getAttachBuilder(
        int index) {
      return getAttachFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
     */
    public com.sia.obision.target.v1.attach.AttachOrBuilder getAttachOrBuilder(
        int index) {
      if (attachBuilder_ == null) {
        return attach_.get(index);  } else {
        return attachBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
     */
    public java.util.List<? extends com.sia.obision.target.v1.attach.AttachOrBuilder> 
         getAttachOrBuilderList() {
      if (attachBuilder_ != null) {
        return attachBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(attach_);
      }
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
     */
    public com.sia.obision.target.v1.attach.Attach.Builder addAttachBuilder() {
      return getAttachFieldBuilder().addBuilder(
          com.sia.obision.target.v1.attach.Attach.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
     */
    public com.sia.obision.target.v1.attach.Attach.Builder addAttachBuilder(
        int index) {
      return getAttachFieldBuilder().addBuilder(
          index, com.sia.obision.target.v1.attach.Attach.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.attach.Attach attach = 1;</code>
     */
    public java.util.List<com.sia.obision.target.v1.attach.Attach.Builder> 
         getAttachBuilderList() {
      return getAttachFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sia.obision.target.v1.attach.Attach, com.sia.obision.target.v1.attach.Attach.Builder, com.sia.obision.target.v1.attach.AttachOrBuilder> 
        getAttachFieldBuilder() {
      if (attachBuilder_ == null) {
        attachBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.sia.obision.target.v1.attach.Attach, com.sia.obision.target.v1.attach.Attach.Builder, com.sia.obision.target.v1.attach.AttachOrBuilder>(
                attach_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        attach_ = null;
      }
      return attachBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.sia.obision.target.v1.attach.GetAttachListResponseV1)
  }

  // @@protoc_insertion_point(class_scope:com.sia.obision.target.v1.attach.GetAttachListResponseV1)
  private static final com.sia.obision.target.v1.attach.GetAttachListResponseV1 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sia.obision.target.v1.attach.GetAttachListResponseV1();
  }

  public static com.sia.obision.target.v1.attach.GetAttachListResponseV1 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAttachListResponseV1>
      PARSER = new com.google.protobuf.AbstractParser<GetAttachListResponseV1>() {
    @java.lang.Override
    public GetAttachListResponseV1 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAttachListResponseV1(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAttachListResponseV1> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAttachListResponseV1> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sia.obision.target.v1.attach.GetAttachListResponseV1 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

