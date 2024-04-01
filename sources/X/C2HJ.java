package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RectF;
import java.util.Calendar;
import org.json.JSONObject;

/* renamed from: X.2HJ */
/* loaded from: classes2.dex */
public class C2HJ extends C2HK {
    public int A00;
    public int A01;
    public Paint A02;
    public Paint A03;
    public Picture A04;
    public Picture A05;
    public C30Q A06;
    public C30Q A07;
    public C30Q A08;
    public C30Q A09;
    public Boolean A0A;
    public final RectF A0B;
    public final C002301c A0C;
    public final C30T A0D;
    public final C30U A0E;
    public final C30V A0F;
    public final boolean A0G;

    public C2HJ(Context context, C002301c c002301c, JSONObject jSONObject) {
        this(context, c002301c, false);
        this.A00 = jSONObject.getInt("hour");
        this.A01 = jSONObject.getInt("minute");
        this.A0A = Boolean.valueOf(jSONObject.getBoolean("theme"));
        super.A0B(jSONObject);
    }

    public C2HJ(Context context, C002301c c002301c, boolean z) {
        super(context);
        this.A0B = new RectF();
        this.A02 = new Paint(1);
        this.A03 = new Paint(1);
        this.A0D = new C30T() { // from class: X.3HU
            {
                C2HJ.this = this;
            }

            @Override // X.C30T
            public void A01() {
                C2HJ c2hj = C2HJ.this;
                c2hj.A0A = Boolean.valueOf(!c2hj.A0A.booleanValue());
                super.A01();
            }
        };
        this.A0C = c002301c;
        this.A0G = z;
        this.A0A = Boolean.FALSE;
        Calendar calendar = Calendar.getInstance(c002301c.A0I());
        this.A00 = calendar.get(10);
        this.A01 = calendar.get(12);
        Context context2 = ((C2HK) this).A00;
        this.A04 = C2HK.A00(context2, "clockDarkTheme.svg");
        this.A02.setColor(Color.parseColor("#ECB439"));
        this.A06 = new C30Q(190.0f, 249.0f, 398.0f, 263.0f, 7.0f, 7.0f, this.A02);
        this.A07 = new C30Q(185.0f, 251.0f, 479.0f, 261.0f, 5.0f, 5.0f, this.A02);
        this.A05 = C2HK.A00(context2, "clockLightTheme.svg");
        this.A03.setColor(Color.parseColor("#DC5842"));
        this.A08 = new C30Q(201.0f, 248.0f, 370.0f, 264.0f, 8.0f, 8.0f, this.A03);
        this.A09 = new C30Q(185.0f, 251.0f, 479.0f, 262.0f, 5.5f, 5.5f, this.A03);
        this.A0F = new C30V(context, c002301c);
        this.A0E = new C30U();
    }

    @Override // X.C2HI, X.C2HG
    public void A0F(RectF rectF, float f, float f2, float f3, float f4) {
        super.A0F(rectF, f, f2, f3, f4);
        C30V c30v = this.A0F;
        if (c30v != null) {
            c30v.A00(rectF.width() / 1020.0f);
            return;
        }
        throw null;
    }

    @Override // X.C2HG
    public void A0G(JSONObject jSONObject) {
        super.A0G(jSONObject);
        jSONObject.put("hour", this.A00);
        jSONObject.put("minute", this.A01);
        jSONObject.put("theme", this.A0A);
    }
}
