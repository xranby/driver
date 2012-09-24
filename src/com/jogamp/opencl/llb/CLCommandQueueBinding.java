/* !---- DO NOT EDIT: This file autogenerated by com/jogamp/gluegen/JavaEmitter.java on Fri Aug 03 06:56:48 CEST 2012 ----! */

package com.jogamp.opencl.llb;

import com.jogamp.gluegen.runtime.*;
import com.jogamp.common.os.*;
import com.jogamp.common.nio.*;
import java.nio.*;

 /**
  * Java bindings to OpenCL command queues.
  * @author Michael Bien, GlueGen, et al.
  */
public interface CLCommandQueueBinding {

  public static final int CL_QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE = (1<<0);
  public static final int CL_QUEUE_PROFILING_ENABLE = (1<<1);
  public static final int CL_QUEUE_CONTEXT = 0x1090;
  public static final int CL_QUEUE_DEVICE = 0x1091;
  public static final int CL_QUEUE_REFERENCE_COUNT = 0x1092;
  public static final int CL_QUEUE_PROPERTIES = 0x1093;
  public static final int CL_COMMAND_NDRANGE_KERNEL = 0x11F0;
  public static final int CL_COMMAND_TASK = 0x11F1;
  public static final int CL_COMMAND_NATIVE_KERNEL = 0x11F2;
  public static final int CL_COMMAND_READ_BUFFER = 0x11F3;
  public static final int CL_COMMAND_WRITE_BUFFER = 0x11F4;
  public static final int CL_COMMAND_COPY_BUFFER = 0x11F5;
  public static final int CL_COMMAND_READ_IMAGE = 0x11F6;
  public static final int CL_COMMAND_WRITE_IMAGE = 0x11F7;
  public static final int CL_COMMAND_COPY_IMAGE = 0x11F8;
  public static final int CL_COMMAND_COPY_IMAGE_TO_BUFFER = 0x11F9;
  public static final int CL_COMMAND_COPY_BUFFER_TO_IMAGE = 0x11FA;
  public static final int CL_COMMAND_MAP_BUFFER = 0x11FB;
  public static final int CL_COMMAND_MAP_IMAGE = 0x11FC;
  public static final int CL_COMMAND_UNMAP_MEM_OBJECT = 0x11FD;
  public static final int CL_COMMAND_MARKER = 0x11FE;
  public static final int CL_COMMAND_ACQUIRE_GL_OBJECTS = 0x11FF;
  public static final int CL_COMMAND_RELEASE_GL_OBJECTS = 0x1200;
  public static final int CL_COMMAND_READ_BUFFER_RECT = 0x1201;
  public static final int CL_COMMAND_WRITE_BUFFER_RECT = 0x1202;
  public static final int CL_COMMAND_COPY_BUFFER_RECT = 0x1203;
  public static final int CL_COMMAND_USER = 0x1204;
  public static final int CL_PROFILING_COMMAND_QUEUED = 0x1280;
  public static final int CL_PROFILING_COMMAND_SUBMIT = 0x1281;
  public static final int CL_PROFILING_COMMAND_START = 0x1282;
  public static final int CL_PROFILING_COMMAND_END = 0x1283;
  public static final int CL_COMMAND_MIGRATE_MEM_OBJECT_EXT = 0x4040;
  public static final int CL_COMMAND_GL_FENCE_SYNC_OBJECT_KHR = 0x200D;

  /** Interface to C language function: <br> <code> cl_command_queue {@native clCreateCommandQueue}(cl_context context, cl_device_id device, cl_command_queue_properties properties, cl_int *  errcode_ret); </code> 
      @param errcode_ret a direct or array-backed {@link java.nio.IntBuffer}   */
  public long clCreateCommandQueue(long context, long device, long properties, IntBuffer errcode_ret);

  /** Interface to C language function: <br> <code> cl_command_queue {@native clCreateCommandQueue}(cl_context context, cl_device_id device, cl_command_queue_properties properties, cl_int *  errcode_ret); </code>    */
  public long clCreateCommandQueue(long context, long device, long properties, int[] errcode_ret, int errcode_ret_offset);

  /** Interface to C language function: <br> <code> cl_int {@native clEnqueueBarrier}(cl_command_queue command_queue); </code>    */
  public int clEnqueueBarrier(long command_queue);

  /** Interface to C language function: <br> <code> cl_int {@native clEnqueueCopyBuffer}(cl_command_queue command_queue, cl_mem src_buffer, cl_mem dst_buffer, size_t src_offset, size_t dst_offset, size_t cb, cl_uint num_events_in_wait_list, cl_event *  event_wait_list, cl_event *  event); </code> 
      @param event_wait_list a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event a direct only {@link com.jogamp.common.nio.PointerBuffer}   */
  public int clEnqueueCopyBuffer(long command_queue, long src_buffer, long dst_buffer, long src_offset, long dst_offset, long cb, int num_events_in_wait_list, PointerBuffer event_wait_list, PointerBuffer event);

  /** Interface to C language function: <br> <code> cl_int {@native clEnqueueCopyBufferRect}(cl_command_queue command_queue, cl_mem src_buffer, cl_mem dst_buffer, const size_t *  src_origin, const size_t *  dst_origin, const size_t *  region, size_t src_row_pitch, size_t src_slice_pitch, size_t dst_row_pitch, size_t dst_slice_pitch, cl_uint num_events_in_wait_list, cl_event *  event_wait_list, cl_event *  event); </code> 
      @param src_origin a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param dst_origin a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param region a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event_wait_list a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event a direct only {@link com.jogamp.common.nio.PointerBuffer}   */
  public int clEnqueueCopyBufferRect(long command_queue, long src_buffer, long dst_buffer, PointerBuffer src_origin, PointerBuffer dst_origin, PointerBuffer region, long src_row_pitch, long src_slice_pitch, long dst_row_pitch, long dst_slice_pitch, int num_events_in_wait_list, PointerBuffer event_wait_list, PointerBuffer event);

  /** Interface to C language function: <br> <code> cl_int {@native clEnqueueCopyBufferToImage}(cl_command_queue command_queue, cl_mem src_buffer, cl_mem dst_image, size_t src_offset, const size_t * , const size_t * , cl_uint num_events_in_wait_list, cl_event *  event_wait_list, cl_event *  event); </code> 
      @param arg4 a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param arg5 a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event_wait_list a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event a direct only {@link com.jogamp.common.nio.PointerBuffer}   */
  public int clEnqueueCopyBufferToImage(long command_queue, long src_buffer, long dst_image, long src_offset, PointerBuffer arg4, PointerBuffer arg5, int num_events_in_wait_list, PointerBuffer event_wait_list, PointerBuffer event);

  /** Interface to C language function: <br> <code> cl_int {@native clEnqueueCopyImage}(cl_command_queue command_queue, cl_mem src_image, cl_mem dst_image, const size_t * , const size_t * , const size_t * , cl_uint num_events_in_wait_list, cl_event *  event_wait_list, cl_event *  event); </code> 
      @param arg3 a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param arg4 a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param arg5 a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event_wait_list a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event a direct only {@link com.jogamp.common.nio.PointerBuffer}   */
  public int clEnqueueCopyImage(long command_queue, long src_image, long dst_image, PointerBuffer arg3, PointerBuffer arg4, PointerBuffer arg5, int num_events_in_wait_list, PointerBuffer event_wait_list, PointerBuffer event);

  /** Interface to C language function: <br> <code> cl_int {@native clEnqueueCopyImageToBuffer}(cl_command_queue command_queue, cl_mem src_image, cl_mem dst_buffer, const size_t * , const size_t * , size_t dst_offset, cl_uint num_events_in_wait_list, cl_event *  event_wait_list, cl_event *  event); </code> 
      @param arg3 a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param arg4 a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event_wait_list a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event a direct only {@link com.jogamp.common.nio.PointerBuffer}   */
  public int clEnqueueCopyImageToBuffer(long command_queue, long src_image, long dst_buffer, PointerBuffer arg3, PointerBuffer arg4, long dst_offset, int num_events_in_wait_list, PointerBuffer event_wait_list, PointerBuffer event);

  /** Interface to C language function: <br> <code> void *  {@native clEnqueueMapBuffer}(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_map, cl_map_flags map_flags, size_t offset, size_t cb, cl_uint num_events_in_wait_list, cl_event *  event_wait_list, cl_event *  event, cl_int *  errcode_ret); </code> 
      @param event_wait_list a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param errcode_ret a direct only {@link java.nio.IntBuffer}   */
  public ByteBuffer clEnqueueMapBuffer(long command_queue, long buffer, int blocking_map, long map_flags, long offset, long cb, int num_events_in_wait_list, PointerBuffer event_wait_list, PointerBuffer event, IntBuffer errcode_ret);

  /** Interface to C language function: <br> <code> void *  {@native clEnqueueMapImage}(cl_command_queue command_queue, cl_mem image, cl_bool blocking_map, cl_map_flags map_flags, const size_t * , const size_t * , size_t *  image_row_pitch, size_t *  image_slice_pitch, cl_uint num_events_in_wait_list, cl_event *  event_wait_list, cl_event *  event, cl_int *  errcode_ret); </code> 
      @param arg4 a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param arg5 a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param image_row_pitch a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param image_slice_pitch a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event_wait_list a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param errcode_ret a direct only {@link java.nio.IntBuffer}   */
  public ByteBuffer clEnqueueMapImage(long command_queue, long image, int blocking_map, long map_flags, PointerBuffer arg4, PointerBuffer arg5, PointerBuffer image_row_pitch, PointerBuffer image_slice_pitch, int num_events_in_wait_list, PointerBuffer event_wait_list, PointerBuffer event, IntBuffer errcode_ret);

  /** Interface to C language function: <br> <code> cl_int {@native clEnqueueMarker}(cl_command_queue command_queue, cl_event *  event); </code> 
      @param event a direct only {@link com.jogamp.common.nio.PointerBuffer}   */
  public int clEnqueueMarker(long command_queue, PointerBuffer event);

  /** Interface to C language function: <br> <code> cl_int {@native clEnqueueMigrateMemObjectEXT}(cl_command_queue, cl_uint, cl_mem * , cl_mem_migration_flags_ext, cl_uint, cl_event * , cl_event * ); </code> 
      @param arg2 a direct or array-backed {@link com.jogamp.common.nio.PointerBuffer}
      @param arg5 a direct or array-backed {@link com.jogamp.common.nio.PointerBuffer}
      @param arg6 a direct or array-backed {@link com.jogamp.common.nio.PointerBuffer}   */
  public int clEnqueueMigrateMemObjectEXT(long arg0, int arg1, PointerBuffer arg2, long arg3, int arg4, PointerBuffer arg5, PointerBuffer arg6);

  /** Interface to C language function: <br> <code> cl_int {@native clEnqueueNDRangeKernel}(cl_command_queue command_queue, cl_kernel kernel, cl_uint work_dim, const size_t *  global_work_offset, const size_t *  global_work_size, const size_t *  local_work_size, cl_uint num_events_in_wait_list, cl_event *  event_wait_list, cl_event *  event); </code> 
      @param global_work_offset a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param global_work_size a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param local_work_size a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event_wait_list a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event a direct only {@link com.jogamp.common.nio.PointerBuffer}   */
  public int clEnqueueNDRangeKernel(long command_queue, long kernel, int work_dim, PointerBuffer global_work_offset, PointerBuffer global_work_size, PointerBuffer local_work_size, int num_events_in_wait_list, PointerBuffer event_wait_list, PointerBuffer event);

  /** Interface to C language function: <br> <code> cl_int {@native clEnqueueReadBuffer}(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, size_t offset, size_t cb, void *  ptr, cl_uint num_events_in_wait_list, cl_event *  event_wait_list, cl_event *  event); </code> 
      @param ptr a direct only {@link java.nio.Buffer}
      @param event_wait_list a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event a direct only {@link com.jogamp.common.nio.PointerBuffer}   */
  public int clEnqueueReadBuffer(long command_queue, long buffer, int blocking_read, long offset, long cb, Buffer ptr, int num_events_in_wait_list, PointerBuffer event_wait_list, PointerBuffer event);

  /** Interface to C language function: <br> <code> cl_int {@native clEnqueueReadBufferRect}(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, const size_t *  buffer_origin, const size_t *  host_origin, const size_t *  region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, void *  ptr, cl_uint num_events_in_wait_list, cl_event *  event_wait_list, cl_event *  event); </code> 
      @param buffer_origin a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param host_origin a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param region a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param ptr a direct only {@link java.nio.Buffer}
      @param event_wait_list a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event a direct only {@link com.jogamp.common.nio.PointerBuffer}   */
  public int clEnqueueReadBufferRect(long command_queue, long buffer, int blocking_read, PointerBuffer buffer_origin, PointerBuffer host_origin, PointerBuffer region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, Buffer ptr, int num_events_in_wait_list, PointerBuffer event_wait_list, PointerBuffer event);

  /** Interface to C language function: <br> <code> cl_int {@native clEnqueueReadImage}(cl_command_queue command_queue, cl_mem image, cl_bool blocking_read, const size_t * , const size_t * , size_t row_pitch, size_t slice_pitch, void *  ptr, cl_uint num_events_in_wait_list, cl_event *  event_wait_list, cl_event *  event); </code> 
      @param arg3 a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param arg4 a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param ptr a direct only {@link java.nio.Buffer}
      @param event_wait_list a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event a direct only {@link com.jogamp.common.nio.PointerBuffer}   */
  public int clEnqueueReadImage(long command_queue, long image, int blocking_read, PointerBuffer arg3, PointerBuffer arg4, long row_pitch, long slice_pitch, Buffer ptr, int num_events_in_wait_list, PointerBuffer event_wait_list, PointerBuffer event);

  /** Interface to C language function: <br> <code> cl_int {@native clEnqueueTask}(cl_command_queue command_queue, cl_kernel kernel, cl_uint num_events_in_wait_list, cl_event *  event_wait_list, cl_event *  event); </code> 
      @param event_wait_list a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event a direct only {@link com.jogamp.common.nio.PointerBuffer}   */
  public int clEnqueueTask(long command_queue, long kernel, int num_events_in_wait_list, PointerBuffer event_wait_list, PointerBuffer event);

  /** Interface to C language function: <br> <code> cl_int {@native clEnqueueUnmapMemObject}(cl_command_queue command_queue, cl_mem memobj, void *  mapped_ptr, cl_uint num_events_in_wait_list, cl_event *  event_wait_list, cl_event *  event); </code> 
      @param mapped_ptr a direct only {@link java.nio.Buffer}
      @param event_wait_list a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event a direct only {@link com.jogamp.common.nio.PointerBuffer}   */
  public int clEnqueueUnmapMemObject(long command_queue, long memobj, Buffer mapped_ptr, int num_events_in_wait_list, PointerBuffer event_wait_list, PointerBuffer event);

  /** Interface to C language function: <br> <code> cl_int {@native clEnqueueWaitForEvents}(cl_command_queue command_queue, cl_uint num_events, cl_event *  event_list); </code> 
      @param event_list a direct only {@link com.jogamp.common.nio.PointerBuffer}   */
  public int clEnqueueWaitForEvents(long command_queue, int num_events, PointerBuffer event_list);

  /** Interface to C language function: <br> <code> cl_int {@native clEnqueueWriteBuffer}(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, size_t offset, size_t cb, const void *  ptr, cl_uint num_events_in_wait_list, cl_event *  event_wait_list, cl_event *  event); </code> 
      @param ptr a direct only {@link java.nio.Buffer}
      @param event_wait_list a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event a direct only {@link com.jogamp.common.nio.PointerBuffer}   */
  public int clEnqueueWriteBuffer(long command_queue, long buffer, int blocking_write, long offset, long cb, Buffer ptr, int num_events_in_wait_list, PointerBuffer event_wait_list, PointerBuffer event);

  /** Interface to C language function: <br> <code> cl_int {@native clEnqueueWriteBufferRect}(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, const size_t *  buffer_origin, const size_t *  host_origin, const size_t *  region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, const void *  ptr, cl_uint num_events_in_wait_list, cl_event *  event_wait_list, cl_event *  event); </code> 
      @param buffer_origin a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param host_origin a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param region a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param ptr a direct only {@link java.nio.Buffer}
      @param event_wait_list a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event a direct only {@link com.jogamp.common.nio.PointerBuffer}   */
  public int clEnqueueWriteBufferRect(long command_queue, long buffer, int blocking_write, PointerBuffer buffer_origin, PointerBuffer host_origin, PointerBuffer region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, Buffer ptr, int num_events_in_wait_list, PointerBuffer event_wait_list, PointerBuffer event);

  /** Interface to C language function: <br> <code> cl_int {@native clEnqueueWriteImage}(cl_command_queue command_queue, cl_mem image, cl_bool blocking_write, const size_t * , const size_t * , size_t input_row_pitch, size_t input_slice_pitch, const void *  ptr, cl_uint num_events_in_wait_list, cl_event *  event_wait_list, cl_event *  event); </code> 
      @param arg3 a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param arg4 a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param ptr a direct only {@link java.nio.Buffer}
      @param event_wait_list a direct only {@link com.jogamp.common.nio.PointerBuffer}
      @param event a direct only {@link com.jogamp.common.nio.PointerBuffer}   */
  public int clEnqueueWriteImage(long command_queue, long image, int blocking_write, PointerBuffer arg3, PointerBuffer arg4, long input_row_pitch, long input_slice_pitch, Buffer ptr, int num_events_in_wait_list, PointerBuffer event_wait_list, PointerBuffer event);

  /** Interface to C language function: <br> <code> cl_int {@native clFinish}(cl_command_queue command_queue); </code>    */
  public int clFinish(long command_queue);

  /** Interface to C language function: <br> <code> cl_int {@native clFlush}(cl_command_queue command_queue); </code>    */
  public int clFlush(long command_queue);

  /** Interface to C language function: <br> <code> cl_int {@native clGetCommandQueueInfo}(cl_command_queue command_queue, cl_command_queue_info param_name, size_t param_value_size, void *  param_value, size_t *  param_value_size_ret); </code> 
      @param param_value a direct only {@link java.nio.Buffer}
      @param param_value_size_ret a direct only {@link com.jogamp.common.nio.PointerBuffer}   */
  public int clGetCommandQueueInfo(long command_queue, int param_name, long param_value_size, Buffer param_value, PointerBuffer param_value_size_ret);

  /** Interface to C language function: <br> <code> cl_int {@native clReleaseCommandQueue}(cl_command_queue command_queue); </code>    */
  public int clReleaseCommandQueue(long command_queue);

  /** Interface to C language function: <br> <code> cl_int {@native clRetainCommandQueue}(cl_command_queue command_queue); </code>    */
  public int clRetainCommandQueue(long command_queue);


} // end of class CLCommandQueueBinding