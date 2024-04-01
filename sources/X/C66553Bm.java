package X;

import android.view.ViewGroup;

/* renamed from: X.3Bm */
/* loaded from: classes2.dex */
public class C66553Bm extends AbstractC04890Mh {
    public InterfaceC61372w2 A00;
    public AbstractC61452wB A01;
    public final int A02;
    public final C01B A03;
    public final C02E A04;
    public final AnonymousClass011 A05;
    public final C455822q A06;
    public final InterfaceC48372Ez A07;
    public final C02O A08;

    public C66553Bm(C455822q c455822q, AnonymousClass011 anonymousClass011, C01B c01b, C02E c02e, InterfaceC48372Ez interfaceC48372Ez, C02O c02o, int i) {
        this.A06 = c455822q;
        this.A05 = anonymousClass011;
        this.A03 = c01b;
        this.A04 = c02e;
        this.A08 = c02o;
        this.A07 = interfaceC48372Ez;
        this.A02 = i;
    }

    @Override // X.AbstractC04890Mh
    public void A05(C0TS c0ts) {
        ((AbstractC09080cc) c0ts).A0C();
    }

    @Override // X.AbstractC04890Mh
    public void A06(C0TS c0ts) {
        ((AbstractC09080cc) c0ts).A0D();
    }

    @Override // X.AbstractC04890Mh
    public synchronized int A0C() {
        AbstractC61452wB abstractC61452wB = this.A01;
        if (abstractC61452wB == null) {
            return 0;
        }
        return abstractC61452wB.A04.size() + (this.A01.A00 != null ? 1 : 0);
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        return new C3LQ(this.A06, this.A05, this.A03, this.A04, this.A08, viewGroup, this.A07, this.A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00a1, code lost:
        if (r7 != false) goto L34;
     */
    @Override // X.AbstractC04890Mh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0F(X.C0TS r11, int r12) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66553Bm.A0F(X.0TS, int):void");
    }

    public void A0G(AbstractC61452wB abstractC61452wB) {
        if (abstractC61452wB.equals(this.A01)) {
            super.A01.A00();
        }
        InterfaceC61372w2 interfaceC61372w2 = this.A00;
        if (interfaceC61372w2 != null) {
            interfaceC61372w2.AQ9(!abstractC61452wB.A02);
        }
    }

    public synchronized void A0H(AbstractC61452wB abstractC61452wB) {
        AbstractC61452wB abstractC61452wB2 = this.A01;
        if (abstractC61452wB2 != null) {
            abstractC61452wB2.A01.remove(this);
        }
        this.A01 = abstractC61452wB;
        if (abstractC61452wB != null) {
            abstractC61452wB.A01.add(this);
            if (!abstractC61452wB.A04.isEmpty()) {
                A0G(abstractC61452wB);
            }
        }
        super.A01.A00();
    }

    public final boolean A0I(int i) {
        AbstractC61452wB abstractC61452wB = this.A01;
        return abstractC61452wB != null && i == abstractC61452wB.A04.size();
    }
}
