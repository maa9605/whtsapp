package X;

import android.os.Message;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendRetryReceiptJob;
import com.whatsapp.util.Log;

/* renamed from: X.2HA  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2HA {
    public final int A00;
    public final C0E4 A01;
    public final C0E6 A02;
    public final C06T A03;
    public final C41671uK A04;
    public final C0EG A05;
    public final C05190Nr A06;
    public final C05020My A07;
    public final C05020My A08;
    public final boolean A09;
    public final byte[] A0A;

    public C2HA(C0EG c0eg, C0E6 c0e6, C0E4 c0e4, C01J c01j, C06T c06t, C41671uK c41671uK, C05190Nr c05190Nr, byte[] bArr, C05020My c05020My, C05020My c05020My2, boolean z) {
        this.A05 = c0eg;
        this.A02 = c0e6;
        this.A01 = c0e4;
        this.A03 = c06t;
        this.A04 = c41671uK;
        this.A06 = c05190Nr;
        this.A00 = c01j.A08.A02();
        this.A0A = bArr;
        this.A08 = c05020My;
        this.A07 = c05020My2;
        this.A09 = z;
    }

    public void A00() {
        StringBuilder A0P = C000200d.A0P("need to send retry receipt; message.key=");
        C05190Nr c05190Nr = this.A06;
        A0P.append(c05190Nr.A05());
        A0P.append(" participant = ");
        A0P.append(c05190Nr.A06);
        Log.i(A0P.toString());
        c05190Nr.A0U = true;
        int i = this.A00;
        byte[] A1c = AnonymousClass029.A1c(i);
        if (c05190Nr.A01() > 1) {
            this.A01.A03();
        }
        if (c05190Nr.A00() == 0 && c05190Nr.A00 == 0) {
            StringBuilder A0P2 = C000200d.A0P("recording local placeholder for retry receipt; message.key=");
            A0P2.append(c05190Nr.A05());
            Log.i(A0P2.toString());
            this.A03.A01(new RunnableEBaseShape4S0100000_I0_4(this, 29), 50);
        }
        StringBuilder A0P3 = C000200d.A0P("axolotl sending retry receipt; message.key=");
        A0P3.append(c05190Nr.A05());
        A0P3.append("; localRegistrationId=");
        C000200d.A1F(A0P3, i);
        if (!this.A09) {
            C0EG c0eg = this.A05;
            Jid jid = c05190Nr.A0Z;
            String str = c05190Nr.A0d;
            Jid jid2 = c05190Nr.A06;
            UserJid userJid = c05190Nr.A0a;
            long j = c05190Nr.A0Y;
            int A01 = 1 + c05190Nr.A01();
            byte[] bArr = this.A0A;
            C05020My c05020My = this.A08;
            C05020My c05020My2 = this.A07;
            long j2 = c05190Nr.A04;
            String str2 = c05190Nr.A0N;
            if (c0eg.A02.A06) {
                c0eg.A07.A09(Message.obtain(null, 0, 11, 0, new C0ZI(jid, str, jid2, userJid, j, A01, A1c, bArr, (byte) 5, c05020My, c05020My2, j2, str2)));
                return;
            }
            return;
        }
        C0E6 c0e6 = this.A02;
        c0e6.A00.A01(new SendRetryReceiptJob(c05190Nr, i));
    }
}
