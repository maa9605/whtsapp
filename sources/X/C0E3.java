package X;

import com.whatsapp.Me;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.0E3 */
/* loaded from: classes.dex */
public class C0E3 {
    public static volatile C0E3 A08;
    public final C02L A00;
    public final AnonymousClass012 A01;
    public final C0ED A02;
    public final C003701t A03;
    public final AnonymousClass011 A04;
    public final C0EE A05;
    public final C0GT A06;
    public final C0CB A07;

    public C0E3(AnonymousClass012 anonymousClass012, C003701t c003701t, C02L c02l, AnonymousClass011 anonymousClass011, C0ED c0ed, C0CB c0cb, C0EE c0ee, C0GT c0gt) {
        this.A01 = anonymousClass012;
        this.A03 = c003701t;
        this.A00 = c02l;
        this.A04 = anonymousClass011;
        this.A02 = c0ed;
        this.A07 = c0cb;
        this.A05 = c0ee;
        this.A06 = c0gt;
    }

    public static int A00(AbstractC005302j abstractC005302j) {
        if (C003101m.A0Z(abstractC005302j)) {
            return 3;
        }
        if (C003101m.A0U(abstractC005302j)) {
            return 2;
        }
        return C003101m.A0T(abstractC005302j) ? 6 : 1;
    }

    public static int A01(AbstractC005302j abstractC005302j) {
        if (C003101m.A0U(abstractC005302j)) {
            return 2;
        }
        if (C003101m.A0Z(abstractC005302j)) {
            return 4;
        }
        return C003101m.A0Q(abstractC005302j) ? 3 : 1;
    }

    public static int A02(AnonymousClass092 anonymousClass092) {
        AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
        boolean A0Z = C003101m.A0Z(abstractC005302j);
        boolean A0U = C003101m.A0U(abstractC005302j);
        if (A0Z) {
            return 3;
        }
        return A0U ? 2 : 1;
    }

    public static int A03(AnonymousClass092 anonymousClass092) {
        AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
        if (C003101m.A0U(abstractC005302j)) {
            return 2;
        }
        if (C003101m.A0Z(abstractC005302j)) {
            return 4;
        }
        return C003101m.A0P(abstractC005302j) ? 3 : 1;
    }

    public static int A04(AnonymousClass092 anonymousClass092, C0ED c0ed) {
        int A00 = C002701i.A00(anonymousClass092.A0m, anonymousClass092.A04, C0DB.A0c(anonymousClass092));
        if (A00 == 9 && anonymousClass092.A0z()) {
            if (c0ed.A07(C04310Jr.A01(anonymousClass092.A0G()))) {
                A00 = 22;
            } else if (C0DB.A0s(anonymousClass092.A0G(), c0ed)) {
                A00 = 23;
            }
        }
        if (anonymousClass092.A11()) {
            return 27;
        }
        return A00;
    }

    public static int A05(C05190Nr c05190Nr) {
        if (c05190Nr.A0R) {
            return 3;
        }
        AbstractC005302j A02 = c05190Nr.A02();
        if (C003101m.A0U(A02)) {
            return 2;
        }
        return C003101m.A0Z(A02) ? 4 : 1;
    }

    public static C0E3 A06() {
        if (A08 == null) {
            synchronized (C0E3.class) {
                if (A08 == null) {
                    A08 = new C0E3(AnonymousClass012.A00(), C003701t.A00(), C02L.A00(), AnonymousClass011.A00(), C0ED.A01(), C0CB.A00(), C0EE.A00(), C0GT.A00());
                }
            }
        }
        return A08;
    }

    public static Boolean A07(C02L c02l, AnonymousClass094 anonymousClass094) {
        AbstractC005302j abstractC005302j;
        c02l.A05();
        Me me = c02l.A00;
        if (me == null || (abstractC005302j = anonymousClass094.A00) == null) {
            return null;
        }
        return Boolean.valueOf(!abstractC005302j.getRawString().startsWith(me.cc));
    }

    public static Integer A08(int i) {
        if (i != -10000) {
            if (i != -9999) {
                if (i != -1201) {
                    if (i != -1200) {
                        if (i != -1100) {
                            if (i != -22) {
                                if (i != -12) {
                                    switch (i) {
                                        case -1011:
                                            return 32;
                                        case -1010:
                                            return 5;
                                        case -1009:
                                            return 31;
                                        case -1008:
                                            return 6;
                                        case -1007:
                                            return 1;
                                        case -1006:
                                            return 2;
                                        case -1005:
                                            return 0;
                                        case -1004:
                                            return 29;
                                        case -1003:
                                            return 28;
                                        case -1002:
                                            return 27;
                                        case -1001:
                                            return 23;
                                        case -1000:
                                            return 34;
                                        default:
                                            return null;
                                    }
                                }
                                return 30;
                            }
                            return 26;
                        }
                        return 11;
                    }
                    return 25;
                }
                return 24;
            }
            return 33;
        }
        return 10;
    }

    public void A09(int i, boolean z, Long l, int[] iArr, long j) {
        C36961le c36961le = new C36961le();
        c36961le.A02 = Integer.valueOf(i);
        c36961le.A00 = Boolean.valueOf(z);
        c36961le.A07 = l;
        if (iArr != null) {
            int length = iArr.length;
            c36961le.A08 = Long.valueOf(length);
            if (length >= 1) {
                c36961le.A03 = Long.valueOf(iArr[0]);
            }
            if (length >= 2) {
                c36961le.A04 = Long.valueOf(iArr[1]);
            }
            if (length >= 3) {
                c36961le.A05 = Long.valueOf(iArr[2]);
            }
            if (length >= 4) {
                c36961le.A06 = Long.valueOf(iArr[3]);
            }
        }
        c36961le.A01 = Double.valueOf(j);
        this.A04.A0B(c36961le, null, true);
    }

    public void A0A(DeviceJid deviceJid, int i) {
        int i2;
        C37161ly c37161ly = new C37161ly();
        c37161ly.A00 = Integer.valueOf(i);
        if (deviceJid != null) {
            i2 = Integer.valueOf(deviceJid.isPrimary() ? 1 : 2).intValue();
        } else {
            i2 = 1;
        }
        c37161ly.A01 = Integer.valueOf(i2);
        this.A04.A0B(c37161ly, new AnonymousClass015(1, 1, 1, true), true);
    }

    public void A0B(DeviceJid deviceJid, Boolean bool) {
        C37191m1 c37191m1 = new C37191m1();
        c37191m1.A00 = bool;
        c37191m1.A01 = Integer.valueOf(deviceJid.isPrimary() ? 1 : 2);
        this.A04.A0B(c37191m1, null, false);
    }

    public void A0C(AnonymousClass094 anonymousClass094, DeviceJid deviceJid, int i, boolean z) {
        C36811lP c36811lP = new C36811lP();
        c36811lP.A02 = Integer.valueOf(A01(anonymousClass094.A00));
        c36811lP.A01 = Integer.valueOf(deviceJid.isPrimary() ? 1 : 2);
        c36811lP.A03 = Long.valueOf(i);
        c36811lP.A00 = Boolean.valueOf(z);
        this.A04.A09(c36811lP, 1);
        AnonymousClass011.A01(c36811lP, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0070, code lost:
        if (r1 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0D(X.AnonymousClass092 r18, int r19, int r20, long r21, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E3.A0D(X.092, int, int, long, boolean, boolean):void");
    }

    public void A0E(AnonymousClass092 anonymousClass092, int i, int i2, boolean z, boolean z2, int i3, int i4, boolean z3, int i5, int i6, int i7, long j, long j2, long j3) {
        int i8;
        int i9;
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        if (anonymousClass094.A02 && anonymousClass092.A13()) {
            C36601l4 c36601l4 = new C36601l4();
            c36601l4.A0D = Long.valueOf(j3);
            c36601l4.A0B = Long.valueOf(j);
            c36601l4.A0C = Long.valueOf(j2);
            c36601l4.A04 = Boolean.valueOf(anonymousClass092 instanceof C03890Hn);
            c36601l4.A07 = Integer.valueOf(A04(anonymousClass092, this.A02));
            c36601l4.A09 = Integer.valueOf(i);
            c36601l4.A08 = Integer.valueOf(A03(anonymousClass092));
            c36601l4.A03 = Boolean.valueOf(anonymousClass092.A14(1));
            c36601l4.A0H = Long.valueOf(i2);
            c36601l4.A0G = Long.valueOf(anonymousClass092.A0z);
            c36601l4.A02 = Boolean.valueOf(C0DB.A0k(anonymousClass092, this.A05.A04()));
            c36601l4.A05 = Boolean.valueOf(z);
            c36601l4.A01 = Boolean.valueOf(z2);
            c36601l4.A00 = Boolean.valueOf(z3);
            if (i == 5) {
                c36601l4.A0F = Long.valueOf(i5);
                c36601l4.A0J = Long.valueOf(i6);
            }
            AbstractC005302j abstractC005302j = anonymousClass094.A00;
            if (C003101m.A0U(abstractC005302j) || C003101m.A0P(abstractC005302j)) {
                int i10 = anonymousClass092.A06;
                if (i10 > 0) {
                    if (i10 < 32) {
                        i9 = 1;
                    } else if (i10 < 64) {
                        i9 = 2;
                    } else if (i10 < 128) {
                        i9 = 3;
                    } else if (i10 < 256) {
                        i9 = 4;
                    } else {
                        i9 = 6;
                        if (i10 < 512) {
                            i9 = 5;
                        }
                    }
                    c36601l4.A06 = Integer.valueOf(i9);
                    c36601l4.A0E = Long.valueOf((i3 * 100) / i10);
                }
                if (i7 > 0) {
                    if (i7 < 64) {
                        i8 = 1;
                    } else if (i7 < 128) {
                        i8 = 2;
                    } else if (i7 < 256) {
                        i8 = 3;
                    } else {
                        i8 = 4;
                        if (i7 >= 512) {
                            i8 = 6;
                            if (i7 < 1024) {
                                i8 = 5;
                            }
                        }
                    }
                    c36601l4.A0A = Integer.valueOf(i8);
                    c36601l4.A0I = Long.valueOf((i4 * 100) / i7);
                }
            }
            this.A04.A0B(c36601l4, null, false);
            anonymousClass092.A0u = this.A01.A04();
            c36601l4.toString();
        }
    }

    public void A0F(AnonymousClass092 anonymousClass092, C27391Ne c27391Ne, Jid jid, DeviceJid deviceJid, int i, int i2) {
        C36791lN c36791lN = new C36791lN();
        c36791lN.A06 = 2L;
        int i3 = c27391Ne.A00;
        if (i3 == 1) {
            c36791lN.A01 = 0;
        } else if (i3 == 2) {
            c36791lN.A01 = 1;
        } else if (i3 == 3) {
            c36791lN.A01 = 2;
        }
        int i4 = c27391Ne.A01;
        if (i4 != 0) {
            c36791lN.A03 = A08(i4);
            c36791lN.A00 = Boolean.FALSE;
        } else {
            c36791lN.A00 = Boolean.TRUE;
        }
        if (jid instanceof GroupJid) {
            c36791lN.A02 = 1;
        } else if (jid instanceof C0I1) {
            c36791lN.A02 = 2;
        } else if (jid instanceof C04580Kz) {
            c36791lN.A02 = 3;
        } else {
            c36791lN.A02 = 0;
        }
        if (deviceJid != null) {
            c36791lN.A04 = Integer.valueOf(deviceJid.isPrimary() ? 1 : 2);
        }
        c36791lN.A08 = Long.valueOf(i);
        if (anonymousClass092 != null) {
            c36791lN.A05 = Integer.valueOf(A04(anonymousClass092, this.A02));
        }
        c36791lN.A07 = Long.valueOf(i2);
        if (c36791lN.A00.booleanValue()) {
            this.A04.A0B(c36791lN, null, false);
        } else {
            this.A04.A0B(c36791lN, new AnonymousClass015(1, 1, 1, true), true);
        }
    }
}
