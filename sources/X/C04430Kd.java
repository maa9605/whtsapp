package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.0Kd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04430Kd {
    public boolean A00;
    public final DeviceJid A01;

    public C04430Kd(DeviceJid deviceJid, boolean z) {
        this.A01 = deviceJid;
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C04430Kd.class != obj.getClass()) {
            return false;
        }
        C04430Kd c04430Kd = (C04430Kd) obj;
        if (this.A00 != c04430Kd.A00) {
            return false;
        }
        return this.A01.equals(c04430Kd.A01);
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + (this.A00 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("ParticipantDevice{deviceJid=");
        A0P.append(this.A01);
        A0P.append(", sentSenderKey=");
        A0P.append(this.A00);
        A0P.append('}');
        return A0P.toString();
    }
}
