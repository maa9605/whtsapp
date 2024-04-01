package com.whatsapp.jobqueue.job;

import X.AbstractC005302j;
import X.AnonymousClass029;
import X.C000200d;
import X.C003101m;
import X.C010805j;
import X.C01J;
import X.C01R;
import X.C02L;
import X.C04420Kc;
import X.C05Y;
import X.C0C5;
import X.C0E5;
import X.C0I7;
import X.C0K0;
import X.C0Ml;
import X.C40531sQ;
import X.C41471ty;
import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import org.whispersystems.jobqueue.Job;

/* loaded from: classes2.dex */
public final class SendFinalLiveLocationRetryJob extends Job implements C0I7 {
    public static final long serialVersionUID = 1;
    public transient C02L A00;
    public transient C0E5 A01;
    public transient C01J A02;
    public transient C01R A03;
    public transient C41471ty A04;
    public transient C05Y A05;
    public final String contextRawJid;
    public final double latitude;
    public final double longitude;
    public final String msgId;
    public final String rawDeviceJid;
    public final int retryCount;
    public final int timeOffset;
    public final long timestamp;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SendFinalLiveLocationRetryJob(X.AnonymousClass094 r5, com.whatsapp.jid.DeviceJid r6, X.C0K0 r7, int r8, byte[] r9, int r10) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            if (r9 == 0) goto L12
            int r0 = r9.length
            if (r0 != 0) goto L12
            java.lang.String r1 = "cannot use empty old alice base key"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L12:
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r6)
            r3.add(r0)
            if (r9 == 0) goto L24
            com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            r0.<init>(r6, r9)
            r3.add(r0)
        L24:
            java.lang.String r1 = "final-live-location-"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r2 = r0.toString()
            r1 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r1, r2)
            r4.<init>(r0)
            r0 = 0
            if (r10 <= 0) goto L47
            r0 = 1
        L47:
            X.C000700j.A07(r0)
            java.lang.String r0 = r6.getRawString()
            r4.rawDeviceJid = r0
            X.02j r1 = r5.A00
            boolean r0 = X.C003101m.A0U(r1)
            if (r0 == 0) goto L73
            java.lang.String r0 = X.C003101m.A07(r1)
        L5c:
            r4.contextRawJid = r0
            java.lang.String r0 = r5.A01
            r4.msgId = r0
            double r0 = r7.A00
            r4.latitude = r0
            double r0 = r7.A01
            r4.longitude = r0
            long r0 = r7.A05
            r4.timestamp = r0
            r4.timeOffset = r8
            r4.retryCount = r10
            return
        L73:
            r0 = 0
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob.<init>(X.094, com.whatsapp.jid.DeviceJid, X.0K0, int, byte[], int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x003e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0024 A[SYNTHETIC] */
    @Override // org.whispersystems.jobqueue.Job
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02() {
        /*
            r7 = this;
            org.whispersystems.jobqueue.JobParameters r0 = r7.parameters
            java.util.List r2 = r0.requirements
            java.lang.String r0 = r7.rawDeviceJid
            com.whatsapp.jid.DeviceJid r6 = com.whatsapp.jid.DeviceJid.getNullable(r0)
            java.lang.String r0 = "final live location notification send retry job added"
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            java.lang.String r0 = r7.A07()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            java.util.Iterator r5 = r2.iterator()
            r4 = 0
            r3 = 0
        L24:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r2 = r5.next()
            org.whispersystems.jobqueue.requirements.Requirement r2 = (org.whispersystems.jobqueue.requirements.Requirement) r2
            boolean r0 = r2 instanceof com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r1 = 1
            if (r0 == 0) goto L49
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r2 = (com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement) r2
            boolean r0 = r2.AFd()
            if (r0 != 0) goto L56
        L3d:
            r3 = 1
        L3e:
            X.0E5 r2 = r7.A01
            com.whatsapp.jid.DeviceJid[] r1 = new com.whatsapp.jid.DeviceJid[r1]
            r1[r4] = r6
            r0 = 3
            r2.A03(r1, r4, r0)
            goto L24
        L49:
            boolean r0 = r2 instanceof com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            if (r0 == 0) goto L56
            com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r2 = (com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement) r2
            boolean r0 = r2.AFd()
            if (r0 != 0) goto L56
            goto L3d
        L56:
            if (r3 == 0) goto L24
            goto L3e
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob.A02():void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("canceled send final live location retry job");
        A0P.append(A07());
        Log.w(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        C010805j c010805j;
        DeviceJid nullable;
        C02L c02l = this.A00;
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid != null) {
            C0K0 c0k0 = new C0K0(userJid);
            c0k0.A00 = this.latitude;
            c0k0.A01 = this.longitude;
            c0k0.A05 = this.timestamp;
            StringBuilder A0P = C000200d.A0P("run send final live location retry job");
            A0P.append(A07());
            Log.i(A0P.toString());
            final C40531sQ A05 = this.A04.A05(c0k0, Integer.valueOf(this.timeOffset));
            try {
                c010805j = (C010805j) this.A03.A00.submit(new Callable() { // from class: X.2xg
                    {
                        SendFinalLiveLocationRetryJob.this = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        SendFinalLiveLocationRetryJob sendFinalLiveLocationRetryJob = SendFinalLiveLocationRetryJob.this;
                        C40531sQ c40531sQ = A05;
                        C27391Ne A07 = sendFinalLiveLocationRetryJob.A02.A07(C002701i.A0T(DeviceJid.getNullable(sendFinalLiveLocationRetryJob.rawDeviceJid)), c40531sQ.A0B());
                        return new C010805j(2, C42041uv.A00(A07.A00), A07.A02);
                    }
                }).get();
                nullable = DeviceJid.getNullable(this.rawDeviceJid);
            } catch (InterruptedException | ExecutionException e) {
                Log.e("LocationSharingManager/encryptAndSendLocation error", e);
            }
            if (nullable != null) {
                UserJid userJid2 = nullable.userJid;
                String A03 = this.A05.A03();
                HashMap hashMap = new HashMap();
                C04420Kc c04420Kc = new C04420Kc(userJid2, "notification", A03, "location", null, null, null, null, 0L, hashMap.isEmpty() ? null : new ArrayList(hashMap.values()));
                C05Y c05y = this.A05;
                String str = this.contextRawJid;
                ((C0Ml) c05y.A04(c04420Kc, C003101m.A01(A03, userJid2, str != null ? AbstractC005302j.A02(str) : null, this.msgId, c010805j, this.retryCount))).get();
                StringBuilder A0P2 = C000200d.A0P("sent final live location notifications");
                A0P2.append(A07());
                Log.i(A0P2.toString());
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("exception while running send final live location retry job");
        A0P.append(A07());
        Log.w(A0P.toString(), exc);
        return true;
    }

    public final String A07() {
        StringBuilder A0P = C000200d.A0P("; persistentId=");
        A0P.append(super.A01);
        A0P.append("; jid=");
        A0P.append(this.rawDeviceJid);
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
        this.A03 = c0c5.A0k();
        this.A02 = c0c5.A0j();
        this.A01 = c0c5.A0P();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (!TextUtils.isEmpty(this.rawDeviceJid)) {
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
