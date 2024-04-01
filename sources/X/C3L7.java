package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.search.verification.client.R;
import org.json.JSONObject;

/* renamed from: X.3L7 */
/* loaded from: classes2.dex */
public class C3L7 extends C2HI {
    public int A00;
    public Drawable A01;
    public String A02;
    public String A03;
    public final Context A04;
    public final Paint A05 = new Paint(1);
    public final C43791xz A06;
    public final boolean A07;

    public C3L7(Context context, C0JM c0jm, boolean z, C43791xz c43791xz) {
        this.A04 = context;
        this.A02 = c0jm.A08;
        this.A07 = z;
        this.A00 = c0jm.A01;
        this.A03 = c0jm.A0B;
        this.A06 = c43791xz;
        A0H();
    }

    public C3L7(Context context, JSONObject jSONObject, C43791xz c43791xz) {
        this.A04 = context;
        this.A07 = jSONObject.getBoolean("anim");
        this.A06 = c43791xz;
        if (jSONObject.has("file_path") && jSONObject.has("plain_file_hash") && jSONObject.has("file_storage_location")) {
            this.A02 = jSONObject.getString("file_path");
            this.A03 = jSONObject.getString("plain_file_hash");
            this.A00 = jSONObject.getInt("file_storage_location");
            A0H();
        }
        super.A0B(jSONObject);
        if (this.A01 == null) {
            throw new IllegalArgumentException("loadedDrawable was not loaded correctly");
        }
    }

    @Override // X.C2HG
    public void A0G(JSONObject jSONObject) {
        super.A0G(jSONObject);
        String str = this.A02;
        if (str != null && this.A03 != null) {
            jSONObject.put("file_path", str);
            jSONObject.put("plain_file_hash", this.A03);
            jSONObject.put("file_storage_location", this.A00);
        }
        jSONObject.put("anim", this.A07);
    }

    public final void A0H() {
        Context context = this.A04;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_grid_size);
        String str = this.A02;
        if (str != null) {
            String str2 = this.A03;
            if (str2 != null) {
                C0JM c0jm = new C0JM();
                int i = this.A00;
                c0jm.A08 = str;
                c0jm.A01 = i;
                c0jm.A0B = str2;
                C43791xz c43791xz = this.A06;
                if (c43791xz != null) {
                    c43791xz.A05(null, new C82573qj(c0jm, C43791xz.A01(c0jm, dimensionPixelSize, dimensionPixelSize), dimensionPixelSize, dimensionPixelSize, context, this), null);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public final void A0I(Canvas canvas, int i, int i2) {
        RectF rectF = super.A03;
        float width = rectF.width() / i;
        float height = rectF.height() / i2;
        canvas.translate(rectF.centerX(), rectF.centerY());
        canvas.scale(width, height);
        canvas.rotate(super.A00);
        float f = (-i) / 2.0f;
        canvas.translate(f, f);
    }

    public final void A0J(Canvas canvas, C44121yY c44121yY) {
        A0I(canvas, c44121yY.getBounds().right, c44121yY.getBounds().bottom);
    }

    public void A0K(Canvas canvas, boolean z) {
        if (z && this.A07) {
            A09(canvas);
        } else if (this.A01 == null) {
        } else {
            canvas.save();
            Drawable drawable = this.A01;
            if (drawable instanceof C44121yY) {
                C44121yY c44121yY = (C44121yY) drawable;
                A0J(canvas, c44121yY);
                canvas.drawBitmap(c44121yY.A09.A09, (Rect) null, c44121yY.getBounds(), c44121yY.A03);
            } else {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                A0I(canvas, bitmapDrawable.getBitmap().getWidth(), bitmapDrawable.getBitmap().getHeight());
                bitmapDrawable.draw(canvas);
            }
            canvas.restore();
        }
    }
}
