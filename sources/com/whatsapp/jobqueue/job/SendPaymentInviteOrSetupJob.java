package com.whatsapp.jobqueue.job;

import X.AnonymousClass029;
import X.C000200d;
import X.C04420Kc;
import X.C05Y;
import X.C0C5;
import X.C0I7;
import X.C0Ml;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.whispersystems.jobqueue.Job;

/* loaded from: classes2.dex */
public class SendPaymentInviteOrSetupJob extends Job implements C0I7 {
    public static final long serialVersionUID = 1;
    public transient C05Y A00;
    public final boolean invite;
    public final String jidRawStr;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SendPaymentInviteOrSetupJob(com.whatsapp.jid.UserJid r5, boolean r6) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r2 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            java.lang.String r1 = "SendPaymentInviteOrSetupJob"
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r2, r1)
            r4.<init>(r0)
            java.lang.String r0 = r5.getRawString()
            r4.jidRawStr = r0
            r4.invite = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendPaymentInviteOrSetupJob.<init>(com.whatsapp.jid.UserJid, boolean):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.invite ? "PAY: SendPaymentInviteOrSetupJob payment invite notif job added: " : "PAY: SendPaymentInviteOrSetupJobpayment setup notif job added: ");
        sb.append(A07());
        Log.i(sb.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("canceled SendPaymentInviteOrSetupJob job");
        A0P.append(A07());
        Log.w(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        StringBuilder A0P = C000200d.A0P("PAY: starting SendPaymentInviteOrSetupJob job");
        A0P.append(A07());
        Log.i(A0P.toString());
        String A03 = this.A00.A03();
        HashMap hashMap = new HashMap();
        C04420Kc c04420Kc = new C04420Kc(UserJid.getNullable(this.jidRawStr), "notification", A03, this.invite ? "upi-intent-to-send" : "upi-user-set-up", null, null, null, null, 0L, hashMap.isEmpty() ? null : new ArrayList(hashMap.values()));
        Message obtain = Message.obtain(null, 0, 170, 0);
        Bundle data = obtain.getData();
        data.putString("id", A03);
        data.putParcelable("jid", UserJid.getNullable(this.jidRawStr));
        data.putBoolean("invite", this.invite);
        ((C0Ml) this.A00.A04(c04420Kc, obtain)).get();
        StringBuilder sb = new StringBuilder("PAY: done SendPaymentInviteOrSetupJob job");
        sb.append(A07());
        Log.i(sb.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("exception while running SendPaymentInviteOrSetupJob job");
        A0P.append(A07());
        Log.w(A0P.toString(), exc);
        return true;
    }

    public final String A07() {
        StringBuilder A0P = C000200d.A0P("; jid=");
        A0P.append(this.jidRawStr);
        A0P.append("; invite: ");
        A0P.append(this.invite);
        A0P.append("; persistentId=");
        A0P.append(this.A01);
        return A0P.toString();
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        this.A00 = ((C0C5) AnonymousClass029.A0X(context.getApplicationContext())).A1H();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.jidRawStr)) {
            throw new InvalidObjectException("jid must not be empty");
        }
    }
}
