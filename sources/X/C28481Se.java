package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;

/* renamed from: X.1Se  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28481Se implements InterfaceC11950ic {
    public Drawable A00;
    public final /* synthetic */ CardView A01;

    public C28481Se(CardView cardView) {
        this.A01 = cardView;
    }

    public void A00(int i, int i2, int i3, int i4) {
        CardView cardView = this.A01;
        cardView.A05.set(i, i2, i3, i4);
        Rect rect = cardView.A04;
        super/*android.widget.FrameLayout*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }
}
