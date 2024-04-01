package com.whatsapp.jobqueue.requirement;

import X.C010605h;
import X.C02180Ae;
import X.C0C5;
import X.C0I7;
import android.content.Context;
import org.whispersystems.jobqueue.requirements.Requirement;

/* loaded from: classes2.dex */
public final class ChatConnectionRequirement implements Requirement, C0I7 {
    public static final long serialVersionUID = 1;
    public transient C010605h A00;

    @Override // org.whispersystems.jobqueue.requirements.Requirement
    public boolean AFd() {
        return this.A00.A03();
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        this.A00 = ((C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class)).A1G();
    }
}
