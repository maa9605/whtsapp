package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.google.android.search.verification.client.R;

/* renamed from: X.3JS  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3JS extends AbstractC658438t {
    public boolean A00;
    public final Rect A01;
    public final /* synthetic */ AbstractC48182Ef A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3JS(AbstractC48182Ef abstractC48182Ef, Context context) {
        super(context);
        this.A02 = abstractC48182Ef;
        this.A01 = new Rect();
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.A00;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        super.onDraw(canvas);
        if (this.A00) {
            Rect rect = this.A01;
            getDrawingRect(rect);
            AbstractC48182Ef abstractC48182Ef = this.A02;
            if (((AbstractC48202Eh) abstractC48182Ef).A0P) {
                rect.top = abstractC48182Ef.getPaddingTop() + rect.top;
                rect.bottom -= abstractC48182Ef.getPaddingBottom();
            } else {
                C658038p c658038p = ((AbstractC48202Eh) abstractC48182Ef).A0X;
                if (!(c658038p instanceof C68313Ja)) {
                    if (abstractC48182Ef.A16) {
                        rect.top = ((AbstractC48202Eh) abstractC48182Ef).A0C.getTop() + rect.top;
                    }
                    if (abstractC48182Ef instanceof C2XA) {
                        z = false;
                    } else {
                        z = !(abstractC48182Ef instanceof C2X7);
                    }
                    if (z) {
                        int i5 = ((AbstractC48202Eh) abstractC48182Ef).A08.top;
                        Context context = getContext();
                        if (!(c658038p instanceof C68313Ja)) {
                            i3 = context.getResources().getDimensionPixelSize(R.dimen.selection_padding_top);
                        } else {
                            i3 = 0;
                        }
                        rect.top = i5 - i3;
                        int i6 = ((AbstractC48202Eh) abstractC48182Ef).A08.bottom;
                        Context context2 = getContext();
                        if (!(c658038p instanceof C68313Ja)) {
                            i4 = Math.max(1, (int) (context2.getResources().getDisplayMetrics().density / 2.0f));
                        } else {
                            i4 = 0;
                        }
                        rect.bottom = i4 + i6;
                    } else {
                        int i7 = rect.top;
                        Context context3 = getContext();
                        if (!(c658038p instanceof C68313Ja)) {
                            i = context3.getResources().getDimensionPixelSize(R.dimen.selection_padding_top);
                        } else {
                            i = 0;
                        }
                        rect.top = i7 - i;
                        int i8 = rect.bottom;
                        Context context4 = getContext();
                        if (!(c658038p instanceof C68313Ja)) {
                            i2 = Math.max(1, (int) (context4.getResources().getDisplayMetrics().density / 2.0f));
                        } else {
                            i2 = 0;
                        }
                        rect.bottom = i2 + i8;
                    }
                }
            }
            canvas.drawRect(rect, ((AbstractC48202Eh) abstractC48182Ef).A0X.A01);
        }
    }

    public void setRowSelected(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            setSelected(z);
            invalidate();
        }
    }
}
