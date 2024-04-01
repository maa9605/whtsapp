package com.whatsapp.jobqueue.job;

import X.AbstractC005302j;
import X.AnonymousClass029;
import X.C000200d;
import X.C04420Kc;
import X.C05Y;
import X.C0C5;
import X.C0I7;
import X.C0Ml;
import X.C41461tx;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.whispersystems.jobqueue.Job;

/* loaded from: classes2.dex */
public class SendDisableLiveLocationJob extends Job implements C0I7 {
    public static final long serialVersionUID = 1;
    public transient C41461tx A00;
    public transient C05Y A01;
    public final String rawJid;
    public final long sequenceNumber;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SendDisableLiveLocationJob(X.AbstractC005302j r5, long r6) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.lang.String r2 = r5.getRawString()
            r1 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r1, r2)
            r4.<init>(r0)
            java.lang.String r0 = r5.getRawString()
            r4.rawJid = r0
            r4.sequenceNumber = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendDisableLiveLocationJob.<init>(X.02j, long):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
        StringBuilder A0P = C000200d.A0P("disable live location job added");
        A0P.append(A07());
        Log.i(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("canceled disable live location job");
        A0P.append(A07());
        Log.w(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        AbstractC005302j A02 = AbstractC005302j.A02(this.rawJid);
        if (A02 == null) {
            C000200d.A1M(C000200d.A0P("skip disable live location job; invalid jid: "), this.rawJid);
        } else if (this.A00.A0h(A02)) {
            StringBuilder A0P = C000200d.A0P("skip disable live location job; sharing is currently enabled");
            A0P.append(A07());
            Log.i(A0P.toString());
        } else {
            StringBuilder A0P2 = C000200d.A0P("starting disable live location job");
            A0P2.append(A07());
            Log.i(A0P2.toString());
            String A03 = this.A01.A03();
            HashMap hashMap = new HashMap();
            C04420Kc c04420Kc = new C04420Kc(A02, "notification", A03, "location", null, null, null, null, 0L, hashMap.isEmpty() ? null : new ArrayList(hashMap.values()));
            C05Y c05y = this.A01;
            AbstractC005302j A022 = AbstractC005302j.A02(this.rawJid);
            long j = this.sequenceNumber;
            Message obtain = Message.obtain(null, 0, 81, 0);
            obtain.getData().putString("id", A03);
            obtain.getData().putParcelable("jid", A022);
            obtain.getData().putLong("seq", j);
            ((C0Ml) c05y.A04(c04420Kc, obtain)).get();
            StringBuilder sb = new StringBuilder("done disable live location job");
            sb.append(A07());
            Log.i(sb.toString());
        }
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("exception while running disable live location job");
        A0P.append(A07());
        Log.w(A0P.toString(), exc);
        return true;
    }

    public final String A07() {
        StringBuilder A0T = C000200d.A0T("; jid=", AbstractC005302j.A02(this.rawJid), "; persistentId=");
        A0T.append(super.A01);
        return A0T.toString();
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) AnonymousClass029.A0X(context.getApplicationContext());
        this.A01 = c0c5.A1H();
        this.A00 = c0c5.A1C();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.rawJid)) {
            throw new InvalidObjectException("jid must not be empty");
        }
    }
}
