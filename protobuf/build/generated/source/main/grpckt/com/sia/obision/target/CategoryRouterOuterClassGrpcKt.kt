package com.sia.obision.target

import com.google.protobuf.Empty
import com.sia.obision.target.CategoryRouterGrpc.getServiceDescriptor
import com.sia.obision.target.v1.CreateCategoryListRequestV1
import com.sia.obision.target.v1.CreateCategoryListResponseV1
import com.sia.obision.target.v1.CreateCategoryRequestV1
import com.sia.obision.target.v1.CreateCategoryResponseV1
import com.sia.obision.target.v1.DeleteCategoryListRequestV1
import com.sia.obision.target.v1.DeleteCategoryRequestV1
import com.sia.obision.target.v1.GetCategoryListResponseV1
import com.sia.obision.target.v1.UpdateCategoryRequestV1
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
 * Holder for Kotlin coroutine-based client and server APIs for
 * com.sia.obision.target.CategoryRouter.
 */
object CategoryRouterGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = CategoryRouterGrpc.getServiceDescriptor()

  val createCategoryMethod: MethodDescriptor<CreateCategoryRequestV1, CreateCategoryResponseV1>
    @JvmStatic
    get() = CategoryRouterGrpc.getCreateCategoryMethod()

  val createCategoryListMethod: MethodDescriptor<CreateCategoryListRequestV1,
      CreateCategoryListResponseV1>
    @JvmStatic
    get() = CategoryRouterGrpc.getCreateCategoryListMethod()

  val getCategoryListMethod: MethodDescriptor<Empty, GetCategoryListResponseV1>
    @JvmStatic
    get() = CategoryRouterGrpc.getGetCategoryListMethod()

  val updateCategoryMethod: MethodDescriptor<UpdateCategoryRequestV1, Empty>
    @JvmStatic
    get() = CategoryRouterGrpc.getUpdateCategoryMethod()

  val deleteCategoryMethod: MethodDescriptor<DeleteCategoryRequestV1, Empty>
    @JvmStatic
    get() = CategoryRouterGrpc.getDeleteCategoryMethod()

  val deleteCategoryListMethod: MethodDescriptor<DeleteCategoryListRequestV1, Empty>
    @JvmStatic
    get() = CategoryRouterGrpc.getDeleteCategoryListMethod()

  /**
   * A stub for issuing RPCs to a(n) com.sia.obision.target.CategoryRouter service as suspending
   * coroutines.
   */
  @StubFor(CategoryRouterGrpc::class)
  class CategoryRouterCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<CategoryRouterCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): CategoryRouterCoroutineStub =
        CategoryRouterCoroutineStub(channel, callOptions)

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
    suspend fun createCategory(request: CreateCategoryRequestV1): CreateCategoryResponseV1 =
        unaryRpc(
      channel,
      CategoryRouterGrpc.getCreateCategoryMethod(),
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
    suspend fun createCategoryList(request: CreateCategoryListRequestV1):
        CreateCategoryListResponseV1 = unaryRpc(
      channel,
      CategoryRouterGrpc.getCreateCategoryListMethod(),
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
    suspend fun getCategoryList(request: Empty): GetCategoryListResponseV1 = unaryRpc(
      channel,
      CategoryRouterGrpc.getGetCategoryListMethod(),
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
    suspend fun updateCategory(request: UpdateCategoryRequestV1): Empty = unaryRpc(
      channel,
      CategoryRouterGrpc.getUpdateCategoryMethod(),
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
    suspend fun deleteCategory(request: DeleteCategoryRequestV1): Empty = unaryRpc(
      channel,
      CategoryRouterGrpc.getDeleteCategoryMethod(),
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
    suspend fun deleteCategoryList(request: DeleteCategoryListRequestV1): Empty = unaryRpc(
      channel,
      CategoryRouterGrpc.getDeleteCategoryListMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the com.sia.obision.target.CategoryRouter service based on Kotlin
   * coroutines.
   */
  abstract class CategoryRouterCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for com.sia.obision.target.CategoryRouter.createCategory.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createCategory(request: CreateCategoryRequestV1): CreateCategoryResponseV1 =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.CategoryRouter.createCategory is unimplemented"))

    /**
     * Returns the response to an RPC for com.sia.obision.target.CategoryRouter.createCategoryList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createCategoryList(request: CreateCategoryListRequestV1):
        CreateCategoryListResponseV1 = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.CategoryRouter.createCategoryList is unimplemented"))

    /**
     * Returns the response to an RPC for com.sia.obision.target.CategoryRouter.getCategoryList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getCategoryList(request: Empty): GetCategoryListResponseV1 = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.CategoryRouter.getCategoryList is unimplemented"))

    /**
     * Returns the response to an RPC for com.sia.obision.target.CategoryRouter.updateCategory.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun updateCategory(request: UpdateCategoryRequestV1): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.CategoryRouter.updateCategory is unimplemented"))

    /**
     * Returns the response to an RPC for com.sia.obision.target.CategoryRouter.deleteCategory.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteCategory(request: DeleteCategoryRequestV1): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.CategoryRouter.deleteCategory is unimplemented"))

    /**
     * Returns the response to an RPC for com.sia.obision.target.CategoryRouter.deleteCategoryList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteCategoryList(request: DeleteCategoryListRequestV1): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.sia.obision.target.CategoryRouter.deleteCategoryList is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CategoryRouterGrpc.getCreateCategoryMethod(),
      implementation = ::createCategory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CategoryRouterGrpc.getCreateCategoryListMethod(),
      implementation = ::createCategoryList
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CategoryRouterGrpc.getGetCategoryListMethod(),
      implementation = ::getCategoryList
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CategoryRouterGrpc.getUpdateCategoryMethod(),
      implementation = ::updateCategory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CategoryRouterGrpc.getDeleteCategoryMethod(),
      implementation = ::deleteCategory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CategoryRouterGrpc.getDeleteCategoryListMethod(),
      implementation = ::deleteCategoryList
    )).build()
  }
}
