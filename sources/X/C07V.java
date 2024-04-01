package X;

import android.content.res.ColorStateList;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.07V  reason: invalid class name */
/* loaded from: classes.dex */
public class C07V {
    public float A01;
    public float A02;
    public float A03;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public ColorStateList A0D;
    public Layout.Alignment A0E;
    public TextUtils.TruncateAt A0G;
    public C07X A0H;
    public CharSequence A0I;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public TextPaint A0F = new TextPaint(1);
    public float A05 = 1.0f;
    public float A04 = 0.0f;
    public float A00 = Float.MAX_VALUE;
    public boolean A0J = true;

    public C07V() {
        this.A0N = Build.VERSION.SDK_INT >= 28;
        this.A0L = false;
        this.A0G = null;
        this.A0M = false;
        this.A0A = Integer.MAX_VALUE;
        this.A0E = Layout.Alignment.ALIGN_NORMAL;
        this.A0H = C07Y.A01;
        this.A06 = 0;
        this.A07 = 0;
        this.A08 = 0;
        this.A0K = false;
    }

    public void A00() {
        if (this.A0K) {
            TextPaint textPaint = new TextPaint(this.A0F);
            textPaint.set(this.A0F);
            this.A0F = textPaint;
            this.A0K = false;
        }
    }

    public int hashCode() {
        int floatToIntBits = (Float.floatToIntBits(this.A02) + ((Float.floatToIntBits(this.A01) + ((((Float.floatToIntBits(this.A0F.getTextSize()) + ((this.A0F.getColor() + 31) * 31)) * 31) + (this.A0F.getTypeface() != null ? this.A0F.getTypeface().hashCode() : 0)) * 31)) * 31)) * 31;
        TextPaint textPaint = this.A0F;
        int floatToIntBits2 = (((((Float.floatToIntBits(this.A00) + ((Float.floatToIntBits(this.A04) + ((Float.floatToIntBits(this.A05) + ((((((Arrays.hashCode(textPaint.drawableState) + ((Float.floatToIntBits(textPaint.density) + ((((((Float.floatToIntBits(this.A03) + floatToIntBits) * 31) + this.A09) * 31) + textPaint.linkColor) * 31)) * 31)) * 31) + this.A0C) * 31) + this.A0B) * 31)) * 31)) * 31)) * 31) + (this.A0J ? 1 : 0)) * 31) + (this.A0N ? 1 : 0)) * 31;
        TextUtils.TruncateAt truncateAt = this.A0G;
        int hashCode = (((((floatToIntBits2 + (truncateAt != null ? truncateAt.hashCode() : 0)) * 31) + (this.A0M ? 1 : 0)) * 31) + this.A0A) * 31;
        Layout.Alignment alignment = this.A0E;
        int hashCode2 = (hashCode + (alignment != null ? alignment.hashCode() : 0)) * 31;
        C07X c07x = this.A0H;
        int hashCode3 = (Arrays.hashCode((int[]) null) + ((Arrays.hashCode((int[]) null) + ((((((hashCode2 + (c07x != null ? c07x.hashCode() : 0)) * 31) + this.A06) * 31) + this.A07) * 31)) * 31)) * 31;
        CharSequence charSequence = this.A0I;
        return hashCode3 + (charSequence != null ? charSequence.hashCode() : 0);
    }
}
