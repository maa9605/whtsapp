package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.1tS  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41151tS {
    public final C05W A00;
    public final C02960Do A01;
    public final C0C8 A02;
    public final C003701t A03;
    public final InterfaceC002901k A04;

    public C41151tS(C003701t c003701t, InterfaceC002901k interfaceC002901k, C05W c05w, C02960Do c02960Do, C0C8 c0c8) {
        this.A03 = c003701t;
        this.A04 = interfaceC002901k;
        this.A01 = c02960Do;
        this.A02 = c0c8;
        this.A00 = c05w;
    }

    public void A00(AbstractC005302j abstractC005302j) {
        C06C A09;
        if (this.A03.A0C(439) && (A09 = this.A00.A09(abstractC005302j)) != null && A09.A0C()) {
            Jid A03 = A09.A03(C011005l.class);
            if (A03 != null) {
                if (this.A01.A01.containsKey(A03)) {
                    return;
                }
                this.A04.AS5(new RunnableEBaseShape1S0200000_I0_1(this, A03, 12));
                return;
            }
            throw null;
        }
    }
}
