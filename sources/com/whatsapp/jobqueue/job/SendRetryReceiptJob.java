package com.whatsapp.jobqueue.job;

import X.AnonymousClass029;
import X.C000200d;
import X.C01J;
import X.C01R;
import X.C04420Kc;
import X.C05020My;
import X.C05Y;
import X.C0C5;
import X.C0Ho;
import X.C0I7;
import X.C0Ml;
import X.C0ZI;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendRetryReceiptJob;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.whispersystems.jobqueue.Job;

/* loaded from: classes2.dex */
public final class SendRetryReceiptJob extends Job implements C0I7 {
    public static final long serialVersionUID = 1;
    public transient C01J A00;
    public transient C01R A01;
    public transient C05Y A02;
    public final String category;
    public final int editVersion;
    public final String id;
    public final String jid;
    public final int localRegistrationId;
    public final long loggableStanzaId;
    public final String participant;
    public final String recipientJid;
    public final int retryCount;
    public final long timestamp;

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SendRetryReceiptJob(X.C05190Nr r5, int r6) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.lang.String r0 = "retry-receipt-"
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            X.02j r0 = r5.A02()
            java.lang.String r0 = X.C003101m.A07(r0)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r1, r2)
            r4.<init>(r0)
            com.whatsapp.jid.Jid r0 = r5.A0Z
            if (r0 == 0) goto L68
            java.lang.String r0 = r0.getRawString()
            r4.jid = r0
            java.lang.String r0 = r5.A0d
            if (r0 == 0) goto L66
            r4.id = r0
            com.whatsapp.jid.Jid r0 = r5.A06
            java.lang.String r0 = X.C003101m.A07(r0)
            r4.participant = r0
            com.whatsapp.jid.UserJid r0 = r5.A0a
            java.lang.String r0 = X.C003101m.A07(r0)
            r4.recipientJid = r0
            long r0 = r5.A0Y
            r4.timestamp = r0
            int r0 = r5.A01()
            r4.retryCount = r0
            r4.localRegistrationId = r6
            int r0 = r5.A00()
            r4.editVersion = r0
            long r0 = r5.A04
            r4.loggableStanzaId = r0
            java.lang.String r0 = r5.A0N
            r4.category = r0
            return
        L66:
            r0 = 0
            throw r0
        L68:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendRetryReceiptJob.<init>(X.0Nr, int):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("canceled sent read receipts job");
        A0P.append(A07());
        Log.w(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        byte[] A1c = AnonymousClass029.A1c(this.localRegistrationId);
        Jid nullable = Jid.getNullable(this.jid);
        Jid nullable2 = Jid.getNullable(this.participant);
        Pair A02 = C0Ho.A02(nullable, nullable2, null);
        HashMap hashMap = new HashMap();
        Jid jid = (Jid) A02.first;
        String str = this.id;
        Jid jid2 = (Jid) A02.second;
        String str2 = this.category;
        String str3 = null;
        if (str2 != null) {
            str3 = str2;
        }
        C04420Kc c04420Kc = new C04420Kc(jid, "receipt", str, "retry", str3, jid2, null, null, 0L, hashMap.isEmpty() ? null : new ArrayList(hashMap.values()));
        if (this.retryCount > 0) {
            Pair pair = (Pair) this.A01.A00.submit(new Callable() { // from class: X.2xk
                {
                    SendRetryReceiptJob.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    SendRetryReceiptJob sendRetryReceiptJob = SendRetryReceiptJob.this;
                    byte[] A0W = sendRetryReceiptJob.A00.A0W();
                    C01J c01j = sendRetryReceiptJob.A00;
                    c01j.A0H.A00();
                    return new Pair(A0W, new C05020My[]{sendRetryReceiptJob.A00.A0F(), c01j.A00.A06()});
                }
            }).get();
            C05020My[] c05020MyArr = (C05020My[]) pair.second;
            ((C0Ml) this.A02.A04(c04420Kc, Message.obtain(null, 0, 11, 0, new C0ZI(nullable, this.id, nullable2, UserJid.getNullable(this.recipientJid), this.timestamp, this.retryCount + 1, A1c, (byte[]) pair.first, (byte) 5, c05020MyArr[0], c05020MyArr[1], this.loggableStanzaId, this.category)))).get();
            return;
        }
        ((C0Ml) this.A02.A04(c04420Kc, Message.obtain(null, 0, 11, 0, new C0ZI(nullable, this.id, nullable2, UserJid.getNullable(this.recipientJid), this.timestamp, this.retryCount + 1, A1c, null, (byte) 0, null, null, this.loggableStanzaId, this.category)))).get();
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("exception while running sent persistent retry job");
        A0P.append(A07());
        Log.w(A0P.toString(), exc);
        return true;
    }

    public final String A07() {
        Jid nullable = Jid.getNullable(this.jid);
        Jid nullable2 = Jid.getNullable(this.participant);
        StringBuilder sb = new StringBuilder("; jid=");
        sb.append(nullable);
        sb.append("; id=");
        sb.append(this.id);
        sb.append("; participant=");
        sb.append(nullable2);
        sb.append("; retryCount=");
        sb.append(this.retryCount);
        return sb.toString();
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) AnonymousClass029.A0X(context.getApplicationContext());
        this.A02 = c0c5.A1H();
        this.A01 = c0c5.A0k();
        this.A00 = c0c5.A0j();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (Jid.getNullable(this.jid) != null) {
            if (TextUtils.isEmpty(this.id)) {
                throw new InvalidObjectException("id must not be empty");
            }
            return;
        }
        throw new InvalidObjectException("jid must not be empty");
    }
}
