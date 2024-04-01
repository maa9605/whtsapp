package X;

import android.os.PowerManager;
import com.whatsapp.util.Log;

/* renamed from: X.2AU */
/* loaded from: classes2.dex */
public class C2AU {
    public static volatile C2AU A07;
    public boolean A00;
    public final C018508q A01;
    public final C010005b A02;
    public final C02E A03;
    public final C40291rx A04;
    public final C22I A05;
    public final C41991uq A06;

    public C2AU(C018508q c018508q, C41991uq c41991uq, C40291rx c40291rx, C02E c02e, C22I c22i, C010005b c010005b) {
        this.A01 = c018508q;
        this.A06 = c41991uq;
        this.A04 = c40291rx;
        this.A03 = c02e;
        this.A05 = c22i;
        this.A02 = c010005b;
    }

    public static C2AU A00() {
        if (A07 == null) {
            synchronized (C2AU.class) {
                if (A07 == null) {
                    A07 = new C2AU(C018508q.A00(), C41991uq.A00(), C40291rx.A00(), C02E.A00(), C22I.A00(), C010005b.A07);
                }
            }
        }
        return A07;
    }

    public final void A01() {
        C41991uq c41991uq = this.A06;
        c41991uq.A0I();
        if ((this.A02.A06 && this.A00 && !c41991uq.A0I()) || (c41991uq.A0I() && !this.A00)) {
            C40291rx c40291rx = this.A04;
            if (c40291rx.A0O != null) {
                c40291rx.A0A.ASY();
                c40291rx.A04();
                c40291rx.A1T.A02();
                c40291rx.A0C(true, false, false);
                c40291rx.A0s.A01();
                return;
            }
            throw null;
        }
    }

    public final void A02() {
        C41991uq c41991uq = this.A06;
        c41991uq.A0I();
        if (this.A02.A06 && !this.A00 && !c41991uq.A0I()) {
            PowerManager A0D = this.A03.A0D();
            if (A0D == null) {
                Log.w("app/send/inactive pm=null");
            } else {
                PowerManager.WakeLock A0R = C02180Ae.A0R(A0D, 1, "sendinactive");
                if (A0R != null) {
                    A0R.acquire(3000L);
                    Log.i("app/sendinactive/wl");
                }
            }
            C40291rx c40291rx = this.A04;
            if (c40291rx.A0O != null) {
                c40291rx.A0A.ASZ();
            } else {
                throw null;
            }
        }
        if (this.A00) {
            return;
        }
        C018508q c018508q = this.A01;
        c018508q.A02.post(new RunnableEBaseShape4S0100000_I0_4(this.A05, 48));
    }
}
