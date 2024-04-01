package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.3La  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3La extends C2HK {
    public double A00;
    public double A01;
    public float A02;
    public Picture A03;
    public Picture A04;
    public String A05;
    public String A06;
    public boolean A07;
    public C30Q[] A08;
    public C30Q[] A09;
    public final Paint A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final TextPaint A0E;
    public final C30T A0F;
    public final C30U A0G;
    public final C30V A0H;
    public final boolean A0I;

    public C3La(Context context, C002301c c002301c, JSONObject jSONObject) {
        this(context, c002301c, false, context.getString(R.string.attach_location));
        super.A0B(jSONObject);
        this.A00 = jSONObject.getDouble("latitude");
        this.A01 = jSONObject.getDouble("longitude");
        this.A06 = jSONObject.getString("Location");
        this.A05 = jSONObject.getString("displayLocation");
        this.A07 = jSONObject.getBoolean("theme");
        A0H();
        RectF rectF = super.A03;
        float width = rectF.width();
        float height = rectF.height();
        float f = rectF.left;
        float f2 = rectF.top;
        rectF.set(f, f2, width + f, height + f2);
        rectF.sort();
    }

    public C3La(Context context, C002301c c002301c, boolean z, String str) {
        super(context);
        this.A0B = new Paint(1);
        this.A0A = new Paint(1);
        this.A0D = new Paint(1);
        this.A0C = new Paint(1);
        this.A0E = new TextPaint(1);
        this.A07 = false;
        this.A0F = new C30T() { // from class: X.3HY
            @Override // X.C30T
            public void A01() {
                C3La c3La = C3La.this;
                c3La.A07 = !c3La.A07;
                super.A01();
            }
        };
        this.A0I = z;
        Context context2 = ((C2HK) this).A00;
        Picture A00 = C2HK.A00(context2, Build.VERSION.SDK_INT >= 21 ? "ic_content_sticker_location_60_percent_black.svg" : "ic_content_sticker_location_black.svg");
        if (A00 != null) {
            this.A03 = A00;
            Picture A002 = C2HK.A00(context2, "ic_content_sticker_location.svg");
            if (A002 != null) {
                this.A04 = A002;
                C000700j.A07(this.A03.getWidth() == this.A04.getWidth());
                this.A0E.setTextSize(46.0f);
                this.A0E.setTextAlign(Paint.Align.CENTER);
                this.A0E.setTypeface(C003301p.A03(context2));
                this.A06 = str;
                String upperCase = str.toUpperCase(Locale.getDefault());
                TextPaint textPaint = this.A0E;
                Picture picture = this.A04;
                this.A05 = TextUtils.ellipsize(upperCase, textPaint, ((1000.0f - (picture != null ? picture.getWidth() : 0)) - 106.0f) - 14.0f, TextUtils.TruncateAt.END).toString();
                A0H();
                this.A0H = new C30V(context, c002301c);
                this.A0G = new C30U();
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.C2HI, X.C2HG
    public void A0F(RectF rectF, float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        boolean z = this.A0I;
        float f7 = z ? f5 : this.A02;
        float f8 = 130.0f;
        if (z) {
            f8 = Math.min(f5 / 3.0f, (130.0f * f5) / this.A02);
        }
        float f9 = (f5 / 2.0f) + f;
        if (!z) {
            f = f9 - (f7 / 2.0f);
        }
        float f10 = ((f6 / 2.0f) - (f8 / 2.0f)) + f2;
        RectF rectF2 = super.A03;
        rectF2.set(f, f10, f + f7, f8 + f10);
        float f11 = f5 * 2.0f;
        if (!z && f7 > f11) {
            A05(f11 / (f7 + 106.0f));
        }
        rectF2.sort();
        C30V c30v = this.A0H;
        if (c30v != null) {
            c30v.A00(rectF.width() / 1020.0f);
            return;
        }
        throw null;
    }

    @Override // X.C2HG
    public void A0G(JSONObject jSONObject) {
        super.A0G(jSONObject);
        jSONObject.put("latitude", this.A00);
        jSONObject.put("longitude", this.A01);
        jSONObject.put("Location", this.A06);
        jSONObject.put("displayLocation", this.A05);
        jSONObject.put("theme", this.A07);
    }

    public final void A0H() {
        float f;
        Picture picture;
        if (this.A03 != null && (picture = this.A04) != null) {
            f = picture.getWidth() + 14.0f;
        } else {
            Log.w("Location/initThemes/Error when loading pin");
            f = 0.0f;
        }
        this.A02 = Math.max(300.0f, this.A0E.measureText(this.A05) + f + 106.0f);
        Paint paint = this.A0C;
        paint.setColor(Color.parseColor("#666666"));
        Paint paint2 = this.A0D;
        paint2.setColor(-1);
        C30Q[] c30qArr = new C30Q[6];
        this.A09 = c30qArr;
        c30qArr[0] = new C30Q(0.0f, 20.0f, this.A02, 110.0f, 20.0f, 20.0f, paint2);
        this.A09[1] = new C30Q(20.0f, 0.0f, this.A02 - 20.0f, 130.0f, 20.0f, 20.0f, paint2);
        this.A09[2] = new C30Q(10.0f, 30.0f, this.A02 - 10.0f, 100.0f, 10.0f, 10.0f, paint);
        this.A09[3] = new C30Q(30.0f, 10.0f, this.A02 - 30.0f, 120.0f, 10.0f, 10.0f, paint);
        this.A09[4] = new C30Q(15.0f, 35.0f, this.A02 - 15.0f, 95.0f, 6.0f, 6.0f, paint2);
        this.A09[5] = new C30Q(35.0f, 15.0f, this.A02 - 35.0f, 115.0f, 6.0f, 6.0f, paint2);
        Paint paint3 = this.A0B;
        paint3.setColor(-16777216);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAlpha(90);
        Paint paint4 = this.A0A;
        paint4.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint4.setStyle(style);
        paint4.setColor(-1);
        paint4.setStyle(style);
        paint4.setStrokeWidth(5.0f);
        C30Q[] c30qArr2 = new C30Q[2];
        this.A08 = c30qArr2;
        c30qArr2[0] = new C30Q(0.0f, 0.0f, this.A02, 130.0f, 75.0f, 75.0f, paint3);
        this.A08[1] = new C30Q(0.0f, 0.0f, this.A02, 130.0f, 75.0f, 75.0f, paint4);
    }
}
