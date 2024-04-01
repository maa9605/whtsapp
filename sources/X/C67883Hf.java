package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.3Hf */
/* loaded from: classes2.dex */
public class C67883Hf extends C2HG {
    public static Typeface A0C;
    public static Typeface A0D;
    public static Typeface A0E;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public StaticLayout A05;
    public String A06;
    public String A07;
    public final Context A08;
    public final TextPaint A09;
    public final C002301c A0A;
    public final C40081rY A0B;

    public C67883Hf(Context context, C40081rY c40081rY, C002301c c002301c) {
        this.A09 = new TextPaint(1);
        this.A04 = 0;
        this.A08 = context;
        this.A0B = c40081rY;
        this.A0A = c002301c;
        super.A02.setStyle(Paint.Style.FILL);
    }

    public C67883Hf(Context context, C40081rY c40081rY, C002301c c002301c, JSONObject jSONObject) {
        this(context, c40081rY, c002301c);
        this.A03 = jSONObject.getInt("orig-w") / 100.0f;
        this.A02 = jSONObject.getInt("orig-h") / 100.0f;
        this.A01 = 0.0f;
        A0J(jSONObject.getString("text"), jSONObject.getInt("style"));
        String str = this.A04 == 3 ? this.A07 : this.A06;
        this.A09.setTextSize(jSONObject.getInt("text-size") / 100.0f);
        this.A05 = new StaticLayout(AnonymousClass024.A09(C002701i.A0d(str, context, this.A09, c40081rY)), this.A09, ((int) this.A03) + 1, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.A01 = 0.0f;
        for (int i = 0; i < this.A05.getLineCount(); i++) {
            float lineWidth = this.A05.getLineWidth(i);
            if (lineWidth > this.A01) {
                this.A01 = lineWidth;
            }
        }
        this.A00 = this.A05.getHeight();
        super.A0B(jSONObject);
    }

    public static Typeface A00(Context context) {
        Typeface typeface = A0D;
        if (typeface == null) {
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/Oswald-Heavy.ttf");
            A0D = createFromAsset;
            return createFromAsset;
        }
        return typeface;
    }

    public static Typeface A01(Context context) {
        Typeface typeface = A0E;
        if (typeface == null) {
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/Norican-Regular.ttf");
            A0E = createFromAsset;
            return createFromAsset;
        }
        return typeface;
    }

    @Override // X.C2HG
    public void A0F(RectF rectF, float f, float f2, float f3, float f4) {
        this.A03 = Math.abs(f3 - f);
        this.A02 = Math.abs(f4 - f2);
        RectF rectF2 = super.A03;
        rectF2.set(f, f2, f3, f4);
        rectF2.sort();
        A0H();
    }

    @Override // X.C2HG
    public void A0G(JSONObject jSONObject) {
        super.A0G(jSONObject);
        jSONObject.put("orig-w", (int) (this.A03 * 100.0f));
        jSONObject.put("orig-h", (int) (this.A02 * 100.0f));
        jSONObject.put("text", this.A06);
        jSONObject.put("text-size", (int) (this.A09.getTextSize() * 100.0f));
        jSONObject.put("style", this.A04);
    }

    public final void A0H() {
        if (TextUtils.isEmpty(this.A06)) {
            return;
        }
        String str = this.A04 == 3 ? this.A07 : this.A06;
        float f = C2HG.A06 + 1.0f;
        TextPaint textPaint = this.A09;
        textPaint.setTextSize(f);
        for (float desiredWidth = Layout.getDesiredWidth(str, textPaint); f < C2HG.A09 && desiredWidth < super.A03.width(); desiredWidth = Layout.getDesiredWidth(str, textPaint)) {
            f += 1.0f;
            textPaint.setTextSize(f);
        }
        textPaint.setTextSize(f - 1.0f);
        textPaint.setColor(super.A02.getColor());
        CharSequence A09 = AnonymousClass024.A09(C002701i.A0d(str, this.A08, textPaint, this.A0B));
        RectF rectF = super.A03;
        this.A05 = new StaticLayout(A09, textPaint, ((int) rectF.width()) + 1, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.A01 = 0.0f;
        for (int i = 0; i < this.A05.getLineCount(); i++) {
            float lineWidth = this.A05.getLineWidth(i);
            if (lineWidth > this.A01) {
                this.A01 = lineWidth;
            }
        }
        float height = this.A05.getHeight();
        this.A00 = height;
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.right;
        float f5 = rectF.bottom;
        float f6 = f2 + f4;
        float f7 = this.A01;
        float f8 = f3 + f5;
        rectF.set((f6 - f7) / 2.0f, (f8 - height) / 2.0f, (f6 + f7) / 2.0f, (f8 + height) / 2.0f);
        rectF.sort();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
        if (r9 == 1) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0I(int r9) {
        /*
            r8 = this;
            int r0 = r8.A04
            if (r0 != r9) goto L5
            return
        L5:
            r8.A04 = r9
            r0 = 3
            if (r9 != r0) goto L81
            android.text.TextPaint r1 = r8.A09
            android.content.Context r0 = r8.A08
            android.graphics.Typeface r0 = A00(r0)
            r1.setTypeface(r0)
        L15:
            r0 = 0
        L16:
            r1.setFakeBoldText(r0)
            float r1 = r8.A01
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L80
            android.graphics.RectF r5 = r8.A03
            float r7 = r5.width()
            float r0 = r8.A01
            float r7 = r7 / r0
            float r4 = r5.centerX()
            float r0 = r8.A03
            r6 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r6
            float r4 = r4 - r0
            float r3 = r5.centerY()
            float r0 = r8.A02
            float r0 = r0 / r6
            float r3 = r3 - r0
            float r0 = r5.centerX()
            float r2 = r8.A03
            float r2 = r2 / r6
            float r2 = r2 + r0
            float r1 = r5.centerY()
            float r0 = r8.A02
            float r0 = r0 / r6
            float r0 = r0 + r1
            r5.set(r4, r3, r2, r0)
            r8.A0H()
            float r4 = r5.centerX()
            float r0 = r5.width()
            float r0 = r0 * r7
            float r0 = r0 / r6
            float r4 = r4 - r0
            float r3 = r5.centerY()
            float r0 = r5.height()
            float r0 = r0 * r7
            float r0 = r0 / r6
            float r3 = r3 - r0
            float r0 = r5.centerX()
            float r2 = r5.width()
            float r2 = r2 * r7
            float r2 = r2 / r6
            float r2 = r2 + r0
            float r1 = r5.centerY()
            float r0 = r5.height()
            float r0 = r0 * r7
            float r0 = r0 / r6
            float r0 = r0 + r1
            r5.set(r4, r3, r2, r0)
        L80:
            return
        L81:
            r0 = 2
            if (r9 != r0) goto L90
            android.text.TextPaint r1 = r8.A09
            android.content.Context r0 = r8.A08
            android.graphics.Typeface r0 = A01(r0)
            r1.setTypeface(r0)
            goto L15
        L90:
            android.text.TextPaint r1 = r8.A09
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            r1.setTypeface(r0)
            r0 = 1
            if (r9 != r0) goto L15
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67883Hf.A0I(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
        if (r10 == 1) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0J(java.lang.String r9, int r10) {
        /*
            r8 = this;
            java.lang.String r0 = r8.A06
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Ld
            int r0 = r8.A04
            if (r0 != r10) goto Ld
            return
        Ld:
            r8.A06 = r9
            X.01c r0 = r8.A0A
            java.util.Locale r0 = r0.A0I()
            java.lang.String r0 = r9.toUpperCase(r0)
            r8.A07 = r0
            r8.A04 = r10
            r0 = 3
            if (r10 != r0) goto L97
            android.text.TextPaint r1 = r8.A09
            android.content.Context r0 = r8.A08
            android.graphics.Typeface r0 = A00(r0)
            r1.setTypeface(r0)
        L2b:
            r0 = 0
        L2c:
            r1.setFakeBoldText(r0)
            float r1 = r8.A01
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L96
            android.graphics.RectF r5 = r8.A03
            float r7 = r5.width()
            float r0 = r8.A01
            float r7 = r7 / r0
            float r4 = r5.centerX()
            float r0 = r8.A03
            r6 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r6
            float r4 = r4 - r0
            float r3 = r5.centerY()
            float r0 = r8.A02
            float r0 = r0 / r6
            float r3 = r3 - r0
            float r0 = r5.centerX()
            float r2 = r8.A03
            float r2 = r2 / r6
            float r2 = r2 + r0
            float r1 = r5.centerY()
            float r0 = r8.A02
            float r0 = r0 / r6
            float r0 = r0 + r1
            r5.set(r4, r3, r2, r0)
            r8.A0H()
            float r4 = r5.centerX()
            float r0 = r5.width()
            float r0 = r0 * r7
            float r0 = r0 / r6
            float r4 = r4 - r0
            float r3 = r5.centerY()
            float r0 = r5.height()
            float r0 = r0 * r7
            float r0 = r0 / r6
            float r3 = r3 - r0
            float r0 = r5.centerX()
            float r2 = r5.width()
            float r2 = r2 * r7
            float r2 = r2 / r6
            float r2 = r2 + r0
            float r1 = r5.centerY()
            float r0 = r5.height()
            float r0 = r0 * r7
            float r0 = r0 / r6
            float r0 = r0 + r1
            r5.set(r4, r3, r2, r0)
        L96:
            return
        L97:
            r0 = 2
            if (r10 != r0) goto La6
            android.text.TextPaint r1 = r8.A09
            android.content.Context r0 = r8.A08
            android.graphics.Typeface r0 = A01(r0)
            r1.setTypeface(r0)
            goto L2b
        La6:
            android.text.TextPaint r1 = r8.A09
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            r1.setTypeface(r0)
            r0 = 1
            if (r10 != r0) goto L2b
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67883Hf.A0J(java.lang.String, int):void");
    }
}
