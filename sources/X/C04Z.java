package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.04Z  reason: invalid class name */
/* loaded from: classes.dex */
public class C04Z {
    public static volatile C04Z A04;
    public final Handler A00;
    public final C04a A01;
    public final C04d A02;
    public final C04c A03;

    public C04Z(final C04a c04a, C04c c04c, C04d c04d) {
        this.A01 = c04a;
        this.A03 = c04c;
        this.A02 = c04d;
        HandlerThread handlerThread = new HandlerThread("SQL Logger");
        handlerThread.start();
        final Looper looper = handlerThread.getLooper();
        this.A00 = new Handler(looper) { // from class: X.04e
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                synchronized (c04a) {
                }
            }
        };
    }

    public static C04Z A00() {
        if (A04 == null) {
            synchronized (C04Z.class) {
                if (A04 == null) {
                    if (C04a.A01 == null) {
                        synchronized (C04a.class) {
                            if (C04a.A01 == null) {
                                C04a.A01 = new C04a(AnonymousClass011.A00());
                            }
                        }
                    }
                    C04a c04a = C04a.A01;
                    if (C04c.A00 == null) {
                        synchronized (C04c.class) {
                            if (C04c.A00 == null) {
                                C04c.A00 = new C04c();
                            }
                        }
                    }
                    C04c c04c = C04c.A00;
                    if (C04d.A00 == null) {
                        synchronized (C04d.class) {
                            if (C04d.A00 == null) {
                                C04d.A00 = new C04d();
                            }
                        }
                    }
                    A04 = new C04Z(c04a, c04c, C04d.A00);
                }
            }
        }
        return A04;
    }
}
