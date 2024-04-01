package com.whatsapp.jobqueue.requirement;

import X.C000200d;
import X.C002701i;
import X.C01J;
import X.C02180Ae;
import X.C0C5;
import X.C0EC;
import X.C0I7;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import org.whispersystems.jobqueue.requirements.Requirement;

/* loaded from: classes2.dex */
public class AxolotlPeerDeviceSessionRequirement implements Requirement, C0I7 {
    public transient C01J A00;
    public transient C0EC A01;
    public final String targetJidRawString;

    public AxolotlPeerDeviceSessionRequirement(DeviceJid deviceJid) {
        this.targetJidRawString = deviceJid.getRawString();
    }

    @Override // org.whispersystems.jobqueue.requirements.Requirement
    public boolean AFd() {
        DeviceJid nullable = DeviceJid.getNullable(this.targetJidRawString);
        if (nullable != null) {
            if (!this.A01.A02().A00.contains(nullable)) {
                C000200d.A1O(C000200d.A0P("AxolotlDeviceSessionRequirement/isPresent/warning: the specific device is not in db, handle the error in the job. jid="), this.targetJidRawString);
                return true;
            }
            return this.A00.A0U(C002701i.A0T(nullable));
        }
        throw null;
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class);
        this.A01 = c0c5.A10();
        this.A00 = c0c5.A0j();
    }
}
