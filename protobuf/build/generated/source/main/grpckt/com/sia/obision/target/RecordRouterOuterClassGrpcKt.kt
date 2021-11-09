package com.sia.obision.target

import com.google.protobuf.Empty
import com.sia.obision.target.RecordRouterGrpc.getServiceDescriptor
import com.sia.obision.target.v1.record.CreateRecordRequestV1
import com.sia.obision.target.v1.record.CreateRecordResponseV1
import com.sia.obision.target.v1.record.DeleteRecordRequestV1
import com.sia.obision.target.v1.record.RecordBookMarkRequestV1
import com.sia.obision.target.v1.record.RecordFilterRequestV1
import com.sia.obision.target.v1.record.RecordFilterResponseV1
import com.sia.obision.target.v1.record.RecordSearchRequestV1
import com.sia.obision.target.v1.record.RecordSearchResponseV1
import com.sia.obision.target.v1.record.UpdateRecordRequestV1
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
 * Holder for Kotlin coroutine-based client and server APIs for com.sia.obision.target.RecordRouter.
 */
object RecordRouterGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = RecordRouterGrpc.getServiceDescriptor()

  val createRecordMethod: MethodDescriptor<CreateRecordRequestV1, CreateRecordResponseV1>
    @JvmStatic
    get() = RecordRouterGrpc.getCreateRecordMethod()

  val updateRecordMethod: MethodDescriptor<UpdateRecordRequestV1, Empty>
    @JvmStatic
    get() = RecordRouterGrpc.getUpdateRecordMethod()

  val deleteRecordMethod: MethodDescriptor<DeleteRecordRequestV1, Empty>
    @JvmStatic
    get() = RecordRouterGrpc.getDeleteRecordMethod()

  val bookMarkMethod: MethodDescriptor<RecordBookMarkRequestV1, Empty>
    @JvmStatic
    get() = RecordRouterGrpc.getBookMarkMethod()

  val recordFilterMethod: MethodDescriptor<RecordFilterRequestV1, RecordFilterResponseV1>
    @JvmStatic
    get() = RecordRouterGrpc.getRecordFilterMethod()

  val recordSearchMethod: MethodDescriptor<RecordSearchRequestV1, RecordSearchResponseV1>
    @JvmStatic
    get() = RecordRouterGrpc.getRecordSearchMethod()

  /**
   * A stub for issuing RPCs to a(n) com.sia.obision.target.RecordRouter service as suspending
   * coroutines.
   */
  @StubFor(RecordRouterGrpc::class)
  class RecordRouterCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<RecordRouterCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): RecordRouterCoroutineStub =
        RecordRouterCoroutineStub(channel, callOptions)

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
    suspend fun createRecord(request: CreateRecordRequestV1): CreateRecordResponseV1 = unaryRpc(
      channel,
      RecordRouterGrpc.getCreateRecordMethod(),
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
    suspend fun updateRecord(request: UpdateRecordRequestV1): Empty = unaryRpc(
      channel,
      RecordRouterGrpc.getUpdateRecordMethod(),
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
    suspend fun deleteRecord(request: DeleteRecordRequestV1): Empty = unaryRpc(
      channel,
      RecordRouterGrpc.getDeleteRecordMethod(),
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
    suspend fun bookMark(request: RecordBookMarkRequestV1): Empty = unaryRpc(
      channel,
      RecordRouterGrpc.getBookMarkMethod(),
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
    suspend fun recordFilter(request: RecordFilterRequestV1): RecordFilterResponseV1 = unaryRpc(
      channel,
      RecordRouterGrpc.getRecordFilterMethod(),
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
    suspend fun recordSearch(request: RecordSearchRequestV1): RecordSearchResponseV1 = unaryRpc(
      channel,
      RecordRouterGrpc.getRecordSearchMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the com.sia.obision.target.RecordRouter service based on Kotlin
   * coroutines.
   */
  abstract class RecordRouterCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for com.sia.obision.target.RecordRouter.createRecord.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createRecord(request: CreateRecordRequestV1): CreateRecordResponseV1 = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.RecordRouter.createRecord is unimplemented"))

    /**
     * Returns the response to an RPC for com.sia.obision.target.RecordRouter.updateRecord.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun updateRecord(request: UpdateRecordRequestV1): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.RecordRouter.updateRecord is unimplemented"))

    /**
     * Returns the response to an RPC for com.sia.obision.target.RecordRouter.deleteRecord.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteRecord(request: DeleteRecordRequestV1): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.RecordRouter.deleteRecord is unimplemented"))

    /**
     * Returns the response to an RPC for com.sia.obision.target.RecordRouter.bookMark.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun bookMark(request: RecordBookMarkRequestV1): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.RecordRouter.bookMark is unimplemented"))

    /**
     * Returns the response to an RPC for com.sia.obision.target.RecordRouter.recordFilter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun recordFilter(request: RecordFilterRequestV1): RecordFilterResponseV1 = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.RecordRouter.recordFilter is unimplemented"))

    /**
     * Returns the response to an RPC for com.sia.obision.target.RecordRouter.recordSearch.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun recordSearch(request: RecordSearchRequestV1): RecordSearchResponseV1 = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.RecordRouter.recordSearch is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RecordRouterGrpc.getCreateRecordMethod(),
      implementation = ::createRecord
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RecordRouterGrpc.getUpdateRecordMethod(),
      implementation = ::updateRecord
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RecordRouterGrpc.getDeleteRecordMethod(),
      implementation = ::deleteRecord
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RecordRouterGrpc.getBookMarkMethod(),
      implementation = ::bookMark
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RecordRouterGrpc.getRecordFilterMethod(),
      implementation = ::recordFilter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RecordRouterGrpc.getRecordSearchMethod(),
      implementation = ::recordSearch
    )).build()
  }
}
