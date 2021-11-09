package com.sia.obision.target;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: com/sia/obision/target/CategoryRouter.proto")
public final class CategoryRouterGrpc {

  private CategoryRouterGrpc() {}

  public static final String SERVICE_NAME = "com.sia.obision.target.CategoryRouter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.category.CreateCategoryRequestV1,
      com.sia.obision.target.v1.category.CreateCategoryResponseV1> getCreateCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createCategory",
      requestType = com.sia.obision.target.v1.category.CreateCategoryRequestV1.class,
      responseType = com.sia.obision.target.v1.category.CreateCategoryResponseV1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.category.CreateCategoryRequestV1,
      com.sia.obision.target.v1.category.CreateCategoryResponseV1> getCreateCategoryMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.category.CreateCategoryRequestV1, com.sia.obision.target.v1.category.CreateCategoryResponseV1> getCreateCategoryMethod;
    if ((getCreateCategoryMethod = CategoryRouterGrpc.getCreateCategoryMethod) == null) {
      synchronized (CategoryRouterGrpc.class) {
        if ((getCreateCategoryMethod = CategoryRouterGrpc.getCreateCategoryMethod) == null) {
          CategoryRouterGrpc.getCreateCategoryMethod = getCreateCategoryMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.category.CreateCategoryRequestV1, com.sia.obision.target.v1.category.CreateCategoryResponseV1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.category.CreateCategoryRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.category.CreateCategoryResponseV1.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryRouterMethodDescriptorSupplier("createCategory"))
              .build();
        }
      }
    }
    return getCreateCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.category.CreateCategoryListRequestV1,
      com.sia.obision.target.v1.category.CreateCategoryListResponseV1> getCreateCategoryListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createCategoryList",
      requestType = com.sia.obision.target.v1.category.CreateCategoryListRequestV1.class,
      responseType = com.sia.obision.target.v1.category.CreateCategoryListResponseV1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.category.CreateCategoryListRequestV1,
      com.sia.obision.target.v1.category.CreateCategoryListResponseV1> getCreateCategoryListMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.category.CreateCategoryListRequestV1, com.sia.obision.target.v1.category.CreateCategoryListResponseV1> getCreateCategoryListMethod;
    if ((getCreateCategoryListMethod = CategoryRouterGrpc.getCreateCategoryListMethod) == null) {
      synchronized (CategoryRouterGrpc.class) {
        if ((getCreateCategoryListMethod = CategoryRouterGrpc.getCreateCategoryListMethod) == null) {
          CategoryRouterGrpc.getCreateCategoryListMethod = getCreateCategoryListMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.category.CreateCategoryListRequestV1, com.sia.obision.target.v1.category.CreateCategoryListResponseV1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createCategoryList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.category.CreateCategoryListRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.category.CreateCategoryListResponseV1.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryRouterMethodDescriptorSupplier("createCategoryList"))
              .build();
        }
      }
    }
    return getCreateCategoryListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.sia.obision.target.v1.category.GetCategoryListResponseV1> getGetCategoryListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCategoryList",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.sia.obision.target.v1.category.GetCategoryListResponseV1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.sia.obision.target.v1.category.GetCategoryListResponseV1> getGetCategoryListMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.sia.obision.target.v1.category.GetCategoryListResponseV1> getGetCategoryListMethod;
    if ((getGetCategoryListMethod = CategoryRouterGrpc.getGetCategoryListMethod) == null) {
      synchronized (CategoryRouterGrpc.class) {
        if ((getGetCategoryListMethod = CategoryRouterGrpc.getGetCategoryListMethod) == null) {
          CategoryRouterGrpc.getGetCategoryListMethod = getGetCategoryListMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.sia.obision.target.v1.category.GetCategoryListResponseV1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCategoryList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.category.GetCategoryListResponseV1.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryRouterMethodDescriptorSupplier("getCategoryList"))
              .build();
        }
      }
    }
    return getGetCategoryListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.category.UpdateCategoryRequestV1,
      com.google.protobuf.Empty> getUpdateCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateCategory",
      requestType = com.sia.obision.target.v1.category.UpdateCategoryRequestV1.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.category.UpdateCategoryRequestV1,
      com.google.protobuf.Empty> getUpdateCategoryMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.category.UpdateCategoryRequestV1, com.google.protobuf.Empty> getUpdateCategoryMethod;
    if ((getUpdateCategoryMethod = CategoryRouterGrpc.getUpdateCategoryMethod) == null) {
      synchronized (CategoryRouterGrpc.class) {
        if ((getUpdateCategoryMethod = CategoryRouterGrpc.getUpdateCategoryMethod) == null) {
          CategoryRouterGrpc.getUpdateCategoryMethod = getUpdateCategoryMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.category.UpdateCategoryRequestV1, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.category.UpdateCategoryRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryRouterMethodDescriptorSupplier("updateCategory"))
              .build();
        }
      }
    }
    return getUpdateCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.category.DeleteCategoryRequestV1,
      com.google.protobuf.Empty> getDeleteCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteCategory",
      requestType = com.sia.obision.target.v1.category.DeleteCategoryRequestV1.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.category.DeleteCategoryRequestV1,
      com.google.protobuf.Empty> getDeleteCategoryMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.category.DeleteCategoryRequestV1, com.google.protobuf.Empty> getDeleteCategoryMethod;
    if ((getDeleteCategoryMethod = CategoryRouterGrpc.getDeleteCategoryMethod) == null) {
      synchronized (CategoryRouterGrpc.class) {
        if ((getDeleteCategoryMethod = CategoryRouterGrpc.getDeleteCategoryMethod) == null) {
          CategoryRouterGrpc.getDeleteCategoryMethod = getDeleteCategoryMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.category.DeleteCategoryRequestV1, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.category.DeleteCategoryRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryRouterMethodDescriptorSupplier("deleteCategory"))
              .build();
        }
      }
    }
    return getDeleteCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sia.obision.target.v1.category.DeleteCategoryListRequestV1,
      com.google.protobuf.Empty> getDeleteCategoryListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteCategoryList",
      requestType = com.sia.obision.target.v1.category.DeleteCategoryListRequestV1.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sia.obision.target.v1.category.DeleteCategoryListRequestV1,
      com.google.protobuf.Empty> getDeleteCategoryListMethod() {
    io.grpc.MethodDescriptor<com.sia.obision.target.v1.category.DeleteCategoryListRequestV1, com.google.protobuf.Empty> getDeleteCategoryListMethod;
    if ((getDeleteCategoryListMethod = CategoryRouterGrpc.getDeleteCategoryListMethod) == null) {
      synchronized (CategoryRouterGrpc.class) {
        if ((getDeleteCategoryListMethod = CategoryRouterGrpc.getDeleteCategoryListMethod) == null) {
          CategoryRouterGrpc.getDeleteCategoryListMethod = getDeleteCategoryListMethod =
              io.grpc.MethodDescriptor.<com.sia.obision.target.v1.category.DeleteCategoryListRequestV1, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteCategoryList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sia.obision.target.v1.category.DeleteCategoryListRequestV1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryRouterMethodDescriptorSupplier("deleteCategoryList"))
              .build();
        }
      }
    }
    return getDeleteCategoryListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CategoryRouterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CategoryRouterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CategoryRouterStub>() {
        @java.lang.Override
        public CategoryRouterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CategoryRouterStub(channel, callOptions);
        }
      };
    return CategoryRouterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CategoryRouterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CategoryRouterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CategoryRouterBlockingStub>() {
        @java.lang.Override
        public CategoryRouterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CategoryRouterBlockingStub(channel, callOptions);
        }
      };
    return CategoryRouterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CategoryRouterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CategoryRouterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CategoryRouterFutureStub>() {
        @java.lang.Override
        public CategoryRouterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CategoryRouterFutureStub(channel, callOptions);
        }
      };
    return CategoryRouterFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CategoryRouterImplBase implements io.grpc.BindableService {

    /**
     */
    public void createCategory(com.sia.obision.target.v1.category.CreateCategoryRequestV1 request,
        io.grpc.stub.StreamObserver<com.sia.obision.target.v1.category.CreateCategoryResponseV1> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCategoryMethod(), responseObserver);
    }

    /**
     */
    public void createCategoryList(com.sia.obision.target.v1.category.CreateCategoryListRequestV1 request,
        io.grpc.stub.StreamObserver<com.sia.obision.target.v1.category.CreateCategoryListResponseV1> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCategoryListMethod(), responseObserver);
    }

    /**
     */
    public void getCategoryList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.sia.obision.target.v1.category.GetCategoryListResponseV1> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCategoryListMethod(), responseObserver);
    }

    /**
     */
    public void updateCategory(com.sia.obision.target.v1.category.UpdateCategoryRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCategoryMethod(), responseObserver);
    }

    /**
     */
    public void deleteCategory(com.sia.obision.target.v1.category.DeleteCategoryRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCategoryMethod(), responseObserver);
    }

    /**
     */
    public void deleteCategoryList(com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCategoryListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCategoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.category.CreateCategoryRequestV1,
                com.sia.obision.target.v1.category.CreateCategoryResponseV1>(
                  this, METHODID_CREATE_CATEGORY)))
          .addMethod(
            getCreateCategoryListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.category.CreateCategoryListRequestV1,
                com.sia.obision.target.v1.category.CreateCategoryListResponseV1>(
                  this, METHODID_CREATE_CATEGORY_LIST)))
          .addMethod(
            getGetCategoryListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.sia.obision.target.v1.category.GetCategoryListResponseV1>(
                  this, METHODID_GET_CATEGORY_LIST)))
          .addMethod(
            getUpdateCategoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.category.UpdateCategoryRequestV1,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_CATEGORY)))
          .addMethod(
            getDeleteCategoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.category.DeleteCategoryRequestV1,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_CATEGORY)))
          .addMethod(
            getDeleteCategoryListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sia.obision.target.v1.category.DeleteCategoryListRequestV1,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_CATEGORY_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class CategoryRouterStub extends io.grpc.stub.AbstractAsyncStub<CategoryRouterStub> {
    private CategoryRouterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryRouterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CategoryRouterStub(channel, callOptions);
    }

    /**
     */
    public void createCategory(com.sia.obision.target.v1.category.CreateCategoryRequestV1 request,
        io.grpc.stub.StreamObserver<com.sia.obision.target.v1.category.CreateCategoryResponseV1> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCategoryList(com.sia.obision.target.v1.category.CreateCategoryListRequestV1 request,
        io.grpc.stub.StreamObserver<com.sia.obision.target.v1.category.CreateCategoryListResponseV1> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCategoryListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCategoryList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.sia.obision.target.v1.category.GetCategoryListResponseV1> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCategoryListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCategory(com.sia.obision.target.v1.category.UpdateCategoryRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCategory(com.sia.obision.target.v1.category.DeleteCategoryRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCategoryList(com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCategoryListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CategoryRouterBlockingStub extends io.grpc.stub.AbstractBlockingStub<CategoryRouterBlockingStub> {
    private CategoryRouterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryRouterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CategoryRouterBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sia.obision.target.v1.category.CreateCategoryResponseV1 createCategory(com.sia.obision.target.v1.category.CreateCategoryRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCategoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sia.obision.target.v1.category.CreateCategoryListResponseV1 createCategoryList(com.sia.obision.target.v1.category.CreateCategoryListRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCategoryListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sia.obision.target.v1.category.GetCategoryListResponseV1 getCategoryList(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCategoryListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateCategory(com.sia.obision.target.v1.category.UpdateCategoryRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCategoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteCategory(com.sia.obision.target.v1.category.DeleteCategoryRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCategoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteCategoryList(com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCategoryListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CategoryRouterFutureStub extends io.grpc.stub.AbstractFutureStub<CategoryRouterFutureStub> {
    private CategoryRouterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryRouterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CategoryRouterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sia.obision.target.v1.category.CreateCategoryResponseV1> createCategory(
        com.sia.obision.target.v1.category.CreateCategoryRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCategoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sia.obision.target.v1.category.CreateCategoryListResponseV1> createCategoryList(
        com.sia.obision.target.v1.category.CreateCategoryListRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCategoryListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sia.obision.target.v1.category.GetCategoryListResponseV1> getCategoryList(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCategoryListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateCategory(
        com.sia.obision.target.v1.category.UpdateCategoryRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCategoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteCategory(
        com.sia.obision.target.v1.category.DeleteCategoryRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCategoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteCategoryList(
        com.sia.obision.target.v1.category.DeleteCategoryListRequestV1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCategoryListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CATEGORY = 0;
  private static final int METHODID_CREATE_CATEGORY_LIST = 1;
  private static final int METHODID_GET_CATEGORY_LIST = 2;
  private static final int METHODID_UPDATE_CATEGORY = 3;
  private static final int METHODID_DELETE_CATEGORY = 4;
  private static final int METHODID_DELETE_CATEGORY_LIST = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CategoryRouterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CategoryRouterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CATEGORY:
          serviceImpl.createCategory((com.sia.obision.target.v1.category.CreateCategoryRequestV1) request,
              (io.grpc.stub.StreamObserver<com.sia.obision.target.v1.category.CreateCategoryResponseV1>) responseObserver);
          break;
        case METHODID_CREATE_CATEGORY_LIST:
          serviceImpl.createCategoryList((com.sia.obision.target.v1.category.CreateCategoryListRequestV1) request,
              (io.grpc.stub.StreamObserver<com.sia.obision.target.v1.category.CreateCategoryListResponseV1>) responseObserver);
          break;
        case METHODID_GET_CATEGORY_LIST:
          serviceImpl.getCategoryList((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.sia.obision.target.v1.category.GetCategoryListResponseV1>) responseObserver);
          break;
        case METHODID_UPDATE_CATEGORY:
          serviceImpl.updateCategory((com.sia.obision.target.v1.category.UpdateCategoryRequestV1) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_CATEGORY:
          serviceImpl.deleteCategory((com.sia.obision.target.v1.category.DeleteCategoryRequestV1) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_CATEGORY_LIST:
          serviceImpl.deleteCategoryList((com.sia.obision.target.v1.category.DeleteCategoryListRequestV1) request,
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

  private static abstract class CategoryRouterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CategoryRouterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sia.obision.target.CategoryRouterOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CategoryRouter");
    }
  }

  private static final class CategoryRouterFileDescriptorSupplier
      extends CategoryRouterBaseDescriptorSupplier {
    CategoryRouterFileDescriptorSupplier() {}
  }

  private static final class CategoryRouterMethodDescriptorSupplier
      extends CategoryRouterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CategoryRouterMethodDescriptorSupplier(String methodName) {
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
      synchronized (CategoryRouterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CategoryRouterFileDescriptorSupplier())
              .addMethod(getCreateCategoryMethod())
              .addMethod(getCreateCategoryListMethod())
              .addMethod(getGetCategoryListMethod())
              .addMethod(getUpdateCategoryMethod())
              .addMethod(getDeleteCategoryMethod())
              .addMethod(getDeleteCategoryListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
