package com.whatsapp.jobqueue.job;

import X.C000200d;
import X.C02180Ae;
import X.C05Y;
import X.C0C5;
import X.C0E6;
import X.C0I7;
import X.C0S4;
import X.C41981up;
import X.C42851wQ;
import android.content.Context;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.LinkedList;
import java.util.concurrent.Future;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

/* loaded from: classes2.dex */
public final class SendWebForwardJob extends Job implements C0I7 {
    public static final long serialVersionUID = 1;
    public transient C0E6 A00;
    public transient C05Y A01;
    public transient C41981up A02;
    public final transient Message A03;
    public final transient String A04;
    public final transient String A05;

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SendWebForwardJob(java.lang.String r5, java.lang.String r6, android.os.Message r7) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            java.lang.String r2 = "webSend"
            r1 = 0
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r1, r2)
            r4.<init>(r0)
            r0 = 0
            if (r5 == 0) goto L25
            r4.A04 = r5
            if (r7 == 0) goto L24
            r4.A03 = r7
            r4.A05 = r6
            return
        L24:
            throw r0
        L25:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendWebForwardJob.<init>(java.lang.String, java.lang.String, android.os.Message):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
        if (r1 != 28) goto L15;
     */
    @Override // org.whispersystems.jobqueue.Job
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04() {
        /*
            r6 = this;
            java.lang.String r0 = "job/sendWebForward/onRun id="
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            java.lang.String r5 = r6.A04
            r1.append(r5)
            java.lang.String r0 = "; ref="
            r1.append(r0)
            java.lang.String r4 = r6.A05
            X.C000200d.A1N(r1, r4)
            android.os.Message r3 = r6.A03
            int r1 = r3.arg1
            r0 = 233(0xe9, float:3.27E-43)
            if (r1 != r0) goto L1f
            int r1 = r3.arg2
        L1f:
            r0 = 55
            if (r1 != r0) goto L41
            java.lang.Object r0 = r3.obj
            X.0Pj r0 = (X.C05600Pj) r0
            if (r0 == 0) goto L8a
            java.util.List r0 = r0.A02
            if (r0 == 0) goto L8a
            java.util.Iterator r1 = r0.iterator()
        L31:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r1.next()
            X.20v r0 = (X.C20v) r0
            r0.A00()
            goto L31
        L41:
            r0 = 46
            if (r1 != r0) goto L63
            java.lang.Object r0 = r3.obj
            X.0ZE r0 = (X.C0ZE) r0
            if (r0 == 0) goto L8a
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L8a
            java.util.Iterator r1 = r0.iterator()
        L53:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r1.next()
            X.20v r0 = (X.C20v) r0
            r0.A00()
            goto L53
        L63:
            r0 = 45
            if (r1 != r0) goto L8a
            java.lang.Object r2 = r3.obj
            X.0KB r2 = (X.C0KB) r2
            if (r2 == 0) goto L8a
            int r1 = r2.A00
            r0 = 4
            if (r1 == r0) goto Lca
            r0 = 19
            if (r1 == r0) goto Lca
            r0 = 20
            if (r1 == r0) goto Lca
            r0 = 23
            if (r1 == r0) goto Lca
            r0 = 24
            if (r1 == r0) goto Lca
            r0 = 27
            if (r1 == r0) goto L9e
            r0 = 28
            if (r1 == r0) goto Lca
        L8a:
            X.05Y r1 = r6.A01
            r0 = 1
            java.util.concurrent.Future r2 = r1.A05(r5, r3, r0)
            X.0E6 r0 = r6.A00
            com.whatsapp.jobqueue.job.SendWebForwardJob$AckWebForwardJob r1 = new com.whatsapp.jobqueue.job.SendWebForwardJob$AckWebForwardJob
            r1.<init>(r5, r4, r3, r2)
            X.0I8 r0 = r0.A00
            r0.A01(r1)
            return
        L9e:
            java.util.List r0 = r2.A01
            if (r0 == 0) goto L8a
            java.util.Iterator r2 = r0.iterator()
        La6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r2.next()
            X.20v r0 = (X.C20v) r0
            java.util.List r0 = r0.A0K
            if (r0 == 0) goto La6
            java.util.Iterator r1 = r0.iterator()
        Lba:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La6
            java.lang.Object r0 = r1.next()
            X.20v r0 = (X.C20v) r0
            r0.A00()
            goto Lba
        Lca:
            java.util.List r0 = r2.A01
            if (r0 == 0) goto L8a
            java.util.Iterator r1 = r0.iterator()
        Ld2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r1.next()
            X.20v r0 = (X.C20v) r0
            r0.A00()
            goto Ld2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendWebForwardJob.A04():void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("job/sendWebForward exception; id=");
        A0P.append(this.A04);
        A0P.append("; ref=");
        String str = this.A05;
        A0P.append(str);
        Log.w(A0P.toString(), exc);
        if (exc instanceof C0S4) {
            return false;
        }
        if (str != null) {
            C42851wQ A01 = this.A02.A01();
            if (A01 != null) {
                if (str == null || !str.equals(A01.A03)) {
                    return false;
                }
            } else {
                throw null;
            }
        }
        return true;
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class);
        this.A02 = c0c5.A1q();
        this.A00 = c0c5.A0S();
        this.A01 = c0c5.A1H();
    }

    /* loaded from: classes2.dex */
    public final class AckWebForwardJob extends Job implements C0I7 {
        public static final long serialVersionUID = 1;
        public transient C0E6 A00;
        public transient C41981up A01;
        public final transient Message A02;
        public final transient String A03;
        public final transient String A04;
        public final transient Future A05;

        @Override // org.whispersystems.jobqueue.Job
        public void A02() {
        }

        @Override // org.whispersystems.jobqueue.Job
        public boolean A06(Exception exc) {
            return false;
        }

        public AckWebForwardJob(String str, String str2, Message message, Future future) {
            super(new JobParameters(new LinkedList(), false, "webAck"));
            this.A03 = str;
            this.A02 = message;
            this.A04 = str2;
            this.A05 = future;
        }

        @Override // org.whispersystems.jobqueue.Job
        public void A03() {
            String str = this.A04;
            if (str != null) {
                C42851wQ A01 = this.A01.A01();
                if (A01 != null) {
                    if (!str.equals(A01.A03)) {
                        this.A01.A01();
                        return;
                    }
                } else {
                    throw null;
                }
            }
            String str2 = this.A03;
            C0E6 c0e6 = this.A00;
            c0e6.A00.A01(new SendWebForwardJob(str2, str, this.A02));
        }

        @Override // org.whispersystems.jobqueue.Job
        public void A04() {
            this.A05.get();
        }

        @Override // X.C0I7
        public void ASu(Context context) {
            C0C5 c0c5 = (C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class);
            this.A01 = c0c5.A1q();
            this.A00 = c0c5.A0S();
        }
    }
}
