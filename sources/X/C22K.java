package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.22K */
/* loaded from: classes2.dex */
public final class C22K implements C0EK {
    public static volatile C22K A0C;
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final C0E4 A01;
    public final C0E5 A02;
    public final C0EP A03;
    public final C04h A04;
    public final C2AY A05;
    public final C000500h A06;
    public final C01J A07;
    public final C01R A08;
    public final C41401tr A09;
    public final C0EG A0A;
    public final C0EJ A0B;

    public C22K(C0EG c0eg, C01R c01r, C0EP c0ep, C0E4 c0e4, C01J c01j, C04h c04h, C0EJ c0ej, C000500h c000500h, C41401tr c41401tr, C0E5 c0e5, C2AY c2ay) {
        this.A0A = c0eg;
        this.A08 = c01r;
        this.A03 = c0ep;
        this.A01 = c0e4;
        this.A07 = c01j;
        this.A04 = c04h;
        this.A0B = c0ej;
        this.A06 = c000500h;
        this.A09 = c41401tr;
        this.A02 = c0e5;
        this.A05 = c2ay;
    }

    public final void A00(DeviceJid deviceJid) {
        StringBuilder sb = new StringBuilder("Prekey request returned none or signature invalid; jid=");
        sb.append(deviceJid);
        Log.i(sb.toString());
        this.A07.A0M(C002701i.A0T(deviceJid), null);
        C0E5 c0e5 = this.A02;
        synchronized (c0e5) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("prekeysmanager/onGetPreKeyNone:");
            sb2.append(deviceJid);
            Log.i(sb2.toString());
            c0e5.A06.remove(deviceJid);
        }
        if (!deviceJid.isPrimary()) {
            this.A09.A07(deviceJid, true);
        }
    }

    @Override // X.C0EK
    public int[] AAP() {
        return new int[]{74, 75, 76, 77, 78, 196, 79, 80, 81, 82, 83, 84};
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x01d3, code lost:
        if (r1 == false) goto L68;
     */
    @Override // X.C0EK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AEN(int r18, android.os.Message r19) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22K.AEN(int, android.os.Message):boolean");
    }
}
