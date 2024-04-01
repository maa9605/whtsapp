package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: X.12Q  reason: invalid class name */
/* loaded from: classes.dex */
public interface C12Q {
    public static final C12Q A00 = new C12Q() { // from class: X.1aG
        @Override // X.C12Q
        public C224512m A6o(Looper looper, Handler.Callback callback) {
            return new C224512m(new Handler(looper, callback));
        }

        @Override // X.C12Q
        public long A7X() {
            return SystemClock.elapsedRealtime();
        }

        @Override // X.C12Q
        public long AVw() {
            return SystemClock.uptimeMillis();
        }
    };

    C224512m A6o(Looper looper, Handler.Callback callback);

    long A7X();

    long AVw();
}
