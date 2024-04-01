package X;

import android.os.Message;
import com.whatsapp.jid.UserJid;

/* renamed from: X.279 */
/* loaded from: classes2.dex */
public class AnonymousClass279 implements C0EK {
    public static volatile AnonymousClass279 A0B;
    public final AbstractC000600i A00;
    public final C02L A01;
    public final C05W A02;
    public final C011505r A03;
    public final C0C9 A04;
    public final C03180Eq A05;
    public final C0EG A06;
    public final C0EJ A07;
    public final C456723a A08;
    public final C07A A09;
    public final InterfaceC002901k A0A;

    @Override // X.C0EK
    public int[] AAP() {
        return new int[]{189};
    }

    public AnonymousClass279(AbstractC000600i abstractC000600i, C02L c02l, InterfaceC002901k interfaceC002901k, C0EG c0eg, C05W c05w, C0C9 c0c9, C03180Eq c03180Eq, C011505r c011505r, C0EJ c0ej, C456723a c456723a, C07A c07a) {
        this.A00 = abstractC000600i;
        this.A01 = c02l;
        this.A0A = interfaceC002901k;
        this.A06 = c0eg;
        this.A02 = c05w;
        this.A04 = c0c9;
        this.A05 = c03180Eq;
        this.A03 = c011505r;
        this.A07 = c0ej;
        this.A08 = c456723a;
        this.A09 = c07a;
    }

    @Override // X.C0EK
    public boolean AEN(int i, Message message) {
        String str;
        if (i != 189) {
            return false;
        }
        C02590Ca c02590Ca = (C02590Ca) message.obj;
        C04420Kc c04420Kc = (C04420Kc) message.getData().getParcelable("stanzaKey");
        C000700j.A04(c04420Kc, "stanzaKey is null");
        C02590Ca A0C = c02590Ca.A0C(0);
        if (A0C != null) {
            C05140Nm A04 = this.A07.A04(c04420Kc.A00);
            if (A04 != null) {
                A04.A00 = A0C.A00;
                A04.A00(3);
            }
            C04P A0A = c02590Ca.A0A("t");
            if (A0A != null) {
                str = A0A.A03;
            } else {
                str = null;
            }
            long A03 = AnonymousClass024.A03(str, System.currentTimeMillis());
            AbstractC000600i abstractC000600i = this.A00;
            AbstractC005302j abstractC005302j = (AbstractC005302j) A0C.A08(AbstractC005302j.class, "jid", abstractC000600i);
            if (abstractC005302j == null) {
                StringBuilder A0P = C000200d.A0P("profile-picture-notification-handler/ignoring notification for invalid jid: ");
                C04P A0A2 = A0C.A0A("jid");
                C000200d.A1O(A0P, A0A2 != null ? A0A2.A03 : null);
                return false;
            }
            UserJid userJid = (UserJid) A0C.A08(UserJid.class, "author", abstractC000600i);
            if (C02590Ca.A02(A0C, "set")) {
                C04P A0A3 = A0C.A0A("id");
                this.A0A.AS1(new RunnableC70733Tk(this, c04420Kc, abstractC005302j, userJid, AnonymousClass024.A01(A0A3 != null ? A0A3.A03 : null, -1), A03));
                return true;
            } else if (C02590Ca.A02(A0C, "delete")) {
                this.A0A.AS1(new RunnableC70733Tk(this, c04420Kc, abstractC005302j, userJid, -1, A03));
                return true;
            } else if (C02590Ca.A02(A0C, "request")) {
                this.A0A.AS1(new RunnableEBaseShape0S0300000_I0_0(this, c04420Kc, abstractC005302j, 45));
                return true;
            } else {
                this.A06.A0L(c04420Kc);
                return true;
            }
        }
        throw null;
    }
}
