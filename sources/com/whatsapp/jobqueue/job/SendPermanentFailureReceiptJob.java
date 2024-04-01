package com.whatsapp.jobqueue.job;

import X.AbstractC005302j;
import X.C000200d;
import X.C02180Ae;
import X.C04420Kc;
import X.C05Y;
import X.C0C5;
import X.C0I7;
import X.C0Ml;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.whispersystems.jobqueue.Job;

/* loaded from: classes.dex */
public final class SendPermanentFailureReceiptJob extends Job implements C0I7 {
    public transient C05Y A00;
    public final String jid;
    public final String messageKeyId;
    public final String participant;

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SendPermanentFailureReceiptJob(X.AbstractC005302j r5, X.AbstractC005302j r6, java.lang.String r7) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.lang.String r0 = "permanent-failure-"
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            java.lang.String r0 = r5.getRawString()
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r1, r2)
            r4.<init>(r0)
            java.lang.String r0 = r5.getRawString()
            r4.jid = r0
            java.lang.String r0 = X.C003101m.A07(r6)
            r4.participant = r0
            r4.messageKeyId = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendPermanentFailureReceiptJob.<init>(X.02j, X.02j, java.lang.String):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("canceled send permananent-failure receipt job");
        A0P.append(A07());
        Log.w(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        AbstractC005302j A02 = AbstractC005302j.A02(this.jid);
        AbstractC005302j A022 = AbstractC005302j.A02(this.participant);
        HashMap hashMap = new HashMap();
        C04420Kc c04420Kc = new C04420Kc(A02, "receipt", this.messageKeyId, "error", null, A022, null, null, 0L, hashMap.isEmpty() ? null : new ArrayList(hashMap.values()));
        C05Y c05y = this.A00;
        String str = this.messageKeyId;
        Message obtain = Message.obtain(null, 0, 163, 0, A02);
        obtain.getData().putString("messageKeyId", str);
        obtain.getData().putParcelable("remoteResource", A022);
        ((C0Ml) c05y.A04(c04420Kc, obtain)).get();
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("exception while running send permanent failure receipt job");
        A0P.append(A07());
        Log.w(A0P.toString(), exc);
        return true;
    }

    public final String A07() {
        StringBuilder A0P = C000200d.A0P("; jid=");
        A0P.append(this.jid);
        A0P.append("; participant=");
        A0P.append(this.participant);
        A0P.append("; id=");
        A0P.append(this.messageKeyId);
        return A0P.toString();
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        this.A00 = ((C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class)).A1H();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (!TextUtils.isEmpty(this.jid)) {
            if (TextUtils.isEmpty(this.messageKeyId)) {
                throw new InvalidObjectException("messageId must not be empty");
            }
            return;
        }
        throw new InvalidObjectException("jid must not be empty");
    }
}
