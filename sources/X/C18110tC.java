package X;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;

/* renamed from: X.0tC  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C18110tC {
    public Paint A00;
    public Paint A01;
    public C17860sn A02;
    public C17860sn A03;
    public C18020t3 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;

    public C18110tC() {
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setFlags(385);
        this.A00.setStyle(Paint.Style.FILL);
        Paint paint2 = this.A00;
        Typeface typeface = Typeface.DEFAULT;
        paint2.setTypeface(typeface);
        Paint paint3 = new Paint();
        this.A01 = paint3;
        paint3.setFlags(385);
        this.A01.setStyle(Paint.Style.STROKE);
        this.A01.setTypeface(typeface);
        this.A04 = C18020t3.A00();
    }

    public C18110tC(C18110tC c18110tC) {
        this.A05 = c18110tC.A05;
        this.A06 = c18110tC.A06;
        this.A00 = new Paint(c18110tC.A00);
        this.A01 = new Paint(c18110tC.A01);
        C17860sn c17860sn = c18110tC.A03;
        if (c17860sn != null) {
            this.A03 = new C17860sn(c17860sn);
        }
        C17860sn c17860sn2 = c18110tC.A02;
        if (c17860sn2 != null) {
            this.A02 = new C17860sn(c17860sn2);
        }
        this.A07 = c18110tC.A07;
        try {
            this.A04 = (C18020t3) c18110tC.A04.clone();
        } catch (CloneNotSupportedException e) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
            this.A04 = C18020t3.A00();
        }
    }
}
