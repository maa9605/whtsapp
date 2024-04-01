package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.1uG */
/* loaded from: classes2.dex */
public class C41631uG {
    public static volatile C41631uG A0M;
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final C02L A01;
    public final C0E3 A02;
    public final C01B A03;
    public final C0E6 A04;
    public final C04h A05;
    public final C2AY A06;
    public final AnonymousClass012 A07;
    public final C01J A08;
    public final C01R A09;
    public final C0C9 A0A;
    public final C0C8 A0B;
    public final C0E9 A0C;
    public final C42761wH A0D;
    public final C41401tr A0E;
    public final C0EC A0F;
    public final C0EE A0G;
    public final C41511u2 A0H;
    public final C0EG A0I;
    public final C0EJ A0J;
    public final AnonymousClass247 A0K;
    public final C26S A0L;

    public C41631uG(AnonymousClass012 anonymousClass012, C02L c02l, C0EG c0eg, C01B c01b, C0E6 c0e6, C0E3 c0e3, C42761wH c42761wH, C01R c01r, C0C9 c0c9, AnonymousClass247 anonymousClass247, C0EE c0ee, C01J c01j, C0EC c0ec, C0E9 c0e9, C41511u2 c41511u2, C04h c04h, C0EJ c0ej, C41401tr c41401tr, C26S c26s, C0C8 c0c8, C2AY c2ay) {
        this.A07 = anonymousClass012;
        this.A01 = c02l;
        this.A0I = c0eg;
        this.A03 = c01b;
        this.A04 = c0e6;
        this.A02 = c0e3;
        this.A0D = c42761wH;
        this.A09 = c01r;
        this.A0A = c0c9;
        this.A0K = anonymousClass247;
        this.A0G = c0ee;
        this.A08 = c01j;
        this.A0F = c0ec;
        this.A0C = c0e9;
        this.A0H = c41511u2;
        this.A05 = c04h;
        this.A0J = c0ej;
        this.A0E = c41401tr;
        this.A0L = c26s;
        this.A0B = c0c8;
        this.A06 = c2ay;
    }

    public static C41631uG A00() {
        if (A0M == null) {
            synchronized (C41631uG.class) {
                if (A0M == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C02L A002 = C02L.A00();
                    AnonymousClass011.A00();
                    A0M = new C41631uG(A00, A002, C0EG.A00(), C01B.A00(), C0E6.A00(), C0E3.A06(), C42761wH.A00(), C01R.A02, C0C9.A00(), AnonymousClass247.A00(), C0EE.A00(), C01J.A00(), C0EC.A00(), C0E9.A00(), C41511u2.A00(), C04h.A00(), C0EJ.A00(), C41401tr.A01(), C26S.A00(), C0C8.A00(), C2AY.A00);
                }
            }
        }
        return A0M;
    }

    public byte[] A01(AnonymousClass094 anonymousClass094, byte[] bArr, int i, byte[] bArr2, byte b, C05020My c05020My, C05020My c05020My2, boolean z, int i2, DeviceJid deviceJid) {
        this.A09.A00();
        C0IO A0T = C002701i.A0T(deviceJid);
        StringBuilder sb = new StringBuilder("axolotl checking sessions for ");
        sb.append(A0T);
        sb.append(" due to retry receipt for ");
        sb.append(anonymousClass094);
        Log.i(sb.toString());
        if (bArr2 != null && bArr != null && c05020My != null && c05020My2 != null) {
            if (z) {
                C01J c01j = this.A08;
                if (!c01j.A0U(A0T)) {
                    C000200d.A0z("axolotl Not processing keys from the receipt, missing session for ", anonymousClass094);
                } else if (c01j.A0C(A0T).A01.A00.A03 != i2) {
                    C000200d.A0z("Not processing keys from the receipt, registrationId does not match for ", anonymousClass094);
                }
            }
            StringBuilder sb2 = new StringBuilder("axolotl processing keys from the receipt for jid:");
            sb2.append(deviceJid);
            Log.i(sb2.toString());
            int A03 = this.A08.A03(C002701i.A0T(deviceJid), bArr2, b, c05020My2, c05020My, bArr);
            if (A03 == 0) {
                this.A00.post(new RunnableEBaseShape3S0200000_I0_3(this, deviceJid, 48));
            } else {
                C000200d.A0p("Error received from SignalCoordinator; status=", A03);
            }
        }
        C01J c01j2 = this.A08;
        if (c01j2.A0U(A0T)) {
            C07930aK c07930aK = c01j2.A0C(A0T).A01;
            byte[] A00 = c07930aK.A00();
            if (c07930aK.A00.A03 != i2) {
                C000200d.A0z("axolotl deleting session due to registration id change for ", anonymousClass094);
                c01j2.A0H.A00();
                c01j2.A0C.A01(A0T);
                c01j2.A0L(A0T);
                return A00;
            } else if (i <= 2 || !c01j2.A0V(A0T, anonymousClass094)) {
                if (i == 2) {
                    C000200d.A0z("axolotl will record the base key used to send ", anonymousClass094);
                    c01j2.A0H.A00();
                    c01j2.A09.A01(A0T, anonymousClass094, A00);
                    return null;
                }
                return null;
            } else {
                StringBuilder sb3 = new StringBuilder("axolotl will wait to send ");
                sb3.append(anonymousClass094);
                sb3.append(" until a new prekey has been fetched");
                Log.i(sb3.toString());
                return A00;
            }
        }
        return null;
    }
}
