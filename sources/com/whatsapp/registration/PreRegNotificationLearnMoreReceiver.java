package com.whatsapp.registration;

import X.AnonymousClass029;
import X.C000500h;
import X.C005102h;
import X.C018308n;
import X.C0C5;
import X.C40071rX;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public class PreRegNotificationLearnMoreReceiver extends BroadcastReceiver {
    public C018308n A00;
    public C005102h A01;
    public C000500h A02;
    public C40071rX A03;
    public final Object A04;
    public volatile boolean A05;

    public PreRegNotificationLearnMoreReceiver() {
        this(0);
    }

    public PreRegNotificationLearnMoreReceiver(int i) {
        this.A05 = false;
        this.A04 = new Object();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.A05) {
            synchronized (this.A04) {
                if (!this.A05) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A2B(this);
                    this.A05 = true;
                }
            }
        }
        this.A00.A06(context, new Intent("android.intent.action.VIEW", this.A03.A03("general", "30035737", null)).setFlags(268435456));
        this.A02.A0g(false);
        this.A01.A05(null, 20);
    }
}
