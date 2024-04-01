package X;

import java.util.Locale;

/* renamed from: X.2rq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C58872rq {
    public final float A00;
    public final float A01;
    public final int A02;
    public final boolean A03;

    public C58872rq(float f, float f2, int i, boolean z) {
        this.A01 = f;
        this.A00 = f2;
        this.A02 = i;
        this.A03 = z;
    }

    public String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        float f = this.A01;
        objArr[0] = Float.valueOf(f);
        float f2 = this.A00;
        objArr[1] = Float.valueOf(f2);
        objArr[2] = Float.valueOf(f2 != 0.0f ? f / f2 : -1.0f);
        objArr[3] = Integer.valueOf(this.A02);
        objArr[4] = Boolean.valueOf(this.A03);
        return String.format(locale, "aspectWidth=%f aspectHeight=%f aspectRatio=%f rowWidthPercent=%d forPortraitImage=%b", objArr);
    }
}
