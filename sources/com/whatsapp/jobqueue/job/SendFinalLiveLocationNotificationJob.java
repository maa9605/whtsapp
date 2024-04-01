package com.whatsapp.jobqueue.job;

import X.AbstractC005302j;
import X.AnonymousClass029;
import X.AnonymousClass094;
import X.C000200d;
import X.C003101m;
import X.C010805j;
import X.C01J;
import X.C01R;
import X.C02L;
import X.C04420Kc;
import X.C05Y;
import X.C0C5;
import X.C0I7;
import X.C0K0;
import X.C0KC;
import X.C0Ml;
import X.C40531sQ;
import X.C41461tx;
import X.C41471ty;
import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob;
import com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

/* loaded from: classes2.dex */
public final class SendFinalLiveLocationNotificationJob extends Job implements C0I7 {
    public static final long serialVersionUID = 1;
    public transient C02L A00;
    public transient C01J A01;
    public transient C01R A02;
    public transient C41461tx A03;
    public transient C41471ty A04;
    public transient C05Y A05;
    public final double latitude;
    public final double longitude;
    public final String msgId;
    public final String rawJid;
    public final int timeOffset;
    public final long timestamp;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SendFinalLiveLocationNotificationJob(X.AnonymousClass094 r6, X.C0K0 r7, int r8) {
        /*
            r5 = this;
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.lang.String r0 = "final-live-location-"
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            X.02j r3 = r6.A00
            java.lang.String r0 = X.C003101m.A07(r3)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r4.add(r0)
            com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement
            r0.<init>()
            r4.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r4, r1, r2)
            r5.<init>(r0)
            boolean r0 = r6.A02
            X.C000700j.A07(r0)
            if (r3 == 0) goto L51
            java.lang.String r0 = r3.getRawString()
            r5.rawJid = r0
            java.lang.String r0 = r6.A01
            r5.msgId = r0
            double r0 = r7.A00
            r5.latitude = r0
            double r0 = r7.A01
            r5.longitude = r0
            long r0 = r7.A05
            r5.timestamp = r0
            r5.timeOffset = r8
            return
        L51:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob.<init>(X.094, X.0K0, int):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
        List<Requirement> list = this.parameters.requirements;
        StringBuilder A0P = C000200d.A0P("final live location notification send job added");
        A0P.append(A07());
        Log.i(A0P.toString());
        for (Requirement requirement : list) {
            if ((requirement instanceof AxolotlFastRatchetSenderKeyRequirement) && !((AxolotlFastRatchetSenderKeyRequirement) requirement).AFd()) {
                this.A03.A0g();
            }
        }
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("canceled send final live location job");
        A0P.append(A07());
        Log.w(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        C02L c02l = this.A00;
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid != null) {
            C0K0 c0k0 = new C0K0(userJid);
            c0k0.A00 = this.latitude;
            c0k0.A01 = this.longitude;
            c0k0.A05 = this.timestamp;
            StringBuilder A0P = C000200d.A0P("run send final live location job");
            A0P.append(A07());
            Log.i(A0P.toString());
            C41461tx c41461tx = this.A03;
            AbstractC005302j A02 = AbstractC005302j.A02(this.rawJid);
            if (A02 != null) {
                C0KC A08 = c41461tx.A08(new AnonymousClass094(A02, true, this.msgId));
                if (A08 != null) {
                    synchronized (c41461tx.A0T) {
                        C0K0 c0k02 = A08.A02;
                        if (!c0k0.equals(c0k02)) {
                            if (c0k02 == null || c0k0.A05 >= c0k02.A05) {
                                c41461tx.A0b(A08, c0k0);
                            }
                        }
                        final C40531sQ A05 = this.A04.A05(c0k0, Integer.valueOf(this.timeOffset));
                        try {
                            C010805j c010805j = (C010805j) this.A02.A00.submit(new Callable() { // from class: X.2xf
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    SendFinalLiveLocationNotificationJob sendFinalLiveLocationNotificationJob = SendFinalLiveLocationNotificationJob.this;
                                    C40531sQ c40531sQ = A05;
                                    C02L c02l2 = sendFinalLiveLocationNotificationJob.A00;
                                    c02l2.A05();
                                    DeviceJid deviceJid = c02l2.A02;
                                    if (deviceJid != null) {
                                        return new C010805j(2, 3, sendFinalLiveLocationNotificationJob.A01.A08(new C0QS(C0Zq.A00.getRawString(), C002701i.A0T(deviceJid)), c40531sQ.A0B()).A02);
                                    }
                                    throw null;
                                }
                            }).get();
                            AbstractC005302j A022 = AbstractC005302j.A02(this.rawJid);
                            String A03 = this.A05.A03();
                            HashMap hashMap = new HashMap();
                            ((C0Ml) this.A05.A04(new C04420Kc(A022, "notification", A03, "location", null, null, null, null, 0L, hashMap.isEmpty() ? null : new ArrayList(hashMap.values())), C003101m.A01(A03, A022, null, this.msgId, c010805j, 0))).get();
                        } catch (InterruptedException | ExecutionException e) {
                            Log.e("LocationSharingManager/encryptAndSendLocation error", e);
                        }
                        StringBuilder A0P2 = C000200d.A0P("sent final live location notifications");
                        A0P2.append(A07());
                        Log.i(A0P2.toString());
                        return;
                    }
                }
                StringBuilder A0P3 = C000200d.A0P("skip sending final live location job, final live location notification already sent");
                A0P3.append(A07());
                Log.i(A0P3.toString());
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("exception while running send final live location job");
        A0P.append(A07());
        Log.w(A0P.toString(), exc);
        return true;
    }

    public final String A07() {
        StringBuilder A0P = C000200d.A0P("; persistentId=");
        A0P.append(super.A01);
        A0P.append("; jid=");
        A0P.append(this.rawJid);
        A0P.append("; msgId=");
        A0P.append(this.msgId);
        A0P.append("; location.timestamp=");
        A0P.append(this.timestamp);
        return A0P.toString();
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) AnonymousClass029.A0X(context.getApplicationContext());
        this.A00 = c0c5.A0M();
        this.A04 = c0c5.A1D();
        this.A05 = c0c5.A1H();
        this.A02 = c0c5.A0k();
        this.A01 = c0c5.A0j();
        this.A03 = c0c5.A1C();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (!TextUtils.isEmpty(this.rawJid)) {
            if (!TextUtils.isEmpty(this.msgId)) {
                if (this.timestamp != 0) {
                    return;
                }
                StringBuilder A0P = C000200d.A0P("location timestamp must not be 0");
                A0P.append(A07());
                throw new InvalidObjectException(A0P.toString());
            }
            StringBuilder A0P2 = C000200d.A0P("msgId must not be empty");
            A0P2.append(A07());
            throw new InvalidObjectException(A0P2.toString());
        }
        StringBuilder A0P3 = C000200d.A0P("jid must not be empty");
        A0P3.append(A07());
        throw new InvalidObjectException(A0P3.toString());
    }
}
