package com.whatsapp.jobqueue.job;

import X.C000200d;
import X.C003101m;
import X.C02180Ae;
import X.C0C5;
import X.C0EE;
import X.C0I7;
import X.C22H;
import X.C41321tj;
import X.C41331tk;
import android.content.Context;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.whispersystems.jobqueue.Job;

/* loaded from: classes2.dex */
public final class SyncDevicesJob extends Job implements C0I7 {
    public static final long serialVersionUID = 1;
    public transient C41321tj A00;
    public transient C41331tk A01;
    public transient C0EE A02;
    public final String[] jids;
    public final int syncType;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SyncDevicesJob(com.whatsapp.jid.UserJid[] r5, int r6) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r2 = 0
            r1 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r1, r2)
            r4.<init>(r0)
            X.C000700j.A0B(r5)
            int r3 = r5.length
            r2 = 0
        L1c:
            if (r2 >= r3) goto L28
            r1 = r5[r2]
            java.lang.String r0 = "an element of jids was empty."
            X.C000700j.A04(r1, r0)
            int r2 = r2 + 1
            goto L1c
        L28:
            java.util.List r0 = java.util.Arrays.asList(r5)
            java.lang.String[] r0 = X.C003101m.A0d(r0)
            r4.jids = r0
            r4.syncType = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SyncDevicesJob.<init>(com.whatsapp.jid.UserJid[], int):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
        StringBuilder A0P = C000200d.A0P("SyncDevicesJob/onAdded/sync devices job added param=");
        A0P.append(A07());
        Log.i(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("SyncDevicesJob/onCanceled/cancel sync devices job param=");
        A0P.append(A07());
        Log.w(A0P.toString());
        this.A01.A01(this.jids);
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        C22H c22h;
        try {
            try {
                if (this.A02.A04()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SyncDevicesJob/onRun/start sync device. param=");
                    sb.append(A07());
                    Log.i(sb.toString());
                    C41321tj c41321tj = this.A00;
                    List A0G = C003101m.A0G(this.jids);
                    if (!((AbstractCollection) A0G).isEmpty()) {
                        int i = this.syncType;
                        if (i == 1) {
                            c22h = C22H.A0B;
                        } else if (i == 2) {
                            c22h = C22H.A0D;
                        } else if (i == 3) {
                            c22h = C22H.A03;
                        } else if (i != 4) {
                            c22h = C22H.A09;
                        } else {
                            c22h = C22H.A0G;
                        }
                        c41321tj.A03(A0G, c22h).get();
                        return;
                    }
                    throw new IllegalArgumentException("jid list is empty");
                }
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SyncDevicesJob/onRun/error, param=");
                sb2.append(A07());
                Log.e(sb2.toString());
                throw e;
            }
        } finally {
            this.A01.A01(this.jids);
        }
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("SyncDevicesJob/onShouldReply/exception while running devices sync param=");
        A0P.append(A07());
        Log.w(A0P.toString());
        return true;
    }

    public final String A07() {
        StringBuilder A0P = C000200d.A0P("; jids=");
        A0P.append(Arrays.toString(this.jids));
        return A0P.toString();
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class);
        this.A02 = c0c5.A1J();
        this.A00 = c0c5.A0Z();
        this.A01 = c0c5.A0a();
        String[] strArr = this.jids;
        if (strArr == null || (r3 = strArr.length) <= 0) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            UserJid nullable = UserJid.getNullable(str);
            if (nullable != null) {
                hashSet.add(nullable);
            }
        }
        C41331tk c41331tk = this.A01;
        synchronized (c41331tk.A03) {
            c41331tk.A03.addAll(hashSet);
            long A05 = c41331tk.A00.A05();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                c41331tk.A01.put((UserJid) it.next(), Long.valueOf(A05));
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        String[] strArr = this.jids;
        if (strArr != null && (r2 = strArr.length) != 0) {
            for (String str : strArr) {
                if (UserJid.getNullable(str) == null) {
                    throw new InvalidObjectException("an jid is not a UserJid");
                }
            }
            return;
        }
        throw new InvalidObjectException("jids must not be empty");
    }
}
