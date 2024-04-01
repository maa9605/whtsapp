package com.whatsapp.jobqueue.job;

import X.C000200d;
import X.C02180Ae;
import X.C05Y;
import X.C0C5;
import X.C0EB;
import X.C0I7;
import X.C0Ml;
import X.C0Yv;
import X.C3DY;
import android.content.Context;
import android.os.Message;
import com.whatsapp.jobqueue.requirement.ChatConnectionRequirement;
import com.whatsapp.util.Log;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

/* loaded from: classes2.dex */
public final class GetStatusPrivacyJob extends Job implements C0I7 {
    public static final long serialVersionUID = 1;
    public transient C0EB A00;
    public transient C05Y A01;

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
    }

    public GetStatusPrivacyJob(JobParameters jobParameters) {
        super(jobParameters);
    }

    public static GetStatusPrivacyJob A00() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new ChatConnectionRequirement());
        return new GetStatusPrivacyJob(new JobParameters(linkedList, true, "GetStatusPrivacyJob"));
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("canceled get status privacy job");
        A0P.append(A07());
        Log.w(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        AtomicInteger atomicInteger = new AtomicInteger();
        String A02 = this.A01.A02();
        ((C0Ml) this.A01.A05(A02, Message.obtain(null, 0, 121, 0, new C0Yv(A02, new C3DY(this, atomicInteger))), false)).get(32000L, TimeUnit.MILLISECONDS);
        if (atomicInteger.get() != 500) {
            return;
        }
        StringBuilder A0P = C000200d.A0P("server 500 error during get status privacy job");
        A0P.append(A07());
        throw new Exception(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("exception while running get status privacy job");
        A0P.append(A07());
        Log.w(A0P.toString(), exc);
        return true;
    }

    public final String A07() {
        StringBuilder A0P = C000200d.A0P("; persistentId=");
        A0P.append(super.A01);
        return A0P.toString();
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class);
        this.A00 = c0c5.A0x();
        this.A01 = c0c5.A1H();
    }
}
