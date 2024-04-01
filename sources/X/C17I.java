package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.17I  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C17I {
    public static volatile Handler A03;
    public final AnonymousClass176 A00;
    public final Runnable A01;
    public volatile long A02;

    public C17I(AnonymousClass176 anonymousClass176) {
        C07K.A1P(anonymousClass176);
        this.A00 = anonymousClass176;
        this.A01 = new Runnable() { // from class: X.17J
            @Override // java.lang.Runnable
            public final void run() {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    C13H c13h = C17I.this.A00.A02;
                    C07K.A1P(c13h);
                    C07K.A1P(this);
                    c13h.A02.submit(this);
                    return;
                }
                C17I c17i = C17I.this;
                boolean z = c17i.A02 != 0;
                c17i.A02 = 0L;
                if (z) {
                    c17i.A01();
                }
            }
        };
    }

    public abstract void A01();

    public final Handler A00() {
        Handler handler;
        if (A03 != null) {
            return A03;
        }
        synchronized (C17I.class) {
            if (A03 == null) {
                A03 = new HandlerC235317c(this.A00.A00.getMainLooper());
            }
            handler = A03;
        }
        return handler;
    }

    public final void A02(long j) {
        this.A02 = 0L;
        Handler A00 = A00();
        Runnable runnable = this.A01;
        A00.removeCallbacks(runnable);
        if (j >= 0) {
            AnonymousClass176 anonymousClass176 = this.A00;
            if (anonymousClass176.A03 != null) {
                this.A02 = System.currentTimeMillis();
                if (!A00().postDelayed(runnable, j)) {
                    C39851qp c39851qp = anonymousClass176.A07;
                    AnonymousClass176.A01(c39851qp);
                    c39851qp.A09("Failed to schedule delayed post. time", Long.valueOf(j));
                    return;
                }
                return;
            }
            throw null;
        }
    }
}
