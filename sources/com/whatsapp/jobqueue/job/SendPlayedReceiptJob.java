package com.whatsapp.jobqueue.job;

import X.AbstractC005302j;
import X.C000200d;
import X.C003101m;
import X.C02180Ae;
import X.C04420Kc;
import X.C05Y;
import X.C0C5;
import X.C0I7;
import X.C0Ml;
import X.C0ZF;
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
public final class SendPlayedReceiptJob extends Job implements C0I7 {
    public static final long serialVersionUID = 1;
    public transient C05Y A00;
    public final int editVersion;
    public final String messageId;
    public final String remoteJidRawJid;
    public final String remoteResourceRawJid;
    public final String webAttrString;

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SendPlayedReceiptJob(X.AnonymousClass092 r9) {
        /*
            r8 = this;
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            r6 = 0
            java.lang.String r0 = "played-receipt-"
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            X.094 r5 = r9.A0n
            X.02j r4 = r5.A00
            if (r4 == 0) goto L48
            java.lang.String r0 = r4.getRawString()
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            r2 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r7.add(r0)
            r1 = 0
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r7, r2, r3)
            r8.<init>(r0)
            java.lang.String r0 = r4.getRawString()
            r8.remoteJidRawJid = r0
            X.02j r0 = r9.A0A()
            java.lang.String r0 = X.C003101m.A07(r0)
            r8.remoteResourceRawJid = r0
            java.lang.String r0 = r5.A01
            r8.messageId = r0
            r8.webAttrString = r1
            r8.editVersion = r6
            return
        L48:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendPlayedReceiptJob.<init>(X.092):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        C000200d.A1O(C000200d.A0P("SendPlayedReceiptJob/canceled send played receipts job; id="), this.messageId);
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        AbstractC005302j abstractC005302j;
        AbstractC005302j A01 = AbstractC005302j.A01(this.remoteJidRawJid);
        if (!TextUtils.isEmpty(this.remoteResourceRawJid)) {
            abstractC005302j = AbstractC005302j.A02(this.remoteResourceRawJid);
        } else {
            abstractC005302j = null;
        }
        String str = this.messageId;
        AbstractC005302j abstractC005302j2 = abstractC005302j;
        if (!C003101m.A0P(abstractC005302j)) {
            abstractC005302j2 = A01;
            A01 = abstractC005302j;
        }
        HashMap hashMap = new HashMap();
        ((C0Ml) this.A00.A04(new C04420Kc(abstractC005302j2, "receipt", str, "played", null, A01, null, null, 0L, hashMap.isEmpty() ? null : new ArrayList(hashMap.values())), Message.obtain(null, 0, 38, 0, new C0ZF(abstractC005302j2, "played", A01, new String[]{this.messageId})))).get();
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("SendPlayedReceiptJob/exception while running sent played receipt job; id=");
        A0P.append(this.messageId);
        Log.w(A0P.toString(), exc);
        return true;
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        this.A00 = ((C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class)).A1H();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (!TextUtils.isEmpty(this.remoteJidRawJid)) {
            if (TextUtils.isEmpty(this.messageId)) {
                throw new InvalidObjectException("messageId must not be empty");
            }
            return;
        }
        throw new InvalidObjectException("remoteJid must not be empty");
    }
}
