package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.2Kt */
/* loaded from: classes2.dex */
public class C49492Kt extends C0MU {
    public boolean A00;
    public boolean A01;
    public final C0HK A0B;
    public final C018608r A0C;
    public final C0E6 A0D;
    public final C2KZ A0E;
    public final C49502Ku A0F;
    public final C49462Ko A0G;
    public final C49472Kp A0H;
    public final AnonymousClass075 A0I;
    public final C018708s A0J;
    public final AnonymousClass012 A0K;
    public final UserJid A0L;
    public final C0HK A07 = new C0HK();
    public final C0HK A0A = new C0HK();
    public final C0HK A02 = new C0HK();
    public final C0HK A04 = new C0HK();
    public final C0HK A09 = new C0HK();
    public final C0HK A08 = new C0HK();
    public final C0HK A05 = new C0HK();
    public final C0HK A03 = new C0HK();
    public final C0HK A06 = new C0HK();

    public C49492Kt(AnonymousClass012 anonymousClass012, C49502Ku c49502Ku, UserJid userJid, C018608r c018608r, C2KZ c2kz, C0E6 c0e6, C49472Kp c49472Kp, C018708s c018708s, AnonymousClass075 anonymousClass075, C49462Ko c49462Ko) {
        C0HK c0hk = new C0HK();
        this.A0B = c0hk;
        this.A01 = true;
        this.A0K = anonymousClass012;
        this.A0F = c49502Ku;
        this.A0L = userJid;
        this.A0E = c2kz;
        this.A0C = c018608r;
        this.A0D = c0e6;
        this.A0H = c49472Kp;
        this.A0J = c018708s;
        this.A0I = anonymousClass075;
        this.A0G = c49462Ko;
        c2kz.A05 = this.A07;
        c2kz.A00 = this.A02;
        c2kz.A08 = this.A0A;
        c2kz.A07 = this.A09;
        c2kz.A02 = this.A04;
        c2kz.A06 = this.A08;
        c2kz.A03 = this.A05;
        c2kz.A09 = c0hk;
        c2kz.A01 = this.A03;
        c2kz.A04 = this.A06;
    }

    public final void A02(String str, String str2, C32L c32l, ActivityC02320As activityC02320As, C2N3 c2n3) {
        C2Ki c2Ki = (C2Ki) this.A0A.A01();
        if (!c32l.A01.isEmpty()) {
            try {
                List list = ((C49382Kc) c32l.A01.get(0)).A01.A0D;
                if (!list.isEmpty()) {
                    C2A2 c2a2 = (C2A2) list.get(0);
                    if (c2a2 != null && c2Ki != null && c2Ki.A02 != null) {
                        C2Kr c2Kr = new C2Kr(this, c2Ki, str, c32l.A0G(), str2, activityC02320As);
                        final C49472Kp c49472Kp = this.A0H;
                        c49472Kp.A00 = c2Kr;
                        c2n3.A02(c2a2, 3, c49472Kp, new InterfaceC56142mm() { // from class: X.34E
                            @Override // X.InterfaceC56142mm
                            public final void AHM(C40231ro c40231ro) {
                            }
                        }, new InterfaceC56152mn() { // from class: X.34D
                            @Override // X.InterfaceC56152mn
                            public final void ALQ(C40231ro c40231ro) {
                                C2Kr c2Kr2 = c49472Kp.A00;
                                if (c2Kr2 != null) {
                                    c2Kr2.A02.A09.A0A(Boolean.TRUE);
                                }
                            }
                        }, null);
                        return;
                    }
                }
            } catch (Exception unused) {
            }
        }
        this.A09.A0A(Boolean.TRUE);
    }
}
