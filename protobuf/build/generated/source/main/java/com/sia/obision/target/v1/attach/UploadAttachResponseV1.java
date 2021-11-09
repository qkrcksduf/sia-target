// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/attach/UploadAttachV1.proto

package com.sia.obision.target.v1.attach;

/**
 * Protobuf type {@code com.sia.obision.target.v1.attach.UploadAttachResponseV1}
 */
public final class UploadAttachResponseV1 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sia.obision.target.v1.attach.UploadAttachResponseV1)
    UploadAttachResponseV1OrBuilder {
private static final long serialVersionUID = 0L;
  // Use UploadAttachResponseV1.newBuilder() to construct.
  private UploadAttachResponseV1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UploadAttachResponseV1() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UploadAttachResponseV1();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UploadAttachResponseV1(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            com.sia.common.UUID.Builder subBuilder = null;
            if (attachId_ != null) {
              subBuilder = attachId_.toBuilder();
            }
            attachId_ = input.readMessage(com.sia.common.UUID.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(attachId_);
              attachId_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sia.obision.target.v1.attach.UploadAttachV1Proto.internal_static_com_sia_obision_target_v1_attach_UploadAttachResponseV1_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sia.obision.target.v1.attach.UploadAttachV1Proto.internal_static_com_sia_obision_target_v1_attach_UploadAttachResponseV1_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sia.obision.target.v1.attach.UploadAttachResponseV1.class, com.sia.obision.target.v1.attach.UploadAttachResponseV1.Builder.class);
  }

  public static final int ATTACHID_FIELD_NUMBER = 1;
  private com.sia.common.UUID attachId_;
  /**
   * <code>.com.sia.common.UUID attachId = 1;</code>
   * @return Whether the attachId field is set.
   */
  @java.lang.Override
  public boolean hasAttachId() {
    return attachId_ != null;
  }
  /**
   * <code>.com.sia.common.UUID attachId = 1;</code>
   * @return The attachId.
   */
  @java.lang.Override
  public com.sia.common.UUID getAttachId() {
    return attachId_ == null ? com.sia.common.UUID.getDefaultInstance() : attachId_;
  }
  /**
   * <code>.com.sia.common.UUID attachId = 1;</code>
   */
  @java.lang.Override
  public com.sia.common.UUIDOrBuilder getAttachIdOrBuilder() {
    return getAttachId();
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
    if (attachId_ != null) {
      output.writeMessage(1, getAttachId());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (attachId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAttachId());
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
    if (!(obj instanceof com.sia.obision.target.v1.attach.UploadAttachResponseV1)) {
      return super.equals(obj);
    }
    com.sia.obision.target.v1.attach.UploadAttachResponseV1 other = (com.sia.obision.target.v1.attach.UploadAttachResponseV1) obj;

    if (hasAttachId() != other.hasAttachId()) return false;
    if (hasAttachId()) {
      if (!getAttachId()
          .equals(other.getAttachId())) return false;
    }
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
    if (hasAttachId()) {
      hash = (37 * hash) + ATTACHID_FIELD_NUMBER;
      hash = (53 * hash) + getAttachId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sia.obision.target.v1.attach.UploadAttachResponseV1 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.obision.target.v1.attach.UploadAttachResponseV1 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.obision.target.v1.attach.UploadAttachResponseV1 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.obision.target.v1.attach.UploadAttachResponseV1 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.obision.target.v1.attach.UploadAttachResponseV1 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.obision.target.v1.attach.UploadAttachResponseV1 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.obision.target.v1.attach.UploadAttachResponseV1 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sia.obision.target.v1.attach.UploadAttachResponseV1 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sia.obision.target.v1.attach.UploadAttachResponseV1 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sia.obision.target.v1.attach.UploadAttachResponseV1 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sia.obision.target.v1.attach.UploadAttachResponseV1 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sia.obision.target.v1.attach.UploadAttachResponseV1 parseFrom(
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
  public static Builder newBuilder(com.sia.obision.target.v1.attach.UploadAttachResponseV1 prototype) {
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
   * Protobuf type {@code com.sia.obision.target.v1.attach.UploadAttachResponseV1}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sia.obision.target.v1.attach.UploadAttachResponseV1)
      com.sia.obision.target.v1.attach.UploadAttachResponseV1OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sia.obision.target.v1.attach.UploadAttachV1Proto.internal_static_com_sia_obision_target_v1_attach_UploadAttachResponseV1_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sia.obision.target.v1.attach.UploadAttachV1Proto.internal_static_com_sia_obision_target_v1_attach_UploadAttachResponseV1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sia.obision.target.v1.attach.UploadAttachResponseV1.class, com.sia.obision.target.v1.attach.UploadAttachResponseV1.Builder.class);
    }

    // Construct using com.sia.obision.target.v1.attach.UploadAttachResponseV1.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (attachIdBuilder_ == null) {
        attachId_ = null;
      } else {
        attachId_ = null;
        attachIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sia.obision.target.v1.attach.UploadAttachV1Proto.internal_static_com_sia_obision_target_v1_attach_UploadAttachResponseV1_descriptor;
    }

    @java.lang.Override
    public com.sia.obision.target.v1.attach.UploadAttachResponseV1 getDefaultInstanceForType() {
      return com.sia.obision.target.v1.attach.UploadAttachResponseV1.getDefaultInstance();
    }

    @java.lang.Override
    public com.sia.obision.target.v1.attach.UploadAttachResponseV1 build() {
      com.sia.obision.target.v1.attach.UploadAttachResponseV1 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sia.obision.target.v1.attach.UploadAttachResponseV1 buildPartial() {
      com.sia.obision.target.v1.attach.UploadAttachResponseV1 result = new com.sia.obision.target.v1.attach.UploadAttachResponseV1(this);
      if (attachIdBuilder_ == null) {
        result.attachId_ = attachId_;
      } else {
        result.attachId_ = attachIdBuilder_.build();
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
      if (other instanceof com.sia.obision.target.v1.attach.UploadAttachResponseV1) {
        return mergeFrom((com.sia.obision.target.v1.attach.UploadAttachResponseV1)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sia.obision.target.v1.attach.UploadAttachResponseV1 other) {
      if (other == com.sia.obision.target.v1.attach.UploadAttachResponseV1.getDefaultInstance()) return this;
      if (other.hasAttachId()) {
        mergeAttachId(other.getAttachId());
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
      com.sia.obision.target.v1.attach.UploadAttachResponseV1 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sia.obision.target.v1.attach.UploadAttachResponseV1) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.sia.common.UUID attachId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.sia.common.UUID, com.sia.common.UUID.Builder, com.sia.common.UUIDOrBuilder> attachIdBuilder_;
    /**
     * <code>.com.sia.common.UUID attachId = 1;</code>
     * @return Whether the attachId field is set.
     */
    public boolean hasAttachId() {
      return attachIdBuilder_ != null || attachId_ != null;
    }
    /**
     * <code>.com.sia.common.UUID attachId = 1;</code>
     * @return The attachId.
     */
    public com.sia.common.UUID getAttachId() {
      if (attachIdBuilder_ == null) {
        return attachId_ == null ? com.sia.common.UUID.getDefaultInstance() : attachId_;
      } else {
        return attachIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.sia.common.UUID attachId = 1;</code>
     */
    public Builder setAttachId(com.sia.common.UUID value) {
      if (attachIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        attachId_ = value;
        onChanged();
      } else {
        attachIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.sia.common.UUID attachId = 1;</code>
     */
    public Builder setAttachId(
        com.sia.common.UUID.Builder builderForValue) {
      if (attachIdBuilder_ == null) {
        attachId_ = builderForValue.build();
        onChanged();
      } else {
        attachIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.sia.common.UUID attachId = 1;</code>
     */
    public Builder mergeAttachId(com.sia.common.UUID value) {
      if (attachIdBuilder_ == null) {
        if (attachId_ != null) {
          attachId_ =
            com.sia.common.UUID.newBuilder(attachId_).mergeFrom(value).buildPartial();
        } else {
          attachId_ = value;
        }
        onChanged();
      } else {
        attachIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.sia.common.UUID attachId = 1;</code>
     */
    public Builder clearAttachId() {
      if (attachIdBuilder_ == null) {
        attachId_ = null;
        onChanged();
      } else {
        attachId_ = null;
        attachIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.sia.common.UUID attachId = 1;</code>
     */
    public com.sia.common.UUID.Builder getAttachIdBuilder() {
      
      onChanged();
      return getAttachIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.sia.common.UUID attachId = 1;</code>
     */
    public com.sia.common.UUIDOrBuilder getAttachIdOrBuilder() {
      if (attachIdBuilder_ != null) {
        return attachIdBuilder_.getMessageOrBuilder();
      } else {
        return attachId_ == null ?
            com.sia.common.UUID.getDefaultInstance() : attachId_;
      }
    }
    /**
     * <code>.com.sia.common.UUID attachId = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.sia.common.UUID, com.sia.common.UUID.Builder, com.sia.common.UUIDOrBuilder> 
        getAttachIdFieldBuilder() {
      if (attachIdBuilder_ == null) {
        attachIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.sia.common.UUID, com.sia.common.UUID.Builder, com.sia.common.UUIDOrBuilder>(
                getAttachId(),
                getParentForChildren(),
                isClean());
        attachId_ = null;
      }
      return attachIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.sia.obision.target.v1.attach.UploadAttachResponseV1)
  }

  // @@protoc_insertion_point(class_scope:com.sia.obision.target.v1.attach.UploadAttachResponseV1)
  private static final com.sia.obision.target.v1.attach.UploadAttachResponseV1 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sia.obision.target.v1.attach.UploadAttachResponseV1();
  }

  public static com.sia.obision.target.v1.attach.UploadAttachResponseV1 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UploadAttachResponseV1>
      PARSER = new com.google.protobuf.AbstractParser<UploadAttachResponseV1>() {
    @java.lang.Override
    public UploadAttachResponseV1 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UploadAttachResponseV1(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UploadAttachResponseV1> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UploadAttachResponseV1> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sia.obision.target.v1.attach.UploadAttachResponseV1 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

