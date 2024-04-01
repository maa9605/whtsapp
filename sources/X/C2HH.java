package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.whatsapp.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.2HH */
/* loaded from: classes2.dex */
public class C2HH extends C2HI {
    public float A00;
    public Boolean A01;
    public String A02;
    public String A03;
    public SimpleDateFormat A04;
    public SimpleDateFormat A05;
    public SimpleDateFormat A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Context A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final Rect A0J;
    public final C002301c A0K;
    public final C30T A0L;
    public final C30U A0M;
    public final C30V A0N;
    public final boolean A0O;
    public final C30Q[] A0P;
    public final C30Q[] A0Q;

    public C2HH(Context context, C002301c c002301c, JSONObject jSONObject) {
        this(context, c002301c, false);
        this.A01 = Boolean.valueOf(jSONObject.getBoolean("theme"));
        this.A03 = jSONObject.getString("time");
        this.A02 = jSONObject.getString("period");
        A0H();
        super.A0B(jSONObject);
    }

    public C2HH(Context context, C002301c c002301c, boolean z) {
        boolean z2;
        String str;
        this.A0D = new Paint(1);
        this.A0B = new Paint(1);
        this.A0E = new TextPaint(1);
        this.A0C = new TextPaint(1);
        this.A0H = new Paint(1);
        this.A0F = new Paint(1);
        this.A0I = new TextPaint(1);
        this.A0G = new TextPaint(1);
        this.A0P = new C30Q[2];
        this.A0Q = new C30Q[2];
        this.A0J = new Rect();
        this.A0L = new C30T() { // from class: X.3HW
            {
                C2HH.this = this;
            }

            @Override // X.C30T
            public void A01() {
                C2HH c2hh = C2HH.this;
                c2hh.A01 = Boolean.valueOf(!c2hh.A01.booleanValue());
                super.A01();
            }
        };
        this.A0A = context;
        this.A0K = c002301c;
        Locale A0I = c002301c.A0I();
        this.A06 = new SimpleDateFormat(this.A0K.A05(224), A0I);
        String A05 = this.A0K.A05(223);
        int length = A05.length();
        int i = 0;
        boolean z3 = false;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = A05.charAt(i);
            z3 = charAt == '\'' ? !z3 : z3;
            if (z3 || charAt != 'a') {
                i++;
            } else if (i != -1) {
                int i2 = i;
                while (i2 > 0) {
                    int codePointBefore = A05.codePointBefore(i2);
                    if (!Character.isSpaceChar(codePointBefore)) {
                        break;
                    }
                    i2 -= Character.charCount(codePointBefore);
                }
                int i3 = i + 1;
                while (i3 < length) {
                    int codePointAt = A05.codePointAt(i3);
                    if (codePointAt != 97 && !Character.isSpaceChar(codePointAt)) {
                        break;
                    }
                    i3 += Character.charCount(codePointAt);
                }
                if (i2 != 0) {
                    if (i3 != length) {
                        Log.e("AM/PM markers in 12-hour formats should be at one end.");
                    } else {
                        String substring = A05.substring(0, i2);
                        str = A05.substring(i2);
                        A05 = substring;
                    }
                } else {
                    String substring2 = A05.substring(i3);
                    str = A05.substring(0, i3);
                    z2 = false;
                    A05 = substring2;
                }
            }
        }
        Log.e("12-hour formats must contain AM/PM marker.");
        str = "";
        z2 = true;
        this.A05 = new SimpleDateFormat(A05, A0I);
        this.A04 = new SimpleDateFormat(str, A0I);
        if (this.A0K.A0M()) {
            this.A09 = z2;
        } else {
            String str2 = this.A04.getDateFormatSymbols().getAmPmStrings()[0];
            if (((AbstractC014907a) C07Y.A02).A01(str2, str2.length())) {
                this.A09 = !z2;
            } else {
                this.A09 = z2;
            }
        }
        this.A0O = z;
        this.A01 = Boolean.TRUE;
        this.A0H.setColor(-1);
        this.A0H.setStyle(Paint.Style.FILL);
        this.A0H.setAlpha(242);
        this.A0F.setColor(-16777216);
        this.A0F.setStyle(Paint.Style.STROKE);
        this.A0F.setAlpha(153);
        this.A0F.setStrokeWidth(5.0f);
        this.A0I.setColor(-16777216);
        this.A0I.setAlpha(179);
        this.A0I.setTextSize(62.0f);
        this.A0I.setTypeface(C003301p.A03(this.A0A));
        this.A0G.setColor(-16777216);
        this.A0G.setAlpha(179);
        this.A0G.setTextSize(40.0f);
        this.A0G.setTypeface(Typeface.DEFAULT_BOLD);
        this.A08 = true;
        this.A0D.setColor(-16777216);
        this.A0D.setStyle(Paint.Style.FILL);
        this.A0D.setAlpha(90);
        this.A0B.setColor(-1);
        this.A0B.setStyle(Paint.Style.STROKE);
        this.A0B.setStrokeWidth(5.0f);
        this.A0E.setColor(-1);
        this.A0E.setTextSize(62.0f);
        this.A0C.setColor(-1);
        this.A0C.setTextSize(40.0f);
        this.A0C.setTypeface(C003301p.A03(this.A0A));
        A0I();
        this.A0N = new C30V(context, c002301c);
        this.A0M = new C30U();
    }

    @Override // X.C2HG
    public void A0G(JSONObject jSONObject) {
        super.A0G(jSONObject);
        jSONObject.put("theme", this.A01);
        jSONObject.put("time", this.A03);
        jSONObject.put("period", this.A02);
    }

    public final void A0H() {
        float f;
        if (this.A08) {
            float measureText = this.A0I.measureText(this.A03);
            if (!this.A07) {
                f = this.A0G.measureText(this.A02);
            } else {
                f = 0.0f;
            }
            float f2 = measureText + f + 100.0f;
            this.A00 = f2;
            C30Q[] c30qArr = this.A0P;
            c30qArr[0] = new C30Q(0.0f, 0.0f, f2, 116.0f, 58.0f, 58.0f, this.A0D);
            c30qArr[1] = new C30Q(2.0f, 2.0f, this.A00 - 2.0f, 114.0f, 58.0f, 58.0f, this.A0B);
            C30Q[] c30qArr2 = this.A0Q;
            c30qArr2[0] = new C30Q(0.0f, 0.0f, this.A00, 116.0f, 29.0f, 29.0f, this.A0H);
            c30qArr2[1] = new C30Q(12.0f, 12.0f, this.A00 - 12.0f, 104.0f, 17.0f, 17.0f, this.A0F);
        }
    }

    public final void A0I() {
        Date date = new Date();
        boolean z = this.A0K.A02().A00;
        this.A07 = z;
        if (z) {
            this.A03 = this.A06.format(date);
            this.A02 = "";
        } else {
            this.A03 = this.A05.format(date);
            this.A02 = this.A04.format(date);
        }
        A0H();
    }

    public final void A0J(Canvas canvas, Paint paint, Paint paint2) {
        String str = this.A03;
        int length = str.length();
        Rect rect = this.A0J;
        paint.getTextBounds(str, 0, length, rect);
        float measureText = (this.A00 / 2.0f) - ((paint2.measureText(this.A02) + paint.measureText(this.A03)) / 2.0f);
        float height = (rect.height() >> 1) + 58;
        if (this.A07) {
            canvas.drawText(this.A03, measureText, height, paint);
        } else if (this.A09) {
            canvas.drawText(this.A03, measureText, height, paint);
            canvas.drawText(this.A02, paint.measureText(this.A03) + measureText, height, paint2);
        } else {
            canvas.drawText(this.A02, measureText, height, paint2);
            canvas.drawText(this.A03, paint2.measureText(this.A02) + measureText, height, paint);
        }
    }
}
