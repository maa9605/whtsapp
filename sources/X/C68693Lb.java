package X;

import android.content.Context;
import android.graphics.Picture;
import java.util.Random;
import org.json.JSONObject;

/* renamed from: X.3Lb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C68693Lb extends C2HK {
    public int A00;
    public int A01;
    public long A02;
    public Picture A03;
    public String A04;
    public String A05;
    public boolean A06;
    public static final int[] A08 = {-9123, -532786, -798046, -2774136, -5276073, -8629442};
    public static final int[] A09 = {-1075643, -2053484, -2973577, -4748448, -7315394, -10996439};
    public static final Random A07 = new Random();

    public C68693Lb(Context context) {
        super(context);
        this.A02 = A07.nextLong() % 1000;
        this.A01 = 0;
        super.A02.setColor(0);
    }

    public C68693Lb(Context context, JSONObject jSONObject) {
        this(context);
        this.A04 = jSONObject.getString("file");
        this.A06 = jSONObject.getBoolean("flip");
        this.A01 = jSONObject.getInt("palette");
        A0H();
        super.A0B(jSONObject);
        if (this.A03 == null) {
            throw new IllegalArgumentException("Picture was not loaded correctly");
        }
    }

    @Override // X.C2HG
    public void A0G(JSONObject jSONObject) {
        jSONObject.put("file", this.A04);
        jSONObject.put("flip", this.A06);
        jSONObject.put("palette", this.A01);
        super.A0G(jSONObject);
    }

    public final void A0H() {
        this.A03 = C2HK.A00(((C2HK) this).A00, this.A04);
        String str = this.A04;
        if ("e022.svg".equals(str)) {
            this.A00 = 1;
        } else if ("1f577.svg".equals(str)) {
            this.A00 = 2;
        } else if ("1f595.svg".equals(str)) {
            this.A00 = 3;
        } else if (!"1f337.svg".equals(str) && !"1f331.svg".equals(str)) {
        } else {
            this.A00 = 4;
        }
    }
}
