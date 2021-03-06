// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/category/DeleteCategoryListV1.proto

package com.sia.obision.target.v1.category;

/**
 * Protobuf type {@code com.sia.obision.target.v1.category.DeleteCategoryListRequestV1}
 */
public final class DeleteCategoryListRequestV1 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sia.obision.target.v1.category.DeleteCategoryListRequestV1)
    DeleteCategoryListRequestV1OrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteCategoryListRequestV1.newBuilder() to construct.
  private DeleteCategoryListRequestV1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteCategoryListRequestV1() {
    category_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteCategoryListRequestV1();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteCategoryListRequestV1(
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
              category_ = new java.util.ArrayList<com.sia.obision.target.v1.category.DeleteCategoryRequestV1>();
              mutable_bitField0_ |= 0x00000001;
            }
            category_.add(
                input.readMessage(com.sia.obision.target.v1.category.DeleteCategoryRequestV1.parser(), extensionRegistry));
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
        category_ = java.util.Collections.unmodifiableList(category_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sia.obision.target.v1.category.DeleteCategoryListV1Proto.internal_static_com_sia_obision_target_v1_category_DeleteCategoryListRequestV1_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sia.obision.target.v1.category.DeleteCategoryListV1Proto.internal_static_com_sia_obision_target_v1_category_DeleteCategoryListRequestV1_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sia.obision.target.v1.category.DeleteCategoryListRequestV1.class, com.sia.obision.target.v1.category.DeleteCategoryListRequestV1.Builder.class);
  }

  public static final int CATEGORY_FIELD_NUMBER = 1;
  private java.util.List<com.sia.obision.target.v1.category.DeleteCategoryRequestV1> category_;
  /**
   * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.sia.obision.target.v1.category.DeleteCategoryRequestV1> getCategoryList() {
    return category_;
  }
  /**
   * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.sia.obision.target.v1.category.DeleteCategoryRequestV1OrBuilder> 
      getCategoryOrBuilderList() {
    return category_;
  }
  /**
   * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
   */
  @java.lang.Override
  public int getCategoryCount() {
    return category_.size();
  }
  /**
   * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
   */
  @java.lang.Override
  public com.sia.obision.target.v1.category.DeleteCategoryRequestV1 getCategory(int index) {
    return category_.get(index);
  }
  /**
   * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
   */
  @java.lang.Override
  public com.sia.obision.target.v1.category.DeleteCategoryRequestV1OrBuilder getCategoryOrBuilder(
      int index) {
    return category_.get(index);
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
    for (int i = 0; i < category_.size(); i++) {
      output.writeMessage(1, category_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < category_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, category_.get(i));
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
    if (!(obj instanceof com.sia.obision.target.v1.category.DeleteCategoryListRequestV1)) {
      return super.equals(obj);
    }
    com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 other = (com.sia.obision.target.v1.category.DeleteCategoryListRequestV1) obj;

    if (!getCategoryList()
        .equals(other.getCategoryList())) return false;
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
    if (getCategoryCount() > 0) {
      hash = (37 * hash) + CATEGORY_FIELD_NUMBER;
      hash = (53 * hash) + getCategoryList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 parseFrom(
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
  public static Builder newBuilder(com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 prototype) {
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
   * Protobuf type {@code com.sia.obision.target.v1.category.DeleteCategoryListRequestV1}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sia.obision.target.v1.category.DeleteCategoryListRequestV1)
      com.sia.obision.target.v1.category.DeleteCategoryListRequestV1OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sia.obision.target.v1.category.DeleteCategoryListV1Proto.internal_static_com_sia_obision_target_v1_category_DeleteCategoryListRequestV1_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sia.obision.target.v1.category.DeleteCategoryListV1Proto.internal_static_com_sia_obision_target_v1_category_DeleteCategoryListRequestV1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sia.obision.target.v1.category.DeleteCategoryListRequestV1.class, com.sia.obision.target.v1.category.DeleteCategoryListRequestV1.Builder.class);
    }

    // Construct using com.sia.obision.target.v1.category.DeleteCategoryListRequestV1.newBuilder()
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
        getCategoryFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (categoryBuilder_ == null) {
        category_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        categoryBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sia.obision.target.v1.category.DeleteCategoryListV1Proto.internal_static_com_sia_obision_target_v1_category_DeleteCategoryListRequestV1_descriptor;
    }

    @java.lang.Override
    public com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 getDefaultInstanceForType() {
      return com.sia.obision.target.v1.category.DeleteCategoryListRequestV1.getDefaultInstance();
    }

    @java.lang.Override
    public com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 build() {
      com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 buildPartial() {
      com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 result = new com.sia.obision.target.v1.category.DeleteCategoryListRequestV1(this);
      int from_bitField0_ = bitField0_;
      if (categoryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          category_ = java.util.Collections.unmodifiableList(category_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.category_ = category_;
      } else {
        result.category_ = categoryBuilder_.build();
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
      if (other instanceof com.sia.obision.target.v1.category.DeleteCategoryListRequestV1) {
        return mergeFrom((com.sia.obision.target.v1.category.DeleteCategoryListRequestV1)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 other) {
      if (other == com.sia.obision.target.v1.category.DeleteCategoryListRequestV1.getDefaultInstance()) return this;
      if (categoryBuilder_ == null) {
        if (!other.category_.isEmpty()) {
          if (category_.isEmpty()) {
            category_ = other.category_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCategoryIsMutable();
            category_.addAll(other.category_);
          }
          onChanged();
        }
      } else {
        if (!other.category_.isEmpty()) {
          if (categoryBuilder_.isEmpty()) {
            categoryBuilder_.dispose();
            categoryBuilder_ = null;
            category_ = other.category_;
            bitField0_ = (bitField0_ & ~0x00000001);
            categoryBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCategoryFieldBuilder() : null;
          } else {
            categoryBuilder_.addAllMessages(other.category_);
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
      com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sia.obision.target.v1.category.DeleteCategoryListRequestV1) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.sia.obision.target.v1.category.DeleteCategoryRequestV1> category_ =
      java.util.Collections.emptyList();
    private void ensureCategoryIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        category_ = new java.util.ArrayList<com.sia.obision.target.v1.category.DeleteCategoryRequestV1>(category_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sia.obision.target.v1.category.DeleteCategoryRequestV1, com.sia.obision.target.v1.category.DeleteCategoryRequestV1.Builder, com.sia.obision.target.v1.category.DeleteCategoryRequestV1OrBuilder> categoryBuilder_;

    /**
     * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
     */
    public java.util.List<com.sia.obision.target.v1.category.DeleteCategoryRequestV1> getCategoryList() {
      if (categoryBuilder_ == null) {
        return java.util.Collections.unmodifiableList(category_);
      } else {
        return categoryBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
     */
    public int getCategoryCount() {
      if (categoryBuilder_ == null) {
        return category_.size();
      } else {
        return categoryBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
     */
    public com.sia.obision.target.v1.category.DeleteCategoryRequestV1 getCategory(int index) {
      if (categoryBuilder_ == null) {
        return category_.get(index);
      } else {
        return categoryBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
     */
    public Builder setCategory(
        int index, com.sia.obision.target.v1.category.DeleteCategoryRequestV1 value) {
      if (categoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCategoryIsMutable();
        category_.set(index, value);
        onChanged();
      } else {
        categoryBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
     */
    public Builder setCategory(
        int index, com.sia.obision.target.v1.category.DeleteCategoryRequestV1.Builder builderForValue) {
      if (categoryBuilder_ == null) {
        ensureCategoryIsMutable();
        category_.set(index, builderForValue.build());
        onChanged();
      } else {
        categoryBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
     */
    public Builder addCategory(com.sia.obision.target.v1.category.DeleteCategoryRequestV1 value) {
      if (categoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCategoryIsMutable();
        category_.add(value);
        onChanged();
      } else {
        categoryBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
     */
    public Builder addCategory(
        int index, com.sia.obision.target.v1.category.DeleteCategoryRequestV1 value) {
      if (categoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCategoryIsMutable();
        category_.add(index, value);
        onChanged();
      } else {
        categoryBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
     */
    public Builder addCategory(
        com.sia.obision.target.v1.category.DeleteCategoryRequestV1.Builder builderForValue) {
      if (categoryBuilder_ == null) {
        ensureCategoryIsMutable();
        category_.add(builderForValue.build());
        onChanged();
      } else {
        categoryBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
     */
    public Builder addCategory(
        int index, com.sia.obision.target.v1.category.DeleteCategoryRequestV1.Builder builderForValue) {
      if (categoryBuilder_ == null) {
        ensureCategoryIsMutable();
        category_.add(index, builderForValue.build());
        onChanged();
      } else {
        categoryBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
     */
    public Builder addAllCategory(
        java.lang.Iterable<? extends com.sia.obision.target.v1.category.DeleteCategoryRequestV1> values) {
      if (categoryBuilder_ == null) {
        ensureCategoryIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, category_);
        onChanged();
      } else {
        categoryBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
     */
    public Builder clearCategory() {
      if (categoryBuilder_ == null) {
        category_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        categoryBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
     */
    public Builder removeCategory(int index) {
      if (categoryBuilder_ == null) {
        ensureCategoryIsMutable();
        category_.remove(index);
        onChanged();
      } else {
        categoryBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
     */
    public com.sia.obision.target.v1.category.DeleteCategoryRequestV1.Builder getCategoryBuilder(
        int index) {
      return getCategoryFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
     */
    public com.sia.obision.target.v1.category.DeleteCategoryRequestV1OrBuilder getCategoryOrBuilder(
        int index) {
      if (categoryBuilder_ == null) {
        return category_.get(index);  } else {
        return categoryBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
     */
    public java.util.List<? extends com.sia.obision.target.v1.category.DeleteCategoryRequestV1OrBuilder> 
         getCategoryOrBuilderList() {
      if (categoryBuilder_ != null) {
        return categoryBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(category_);
      }
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
     */
    public com.sia.obision.target.v1.category.DeleteCategoryRequestV1.Builder addCategoryBuilder() {
      return getCategoryFieldBuilder().addBuilder(
          com.sia.obision.target.v1.category.DeleteCategoryRequestV1.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
     */
    public com.sia.obision.target.v1.category.DeleteCategoryRequestV1.Builder addCategoryBuilder(
        int index) {
      return getCategoryFieldBuilder().addBuilder(
          index, com.sia.obision.target.v1.category.DeleteCategoryRequestV1.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sia.obision.target.v1.category.DeleteCategoryRequestV1 category = 1;</code>
     */
    public java.util.List<com.sia.obision.target.v1.category.DeleteCategoryRequestV1.Builder> 
         getCategoryBuilderList() {
      return getCategoryFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sia.obision.target.v1.category.DeleteCategoryRequestV1, com.sia.obision.target.v1.category.DeleteCategoryRequestV1.Builder, com.sia.obision.target.v1.category.DeleteCategoryRequestV1OrBuilder> 
        getCategoryFieldBuilder() {
      if (categoryBuilder_ == null) {
        categoryBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.sia.obision.target.v1.category.DeleteCategoryRequestV1, com.sia.obision.target.v1.category.DeleteCategoryRequestV1.Builder, com.sia.obision.target.v1.category.DeleteCategoryRequestV1OrBuilder>(
                category_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        category_ = null;
      }
      return categoryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.sia.obision.target.v1.category.DeleteCategoryListRequestV1)
  }

  // @@protoc_insertion_point(class_scope:com.sia.obision.target.v1.category.DeleteCategoryListRequestV1)
  private static final com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sia.obision.target.v1.category.DeleteCategoryListRequestV1();
  }

  public static com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteCategoryListRequestV1>
      PARSER = new com.google.protobuf.AbstractParser<DeleteCategoryListRequestV1>() {
    @java.lang.Override
    public DeleteCategoryListRequestV1 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteCategoryListRequestV1(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteCategoryListRequestV1> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteCategoryListRequestV1> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

