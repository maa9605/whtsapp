package X;

import android.os.Bundle;
import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.1u1 */
/* loaded from: classes2.dex */
public class C41501u1 {
    public static volatile C41501u1 A04;
    public final C0R4 A00;
    public final C02L A01;
    public final C01B A02;
    public final C0EG A03;

    public C41501u1(C02L c02l, C0EG c0eg, C01B c01b, C0R4 c0r4) {
        this.A01 = c02l;
        this.A03 = c0eg;
        this.A02 = c01b;
        this.A00 = c0r4;
    }

    public static C41501u1 A00() {
        if (A04 == null) {
            synchronized (C41501u1.class) {
                C02L A00 = C02L.A00();
                C0EG A002 = C0EG.A00();
                C01B A003 = C01B.A00();
                if (C0R4.A01 == null) {
                    synchronized (C0R4.class) {
                        C0R4.A01 = new C0R4(JniBridge.getInstance());
                    }
                }
                A04 = new C41501u1(A00, A002, A003, C0R4.A01);
            }
        }
        return A04;
    }

    public static final void A01(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            if (bArr2.length != 12) {
                throw new IllegalArgumentException("expected iv of length 12 bytes.");
            }
            return;
        }
        throw new IllegalArgumentException("expected media key of length 32 bytes.");
    }

    public void A02(AnonymousClass097 anonymousClass097, int i, Jid jid, String str, AbstractC005302j abstractC005302j, boolean z, UserJid userJid, String str2) {
        byte[] bArr;
        byte[] bArr2;
        if (i == 1 || this.A01.A09(DeviceJid.of(jid))) {
            if (this.A02.A0E(C01C.A1V) && anonymousClass097 != null) {
                C09H c09h = anonymousClass097.A02;
                if (c09h != null) {
                    byte[] bArr3 = c09h.A0U;
                    if (bArr3 != null) {
                        String str3 = anonymousClass097.A0n.A01;
                        if (i != 1) {
                            str2 = null;
                        }
                        C0R5 c0r5 = new C0R5(str3, str2, i);
                        bArr2 = C02A.A0C(12);
                        A01(bArr3, bArr2);
                        if (this.A00.A00 == null) {
                            throw null;
                        }
                        bArr = (byte[]) JniBridge.jvidispatchOOOOO(2, str3, c0r5.A00, bArr3, bArr2);
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            } else {
                bArr = null;
                bArr2 = null;
            }
            C0EG c0eg = this.A03;
            if (c0eg.A02.A06) {
                C05Y c05y = c0eg.A07;
                Message obtain = Message.obtain(null, 0, 34, 0);
                Bundle data = obtain.getData();
                data.putString("id", str);
                data.putParcelable("jid", jid);
                data.putParcelable("remote_jid", abstractC005302j);
                data.putBoolean("from_me", z);
                data.putParcelable("participant", userJid);
                data.putByteArray("enc_data", bArr);
                data.putByteArray("enc_iv", bArr2);
                data.putInt("error_code", i);
                c05y.A09(obtain);
            }
        }
    }
}
