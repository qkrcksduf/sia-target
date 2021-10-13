package com.sia.obision.target

import com.google.protobuf.Empty
import com.sia.obision.target.TargetRouterGrpc.getServiceDescriptor
import com.sia.obision.target.v1.BookMarkRequestV1
import com.sia.obision.target.v1.CreateTargetListRequestV1
import com.sia.obision.target.v1.CreateTargetRequestV1
import com.sia.obision.target.v1.DeleteTargetListRequestV1
import com.sia.obision.target.v1.DeleteTargetRequestV1
import com.sia.obision.target.v1.TargetFilterRequestV1
import com.sia.obision.target.v1.TargetFilterResponseV1
import com.sia.obision.target.v1.TargetSearchRequestV1
import com.sia.obision.target.v1.TargetSearchResponseV1
import com.sia.obision.target.v1.UpdateTargetRequestV1
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
 * Holder for Kotlin coroutine-based client and server APIs for com.sia.obision.target.TargetRouter.
 */
object TargetRouterGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = TargetRouterGrpc.getServiceDescriptor()

  val createTargetMethod: MethodDescriptor<CreateTargetRequestV1, Empty>
    @JvmStatic
    get() = TargetRouterGrpc.getCreateTargetMethod()

  val createTargetListMethod: MethodDescriptor<CreateTargetListRequestV1, Empty>
    @JvmStatic
    get() = TargetRouterGrpc.getCreateTargetListMethod()

  val targetSearchMethod: MethodDescriptor<TargetSearchRequestV1, TargetSearchResponseV1>
    @JvmStatic
    get() = TargetRouterGrpc.getTargetSearchMethod()

  val targetFilterMethod: MethodDescriptor<TargetFilterRequestV1, TargetFilterResponseV1>
    @JvmStatic
    get() = TargetRouterGrpc.getTargetFilterMethod()

  val updateTargetMethod: MethodDescriptor<UpdateTargetRequestV1, Empty>
    @JvmStatic
    get() = TargetRouterGrpc.getUpdateTargetMethod()

  val deleteTargetMethod: MethodDescriptor<DeleteTargetRequestV1, Empty>
    @JvmStatic
    get() = TargetRouterGrpc.getDeleteTargetMethod()

  val deleteTargetListMethod: MethodDescriptor<DeleteTargetListRequestV1, Empty>
    @JvmStatic
    get() = TargetRouterGrpc.getDeleteTargetListMethod()

  val bookMarkMethod: MethodDescriptor<BookMarkRequestV1, Empty>
    @JvmStatic
    get() = TargetRouterGrpc.getBookMarkMethod()

  /**
   * A stub for issuing RPCs to a(n) com.sia.obision.target.TargetRouter service as suspending
   * coroutines.
   */
  @StubFor(TargetRouterGrpc::class)
  class TargetRouterCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<TargetRouterCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): TargetRouterCoroutineStub =
        TargetRouterCoroutineStub(channel, callOptions)

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
    suspend fun createTarget(request: CreateTargetRequestV1): Empty = unaryRpc(
      channel,
      TargetRouterGrpc.getCreateTargetMethod(),
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
    suspend fun createTargetList(request: CreateTargetListRequestV1): Empty = unaryRpc(
      channel,
      TargetRouterGrpc.getCreateTargetListMethod(),
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
    suspend fun targetSearch(request: TargetSearchRequestV1): TargetSearchResponseV1 = unaryRpc(
      channel,
      TargetRouterGrpc.getTargetSearchMethod(),
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
    suspend fun targetFilter(request: TargetFilterRequestV1): TargetFilterResponseV1 = unaryRpc(
      channel,
      TargetRouterGrpc.getTargetFilterMethod(),
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
    suspend fun updateTarget(request: UpdateTargetRequestV1): Empty = unaryRpc(
      channel,
      TargetRouterGrpc.getUpdateTargetMethod(),
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
    suspend fun deleteTarget(request: DeleteTargetRequestV1): Empty = unaryRpc(
      channel,
      TargetRouterGrpc.getDeleteTargetMethod(),
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
    suspend fun deleteTargetList(request: DeleteTargetListRequestV1): Empty = unaryRpc(
      channel,
      TargetRouterGrpc.getDeleteTargetListMethod(),
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
    suspend fun bookMark(request: BookMarkRequestV1): Empty = unaryRpc(
      channel,
      TargetRouterGrpc.getBookMarkMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the com.sia.obision.target.TargetRouter service based on Kotlin
   * coroutines.
   */
  abstract class TargetRouterCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for com.sia.obision.target.TargetRouter.createTarget.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createTarget(request: CreateTargetRequestV1): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.TargetRouter.createTarget is unimplemented"))

    /**
     * Returns the response to an RPC for com.sia.obision.target.TargetRouter.createTargetList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createTargetList(request: CreateTargetListRequestV1): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.TargetRouter.createTargetList is unimplemented"))

    /**
     * Returns the response to an RPC for com.sia.obision.target.TargetRouter.targetSearch.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun targetSearch(request: TargetSearchRequestV1): TargetSearchResponseV1 = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.TargetRouter.targetSearch is unimplemented"))

    /**
     * Returns the response to an RPC for com.sia.obision.target.TargetRouter.targetFilter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun targetFilter(request: TargetFilterRequestV1): TargetFilterResponseV1 = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.TargetRouter.targetFilter is unimplemented"))

    /**
     * Returns the response to an RPC for com.sia.obision.target.TargetRouter.updateTarget.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun updateTarget(request: UpdateTargetRequestV1): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.TargetRouter.updateTarget is unimplemented"))

    /**
     * Returns the response to an RPC for com.sia.obision.target.TargetRouter.deleteTarget.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteTarget(request: DeleteTargetRequestV1): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.TargetRouter.deleteTarget is unimplemented"))

    /**
     * Returns the response to an RPC for com.sia.obision.target.TargetRouter.deleteTargetList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteTargetList(request: DeleteTargetListRequestV1): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.TargetRouter.deleteTargetList is unimplemented"))

    /**
     * Returns the response to an RPC for com.sia.obision.target.TargetRouter.bookMark.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun bookMark(request: BookMarkRequestV1): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.TargetRouter.bookMark is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TargetRouterGrpc.getCreateTargetMethod(),
      implementation = ::createTarget
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TargetRouterGrpc.getCreateTargetListMethod(),
      implementation = ::createTargetList
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TargetRouterGrpc.getTargetSearchMethod(),
      implementation = ::targetSearch
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TargetRouterGrpc.getTargetFilterMethod(),
      implementation = ::targetFilter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TargetRouterGrpc.getUpdateTargetMethod(),
      implementation = ::updateTarget
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TargetRouterGrpc.getDeleteTargetMethod(),
      implementation = ::deleteTarget
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TargetRouterGrpc.getDeleteTargetListMethod(),
      implementation = ::deleteTargetList
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TargetRouterGrpc.getBookMarkMethod(),
      implementation = ::bookMark
    )).build()
  }
}
