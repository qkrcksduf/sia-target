// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: account/message/SignUp.proto

public final class SignUp {
  private SignUp() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SignUpRequestProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SignUpRequestProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SignUpResponseProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SignUpResponseProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034account/message/SignUp.proto\032!account/" +
      "message/AccountRole.proto\"a\n\022SignUpReque" +
      "stProto\022\n\n\002id\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\020\n\010pas" +
      "sword\030\003 \001(\t\022\037\n\004role\030\004 \001(\0162\021.AccountRoleP" +
      "roto\"P\n\023SignUpResponseProto\022\n\n\002id\030\001 \001(\t\022" +
      "\014\n\004name\030\002 \001(\t\022\037\n\004role\030\003 \001(\0162\021.AccountRol" +
      "eProtoB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          AccountRole.getDescriptor(),
        });
    internal_static_SignUpRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SignUpRequestProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SignUpRequestProto_descriptor,
        new java.lang.String[] { "Id", "Name", "Password", "Role", });
    internal_static_SignUpResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SignUpResponseProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SignUpResponseProto_descriptor,
        new java.lang.String[] { "Id", "Name", "Role", });
    AccountRole.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
