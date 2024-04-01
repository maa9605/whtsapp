package com.whatsapp.jobqueue.job;

import X.C000200d;
import X.C011305p;
import X.C02180Ae;
import X.C05Y;
import X.C0C5;
import X.C0E5;
import X.C0I7;
import X.C0Ml;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.concurrent.ConcurrentHashMap;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

/* loaded from: classes2.dex */
public final class GetVNameCertificateJob extends Job implements C0I7 {
    public static final ConcurrentHashMap A02 = new ConcurrentHashMap();
    public static final long serialVersionUID = 1;
    public transient C0E5 A00;
    public transient C05Y A01;
    public final String jid;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GetVNameCertificateJob(com.whatsapp.jid.UserJid r6) {
        /*
            r5 = this;
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.lang.String r3 = r6.getRawString()
            r2 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r4.add(r0)
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r6)
            if (r1 == 0) goto L32
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r1)
            r4.add(r0)
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r4, r2, r3)
            r5.<init>(r0)
            java.lang.String r0 = r6.getRawString()
            X.C000700j.A03(r0)
            r5.jid = r0
            return
        L32:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.GetVNameCertificateJob.<init>(com.whatsapp.jid.UserJid):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
        StringBuilder A0P = C000200d.A0P("get vname certificate job added");
        A0P.append(A07());
        Log.i(A0P.toString());
        A02.put(this.jid, Boolean.TRUE);
        for (Requirement requirement : this.parameters.requirements) {
            if (requirement instanceof AxolotlSessionRequirement) {
                AxolotlSessionRequirement axolotlSessionRequirement = (AxolotlSessionRequirement) requirement;
                if (!axolotlSessionRequirement.AFd()) {
                    this.A00.A03(new DeviceJid[]{axolotlSessionRequirement.A01}, false, 2);
                }
            }
        }
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("canceled get vname certificate job");
        A0P.append(A07());
        Log.w(A0P.toString());
        A02.remove(this.jid);
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("starting get vname certificate job");
            sb.append(A07());
            Log.i(sb.toString());
            String A022 = this.A01.A02();
            C05Y c05y = this.A01;
            UserJid userJid = UserJid.get(this.jid);
            Message obtain = Message.obtain(null, 0, 118, 0);
            Bundle data = obtain.getData();
            data.putString("id", A022);
            data.putParcelable("jid", userJid);
            ((C0Ml) c05y.A05(A022, obtain, false)).get();
            A02.remove(this.jid);
        } catch (Exception e) {
            throw e;
        } catch (Throwable th) {
            A02.remove(this.jid);
            throw th;
        }
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("exception while running get vname certificate job");
        A0P.append(A07());
        Log.w(A0P.toString(), exc);
        return true;
    }

    public final String A07() {
        StringBuilder A0P = C000200d.A0P("; jid=");
        A0P.append(UserJid.getNullable(this.jid));
        A0P.append("; persistentId=");
        A0P.append(super.A01);
        return A0P.toString();
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class);
        this.A01 = c0c5.A1H();
        this.A00 = c0c5.A0P();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (!TextUtils.isEmpty(this.jid)) {
            try {
                UserJid.get(this.jid);
                A02.put(this.jid, Boolean.TRUE);
                return;
            } catch (C011305p unused) {
                StringBuilder A0P = C000200d.A0P("jid must be an individual jid; jid=");
                A0P.append(this.jid);
                throw new InvalidObjectException(A0P.toString());
            }
        }
        throw new InvalidObjectException("jid must not be empty");
    }
}
