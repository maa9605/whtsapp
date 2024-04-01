package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: X.1Vp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC29151Vp extends AbstractC16800r2 {
    public static final String A01 = AbstractC16430qO.A01("BrdcstRcvrCnstrntTrckr");
    public final BroadcastReceiver A00;

    public abstract IntentFilter A05();

    public abstract void A06(Context context, Intent intent);

    public AbstractC29151Vp(Context context, InterfaceC17300rs taskExecutor) {
        super(context, taskExecutor);
        this.A00 = new BroadcastReceiver() { // from class: X.0r0
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent != null) {
                    AbstractC29151Vp.this.A06(context2, intent);
                }
            }
        };
    }

    @Override // X.AbstractC16800r2
    public void A01() {
        AbstractC16430qO.A00().A02(A01, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.A01.registerReceiver(this.A00, A05());
    }

    @Override // X.AbstractC16800r2
    public void A02() {
        AbstractC16430qO.A00().A02(A01, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.A01.unregisterReceiver(this.A00);
    }
}
