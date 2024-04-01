package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: X.06T */
/* loaded from: classes.dex */
public class C06T {
    public static final C06T A02 = new C06T();
    public final Handler A00;
    public final Handler A01;

    public C06T() {
        HandlerThread handlerThread = new HandlerThread("Messages Async Commit Thread");
        handlerThread.start();
        this.A00 = new Handler(handlerThread.getLooper()) { // from class: X.06U
            @Override // android.os.Handler
            public void dispatchMessage(Message message) {
                long uptimeMillis = SystemClock.uptimeMillis();
                super.dispatchMessage(message);
                long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                if (uptimeMillis2 > 1000) {
                    StringBuilder A0P = C000200d.A0P("AsyncCommitManager/dispatching id: ");
                    A0P.append(message.arg1);
                    A0P.append(" msg:");
                    A0P.append(message.getCallback());
                    A0P.append(" took:");
                    C000200d.A1I(A0P, uptimeMillis2);
                }
            }
        };
        HandlerThread handlerThread2 = new HandlerThread("Receipt Processing Thread");
        handlerThread2.start();
        this.A01 = new Handler(handlerThread2.getLooper()) { // from class: X.06V
            @Override // android.os.Handler
            public void dispatchMessage(Message message) {
                long uptimeMillis = SystemClock.uptimeMillis();
                super.dispatchMessage(message);
                long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                if (uptimeMillis2 > 1000) {
                    StringBuilder A0P = C000200d.A0P("AsyncCommitManager/receipt/dispatching id: ");
                    A0P.append(message.arg1);
                    A0P.append(" msg:");
                    A0P.append(message.getCallback());
                    A0P.append(" took:");
                    C000200d.A1I(A0P, uptimeMillis2);
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0017, code lost:
        if (r3.A01.getLooper() == android.os.Looper.myLooper()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A00() {
        /*
            r3 = this;
            android.os.Handler r0 = r3.A00
            android.os.Looper r1 = r0.getLooper()
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r1 == r0) goto L19
            android.os.Handler r0 = r3.A01
            android.os.Looper r2 = r0.getLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            r0 = 0
            if (r2 != r1) goto L1a
        L19:
            r0 = 1
        L1a:
            X.C000700j.A07(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06T.A00():void");
    }

    public void A01(Runnable runnable, int i) {
        if (i < 52) {
            Handler handler = this.A00;
            Message obtain = Message.obtain(handler, runnable);
            obtain.arg1 = i;
            handler.sendMessage(obtain);
            return;
        }
        throw new IllegalArgumentException("Not supported TaskId");
    }
}
