package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass075;
import X.C000200d;
import X.C000700j;
import X.C011305p;
import X.C02180Ae;
import X.C0C5;
import X.C0I7;
import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GetVNameCertificateJob;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.requirements.Requirement;

/* loaded from: classes2.dex */
public final class VNameCertificateRequirement implements Requirement, C0I7 {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass075 A00;
    public transient UserJid A01;
    public final String jid;

    public VNameCertificateRequirement(UserJid userJid) {
        this.A01 = userJid;
        String rawString = userJid.getRawString();
        C000700j.A03(rawString);
        this.jid = rawString;
    }

    public UserJid A00() {
        UserJid userJid = this.A01;
        if (userJid == null) {
            try {
                UserJid userJid2 = UserJid.get(this.jid);
                this.A01 = userJid2;
                return userJid2;
            } catch (C011305p unused) {
                return null;
            }
        }
        return userJid;
    }

    @Override // org.whispersystems.jobqueue.requirements.Requirement
    public boolean AFd() {
        long j;
        Number number;
        UserJid A00 = A00();
        if (A00 != null && (number = (Number) this.A00.A0A.get(A00)) != null) {
            j = number.longValue();
        } else {
            j = 0;
        }
        if (j > 0 && System.currentTimeMillis() - j < 3600000) {
            A00();
            return true;
        } else if (GetVNameCertificateJob.A02.containsKey(this.jid)) {
            return this.A00.A00(A00()) != null;
        } else {
            A00();
            return true;
        }
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        this.A00 = ((C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class)).A0X();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.jid)) {
            StringBuilder A0P = C000200d.A0P("jid must not be empty");
            StringBuilder A0P2 = C000200d.A0P("; jid=");
            A0P2.append(A00());
            A0P.append(A0P2.toString());
            throw new InvalidObjectException(A0P.toString());
        }
    }
}
