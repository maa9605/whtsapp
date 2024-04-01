package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Build;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;

/* renamed from: X.22U  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C22U extends BroadcastReceiver {
    public final C000800k A00;
    public final C0E7 A01;
    public final AnonymousClass012 A02;
    public final C0HA A03;
    public final ExecutorC004702d A04;
    public final WhatsAppLibLoader A05;
    public volatile boolean A07 = false;
    public final Object A06 = new Object();

    public C22U(AnonymousClass012 anonymousClass012, InterfaceC002901k interfaceC002901k, C0HA c0ha, WhatsAppLibLoader whatsAppLibLoader, C0E7 c0e7, C000800k c000800k) {
        this.A02 = anonymousClass012;
        this.A03 = c0ha;
        this.A05 = whatsAppLibLoader;
        this.A01 = c0e7;
        this.A00 = c000800k;
        this.A04 = new ExecutorC004702d(interfaceC002901k, false);
    }

    public final void A00(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        if (Build.VERSION.SDK_INT >= 24) {
            intentFilter.addAction("android.net.conn.RESTRICT_BACKGROUND_CHANGED");
        }
        if (context.registerReceiver(this, intentFilter) == null) {
            Log.i("CONNECTIVITY_ACTION doesn't return a sticky intent, update voip network medium directly");
            WhatsAppLibLoader whatsAppLibLoader = this.A05;
            if (whatsAppLibLoader.A04()) {
                this.A04.execute(new RunnableEBaseShape3S0100000_I0_3(this, 21));
            }
            if (whatsAppLibLoader.A04()) {
                this.A04.execute(new RunnableEBaseShape3S0100000_I0_3(this, 20));
            }
        }
        NetworkInfo A04 = this.A01.A04();
        this.A00.A03(C05050Nc.A00(A04, this.A02.A05()));
        this.A03.A05(A04);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.A07) {
            synchronized (this.A06) {
                if (!this.A07) {
                    AnonymousClass029.A0Y(context);
                    this.A07 = true;
                }
            }
        }
        if (intent.getAction().equals("android.net.conn.RESTRICT_BACKGROUND_CHANGED")) {
            if (this.A05.A04()) {
                this.A04.execute(new RunnableEBaseShape3S0100000_I0_3(this, 20));
                return;
            }
            return;
        }
        NetworkInfo A04 = this.A01.A04();
        this.A00.A03(C05050Nc.A00(A04, this.A02.A05()));
        if (this.A05.A04()) {
            this.A04.execute(new RunnableEBaseShape3S0100000_I0_3(this, 21));
        }
        this.A03.A05(A04);
    }
}
