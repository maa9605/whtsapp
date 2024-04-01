package X;

import com.facebook.yoga.YogaNative;

/* renamed from: X.1Z1  reason: invalid class name */
/* loaded from: classes.dex */
public class C1Z1 {
    public long A00;

    public C1Z1() {
        long jni_YGConfigNewJNI = YogaNative.jni_YGConfigNewJNI();
        if (jni_YGConfigNewJNI != 0) {
            this.A00 = jni_YGConfigNewJNI;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    public void finalize() {
        try {
            long j = this.A00;
            if (j != 0) {
                this.A00 = 0L;
                YogaNative.jni_YGConfigFreeJNI(j);
            }
        } finally {
            super.finalize();
        }
    }
}
