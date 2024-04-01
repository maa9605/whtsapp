package X;

import android.os.PowerManager;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* renamed from: X.1tj */
/* loaded from: classes2.dex */
public class C41321tj {
    public static volatile C41321tj A0F;
    public final AbstractC000600i A00;
    public final C02L A01;
    public final C04960Mq A02;
    public final C0E6 A03;
    public final C05W A04;
    public final C468928r A05;
    public final C0KQ A06;
    public final C0E7 A07;
    public final C02E A08;
    public final C42431vj A09;
    public final C0EB A0A;
    public final C0EG A0B;
    public final C26Y A0C;
    public final C26S A0D;
    public final InterfaceC002901k A0E;

    public C41321tj(AbstractC000600i abstractC000600i, C02L c02l, InterfaceC002901k interfaceC002901k, C0EG c0eg, C0EB c0eb, C0E6 c0e6, C05W c05w, C02E c02e, C26Y c26y, C0E7 c0e7, C04960Mq c04960Mq, C26S c26s, C42431vj c42431vj, C468928r c468928r, C0KQ c0kq) {
        this.A00 = abstractC000600i;
        this.A01 = c02l;
        this.A0E = interfaceC002901k;
        this.A0B = c0eg;
        this.A0A = c0eb;
        this.A03 = c0e6;
        this.A04 = c05w;
        this.A08 = c02e;
        this.A0C = c26y;
        this.A07 = c0e7;
        this.A02 = c04960Mq;
        this.A0D = c26s;
        this.A09 = c42431vj;
        this.A05 = c468928r;
        this.A06 = c0kq;
    }

    public static C41321tj A00() {
        if (A0F == null) {
            synchronized (C41321tj.class) {
                if (A0F == null) {
                    A0F = new C41321tj(AbstractC000600i.A00(), C02L.A00(), C002801j.A00(), C0EG.A00(), C0EB.A00(), C0E6.A00(), C05W.A00(), C02E.A00(), C26Y.A01, C0E7.A00(), C04960Mq.A00(), C26S.A00(), C42431vj.A00(), C468928r.A00(), C0KQ.A00());
                }
            }
        }
        return A0F;
    }

    public EnumC40721sl A01(C468528n c468528n) {
        if (!this.A07.A05()) {
            Log.i("contactsyncmethods/network_unavailable");
            return EnumC40721sl.NETWORK_UNAVAILABLE;
        }
        try {
            return (EnumC40721sl) A02(c468528n, false).get();
        } catch (InterruptedException | ExecutionException unused) {
            return EnumC40721sl.FAILED;
        }
    }

    public final C0Ml A02(C468528n c468528n, boolean z) {
        C469028s c469028s = new C469028s(z);
        c468528n.A03.add(c469028s);
        C468928r c468928r = this.A05;
        c468928r.A0O.execute(new RunnableEBaseShape1S0200000_I0_1(c468928r, c468528n, 9));
        return c469028s;
    }

    public C0Ml A03(Collection collection, C22H c22h) {
        collection.size();
        C468428m c468428m = new C468428m(c22h);
        c468428m.A04 = true;
        c468428m.A00 = new C468328l(false, false, false, false, true, false);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
            this.A04.A0A(abstractC005302j);
            if (abstractC005302j != null) {
                c468428m.A02.add(abstractC005302j);
            }
        }
        return A02(c468428m.A01(), true);
    }

    public void A04() {
        C02L c02l = this.A01;
        c02l.A05();
        if (c02l.A00 == null) {
            return;
        }
        this.A0E.AS1(new RunnableEBaseShape1S0100000_I0_1(this, 41));
    }

    public void A05() {
        C468428m c468428m = new C468428m(!this.A0C.A01() ? C22H.A05 : C22H.A02);
        c468428m.A05 = true;
        c468428m.A06 = true;
        c468428m.A02();
        A02(c468428m.A01(), true);
    }

    public void A06() {
        C468428m c468428m = new C468428m(!this.A0C.A01() ? C22H.A05 : C22H.A02);
        c468428m.A05 = true;
        c468428m.A06 = true;
        c468428m.A02();
        c468428m.A04 = true;
        A02(c468428m.A01(), true);
    }

    public final void A07(C22H c22h, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        PowerManager.WakeLock A0R;
        PowerManager A0D = this.A08.A0D();
        if (A0D == null) {
            Log.w("contactsyncmethods/forceFullSync pm=null");
            A0R = null;
        } else {
            A0R = C02180Ae.A0R(A0D, 1, "fullsync");
        }
        if (A0R != null) {
            try {
                try {
                    A0R.acquire();
                    Log.i("contactsyncmethods/forceFullSync/wl/acquire");
                } catch (RuntimeException e) {
                    Log.e("contactsyncmethods/forceFullSync", e);
                    this.A00.A09("contactsyncmethods/forceFullSync", e.getMessage(), true);
                    if (A0R == null || !A0R.isHeld()) {
                        return;
                    }
                }
            } catch (Throwable th) {
                if (A0R != null && A0R.isHeld()) {
                    A0R.release();
                    Log.i("contactsyncmethods/forceFullSync/wl/release");
                }
                throw th;
            }
        }
        C468428m c468428m = new C468428m(c22h);
        c468428m.A04 = true;
        c468428m.A03 = z;
        c468428m.A00 = new C468328l(z2, z3, z4, z5, z6, z7);
        A01(c468428m.A01());
        if (A0R == null || !A0R.isHeld()) {
            return;
        }
        A0R.release();
        Log.i("contactsyncmethods/forceFullSync/wl/release");
    }
}
