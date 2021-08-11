// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@NoOffset @Name("c10::variant<torch::enumtype::kFanIn,torch::enumtype::kFanOut>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FanModeType extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FanModeType(Pointer p) { super(p); }
    public FanModeType(kFanIn value) { this(); put(value); }
    public FanModeType(kFanOut value) { this(); put(value); }
    public FanModeType()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef FanModeType put(@ByRef FanModeType x);

    public @ByRef kFanIn get0() { return get0(this); }
    @Namespace @Name("c10::get<0>") public static native @ByRef kFanIn get0(@ByRef FanModeType container);
    @ValueSetter public native FanModeType put(@ByRef kFanIn value);
    public @ByRef kFanOut get1() { return get1(this); }
    @Namespace @Name("c10::get<1>") public static native @ByRef kFanOut get1(@ByRef FanModeType container);
    @ValueSetter public native FanModeType put(@ByRef kFanOut value);
}
