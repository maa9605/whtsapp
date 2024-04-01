package com.whatsapp.jobqueue.job;

import X.AnonymousClass011;
import X.AnonymousClass029;
import X.C000200d;
import X.C003101m;
import X.C05Y;
import X.C0C5;
import X.C0I7;
import X.C0Ml;
import X.C37341mG;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.whispersystems.jobqueue.Job;

/* loaded from: classes2.dex */
public final class BulkGetPreKeyJob extends Job implements C0I7 {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass011 A00;
    public transient C05Y A01;
    public final int context;
    public final String[] identityChangedJids;
    public final String[] jids;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BulkGetPreKeyJob(com.whatsapp.jid.DeviceJid[] r7, com.whatsapp.jid.DeviceJid[] r8, int r9) {
        /*
            r6 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r2 = 0
            r1 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r1, r2)
            r6.<init>(r0)
            java.util.List r0 = java.util.Arrays.asList(r7)
            java.lang.String[] r0 = X.C003101m.A0d(r0)
            X.C000700j.A0B(r0)
            r6.jids = r0
            if (r8 != 0) goto L45
            r0 = 0
        L27:
            r6.identityChangedJids = r0
            r6.context = r9
            int r5 = r7.length
            r4 = 0
            r2 = 0
        L2e:
            java.lang.String r3 = "jid must be an individual jid; jid="
            if (r2 >= r5) goto L6b
            r1 = r7[r2]
            if (r1 == 0) goto L63
            boolean r0 = X.C003101m.A0U(r1)
            if (r0 != 0) goto L4e
            boolean r0 = X.C003101m.A0P(r1)
            if (r0 != 0) goto L4e
            int r2 = r2 + 1
            goto L2e
        L45:
            java.util.List r0 = java.util.Arrays.asList(r8)
            java.lang.String[] r0 = X.C003101m.A0d(r0)
            goto L27
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L63:
            java.lang.String r1 = "an element of jids was empty"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L6b:
            if (r8 == 0) goto La0
            int r2 = r8.length
        L6e:
            if (r4 >= r2) goto La0
            r1 = r8[r4]
            if (r1 == 0) goto L98
            boolean r0 = X.C003101m.A0U(r1)
            if (r0 != 0) goto L83
            boolean r0 = X.C003101m.A0P(r1)
            if (r0 != 0) goto L83
            int r4 = r4 + 1
            goto L6e
        L83:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L98:
            java.lang.String r1 = "an element of identityChangedJids was empty"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.BulkGetPreKeyJob.<init>(com.whatsapp.jid.DeviceJid[], com.whatsapp.jid.DeviceJid[], int):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
        StringBuilder A0P = C000200d.A0P("bulk get pre key job added");
        A0P.append(A07());
        Log.i(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("canceled bulk get pre key job");
        A0P.append(A07());
        Log.w(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        List arrayList;
        StringBuilder A0P = C000200d.A0P("starting bulk get pre key job");
        A0P.append(A07());
        Log.i(A0P.toString());
        String A02 = this.A01.A02();
        List A0F = C003101m.A0F(DeviceJid.class, Arrays.asList(this.jids));
        String[] strArr = this.identityChangedJids;
        if (strArr != null) {
            arrayList = C003101m.A0F(DeviceJid.class, Arrays.asList(strArr));
        } else {
            arrayList = new ArrayList();
        }
        if (this.context != 0) {
            C37341mG c37341mG = new C37341mG();
            c37341mG.A00 = Boolean.valueOf(!arrayList.isEmpty());
            c37341mG.A02 = Long.valueOf(((AbstractCollection) A0F).size());
            c37341mG.A01 = Integer.valueOf(this.context);
            this.A00.A0B(c37341mG, null, false);
        }
        C05Y c05y = this.A01;
        Message obtain = Message.obtain(null, 0, 87, 0);
        obtain.getData().putString("id", A02);
        Bundle data = obtain.getData();
        data.putParcelableArray("jids", (Jid[]) ((AbstractCollection) A0F).toArray(new DeviceJid[0]));
        obtain.getData().putParcelableArray("identityJids", (Jid[]) arrayList.toArray(new DeviceJid[0]));
        ((C0Ml) c05y.A05(A02, obtain, false)).get();
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("exception while running bulk get pre key job");
        A0P.append(A07());
        Log.w(A0P.toString(), exc);
        return true;
    }

    public final String A07() {
        StringBuilder A0P = C000200d.A0P("; jids=");
        A0P.append(Arrays.toString(this.jids));
        A0P.append("; context=");
        A0P.append(this.context);
        return A0P.toString();
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) AnonymousClass029.A0X(context.getApplicationContext());
        this.A00 = c0c5.A15();
        this.A01 = c0c5.A1H();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        String[] strArr = this.jids;
        if (strArr != null && (r3 = strArr.length) != 0) {
            for (String str : strArr) {
                DeviceJid nullable = DeviceJid.getNullable(str);
                if (nullable != null) {
                    if (C003101m.A0U(nullable) || C003101m.A0P(nullable)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("jid must be an individual jid; jid=");
                        sb.append(nullable);
                        throw new InvalidObjectException(sb.toString());
                    }
                } else {
                    throw new InvalidObjectException("an element of jids was empty");
                }
            }
            String[] strArr2 = this.identityChangedJids;
            if (strArr2 != null) {
                for (String str2 : strArr2) {
                    DeviceJid nullable2 = DeviceJid.getNullable(str2);
                    if (nullable2 != null) {
                        if (C003101m.A0U(nullable2) || C003101m.A0P(nullable2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("jid must be an individual jid; jid=");
                            sb2.append(nullable2);
                            throw new InvalidObjectException(sb2.toString());
                        }
                    } else {
                        throw new InvalidObjectException("an element of identityChangedJids was empty");
                    }
                }
                return;
            }
            return;
        }
        throw new InvalidObjectException("jids must not be empty");
    }
}
