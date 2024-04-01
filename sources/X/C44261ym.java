package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1ym  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44261ym {
    public final int A00;
    public final long A01;
    public final DeviceJid A02;
    public final UserJid A03;

    public C44261ym(DeviceJid deviceJid, UserJid userJid, int i, long j) {
        this.A02 = deviceJid;
        this.A03 = userJid;
        this.A00 = i;
        this.A01 = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C44261ym.class != obj.getClass()) {
            return false;
        }
        C44261ym c44261ym = (C44261ym) obj;
        UserJid userJid = this.A03;
        if (userJid == null) {
            if (c44261ym.A03 != null) {
                return false;
            }
        } else if (!userJid.equals(c44261ym.A03)) {
            return false;
        }
        return this.A00 == c44261ym.A00 && this.A01 == c44261ym.A01 && this.A02.equals(c44261ym.A02);
    }

    public int hashCode() {
        int hashCode = (this.A02.hashCode() + 31) * 31;
        UserJid userJid = this.A03;
        return (int) (((((hashCode + (userJid == null ? 0 : userJid.hashCode())) * 31) + this.A00) * 31) + this.A01);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("Device = ");
        A0P.append(this.A02);
        A0P.append(", recipient = ");
        A0P.append(this.A03);
        A0P.append(", status = ");
        A0P.append(this.A00);
        A0P.append(", timestamp = ");
        A0P.append(this.A01);
        return A0P.toString();
    }
}
