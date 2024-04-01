package X;

import android.os.Bundle;
import android.os.Message;

/* renamed from: X.26v  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C464426v implements C0EK {
    public static volatile C464426v A0F;
    public final AnonymousClass012 A00;
    public final C0C9 A01;
    public final C003701t A02;
    public final C0EN A03;
    public final C0EG A04;
    public final C0EJ A05;
    public final C464626x A06;
    public final C0EU A07;
    public final C41821uZ A08;
    public final C0DW A09;
    public final C0DV A0A;
    public final C464526w A0B;
    public final C014406v A0C = C014406v.A00("PaymentsXmppMessageHandler", "notification", "COMMON");
    public final C07A A0D;
    public final InterfaceC002901k A0E;

    public C464426v(AnonymousClass012 anonymousClass012, C003701t c003701t, InterfaceC002901k interfaceC002901k, C0EG c0eg, C0EN c0en, C0DV c0dv, C0C9 c0c9, C0EU c0eu, C0EJ c0ej, C07A c07a, C0DW c0dw, C464526w c464526w, C41821uZ c41821uZ, C464626x c464626x) {
        this.A00 = anonymousClass012;
        this.A02 = c003701t;
        this.A0E = interfaceC002901k;
        this.A04 = c0eg;
        this.A03 = c0en;
        this.A0A = c0dv;
        this.A01 = c0c9;
        this.A07 = c0eu;
        this.A05 = c0ej;
        this.A0D = c07a;
        this.A09 = c0dw;
        this.A0B = c464526w;
        this.A08 = c41821uZ;
        this.A06 = c464626x;
    }

    @Override // X.C0EK
    public int[] AAP() {
        return new int[]{133, 161, 211, 217, 219, 222};
    }

    @Override // X.C0EK
    public boolean AEN(int i, Message message) {
        Bundle data = message.getData();
        C04420Kc c04420Kc = (C04420Kc) data.getParcelable("stanzaKey");
        C05140Nm A04 = this.A05.A04(c04420Kc.A00);
        if (A04 != null) {
            A04.A00(3);
        }
        if (i == 133) {
            this.A0E.AS1(new RunnableEBaseShape0S0300000_I0_0(this, c04420Kc, data, 33));
            return true;
        } else if (i == 161) {
            this.A0E.AS1(new RunnableEBaseShape0S0400000_I0(this, c04420Kc, data.getParcelable("jid"), data, 11));
            return true;
        } else if (i == 211) {
            this.A0E.AS1(new RunnableEBaseShape0S0400000_I0(this, c04420Kc, data.getParcelable("jid"), data, 12));
            return true;
        } else if (i == 217) {
            this.A0E.AS1(new RunnableEBaseShape0S0300000_I0_0(this, c04420Kc, data, 32));
            return true;
        } else if (i != 219) {
            return false;
        } else {
            this.A0E.AS1(new RunnableEBaseShape0S0300000_I0_0(this, c04420Kc, data, 34));
            return true;
        }
    }
}
