package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Arrays;

/* renamed from: X.0JV */
/* loaded from: classes.dex */
public class C0JV {
    public long A00;
    public long A01;
    public String A02;
    public final int A03;
    public final long A04;
    public final DeviceJid A05;
    public final C0L3 A06;
    public final String A07;
    public final boolean A08;

    public C0JV(DeviceJid deviceJid, C0L3 c0l3, String str, long j, long j2, long j3, int i, boolean z, String str2) {
        if (deviceJid != null) {
            this.A05 = deviceJid;
            this.A06 = c0l3;
            this.A07 = str;
            this.A00 = j;
            this.A04 = j2;
            this.A01 = j3;
            this.A03 = i;
            this.A08 = z;
            this.A02 = str2;
            return;
        }
        throw null;
    }

    public boolean A00() {
        return this.A01 > 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0JV c0jv = (C0JV) obj;
        return this.A05.equals(c0jv.A05) && this.A06.equals(c0jv.A06) && AnonymousClass024.A0k(this.A07, c0jv.A07) && this.A00 == c0jv.A00 && this.A04 == c0jv.A04 && this.A01 == c0jv.A01 && this.A03 == c0jv.A03 && this.A08 == c0jv.A08 && AnonymousClass024.A0l(this.A02, c0jv.A02);
    }

    public int hashCode() {
        DeviceJid deviceJid = this.A05;
        return Arrays.hashCode(new Object[]{deviceJid, this.A06, deviceJid, Long.valueOf(this.A00), Long.valueOf(this.A04), Long.valueOf(this.A01), Integer.valueOf(this.A03), Boolean.valueOf(this.A08), this.A02});
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("Device jid: ");
        A0P.append(this.A05);
        A0P.append(", Platform type: ");
        A0P.append(this.A06.toString());
        A0P.append(", Device OS: ");
        A0P.append(this.A07);
        A0P.append(", Last active: ");
        A0P.append(this.A00);
        A0P.append(", Login time: ");
        A0P.append(this.A04);
        A0P.append(", Logout time: ");
        A0P.append(this.A01);
        A0P.append(", ADV Key Index: ");
        A0P.append(this.A03);
        A0P.append(", full sync required: ");
        A0P.append(this.A08);
        A0P.append(", Place Name: ");
        A0P.append(this.A02);
        return A0P.toString();
    }
}
