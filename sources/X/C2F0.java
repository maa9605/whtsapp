package X;

import android.content.Context;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.2F0  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2F0 extends Job implements C0I7 {
    public transient C0EG A00;
    public transient C41911ui A01;

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2F0() {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r2 = 0
            r1 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r1, r2)
            r4.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2F0.<init>():void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        Log.w("Fetch2FAEmailStatusJob/canceled");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        Log.i("Fetch2FAEmailStatusJob/onRun: asking for 2FA status");
        C0EG c0eg = this.A00;
        Future future = null;
        if (c0eg.A02.A06 && c0eg.A02.A02) {
            Log.i("sendmethods/send-get-two-factor-auth");
            C05Y c05y = c0eg.A07;
            String A02 = c05y.A02();
            try {
                Message obtain = Message.obtain(null, 0, 114, 0);
                obtain.obj = A02;
                future = c05y.A05(A02, obtain, false);
            } catch (C0S4 unused) {
            }
            if (future != null) {
                try {
                    future.get(32000L, TimeUnit.MILLISECONDS);
                    if (this.A01.A01().getInt("two_factor_auth_email_set", 0) != 0) {
                        return;
                    }
                    Log.w("Fetch2FAEmailStatusJob/onRun: email status fetching failed");
                    throw new Exception("Failing Fetch2FAEmailStatusJob, fetching status failed");
                } catch (Exception unused2) {
                    Log.i("Fetch2FAEmailStatusJob/onRun: timeout waiting for response");
                    throw new Exception("Failing Fetch2FAEmailStatusJob, timeout for response");
                }
            }
        }
        Log.i("Fetch2FAEmailStatusJob/onRun: application not ready to send IQ");
        throw new Exception("Failing Fetch2FAEmailStatusJob, application is not ready to send IQ");
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        Log.w("Fetch2FAEmailStatusJob/exception", exc);
        return true;
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) AnonymousClass029.A0X(context.getApplicationContext());
        this.A00 = c0c5.A1M();
        this.A01 = c0c5.A1h();
    }
}
