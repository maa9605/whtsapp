package X;

import android.view.View;

/* renamed from: X.2LF  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2LF implements C0TU {
    @Override // X.C0TU
    public void AH6(View view) {
        if (!(this instanceof C2LH)) {
            if (this instanceof C2LE) {
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                return;
            }
            return;
        }
        C2LH c2lh = (C2LH) this;
        if (c2lh.A00 != 0) {
            view.setTranslationX(0.0f);
        }
        if (c2lh.A01 != 0) {
            view.setTranslationY(0.0f);
        }
    }
}
