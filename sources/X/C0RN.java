package X;

import java.util.Arrays;

/* renamed from: X.0RN  reason: invalid class name */
/* loaded from: classes.dex */
public class C0RN implements C0RM {
    public static final C0RN A00 = new C0RN();

    @Override // X.C0RM
    public boolean AW1(boolean z, boolean z2, boolean z3, boolean z4) {
        return z3 ? z4 : z2;
    }

    @Override // X.C0RM
    public C0AN AW2(boolean z, C0AN c0an, boolean z2, C0AN c0an2) {
        return z2 ? c0an2 : c0an;
    }

    @Override // X.C0RM
    public double AW3(boolean z, double d, boolean z2, double d2) {
        return z2 ? d2 : d;
    }

    @Override // X.C0RM
    public float AW4(boolean z, float f, boolean z2, float f2) {
        return z2 ? f2 : f;
    }

    @Override // X.C0RM
    public int AW5(boolean z, int i, boolean z2, int i2) {
        return z2 ? i2 : i;
    }

    @Override // X.C0RM
    public long AW8(boolean z, long j, boolean z2, long j2) {
        return z2 ? j2 : j;
    }

    @Override // X.C0RM
    public void AWB(boolean z) {
    }

    @Override // X.C0RM
    public Object AWC(boolean z, Object obj, Object obj2) {
        return obj2;
    }

    @Override // X.C0RM
    public String AWD(boolean z, String str, boolean z2, String str2) {
        return z2 ? str2 : str;
    }

    @Override // X.C0RM
    public C0O0 AW6(C0O0 c0o0, C0O0 c0o02) {
        int size = c0o0.size();
        int size2 = c0o02.size();
        if (size > 0) {
            if (size2 > 0) {
                if (!((C0CY) c0o0).A00) {
                    c0o0 = ((C09550eI) c0o0).AGZ(size2 + size);
                }
                c0o0.addAll(c0o02);
            }
            return c0o0;
        }
        return c0o02;
    }

    @Override // X.C0RM
    public C0CX AW7(C0CX c0cx, C0CX c0cx2) {
        int size = c0cx.size();
        int size2 = c0cx2.size();
        if (size > 0) {
            if (size2 > 0) {
                if (!((C0CY) c0cx).A00) {
                    c0cx = c0cx.AGZ(size2 + size);
                }
                c0cx.addAll(c0cx2);
            }
            return c0cx;
        }
        return c0cx2;
    }

    @Override // X.C0RM
    public C0AX AW9(C0AX c0ax, C0AX c0ax2) {
        if (c0ax != null) {
            if (c0ax2 != null) {
                C0CU AVX = c0ax.AVX();
                if (AVX != null) {
                    C0CT c0ct = (C0CT) AVX;
                    if (c0ct.A02.getClass().isInstance(c0ax2)) {
                        c0ct.A02();
                        c0ct.A00.A0G(A00, (C0AZ) ((C0Aa) c0ax2));
                        return c0ct.A01();
                    }
                    throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
                }
                throw null;
            }
            return c0ax;
        }
        return c0ax2;
    }

    @Override // X.C0RM
    public Object AWA(boolean z, Object obj, Object obj2) {
        return z ? AW9((C0AX) obj, (C0AX) obj2) : obj2;
    }

    @Override // X.C0RM
    public C0Ab AWE(C0Ab c0Ab, C0Ab c0Ab2) {
        if (c0Ab2 != C0Ab.A04) {
            int i = c0Ab.count + c0Ab2.count;
            int[] copyOf = Arrays.copyOf(c0Ab.A02, i);
            System.arraycopy(c0Ab2.A02, 0, copyOf, c0Ab.count, c0Ab2.count);
            Object[] copyOf2 = Arrays.copyOf(c0Ab.A03, i);
            System.arraycopy(c0Ab2.A03, 0, copyOf2, c0Ab.count, c0Ab2.count);
            return new C0Ab(i, copyOf, copyOf2, true);
        }
        return c0Ab;
    }
}
