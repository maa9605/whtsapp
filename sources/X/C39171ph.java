package X;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

/* renamed from: X.1ph  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C39171ph extends YogaNodeJNIBase {
    public C39171ph() {
        super(YogaNative.jni_YGNodeNewJNI());
    }

    public C39171ph(C1Z1 c1z1) {
        super(YogaNative.jni_YGNodeNewWithConfigJNI(c1z1.A00));
    }

    public void finalize() {
        try {
            long j = this.mNativePointer;
            if (j != 0) {
                this.mNativePointer = 0L;
                YogaNative.jni_YGNodeFreeJNI(j);
            }
        } finally {
            super.finalize();
        }
    }
}
