package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.0K0 */
/* loaded from: classes.dex */
public class C0K0 {
    public double A00;
    public double A01;
    public long A05;
    public final UserJid A06;
    public int A03 = -1;
    public float A02 = -1.0f;
    public int A04 = -1;

    public C0K0(UserJid userJid) {
        this.A06 = userJid;
    }

    public void A00(C0K0 c0k0) {
        C000700j.A07(c0k0.A06.equals(this.A06));
        this.A05 = c0k0.A05;
        this.A00 = c0k0.A00;
        this.A01 = c0k0.A01;
        this.A03 = c0k0.A03;
        this.A04 = c0k0.A04;
        this.A02 = c0k0.A02;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0K0) {
            C0K0 c0k0 = (C0K0) obj;
            if (c0k0.A06.equals(this.A06) && c0k0.A05 == this.A05) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("[UserLocation jid=");
        A0P.append(this.A06);
        A0P.append(" latitude=");
        A0P.append(this.A00);
        A0P.append(" longitude=");
        A0P.append(this.A01);
        A0P.append(" accuracy=");
        A0P.append(this.A03);
        A0P.append(" speed=");
        A0P.append(this.A02);
        A0P.append(" bearing=");
        A0P.append(this.A04);
        A0P.append(" timestamp=");
        A0P.append(this.A05);
        A0P.append("]");
        return A0P.toString();
    }
}
