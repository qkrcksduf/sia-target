import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: account/grpc/AccountRouter.proto")
public final class AccountRouterGrpc {

  private AccountRouterGrpc() {}

  public static final String SERVICE_NAME = "AccountRouter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<StringId,
      AccountResponseProto> getGetAccountByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAccountById",
      requestType = StringId.class,
      responseType = AccountResponseProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<StringId,
      AccountResponseProto> getGetAccountByIdMethod() {
    io.grpc.MethodDescriptor<StringId, AccountResponseProto> getGetAccountByIdMethod;
    if ((getGetAccountByIdMethod = AccountRouterGrpc.getGetAccountByIdMethod) == null) {
      synchronized (AccountRouterGrpc.class) {
        if ((getGetAccountByIdMethod = AccountRouterGrpc.getGetAccountByIdMethod) == null) {
          AccountRouterGrpc.getGetAccountByIdMethod = getGetAccountByIdMethod =
              io.grpc.MethodDescriptor.<StringId, AccountResponseProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAccountById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StringId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AccountResponseProto.getDefaultInstance()))
              .setSchemaDescriptor(new AccountRouterMethodDescriptorSupplier("getAccountById"))
              .build();
        }
      }
    }
    return getGetAccountByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SignInRequestProto,
      SignInResponseProto> getSignInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "signIn",
      requestType = SignInRequestProto.class,
      responseType = SignInResponseProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SignInRequestProto,
      SignInResponseProto> getSignInMethod() {
    io.grpc.MethodDescriptor<SignInRequestProto, SignInResponseProto> getSignInMethod;
    if ((getSignInMethod = AccountRouterGrpc.getSignInMethod) == null) {
      synchronized (AccountRouterGrpc.class) {
        if ((getSignInMethod = AccountRouterGrpc.getSignInMethod) == null) {
          AccountRouterGrpc.getSignInMethod = getSignInMethod =
              io.grpc.MethodDescriptor.<SignInRequestProto, SignInResponseProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "signIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SignInRequestProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SignInResponseProto.getDefaultInstance()))
              .setSchemaDescriptor(new AccountRouterMethodDescriptorSupplier("signIn"))
              .build();
        }
      }
    }
    return getSignInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SignUpRequestProto,
      SignUpResponseProto> getSignUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "signUp",
      requestType = SignUpRequestProto.class,
      responseType = SignUpResponseProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SignUpRequestProto,
      SignUpResponseProto> getSignUpMethod() {
    io.grpc.MethodDescriptor<SignUpRequestProto, SignUpResponseProto> getSignUpMethod;
    if ((getSignUpMethod = AccountRouterGrpc.getSignUpMethod) == null) {
      synchronized (AccountRouterGrpc.class) {
        if ((getSignUpMethod = AccountRouterGrpc.getSignUpMethod) == null) {
          AccountRouterGrpc.getSignUpMethod = getSignUpMethod =
              io.grpc.MethodDescriptor.<SignUpRequestProto, SignUpResponseProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "signUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SignUpRequestProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SignUpResponseProto.getDefaultInstance()))
              .setSchemaDescriptor(new AccountRouterMethodDescriptorSupplier("signUp"))
              .build();
        }
      }
    }
    return getSignUpMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountRouterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountRouterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountRouterStub>() {
        @java.lang.Override
        public AccountRouterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountRouterStub(channel, callOptions);
        }
      };
    return AccountRouterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountRouterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountRouterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountRouterBlockingStub>() {
        @java.lang.Override
        public AccountRouterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountRouterBlockingStub(channel, callOptions);
        }
      };
    return AccountRouterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountRouterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountRouterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountRouterFutureStub>() {
        @java.lang.Override
        public AccountRouterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountRouterFutureStub(channel, callOptions);
        }
      };
    return AccountRouterFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AccountRouterImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAccountById(StringId request,
        io.grpc.stub.StreamObserver<AccountResponseProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountByIdMethod(), responseObserver);
    }

    /**
     */
    public void signIn(SignInRequestProto request,
        io.grpc.stub.StreamObserver<SignInResponseProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignInMethod(), responseObserver);
    }

    /**
     */
    public void signUp(SignUpRequestProto request,
        io.grpc.stub.StreamObserver<SignUpResponseProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignUpMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAccountByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                StringId,
                AccountResponseProto>(
                  this, METHODID_GET_ACCOUNT_BY_ID)))
          .addMethod(
            getSignInMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SignInRequestProto,
                SignInResponseProto>(
                  this, METHODID_SIGN_IN)))
          .addMethod(
            getSignUpMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SignUpRequestProto,
                SignUpResponseProto>(
                  this, METHODID_SIGN_UP)))
          .build();
    }
  }

  /**
   */
  public static final class AccountRouterStub extends io.grpc.stub.AbstractAsyncStub<AccountRouterStub> {
    private AccountRouterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountRouterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountRouterStub(channel, callOptions);
    }

    /**
     */
    public void getAccountById(StringId request,
        io.grpc.stub.StreamObserver<AccountResponseProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signIn(SignInRequestProto request,
        io.grpc.stub.StreamObserver<SignInResponseProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signUp(SignUpRequestProto request,
        io.grpc.stub.StreamObserver<SignUpResponseProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccountRouterBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountRouterBlockingStub> {
    private AccountRouterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountRouterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountRouterBlockingStub(channel, callOptions);
    }

    /**
     */
    public AccountResponseProto getAccountById(StringId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public SignInResponseProto signIn(SignInRequestProto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignInMethod(), getCallOptions(), request);
    }

    /**
     */
    public SignUpResponseProto signUp(SignUpRequestProto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignUpMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccountRouterFutureStub extends io.grpc.stub.AbstractFutureStub<AccountRouterFutureStub> {
    private AccountRouterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountRouterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountRouterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AccountResponseProto> getAccountById(
        StringId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SignInResponseProto> signIn(
        SignInRequestProto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignInMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SignUpResponseProto> signUp(
        SignUpRequestProto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACCOUNT_BY_ID = 0;
  private static final int METHODID_SIGN_IN = 1;
  private static final int METHODID_SIGN_UP = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountRouterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountRouterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ACCOUNT_BY_ID:
          serviceImpl.getAccountById((StringId) request,
              (io.grpc.stub.StreamObserver<AccountResponseProto>) responseObserver);
          break;
        case METHODID_SIGN_IN:
          serviceImpl.signIn((SignInRequestProto) request,
              (io.grpc.stub.StreamObserver<SignInResponseProto>) responseObserver);
          break;
        case METHODID_SIGN_UP:
          serviceImpl.signUp((SignUpRequestProto) request,
              (io.grpc.stub.StreamObserver<SignUpResponseProto>) responseObserver);
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

  private static abstract class AccountRouterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountRouterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return AccountRouterOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountRouter");
    }
  }

  private static final class AccountRouterFileDescriptorSupplier
      extends AccountRouterBaseDescriptorSupplier {
    AccountRouterFileDescriptorSupplier() {}
  }

  private static final class AccountRouterMethodDescriptorSupplier
      extends AccountRouterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountRouterMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountRouterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountRouterFileDescriptorSupplier())
              .addMethod(getGetAccountByIdMethod())
              .addMethod(getSignInMethod())
              .addMethod(getSignUpMethod())
              .build();
        }
      }
    }
    return result;
  }
}
