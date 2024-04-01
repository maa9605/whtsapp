package X;

import android.graphics.Rect;
import android.view.View;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.0Y1 */
/* loaded from: classes.dex */
public abstract class C0Y1 {
    public int A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    public final Rect A01 = new Rect();
    public final C0SV A02;

    public abstract int A01();

    public abstract int A02();

    public abstract int A03();

    public abstract int A04();

    public abstract int A05();

    public abstract int A06();

    public abstract int A07();

    public abstract int A08(View view);

    public abstract int A09(View view);

    public abstract int A0A(View view);

    public abstract int A0B(View view);

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract void A0E(int i);

    public C0Y1(C0SV c0sv) {
        this.A02 = c0sv;
    }

    public static C0Y1 A00(C0SV c0sv, int i) {
        if (i != 0) {
            if (i == 1) {
                return new C1UP(c0sv);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new C1UO(c0sv);
    }
}
