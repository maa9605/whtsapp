package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.0HU  reason: invalid class name */
/* loaded from: classes.dex */
public class C0HU {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public C0HU(int i, int i2, byte[] bArr) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = bArr;
    }

    public static C0HU A00(int i, ByteOrder byteOrder) {
        return A03(new int[]{i}, byteOrder);
    }

    public static C0HU A01(long j, ByteOrder byteOrder) {
        return A04(new long[]{j}, byteOrder);
    }

    public static C0HU A02(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append((char) 0);
        byte[] bytes = sb.toString().getBytes(C0HT.A0K);
        return new C0HU(2, bytes.length, bytes);
    }

    public static C0HU A03(int[] iArr, ByteOrder byteOrder) {
        int i = C0HT.A0V[3];
        int length = iArr.length;
        ByteBuffer wrap = ByteBuffer.wrap(new byte[i * length]);
        wrap.order(byteOrder);
        for (int i2 : iArr) {
            wrap.putShort((short) i2);
        }
        return new C0HU(3, length, wrap.array());
    }

    public static C0HU A04(long[] jArr, ByteOrder byteOrder) {
        int i = C0HT.A0V[4];
        int length = jArr.length;
        ByteBuffer wrap = ByteBuffer.wrap(new byte[i * length]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new C0HU(4, length, wrap.array());
    }

    public static C0HU A05(C13500lM[] c13500lMArr, ByteOrder byteOrder) {
        int i = C0HT.A0V[5];
        int length = c13500lMArr.length;
        ByteBuffer wrap = ByteBuffer.wrap(new byte[i * length]);
        wrap.order(byteOrder);
        for (C13500lM c13500lM : c13500lMArr) {
            wrap.putInt((int) c13500lM.A01);
            wrap.putInt((int) c13500lM.A00);
        }
        return new C0HU(5, length, wrap.array());
    }

    public int A06(ByteOrder byteOrder) {
        Object A07 = A07(byteOrder);
        if (A07 != null) {
            if (A07 instanceof String) {
                return Integer.parseInt((String) A07);
            }
            if (A07 instanceof long[]) {
                long[] jArr = (long[]) A07;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (A07 instanceof int[]) {
                int[] iArr = (int[]) A07;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x019a: MOVE  (r12 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:132:0x019a */
    /* JADX WARN: Removed duplicated region for block: B:150:0x019d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A07(java.nio.ByteOrder r14) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HU.A07(java.nio.ByteOrder):java.lang.Object");
    }

    public String A08(ByteOrder byteOrder) {
        Object A07 = A07(byteOrder);
        if (A07 == null) {
            return null;
        }
        if (A07 instanceof String) {
            return (String) A07;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (A07 instanceof long[]) {
            long[] jArr = (long[]) A07;
            while (true) {
                int length = jArr.length;
                if (i < length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != length) {
                        sb.append(",");
                    }
                } else {
                    return sb.toString();
                }
            }
        } else if (A07 instanceof int[]) {
            int[] iArr = (int[]) A07;
            while (true) {
                int length2 = iArr.length;
                if (i < length2) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != length2) {
                        sb.append(",");
                    }
                } else {
                    return sb.toString();
                }
            }
        } else if (A07 instanceof double[]) {
            double[] dArr = (double[]) A07;
            while (true) {
                int length3 = dArr.length;
                if (i < length3) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != length3) {
                        sb.append(",");
                    }
                } else {
                    return sb.toString();
                }
            }
        } else if (!(A07 instanceof C13500lM[])) {
            return null;
        } else {
            C13500lM[] c13500lMArr = (C13500lM[]) A07;
            while (true) {
                int length4 = c13500lMArr.length;
                if (i < length4) {
                    C13500lM c13500lM = c13500lMArr[i];
                    sb.append(c13500lM.A01);
                    sb.append('/');
                    sb.append(c13500lM.A00);
                    i++;
                    if (i != length4) {
                        sb.append(",");
                    }
                } else {
                    return sb.toString();
                }
            }
        }
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("(");
        A0P.append(C0HT.A0g[this.A00]);
        A0P.append(", data length:");
        return C000200d.A0K(A0P, this.A02.length, ")");
    }
}
