// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.caffe.global.caffe.*;

// -------------------------------------------------------------------

@Namespace("caffe") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class BatchNormParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BatchNormParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BatchNormParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BatchNormParameter position(long position) {
        return (BatchNormParameter)super.position(position);
    }

  public BatchNormParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public BatchNormParameter(@Const @ByRef BatchNormParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef BatchNormParameter from);

  public native @ByRef @Name("operator =") BatchNormParameter put(@Const @ByRef BatchNormParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef BatchNormParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const BatchNormParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(BatchNormParameter other);
  

  // implements Message ----------------------------------------------

  public native final BatchNormParameter New();

  public native final BatchNormParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef BatchNormParameter from);
  public native void MergeFrom(@Const @ByRef BatchNormParameter from);
  public native final void Clear();
  public native @Cast("bool") final boolean IsInitialized();

  public native @Cast("size_t") final long ByteSizeLong();
  public native @Cast("bool") final boolean MergePartialFromCodedStream(
        CodedInputStream input);
  public native final void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") final BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") final ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") final byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") byte[] target);
  public native final int GetCachedSize();

  public native @ByVal final Metadata GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // optional bool use_global_stats = 1;
  public native @Cast("bool") boolean has_use_global_stats();
  public native void clear_use_global_stats();
  @MemberGetter public static native int kUseGlobalStatsFieldNumber();
  public static final int kUseGlobalStatsFieldNumber = kUseGlobalStatsFieldNumber();
  public native @Cast("bool") boolean use_global_stats();
  public native void set_use_global_stats(@Cast("bool") boolean value);

  // optional float moving_average_fraction = 2 [default = 0.999];
  public native @Cast("bool") boolean has_moving_average_fraction();
  public native void clear_moving_average_fraction();
  @MemberGetter public static native int kMovingAverageFractionFieldNumber();
  public static final int kMovingAverageFractionFieldNumber = kMovingAverageFractionFieldNumber();
  public native float moving_average_fraction();
  public native void set_moving_average_fraction(float value);

  // optional float eps = 3 [default = 1e-05];
  public native @Cast("bool") boolean has_eps();
  public native void clear_eps();
  @MemberGetter public static native int kEpsFieldNumber();
  public static final int kEpsFieldNumber = kEpsFieldNumber();
  public native float eps();
  public native void set_eps(float value);
}