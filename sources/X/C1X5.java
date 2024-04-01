package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Message;
import com.google.android.search.verification.client.R;
import com.whatsapp.emoji.EmojiDescriptor;
import java.lang.ref.Reference;

/* renamed from: X.1X5 */
/* loaded from: classes.dex */
public class C1X5 extends AbstractC35321ix {
    public int A00;
    public int A01;
    public Path A02;
    public Drawable A03;
    public boolean A04;
    public int[] A05;
    public final /* synthetic */ C26701Kg A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1X5(C26701Kg c26701Kg, Context context) {
        super(context);
        this.A06 = c26701Kg;
        this.A00 = -1;
        this.A01 = C02160Ac.A00(context, R.color.emojiSkinToneIndicator);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A04) {
            if (this.A02 == null) {
                this.A02 = new Path();
            }
            Paint paint = this.A06.A0H;
            paint.setColor(this.A01);
            this.A02.reset();
            this.A02.moveTo((getWidth() * 9) / 10, (getHeight() * 9) / 10);
            this.A02.lineTo((getWidth() * 9) / 10, (getHeight() * 3) >> 2);
            this.A02.lineTo((getWidth() * 3) >> 2, (getHeight() * 9) / 10);
            this.A02.lineTo((getWidth() * 9) / 10, (getHeight() * 9) / 10);
            this.A02.setFillType(Path.FillType.WINDING);
            canvas.drawPath(this.A02, paint);
        }
        if (this.A03 != null) {
            int i = this.A06.A02;
            int width = (getWidth() - i) >> 1;
            int height = (getHeight() - i) >> 1;
            Drawable drawable = this.A03;
            if (drawable instanceof C43971yJ) {
                drawable.setBounds(0, 0, getWidth(), getHeight());
            } else {
                drawable.setBounds(width, height, width + i, i + height);
            }
            this.A03.draw(canvas);
        }
    }

    public void setEmoji(int[] iArr) {
        if (iArr == null) {
            this.A05 = null;
            this.A00 = -1;
            this.A03 = null;
            this.A04 = false;
            setContentDescription(null);
            return;
        }
        int A01 = EmojiDescriptor.A01(iArr);
        if (this.A00 == A01) {
            return;
        }
        this.A05 = iArr;
        this.A00 = A01;
        this.A04 = C60712uv.A03(iArr);
        this.A03 = null;
        if (A01 != 0) {
            Reference reference = (Reference) C26701Kg.A0X.get(A01);
            Drawable drawable = reference == null ? null : (Drawable) reference.get();
            this.A03 = drawable;
            if (drawable == null) {
                Message.obtain(C26701Kg.A0U, 0, A01, 0, new C26681Ke(this, new C43941yG(iArr))).sendToTarget();
            } else {
                invalidate();
            }
        }
        setContentDescription(C2CI.A00(iArr));
    }
}
