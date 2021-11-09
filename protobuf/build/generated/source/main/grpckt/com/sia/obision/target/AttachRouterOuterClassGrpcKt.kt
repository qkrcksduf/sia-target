package com.sia.obision.target

import com.google.protobuf.Empty
import com.sia.obision.target.AttachRouterGrpc.getServiceDescriptor
import com.sia.obision.target.v1.attach.DeleteAttachRequestV1
import com.sia.obision.target.v1.attach.DownloadAttachRequestV1
import com.sia.obision.target.v1.attach.DownloadAttachResponseV1
import com.sia.obision.target.v1.attach.UploadAttachRequestV1
import com.sia.obision.target.v1.attach.UploadAttachResponseV1
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
 * Holder for Kotlin coroutine-based client and server APIs for com.sia.obision.target.AttachRouter.
 */
object AttachRouterGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = AttachRouterGrpc.getServiceDescriptor()

  val uploadAttachMethod: MethodDescriptor<UploadAttachRequestV1, UploadAttachResponseV1>
    @JvmStatic
    get() = AttachRouterGrpc.getUploadAttachMethod()

  val downloadAttachMethod: MethodDescriptor<DownloadAttachRequestV1, DownloadAttachResponseV1>
    @JvmStatic
    get() = AttachRouterGrpc.getDownloadAttachMethod()

  val deleteAttachMethod: MethodDescriptor<DeleteAttachRequestV1, Empty>
    @JvmStatic
    get() = AttachRouterGrpc.getDeleteAttachMethod()

  /**
   * A stub for issuing RPCs to a(n) com.sia.obision.target.AttachRouter service as suspending
   * coroutines.
   */
  @StubFor(AttachRouterGrpc::class)
  class AttachRouterCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<AttachRouterCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): AttachRouterCoroutineStub =
        AttachRouterCoroutineStub(channel, callOptions)

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
    suspend fun uploadAttach(request: UploadAttachRequestV1): UploadAttachResponseV1 = unaryRpc(
      channel,
      AttachRouterGrpc.getUploadAttachMethod(),
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
    suspend fun downloadAttach(request: DownloadAttachRequestV1): DownloadAttachResponseV1 =
        unaryRpc(
      channel,
      AttachRouterGrpc.getDownloadAttachMethod(),
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
    suspend fun deleteAttach(request: DeleteAttachRequestV1): Empty = unaryRpc(
      channel,
      AttachRouterGrpc.getDeleteAttachMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the com.sia.obision.target.AttachRouter service based on Kotlin
   * coroutines.
   */
  abstract class AttachRouterCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for com.sia.obision.target.AttachRouter.uploadAttach.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun uploadAttach(request: UploadAttachRequestV1): UploadAttachResponseV1 = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.AttachRouter.uploadAttach is unimplemented"))

    /**
     * Returns the response to an RPC for com.sia.obision.target.AttachRouter.downloadAttach.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun downloadAttach(request: DownloadAttachRequestV1): DownloadAttachResponseV1 =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.AttachRouter.downloadAttach is unimplemented"))

    /**
     * Returns the response to an RPC for com.sia.obision.target.AttachRouter.deleteAttach.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteAttach(request: DeleteAttachRequestV1): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.AttachRouter.deleteAttach is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttachRouterGrpc.getUploadAttachMethod(),
      implementation = ::uploadAttach
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttachRouterGrpc.getDownloadAttachMethod(),
      implementation = ::downloadAttach
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttachRouterGrpc.getDeleteAttachMethod(),
      implementation = ::deleteAttach
    )).build()
  }
}
