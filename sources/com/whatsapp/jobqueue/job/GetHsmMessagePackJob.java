package com.whatsapp.jobqueue.job;

import X.AbstractC003201n;
import X.AnonymousClass029;
import X.C000200d;
import X.C05Y;
import X.C0C5;
import X.C0I7;
import X.C41291tg;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.whispersystems.jobqueue.Job;

/* loaded from: classes2.dex */
public final class GetHsmMessagePackJob extends Job implements C0I7 {
    public static final HashSet A02 = new HashSet();
    public static final long serialVersionUID = 1;
    public transient C41291tg A00;
    public transient C05Y A01;
    public final String elementName;
    public final Locale[] locales;
    public final String namespace;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GetHsmMessagePackJob(java.util.Locale[] r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r1 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r2.add(r0)
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r1, r5)
            r3.<init>(r0)
            X.C000700j.A0B(r4)
            r3.locales = r4
            X.C000700j.A03(r5)
            r3.namespace = r5
            X.C000700j.A03(r6)
            r3.elementName = r6
            java.util.HashSet r1 = com.whatsapp.jobqueue.job.GetHsmMessagePackJob.A02
            monitor-enter(r1)
            r1.add(r3)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.GetHsmMessagePackJob.<init>(java.util.Locale[], java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Message A00(String str, Locale[] localeArr, String[] strArr, String str2, String str3) {
        Message obtain = Message.obtain(null, 0, 115, 0);
        Bundle data = obtain.getData();
        data.putString("id", str);
        data.putSerializable("locales", localeArr);
        if (strArr != null) {
            data.putStringArray("haveHashes", strArr);
        } else {
            data.remove("haveHashes");
        }
        data.putString("namespace", str2);
        data.putString("reason", str3);
        return obtain;
    }

    public static boolean A01(Locale[] localeArr, String str, String str2) {
        HashSet hashSet = A02;
        synchronized (hashSet) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                GetHsmMessagePackJob getHsmMessagePackJob = (GetHsmMessagePackJob) it.next();
                if (Arrays.equals(getHsmMessagePackJob.locales, localeArr) && TextUtils.equals(getHsmMessagePackJob.namespace, str) && TextUtils.equals(getHsmMessagePackJob.elementName, str2)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
        StringBuilder A0P = C000200d.A0P("get hsm message pack job added");
        A0P.append(A07());
        Log.i(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("canceled get hsm message pack job");
        A0P.append(A07());
        Log.w(A0P.toString());
        HashSet hashSet = A02;
        synchronized (hashSet) {
            hashSet.remove(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0134, code lost:
        if (r6 != null) goto L54;
     */
    /* JADX WARN: Finally extract failed */
    @Override // org.whispersystems.jobqueue.Job
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04() {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.GetHsmMessagePackJob.A04():void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("exception while running get hsm message pack job");
        A0P.append(A07());
        Log.w(A0P.toString(), exc);
        return true;
    }

    public final String A07() {
        StringBuilder A0P = C000200d.A0P("; namespace=");
        A0P.append(this.namespace);
        A0P.append("; element=");
        A0P.append(this.elementName);
        A0P.append("; locales=");
        A0P.append(AbstractC003201n.A08(this.locales));
        A0P.append("; persistentId=");
        A0P.append(super.A01);
        return A0P.toString();
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) AnonymousClass029.A0X(context.getApplicationContext());
        this.A01 = c0c5.A1H();
        this.A00 = c0c5.A0U();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Locale[] localeArr = this.locales;
        if (localeArr != null && localeArr.length != 0) {
            if (!TextUtils.isEmpty(this.namespace)) {
                if (!TextUtils.isEmpty(this.elementName)) {
                    HashSet hashSet = A02;
                    synchronized (hashSet) {
                        hashSet.add(this);
                    }
                    return;
                }
                throw new InvalidObjectException("elementName must not be empty");
            }
            throw new InvalidObjectException("namespace must not be empty");
        }
        throw new InvalidObjectException("locales[] must not be empty");
    }
}
