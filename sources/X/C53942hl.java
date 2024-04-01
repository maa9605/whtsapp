package X;

import android.app.job.JobParameters;
import android.os.Handler;
import com.whatsapp.service.UnsentMessagesNetworkAvailableJob;

/* renamed from: X.2hl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C53942hl extends C00T {
    public final /* synthetic */ UnsentMessagesNetworkAvailableJob A00;

    public C53942hl(UnsentMessagesNetworkAvailableJob unsentMessagesNetworkAvailableJob) {
        this.A00 = unsentMessagesNetworkAvailableJob;
    }

    @Override // X.C00T
    public void A08(AnonymousClass092 anonymousClass092, int i) {
        UnsentMessagesNetworkAvailableJob unsentMessagesNetworkAvailableJob = this.A00;
        if (unsentMessagesNetworkAvailableJob.A03.A04()) {
            return;
        }
        Handler handler = unsentMessagesNetworkAvailableJob.A06;
        handler.removeCallbacks(unsentMessagesNetworkAvailableJob.A08);
        JobParameters jobParameters = unsentMessagesNetworkAvailableJob.A00;
        if (jobParameters != null) {
            unsentMessagesNetworkAvailableJob.jobFinished(jobParameters, false);
            unsentMessagesNetworkAvailableJob.A00 = null;
        }
        handler.post(new RunnableEBaseShape6S0100000_I0_6(this, 16));
    }

    public /* synthetic */ void A0D() {
        UnsentMessagesNetworkAvailableJob unsentMessagesNetworkAvailableJob = this.A00;
        unsentMessagesNetworkAvailableJob.A01.A00(unsentMessagesNetworkAvailableJob.A07);
    }
}
