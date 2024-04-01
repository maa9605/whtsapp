package com.whatsapp.jobqueue.job;

import X.AnonymousClass029;
import X.AnonymousClass092;
import X.C000200d;
import X.C000700j;
import X.C002701i;
import X.C010805j;
import X.C01J;
import X.C01R;
import X.C02180Ae;
import X.C02L;
import X.C04420Kc;
import X.C05Y;
import X.C07D;
import X.C0C5;
import X.C0CD;
import X.C0CF;
import X.C0E5;
import X.C0EC;
import X.C0EE;
import X.C0G5;
import X.C0I7;
import X.C0JU;
import X.C0Ml;
import X.C0ZJ;
import X.C40531sQ;
import X.C40541sR;
import X.C40551sS;
import X.C41301th;
import X.C41421tt;
import X.InterfaceC41551u8;
import android.content.Context;
import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement;
import com.whatsapp.jobqueue.requirement.AxolotlPeerDeviceSessionRequirement;
import com.whatsapp.util.Log;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

/* loaded from: classes2.dex */
public class SendPeerMessageJob extends Job implements C0I7 {
    public static final DeviceJid[] A09 = new DeviceJid[0];
    public static final long serialVersionUID = 1;
    public transient C02L A00;
    public transient C0E5 A01;
    public transient C41301th A02;
    public transient C01J A03;
    public transient C01R A04;
    public transient C0EC A05;
    public transient C41421tt A06;
    public transient C05Y A07;
    public transient C0EE A08;
    public final long peerMessageRowId;
    public final int retryCount;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SendPeerMessageJob(X.C0JU r6, com.whatsapp.jid.DeviceJid r7, byte[] r8, int r9) {
        /*
            r5 = this;
            byte r1 = r6.A0m
            r0 = 35
            if (r1 == r0) goto L58
            r0 = 47
            if (r1 == r0) goto L55
            r0 = 38
            if (r1 == r0) goto L52
            r0 = 39
            if (r1 != r0) goto L5b
            java.lang.String r1 = "syncd-key-request"
        L14:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r3 = 1
            java.lang.String r0 = "-"
            java.lang.StringBuilder r2 = X.C000200d.A0V(r1, r0)
            long r0 = r6.A0p
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r4.add(r0)
            com.whatsapp.jobqueue.requirement.AxolotlPeerDeviceSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlPeerDeviceSessionRequirement
            r0.<init>(r7)
            r4.add(r0)
            if (r8 == 0) goto L43
            com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            r0.<init>(r7, r8)
            r4.add(r0)
        L43:
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r4, r3, r1)
            r5.<init>(r0)
            long r0 = r6.A0p
            r5.peerMessageRowId = r0
            r5.retryCount = r9
            return
        L52:
            java.lang.String r1 = "syncd-key-share"
            goto L14
        L55:
            java.lang.String r1 = "sync-security-settings"
            goto L14
        L58:
            java.lang.String r1 = "device-history-sync-notification"
            goto L14
        L5b:
            java.lang.String r0 = "Cannot send message of type "
            java.lang.StringBuilder r0 = X.C000200d.A0P(r0)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendPeerMessageJob.<init>(X.0JU, com.whatsapp.jid.DeviceJid, byte[], int):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
        Set emptySet;
        StringBuilder A0P = C000200d.A0P("SendPeerMessageJob/onAdded/job added=");
        A0P.append(A07());
        Log.i(A0P.toString());
        for (Requirement requirement : this.parameters.requirements) {
            if (requirement instanceof AxolotlPeerDeviceSessionRequirement) {
                AxolotlPeerDeviceSessionRequirement axolotlPeerDeviceSessionRequirement = (AxolotlPeerDeviceSessionRequirement) requirement;
                DeviceJid nullable = DeviceJid.getNullable(axolotlPeerDeviceSessionRequirement.targetJidRawString);
                if (nullable != null) {
                    if (axolotlPeerDeviceSessionRequirement.A01.A02().A00.contains(nullable) && !axolotlPeerDeviceSessionRequirement.A00.A0U(C002701i.A0T(nullable))) {
                        emptySet = Collections.singleton(nullable);
                    } else {
                        emptySet = Collections.emptySet();
                    }
                    if (!emptySet.isEmpty()) {
                        this.A01.A03((DeviceJid[]) emptySet.toArray(A09), false, 5);
                    }
                } else {
                    throw null;
                }
            } else if (requirement instanceof AxolotlDifferentAliceBaseKeyRequirement) {
                AxolotlDifferentAliceBaseKeyRequirement axolotlDifferentAliceBaseKeyRequirement = (AxolotlDifferentAliceBaseKeyRequirement) requirement;
                if (!axolotlDifferentAliceBaseKeyRequirement.AFd()) {
                    Set singleton = Collections.singleton(axolotlDifferentAliceBaseKeyRequirement.A01);
                    if (!singleton.isEmpty()) {
                        this.A01.A03((DeviceJid[]) singleton.toArray(A09), false, 5);
                    }
                }
            }
        }
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("SendPeerMessageJob/onCanceled/cancel send job");
        A0P.append(A07());
        Log.w(A0P.toString());
    }

    /* JADX WARN: Finally extract failed */
    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        C010805j c010805j;
        C0CF A0B;
        StringBuilder A0P = C000200d.A0P("SendPeerMessageJob/onRun/start send");
        A0P.append(A07());
        Log.i(A0P.toString());
        if (!this.A08.A02()) {
            Log.w("SendPeerMessageJob/onRun/wap4 disable.");
            return;
        }
        C02L c02l = this.A00;
        c02l.A05();
        if (c02l.A03 == null) {
            Log.e("SendPeerMessageJob/onRun/no my user id (unregistered?).");
            return;
        }
        C0JU A03 = this.A06.A03(this.peerMessageRowId);
        if (A03 == null) {
            StringBuilder A0P2 = C000200d.A0P("SendPeerMessageJob/onRun/no message found (");
            A0P2.append(this.peerMessageRowId);
            A0P2.append(").");
            Log.e(A0P2.toString());
            return;
        }
        final DeviceJid deviceJid = A03.A00;
        C07D A02 = this.A05.A02();
        if (deviceJid != null && !A02.A00.isEmpty()) {
            if (!A02.A00.contains(deviceJid)) {
                Log.e("SendPeerMessageJob/onRun/target device is not in db.");
                return;
            }
            HashMap hashMap = new HashMap();
            String str = A03.A0n.A01;
            C40541sR A092 = C40531sQ.A09();
            AnonymousClass029.A1G(A03, new C40551sS(this.A00, A092, false, false, null, null));
            final byte[] A0B2 = ((C40531sQ) A092.A01()).A0B();
            try {
                c010805j = (C010805j) this.A04.A00.submit(new Callable() { // from class: X.2xj
                    {
                        SendPeerMessageJob.this = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        SendPeerMessageJob sendPeerMessageJob = SendPeerMessageJob.this;
                        DeviceJid deviceJid2 = deviceJid;
                        byte[] bArr = A0B2;
                        C27391Ne A07 = sendPeerMessageJob.A03.A07(C002701i.A0T(deviceJid2), bArr);
                        return new C010805j(2, C42041uv.A00(A07.A00), A07.A02);
                    }
                }).get();
            } catch (Exception unused) {
                StringBuilder A0P3 = C000200d.A0P("SendPeerMessageJob/getEncryptedMessage/fail to get the preKey, jid=");
                A0P3.append(deviceJid.getRawString());
                Log.e(A0P3.toString());
                c010805j = null;
            }
            ((C0Ml) this.A07.A04(new C04420Kc(deviceJid, "message", str, null, null, null, null, null, 0L, hashMap.isEmpty() ? null : new ArrayList(hashMap.values())), Message.obtain(null, 0, 8, 0, new C0ZJ(A03.A0n, deviceJid, 0L, this.retryCount, null, null, A03.A0a, null, A03.A0J, c010805j, Collections.emptyMap(), null, null, A03.A07(), ((AnonymousClass092) A03).A00, null, null, Collections.emptyMap(), Integer.valueOf(A03.A02), "peer", A03.A18(), false)))).get();
            A03.A01 = true;
            C41421tt c41421tt = this.A06;
            long j = A03.A0p;
            if (c41421tt != null) {
                C000700j.A00();
                C0CD A022 = c41421tt.A00.A02();
                try {
                    A022.A02.A0B("UPDATE peer_messages SET acked = 1 WHERE _id = ?").A00.bindLong(1, j);
                    if (A0B.A00() == 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("peer-messages-store/markAckReceived/cannot set ack received for message: ");
                        sb.append(j);
                        Log.e(sb.toString());
                    }
                    A022.close();
                    C41301th c41301th = this.A02;
                    synchronized (c41301th.A00) {
                        Iterator it = c41301th.A00.iterator();
                        while (true) {
                            C0G5 c0g5 = (C0G5) it;
                            if (c0g5.hasNext()) {
                                ((InterfaceC41551u8) c0g5.next()).AKA(A03);
                            }
                        }
                    }
                    StringBuilder A0P4 = C000200d.A0P("SendPeerMessageJob/onRun/end send");
                    A0P4.append(A07());
                    Log.i(A0P4.toString());
                } finally {
                }
            } else {
                throw null;
            }
        } else {
            Log.e("SendPeerMessageJob/onRun/no target device or no companion device exists.");
        }
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("SendPeerMessageJob/onShouldReply/exception while running");
        A0P.append(A07());
        Log.w(A0P.toString(), exc);
        return true;
    }

    public final String A07() {
        StringBuilder A0P = C000200d.A0P("; peer_msg_row_id=");
        A0P.append(this.peerMessageRowId);
        return A0P.toString();
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class);
        this.A00 = c0c5.A0M();
        this.A07 = c0c5.A1H();
        this.A04 = c0c5.A0k();
        this.A06 = c0c5.A12();
        this.A03 = c0c5.A0j();
        this.A05 = c0c5.A10();
        this.A08 = c0c5.A1J();
        this.A01 = c0c5.A0P();
        this.A02 = c0c5.A0V();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }
}
