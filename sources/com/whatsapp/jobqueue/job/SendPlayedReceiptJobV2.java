package com.whatsapp.jobqueue.job;

import X.AbstractC005302j;
import X.C000200d;
import X.C02180Ae;
import X.C03790Hb;
import X.C04420Kc;
import X.C05B;
import X.C05Y;
import X.C09600eO;
import X.C0C5;
import X.C0CD;
import X.C0EF;
import X.C0Ho;
import X.C0I7;
import X.C0Ml;
import X.C0ZF;
import X.C41391tq;
import android.content.ContentValues;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.whispersystems.jobqueue.Job;

/* loaded from: classes.dex */
public class SendPlayedReceiptJobV2 extends Job implements C0I7 {
    public static final long serialVersionUID = 1;
    public transient C41391tq A00;
    public transient C05Y A01;
    public transient C0EF A02;
    public final String[] messageIds;
    public final Long[] messageRowIds;
    public final String participantRawJid;
    public final boolean playedSelfFromPeer;
    public final String toRawJid;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SendPlayedReceiptJobV2(X.C09600eO r6, boolean r7) {
        /*
            r5 = this;
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.lang.String r0 = "played-receipt-v2-"
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            X.02j r3 = r6.A01
            java.lang.String r0 = r3.getRawString()
            if (r0 == 0) goto L52
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            r1 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r4.add(r0)
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r4, r1, r2)
            r5.<init>(r0)
            java.lang.String r0 = r3.getRawString()
            if (r0 == 0) goto L50
            r5.toRawJid = r0
            X.02j r0 = r6.A00
            if (r0 != 0) goto L4b
            r0 = 0
        L38:
            r5.participantRawJid = r0
            java.lang.Long[] r0 = r6.A02
            X.C000700j.A0B(r0)
            r5.messageRowIds = r0
            java.lang.String[] r0 = r6.A03
            X.C000700j.A0B(r0)
            r5.messageIds = r0
            r5.playedSelfFromPeer = r7
            return
        L4b:
            java.lang.String r0 = r0.getRawString()
            goto L38
        L50:
            r0 = 0
            throw r0
        L52:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2.<init>(X.0eO, boolean):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
        A07();
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("SendPlayedReceiptJobV2/onCanceled; ");
        A0P.append(A07());
        Log.w(A0P.toString());
    }

    /* JADX WARN: Finally extract failed */
    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        Pair A02 = C0Ho.A02(AbstractC005302j.A01(this.toRawJid), AbstractC005302j.A02(this.participantRawJid), null);
        boolean A022 = this.A02.A02(AbstractC005302j.A00((Jid) A02.first));
        String str = A022 ? "played" : "played-self";
        A07();
        if (!A022) {
            C41391tq c41391tq = this.A00;
            C09600eO c09600eO = new C09600eO(AbstractC005302j.A01(this.toRawJid), AbstractC005302j.A02(this.participantRawJid), this.messageRowIds, this.messageIds);
            if (c41391tq != null) {
                StringBuilder A0P = C000200d.A0P("PlayedSelfReceiptStore/insertPlayedSelfReceipt/toJid = ");
                A0P.append(c09600eO.toString());
                Log.i(A0P.toString());
                ContentValues contentValues = new ContentValues();
                int i = 0;
                while (true) {
                    String[] strArr = c09600eO.A03;
                    if (i >= strArr.length) {
                        break;
                    }
                    contentValues.clear();
                    C05B c05b = c41391tq.A00;
                    contentValues.put("to_jid_row_id", Long.valueOf(c05b.A02(c09600eO.A01)));
                    AbstractC005302j abstractC005302j = c09600eO.A00;
                    if (abstractC005302j != null) {
                        contentValues.put("participant_jid_row_id", Long.valueOf(c05b.A02(abstractC005302j)));
                    }
                    contentValues.put("message_row_id", c09600eO.A02[i]);
                    contentValues.put("message_id", strArr[i]);
                    C0CD A04 = c41391tq.A01.A04();
                    try {
                        C03790Hb A00 = A04.A00();
                        if (A04.A02.A02("played_self_receipt", contentValues) == -1) {
                            Log.w("PlayedSelfReceiptStore/insertPlayedSelfReceipt fail to insert");
                        }
                        A00.A00();
                        A00.close();
                        A04.close();
                        i++;
                    } finally {
                    }
                }
                if (this.playedSelfFromPeer) {
                    return;
                }
            } else {
                throw null;
            }
        }
        HashMap hashMap = new HashMap();
        ((C0Ml) this.A01.A04(new C04420Kc((Jid) A02.first, "receipt", this.messageIds[0], str, null, (Jid) A02.second, null, null, 0L, hashMap.isEmpty() ? null : new ArrayList(hashMap.values())), Message.obtain(null, 0, 38, 0, new C0ZF(AbstractC005302j.A00((Jid) A02.first), str, AbstractC005302j.A00((Jid) A02.second), this.messageIds)))).get();
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        A07();
        return true;
    }

    public final String A07() {
        AbstractC005302j A02 = AbstractC005302j.A02(this.toRawJid);
        AbstractC005302j A022 = AbstractC005302j.A02(this.participantRawJid);
        StringBuilder sb = new StringBuilder("; jid=");
        sb.append(A02);
        sb.append("; participant=");
        sb.append(A022);
        sb.append("; id=");
        String[] strArr = this.messageIds;
        sb.append(strArr[0]);
        sb.append("; count=");
        sb.append(strArr.length);
        return sb.toString();
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class);
        this.A01 = c0c5.A1H();
        this.A02 = c0c5.A1K();
        this.A00 = c0c5.A0u();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (!TextUtils.isEmpty(this.toRawJid)) {
            String[] strArr = this.messageIds;
            if (strArr == null || strArr.length == 0) {
                throw new InvalidObjectException("messageIds must not be empty");
            }
            return;
        }
        throw new InvalidObjectException("toJid must not be empty");
    }
}
