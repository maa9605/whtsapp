package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashSet;

/* renamed from: X.255  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass255 implements InterfaceC010405f {
    public final AbstractC000600i A00;
    public final C018508q A01;
    public final C40261rr A02;
    public final C000500h A03;
    public final C05Y A04;
    public final InterfaceC04440Ke A05;
    public final boolean A06;

    public AnonymousClass255(C018508q c018508q, AbstractC000600i abstractC000600i, C05Y c05y, C40261rr c40261rr, C000500h c000500h, InterfaceC04440Ke interfaceC04440Ke) {
        this.A01 = c018508q;
        this.A00 = abstractC000600i;
        this.A04 = c05y;
        this.A02 = c40261rr;
        this.A03 = c000500h;
        this.A05 = interfaceC04440Ke;
        this.A06 = c40261rr.A07.A0E(C01C.A1K);
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        C000200d.A14("getblocklistprotocolhelper/onDeliveryFailure iq=", str);
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        int A01 = C40731sm.A01(c02590Ca);
        if (A01 != 404 || this.A06) {
            StringBuilder sb = new StringBuilder("getblocklistprotocolhelper/onError, iq=");
            sb.append(str);
            sb.append("; errorCode=");
            sb.append(A01);
            Log.i(sb.toString());
            return;
        }
        this.A01.A0G(new RunnableEBaseShape5S0100000_I0_5(this, 7));
        InterfaceC04440Ke interfaceC04440Ke = this.A05;
        if (interfaceC04440Ke != null) {
            ((AnonymousClass281) interfaceC04440Ke).A00(4);
        }
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        String str2;
        Jid A08;
        int i = 0;
        if (this.A06) {
            C02590Ca A0D = c02590Ca.A0D("list");
            if (A0D != null) {
                HashSet hashSet = new HashSet();
                C04P A0A = A0D.A0A("dhash");
                String str3 = A0A != null ? A0A.A03 : null;
                C02590Ca[] c02590CaArr = A0D.A03;
                if (c02590CaArr != null) {
                    while (i < c02590CaArr.length) {
                        C02590Ca c02590Ca2 = c02590CaArr[i];
                        C02590Ca.A01(c02590Ca2, "item");
                        hashSet.add(c02590Ca2.A08(UserJid.class, "jid", this.A00));
                        i++;
                    }
                }
                this.A01.A0G(new RunnableEBaseShape0S1200000_I0(this, str3, hashSet, 16));
            }
        } else {
            C02590Ca A0B = c02590Ca.A0B();
            C02590Ca.A01(A0B, "query");
            C02590Ca A0B2 = A0B.A0B();
            C02590Ca.A01(A0B2, "list");
            HashSet hashSet2 = new HashSet();
            C02590Ca[] c02590CaArr2 = A0B2.A03;
            if (c02590CaArr2 != null) {
                while (i < c02590CaArr2.length) {
                    C02590Ca c02590Ca3 = c02590CaArr2[i];
                    C02590Ca.A01(c02590Ca3, "item");
                    C04P A0A2 = c02590Ca3.A0A("type");
                    if (A0A2 != null) {
                        str2 = A0A2.A03;
                    } else {
                        str2 = null;
                    }
                    if ("jid".equals(str2) && (A08 = c02590Ca3.A08(UserJid.class, "value", this.A00)) != null) {
                        hashSet2.add(A08);
                    }
                    i++;
                }
            }
            this.A01.A0G(new RunnableEBaseShape3S0200000_I0_3(this, hashSet2, 41));
        }
        InterfaceC04440Ke interfaceC04440Ke = this.A05;
        if (interfaceC04440Ke != null) {
            ((AnonymousClass281) interfaceC04440Ke).A00(4);
        }
    }
}
