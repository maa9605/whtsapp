package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass029;
import X.C000200d;
import X.C002701i;
import X.C01J;
import X.C02L;
import X.C0C5;
import X.C0I7;
import X.C0QS;
import X.C0Zq;
import X.C27291Mu;
import X.C41461tx;
import android.content.Context;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractCollection;
import org.whispersystems.jobqueue.requirements.Requirement;

/* loaded from: classes2.dex */
public final class AxolotlFastRatchetSenderKeyRequirement implements Requirement, C0I7 {
    public static final long serialVersionUID = 1;
    public transient C02L A00;
    public transient C01J A01;
    public transient C41461tx A02;
    public String groupJid = C0Zq.A00.getRawString();

    @Override // org.whispersystems.jobqueue.requirements.Requirement
    public boolean AFd() {
        if (this.A02.A0f()) {
            if (!((AbstractCollection) this.A02.A0A()).isEmpty()) {
                this.A02.A0g();
                return false;
            }
            C02L c02l = this.A00;
            c02l.A05();
            C27291Mu A00 = this.A01.A07.A00(new C0QS(C0Zq.A00.getRawString(), C002701i.A0T(c02l.A02)));
            if (A00 == null || A00.A01.length <= 0) {
                Log.i("AxolotlFastRatchetSenderKeyRequirement/empty sender key record; reset key");
                this.A02.A0J();
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) AnonymousClass029.A0X(context.getApplicationContext());
        this.A00 = c0c5.A0M();
        this.A01 = c0c5.A0j();
        this.A02 = c0c5.A1C();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        String rawString = C0Zq.A00.getRawString();
        String str = this.groupJid;
        if (rawString.equals(str)) {
            return;
        }
        StringBuilder A0P = C000200d.A0P("groupJid is not location Jid, only location Jid supported for now; groupJid=");
        A0P.append(str);
        throw new InvalidObjectException(A0P.toString());
    }
}
