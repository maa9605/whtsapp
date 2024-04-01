package X;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0AZ */
/* loaded from: classes.dex */
public abstract class C0AZ extends C0Aa {
    public C0Ab unknownFields = C0Ab.A04;
    public int A00 = -1;

    public abstract Object A0h(C0RL c0rl, Object obj, Object obj2);

    public static C0AZ A00(C0AZ c0az, C0AN c0an) {
        C0RP A00 = C0RP.A00();
        try {
            C0RO A04 = c0an.A04();
            C0AZ A01 = A01(c0az, A04, A00);
            try {
                A04.A0C(0);
                A07(A01);
                A07(A01);
                return A01;
            } catch (C0JX e) {
                e.unfinishedMessage = A01;
                throw e;
            }
        } catch (C0JX e2) {
            throw e2;
        }
    }

    public static C0AZ A01(C0AZ c0az, C0RO c0ro, C0RP c0rp) {
        C0AZ c0az2 = (C0AZ) c0az.A0h(C0RL.NEW_MUTABLE_INSTANCE, null, null);
        try {
            c0az2.A0h(C0RL.MERGE_FROM_STREAM, c0ro, c0rp);
            c0az2.A0E();
            return c0az2;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof C0JX) {
                throw e.getCause();
            }
            throw e;
        }
    }

    public static C0AZ A02(C0AZ c0az, InputStream inputStream) {
        C0AZ A01;
        C0RP A00 = C0RP.A00();
        try {
            int read = inputStream.read();
            if (read != -1) {
                if ((read & 128) != 0) {
                    read &= 127;
                    int i = 7;
                    while (true) {
                        int read2 = inputStream.read();
                        if (read2 == -1) {
                            throw new C0JX("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                        read |= (read2 & 127) << i;
                        if ((read2 & 128) == 0) {
                            break;
                        }
                        i += 7;
                        if (i >= 32) {
                            while (i < 64) {
                                int read3 = inputStream.read();
                                if (read3 == -1) {
                                    throw new C0JX("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                }
                                if ((read3 & 128) != 0) {
                                    i += 7;
                                }
                            }
                            throw new C0JX("CodedInputStream encountered a malformed varint.");
                        }
                    }
                }
                C0RO c0ro = new C0RO(new FilterInputStream(inputStream, read) { // from class: X.1Ci
                    public int A00;

                    {
                        this.A00 = read;
                    }

                    @Override // java.io.FilterInputStream, java.io.InputStream
                    public int available() {
                        return Math.min(super.available(), this.A00);
                    }

                    @Override // java.io.FilterInputStream, java.io.InputStream
                    public int read() {
                        if (this.A00 <= 0) {
                            return -1;
                        }
                        int read4 = super.read();
                        if (read4 >= 0) {
                            this.A00--;
                        }
                        return read4;
                    }

                    @Override // java.io.FilterInputStream, java.io.InputStream
                    public int read(byte[] bArr, int i2, int i3) {
                        int i4 = this.A00;
                        if (i4 <= 0) {
                            return -1;
                        }
                        int read4 = super.read(bArr, i2, Math.min(i3, i4));
                        if (read4 >= 0) {
                            this.A00 -= read4;
                        }
                        return read4;
                    }

                    @Override // java.io.FilterInputStream, java.io.InputStream
                    public long skip(long j) {
                        long skip = super.skip(Math.min(j, this.A00));
                        if (skip >= 0) {
                            this.A00 = (int) (this.A00 - skip);
                        }
                        return skip;
                    }
                });
                A01 = A01(c0az, c0ro, A00);
                try {
                    c0ro.A0C(0);
                } catch (C0JX e) {
                    e.unfinishedMessage = A01;
                    throw e;
                }
            } else {
                A01 = null;
            }
            A07(A01);
            return A01;
        } catch (IOException e2) {
            throw new C0JX(e2.getMessage());
        }
    }

    public static C0AZ A03(C0AZ c0az, byte[] bArr) {
        C0RP A00 = C0RP.A00();
        try {
            int length = bArr.length;
            C0RO c0ro = new C0RO(bArr, 0, length, false);
            try {
                c0ro.A04(length);
                C0AZ A01 = A01(c0az, c0ro, A00);
                try {
                    c0ro.A0C(0);
                    A07(A01);
                    return A01;
                } catch (C0JX e) {
                    e.unfinishedMessage = A01;
                    throw e;
                }
            } catch (C0JX e2) {
                throw new IllegalArgumentException(e2);
            }
        } catch (C0JX e3) {
            throw e3;
        }
    }

    public static C0O0 A04(C0O0 c0o0) {
        int size = c0o0.size();
        int i = size << 1;
        if (size == 0) {
            i = 10;
        }
        return ((C09550eI) c0o0).AGZ(i);
    }

    public static C0CX A05(C0CX c0cx) {
        int size = c0cx.size();
        int i = size << 1;
        if (size == 0) {
            i = 10;
        }
        return c0cx.AGZ(i);
    }

    public static Object A06(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw cause;
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw cause;
        }
    }

    public static void A07(C0AZ c0az) {
        if (c0az == null || c0az.A0H()) {
            return;
        }
        C0JX c0jx = new C0JX(new C24801Cx().getMessage());
        c0jx.unfinishedMessage = c0az;
        throw c0jx;
    }

    public final C0RQ A0C() {
        return (C0RQ) A0h(C0RL.GET_PARSER, null, null);
    }

    @Override // X.C0AX
    /* renamed from: A0D */
    public final C0CT AVX() {
        C0CT c0ct = (C0CT) A0h(C0RL.NEW_BUILDER, null, null);
        c0ct.A02();
        c0ct.A00.A0G(C0RN.A00, this);
        return c0ct;
    }

    public void A0E() {
        A0h(C0RL.MAKE_IMMUTABLE, null, null);
        this.unknownFields.A01 = false;
    }

    public void A0F(int i, int i2) {
        C0Ab c0Ab = this.unknownFields;
        if (c0Ab == C0Ab.A04) {
            c0Ab = new C0Ab(0, new int[8], new Object[8], true);
            this.unknownFields = c0Ab;
        }
        if (c0Ab.A01) {
            c0Ab.A01((i << 3) | 0, Long.valueOf(i2));
            return;
        }
        throw new UnsupportedOperationException();
    }

    public void A0G(C0RM c0rm, C0AZ c0az) {
        A0h(C0RL.VISIT, c0rm, c0az);
        this.unknownFields = c0rm.AWE(this.unknownFields, c0az.unknownFields);
    }

    public final boolean A0H() {
        return A0h(C0RL.IS_INITIALIZED, Boolean.TRUE, null) != null;
    }

    public boolean A0I(int i, C0RO c0ro) {
        if ((i & 7) == 4) {
            return false;
        }
        C0Ab c0Ab = this.unknownFields;
        if (c0Ab == C0Ab.A04) {
            c0Ab = new C0Ab(0, new int[8], new Object[8], true);
            this.unknownFields = c0Ab;
        }
        return c0Ab.A03(i, c0ro);
    }

    @Override // X.C0AY
    public /* bridge */ /* synthetic */ C0AX A9k() {
        return (C0Aa) A0h(C0RL.GET_DEFAULT_INSTANCE, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (A0h(C0RL.GET_DEFAULT_INSTANCE, null, null).getClass().isInstance(obj)) {
            try {
                A0G(new C0RM() { // from class: X.1fG
                    public static final C24721Cp A00 = new RuntimeException() { // from class: X.1Cp
                    };

                    @Override // X.C0RM
                    public boolean AW1(boolean z, boolean z2, boolean z3, boolean z4) {
                        if (z == z3 && z2 == z4) {
                            return z2;
                        }
                        throw A00;
                    }

                    @Override // X.C0RM
                    public C0AN AW2(boolean z, C0AN c0an, boolean z2, C0AN c0an2) {
                        if (z == z2 && c0an.equals(c0an2)) {
                            return c0an;
                        }
                        throw A00;
                    }

                    @Override // X.C0RM
                    public double AW3(boolean z, double d, boolean z2, double d2) {
                        if (z == z2 && d == d2) {
                            return d;
                        }
                        throw A00;
                    }

                    @Override // X.C0RM
                    public float AW4(boolean z, float f, boolean z2, float f2) {
                        if (z == z2 && f == f2) {
                            return f;
                        }
                        throw A00;
                    }

                    @Override // X.C0RM
                    public int AW5(boolean z, int i, boolean z2, int i2) {
                        if (z == z2 && i == i2) {
                            return i;
                        }
                        throw A00;
                    }

                    @Override // X.C0RM
                    public C0O0 AW6(C0O0 c0o0, C0O0 c0o02) {
                        if (c0o0.equals(c0o02)) {
                            return c0o0;
                        }
                        throw A00;
                    }

                    @Override // X.C0RM
                    public C0CX AW7(C0CX c0cx, C0CX c0cx2) {
                        if (c0cx.equals(c0cx2)) {
                            return c0cx;
                        }
                        throw A00;
                    }

                    @Override // X.C0RM
                    public long AW8(boolean z, long j, boolean z2, long j2) {
                        if (z == z2 && j == j2) {
                            return j;
                        }
                        throw A00;
                    }

                    @Override // X.C0RM
                    public C0AX AW9(C0AX c0ax, C0AX c0ax2) {
                        if (c0ax == null) {
                            if (c0ax2 == null) {
                                return null;
                            }
                        } else if (c0ax2 != null) {
                            C0AZ c0az = (C0AZ) c0ax;
                            if (c0az != c0ax2 && c0az.A0h(C0RL.GET_DEFAULT_INSTANCE, null, null).getClass().isInstance(c0ax2)) {
                                c0az.A0G(this, (C0AZ) c0ax2);
                            }
                            return c0ax;
                        }
                        throw A00;
                    }

                    @Override // X.C0RM
                    public Object AWA(boolean z, Object obj2, Object obj3) {
                        if (z) {
                            C0AZ c0az = (C0AZ) obj2;
                            C0AX c0ax = (C0AX) obj3;
                            boolean z2 = true;
                            if (c0az != c0ax) {
                                if (c0az.A0h(C0RL.GET_DEFAULT_INSTANCE, null, null).getClass().isInstance(c0ax)) {
                                    c0az.A0G(this, (C0AZ) c0ax);
                                } else {
                                    z2 = false;
                                }
                            }
                            if (z2) {
                                return obj2;
                            }
                        }
                        throw A00;
                    }

                    @Override // X.C0RM
                    public void AWB(boolean z) {
                        if (z) {
                            throw A00;
                        }
                    }

                    @Override // X.C0RM
                    public Object AWC(boolean z, Object obj2, Object obj3) {
                        if (z && obj2.equals(obj3)) {
                            return obj2;
                        }
                        throw A00;
                    }

                    @Override // X.C0RM
                    public String AWD(boolean z, String str, boolean z2, String str2) {
                        if (z == z2 && str.equals(str2)) {
                            return str;
                        }
                        throw A00;
                    }

                    @Override // X.C0RM
                    public C0Ab AWE(C0Ab c0Ab, C0Ab c0Ab2) {
                        if (c0Ab.equals(c0Ab2)) {
                            return c0Ab;
                        }
                        throw A00;
                    }
                }, (C0AZ) obj);
                return true;
            } catch (C24721Cp unused) {
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = super.A00;
        if (i == 0) {
            C33051fH c33051fH = new C33051fH();
            A0G(c33051fH, this);
            int i2 = c33051fH.A00;
            super.A00 = i2;
            return i2;
        }
        return i;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder("# ");
        sb.append(obj);
        AnonymousClass088.A1Y(this, sb, 0);
        return sb.toString();
    }
}
