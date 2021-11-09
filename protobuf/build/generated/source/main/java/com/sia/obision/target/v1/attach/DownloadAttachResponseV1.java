// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/attach/DownloadAttachV1.proto

package com.sia.obision.target.v1.attach;

/**
 * Protobuf type {@code com.sia.obision.target.v1.attach.DownloadAttachResponseV1}
 */
public final class DownloadAttachResponseV1 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sia.obision.target.v1.attach.DownloadAttachResponseV1)
    DownloadAttachResponseV1OrBuilder {
private static final long serialVersionUID = 0L;
  // Use DownloadAttachResponseV1.newBuilder() to construct.
  private DownloadAttachResponseV1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DownloadAttachResponseV1() {
    file_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DownloadAttachResponseV1();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DownloadAttachResponseV1(
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

            file_ = input.readBytes();
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
    return com.sia.obision.target.v1.attach.DownloadAttachV1Proto.internal_static_com_sia_obision_target_v1_attach_DownloadAttachResponseV1_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sia.obision.target.v1.attach.DownloadAttachV1Proto.internal_static_com_sia_obision_target_v1_attach_DownloadAttachResponseV1_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sia.obision.target.v1.attach.DownloadAttachResponseV1.class, com.sia.obision.target.v1.attach.DownloadAttachResponseV1.Builder.class);
  }

  public static final int FILE_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString file_;
  /**
   * <code>bytes file = 1;</code>
   * @return The file.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFile() {
    return file_;
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
    if (!file_.isEmpty()) {
      output.writeBytes(1, file_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!file_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, file_);
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
    if (!(obj instanceof com.sia.obision.target.v1.attach.DownloadAttachResponseV1)) {
      return super.equals(obj);
    }
    com.sia.obision.target.v1.attach.DownloadAttachResponseV1 other = (com.sia.obision.target.v1.attach.DownloadAttachResponseV1) obj;

    if (!getFile()
        .equals(other.getFile())) return false;
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
    hash = (37 * hash) + FILE_FIELD_NUMBER;
    hash = (53 * hash) + getFile().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sia.obision.target.v1.attach.DownloadAttachResponseV1 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.obision.target.v1.attach.DownloadAttachResponseV1 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.obision.target.v1.attach.DownloadAttachResponseV1 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.obision.target.v1.attach.DownloadAttachResponseV1 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.obision.target.v1.attach.DownloadAttachResponseV1 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.obision.target.v1.attach.DownloadAttachResponseV1 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.obision.target.v1.attach.DownloadAttachResponseV1 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sia.obision.target.v1.attach.DownloadAttachResponseV1 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sia.obision.target.v1.attach.DownloadAttachResponseV1 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sia.obision.target.v1.attach.DownloadAttachResponseV1 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sia.obision.target.v1.attach.DownloadAttachResponseV1 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sia.obision.target.v1.attach.DownloadAttachResponseV1 parseFrom(
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
  public static Builder newBuilder(com.sia.obision.target.v1.attach.DownloadAttachResponseV1 prototype) {
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
   * Protobuf type {@code com.sia.obision.target.v1.attach.DownloadAttachResponseV1}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sia.obision.target.v1.attach.DownloadAttachResponseV1)
      com.sia.obision.target.v1.attach.DownloadAttachResponseV1OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sia.obision.target.v1.attach.DownloadAttachV1Proto.internal_static_com_sia_obision_target_v1_attach_DownloadAttachResponseV1_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sia.obision.target.v1.attach.DownloadAttachV1Proto.internal_static_com_sia_obision_target_v1_attach_DownloadAttachResponseV1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sia.obision.target.v1.attach.DownloadAttachResponseV1.class, com.sia.obision.target.v1.attach.DownloadAttachResponseV1.Builder.class);
    }

    // Construct using com.sia.obision.target.v1.attach.DownloadAttachResponseV1.newBuilder()
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
      file_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sia.obision.target.v1.attach.DownloadAttachV1Proto.internal_static_com_sia_obision_target_v1_attach_DownloadAttachResponseV1_descriptor;
    }

    @java.lang.Override
    public com.sia.obision.target.v1.attach.DownloadAttachResponseV1 getDefaultInstanceForType() {
      return com.sia.obision.target.v1.attach.DownloadAttachResponseV1.getDefaultInstance();
    }

    @java.lang.Override
    public com.sia.obision.target.v1.attach.DownloadAttachResponseV1 build() {
      com.sia.obision.target.v1.attach.DownloadAttachResponseV1 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sia.obision.target.v1.attach.DownloadAttachResponseV1 buildPartial() {
      com.sia.obision.target.v1.attach.DownloadAttachResponseV1 result = new com.sia.obision.target.v1.attach.DownloadAttachResponseV1(this);
      result.file_ = file_;
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
      if (other instanceof com.sia.obision.target.v1.attach.DownloadAttachResponseV1) {
        return mergeFrom((com.sia.obision.target.v1.attach.DownloadAttachResponseV1)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sia.obision.target.v1.attach.DownloadAttachResponseV1 other) {
      if (other == com.sia.obision.target.v1.attach.DownloadAttachResponseV1.getDefaultInstance()) return this;
      if (other.getFile() != com.google.protobuf.ByteString.EMPTY) {
        setFile(other.getFile());
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
      com.sia.obision.target.v1.attach.DownloadAttachResponseV1 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sia.obision.target.v1.attach.DownloadAttachResponseV1) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString file_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes file = 1;</code>
     * @return The file.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getFile() {
      return file_;
    }
    /**
     * <code>bytes file = 1;</code>
     * @param value The file to set.
     * @return This builder for chaining.
     */
    public Builder setFile(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      file_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes file = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFile() {
      
      file_ = getDefaultInstance().getFile();
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


    // @@protoc_insertion_point(builder_scope:com.sia.obision.target.v1.attach.DownloadAttachResponseV1)
  }

  // @@protoc_insertion_point(class_scope:com.sia.obision.target.v1.attach.DownloadAttachResponseV1)
  private static final com.sia.obision.target.v1.attach.DownloadAttachResponseV1 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sia.obision.target.v1.attach.DownloadAttachResponseV1();
  }

  public static com.sia.obision.target.v1.attach.DownloadAttachResponseV1 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DownloadAttachResponseV1>
      PARSER = new com.google.protobuf.AbstractParser<DownloadAttachResponseV1>() {
    @java.lang.Override
    public DownloadAttachResponseV1 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DownloadAttachResponseV1(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DownloadAttachResponseV1> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DownloadAttachResponseV1> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sia.obision.target.v1.attach.DownloadAttachResponseV1 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

