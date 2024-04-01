package com.whatsapp.phoneid;

import X.AbstractC03200Et;
import X.AnonymousClass029;
import X.C0C5;
import X.C42101v5;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public class PhoneIdRequestReceiver extends AbstractC03200Et {
    public C42101v5 A00;
    public final Object A01;
    public volatile boolean A02;

    public PhoneIdRequestReceiver() {
        this(0);
    }

    public PhoneIdRequestReceiver(int i) {
        this.A02 = false;
        this.A01 = new Object();
    }

    @Override // X.AbstractC03200Et, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A29(this);
                    this.A02 = true;
                }
            }
        }
        super.onReceive(context, intent);
    }
}
