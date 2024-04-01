package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import java.util.HashSet;

/* renamed from: X.2Xu  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2Xu extends AbstractC51762Xv {
    public int A00;
    public Drawable A01;
    public C42611w2 A02;
    public C2HT A03;
    public C67743Gr A04;
    public HashSet A05;
    public final Matrix A06;
    public final Paint A07;

    public C2Xu(Context context, C2HT c2ht, HashSet hashSet) {
        super(context);
        this.A06 = new Matrix();
        this.A07 = new Paint();
        this.A03 = c2ht;
        this.A05 = hashSet;
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.gallery_picker_preview_thumb_size);
        this.A07.setColor(-16725026);
        this.A07.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.gallery_picker_preview_selection_border));
        this.A07.setStyle(Paint.Style.STROKE);
        this.A07.setAntiAlias(true);
        setId(R.id.thumb);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    @Override // X.C51682Xk
    public Uri getUri() {
        return this.A02.A0F;
    }

    public C67743Gr getViewHolder() {
        return this.A04;
    }

    @Override // X.C51682Xk, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.A03.A06 == this || this.A05.contains(this.A02)) {
            return;
        }
        canvas.save();
        if (this.A02.A01() != 0) {
            int A01 = this.A02.A01();
            Matrix matrix = this.A06;
            matrix.setRotate(A01, getWidth() >> 1, getHeight() >> 1);
            canvas.concat(matrix);
        }
        super.onDraw(canvas);
        canvas.restore();
        Drawable drawable = this.A01;
        if (drawable != null) {
            int intrinsicHeight = drawable.getIntrinsicHeight() >> 2;
            this.A01.setBounds(intrinsicHeight, (getHeight() - this.A01.getIntrinsicHeight()) - intrinsicHeight, this.A01.getIntrinsicWidth() + intrinsicHeight, getHeight() - intrinsicHeight);
            this.A01.draw(canvas);
        }
        if (isPressed() || isSelected()) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.A07);
        }
    }

    @Override // X.C51682Xk, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.A00;
        setMeasuredDimension(i3, i3);
    }

    public void setIcon(Drawable drawable) {
        this.A01 = drawable;
    }

    public void setItem(C42611w2 c42611w2) {
        this.A02 = c42611w2;
    }

    public void setViewHolder(C67743Gr c67743Gr) {
        this.A04 = c67743Gr;
    }
}
