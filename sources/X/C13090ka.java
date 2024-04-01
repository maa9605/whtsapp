package X;

import android.content.Context;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.0ka  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13090ka {
    public final InterfaceC13070kY A00;

    public C13090ka(final Context context, final GestureDetector.OnGestureListener onGestureListener) {
        if (Build.VERSION.SDK_INT > 17) {
            this.A00 = new InterfaceC13070kY(context, onGestureListener) { // from class: X.1TM
                public final GestureDetector A00;

                {
                    this.A00 = new GestureDetector(context, onGestureListener, null);
                }

                @Override // X.InterfaceC13070kY
                public boolean APj(MotionEvent motionEvent) {
                    return this.A00.onTouchEvent(motionEvent);
                }

                @Override // X.InterfaceC13070kY
                public void ATD(boolean z) {
                    this.A00.setIsLongpressEnabled(z);
                }
            };
        } else {
            this.A00 = new C1TL(context, onGestureListener);
        }
    }
}
