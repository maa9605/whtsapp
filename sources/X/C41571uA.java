package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.1uA  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41571uA {
    public static volatile C41571uA A0D;
    public final C02L A00;
    public final C01B A01;
    public final C05W A02;
    public final C0E7 A03;
    public final AnonymousClass012 A04;
    public final C000500h A05;
    public final C05M A06;
    public final C0DK A07;
    public final C0EA A08;
    public final C0EB A09;
    public final C003701t A0A;
    public final C0ES A0B;
    public final C41491u0 A0C;

    public C41571uA(AnonymousClass012 anonymousClass012, C003701t c003701t, C02L c02l, C05M c05m, C01B c01b, C0EA c0ea, C0EB c0eb, C41491u0 c41491u0, C05W c05w, C0ES c0es, C0E7 c0e7, C000500h c000500h, C0DK c0dk) {
        this.A04 = anonymousClass012;
        this.A0A = c003701t;
        this.A00 = c02l;
        this.A06 = c05m;
        this.A01 = c01b;
        this.A08 = c0ea;
        this.A09 = c0eb;
        this.A0C = c41491u0;
        this.A02 = c05w;
        this.A0B = c0es;
        this.A03 = c0e7;
        this.A05 = c000500h;
        this.A07 = c0dk;
    }

    public static C41571uA A00() {
        if (A0D == null) {
            synchronized (C41571uA.class) {
                if (A0D == null) {
                    A0D = new C41571uA(AnonymousClass012.A00(), C003701t.A00(), C02L.A00(), C05M.A00(), C01B.A00(), C0EA.A00(), C0EB.A00(), C41491u0.A00(), C05W.A00(), C0ES.A00(), C0E7.A00(), C000500h.A00(), C0DK.A00());
                }
            }
        }
        return A0D;
    }

    public boolean A01(int i, C0DC c0dc, boolean z, long j, int i2, AbstractC005302j abstractC005302j) {
        if (c0dc != C0DC.A0I) {
            return (c0dc == C0DC.A0A || c0dc == C0DC.A0C || c0dc == C0DC.A0P) ? i2 > 0 && j < ((long) i2) && i2 <= 35000 && i != 3 && !A03(abstractC005302j) : c0dc == C0DC.A0N && z && j < 262144 && (C23X.A01(this.A05, i) & 1) != 0;
        }
        if (i2 >= 0) {
            long j2 = i2;
            if (j < j2 && !A03(abstractC005302j)) {
                return i == 3 ? (C23X.A01(this.A05, i) & 1) != 0 : j2 < 102400;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (X.C0DB.A0b(r14) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A02(int r13, X.AnonymousClass097 r14) {
        /*
            r12 = this;
            X.09H r2 = r14.A02
            if (r2 == 0) goto L45
            r8 = 0
            r4 = r12
            X.1u0 r3 = r12.A0C
            java.lang.String r1 = r2.A0I
            r0 = 0
            X.0Is r0 = r3.A05(r1, r0, r0)
            if (r0 == 0) goto L14
            long r8 = r0.A09
        L14:
            boolean r0 = r14 instanceof X.AnonymousClass095
            if (r0 == 0) goto L27
            X.094 r0 = r14.A0n
            X.02j r0 = r0.A00
            boolean r0 = X.C003101m.A0Z(r0)
            if (r0 == 0) goto L27
            boolean r0 = r12.A06(r14)
            return r0
        L27:
            X.0DC r6 = X.C0DC.A02(r14)
            boolean r0 = X.C0DB.A0a(r14)
            if (r0 != 0) goto L38
            boolean r0 = X.C0DB.A0b(r14)
            r7 = 0
            if (r0 == 0) goto L39
        L38:
            r7 = 1
        L39:
            int r10 = r2.A04
            X.094 r0 = r14.A0n
            X.02j r11 = r0.A00
            r5 = r13
            boolean r0 = r4.A01(r5, r6, r7, r8, r10, r11)
            return r0
        L45:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41571uA.A02(int, X.097):boolean");
    }

    public final boolean A03(AbstractC005302j abstractC005302j) {
        if (abstractC005302j == null) {
            return false;
        }
        C05M c05m = this.A06;
        if (c05m.A01(abstractC005302j) < 5) {
            return false;
        }
        long j = this.A05.A00.getLong("last_read_conversation_time", 0L);
        long A06 = c05m.A06(abstractC005302j);
        return A06 != 0 && A06 + 86400000 < j;
    }

    public boolean A04(C0DC c0dc, long j, boolean z, boolean z2, int i, boolean z3, boolean z4) {
        int A03 = this.A03.A03(z);
        if (c0dc != C0DC.A0I || j <= this.A01.A07(C01C.A3y) * 1024) {
            C01B c01b = this.A01;
            if (A03 == 1) {
                if (j > c01b.A07(C01C.A3X) * SearchActionVerificationClientService.MS_TO_NS) {
                    return false;
                }
            } else if (j > c01b.A07(C01C.A3W) * SearchActionVerificationClientService.MS_TO_NS) {
                return false;
            }
            if (z3 && z4 && (A03 == 1 || A03 == 2)) {
                return true;
            }
            int A01 = C23X.A01(this.A05, A03);
            byte b = c0dc.A00;
            if (b != 0 && b != 1) {
                if (b == 2) {
                    if ((A01 & 2) != 0) {
                        return true;
                    }
                    if (i == 1) {
                        return j <= 524288 || A03 == 1;
                    }
                    return false;
                }
                if (b != 3) {
                    if (b == 9) {
                        return (i == 7 && j <= ((long) c01b.A07(C01C.A3a)) * 1024 && A03 != 3) || (A01 & 8) != 0;
                    }
                    if (b != 13) {
                        if (b == 20) {
                            return ((z2 || A03 == 3) && (A01 & 1) == 0) ? false : true;
                        } else if (b != 23 && b != 37 && b != 25) {
                            if (b == 26) {
                                return (A01 & 8) != 0;
                            } else if (b != 28) {
                                if (b != 29) {
                                    if (b != 42) {
                                        if (b != 43) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return j <= 524288 ? (A01 & 1) != 0 : (A01 & 4) != 0;
                }
                return (A01 & 4) != 0;
            }
            return (A01 & 1) != 0;
        }
        return false;
    }

    public boolean A05(AnonymousClass097 anonymousClass097) {
        C09H c09h;
        return A04(C0DC.A02(anonymousClass097), anonymousClass097.A01, false, ((anonymousClass097 instanceof C04040Ie) && ((C04040Ie) anonymousClass097).A00) || ((c09h = anonymousClass097.A02) != null && c09h.A04 > 0), ((AnonymousClass092) anonymousClass097).A04, C003101m.A0Z(anonymousClass097.A0n.A00), C003101m.A0Y(anonymousClass097.A0G));
    }

    public final boolean A06(AnonymousClass097 anonymousClass097) {
        if (C40841sx.A0g(this.A0A, this.A04, this.A05, anonymousClass097) && (anonymousClass097 instanceof AnonymousClass095)) {
            C04030Id A18 = anonymousClass097.A18();
            if (A18 == null) {
                throw null;
            }
            if (A18.A04()) {
                C03900Hp A0E = anonymousClass097.A0E();
                if (A0E == null) {
                    throw null;
                }
                if (!A0E.A05()) {
                    return true;
                }
            }
        }
        return false;
    }
}
