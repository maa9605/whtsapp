package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;

/* renamed from: X.1T0  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1T0 extends AbstractC12740jz {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final PowerManager.WakeLock A03;
    public final PowerManager.WakeLock A04;

    public C1T0(Context context, ComponentName componentName) {
        super(componentName);
        this.A02 = context.getApplicationContext();
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        StringBuilder sb = new StringBuilder();
        sb.append(componentName.getClassName());
        sb.append(":launch");
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, sb.toString());
        this.A03 = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(componentName.getClassName());
        sb2.append(":run");
        PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, sb2.toString());
        this.A04 = newWakeLock2;
        newWakeLock2.setReferenceCounted(false);
    }

    @Override // X.AbstractC12740jz
    public void A00() {
        synchronized (this) {
            if (this.A01) {
                if (this.A00) {
                    this.A03.acquire(60000L);
                }
                this.A01 = false;
                this.A04.release();
            }
        }
    }

    @Override // X.AbstractC12740jz
    public void A01() {
        synchronized (this) {
            if (!this.A01) {
                this.A01 = true;
                this.A04.acquire(600000L);
                this.A03.release();
            }
        }
    }

    @Override // X.AbstractC12740jz
    public void A02() {
        synchronized (this) {
            this.A00 = false;
        }
    }

    @Override // X.AbstractC12740jz
    public void A04(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setComponent(super.A02);
        if (this.A02.startService(intent2) != null) {
            synchronized (this) {
                if (!this.A00) {
                    this.A00 = true;
                    if (!this.A01) {
                        this.A03.acquire(60000L);
                    }
                }
            }
        }
    }
}
