package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1UP  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1UP extends C0Y1 {
    public C1UP(C0SV c0sv) {
        super(c0sv);
    }

    @Override // X.C0Y1
    public int A01() {
        return this.A02.A00;
    }

    @Override // X.C0Y1
    public int A02() {
        C0SV c0sv = this.A02;
        return c0sv.A00 - c0sv.A0C();
    }

    @Override // X.C0Y1
    public int A03() {
        return this.A02.A0C();
    }

    @Override // X.C0Y1
    public int A04() {
        return this.A02.A01;
    }

    @Override // X.C0Y1
    public int A05() {
        return this.A02.A04;
    }

    @Override // X.C0Y1
    public int A06() {
        return this.A02.A0F();
    }

    @Override // X.C0Y1
    public int A07() {
        C0SV c0sv = this.A02;
        return (c0sv.A00 - c0sv.A0F()) - c0sv.A0C();
    }

    @Override // X.C0Y1
    public int A08(View view) {
        return C0SV.A02(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
    }

    @Override // X.C0Y1
    public int A09(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        Rect rect = ((C15170oC) view.getLayoutParams()).A03;
        return view.getMeasuredHeight() + rect.top + rect.bottom + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // X.C0Y1
    public int A0A(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        Rect rect = ((C15170oC) view.getLayoutParams()).A03;
        return view.getMeasuredWidth() + rect.left + rect.right + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    @Override // X.C0Y1
    public int A0B(View view) {
        return C0SV.A05(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
    }

    @Override // X.C0Y1
    public int A0C(View view) {
        C0SV c0sv = this.A02;
        Rect rect = this.A01;
        c0sv.A0P(view, rect);
        return rect.bottom;
    }

    @Override // X.C0Y1
    public int A0D(View view) {
        C0SV c0sv = this.A02;
        Rect rect = this.A01;
        c0sv.A0P(view, rect);
        return rect.top;
    }

    @Override // X.C0Y1
    public void A0E(int i) {
        this.A02.A0s(i);
    }
}
