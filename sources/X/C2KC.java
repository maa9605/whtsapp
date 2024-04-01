package X;

import android.os.Message;
import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2KC */
/* loaded from: classes2.dex */
public class C2KC extends C0HS {
    public final C018508q A00;
    public final C05W A01;
    public final C018708s A02;
    public final C0ES A03;
    public final C011005l A04;
    public final C0EG A05;
    public final WeakReference A06;
    public final List A07;
    public final List A08;

    public C2KC(C018508q c018508q, C0EG c0eg, C05W c05w, C018708s c018708s, C0ES c0es, ActivityC02290Ap activityC02290Ap, C011005l c011005l, List list, List list2) {
        this.A00 = c018508q;
        this.A05 = c0eg;
        this.A01 = c05w;
        this.A02 = c018708s;
        this.A03 = c0es;
        this.A06 = new WeakReference(activityC02290Ap);
        this.A04 = c011005l;
        this.A08 = list;
        this.A07 = list2;
    }

    @Override // X.C0HS
    public void A06() {
        ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) this.A06.get();
        if (activityC02290Ap == null || activityC02290Ap.isFinishing()) {
            return;
        }
        activityC02290Ap.AUr(R.string.updating_group_admins, R.string.register_wait_message);
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        Future A05;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C0EG c0eg = this.A05;
        C011005l c011005l = this.A04;
        List list = this.A08;
        List list2 = this.A07;
        C2KB c2kb = new C2KB(this);
        C010005b c010005b = c0eg.A02;
        if (c010005b.A06 && c010005b.A02) {
            C05Y c05y = c0eg.A07;
            String A02 = c05y.A02();
            try {
                Log.i("sendmethods/sendModifyAdmins");
                A05 = c05y.A05(A02, Message.obtain(null, 0, 166, 0, new C07540Yq(A02, c011005l, list, list2, c2kb)), false);
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
                    Log.w("modify-admins/timeout", e);
                    C018508q c018508q = this.A00;
                    c018508q.A02.post(new RunnableEBaseShape3S0100000_I0_3(this, 6));
                    return null;
                }
            }
        }
        Log.e("modify-admins/failed/callback is null");
        C018508q c018508q2 = this.A00;
        c018508q2.A02.post(new RunnableEBaseShape3S0100000_I0_3(this, 5));
        return null;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) this.A06.get();
        if (activityC02290Ap == null || activityC02290Ap.isFinishing()) {
            return;
        }
        activityC02290Ap.ARS();
    }
}
