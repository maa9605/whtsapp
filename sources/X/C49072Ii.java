package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.search.verification.client.R;

/* renamed from: X.2Ii  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C49072Ii extends AbstractC49092Ik {
    public boolean A00;
    public final Paint A01;

    public C49072Ii(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.A01 = paint;
        paint.setStrokeWidth(context.getResources().getDimension(R.dimen.shutter_stroke_size));
        this.A01.setStyle(Paint.Style.STROKE);
        this.A01.setColor(-1);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.A00) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.A01);
        }
    }
}
