package X;

import android.content.Context;

/* renamed from: X.13X  reason: invalid class name */
/* loaded from: classes.dex */
public final class C13X {
    public static C13X A01;
    public C13U A00;

    public C13X(Context context) {
        C13U A00 = C13U.A00(context);
        this.A00 = A00;
        A00.A02();
        this.A00.A03();
    }

    public static synchronized C13X A00(Context context) {
        C13X c13x;
        synchronized (C13X.class) {
            Context applicationContext = context.getApplicationContext();
            c13x = A01;
            if (c13x == null) {
                c13x = new C13X(applicationContext);
                A01 = c13x;
            }
        }
        return c13x;
    }

    public final synchronized void A01() {
        C13U c13u = this.A00;
        c13u.A01.lock();
        c13u.A00.edit().clear().apply();
        c13u.A01.unlock();
    }
}
