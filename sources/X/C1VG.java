package X;

import android.util.Log;

/* renamed from: X.1VG  reason: invalid class name */
/* loaded from: classes.dex */
public class C1VG extends AbstractC16430qO {
    public int A00;

    public C1VG(int loggingLevel) {
        this.A00 = loggingLevel;
    }

    @Override // X.AbstractC16430qO
    public void A02(String tag, String message, Throwable... throwables) {
        if (this.A00 <= 3) {
            if (throwables.length >= 1) {
                Log.d(tag, message, throwables[0]);
            } else {
                Log.d(tag, message);
            }
        }
    }

    @Override // X.AbstractC16430qO
    public void A03(String tag, String message, Throwable... throwables) {
        if (this.A00 <= 6) {
            if (throwables.length >= 1) {
                Log.e(tag, message, throwables[0]);
            } else {
                Log.e(tag, message);
            }
        }
    }

    @Override // X.AbstractC16430qO
    public void A04(String tag, String message, Throwable... throwables) {
        if (this.A00 <= 4) {
            if (throwables.length >= 1) {
                Log.i(tag, message, throwables[0]);
            } else {
                Log.i(tag, message);
            }
        }
    }

    @Override // X.AbstractC16430qO
    public void A05(String tag, String message, Throwable... throwables) {
        if (this.A00 <= 5) {
            if (throwables.length >= 1) {
                Log.w(tag, message, throwables[0]);
            } else {
                Log.w(tag, message);
            }
        }
    }
}
