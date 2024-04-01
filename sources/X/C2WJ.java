package X;

import android.content.Context;
import android.graphics.Canvas;
import com.google.android.search.verification.client.R;

/* renamed from: X.2WJ  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2WJ extends C2WK {
    public int A00;

    @Override // X.AbstractC48182Ef
    public void A0I() {
    }

    @Override // X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
    }

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return 0;
    }

    @Override // X.AbstractC48202Eh, android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public C2WJ(Context context, AnonymousClass092 anonymousClass092) {
        super(context, anonymousClass092);
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_album_left;
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_album_right;
    }

    @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, this.A00);
    }

    public void setFixedHeight(int i) {
        this.A00 = i;
    }
}
