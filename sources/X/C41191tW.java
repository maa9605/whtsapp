package X;

import java.util.List;

/* renamed from: X.1tW  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41191tW extends AbstractC03000Dt {
    public final AnonymousClass012 A00;
    public final C41181tV A01;
    public final C05M A02;
    public final C0CA A03;
    public final C0C9 A04;
    public final C0C7 A05;
    public final C02970Dp A06;
    public final C0CB A07;

    public C41191tW(AnonymousClass012 anonymousClass012, C05M c05m, C41181tV c41181tV, C0C9 c0c9, C0CB c0cb, C0CA c0ca, C02970Dp c02970Dp, C0C7 c0c7) {
        this.A00 = anonymousClass012;
        this.A02 = c05m;
        this.A01 = c41181tV;
        this.A04 = c0c9;
        this.A07 = c0cb;
        this.A03 = c0ca;
        this.A06 = c02970Dp;
        this.A05 = c0c7;
    }

    public final void A00(List list, AbstractC005302j abstractC005302j, long j) {
        long A04 = this.A02.A04(abstractC005302j);
        C0C9 c0c9 = this.A04;
        AnonymousClass012 anonymousClass012 = this.A00;
        C27661Og A08 = c0c9.A08(abstractC005302j, A04, 100, anonymousClass012.A05());
        if (A08.A00.moveToFirst()) {
            do {
                AnonymousClass092 A0D = c0c9.A0D(A08.A00, abstractC005302j);
                if (A0D != null && A0D.A0p != A04 && !A0D.A0n.A02 && A0D.A0C >= anonymousClass012.A05() - j) {
                    list.add(A0D);
                }
            } while (A08.A00.moveToNext());
        }
    }
}
