package com.sia.obision.target;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: com/sia/obision/target/RecordRouter.proto")
public final class RecordRouterGrpc {

  private RecordRouterGrpc() {}

  public static final String SERVICE_NAME = "com.sia.obision.target.RecordRouter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.record.CreateRecordRequestV1,
      com.sia.obision.target.v1.record.CreateRecordResponseV1> getCreateRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createRecord",
      requestType = com.sia.obision.target.v1.record.CreateRecordRequestV1.class,
      responseType = com.sia.obision.target.v1.record.CreateRecordResponseV1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.record.CreateRecordRequestV1,
      com.sia.obision.target.v1.record.CreateRecordResponseV1> getCreateRecordMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.record.CreateRecordRequestV1, com.sia.obision.target.v1.record.CreateRecordResponseV1> getCreateRecordMethod;
    if ((getCreateRecordMethod = RecordRouterGrpc.getCreateRecordMethod) == null) {
      synchronized (RecordRouterGrpc.class) {
        if ((getCreateRecordMethod = RecordRouterGrpc.getCreateRecordMethod) == null) {
          RecordRouterGrpc.getCreateRecordMethod = getCreateRecordMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.record.CreateRecordRequestV1, com.sia.obision.target.v1.record.CreateRecordResponseV1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.record.CreateRecordRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.record.CreateRecordResponseV1.getDefaultInstance()))
              .setSchemaDescriptor(new RecordRouterMethodDescriptorSupplier("createRecord"))
              .build();
        }
      }
    }
    return getCreateRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.record.UpdateRecordRequestV1,
      com.google.protobuf.Empty> getUpdateRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateRecord",
      requestType = com.sia.obision.target.v1.record.UpdateRecordRequestV1.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.record.UpdateRecordRequestV1,
      com.google.protobuf.Empty> getUpdateRecordMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.record.UpdateRecordRequestV1, com.google.protobuf.Empty> getUpdateRecordMethod;
    if ((getUpdateRecordMethod = RecordRouterGrpc.getUpdateRecordMethod) == null) {
      synchronized (RecordRouterGrpc.class) {
        if ((getUpdateRecordMethod = RecordRouterGrpc.getUpdateRecordMethod) == null) {
          RecordRouterGrpc.getUpdateRecordMethod = getUpdateRecordMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.record.UpdateRecordRequestV1, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.record.UpdateRecordRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RecordRouterMethodDescriptorSupplier("updateRecord"))
              .build();
        }
      }
    }
    return getUpdateRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.record.DeleteRecordRequestV1,
      com.google.protobuf.Empty> getDeleteRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteRecord",
      requestType = com.sia.obision.target.v1.record.DeleteRecordRequestV1.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.record.DeleteRecordRequestV1,
      com.google.protobuf.Empty> getDeleteRecordMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.record.DeleteRecordRequestV1, com.google.protobuf.Empty> getDeleteRecordMethod;
    if ((getDeleteRecordMethod = RecordRouterGrpc.getDeleteRecordMethod) == null) {
      synchronized (RecordRouterGrpc.class) {
        if ((getDeleteRecordMethod = RecordRouterGrpc.getDeleteRecordMethod) == null) {
          RecordRouterGrpc.getDeleteRecordMethod = getDeleteRecordMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.record.DeleteRecordRequestV1, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.record.DeleteRecordRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RecordRouterMethodDescriptorSupplier("deleteRecord"))
              .build();
        }
      }
    }
    return getDeleteRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.record.RecordBookMarkRequestV1,
      com.google.protobuf.Empty> getBookMarkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bookMark",
      requestType = com.sia.obision.target.v1.record.RecordBookMarkRequestV1.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.record.RecordBookMarkRequestV1,
      com.google.protobuf.Empty> getBookMarkMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.record.RecordBookMarkRequestV1, com.google.protobuf.Empty> getBookMarkMethod;
    if ((getBookMarkMethod = RecordRouterGrpc.getBookMarkMethod) == null) {
      synchronized (RecordRouterGrpc.class) {
        if ((getBookMarkMethod = RecordRouterGrpc.getBookMarkMethod) == null) {
          RecordRouterGrpc.getBookMarkMethod = getBookMarkMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.record.RecordBookMarkRequestV1, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "bookMark"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.record.RecordBookMarkRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RecordRouterMethodDescriptorSupplier("bookMark"))
              .build();
        }
      }
    }
    return getBookMarkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.record.RecordFilterRequestV1,
      com.sia.obision.target.v1.record.RecordFilterResponseV1> getRecordFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "recordFilter",
      requestType = com.sia.obision.target.v1.record.RecordFilterRequestV1.class,
      responseType = com.sia.obision.target.v1.record.RecordFilterResponseV1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.record.RecordFilterRequestV1,
      com.sia.obision.target.v1.record.RecordFilterResponseV1> getRecordFilterMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.record.RecordFilterRequestV1, com.sia.obision.target.v1.record.RecordFilterResponseV1> getRecordFilterMethod;
    if ((getRecordFilterMethod = RecordRouterGrpc.getRecordFilterMethod) == null) {
      synchronized (RecordRouterGrpc.class) {
        if ((getRecordFilterMethod = RecordRouterGrpc.getRecordFilterMethod) == null) {
          RecordRouterGrpc.getRecordFilterMethod = getRecordFilterMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.record.RecordFilterRequestV1, com.sia.obision.target.v1.record.RecordFilterResponseV1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "recordFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.record.RecordFilterRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.record.RecordFilterResponseV1.getDefaultInstance()))
              .setSchemaDescriptor(new RecordRouterMethodDescriptorSupplier("recordFilter"))
              .build();
        }
      }
    }
    return getRecordFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.record.RecordSearchRequestV1,
      com.sia.obision.target.v1.record.RecordSearchResponseV1> getRecordSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "recordSearch",
      requestType = com.sia.obision.target.v1.record.RecordSearchRequestV1.class,
      responseType = com.sia.obision.target.v1.record.RecordSearchResponseV1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.record.RecordSearchRequestV1,
      com.sia.obision.target.v1.record.RecordSearchResponseV1> getRecordSearchMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.record.RecordSearchRequestV1, com.sia.obision.target.v1.record.RecordSearchResponseV1> getRecordSearchMethod;
    if ((getRecordSearchMethod = RecordRouterGrpc.getRecordSearchMethod) == null) {
      synchronized (RecordRouterGrpc.class) {
        if ((getRecordSearchMethod = RecordRouterGrpc.getRecordSearchMethod) == null) {
          RecordRouterGrpc.getRecordSearchMethod = getRecordSearchMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.record.RecordSearchRequestV1, com.sia.obision.target.v1.record.RecordSearchResponseV1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "recordSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.record.RecordSearchRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.record.RecordSearchResponseV1.getDefaultInstance()))
              .setSchemaDescriptor(new RecordRouterMethodDescriptorSupplier("recordSearch"))
              .build();
        }
      }
    }
    return getRecordSearchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RecordRouterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecordRouterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecordRouterStub>() {
        @java.lang.Override
        public RecordRouterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecordRouterStub(channel, callOptions);
        }
      };
    return RecordRouterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RecordRouterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecordRouterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecordRouterBlockingStub>() {
        @java.lang.Override
        public RecordRouterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecordRouterBlockingStub(channel, callOptions);
        }
      };
    return RecordRouterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RecordRouterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecordRouterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecordRouterFutureStub>() {
        @java.lang.Override
        public RecordRouterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecordRouterFutureStub(channel, callOptions);
        }
      };
    return RecordRouterFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RecordRouterImplBase implements io.grpc.BindableService {

    /**
     */
    public void createRecord(com.sia.obision.target.v1.record.CreateRecordRequestV1 request,
        io.grpc.stub.StreamObserver<com.sia.obision.target.v1.record.CreateRecordResponseV1> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRecordMethod(), responseObserver);
    }

    /**
     */
    public void updateRecord(com.sia.obision.target.v1.record.UpdateRecordRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRecordMethod(), responseObserver);
    }

    /**
     */
    public void deleteRecord(com.sia.obision.target.v1.record.DeleteRecordRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRecordMethod(), responseObserver);
    }

    /**
     */
    public void bookMark(com.sia.obision.target.v1.record.RecordBookMarkRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBookMarkMethod(), responseObserver);
    }

    /**
     */
    public void recordFilter(com.sia.obision.target.v1.record.RecordFilterRequestV1 request,
        io.grpc.stub.StreamObserver<com.sia.obision.target.v1.record.RecordFilterResponseV1> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordFilterMethod(), responseObserver);
    }

    /**
     */
    public void recordSearch(com.sia.obision.target.v1.record.RecordSearchRequestV1 request,
        io.grpc.stub.StreamObserver<com.sia.obision.target.v1.record.RecordSearchResponseV1> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordSearchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateRecordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.record.CreateRecordRequestV1,
                com.sia.obision.target.v1.record.CreateRecordResponseV1>(
                  this, METHODID_CREATE_RECORD)))
          .addMethod(
            getUpdateRecordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.record.UpdateRecordRequestV1,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_RECORD)))
          .addMethod(
            getDeleteRecordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.record.DeleteRecordRequestV1,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_RECORD)))
          .addMethod(
            getBookMarkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.record.RecordBookMarkRequestV1,
                com.google.protobuf.Empty>(
                  this, METHODID_BOOK_MARK)))
          .addMethod(
            getRecordFilterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.record.RecordFilterRequestV1,
                com.sia.obision.target.v1.record.RecordFilterResponseV1>(
                  this, METHODID_RECORD_FILTER)))
          .addMethod(
            getRecordSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.record.RecordSearchRequestV1,
                com.sia.obision.target.v1.record.RecordSearchResponseV1>(
                  this, METHODID_RECORD_SEARCH)))
          .build();
    }
  }

  /**
   */
  public static final class RecordRouterStub extends io.grpc.stub.AbstractAsyncStub<RecordRouterStub> {
    private RecordRouterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecordRouterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecordRouterStub(channel, callOptions);
    }

    /**
     */
    public void createRecord(com.sia.obision.target.v1.record.CreateRecordRequestV1 request,
        io.grpc.stub.StreamObserver<com.sia.obision.target.v1.record.CreateRecordResponseV1> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRecord(com.sia.obision.target.v1.record.UpdateRecordRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRecord(com.sia.obision.target.v1.record.DeleteRecordRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bookMark(com.sia.obision.target.v1.record.RecordBookMarkRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBookMarkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void recordFilter(com.sia.obision.target.v1.record.RecordFilterRequestV1 request,
        io.grpc.stub.StreamObserver<com.sia.obision.target.v1.record.RecordFilterResponseV1> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecordFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void recordSearch(com.sia.obision.target.v1.record.RecordSearchRequestV1 request,
        io.grpc.stub.StreamObserver<com.sia.obision.target.v1.record.RecordSearchResponseV1> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecordSearchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RecordRouterBlockingStub extends io.grpc.stub.AbstractBlockingStub<RecordRouterBlockingStub> {
    private RecordRouterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecordRouterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecordRouterBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sia.obision.target.v1.record.CreateRecordResponseV1 createRecord(com.sia.obision.target.v1.record.CreateRecordRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRecordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateRecord(com.sia.obision.target.v1.record.UpdateRecordRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRecordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteRecord(com.sia.obision.target.v1.record.DeleteRecordRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRecordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty bookMark(com.sia.obision.target.v1.record.RecordBookMarkRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBookMarkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sia.obision.target.v1.record.RecordFilterResponseV1 recordFilter(com.sia.obision.target.v1.record.RecordFilterRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordFilterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sia.obision.target.v1.record.RecordSearchResponseV1 recordSearch(com.sia.obision.target.v1.record.RecordSearchRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordSearchMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RecordRouterFutureStub extends io.grpc.stub.AbstractFutureStub<RecordRouterFutureStub> {
    private RecordRouterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecordRouterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecordRouterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sia.obision.target.v1.record.CreateRecordResponseV1> createRecord(
        com.sia.obision.target.v1.record.CreateRecordRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRecordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateRecord(
        com.sia.obision.target.v1.record.UpdateRecordRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRecordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteRecord(
        com.sia.obision.target.v1.record.DeleteRecordRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRecordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> bookMark(
        com.sia.obision.target.v1.record.RecordBookMarkRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBookMarkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sia.obision.target.v1.record.RecordFilterResponseV1> recordFilter(
        com.sia.obision.target.v1.record.RecordFilterRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecordFilterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sia.obision.target.v1.record.RecordSearchResponseV1> recordSearch(
        com.sia.obision.target.v1.record.RecordSearchRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecordSearchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_RECORD = 0;
  private static final int METHODID_UPDATE_RECORD = 1;
  private static final int METHODID_DELETE_RECORD = 2;
  private static final int METHODID_BOOK_MARK = 3;
  private static final int METHODID_RECORD_FILTER = 4;
  private static final int METHODID_RECORD_SEARCH = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RecordRouterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RecordRouterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_RECORD:
          serviceImpl.createRecord((com.sia.obision.target.v1.record.CreateRecordRequestV1) request,
              (io.grpc.stub.StreamObserver<com.sia.obision.target.v1.record.CreateRecordResponseV1>) responseObserver);
          break;
        case METHODID_UPDATE_RECORD:
          serviceImpl.updateRecord((com.sia.obision.target.v1.record.UpdateRecordRequestV1) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_RECORD:
          serviceImpl.deleteRecord((com.sia.obision.target.v1.record.DeleteRecordRequestV1) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BOOK_MARK:
          serviceImpl.bookMark((com.sia.obision.target.v1.record.RecordBookMarkRequestV1) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RECORD_FILTER:
          serviceImpl.recordFilter((com.sia.obision.target.v1.record.RecordFilterRequestV1) request,
              (io.grpc.stub.StreamObserver<com.sia.obision.target.v1.record.RecordFilterResponseV1>) responseObserver);
          break;
        case METHODID_RECORD_SEARCH:
          serviceImpl.recordSearch((com.sia.obision.target.v1.record.RecordSearchRequestV1) request,
              (io.grpc.stub.StreamObserver<com.sia.obision.target.v1.record.RecordSearchResponseV1>) responseObserver);
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

  private static abstract class RecordRouterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RecordRouterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sia.obision.target.RecordRouterOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RecordRouter");
    }
  }

  private static final class RecordRouterFileDescriptorSupplier
      extends RecordRouterBaseDescriptorSupplier {
    RecordRouterFileDescriptorSupplier() {}
  }

  private static final class RecordRouterMethodDescriptorSupplier
      extends RecordRouterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RecordRouterMethodDescriptorSupplier(String methodName) {
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
      synchronized (RecordRouterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RecordRouterFileDescriptorSupplier())
              .addMethod(getCreateRecordMethod())
              .addMethod(getUpdateRecordMethod())
              .addMethod(getDeleteRecordMethod())
              .addMethod(getBookMarkMethod())
              .addMethod(getRecordFilterMethod())
              .addMethod(getRecordSearchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
