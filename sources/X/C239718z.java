package X;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.18z */
/* loaded from: classes.dex */
public class C239718z {
    public static ScheduledExecutorService A0A;
    public int A00;
    public WorkSource A01;
    public AtomicInteger A02;
    public boolean A03;
    public final int A04;
    public final Context A05;
    public final PowerManager.WakeLock A06;
    public final Object A07;
    public final String A08;
    public final Map A09;

    /* JADX WARN: Removed duplicated region for block: B:135:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C239718z(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C239718z.<init>(android.content.Context):void");
    }

    public final void A00() {
        PowerManager.WakeLock wakeLock = this.A06;
        if (wakeLock.isHeld()) {
            try {
                wakeLock.release();
            } catch (RuntimeException e) {
                if (!e.getClass().equals(RuntimeException.class)) {
                    throw e;
                }
                Log.e("WakeLock", String.valueOf(this.A08).concat(" was already released!"), e);
            }
            wakeLock.isHeld();
        }
    }
}
