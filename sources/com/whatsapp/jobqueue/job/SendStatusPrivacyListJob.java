package com.whatsapp.jobqueue.job;

import X.AnonymousClass029;
import X.C000200d;
import X.C003101m;
import X.C05Y;
import X.C0C5;
import X.C0I7;
import X.C0Ml;
import X.C0SF;
import X.C41991uq;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendStatusPrivacyListJob;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import org.whispersystems.jobqueue.Job;

/* loaded from: classes2.dex */
public final class SendStatusPrivacyListJob extends Job implements C0I7 {
    public static volatile long A02 = 0;
    public static final long serialVersionUID = 1;
    public transient C05Y A00;
    public transient C41991uq A01;
    public final Collection jids;
    public final int statusDistribution;
    public final String webId;

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SendStatusPrivacyListJob(int r5, java.util.Collection r6, java.lang.String r7) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r2 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            java.lang.String r1 = "SendStatusPrivacyListJob"
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r2, r1)
            r4.<init>(r0)
            r4.statusDistribution = r5
            if (r6 != 0) goto L22
            r0 = 0
        L1d:
            r4.jids = r0
            r4.webId = r7
            return
        L22:
            java.util.ArrayList r0 = X.C003101m.A0E(r6)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendStatusPrivacyListJob.<init>(int, java.util.Collection, java.lang.String):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A00(long j) {
        super.A01 = j;
        A02 = j;
        StringBuilder A0P = C000200d.A0P("set persistent id for send status privacy job");
        A0P.append(A07());
        Log.i(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("canceled send status privacy job");
        A0P.append(A07());
        Log.w(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        ArrayList<? extends Parcelable> arrayList;
        if (A02 != super.A01) {
            StringBuilder A0P = C000200d.A0P("skip send status privacy job");
            A0P.append(A07());
            A0P.append("; lastJobId=");
            C000200d.A1I(A0P, A02);
            return;
        }
        StringBuilder A0P2 = C000200d.A0P("run send status privacy job");
        A0P2.append(A07());
        Log.i(A0P2.toString());
        final AtomicInteger atomicInteger = new AtomicInteger();
        String str = this.webId;
        if (str == null) {
            str = this.A00.A02();
        }
        C05Y c05y = this.A00;
        int i = this.statusDistribution;
        Collection collection = this.jids;
        if (collection == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            C003101m.A0M(UserJid.class, collection, arrayList);
        }
        Message obtain = Message.obtain(null, 0, 120, 0, new C0SF() { // from class: X.3De
            @Override // X.C0SF
            public void A00(int i2) {
                atomicInteger.set(i2);
                SendStatusPrivacyListJob sendStatusPrivacyListJob = SendStatusPrivacyListJob.this;
                String str2 = sendStatusPrivacyListJob.webId;
                if (str2 != null) {
                    sendStatusPrivacyListJob.A01.A0E(str2, i2);
                }
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                SendStatusPrivacyListJob sendStatusPrivacyListJob = SendStatusPrivacyListJob.this;
                String str2 = sendStatusPrivacyListJob.webId;
                if (str2 != null) {
                    sendStatusPrivacyListJob.A01.A0E(str2, 200);
                }
            }
        });
        Bundle data = obtain.getData();
        data.putString("id", str);
        data.putInt("statusDistributionMode", i);
        if (arrayList != null) {
            data.putParcelableArrayList("jids", arrayList);
        }
        ((C0Ml) c05y.A05(str, obtain, false)).get();
        int i2 = atomicInteger.get();
        if (i2 == 500) {
            StringBuilder A0P3 = C000200d.A0P("server 500 error during send status privacy job");
            A0P3.append(A07());
            throw new Exception(A0P3.toString());
        } else if (i2 != 0) {
            StringBuilder sb = new StringBuilder("server error code returned during send status privacy job; errorCode=");
            sb.append(i2);
            sb.append(A07());
            Log.w(sb.toString());
        }
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("exception while running send status privacy job");
        A0P.append(A07());
        Log.w(A0P.toString(), exc);
        return true;
    }

    public final String A07() {
        String arrays;
        Jid nullable;
        StringBuilder A0P = C000200d.A0P("; statusDistribution=");
        A0P.append(this.statusDistribution);
        A0P.append("; jids=");
        Collection<String> collection = this.jids;
        if (collection == null) {
            arrays = "null";
        } else {
            ArrayList arrayList = new ArrayList(collection.size());
            for (String str : collection) {
                if (str != null && (nullable = Jid.getNullable(str)) != null) {
                    arrayList.add(nullable);
                }
            }
            arrays = Arrays.toString(arrayList.toArray());
        }
        A0P.append(arrays);
        A0P.append("; persistentId=");
        A0P.append(super.A01);
        return A0P.toString();
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) AnonymousClass029.A0X(context.getApplicationContext());
        this.A01 = c0c5.A1r();
        this.A00 = c0c5.A1H();
    }
}
