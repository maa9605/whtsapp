package com.whatsapp.jobqueue.requirement;

import X.C000200d;
import X.C002701i;
import X.C011305p;
import X.C01J;
import X.C02180Ae;
import X.C0C5;
import X.C0I7;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import org.whispersystems.jobqueue.requirements.Requirement;

/* loaded from: classes2.dex */
public final class AxolotlDifferentAliceBaseKeyRequirement implements Requirement, C0I7 {
    public static final long serialVersionUID = 1;
    public transient C01J A00;
    public transient DeviceJid A01;
    public final String jid;
    public final byte[] oldAliceBaseKey;

    public AxolotlDifferentAliceBaseKeyRequirement(DeviceJid deviceJid, byte[] bArr) {
        this.A01 = deviceJid;
        this.jid = deviceJid.getRawString();
        if (bArr.length != 0) {
            this.oldAliceBaseKey = bArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // org.whispersystems.jobqueue.requirements.Requirement
    public boolean AFd() {
        return !Arrays.equals(this.oldAliceBaseKey, this.A00.A0C(C002701i.A0T(this.A01)).A01.A00());
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        this.A00 = ((C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class)).A0j();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A01 = DeviceJid.get(this.jid);
            byte[] bArr = this.oldAliceBaseKey;
            if (bArr == null || bArr.length == 0) {
                throw new InvalidObjectException("oldAliceBaseKey must not be empty");
            }
        } catch (C011305p unused) {
            StringBuilder A0P = C000200d.A0P("jid must be a valid user jid; jid=");
            A0P.append(this.jid);
            throw new InvalidObjectException(A0P.toString());
        }
    }
}
