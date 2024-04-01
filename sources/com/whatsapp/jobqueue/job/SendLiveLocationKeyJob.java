package com.whatsapp.jobqueue.job;

import X.AnonymousClass029;
import X.C000200d;
import X.C003101m;
import X.C010805j;
import X.C01J;
import X.C01R;
import X.C02L;
import X.C04420Kc;
import X.C05Y;
import X.C07580Yu;
import X.C0C5;
import X.C0E5;
import X.C0I7;
import X.C0KE;
import X.C0Ml;
import X.C0Zq;
import X.C40531sQ;
import X.C41461tx;
import android.content.Context;
import android.os.Message;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendLiveLocationKeyJob;
import com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement;
import com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

/* loaded from: classes2.dex */
public final class SendLiveLocationKeyJob extends Job implements C0I7 {
    public static final long serialVersionUID = 1;
    public transient C02L A00;
    public transient C0E5 A01;
    public transient C01J A02;
    public transient C01R A03;
    public transient C41461tx A04;
    public transient C05Y A05;
    public final ArrayList rawJids;
    public final Integer retryCount;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SendLiveLocationKeyJob(com.whatsapp.jid.DeviceJid r5, byte[] r6, int r7) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            if (r6 == 0) goto L12
            int r0 = r6.length
            if (r0 != 0) goto L12
            java.lang.String r1 = "cannot use empty old alice base key"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L12:
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r5)
            r3.add(r0)
            if (r6 == 0) goto L24
            com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            r0.<init>(r5, r6)
            r3.add(r0)
        L24:
            r2 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            java.lang.String r1 = "SendLiveLocationKeyJob"
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r2, r1)
            r4.<init>(r0)
            if (r7 < 0) goto L50
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.rawJids = r1
            com.whatsapp.jid.UserJid r0 = r5.userJid
            java.lang.String r0 = r0.getRawString()
            r1.add(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r4.retryCount = r0
            return
        L50:
            java.lang.String r0 = "retryCount cannot be negative"
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            java.lang.String r0 = r4.A07()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendLiveLocationKeyJob.<init>(com.whatsapp.jid.DeviceJid, byte[], int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SendLiveLocationKeyJob(java.util.List r5) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.Iterator r2 = r5.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r2.next()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            if (r0 == 0) goto L9
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r0)
            if (r1 == 0) goto L26
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r1)
            r3.add(r0)
            goto L9
        L26:
            r0 = 0
            throw r0
        L28:
            r2 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            java.lang.String r1 = "SendLiveLocationKeyJob"
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r2, r1)
            r4.<init>(r0)
            X.C000700j.A05(r5)
            java.util.ArrayList r0 = X.C003101m.A0E(r5)
            r4.rawJids = r0
            r0 = 0
            r4.retryCount = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendLiveLocationKeyJob.<init>(java.util.List):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
        StringBuilder A0P = C000200d.A0P("live location key notification send job added");
        A0P.append(A07());
        Log.i(A0P.toString());
        HashSet hashSet = new HashSet();
        for (Requirement requirement : this.parameters.requirements) {
            if (requirement instanceof AxolotlSessionRequirement) {
                AxolotlSessionRequirement axolotlSessionRequirement = (AxolotlSessionRequirement) requirement;
                if (!axolotlSessionRequirement.AFd()) {
                    hashSet.add(axolotlSessionRequirement.A01);
                }
            } else if (requirement instanceof AxolotlDifferentAliceBaseKeyRequirement) {
                AxolotlDifferentAliceBaseKeyRequirement axolotlDifferentAliceBaseKeyRequirement = (AxolotlDifferentAliceBaseKeyRequirement) requirement;
                if (!axolotlDifferentAliceBaseKeyRequirement.AFd()) {
                    hashSet.add(axolotlDifferentAliceBaseKeyRequirement.A01);
                }
            }
        }
        this.A01.A03((DeviceJid[]) hashSet.toArray(new DeviceJid[0]), false, 4);
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("canceled send live location key job");
        A0P.append(A07());
        Log.w(A0P.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.util.List] */
    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        ?? arrayList;
        Integer num;
        if (this.retryCount != null) {
            C41461tx c41461tx = this.A04;
            UserJid nullable = UserJid.getNullable((String) this.rawJids.get(0));
            int intValue = this.retryCount.intValue();
            synchronized (c41461tx.A0T) {
                if (!c41461tx.A0j(nullable, intValue)) {
                    arrayList = Collections.emptyList();
                } else {
                    List<UserJid> singletonList = Collections.singletonList(nullable);
                    StringBuilder A0P = C000200d.A0P("LocationSharingManager/markParticipantsAsNeedSenderKey; jids.size");
                    A0P.append(singletonList.size());
                    Log.i(A0P.toString());
                    ArrayList arrayList2 = new ArrayList();
                    synchronized (c41461tx.A0T) {
                        c41461tx.A0D();
                        for (UserJid userJid : singletonList) {
                            if (!c41461tx.A0A.A0A(userJid)) {
                                HashSet hashSet = c41461tx.A0W;
                                if (hashSet.contains(userJid)) {
                                    hashSet.remove(userJid);
                                    arrayList2.add(userJid);
                                }
                            }
                        }
                        c41461tx.A0O.A06(arrayList2, false);
                    }
                    c41461tx.A0D.A00.A01(new C0KE());
                    StringBuilder sb = new StringBuilder();
                    sb.append("LocationSharingManager/markSendingLocationKeyRetry/marking; remote_resource=");
                    sb.append(nullable);
                    sb.append("; retryCount=");
                    sb.append(intValue);
                    Log.i(sb.toString());
                    c41461tx.A0a.put(nullable, Pair.create(Long.valueOf(c41461tx.A0G.A05()), Integer.valueOf(intValue)));
                    c41461tx.A0c.put(nullable, 1);
                    arrayList = Collections.singletonList(nullable);
                }
            }
        } else {
            C41461tx c41461tx2 = this.A04;
            List A0F = C003101m.A0F(UserJid.class, this.rawJids);
            synchronized (c41461tx2.A0T) {
                arrayList = new ArrayList();
                List A0A = c41461tx2.A0A();
                Iterator it = ((ArrayList) A0F).iterator();
                while (it.hasNext()) {
                    UserJid userJid2 = (UserJid) it.next();
                    Integer num2 = (Integer) c41461tx2.A0c.get(userJid2);
                    if (((ArrayList) A0A).contains(userJid2) && (num2 == null || num2.intValue() != 1)) {
                        arrayList.add(userJid2);
                        c41461tx2.A0c.put(userJid2, 1);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            StringBuilder A0P2 = C000200d.A0P("skip send live location key job; no one to send");
            A0P2.append(A07());
            Log.i(A0P2.toString());
            return;
        }
        StringBuilder A0P3 = C000200d.A0P("run send live location key job");
        A0P3.append(A07());
        Log.i(A0P3.toString());
        try {
            final C0Zq c0Zq = C0Zq.A00;
            final C40531sQ c40531sQ = (C40531sQ) this.A03.A00.submit(new Callable() { // from class: X.2xi
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    SendLiveLocationKeyJob sendLiveLocationKeyJob = SendLiveLocationKeyJob.this;
                    Jid jid = c0Zq;
                    C02L c02l = sendLiveLocationKeyJob.A00;
                    c02l.A05();
                    C0QS c0qs = new C0QS(jid.getRawString(), C002701i.A0T(c02l.A02));
                    C01J c01j = sendLiveLocationKeyJob.A02;
                    c01j.A0H.A00();
                    C27411Ng c27411Ng = new C27411Ng(new C1RJ(c01j.A00.A00.A01).A00(C002701i.A15(c0qs)).ASe(), 0);
                    C40541sR A09 = C40531sQ.A09();
                    C2G1 c2g1 = ((C40531sQ) A09.A00).A0U;
                    if (c2g1 == null) {
                        c2g1 = C2G1.A03;
                    }
                    C2G5 c2g5 = (C2G5) c2g1.AVX();
                    c2g5.A04(jid.getRawString());
                    byte[] bArr = c27411Ng.A01;
                    if (bArr != null) {
                        C0AN A01 = C0AN.A01(bArr, 0, bArr.length);
                        c2g5.A02();
                        C2G1 c2g12 = (C2G1) c2g5.A00;
                        c2g12.A00 |= 2;
                        c2g12.A01 = A01;
                        A09.A02();
                        C40531sQ c40531sQ2 = (C40531sQ) A09.A00;
                        if (c40531sQ2 != null) {
                            c40531sQ2.A0U = (C2G1) c2g5.A01();
                            c40531sQ2.A00 |= 16384;
                            return A09.A01();
                        }
                        throw null;
                    }
                    throw null;
                }
            }).get();
            HashMap hashMap = new HashMap();
            for (final UserJid userJid3 : arrayList) {
                hashMap.put(userJid3, (C010805j) this.A03.A00.submit(new Callable() { // from class: X.2xh
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        SendLiveLocationKeyJob sendLiveLocationKeyJob = SendLiveLocationKeyJob.this;
                        UserJid userJid4 = userJid3;
                        C40531sQ c40531sQ2 = c40531sQ;
                        C27391Ne A07 = sendLiveLocationKeyJob.A02.A07(C002701i.A0T(DeviceJid.of(userJid4)), c40531sQ2.A0B());
                        return new C010805j(2, C42041uv.A00(A07.A00), A07.A02);
                    }
                }).get());
            }
            String A03 = this.A05.A03();
            HashMap hashMap2 = new HashMap();
            ((C0Ml) this.A05.A04(new C04420Kc(C0Zq.A00, "notification", A03, "location", null, null, null, null, 0L, hashMap2.isEmpty() ? null : new ArrayList(hashMap2.values())), Message.obtain(null, 0, 123, 0, new C07580Yu(A03, hashMap, this.retryCount == null ? 0 : this.retryCount.intValue())))).get();
            StringBuilder A0P4 = C000200d.A0P("sent location key distribution notifications");
            A0P4.append(A07());
            Log.i(A0P4.toString());
            C41461tx c41461tx3 = this.A04;
            if (c41461tx3 != null) {
                StringBuilder A0P5 = C000200d.A0P("LocationSharingManager/markSentLocationKey; jids.size=");
                A0P5.append(arrayList.size());
                Log.i(A0P5.toString());
                ArrayList arrayList3 = new ArrayList();
                synchronized (c41461tx3.A0T) {
                    c41461tx3.A0D();
                    for (UserJid userJid4 : arrayList) {
                        if (!c41461tx3.A0A.A0A(userJid4) && !c41461tx3.A0W.contains(userJid4) && (num = (Integer) c41461tx3.A0c.get(userJid4)) != null && num.intValue() == 1) {
                            c41461tx3.A0W.add(userJid4);
                            arrayList3.add(userJid4);
                            c41461tx3.A0c.remove(userJid4);
                        }
                    }
                    c41461tx3.A0O.A06(arrayList3, true);
                    if (c41461tx3.A0f()) {
                        c41461tx3.A0K();
                    }
                }
                c41461tx3.A0D.A00.A01(new C0KE());
                return;
            }
            throw null;
        } catch (Exception e) {
            C41461tx c41461tx4 = this.A04;
            synchronized (c41461tx4.A0T) {
                for (UserJid userJid5 : arrayList) {
                    c41461tx4.A0c.remove(userJid5);
                }
                throw e;
            }
        }
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("exception while running send live location key job");
        A0P.append(A07());
        Log.w(A0P.toString(), exc);
        return true;
    }

    public final String A07() {
        StringBuilder A0P = C000200d.A0P("; persistentId=");
        A0P.append(super.A01);
        A0P.append("; jids.size()=");
        A0P.append(this.rawJids.size());
        A0P.append("; retryCount=");
        A0P.append(this.retryCount);
        return A0P.toString();
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) AnonymousClass029.A0X(context.getApplicationContext());
        this.A00 = c0c5.A0M();
        this.A05 = c0c5.A1H();
        this.A03 = c0c5.A0k();
        this.A02 = c0c5.A0j();
        this.A01 = c0c5.A0P();
        this.A04 = c0c5.A1C();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        ArrayList arrayList = this.rawJids;
        if (arrayList != null && !arrayList.isEmpty()) {
            Integer num = this.retryCount;
            if (num == null || num.intValue() >= 0) {
                return;
            }
            StringBuilder A0P = C000200d.A0P("retryCount cannot be negative");
            A0P.append(A07());
            throw new InvalidObjectException(A0P.toString());
        }
        StringBuilder A0P2 = C000200d.A0P("jids must not be empty");
        A0P2.append(A07());
        throw new InvalidObjectException(A0P2.toString());
    }
}
