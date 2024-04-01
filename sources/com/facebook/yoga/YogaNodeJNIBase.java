package com.facebook.yoga;

import X.AbstractC20840yL;
import X.C000200d;
import X.C07K;
import X.C20580xl;
import X.C29711Ya;
import X.C29721Yb;
import X.EnumC20780yC;
import X.EnumC20790yD;
import X.EnumC20800yE;
import X.EnumC20830yJ;
import X.InterfaceC016607s;
import java.util.List;

/* loaded from: classes.dex */
public abstract class YogaNodeJNIBase extends AbstractC20840yL implements Cloneable {
    public List mChildren;
    public C29721Yb mMeasureFunction;
    public long mNativePointer;
    public YogaNodeJNIBase mOwner;
    public float[] arr = null;
    public int mLayoutDirection = 0;

    public YogaNodeJNIBase(long j) {
        if (j != 0) {
            this.mNativePointer = j;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    public final float baseline(float f, float f2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x004a, code lost:
        throw new java.lang.IllegalStateException("YogaNode does not have children");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.yoga.YogaNodeJNIBase cloneWithChildren() {
        /*
            r6 = this;
            java.lang.Object r5 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4c
            com.facebook.yoga.YogaNodeJNIBase r5 = (com.facebook.yoga.YogaNodeJNIBase) r5     // Catch: java.lang.CloneNotSupportedException -> L4c
            long r0 = r6.mNativePointer     // Catch: java.lang.CloneNotSupportedException -> L4c
            long r1 = com.facebook.yoga.YogaNative.jni_YGNodeCloneJNI(r0)     // Catch: java.lang.CloneNotSupportedException -> L4c
            r0 = 0
            r5.mOwner = r0     // Catch: java.lang.CloneNotSupportedException -> L4c
            r5.mNativePointer = r1     // Catch: java.lang.CloneNotSupportedException -> L4c
            r4 = 0
        L12:
            java.util.List r0 = r5.mChildren     // Catch: java.lang.CloneNotSupportedException -> L4c
            if (r0 != 0) goto L17
            goto L1c
        L17:
            int r0 = r0.size()     // Catch: java.lang.CloneNotSupportedException -> L4c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r4 >= r0) goto L4b
            java.util.List r0 = r5.mChildren     // Catch: java.lang.CloneNotSupportedException -> L4c
            if (r0 == 0) goto L43
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.CloneNotSupportedException -> L4c
            com.facebook.yoga.YogaNodeJNIBase r0 = (com.facebook.yoga.YogaNodeJNIBase) r0     // Catch: java.lang.CloneNotSupportedException -> L4c
            com.facebook.yoga.YogaNodeJNIBase r1 = r0.cloneWithChildren()     // Catch: java.lang.CloneNotSupportedException -> L4c
            java.util.List r0 = r5.mChildren     // Catch: java.lang.CloneNotSupportedException -> L4c
            r0.remove(r4)     // Catch: java.lang.CloneNotSupportedException -> L4c
            java.util.List r0 = r5.mChildren     // Catch: java.lang.CloneNotSupportedException -> L4c
            r0.add(r4, r1)     // Catch: java.lang.CloneNotSupportedException -> L4c
            r1.mOwner = r5     // Catch: java.lang.CloneNotSupportedException -> L4c
            long r2 = r5.mNativePointer     // Catch: java.lang.CloneNotSupportedException -> L4c
            long r0 = r1.mNativePointer     // Catch: java.lang.CloneNotSupportedException -> L4c
            com.facebook.yoga.YogaNative.jni_YGNodeSwapChildJNI(r2, r0, r4)     // Catch: java.lang.CloneNotSupportedException -> L4c
            int r4 = r4 + 1
            goto L12
        L43:
            java.lang.String r1 = "YogaNode does not have children"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.CloneNotSupportedException -> L4c
            r0.<init>(r1)     // Catch: java.lang.CloneNotSupportedException -> L4c
            throw r0     // Catch: java.lang.CloneNotSupportedException -> L4c
        L4b:
            return r5
        L4c:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.yoga.YogaNodeJNIBase.cloneWithChildren():com.facebook.yoga.YogaNodeJNIBase");
    }

    @Override // X.AbstractC20840yL
    public AbstractC20840yL getChildAt(int i) {
        List list = this.mChildren;
        if (list != null) {
            return (AbstractC20840yL) list.get(i);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    @Override // X.AbstractC20840yL
    public EnumC20790yD getDisplay() {
        int jni_YGNodeStyleGetDisplayJNI = YogaNative.jni_YGNodeStyleGetDisplayJNI(this.mNativePointer);
        if (jni_YGNodeStyleGetDisplayJNI != 0) {
            if (jni_YGNodeStyleGetDisplayJNI == 1) {
                return EnumC20790yD.NONE;
            }
            throw new IllegalArgumentException(C000200d.A0D("Unknown enum value: ", jni_YGNodeStyleGetDisplayJNI));
        }
        return EnumC20790yD.FLEX;
    }

    @Override // X.AbstractC20840yL
    public EnumC20780yC getLayoutDirection() {
        float[] fArr = this.arr;
        int i = fArr != null ? (int) fArr[5] : this.mLayoutDirection;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return EnumC20780yC.RTL;
                }
                throw new IllegalArgumentException(C000200d.A0D("Unknown enum value: ", i));
            }
            return EnumC20780yC.LTR;
        }
        return EnumC20780yC.INHERIT;
    }

    @Override // X.AbstractC20840yL
    public float getLayoutHeight() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // X.AbstractC20840yL
    public float getLayoutPadding(EnumC20800yE enumC20800yE) {
        EnumC20780yC enumC20780yC = EnumC20780yC.RTL;
        float[] fArr = this.arr;
        if (fArr != null) {
            int i = (int) fArr[0];
            if ((i & 2) == 2) {
                int i2 = 10 - ((i & 1) != 1 ? 4 : 0);
                int ordinal = enumC20800yE.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    return getLayoutDirection() == enumC20780yC ? fArr[i2 + 2] : fArr[i2];
                                } else if (ordinal == 5) {
                                    return getLayoutDirection() == enumC20780yC ? fArr[i2] : fArr[i2 + 2];
                                } else {
                                    throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
                                }
                            }
                            return fArr[i2 + 3];
                        }
                        return fArr[i2 + 2];
                    }
                    return fArr[i2 + 1];
                }
                return fArr[i2];
            }
            return 0.0f;
        }
        return 0.0f;
    }

    @Override // X.AbstractC20840yL
    public float getLayoutWidth() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    public final long measure(float f, int i, float f2, int i2) {
        EnumC20830yJ enumC20830yJ;
        EnumC20830yJ enumC20830yJ2;
        C29721Yb c29721Yb = this.mMeasureFunction;
        if (c29721Yb != null) {
            if (i == 0) {
                enumC20830yJ = EnumC20830yJ.UNDEFINED;
            } else if (i == 1) {
                enumC20830yJ = EnumC20830yJ.EXACTLY;
            } else if (i == 2) {
                enumC20830yJ = EnumC20830yJ.AT_MOST;
            } else {
                throw new IllegalArgumentException(C000200d.A0D("Unknown enum value: ", i));
            }
            if (i2 == 0) {
                enumC20830yJ2 = EnumC20830yJ.UNDEFINED;
            } else if (i2 == 1) {
                enumC20830yJ2 = EnumC20830yJ.EXACTLY;
            } else if (i2 == 2) {
                enumC20830yJ2 = EnumC20830yJ.AT_MOST;
            } else {
                throw new IllegalArgumentException(C000200d.A0D("Unknown enum value: ", i2));
            }
            if (c29721Yb != null) {
                int A01 = C20580xl.A01(f, enumC20830yJ);
                int A012 = C20580xl.A01(f2, enumC20830yJ2);
                C29711Ya c29711Ya = c29721Yb.A07;
                InterfaceC016607s A00 = c29711Ya.A00.A00(c29721Yb.A05, A01, A012);
                c29721Yb.A03 = A00;
                long A0M = C07K.A0M(A00.getWidth(), A00.getHeight());
                c29721Yb.A02 = A0M;
                return A0M;
            }
            throw null;
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List list = this.mChildren;
        if (list != null) {
            list.remove(i);
            this.mChildren.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.mOwner = this;
            return yogaNodeJNIBase.mNativePointer;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }
}
