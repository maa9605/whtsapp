package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.1BJ  reason: invalid class name */
/* loaded from: classes.dex */
public class C1BJ {
    public static C1BJ A04;
    public C1BI A00;
    public C1BI A01;
    public final Object A03 = new Object();
    public final Handler A02 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.1BG
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C1BJ c1bj = C1BJ.this;
            C1BI c1bi = (C1BI) message.obj;
            synchronized (c1bj.A03) {
                if (c1bj.A00 == c1bi || c1bj.A01 == c1bi) {
                    c1bj.A06(c1bi, 2);
                }
            }
            return true;
        }
    });

    public static C1BJ A00() {
        C1BJ c1bj = A04;
        if (c1bj == null) {
            C1BJ c1bj2 = new C1BJ();
            A04 = c1bj2;
            return c1bj2;
        }
        return c1bj;
    }

    public final void A01() {
        C1BI c1bi = this.A01;
        if (c1bi != null) {
            this.A00 = c1bi;
            this.A01 = null;
            C1BH c1bh = (C1BH) c1bi.A02.get();
            if (c1bh != null) {
                c1bh.AUa();
            } else {
                this.A00 = null;
            }
        }
    }

    public void A02(C1BH c1bh) {
        synchronized (this.A03) {
            if (A05(c1bh)) {
                C1BI c1bi = this.A00;
                if (!c1bi.A01) {
                    c1bi.A01 = true;
                    this.A02.removeCallbacksAndMessages(c1bi);
                }
            }
        }
    }

    public void A03(C1BH c1bh) {
        synchronized (this.A03) {
            if (A05(c1bh)) {
                C1BI c1bi = this.A00;
                if (c1bi.A01) {
                    c1bi.A01 = false;
                    A04(c1bi);
                }
            }
        }
    }

    public final void A04(C1BI c1bi) {
        int i = c1bi.A00;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = 2750;
            if (i == -1) {
                i = 1500;
            }
        }
        Handler handler = this.A02;
        handler.removeCallbacksAndMessages(c1bi);
        handler.sendMessageDelayed(Message.obtain(handler, 0, c1bi), i);
    }

    public final boolean A05(C1BH c1bh) {
        C1BI c1bi = this.A00;
        return (c1bi == null || c1bh == null || c1bi.A02.get() != c1bh) ? false : true;
    }

    public final boolean A06(C1BI c1bi, int i) {
        C1BH c1bh = (C1BH) c1bi.A02.get();
        if (c1bh != null) {
            this.A02.removeCallbacksAndMessages(c1bi);
            c1bh.A7K(i);
            return true;
        }
        return false;
    }
}
