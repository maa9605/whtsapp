package com.whatsapp.jobqueue.job;

import X.AbstractC005302j;
import X.AbstractC05150Nn;
import X.AnonymousClass012;
import X.AnonymousClass029;
import X.AnonymousClass094;
import X.C000200d;
import X.C003101m;
import X.C04420Kc;
import X.C04580Kz;
import X.C05Y;
import X.C0C5;
import X.C0EF;
import X.C0EJ;
import X.C0Ho;
import X.C0I7;
import X.C0Ml;
import X.C0Z1;
import android.content.Context;
import android.os.Message;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.whispersystems.jobqueue.Job;

/* loaded from: classes.dex */
public final class SendReadReceiptJob extends Job implements C0I7 {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass012 A00;
    public transient C05Y A01;
    public transient C0EF A02;
    public transient C0EJ A03;
    public final String jid;
    public final long loggableStanzaId;
    public final String[] messageIds;
    public final long originalMessageTimestamp;
    public final String participant;
    public final String remoteSender;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SendReadReceiptJob(X.AbstractC005302j r5, X.AbstractC005302j r6, com.whatsapp.jid.DeviceJid r7, java.lang.String[] r8, long r9, long r11) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.lang.String r0 = "read-receipt-"
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            java.lang.String r0 = r5.getRawString()
            r1.append(r0)
            java.lang.String r0 = "-"
            r1.append(r0)
            java.lang.String r0 = X.C003101m.A07(r6)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            r1 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r1, r2)
            r4.<init>(r0)
            java.lang.String r0 = r5.getRawString()
            if (r0 == 0) goto L58
            r4.jid = r0
            r1 = 0
            if (r6 != 0) goto L53
            r0 = r1
        L3f:
            r4.participant = r0
            if (r7 == 0) goto L47
            java.lang.String r1 = r7.getRawString()
        L47:
            r4.remoteSender = r1
            X.C000700j.A0B(r8)
            r4.messageIds = r8
            r4.originalMessageTimestamp = r9
            r4.loggableStanzaId = r11
            return
        L53:
            java.lang.String r0 = r6.getRawString()
            goto L3f
        L58:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendReadReceiptJob.<init>(X.02j, X.02j, com.whatsapp.jid.DeviceJid, java.lang.String[], long, long):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
        A07();
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("canceled sent read receipts job");
        A0P.append(A07());
        Log.w(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        String[] strArr;
        C0Z1 c0z1;
        A07();
        AbstractC005302j A02 = AbstractC005302j.A02(this.jid);
        if (this.A02.A01(A02)) {
            if (C003101m.A0Z(A02)) {
                long j = this.originalMessageTimestamp;
                if (j > 0 && j + 86400000 < this.A00.A05()) {
                    return;
                }
            }
            AbstractC005302j A022 = AbstractC005302j.A02(this.participant);
            DeviceJid nullable = DeviceJid.getNullable(this.remoteSender);
            String str = this.A02.A02(A02) ? "read" : "read-self";
            if (C003101m.A0Z(A022)) {
                Log.w("send-read-job/malformed participant flipping");
                C04580Kz c04580Kz = C04580Kz.A00;
                strArr = this.messageIds;
                c0z1 = new C0Z1(new AnonymousClass094(c04580Kz, false, strArr[0]), A02, nullable, str);
            } else {
                strArr = this.messageIds;
                c0z1 = new C0Z1(new AnonymousClass094(A02, false, strArr[0]), A022, nullable, str);
            }
            int length = strArr.length;
            if (length > 1) {
                int i = length - 1;
                String[] strArr2 = new String[i];
                c0z1.A01 = strArr2;
                System.arraycopy(strArr, 1, strArr2, 0, i);
            }
            Pair A023 = C0Ho.A02(A02, A022, nullable);
            HashMap hashMap = new HashMap();
            C04420Kc c04420Kc = new C04420Kc((Jid) A023.first, "receipt", this.messageIds[0], str, null, (Jid) A023.second, null, null, this.loggableStanzaId, hashMap.isEmpty() ? null : new ArrayList(hashMap.values()));
            long j2 = this.loggableStanzaId;
            c0z1.A00 = j2;
            AbstractC05150Nn A01 = this.A03.A01(0, j2);
            if (A01 != null) {
                A01.A00(6);
            }
            ((C0Ml) this.A01.A04(c04420Kc, Message.obtain(null, 0, 89, 0, c0z1))).get();
        }
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("exception while running sent read receipts job");
        A0P.append(A07());
        Log.w(A0P.toString(), exc);
        return true;
    }

    public final String A07() {
        AbstractC005302j A02 = AbstractC005302j.A02(this.jid);
        AbstractC005302j A022 = AbstractC005302j.A02(this.participant);
        DeviceJid nullable = DeviceJid.getNullable(this.remoteSender);
        StringBuilder sb = new StringBuilder("; jid=");
        sb.append(A02);
        sb.append("; participant=");
        sb.append(A022);
        sb.append("; remoteSender=");
        sb.append(nullable);
        sb.append("; ids:");
        sb.append(Arrays.deepToString(this.messageIds));
        return sb.toString();
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) AnonymousClass029.A0X(context.getApplicationContext());
        this.A00 = c0c5.A0d();
        this.A01 = c0c5.A1H();
        this.A02 = c0c5.A1K();
        this.A03 = c0c5.A1O();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (Jid.getNullable(this.jid) != null) {
            String[] strArr = this.messageIds;
            if (strArr == null || strArr.length == 0) {
                throw new InvalidObjectException("messageIds must not be empty");
            }
            return;
        }
        throw new InvalidObjectException("jid must not be empty");
    }
}
