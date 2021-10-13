package com.sia.common

import com.sia.common.HealthCheckGrpc.getServiceDescriptor
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
import io.grpc.kotlin.ClientCalls.serverStreamingRpc
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.serverStreamingServerMethodDefinition
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for com.sia.common.HealthCheck.
 */
object HealthCheckGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = HealthCheckGrpc.getServiceDescriptor()

  val checkMethod: MethodDescriptor<HealthCheckRequest, HealthCheckResponse>
    @JvmStatic
    get() = HealthCheckGrpc.getCheckMethod()

  val watchMethod: MethodDescriptor<HealthCheckRequest, HealthCheckResponse>
    @JvmStatic
    get() = HealthCheckGrpc.getWatchMethod()

  /**
   * A stub for issuing RPCs to a(n) com.sia.common.HealthCheck service as suspending coroutines.
   */
  @StubFor(HealthCheckGrpc::class)
  class HealthCheckCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<HealthCheckCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): HealthCheckCoroutineStub =
        HealthCheckCoroutineStub(channel, callOptions)

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
    suspend fun check(request: HealthCheckRequest): HealthCheckResponse = unaryRpc(
      channel,
      HealthCheckGrpc.getCheckMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    fun watch(request: HealthCheckRequest): Flow<HealthCheckResponse> = serverStreamingRpc(
      channel,
      HealthCheckGrpc.getWatchMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the com.sia.common.HealthCheck service based on Kotlin coroutines.
   */
  abstract class HealthCheckCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for com.sia.common.HealthCheck.Check.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun check(request: HealthCheckRequest): HealthCheckResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.common.HealthCheck.Check is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for com.sia.common.HealthCheck.Watch.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open fun watch(request: HealthCheckRequest): Flow<HealthCheckResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.common.HealthCheck.Watch is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = HealthCheckGrpc.getCheckMethod(),
      implementation = ::check
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = HealthCheckGrpc.getWatchMethod(),
      implementation = ::watch
    )).build()
  }
}
