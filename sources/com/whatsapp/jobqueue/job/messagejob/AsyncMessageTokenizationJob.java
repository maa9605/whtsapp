package com.whatsapp.jobqueue.job.messagejob;

import X.AnonymousClass092;
import X.C02180Ae;
import X.C09940f2;
import X.C0C5;
import X.C0CD;
import X.C0CF;
import X.C0D5;
import X.C0HC;
import android.content.Context;

/* loaded from: classes.dex */
public final class AsyncMessageTokenizationJob extends AsyncMessageJob {
    public transient C0D5 A00;

    @Override // com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob
    public String A08() {
        return "asyncTokenize";
    }

    public AsyncMessageTokenizationJob(long j) {
        super(j);
    }

    @Override // com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob
    public Object A07(AnonymousClass092 anonymousClass092) {
        C0HC c0hc = new C0HC("ftsMessageStore/backgroundTokenize");
        String A01 = C09940f2.A01(5L, this.A00.A0E(anonymousClass092), this.A00.A03);
        c0hc.A01();
        return A01;
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob
    public void A09(AnonymousClass092 anonymousClass092, Object obj) {
        String str = (String) obj;
        C0D5 c0d5 = this.A00;
        long A04 = c0d5.A04();
        long j = this.rowId;
        C0CD A042 = c0d5.A0B.A04();
        try {
            C0CF A01 = c0d5.A0D.A01("UPDATE message_ftsv2 SET content=? WHERE docid=?");
            A01.A05(1, str);
            A01.A04(2, j);
            A01.A00();
            A042.close();
            if (A04 == 1) {
                c0d5.A05(j, str);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A042.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    @Override // com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob, X.C0I7
    public void ASu(Context context) {
        super.ASu(context);
        this.A00 = ((C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class)).A0o();
    }
}
