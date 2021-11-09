// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/record/RecordSelectOptionV1.proto

package com.sia.obision.target.v1.record;

/**
 * Protobuf type {@code com.sia.obision.target.v1.record.RecordSelectOption}
 */
public final class RecordSelectOption extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sia.obision.target.v1.record.RecordSelectOption)
    RecordSelectOptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecordSelectOption.newBuilder() to construct.
  private RecordSelectOption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecordSelectOption() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RecordSelectOption();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RecordSelectOption(
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
          case 16: {

            isFavoriteRecord_ = input.readBool();
            break;
          }
          case 24: {

            isFavoriteTarget_ = input.readBool();
            break;
          }
          case 32: {

            isEmergency_ = input.readBool();
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
    return com.sia.obision.target.v1.record.RecordSelectOptionV1Proto.internal_static_com_sia_obision_target_v1_record_RecordSelectOption_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sia.obision.target.v1.record.RecordSelectOptionV1Proto.internal_static_com_sia_obision_target_v1_record_RecordSelectOption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sia.obision.target.v1.record.RecordSelectOption.class, com.sia.obision.target.v1.record.RecordSelectOption.Builder.class);
  }

  public static final int ISFAVORITERECORD_FIELD_NUMBER = 2;
  private boolean isFavoriteRecord_;
  /**
   * <code>bool isFavoriteRecord = 2;</code>
   * @return The isFavoriteRecord.
   */
  @java.lang.Override
  public boolean getIsFavoriteRecord() {
    return isFavoriteRecord_;
  }

  public static final int ISFAVORITETARGET_FIELD_NUMBER = 3;
  private boolean isFavoriteTarget_;
  /**
   * <code>bool isFavoriteTarget = 3;</code>
   * @return The isFavoriteTarget.
   */
  @java.lang.Override
  public boolean getIsFavoriteTarget() {
    return isFavoriteTarget_;
  }

  public static final int ISEMERGENCY_FIELD_NUMBER = 4;
  private boolean isEmergency_;
  /**
   * <code>bool isEmergency = 4;</code>
   * @return The isEmergency.
   */
  @java.lang.Override
  public boolean getIsEmergency() {
    return isEmergency_;
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
    if (isFavoriteRecord_ != false) {
      output.writeBool(2, isFavoriteRecord_);
    }
    if (isFavoriteTarget_ != false) {
      output.writeBool(3, isFavoriteTarget_);
    }
    if (isEmergency_ != false) {
      output.writeBool(4, isEmergency_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isFavoriteRecord_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isFavoriteRecord_);
    }
    if (isFavoriteTarget_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isFavoriteTarget_);
    }
    if (isEmergency_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isEmergency_);
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
    if (!(obj instanceof com.sia.obision.target.v1.record.RecordSelectOption)) {
      return super.equals(obj);
    }
    com.sia.obision.target.v1.record.RecordSelectOption other = (com.sia.obision.target.v1.record.RecordSelectOption) obj;

    if (getIsFavoriteRecord()
        != other.getIsFavoriteRecord()) return false;
    if (getIsFavoriteTarget()
        != other.getIsFavoriteTarget()) return false;
    if (getIsEmergency()
        != other.getIsEmergency()) return false;
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
    hash = (37 * hash) + ISFAVORITERECORD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsFavoriteRecord());
    hash = (37 * hash) + ISFAVORITETARGET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsFavoriteTarget());
    hash = (37 * hash) + ISEMERGENCY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsEmergency());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sia.obision.target.v1.record.RecordSelectOption parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.obision.target.v1.record.RecordSelectOption parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.obision.target.v1.record.RecordSelectOption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.obision.target.v1.record.RecordSelectOption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.obision.target.v1.record.RecordSelectOption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.obision.target.v1.record.RecordSelectOption parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.obision.target.v1.record.RecordSelectOption parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sia.obision.target.v1.record.RecordSelectOption parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sia.obision.target.v1.record.RecordSelectOption parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sia.obision.target.v1.record.RecordSelectOption parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sia.obision.target.v1.record.RecordSelectOption parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sia.obision.target.v1.record.RecordSelectOption parseFrom(
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
  public static Builder newBuilder(com.sia.obision.target.v1.record.RecordSelectOption prototype) {
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
   * Protobuf type {@code com.sia.obision.target.v1.record.RecordSelectOption}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sia.obision.target.v1.record.RecordSelectOption)
      com.sia.obision.target.v1.record.RecordSelectOptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sia.obision.target.v1.record.RecordSelectOptionV1Proto.internal_static_com_sia_obision_target_v1_record_RecordSelectOption_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sia.obision.target.v1.record.RecordSelectOptionV1Proto.internal_static_com_sia_obision_target_v1_record_RecordSelectOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sia.obision.target.v1.record.RecordSelectOption.class, com.sia.obision.target.v1.record.RecordSelectOption.Builder.class);
    }

    // Construct using com.sia.obision.target.v1.record.RecordSelectOption.newBuilder()
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
      isFavoriteRecord_ = false;

      isFavoriteTarget_ = false;

      isEmergency_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sia.obision.target.v1.record.RecordSelectOptionV1Proto.internal_static_com_sia_obision_target_v1_record_RecordSelectOption_descriptor;
    }

    @java.lang.Override
    public com.sia.obision.target.v1.record.RecordSelectOption getDefaultInstanceForType() {
      return com.sia.obision.target.v1.record.RecordSelectOption.getDefaultInstance();
    }

    @java.lang.Override
    public com.sia.obision.target.v1.record.RecordSelectOption build() {
      com.sia.obision.target.v1.record.RecordSelectOption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sia.obision.target.v1.record.RecordSelectOption buildPartial() {
      com.sia.obision.target.v1.record.RecordSelectOption result = new com.sia.obision.target.v1.record.RecordSelectOption(this);
      result.isFavoriteRecord_ = isFavoriteRecord_;
      result.isFavoriteTarget_ = isFavoriteTarget_;
      result.isEmergency_ = isEmergency_;
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
      if (other instanceof com.sia.obision.target.v1.record.RecordSelectOption) {
        return mergeFrom((com.sia.obision.target.v1.record.RecordSelectOption)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sia.obision.target.v1.record.RecordSelectOption other) {
      if (other == com.sia.obision.target.v1.record.RecordSelectOption.getDefaultInstance()) return this;
      if (other.getIsFavoriteRecord() != false) {
        setIsFavoriteRecord(other.getIsFavoriteRecord());
      }
      if (other.getIsFavoriteTarget() != false) {
        setIsFavoriteTarget(other.getIsFavoriteTarget());
      }
      if (other.getIsEmergency() != false) {
        setIsEmergency(other.getIsEmergency());
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
      com.sia.obision.target.v1.record.RecordSelectOption parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sia.obision.target.v1.record.RecordSelectOption) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean isFavoriteRecord_ ;
    /**
     * <code>bool isFavoriteRecord = 2;</code>
     * @return The isFavoriteRecord.
     */
    @java.lang.Override
    public boolean getIsFavoriteRecord() {
      return isFavoriteRecord_;
    }
    /**
     * <code>bool isFavoriteRecord = 2;</code>
     * @param value The isFavoriteRecord to set.
     * @return This builder for chaining.
     */
    public Builder setIsFavoriteRecord(boolean value) {
      
      isFavoriteRecord_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isFavoriteRecord = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsFavoriteRecord() {
      
      isFavoriteRecord_ = false;
      onChanged();
      return this;
    }

    private boolean isFavoriteTarget_ ;
    /**
     * <code>bool isFavoriteTarget = 3;</code>
     * @return The isFavoriteTarget.
     */
    @java.lang.Override
    public boolean getIsFavoriteTarget() {
      return isFavoriteTarget_;
    }
    /**
     * <code>bool isFavoriteTarget = 3;</code>
     * @param value The isFavoriteTarget to set.
     * @return This builder for chaining.
     */
    public Builder setIsFavoriteTarget(boolean value) {
      
      isFavoriteTarget_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isFavoriteTarget = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsFavoriteTarget() {
      
      isFavoriteTarget_ = false;
      onChanged();
      return this;
    }

    private boolean isEmergency_ ;
    /**
     * <code>bool isEmergency = 4;</code>
     * @return The isEmergency.
     */
    @java.lang.Override
    public boolean getIsEmergency() {
      return isEmergency_;
    }
    /**
     * <code>bool isEmergency = 4;</code>
     * @param value The isEmergency to set.
     * @return This builder for chaining.
     */
    public Builder setIsEmergency(boolean value) {
      
      isEmergency_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isEmergency = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsEmergency() {
      
      isEmergency_ = false;
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


    // @@protoc_insertion_point(builder_scope:com.sia.obision.target.v1.record.RecordSelectOption)
  }

  // @@protoc_insertion_point(class_scope:com.sia.obision.target.v1.record.RecordSelectOption)
  private static final com.sia.obision.target.v1.record.RecordSelectOption DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sia.obision.target.v1.record.RecordSelectOption();
  }

  public static com.sia.obision.target.v1.record.RecordSelectOption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecordSelectOption>
      PARSER = new com.google.protobuf.AbstractParser<RecordSelectOption>() {
    @java.lang.Override
    public RecordSelectOption parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RecordSelectOption(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RecordSelectOption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecordSelectOption> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sia.obision.target.v1.record.RecordSelectOption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

