// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sia/obision/target/v1/TargetSortPropertyV1.proto

package com.sia.obision.target.v1;

/**
 * Protobuf enum {@code com.sia.obision.target.v1.TargetSortProperty}
 */
public enum TargetSortProperty
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DEFAULT = 0;</code>
   */
  DEFAULT(0),
  /**
   * <code>TARGET_ID = 1;</code>
   */
  TARGET_ID(1),
  /**
   * <code>TARGET_NAME = 2;</code>
   */
  TARGET_NAME(2),
  /**
   * <code>CREATED_TIME = 3;</code>
   */
  CREATED_TIME(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DEFAULT = 0;</code>
   */
  public static final int DEFAULT_VALUE = 0;
  /**
   * <code>TARGET_ID = 1;</code>
   */
  public static final int TARGET_ID_VALUE = 1;
  /**
   * <code>TARGET_NAME = 2;</code>
   */
  public static final int TARGET_NAME_VALUE = 2;
  /**
   * <code>CREATED_TIME = 3;</code>
   */
  public static final int CREATED_TIME_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TargetSortProperty valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TargetSortProperty forNumber(int value) {
    switch (value) {
      case 0: return DEFAULT;
      case 1: return TARGET_ID;
      case 2: return TARGET_NAME;
      case 3: return CREATED_TIME;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TargetSortProperty>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TargetSortProperty> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TargetSortProperty>() {
          public TargetSortProperty findValueByNumber(int number) {
            return TargetSortProperty.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.sia.obision.target.v1.TargetSortPropertyV1Proto.getDescriptor().getEnumTypes().get(0);
  }

  private static final TargetSortProperty[] VALUES = values();

  public static TargetSortProperty valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TargetSortProperty(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.sia.obision.target.v1.TargetSortProperty)
}
