package X;

import android.os.Message;
import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.report.ReportActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2hg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C53892hg extends C0HS {
    public final C018508q A00;
    public final C2EF A01;
    public final WeakReference A02;

    public C53892hg(ActivityC02290Ap activityC02290Ap, C018508q c018508q, C2EF c2ef) {
        this.A02 = new WeakReference(activityC02290Ap);
        this.A00 = c018508q;
        this.A01 = c2ef;
    }

    @Override // X.C0HS
    public void A06() {
        ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) this.A02.get();
        if (activityC02290Ap == null || activityC02290Ap.AFE()) {
            return;
        }
        activityC02290Ap.AUr(0, R.string.register_wait_message);
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        Future A05;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ReportActivity reportActivity = (ReportActivity) this.A01;
        C0EG c0eg = reportActivity.A0M;
        C80053me c80053me = new C80053me(reportActivity);
        if (c0eg.A02.A06 && c0eg.A02.A02) {
            C05Y c05y = c0eg.A07;
            String A02 = c05y.A02();
            try {
                Log.i("sendmethods/sendRequestGdprReport");
                A05 = c05y.A05(A02, Message.obtain(null, 0, 167, 0, new C0Yp(A02, c80053me)), false);
            } catch (C0S4 unused) {
            }
            if (A05 != null) {
                try {
                    A05.get(32000L, TimeUnit.MILLISECONDS);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (elapsedRealtime2 < 500) {
                        try {
                            Thread.sleep(500 - elapsedRealtime2);
                            return null;
                        } catch (InterruptedException unused2) {
                        }
                    }
                    return null;
                } catch (Exception e) {
                    Log.w("send-request-gdpr-report/timeout", e);
                    C018508q c018508q = this.A00;
                    c018508q.A02.post(new RunnableEBaseShape5S0100000_I0_5(this, 46));
                    return null;
                }
            }
        }
        Log.e("send-request-gdpr-report/failed/callback is null");
        C018508q c018508q2 = this.A00;
        c018508q2.A02.post(new RunnableEBaseShape5S0100000_I0_5(this, 46));
        return null;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) this.A02.get();
        if (activityC02290Ap == null || activityC02290Ap.AFE()) {
            return;
        }
        activityC02290Ap.ARS();
        ((ReportActivity) this.A01).A1Q();
    }
}