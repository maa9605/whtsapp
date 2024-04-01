package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.11R  reason: invalid class name */
/* loaded from: classes.dex */
public final class C11R {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final String A07;

    public C11R() {
        this.A07 = null;
        this.A01 = Float.MIN_VALUE;
        this.A00 = Float.MIN_VALUE;
        this.A05 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A04 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A03 = Float.MIN_VALUE;
        this.A06 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A02 = Float.MIN_VALUE;
    }

    public C11R(String str, float f, float f2, int i, float f3, float f4) {
        this.A07 = str;
        this.A01 = f;
        this.A00 = f2;
        this.A05 = 0;
        this.A04 = i;
        this.A03 = f3;
        this.A06 = 1;
        this.A02 = f4;
    }
}
