package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3hl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C77163hl extends C0HS {
    public int A00;
    public AnonymousClass093 A01;
    public UserJid A02;
    public Runnable A03;
    public final AnonymousClass012 A04;
    public final C0C9 A05;
    public final C0EO A06;
    public final C463026g A07;
    public final C0DV A08;
    public final C05U A09;

    public C77163hl(AnonymousClass012 anonymousClass012, C0EO c0eo, C05U c05u, C0DV c0dv, C0C9 c0c9, C463026g c463026g, AnonymousClass093 anonymousClass093, UserJid userJid, int i, Runnable runnable) {
        this.A04 = anonymousClass012;
        this.A06 = c0eo;
        this.A09 = c05u;
        this.A08 = c0dv;
        this.A05 = c0c9;
        this.A07 = c463026g;
        this.A01 = anonymousClass093;
        this.A02 = userJid;
        this.A00 = i;
        this.A03 = runnable;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        AnonymousClass012 anonymousClass012;
        int i = this.A00;
        if (i == 15) {
            C05U c05u = this.A09;
            AbstractC005302j abstractC005302j = this.A01.A0A;
            anonymousClass012 = this.A04;
            long A05 = anonymousClass012.A05();
            String str = this.A01.A0J;
            C05V c05v = c05u.A07;
            C0LQ c0lq = new C0LQ(C05V.A00(c05v.A01, c05v.A00, abstractC005302j, true), A05);
            ((C0LR) c0lq).A00 = str;
            c0lq.A0d(this.A02);
            this.A07.A07(c0lq);
        } else if (i == 18) {
            C05U c05u2 = this.A09;
            AbstractC005302j abstractC005302j2 = this.A01.A0A;
            anonymousClass012 = this.A04;
            long A052 = anonymousClass012.A05();
            String str2 = this.A01.A0J;
            C05V c05v2 = c05u2.A07;
            C0LS c0ls = new C0LS(C05V.A00(c05v2.A01, c05v2.A00, abstractC005302j2, true), A052);
            ((C0LR) c0ls).A00 = str2;
            c0ls.A0d(this.A02);
            this.A07.A07(c0ls);
        } else {
            StringBuilder A0P = C000200d.A0P("Transaction status is not cancelled or rejected, status: ");
            A0P.append(i);
            throw new IllegalStateException(C014406v.A01("PaymentsMessageHandler", A0P.toString()));
        }
        AnonymousClass093 anonymousClass093 = this.A01;
        int i2 = anonymousClass093.A01;
        anonymousClass093.A01 = this.A00;
        anonymousClass093.A05 = anonymousClass012.A05();
        C0DV c0dv = this.A08;
        c0dv.A04();
        C013306k c013306k = c0dv.A07;
        AnonymousClass093 anonymousClass0932 = this.A01;
        return Boolean.valueOf(c013306k.A0j(new AnonymousClass094(anonymousClass0932.A0A, anonymousClass0932.A0O, anonymousClass0932.A0J), anonymousClass0932, i2, -1L, 0));
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        AnonymousClass092 A0E = this.A05.A0E(this.A01);
        if (A0E != null) {
            AnonymousClass093 anonymousClass093 = A0E.A0F;
            anonymousClass093.A01 = this.A00;
            anonymousClass093.A05 = this.A04.A05();
            this.A06.A02(A0E, 16);
        }
        this.A03.run();
    }
}
