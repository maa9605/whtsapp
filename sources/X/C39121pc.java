package X;

import android.content.Context;

/* renamed from: X.1pc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C39121pc extends C1YV implements InterfaceC20550xi {
    public C08T A00;
    public final C1YW A01;

    public C39121pc(Context context) {
        super(context);
        this.A01 = new C1YW(this);
    }

    @Override // X.C1YV
    public void A03(boolean z, int i, int i2, int i3, int i4) {
        C08T c08t = this.A00;
        if (c08t != null) {
            this.A01.A02(c08t);
        }
        C1YV.A00(this);
    }

    @Override // android.view.View
    public void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
    }

    @Override // android.view.View
    public void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C08T c08t = this.A00;
        if (c08t == null) {
            setMeasuredDimension(0, 0);
        } else {
            setMeasuredDimension(c08t.A02.A04.width(), this.A00.A02.A04.height());
        }
    }

    @Override // X.InterfaceC20550xi
    public void setRenderTree(C08T c08t) {
        if (this.A00 == c08t) {
            return;
        }
        if (c08t == null) {
            this.A01.A01();
        }
        this.A00 = c08t;
        requestLayout();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
    }
}
