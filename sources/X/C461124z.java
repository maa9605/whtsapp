package X;

import android.app.Activity;
import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.24z */
/* loaded from: classes2.dex */
public class C461124z {
    public boolean A00;
    public final Activity A01;
    public final AbstractC000600i A02;
    public final C018508q A03;
    public final C01B A04;
    public final InterfaceC40271rs A05;
    public final C40261rr A06;
    public final C461024y A07;
    public final C0MA A08;
    public final AnonymousClass008 A09;
    public final C000500h A0A;
    public final C05Y A0B;
    public final C04500Kk A0C;
    public final C41991uq A0D;
    public final Runnable A0E = new RunnableEBaseShape0S0100000_I0_0(this, 41);
    public final Runnable A0F = new RunnableEBaseShape0S0100000_I0_0(this, 42);
    public final Set A0G;
    public final boolean A0H;

    public C461124z(Activity activity, C018508q c018508q, AbstractC000600i abstractC000600i, C41991uq c41991uq, C01B c01b, C05Y c05y, C40261rr c40261rr, AnonymousClass008 anonymousClass008, C000500h c000500h, InterfaceC40271rs interfaceC40271rs, boolean z, C04500Kk c04500Kk, Set set, C461024y c461024y, C0MA c0ma) {
        this.A01 = activity;
        this.A03 = c018508q;
        this.A02 = abstractC000600i;
        this.A0D = c41991uq;
        this.A04 = c01b;
        this.A0B = c05y;
        this.A06 = c40261rr;
        this.A09 = anonymousClass008;
        this.A0A = c000500h;
        this.A05 = interfaceC40271rs;
        this.A0C = c04500Kk;
        this.A0G = set;
        this.A0H = z;
        this.A07 = c461024y;
        this.A08 = c0ma;
    }

    public void A00() {
        C000200d.A1J(C000200d.A0P("blocklistresponsehandler/general_request_timeout jid="), this.A07.A00);
        C04500Kk c04500Kk = this.A0C;
        if (c04500Kk != null) {
            this.A0D.A0E(c04500Kk.A01, 500);
        }
        this.A03.A0G(this.A0E);
    }

    public void A01(int i) {
        C000200d.A1J(C000200d.A0Q("blocklistresponsehandler/general_request_failed ", i, " | "), this.A07.A00);
        this.A03.A0G(this.A0F);
        C04500Kk c04500Kk = this.A0C;
        if (c04500Kk != null) {
            this.A0D.A0E(c04500Kk.A01, i);
        }
    }

    public void A02(String str) {
        C461024y c461024y = this.A07;
        UserJid userJid = c461024y.A00;
        boolean z = c461024y.A04;
        C000200d.A0x("blocklistresponsehandler/general_request_success jid=", userJid);
        this.A00 = true;
        if (z) {
            C40261rr c40261rr = this.A06;
            synchronized (c40261rr) {
                if (c40261rr.A0O.add(userJid)) {
                    c40261rr.A0B(userJid, str, true);
                }
            }
        } else {
            C40261rr c40261rr2 = this.A06;
            synchronized (c40261rr2) {
                if (c40261rr2.A0O.remove(userJid)) {
                    c40261rr2.A0B(userJid, str, false);
                }
            }
        }
        this.A03.A0G(this.A0F);
        C04500Kk c04500Kk = this.A0C;
        if (c04500Kk != null) {
            this.A0D.A0E(c04500Kk.A01, 200);
        }
    }
}
