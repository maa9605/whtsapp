package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import java.io.File;

/* renamed from: X.2Xi */
/* loaded from: classes2.dex */
public class C51662Xi extends AbstractC51672Xj {
    public int A00;
    public Drawable A01;
    public Drawable A02;
    public Drawable A03;
    public Drawable A04;
    public Drawable A05;
    public TextPaint A06;
    public C002301c A07;
    public boolean A08;

    public C51662Xi(Context context) {
        super(context);
        this.A00 = 1;
    }

    public final TextPaint A01() {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(-1);
        textPaint.setTextSize(getContext().getResources().getDimensionPixelSize(R.dimen.media_gallery_item_text_size));
        return textPaint;
    }

    public final void A02(Canvas canvas, AbstractC53492h0 abstractC53492h0, float f) {
        File file = abstractC53492h0.A04;
        String name = file != null ? file.getName() : null;
        if (abstractC53492h0.getType() != 4 || TextUtils.isEmpty(name)) {
            return;
        }
        if (this.A06 == null) {
            this.A06 = A01();
        }
        Drawable drawable = this.A04;
        if (drawable == null) {
            drawable = C02160Ac.A03(getContext(), R.drawable.gallery_album_overlay);
            if (drawable == null) {
                throw null;
            }
            this.A04 = drawable;
        }
        drawable.setBounds(0, getHeight() - ((int) (this.A06.getTextSize() * 2.0f)), getWidth(), getHeight());
        this.A04.draw(canvas);
        TextPaint textPaint = this.A06;
        canvas.drawText(TextUtils.ellipsize(name, textPaint, f - ((textPaint.getTextSize() / 3.0f) * 2.0f), TextUtils.TruncateAt.END).toString(), this.A06.getTextSize() / 3.0f, getHeight() - (this.A06.getTextSize() / 3.0f), this.A06);
    }

    public void setDetailsLevel(int i) {
        this.A00 = i;
    }

    @Override // X.C51682Xk
    public void setMediaItem(InterfaceC52102a4 interfaceC52102a4) {
        super.setMediaItem(interfaceC52102a4);
        InterfaceC52102a4 interfaceC52102a42 = super.A04;
        if (interfaceC52102a42 instanceof AbstractC53492h0) {
            C0AT.A0e(this, C2JE.A08(((AbstractC53492h0) interfaceC52102a42).A00));
        }
    }

    public void setShowForwardScore(boolean z) {
        this.A08 = z;
    }
}
