// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/record/RecordEmergencyV1.proto

package com.sia.obision.target.v1.record;

/**
 * Protobuf type {@code com.sia.obision.target.v1.record.RecordEmergencyRequestV1}
 */
public final class RecordEmergencyRequestV1 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sia.obision.target.v1.record.RecordEmergencyRequestV1)
    RecordEmergencyRequestV1OrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecordEmergencyRequestV1.newBuilder() to construct.
  private RecordEmergencyRequestV1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecordEmergencyRequestV1() {
    recordId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RecordEmergencyRequestV1();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RecordEmergencyRequestV1(
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
            java.lang.String s = input.readStringRequireUtf8();

            recordId_ = s;
            break;
          }
          case 16: {

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
    return com.sia.obision.target.v1.record.RecordEmergencyV1Proto.internal_static_com_sia_obision_target_v1_record_RecordEmergencyRequestV1_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sia.obision.target.v1.record.RecordEmergencyV1Proto.internal_static_com_sia_obision_target_v1_record_RecordEmergencyRequestV1_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sia.obision.target.v1.record.RecordEmergencyRequestV1.class, com.sia.obision.target.v1.record.RecordEmergencyRequestV1.Builder.class);
  }

  public static final int RECORDID_FIELD_NUMBER = 1;
  private volatile java.lang.Object recordId_;
  /**
   * <code>string recordId = 1;</code>
   * @return The recordId.
   */
  @java.lang.Override
  public java.lang.String getRecordId() {
    java.lang.Object ref = recordId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      recordId_ = s;
      return s;
    }
  }
  /**
   * <code>string recordId = 1;</code>
   * @return The bytes for recordId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRecordIdBytes() {
    java.lang.Object ref = recordId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      recordId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ISEMERGENCY_FIELD_NUMBER = 2;
  private boolean isEmergency_;
  /**
   * <code>bool isEmergency = 2;</code>
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
    if (!getRecordIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, recordId_);
    }
    if (isEmergency_ != false) {
      output.writeBool(2, isEmergency_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRecordIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, recordId_);
    }
    if (isEmergency_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isEmergency_);
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
    if (!(obj instanceof com.sia.obision.target.v1.record.RecordEmergencyRequestV1)) {
      return super.equals(obj);
    }
    com.sia.obision.target.v1.record.RecordEmergencyRequestV1 other = (com.sia.obision.target.v1.record.RecordEmergencyRequestV1) obj;

    if (!getRecordId()
        .equals(other.getRecordId())) return false;
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
    hash = (37 * hash) + RECORDID_FIELD_NUMBER;
    hash = (53 * hash) + getRecordId().hashCode();
    hash = (37 * hash) + ISEMERGENCY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsEmergency());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sia.obision.target.v1.record.RecordEmergencyRequestV1 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.obision.target.v1.record.RecordEmergencyRequestV1 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.obision.target.v1.record.RecordEmergencyRequestV1 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.obision.target.v1.record.RecordEmergencyRequestV1 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.obision.target.v1.record.RecordEmergencyRequestV1 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.obision.target.v1.record.RecordEmergencyRequestV1 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.obision.target.v1.record.RecordEmergencyRequestV1 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sia.obision.target.v1.record.RecordEmergencyRequestV1 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sia.obision.target.v1.record.RecordEmergencyRequestV1 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sia.obision.target.v1.record.RecordEmergencyRequestV1 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sia.obision.target.v1.record.RecordEmergencyRequestV1 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sia.obision.target.v1.record.RecordEmergencyRequestV1 parseFrom(
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
  public static Builder newBuilder(com.sia.obision.target.v1.record.RecordEmergencyRequestV1 prototype) {
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
   * Protobuf type {@code com.sia.obision.target.v1.record.RecordEmergencyRequestV1}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sia.obision.target.v1.record.RecordEmergencyRequestV1)
      com.sia.obision.target.v1.record.RecordEmergencyRequestV1OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sia.obision.target.v1.record.RecordEmergencyV1Proto.internal_static_com_sia_obision_target_v1_record_RecordEmergencyRequestV1_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sia.obision.target.v1.record.RecordEmergencyV1Proto.internal_static_com_sia_obision_target_v1_record_RecordEmergencyRequestV1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sia.obision.target.v1.record.RecordEmergencyRequestV1.class, com.sia.obision.target.v1.record.RecordEmergencyRequestV1.Builder.class);
    }

    // Construct using com.sia.obision.target.v1.record.RecordEmergencyRequestV1.newBuilder()
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
      recordId_ = "";

      isEmergency_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sia.obision.target.v1.record.RecordEmergencyV1Proto.internal_static_com_sia_obision_target_v1_record_RecordEmergencyRequestV1_descriptor;
    }

    @java.lang.Override
    public com.sia.obision.target.v1.record.RecordEmergencyRequestV1 getDefaultInstanceForType() {
      return com.sia.obision.target.v1.record.RecordEmergencyRequestV1.getDefaultInstance();
    }

    @java.lang.Override
    public com.sia.obision.target.v1.record.RecordEmergencyRequestV1 build() {
      com.sia.obision.target.v1.record.RecordEmergencyRequestV1 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sia.obision.target.v1.record.RecordEmergencyRequestV1 buildPartial() {
      com.sia.obision.target.v1.record.RecordEmergencyRequestV1 result = new com.sia.obision.target.v1.record.RecordEmergencyRequestV1(this);
      result.recordId_ = recordId_;
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
      if (other instanceof com.sia.obision.target.v1.record.RecordEmergencyRequestV1) {
        return mergeFrom((com.sia.obision.target.v1.record.RecordEmergencyRequestV1)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sia.obision.target.v1.record.RecordEmergencyRequestV1 other) {
      if (other == com.sia.obision.target.v1.record.RecordEmergencyRequestV1.getDefaultInstance()) return this;
      if (!other.getRecordId().isEmpty()) {
        recordId_ = other.recordId_;
        onChanged();
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
      com.sia.obision.target.v1.record.RecordEmergencyRequestV1 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sia.obision.target.v1.record.RecordEmergencyRequestV1) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object recordId_ = "";
    /**
     * <code>string recordId = 1;</code>
     * @return The recordId.
     */
    public java.lang.String getRecordId() {
      java.lang.Object ref = recordId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recordId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string recordId = 1;</code>
     * @return The bytes for recordId.
     */
    public com.google.protobuf.ByteString
        getRecordIdBytes() {
      java.lang.Object ref = recordId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recordId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string recordId = 1;</code>
     * @param value The recordId to set.
     * @return This builder for chaining.
     */
    public Builder setRecordId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      recordId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string recordId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRecordId() {
      
      recordId_ = getDefaultInstance().getRecordId();
      onChanged();
      return this;
    }
    /**
     * <code>string recordId = 1;</code>
     * @param value The bytes for recordId to set.
     * @return This builder for chaining.
     */
    public Builder setRecordIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      recordId_ = value;
      onChanged();
      return this;
    }

    private boolean isEmergency_ ;
    /**
     * <code>bool isEmergency = 2;</code>
     * @return The isEmergency.
     */
    @java.lang.Override
    public boolean getIsEmergency() {
      return isEmergency_;
    }
    /**
     * <code>bool isEmergency = 2;</code>
     * @param value The isEmergency to set.
     * @return This builder for chaining.
     */
    public Builder setIsEmergency(boolean value) {
      
      isEmergency_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isEmergency = 2;</code>
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


    // @@protoc_insertion_point(builder_scope:com.sia.obision.target.v1.record.RecordEmergencyRequestV1)
  }

  // @@protoc_insertion_point(class_scope:com.sia.obision.target.v1.record.RecordEmergencyRequestV1)
  private static final com.sia.obision.target.v1.record.RecordEmergencyRequestV1 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sia.obision.target.v1.record.RecordEmergencyRequestV1();
  }

  public static com.sia.obision.target.v1.record.RecordEmergencyRequestV1 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecordEmergencyRequestV1>
      PARSER = new com.google.protobuf.AbstractParser<RecordEmergencyRequestV1>() {
    @java.lang.Override
    public RecordEmergencyRequestV1 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RecordEmergencyRequestV1(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RecordEmergencyRequestV1> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecordEmergencyRequestV1> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sia.obision.target.v1.record.RecordEmergencyRequestV1 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

