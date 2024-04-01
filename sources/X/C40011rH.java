package X;

import android.app.ActivityManager;
import android.content.Context;
import com.whatsapp.util.Log;
import com.whatsapp.util.crash.SigquitBasedANRDetector;

/* renamed from: X.1rH  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40011rH {
    public long A01;
    public C40031rJ A02;
    public final Context A05;
    public int A00 = 0;
    public final int A04 = 500;
    public final int A03 = 120;

    public C40011rH(Context context) {
        this.A05 = context;
    }

    public void A00() {
        synchronized (this) {
            if (this.A00 != 0) {
                C40031rJ c40031rJ = this.A02;
                Object obj = c40031rJ.A04;
                synchronized (obj) {
                    c40031rJ.A01 = true;
                    obj.notifyAll();
                }
            }
        }
    }

    public final synchronized void A01(int i, C40021rI c40021rI, String str, String str2) {
        if (this.A02.A02 != this.A01) {
            return;
        }
        if (i != 0) {
            if (i == 1) {
                this.A00 = 2;
                C40021rI c40021rI2 = c40021rI;
                StringBuilder sb = new StringBuilder("SigquitBasedANRDetector/On error detected ");
                sb.append(str);
                sb.append(" ");
                sb.append(str2);
                Log.i(sb.toString());
                SigquitBasedANRDetector sigquitBasedANRDetector = c40021rI2.A01;
                if (sigquitBasedANRDetector.A09 != null) {
                    sigquitBasedANRDetector.A09.post(new RunnableEBaseShape7S0100000_I0_7(c40021rI2, 29));
                }
            } else if (i == 2) {
                this.A00 = 0;
                c40021rI.A00();
            } else if (i == 3) {
                this.A00 = 0;
                c40021rI.A00();
            } else if (i == 4) {
                this.A00 = 0;
                C40021rI c40021rI3 = c40021rI;
                Log.e("SigquitBasedANRDetector/onCheckFailed");
                c40021rI3.A00();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected state change reason: ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else if (c40021rI != null) {
            Log.i("SigquitBasedANRDetector/Started monitoring");
        } else {
            throw null;
        }
    }

    public void A02(C40021rI c40021rI) {
        ActivityManager activityManager = (ActivityManager) this.A05.getSystemService("activity");
        synchronized (this) {
            C40031rJ c40031rJ = this.A02;
            if (c40031rJ != null && this.A00 != 0) {
                Object obj = c40031rJ.A04;
                synchronized (obj) {
                    c40031rJ.A01 = true;
                    obj.notifyAll();
                }
            }
            long j = this.A01 + 1;
            this.A01 = j;
            C40031rJ c40031rJ2 = new C40031rJ(this, activityManager, c40021rI, j);
            this.A02 = c40031rJ2;
            this.A00 = 1;
            c40031rJ2.start();
        }
    }
}
