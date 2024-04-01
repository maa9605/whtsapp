package X;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.0X1  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0X1 {
    public abstract void A01(int i);

    public abstract void A03(Typeface typeface);

    public final void A00(final int i) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: X.0kF
            @Override // java.lang.Runnable
            public void run() {
                C0X1.this.A01(i);
            }
        });
    }

    public final void A02(final Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: X.0kE
            @Override // java.lang.Runnable
            public void run() {
                C0X1.this.A03(typeface);
            }
        });
    }
}
