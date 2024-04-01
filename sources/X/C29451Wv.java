package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import java.io.File;
import java.util.EnumSet;

/* renamed from: X.1Wv */
/* loaded from: classes.dex */
public class C29451Wv extends C0SK {
    public float A00;
    public float A01;
    public float A02;
    public long A03;
    public Bitmap A04;
    public String A05;
    public String A06;
    public EnumSet A07;
    public boolean A08;
    public final float A09;
    public final Paint A0A;

    public C29451Wv(C0T4 c0t4) {
        super(c0t4);
        this.A0A = new Paint(1);
        this.A07 = EnumSet.noneOf(EnumC18360tc.class);
        float f = super.A06;
        this.A06 = f >= 2.0f ? "https://www.facebook.com/images/here_maps/here_maps_logo_64px.png" : "https://www.facebook.com/images/here_maps/here_maps_logo_32px.png";
        StringBuilder sb = new StringBuilder();
        sb.append(super.A09.getFilesDir().getAbsolutePath());
        this.A05 = C000200d.A0L(sb, File.separator, "copyright_logo");
        this.A09 = f * 12.0f;
        super.A03 = 5;
        super.A02 = Float.MAX_VALUE;
    }

    @Override // X.C0SK
    public void A0A() {
        C0T4 c0t4 = super.A0A;
        int height = c0t4.A0E.getHeight();
        float f = this.A09;
        this.A02 = 0 + f;
        this.A01 = ((height - c0t4.A04) - this.A00) - f;
    }

    @Override // X.C0SK
    public void A0B(Canvas canvas) {
        if (!this.A07.contains(EnumC18360tc.OSM) && this.A07.contains(EnumC18360tc.HERE)) {
            Bitmap bitmap = this.A04;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, this.A02, this.A01, this.A0A);
            } else if (this.A08 || SystemClock.uptimeMillis() - this.A03 <= 10000) {
            } else {
                this.A08 = true;
                this.A03 = SystemClock.uptimeMillis();
                C18620u2.A01(new C29441Wu(this));
            }
        }
    }
}
