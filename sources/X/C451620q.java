package X;

/* renamed from: X.20q  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C451620q {
    public static volatile C451620q A01;
    public final C02L A00;

    public C451620q(C02L c02l) {
        this.A00 = c02l;
    }

    public static C451620q A00() {
        if (A01 == null) {
            synchronized (C451620q.class) {
                if (A01 == null) {
                    A01 = new C451620q(C02L.A00());
                }
            }
        }
        return A01;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C21Z A01(X.AnonymousClass092 r9) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C451620q.A01(X.092):X.21Z");
    }

    public C02590Ca A02(AnonymousClass092 anonymousClass092) {
        C0KA A09 = C452821e.A09();
        C452521b A092 = C452421a.A09();
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        A092.A06(C003101m.A07(anonymousClass094.A00));
        A092.A07(anonymousClass094.A02);
        A092.A04(anonymousClass094.A01);
        A09.A02();
        C452821e.A0B((C452821e) A09.A00, (C452421a) A092.A01());
        C40541sR A093 = C40531sQ.A09();
        AnonymousClass029.A1G(anonymousClass092, new C40551sS(this.A00, A093, true, false, null, null));
        C40531sQ c40531sQ = (C40531sQ) A093.A01();
        A09.A02();
        C452821e c452821e = (C452821e) A09.A00;
        if (c40531sQ != null) {
            c452821e.A0D = c40531sQ;
            c452821e.A01 |= 2;
            A03(A09, anonymousClass092);
            return new C02590Ca("message", null, null, A09.A01().A0B());
        }
        throw null;
    }

    public void A03(C0KA c0ka, AnonymousClass092 anonymousClass092) {
        AnonymousClass093 anonymousClass093;
        AnonymousClass093 anonymousClass0932 = anonymousClass092.A0F;
        if (anonymousClass0932 != null && anonymousClass0932.A07 != null) {
            C21Z A012 = A01(anonymousClass092);
            c0ka.A02();
            C452821e c452821e = (C452821e) c0ka.A00;
            if (A012 != null) {
                c452821e.A0G = A012;
                c452821e.A01 |= 65536;
            } else {
                throw null;
            }
        }
        AnonymousClass092 A0C = anonymousClass092.A0C();
        if (A0C != null && (anonymousClass093 = A0C.A0F) != null && anonymousClass093.A07 != null) {
            C21Z A013 = A01(A0C);
            c0ka.A02();
            C452821e c452821e2 = (C452821e) c0ka.A00;
            if (A013 != null) {
                c452821e2.A0H = A013;
                c452821e2.A01 |= 262144;
                return;
            }
            throw null;
        }
    }
}
