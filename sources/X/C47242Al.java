package X;

import com.whatsapp.util.Log;

/* renamed from: X.2Al  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47242Al {
    public static volatile C47242Al A06;
    public boolean A00;
    public final C012005w A01;
    public final C018508q A02;
    public final C000400f A03;
    public final C42171vH A04;
    public final C47862Cw A05;

    public C47242Al(C018508q c018508q, C012005w c012005w, C47862Cw c47862Cw, C000400f c000400f, C42171vH c42171vH) {
        this.A02 = c018508q;
        this.A01 = c012005w;
        this.A05 = c47862Cw;
        this.A03 = c000400f;
        this.A04 = c42171vH;
    }

    public static C47242Al A00() {
        if (A06 == null) {
            synchronized (C000400f.class) {
                if (A06 == null) {
                    C018508q A00 = C018508q.A00();
                    AbstractC000600i.A00();
                    C012005w A002 = C012005w.A00();
                    C47862Cw A003 = C47862Cw.A00();
                    C0KV.A00();
                    A06 = new C47242Al(A00, A002, A003, C000400f.A00(), C42171vH.A00());
                }
            }
        }
        return A06;
    }

    public void A01() {
        C000400f c000400f = this.A03;
        if (c000400f.A00) {
            return;
        }
        if (!c000400f.A01) {
            this.A01.A0O();
            if (!this.A00) {
                this.A00 = true;
                Log.i("media-state-manager/refresh-media-state/writable-media");
                C47862Cw c47862Cw = this.A05;
                if (c47862Cw.A03 == null) {
                    synchronized (c47862Cw) {
                        if (c47862Cw.A03 == null) {
                            c47862Cw.A03 = new AnonymousClass262(c47862Cw.A00.A05, c47862Cw.A01);
                        }
                    }
                }
                c47862Cw.A03.A00();
            }
        }
        C42171vH c42171vH = this.A04;
        if (c42171vH.A02(c42171vH.A04.A00)) {
            c42171vH.A01(-1L, new C2CW(c42171vH, null));
        }
        this.A02.A0G(new RunnableEBaseShape3S0100000_I0_3(c000400f, 39));
    }
}
