package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.0A4  reason: invalid class name */
/* loaded from: classes.dex */
public class C0A4 {
    public int A00;
    public int A01;
    public C0A5 A02;
    public static final InterfaceC020509l A07 = AnonymousClass088.A0f("length");
    public static final InterfaceC020509l A0A = AnonymousClass088.A0f("undefined");
    public static final InterfaceC020509l A09 = AnonymousClass088.A0f("true");
    public static final InterfaceC020509l A06 = AnonymousClass088.A0f("false");
    public static final InterfaceC020509l A0B = new C020909p(0.0d);
    public static final InterfaceC020509l A08 = new C020909p(1.0d);
    public Object[] A04 = new Object[16];
    public int[] A03 = new int[16];
    public final Random A05 = new Random();

    public static AbstractC021009q A00(Object obj) {
        AbstractC021009q abstractC021009q;
        if (!(obj instanceof C020909p) || (abstractC021009q = (AbstractC021009q) obj) == null) {
            if (AnonymousClass088.A2A(obj)) {
                return new C020909p(Double.NaN);
            }
            if (obj instanceof C1FA) {
                return new C020909p(((C1FA) obj).A00 ? 1.0d : 0.0d);
            }
            return null;
        }
        return abstractC021009q;
    }

    public static String A01(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof C0A8) {
            StringBuilder A0P = C000200d.A0P("ObjRef of ");
            A0P.append(A01(AnonymousClass088.A0q((C0A8) obj)));
            return A0P.toString();
        }
        return obj.getClass().getName();
    }

    public static final void A02(String str) {
        throw new C0A0(C000200d.A0H("TypeError: ", str));
    }

    public static final void A03(String str, Object obj) {
        StringBuilder A0W = C000200d.A0W("TypeError: ", str, ". Got ");
        A0W.append(A01(obj));
        throw new C0A0(A0W.toString());
    }

    public static final void A04(String str, Object obj, Object obj2) {
        StringBuilder A0W = C000200d.A0W("TypeError: ", str, ". Got ");
        A0W.append(A01(obj));
        A0W.append(" and ");
        A0W.append(A01(obj2));
        throw new C0A0(A0W.toString());
    }

    public static void A05(List list, int i) {
        int size = list.size();
        if (i > size) {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(i);
            }
            do {
                list.add(C0A6.A00);
                size++;
            } while (i > size);
        } else if (i >= size) {
        } else {
            do {
                size--;
                list.remove(size);
            } while (i < size);
            if (list instanceof ArrayList) {
                ((ArrayList) list).trimToSize();
            }
        }
    }

    public static boolean A06(Object obj) {
        if (obj instanceof C1FA) {
            return ((C1FA) obj).A00;
        }
        if (AnonymousClass088.A2A(obj)) {
            return false;
        }
        if (AnonymousClass088.A2B(obj)) {
            return !AnonymousClass088.A0y(obj).isEmpty();
        }
        if (!(obj instanceof C020909p)) {
            return ((obj instanceof C0A7) && ((Number) obj).longValue() == 0) ? false : true;
        }
        double doubleValue = ((Number) obj).doubleValue();
        return (doubleValue == 0.0d || Double.isNaN(doubleValue)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r5 == r3) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r5 == r3) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r5 < 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r5 > r8) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A07(java.lang.Object r7, int r8, java.lang.String r9) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C0A7
            if (r0 == 0) goto L15
            java.lang.Number r7 = (java.lang.Number) r7
            long r3 = r7.longValue()
            int r5 = (int) r3
            long r1 = (long) r5
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L26
        L10:
            if (r5 < 0) goto L26
            if (r5 > r8) goto L26
            return r5
        L15:
            boolean r0 = r7 instanceof X.C020909p
            if (r0 == 0) goto L26
            java.lang.Number r7 = (java.lang.Number) r7
            double r3 = r7.doubleValue()
            int r5 = (int) r3
            double r1 = (double) r5
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L26
            goto L10
        L26:
            A02(r9)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0A4.A07(java.lang.Object, int, java.lang.String):int");
    }

    public final InterfaceC020509l A08(Object obj) {
        String d;
        if (AnonymousClass088.A2A(obj)) {
            return A0A;
        }
        if (obj instanceof C1FA) {
            return ((C1FA) obj).A00 ? A09 : A06;
        } else if (obj instanceof C0A7) {
            return AnonymousClass088.A0f(Long.toString(((Number) obj).longValue()));
        } else {
            if (obj instanceof C020909p) {
                double doubleValue = ((Number) obj).doubleValue();
                int i = (int) doubleValue;
                if (i == doubleValue) {
                    d = Integer.toString(i);
                } else {
                    d = Double.toString(doubleValue);
                    int indexOf = d.indexOf(69);
                    if (indexOf >= 0) {
                        int length = d.length();
                        int i2 = length + 1;
                        char[] cArr = new char[i2];
                        d.getChars(0, indexOf, cArr, 0);
                        cArr[indexOf] = 'e';
                        int i3 = indexOf + 1;
                        if (d.charAt(i3) == '-') {
                            d.getChars(i3, length, cArr, i3);
                        } else {
                            cArr[i3] = '+';
                            d.getChars(i3, length, cArr, indexOf + 2);
                            length = i2;
                        }
                        d = new String(cArr, 0, length);
                    }
                }
                return AnonymousClass088.A0f(d);
            } else if (AnonymousClass088.A2B(obj)) {
                return (InterfaceC020509l) obj;
            } else {
                A03("Value cannot be converted to string", obj);
                throw null;
            }
        }
    }

    public final Object A09(int i) {
        return this.A04[(this.A01 - 1) - i];
    }

    public final Object A0A(Object obj, Object obj2, C1FB c1fb, String str) {
        AbstractC021009q A00;
        AbstractC021009q A002 = A00(obj);
        if (A002 != null && (A00 = A00(obj2)) != null) {
            return new C020909p(c1fb.A5U(A002.doubleValue(), A00.doubleValue()));
        }
        if ((obj instanceof C0A7) && (obj2 instanceof C0A7)) {
            return new C0A7(c1fb.A5W(((Number) obj).longValue(), ((Number) obj2).longValue()));
        }
        StringBuilder sb = new StringBuilder("Incompatible operand types of ");
        sb.append(str);
        A04(sb.toString(), obj, obj2);
        throw null;
    }

    public final Map A0B(Object obj, int i) {
        if (AnonymousClass088.A29(obj)) {
            return (Map) AnonymousClass088.A0q((C0A8) obj);
        }
        StringBuilder A0P = C000200d.A0P("Expected stack value of map type for opcode ");
        A0P.append(C1FD.A00[i]);
        A03(A0P.toString(), obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:455:0x0b4b, code lost:
        if (r2 == null) goto L608;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v150 */
    /* JADX WARN: Type inference failed for: r2v54, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0C() {
        /*
            Method dump skipped, instructions count: 3922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0A4.A0C():void");
    }

    public final void A0D() {
        int i = this.A01 - 1;
        this.A01 = i;
        this.A04[i] = null;
    }

    public final void A0E(int i) {
        int i2 = this.A01 - i;
        this.A01 = i2;
        Arrays.fill(this.A04, i2, i + i2, (Object) null);
    }

    public final void A0F(int i) {
        Object[] objArr = this.A04;
        int length = objArr.length;
        int i2 = this.A01;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 + i;
        if (i3 > 536870912) {
            throw new IllegalStateException("MinScript stack overflow");
        }
        do {
            length <<= 1;
        } while (length < i3);
        int i4 = length <= 536870912 ? length : 536870912;
        Object[] objArr2 = new Object[i4];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        this.A04 = objArr2;
        int[] iArr = new int[i4];
        System.arraycopy(this.A03, 0, iArr, 0, this.A01);
        this.A03 = iArr;
    }

    public final void A0G(int i, Object obj) {
        this.A04[(this.A01 - i) - 1] = obj;
    }

    public final void A0H(Object obj) {
        Object[] objArr = this.A04;
        int i = this.A01;
        objArr[i] = obj;
        this.A01 = i + 1;
    }

    public final void A0I(Object obj, int i, Object obj2, int i2) {
        Object[] objArr = this.A04;
        int i3 = this.A01;
        objArr[i3] = obj;
        int i4 = i3 + 1;
        this.A01 = i4;
        int[] iArr = this.A03;
        iArr[i4] = i;
        int i5 = i4 + 1;
        this.A01 = i5;
        objArr[i5] = obj2;
        int i6 = i5 + 1;
        this.A01 = i6;
        iArr[i6] = i2;
        int i7 = i6 + 1;
        this.A01 = i7;
        iArr[i7] = this.A00;
        int i8 = i7 + 1;
        this.A01 = i8;
        this.A00 = i8 - 1;
    }

    public final boolean A0J(Object obj, Object obj2, C1FC c1fc, String str) {
        AbstractC021009q A00 = A00(obj);
        if (A00 != null) {
            AbstractC021009q A002 = A00(obj2);
            if (A002 != null) {
                return c1fc.AVQ(A00.doubleValue(), A002.doubleValue());
            }
            if (obj2 instanceof C0A7) {
                return c1fc.AVR(A00.doubleValue(), ((Number) obj2).longValue());
            }
        } else if (obj instanceof C0A7) {
            if (obj2 instanceof C0A7) {
                return c1fc.AVT(((Number) obj).longValue(), ((Number) obj2).longValue());
            }
            AbstractC021009q A003 = A00(obj2);
            if (A003 != null) {
                return c1fc.AVS(((Number) obj).longValue(), A003.doubleValue());
            }
        }
        StringBuilder sb = new StringBuilder("Incompatible operand types of ");
        sb.append(str);
        A04(sb.toString(), obj, obj2);
        throw null;
    }
}
