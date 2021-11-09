package com.sia.obision.target;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: com/sia/obision/target/AttachRouter.proto")
public final class AttachRouterGrpc {

  private AttachRouterGrpc() {}

  public static final String SERVICE_NAME = "com.sia.obision.target.AttachRouter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.attach.UploadAttachRequestV1,
      com.sia.obision.target.v1.attach.UploadAttachResponseV1> getUploadAttachMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "uploadAttach",
      requestType = com.sia.obision.target.v1.attach.UploadAttachRequestV1.class,
      responseType = com.sia.obision.target.v1.attach.UploadAttachResponseV1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.attach.UploadAttachRequestV1,
      com.sia.obision.target.v1.attach.UploadAttachResponseV1> getUploadAttachMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.attach.UploadAttachRequestV1, com.sia.obision.target.v1.attach.UploadAttachResponseV1> getUploadAttachMethod;
    if ((getUploadAttachMethod = AttachRouterGrpc.getUploadAttachMethod) == null) {
      synchronized (AttachRouterGrpc.class) {
        if ((getUploadAttachMethod = AttachRouterGrpc.getUploadAttachMethod) == null) {
          AttachRouterGrpc.getUploadAttachMethod = getUploadAttachMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.attach.UploadAttachRequestV1, com.sia.obision.target.v1.attach.UploadAttachResponseV1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "uploadAttach"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.attach.UploadAttachRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.attach.UploadAttachResponseV1.getDefaultInstance()))
              .setSchemaDescriptor(new AttachRouterMethodDescriptorSupplier("uploadAttach"))
              .build();
        }
      }
    }
    return getUploadAttachMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.attach.DownloadAttachRequestV1,
      com.sia.obision.target.v1.attach.DownloadAttachResponseV1> getDownloadAttachMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "downloadAttach",
      requestType = com.sia.obision.target.v1.attach.DownloadAttachRequestV1.class,
      responseType = com.sia.obision.target.v1.attach.DownloadAttachResponseV1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.attach.DownloadAttachRequestV1,
      com.sia.obision.target.v1.attach.DownloadAttachResponseV1> getDownloadAttachMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.attach.DownloadAttachRequestV1, com.sia.obision.target.v1.attach.DownloadAttachResponseV1> getDownloadAttachMethod;
    if ((getDownloadAttachMethod = AttachRouterGrpc.getDownloadAttachMethod) == null) {
      synchronized (AttachRouterGrpc.class) {
        if ((getDownloadAttachMethod = AttachRouterGrpc.getDownloadAttachMethod) == null) {
          AttachRouterGrpc.getDownloadAttachMethod = getDownloadAttachMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.attach.DownloadAttachRequestV1, com.sia.obision.target.v1.attach.DownloadAttachResponseV1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "downloadAttach"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.attach.DownloadAttachRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.attach.DownloadAttachResponseV1.getDefaultInstance()))
              .setSchemaDescriptor(new AttachRouterMethodDescriptorSupplier("downloadAttach"))
              .build();
        }
      }
    }
    return getDownloadAttachMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.attach.DeleteAttachRequestV1,
      com.google.protobuf.Empty> getDeleteAttachMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteAttach",
      requestType = com.sia.obision.target.v1.attach.DeleteAttachRequestV1.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.attach.DeleteAttachRequestV1,
      com.google.protobuf.Empty> getDeleteAttachMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.attach.DeleteAttachRequestV1, com.google.protobuf.Empty> getDeleteAttachMethod;
    if ((getDeleteAttachMethod = AttachRouterGrpc.getDeleteAttachMethod) == null) {
      synchronized (AttachRouterGrpc.class) {
        if ((getDeleteAttachMethod = AttachRouterGrpc.getDeleteAttachMethod) == null) {
          AttachRouterGrpc.getDeleteAttachMethod = getDeleteAttachMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.attach.DeleteAttachRequestV1, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteAttach"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.attach.DeleteAttachRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AttachRouterMethodDescriptorSupplier("deleteAttach"))
              .build();
        }
      }
    }
    return getDeleteAttachMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AttachRouterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AttachRouterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AttachRouterStub>() {
        @java.lang.Override
        public AttachRouterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AttachRouterStub(channel, callOptions);
        }
      };
    return AttachRouterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AttachRouterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AttachRouterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AttachRouterBlockingStub>() {
        @java.lang.Override
        public AttachRouterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AttachRouterBlockingStub(channel, callOptions);
        }
      };
    return AttachRouterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AttachRouterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AttachRouterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AttachRouterFutureStub>() {
        @java.lang.Override
        public AttachRouterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AttachRouterFutureStub(channel, callOptions);
        }
      };
    return AttachRouterFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AttachRouterImplBase implements io.grpc.BindableService {

    /**
     */
    public void uploadAttach(com.sia.obision.target.v1.attach.UploadAttachRequestV1 request,
        io.grpc.stub.StreamObserver<com.sia.obision.target.v1.attach.UploadAttachResponseV1> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadAttachMethod(), responseObserver);
    }

    /**
     */
    public void downloadAttach(com.sia.obision.target.v1.attach.DownloadAttachRequestV1 request,
        io.grpc.stub.StreamObserver<com.sia.obision.target.v1.attach.DownloadAttachResponseV1> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadAttachMethod(), responseObserver);
    }

    /**
     */
    public void deleteAttach(com.sia.obision.target.v1.attach.DeleteAttachRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAttachMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadAttachMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.attach.UploadAttachRequestV1,
                com.sia.obision.target.v1.attach.UploadAttachResponseV1>(
                  this, METHODID_UPLOAD_ATTACH)))
          .addMethod(
            getDownloadAttachMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.attach.DownloadAttachRequestV1,
                com.sia.obision.target.v1.attach.DownloadAttachResponseV1>(
                  this, METHODID_DOWNLOAD_ATTACH)))
          .addMethod(
            getDeleteAttachMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.attach.DeleteAttachRequestV1,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_ATTACH)))
          .build();
    }
  }

  /**
   */
  public static final class AttachRouterStub extends io.grpc.stub.AbstractAsyncStub<AttachRouterStub> {
    private AttachRouterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AttachRouterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AttachRouterStub(channel, callOptions);
    }

    /**
     */
    public void uploadAttach(com.sia.obision.target.v1.attach.UploadAttachRequestV1 request,
        io.grpc.stub.StreamObserver<com.sia.obision.target.v1.attach.UploadAttachResponseV1> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadAttachMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void downloadAttach(com.sia.obision.target.v1.attach.DownloadAttachRequestV1 request,
        io.grpc.stub.StreamObserver<com.sia.obision.target.v1.attach.DownloadAttachResponseV1> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadAttachMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAttach(com.sia.obision.target.v1.attach.DeleteAttachRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAttachMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AttachRouterBlockingStub extends io.grpc.stub.AbstractBlockingStub<AttachRouterBlockingStub> {
    private AttachRouterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AttachRouterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AttachRouterBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sia.obision.target.v1.attach.UploadAttachResponseV1 uploadAttach(com.sia.obision.target.v1.attach.UploadAttachRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadAttachMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sia.obision.target.v1.attach.DownloadAttachResponseV1 downloadAttach(com.sia.obision.target.v1.attach.DownloadAttachRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadAttachMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteAttach(com.sia.obision.target.v1.attach.DeleteAttachRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAttachMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AttachRouterFutureStub extends io.grpc.stub.AbstractFutureStub<AttachRouterFutureStub> {
    private AttachRouterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AttachRouterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AttachRouterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sia.obision.target.v1.attach.UploadAttachResponseV1> uploadAttach(
        com.sia.obision.target.v1.attach.UploadAttachRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadAttachMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sia.obision.target.v1.attach.DownloadAttachResponseV1> downloadAttach(
        com.sia.obision.target.v1.attach.DownloadAttachRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadAttachMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAttach(
        com.sia.obision.target.v1.attach.DeleteAttachRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAttachMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_ATTACH = 0;
  private static final int METHODID_DOWNLOAD_ATTACH = 1;
  private static final int METHODID_DELETE_ATTACH = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AttachRouterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AttachRouterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_ATTACH:
          serviceImpl.uploadAttach((com.sia.obision.target.v1.attach.UploadAttachRequestV1) request,
              (io.grpc.stub.StreamObserver<com.sia.obision.target.v1.attach.UploadAttachResponseV1>) responseObserver);
          break;
        case METHODID_DOWNLOAD_ATTACH:
          serviceImpl.downloadAttach((com.sia.obision.target.v1.attach.DownloadAttachRequestV1) request,
              (io.grpc.stub.StreamObserver<com.sia.obision.target.v1.attach.DownloadAttachResponseV1>) responseObserver);
          break;
        case METHODID_DELETE_ATTACH:
          serviceImpl.deleteAttach((com.sia.obision.target.v1.attach.DeleteAttachRequestV1) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AttachRouterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AttachRouterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sia.obision.target.AttachRouterOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AttachRouter");
    }
  }

  private static final class AttachRouterFileDescriptorSupplier
      extends AttachRouterBaseDescriptorSupplier {
    AttachRouterFileDescriptorSupplier() {}
  }

  private static final class AttachRouterMethodDescriptorSupplier
      extends AttachRouterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AttachRouterMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AttachRouterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AttachRouterFileDescriptorSupplier())
              .addMethod(getUploadAttachMethod())
              .addMethod(getDownloadAttachMethod())
              .addMethod(getDeleteAttachMethod())
              .build();
        }
      }
    }
    return result;
  }
}
