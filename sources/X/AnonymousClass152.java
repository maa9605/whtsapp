package X;

import android.content.Context;
import android.content.ServiceConnection;

/* renamed from: X.152  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass152 {
    public static AnonymousClass152 A00;
    public static final Object A01 = new Object();

    public abstract void A01(AnonymousClass151 anonymousClass151, ServiceConnection serviceConnection, String str);

    public abstract boolean A02(AnonymousClass151 anonymousClass151, ServiceConnection serviceConnection, String str);

    public static AnonymousClass152 A00(Context context) {
        synchronized (A01) {
            if (A00 == null) {
                A00 = new C31161bo(context.getApplicationContext());
            }
        }
        return A00;
    }
}
