package X;

import android.content.Context;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.1CA  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CA {
    public static C1CA A05;
    public final C006802z A02 = new C006802z();
    public Boolean A00 = null;
    public Boolean A01 = null;
    public final Queue A03 = new ArrayDeque();
    public final Queue A04 = new ArrayDeque();

    public static synchronized C1CA A00() {
        C1CA c1ca;
        synchronized (C1CA.class) {
            c1ca = A05;
            if (c1ca == null) {
                c1ca = new C1CA();
                A05 = c1ca;
            }
        }
        return c1ca;
    }

    public final boolean A01(Context context) {
        Boolean bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
            this.A00 = bool;
        }
        if (!bool.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.A00.booleanValue();
    }
}
