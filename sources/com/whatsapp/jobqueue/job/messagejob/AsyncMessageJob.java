package com.whatsapp.jobqueue.job.messagejob;

import X.AnonymousClass092;
import X.C000200d;
import X.C02180Ae;
import X.C03790Hb;
import X.C05E;
import X.C05Q;
import X.C0C5;
import X.C0CD;
import X.C0I7;
import android.content.Context;
import com.whatsapp.util.Log;
import java.util.LinkedList;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

/* loaded from: classes.dex */
public abstract class AsyncMessageJob extends Job implements C0I7 {
    public transient C05Q A00;
    public transient C05E A01;
    public final long rowId;

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
    }

    public abstract Object A07(AnonymousClass092 anonymousClass092);

    public abstract String A08();

    public abstract void A09(AnonymousClass092 anonymousClass092, Object obj);

    public AsyncMessageJob(long j) {
        super(new JobParameters(new LinkedList(), true, "async-message"));
        this.rowId = j;
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("asyncMessageJob/canceled async message job");
        StringBuilder A0P2 = C000200d.A0P("; rowId=");
        A0P2.append(this.rowId);
        A0P2.append("; job=");
        A0P2.append(A08());
        A0P.append(A0P2.toString());
        Log.w(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public final void A04() {
        C0CD A03 = this.A01.A03();
        try {
            C03790Hb A00 = A03.A00();
            AnonymousClass092 A01 = this.A00.A01(this.rowId);
            A00.A00();
            A00.close();
            A03.close();
            if (A01 != null) {
                Object A07 = A07(A01);
                try {
                    C03790Hb A002 = this.A01.A03().A00();
                    AnonymousClass092 A012 = this.A00.A01(this.rowId);
                    if (A012 != null && !A012.A0r) {
                        A09(A012, A07);
                    }
                    A002.A00();
                    A002.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } finally {
                try {
                    A03.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("asyncMessageJob/exception while running async message job");
        StringBuilder A0P2 = C000200d.A0P("; rowId=");
        A0P2.append(this.rowId);
        A0P2.append("; job=");
        A0P2.append(A08());
        A0P.append(A0P2.toString());
        Log.w(A0P.toString(), exc);
        return true;
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class);
        this.A00 = c0c5.A0l();
        this.A01 = c0c5.A0t();
    }
}
