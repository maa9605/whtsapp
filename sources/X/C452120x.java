package X;

import android.util.Base64;

/* renamed from: X.20x  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C452120x extends C20v {
    public final C02L A00;
    public final C41481tz A01;
    public final C03740Gw A02;
    public final C451620q A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C452120x(AbstractC000600i abstractC000600i, C02L c02l, C01B c01b, C451620q c451620q, C41481tz c41481tz, C03740Gw c03740Gw, AnonymousClass092 anonymousClass092, boolean z, boolean z2) {
        super(abstractC000600i, c01b, anonymousClass092, z);
        if (anonymousClass092 != null) {
            this.A00 = c02l;
            this.A03 = c451620q;
            this.A01 = c41481tz;
            this.A02 = c03740Gw;
            this.A04 = z2;
            return;
        }
        throw null;
    }

    public static void A00(AbstractC000600i abstractC000600i, C02L c02l, AnonymousClass092 anonymousClass092, C0KA c0ka, boolean z) {
        String A0K;
        C40541sR A09 = C40531sQ.A09();
        if ((anonymousClass092 instanceof AnonymousClass097) && (A0K = anonymousClass092.A0K()) != null) {
            try {
                Base64.decode(A0K, 0);
            } catch (IllegalArgumentException unused) {
                abstractC000600i.A09("webquery/invalid hash", null, false);
                anonymousClass092.A0p(null);
            }
        }
        AnonymousClass029.A1G(anonymousClass092, new C40551sS(c02l, A09, true, z, AnonymousClass029.A0H(anonymousClass092), null));
        C40531sQ c40531sQ = (C40531sQ) A09.A01();
        c0ka.A02();
        C452821e c452821e = (C452821e) c0ka.A00;
        if (c40531sQ != null) {
            c452821e.A0D = c40531sQ;
            c452821e.A01 |= 2;
            return;
        }
        throw null;
    }

    public static final void A01(C0KA c0ka, C04300Jq c04300Jq) {
        String str;
        if (!(c04300Jq instanceof C0LZ) || (str = ((C0LZ) c04300Jq).A00) == null) {
            return;
        }
        c0ka.A02();
        C452821e.A0D((C452821e) c0ka.A00, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x012d, code lost:
        if (r1 != 10) goto L60;
     */
    @Override // X.C20v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C0KA A02() {
        /*
            Method dump skipped, instructions count: 1764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C452120x.A02():X.0KA");
    }
}
