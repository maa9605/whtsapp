package X;

import android.view.View;

/* renamed from: X.1M3  reason: invalid class name */
/* loaded from: classes.dex */
public class C1M3 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public C1M3(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        this.A06 = iArr[0];
        this.A07 = iArr[1];
        this.A02 = view.getTranslationX();
        this.A03 = view.getTranslationY();
        this.A00 = view.getScaleX();
        this.A01 = view.getScaleY();
        this.A05 = view.getWidth();
        this.A04 = view.getHeight();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1M3) {
            C1M3 c1m3 = (C1M3) obj;
            return c1m3.A02 == this.A02 && c1m3.A03 == this.A03 && c1m3.A00 == this.A00 && c1m3.A01 == this.A01 && c1m3.A05 == this.A05 && c1m3.A04 == this.A04 && c1m3.A06 == this.A06 && c1m3.A07 == this.A07;
        }
        return false;
    }
}
