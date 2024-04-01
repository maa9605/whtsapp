package com.whatsapp;

import X.AnonymousClass029;
import X.C000200d;
import X.C000500h;
import X.C03080Ec;
import X.C03090Ed;
import X.C05G;
import X.C0C5;
import X.C40301ry;
import X.C42021ut;
import X.C42031uu;
import X.RunnableC07180Xe;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.whatsapp.util.Log;

/* loaded from: classes.dex */
public class BootReceiver extends BroadcastReceiver {
    public C000500h A00;
    public C40301ry A01;
    public C03080Ec A02;
    public C03090Ed A03;
    public C42031uu A04;
    public C42021ut A05;
    public C05G A06;
    public final Object A07;
    public volatile boolean A08;

    public BootReceiver() {
        this(0);
    }

    public BootReceiver(int i) {
        this.A08 = false;
        this.A07 = new Object();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.A08) {
            synchronized (this.A07) {
                if (!this.A08) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A1u(this);
                    this.A08 = true;
                }
            }
        }
        if (intent != null && "android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            Log.i("boot complete");
            C000200d.A0g(this.A00, "logins_with_messages", 0);
            if (!this.A06.A02()) {
                Process.killProcess(Process.myPid());
                return;
            }
            this.A01.A04();
            this.A02.A05(true);
            C03090Ed c03090Ed = this.A03;
            c03090Ed.A0A.AS1(new RunnableC07180Xe(c03090Ed));
            this.A05.A01();
            this.A04.A02();
        }
    }
}
