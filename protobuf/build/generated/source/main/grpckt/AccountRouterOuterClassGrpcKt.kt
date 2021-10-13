import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for AccountRouter.
 */
object AccountRouterGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = AccountRouterGrpc.getServiceDescriptor()

  val getAccountByIdMethod: MethodDescriptor<StringId, AccountResponseProto>
    @JvmStatic
    get() = AccountRouterGrpc.getGetAccountByIdMethod()

  val signInMethod: MethodDescriptor<SignInRequestProto, SignInResponseProto>
    @JvmStatic
    get() = AccountRouterGrpc.getSignInMethod()

  val signUpMethod: MethodDescriptor<SignUpRequestProto, SignUpResponseProto>
    @JvmStatic
    get() = AccountRouterGrpc.getSignUpMethod()

  /**
   * A stub for issuing RPCs to a(n) AccountRouter service as suspending coroutines.
   */
  @StubFor(AccountRouterGrpc::class)
  class AccountRouterCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<AccountRouterCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): AccountRouterCoroutineStub =
        AccountRouterCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun getAccountById(request: StringId): AccountResponseProto = unaryRpc(
      channel,
      AccountRouterGrpc.getGetAccountByIdMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun signIn(request: SignInRequestProto): SignInResponseProto = unaryRpc(
      channel,
      AccountRouterGrpc.getSignInMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun signUp(request: SignUpRequestProto): SignUpResponseProto = unaryRpc(
      channel,
      AccountRouterGrpc.getSignUpMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the AccountRouter service based on Kotlin coroutines.
   */
  abstract class AccountRouterCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for AccountRouter.getAccountById.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getAccountById(request: StringId): AccountResponseProto = throw
        StatusException(UNIMPLEMENTED.withDescription("Method AccountRouter.getAccountById is unimplemented"))

    /**
     * Returns the response to an RPC for AccountRouter.signIn.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun signIn(request: SignInRequestProto): SignInResponseProto = throw
        StatusException(UNIMPLEMENTED.withDescription("Method AccountRouter.signIn is unimplemented"))

    /**
     * Returns the response to an RPC for AccountRouter.signUp.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun signUp(request: SignUpRequestProto): SignUpResponseProto = throw
        StatusException(UNIMPLEMENTED.withDescription("Method AccountRouter.signUp is unimplemented"))

    final override fun bindService(): ServerServiceDefinition =
        builder(AccountRouterGrpc.getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountRouterGrpc.getGetAccountByIdMethod(),
      implementation = ::getAccountById
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountRouterGrpc.getSignInMethod(),
      implementation = ::signIn
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountRouterGrpc.getSignUpMethod(),
      implementation = ::signUp
    )).build()
  }
}
