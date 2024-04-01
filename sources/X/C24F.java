package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Arrays;

/* renamed from: X.24F  reason: invalid class name */
/* loaded from: classes2.dex */
public class C24F {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final DeviceJid A0B;

    public C24F(long j, DeviceJid deviceJid, int i, long j2, long j3, long j4, long j5, int i2, long j6, long j7, int i3, long j8) {
        this.A06 = j;
        this.A0B = deviceJid;
        this.A02 = i;
        this.A04 = j2;
        this.A09 = j3;
        this.A0A = j4;
        this.A08 = j5;
        this.A00 = i2;
        this.A07 = j6;
        this.A03 = j7;
        this.A01 = i3;
        this.A05 = j8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C24F.class != obj.getClass()) {
            return false;
        }
        C24F c24f = (C24F) obj;
        return this.A02 == c24f.A02 && this.A04 == c24f.A04 && this.A09 == c24f.A09 && this.A0A == c24f.A0A && this.A08 == c24f.A08 && this.A00 == c24f.A00 && this.A07 == c24f.A07 && this.A03 == c24f.A03 && this.A0B.equals(c24f.A0B) && this.A01 == c24f.A01 && this.A05 == c24f.A05;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0B, Integer.valueOf(this.A02), Long.valueOf(this.A04), Long.valueOf(this.A09), Long.valueOf(this.A0A), Long.valueOf(this.A08), Integer.valueOf(this.A00), Long.valueOf(this.A07), Long.valueOf(this.A03), Integer.valueOf(this.A01), Long.valueOf(this.A05)});
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("SyncDatum{deviceJid=");
        A0P.append(this.A0B);
        A0P.append(", syncType=");
        A0P.append(this.A02);
        A0P.append(", latestMsgId=");
        A0P.append(this.A04);
        A0P.append(", stageOldestMsgId=");
        A0P.append(this.A09);
        A0P.append(", syncOldestMsgId=");
        A0P.append(this.A0A);
        A0P.append(", sendMsgsCount=");
        A0P.append(this.A08);
        A0P.append(", chunkOrder=");
        A0P.append(this.A00);
        A0P.append(", sentBytes=");
        A0P.append(this.A07);
        A0P.append(", lastChunkTimestamp=");
        A0P.append(this.A03);
        A0P.append(", status=");
        A0P.append(this.A01);
        A0P.append(", peerMsgRowId=");
        A0P.append(this.A05);
        A0P.append('}');
        return A0P.toString();
    }
}
