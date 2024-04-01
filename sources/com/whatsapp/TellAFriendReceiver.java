package com.whatsapp;

import X.AnonymousClass011;
import X.AnonymousClass024;
import X.AnonymousClass029;
import X.C01B;
import X.C01C;
import X.C0C5;
import X.C36561l0;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes.dex */
public class TellAFriendReceiver extends BroadcastReceiver {
    public C01B A00;
    public AnonymousClass011 A01;
    public final Object A02;
    public volatile boolean A03;

    public TellAFriendReceiver() {
        this(0);
    }

    public TellAFriendReceiver(int i) {
        this.A03 = false;
        this.A02 = new Object();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A1x(this);
                    this.A03 = true;
                }
            }
        }
        if (Build.VERSION.SDK_INT < 22) {
            return;
        }
        String packageName = ((ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT")).getPackageName();
        if (!AnonymousClass024.A0j(packageName) && this.A00.A0E(C01C.A1B)) {
            C36561l0 c36561l0 = new C36561l0();
            c36561l0.A00 = 2;
            c36561l0.A01 = Integer.valueOf(intent.getIntExtra("extra_invite_source", 0));
            c36561l0.A02 = packageName;
            this.A01.A0B(c36561l0, null, false);
        }
    }
}
