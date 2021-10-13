package com.sia.obision.target;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: com/sia/obision/target/TargetRouter.proto")
public final class TargetRouterGrpc {

  private TargetRouterGrpc() {}

  public static final String SERVICE_NAME = "com.sia.obision.target.TargetRouter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.CreateTargetRequestV1,
      com.google.protobuf.Empty> getCreateTargetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTarget",
      requestType = com.sia.obision.target.v1.CreateTargetRequestV1.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.CreateTargetRequestV1,
      com.google.protobuf.Empty> getCreateTargetMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.CreateTargetRequestV1, com.google.protobuf.Empty> getCreateTargetMethod;
    if ((getCreateTargetMethod = TargetRouterGrpc.getCreateTargetMethod) == null) {
      synchronized (TargetRouterGrpc.class) {
        if ((getCreateTargetMethod = TargetRouterGrpc.getCreateTargetMethod) == null) {
          TargetRouterGrpc.getCreateTargetMethod = getCreateTargetMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.CreateTargetRequestV1, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createTarget"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.CreateTargetRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TargetRouterMethodDescriptorSupplier("createTarget"))
              .build();
        }
      }
    }
    return getCreateTargetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.CreateTargetListRequestV1,
      com.google.protobuf.Empty> getCreateTargetListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTargetList",
      requestType = com.sia.obision.target.v1.CreateTargetListRequestV1.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.CreateTargetListRequestV1,
      com.google.protobuf.Empty> getCreateTargetListMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.CreateTargetListRequestV1, com.google.protobuf.Empty> getCreateTargetListMethod;
    if ((getCreateTargetListMethod = TargetRouterGrpc.getCreateTargetListMethod) == null) {
      synchronized (TargetRouterGrpc.class) {
        if ((getCreateTargetListMethod = TargetRouterGrpc.getCreateTargetListMethod) == null) {
          TargetRouterGrpc.getCreateTargetListMethod = getCreateTargetListMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.CreateTargetListRequestV1, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createTargetList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.CreateTargetListRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TargetRouterMethodDescriptorSupplier("createTargetList"))
              .build();
        }
      }
    }
    return getCreateTargetListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.TargetSearchRequestV1,
      com.sia.obision.target.v1.TargetSearchResponseV1> getTargetSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "targetSearch",
      requestType = com.sia.obision.target.v1.TargetSearchRequestV1.class,
      responseType = com.sia.obision.target.v1.TargetSearchResponseV1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.TargetSearchRequestV1,
      com.sia.obision.target.v1.TargetSearchResponseV1> getTargetSearchMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.TargetSearchRequestV1, com.sia.obision.target.v1.TargetSearchResponseV1> getTargetSearchMethod;
    if ((getTargetSearchMethod = TargetRouterGrpc.getTargetSearchMethod) == null) {
      synchronized (TargetRouterGrpc.class) {
        if ((getTargetSearchMethod = TargetRouterGrpc.getTargetSearchMethod) == null) {
          TargetRouterGrpc.getTargetSearchMethod = getTargetSearchMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.TargetSearchRequestV1, com.sia.obision.target.v1.TargetSearchResponseV1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "targetSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.TargetSearchRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.TargetSearchResponseV1.getDefaultInstance()))
              .setSchemaDescriptor(new TargetRouterMethodDescriptorSupplier("targetSearch"))
              .build();
        }
      }
    }
    return getTargetSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.TargetFilterRequestV1,
      com.sia.obision.target.v1.TargetFilterResponseV1> getTargetFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "targetFilter",
      requestType = com.sia.obision.target.v1.TargetFilterRequestV1.class,
      responseType = com.sia.obision.target.v1.TargetFilterResponseV1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.TargetFilterRequestV1,
      com.sia.obision.target.v1.TargetFilterResponseV1> getTargetFilterMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.TargetFilterRequestV1, com.sia.obision.target.v1.TargetFilterResponseV1> getTargetFilterMethod;
    if ((getTargetFilterMethod = TargetRouterGrpc.getTargetFilterMethod) == null) {
      synchronized (TargetRouterGrpc.class) {
        if ((getTargetFilterMethod = TargetRouterGrpc.getTargetFilterMethod) == null) {
          TargetRouterGrpc.getTargetFilterMethod = getTargetFilterMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.TargetFilterRequestV1, com.sia.obision.target.v1.TargetFilterResponseV1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "targetFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.TargetFilterRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.TargetFilterResponseV1.getDefaultInstance()))
              .setSchemaDescriptor(new TargetRouterMethodDescriptorSupplier("targetFilter"))
              .build();
        }
      }
    }
    return getTargetFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.UpdateTargetRequestV1,
      com.google.protobuf.Empty> getUpdateTargetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateTarget",
      requestType = com.sia.obision.target.v1.UpdateTargetRequestV1.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.UpdateTargetRequestV1,
      com.google.protobuf.Empty> getUpdateTargetMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.UpdateTargetRequestV1, com.google.protobuf.Empty> getUpdateTargetMethod;
    if ((getUpdateTargetMethod = TargetRouterGrpc.getUpdateTargetMethod) == null) {
      synchronized (TargetRouterGrpc.class) {
        if ((getUpdateTargetMethod = TargetRouterGrpc.getUpdateTargetMethod) == null) {
          TargetRouterGrpc.getUpdateTargetMethod = getUpdateTargetMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.UpdateTargetRequestV1, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateTarget"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.UpdateTargetRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TargetRouterMethodDescriptorSupplier("updateTarget"))
              .build();
        }
      }
    }
    return getUpdateTargetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.DeleteTargetRequestV1,
      com.google.protobuf.Empty> getDeleteTargetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteTarget",
      requestType = com.sia.obision.target.v1.DeleteTargetRequestV1.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.DeleteTargetRequestV1,
      com.google.protobuf.Empty> getDeleteTargetMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.DeleteTargetRequestV1, com.google.protobuf.Empty> getDeleteTargetMethod;
    if ((getDeleteTargetMethod = TargetRouterGrpc.getDeleteTargetMethod) == null) {
      synchronized (TargetRouterGrpc.class) {
        if ((getDeleteTargetMethod = TargetRouterGrpc.getDeleteTargetMethod) == null) {
          TargetRouterGrpc.getDeleteTargetMethod = getDeleteTargetMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.DeleteTargetRequestV1, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteTarget"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.DeleteTargetRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TargetRouterMethodDescriptorSupplier("deleteTarget"))
              .build();
        }
      }
    }
    return getDeleteTargetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.DeleteTargetListRequestV1,
      com.google.protobuf.Empty> getDeleteTargetListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteTargetList",
      requestType = com.sia.obision.target.v1.DeleteTargetListRequestV1.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.DeleteTargetListRequestV1,
      com.google.protobuf.Empty> getDeleteTargetListMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.DeleteTargetListRequestV1, com.google.protobuf.Empty> getDeleteTargetListMethod;
    if ((getDeleteTargetListMethod = TargetRouterGrpc.getDeleteTargetListMethod) == null) {
      synchronized (TargetRouterGrpc.class) {
        if ((getDeleteTargetListMethod = TargetRouterGrpc.getDeleteTargetListMethod) == null) {
          TargetRouterGrpc.getDeleteTargetListMethod = getDeleteTargetListMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.DeleteTargetListRequestV1, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteTargetList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.DeleteTargetListRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TargetRouterMethodDescriptorSupplier("deleteTargetList"))
              .build();
        }
      }
    }
    return getDeleteTargetListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.BookMarkRequestV1,
      com.google.protobuf.Empty> getBookMarkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bookMark",
      requestType = com.sia.obision.target.v1.BookMarkRequestV1.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.BookMarkRequestV1,
      com.google.protobuf.Empty> getBookMarkMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.BookMarkRequestV1, com.google.protobuf.Empty> getBookMarkMethod;
    if ((getBookMarkMethod = TargetRouterGrpc.getBookMarkMethod) == null) {
      synchronized (TargetRouterGrpc.class) {
        if ((getBookMarkMethod = TargetRouterGrpc.getBookMarkMethod) == null) {
          TargetRouterGrpc.getBookMarkMethod = getBookMarkMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.BookMarkRequestV1, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "bookMark"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.BookMarkRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TargetRouterMethodDescriptorSupplier("bookMark"))
              .build();
        }
      }
    }
    return getBookMarkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TargetRouterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TargetRouterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TargetRouterStub>() {
        @java.lang.Override
        public TargetRouterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TargetRouterStub(channel, callOptions);
        }
      };
    return TargetRouterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TargetRouterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TargetRouterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TargetRouterBlockingStub>() {
        @java.lang.Override
        public TargetRouterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TargetRouterBlockingStub(channel, callOptions);
        }
      };
    return TargetRouterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TargetRouterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TargetRouterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TargetRouterFutureStub>() {
        @java.lang.Override
        public TargetRouterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TargetRouterFutureStub(channel, callOptions);
        }
      };
    return TargetRouterFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TargetRouterImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTarget(com.sia.obision.target.v1.CreateTargetRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTargetMethod(), responseObserver);
    }

    /**
     */
    public void createTargetList(com.sia.obision.target.v1.CreateTargetListRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTargetListMethod(), responseObserver);
    }

    /**
     */
    public void targetSearch(com.sia.obision.target.v1.TargetSearchRequestV1 request,
        io.grpc.stub.StreamObserver<com.sia.obision.target.v1.TargetSearchResponseV1> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTargetSearchMethod(), responseObserver);
    }

    /**
     */
    public void targetFilter(com.sia.obision.target.v1.TargetFilterRequestV1 request,
        io.grpc.stub.StreamObserver<com.sia.obision.target.v1.TargetFilterResponseV1> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTargetFilterMethod(), responseObserver);
    }

    /**
     */
    public void updateTarget(com.sia.obision.target.v1.UpdateTargetRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTargetMethod(), responseObserver);
    }

    /**
     */
    public void deleteTarget(com.sia.obision.target.v1.DeleteTargetRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTargetMethod(), responseObserver);
    }

    /**
     */
    public void deleteTargetList(com.sia.obision.target.v1.DeleteTargetListRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTargetListMethod(), responseObserver);
    }

    /**
     */
    public void bookMark(com.sia.obision.target.v1.BookMarkRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBookMarkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTargetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.CreateTargetRequestV1,
                com.google.protobuf.Empty>(
                  this, METHODID_CREATE_TARGET)))
          .addMethod(
            getCreateTargetListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.CreateTargetListRequestV1,
                com.google.protobuf.Empty>(
                  this, METHODID_CREATE_TARGET_LIST)))
          .addMethod(
            getTargetSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.TargetSearchRequestV1,
                com.sia.obision.target.v1.TargetSearchResponseV1>(
                  this, METHODID_TARGET_SEARCH)))
          .addMethod(
            getTargetFilterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.TargetFilterRequestV1,
                com.sia.obision.target.v1.TargetFilterResponseV1>(
                  this, METHODID_TARGET_FILTER)))
          .addMethod(
            getUpdateTargetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.UpdateTargetRequestV1,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_TARGET)))
          .addMethod(
            getDeleteTargetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.DeleteTargetRequestV1,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_TARGET)))
          .addMethod(
            getDeleteTargetListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.DeleteTargetListRequestV1,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_TARGET_LIST)))
          .addMethod(
            getBookMarkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.BookMarkRequestV1,
                com.google.protobuf.Empty>(
                  this, METHODID_BOOK_MARK)))
          .build();
    }
  }

  /**
   */
  public static final class TargetRouterStub extends io.grpc.stub.AbstractAsyncStub<TargetRouterStub> {
    private TargetRouterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TargetRouterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TargetRouterStub(channel, callOptions);
    }

    /**
     */
    public void createTarget(com.sia.obision.target.v1.CreateTargetRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTargetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTargetList(com.sia.obision.target.v1.CreateTargetListRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTargetListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void targetSearch(com.sia.obision.target.v1.TargetSearchRequestV1 request,
        io.grpc.stub.StreamObserver<com.sia.obision.target.v1.TargetSearchResponseV1> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTargetSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void targetFilter(com.sia.obision.target.v1.TargetFilterRequestV1 request,
        io.grpc.stub.StreamObserver<com.sia.obision.target.v1.TargetFilterResponseV1> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTargetFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTarget(com.sia.obision.target.v1.UpdateTargetRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTargetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTarget(com.sia.obision.target.v1.DeleteTargetRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTargetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTargetList(com.sia.obision.target.v1.DeleteTargetListRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTargetListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bookMark(com.sia.obision.target.v1.BookMarkRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBookMarkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TargetRouterBlockingStub extends io.grpc.stub.AbstractBlockingStub<TargetRouterBlockingStub> {
    private TargetRouterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TargetRouterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TargetRouterBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty createTarget(com.sia.obision.target.v1.CreateTargetRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTargetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty createTargetList(com.sia.obision.target.v1.CreateTargetListRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTargetListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sia.obision.target.v1.TargetSearchResponseV1 targetSearch(com.sia.obision.target.v1.TargetSearchRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTargetSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sia.obision.target.v1.TargetFilterResponseV1 targetFilter(com.sia.obision.target.v1.TargetFilterRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTargetFilterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateTarget(com.sia.obision.target.v1.UpdateTargetRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTargetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteTarget(com.sia.obision.target.v1.DeleteTargetRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTargetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteTargetList(com.sia.obision.target.v1.DeleteTargetListRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTargetListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty bookMark(com.sia.obision.target.v1.BookMarkRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBookMarkMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TargetRouterFutureStub extends io.grpc.stub.AbstractFutureStub<TargetRouterFutureStub> {
    private TargetRouterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TargetRouterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TargetRouterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createTarget(
        com.sia.obision.target.v1.CreateTargetRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTargetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createTargetList(
        com.sia.obision.target.v1.CreateTargetListRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTargetListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sia.obision.target.v1.TargetSearchResponseV1> targetSearch(
        com.sia.obision.target.v1.TargetSearchRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTargetSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sia.obision.target.v1.TargetFilterResponseV1> targetFilter(
        com.sia.obision.target.v1.TargetFilterRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTargetFilterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateTarget(
        com.sia.obision.target.v1.UpdateTargetRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTargetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTarget(
        com.sia.obision.target.v1.DeleteTargetRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTargetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTargetList(
        com.sia.obision.target.v1.DeleteTargetListRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTargetListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> bookMark(
        com.sia.obision.target.v1.BookMarkRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBookMarkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TARGET = 0;
  private static final int METHODID_CREATE_TARGET_LIST = 1;
  private static final int METHODID_TARGET_SEARCH = 2;
  private static final int METHODID_TARGET_FILTER = 3;
  private static final int METHODID_UPDATE_TARGET = 4;
  private static final int METHODID_DELETE_TARGET = 5;
  private static final int METHODID_DELETE_TARGET_LIST = 6;
  private static final int METHODID_BOOK_MARK = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TargetRouterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TargetRouterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TARGET:
          serviceImpl.createTarget((com.sia.obision.target.v1.CreateTargetRequestV1) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_TARGET_LIST:
          serviceImpl.createTargetList((com.sia.obision.target.v1.CreateTargetListRequestV1) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_TARGET_SEARCH:
          serviceImpl.targetSearch((com.sia.obision.target.v1.TargetSearchRequestV1) request,
              (io.grpc.stub.StreamObserver<com.sia.obision.target.v1.TargetSearchResponseV1>) responseObserver);
          break;
        case METHODID_TARGET_FILTER:
          serviceImpl.targetFilter((com.sia.obision.target.v1.TargetFilterRequestV1) request,
              (io.grpc.stub.StreamObserver<com.sia.obision.target.v1.TargetFilterResponseV1>) responseObserver);
          break;
        case METHODID_UPDATE_TARGET:
          serviceImpl.updateTarget((com.sia.obision.target.v1.UpdateTargetRequestV1) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_TARGET:
          serviceImpl.deleteTarget((com.sia.obision.target.v1.DeleteTargetRequestV1) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_TARGET_LIST:
          serviceImpl.deleteTargetList((com.sia.obision.target.v1.DeleteTargetListRequestV1) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BOOK_MARK:
          serviceImpl.bookMark((com.sia.obision.target.v1.BookMarkRequestV1) request,
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

  private static abstract class TargetRouterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TargetRouterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sia.obision.target.TargetRouterOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TargetRouter");
    }
  }

  private static final class TargetRouterFileDescriptorSupplier
      extends TargetRouterBaseDescriptorSupplier {
    TargetRouterFileDescriptorSupplier() {}
  }

  private static final class TargetRouterMethodDescriptorSupplier
      extends TargetRouterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TargetRouterMethodDescriptorSupplier(String methodName) {
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
      synchronized (TargetRouterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TargetRouterFileDescriptorSupplier())
              .addMethod(getCreateTargetMethod())
              .addMethod(getCreateTargetListMethod())
              .addMethod(getTargetSearchMethod())
              .addMethod(getTargetFilterMethod())
              .addMethod(getUpdateTargetMethod())
              .addMethod(getDeleteTargetMethod())
              .addMethod(getDeleteTargetListMethod())
              .addMethod(getBookMarkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
