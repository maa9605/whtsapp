package X;

import android.content.Context;
import android.view.View;
import android.widget.AbsListView;

/* renamed from: X.1in  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C35221in implements C0Z8 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C26701Kg A01;
    public final /* synthetic */ C002301c A02;
    public final /* synthetic */ C02O A03;

    @Override // X.C0Z8
    public void AMg(int i) {
    }

    @Override // X.C0Z8
    public void AMh(int i, float f, int i2) {
    }

    public C35221in(C26701Kg c26701Kg, C002301c c002301c, Context context, C02O c02o) {
        this.A01 = c26701Kg;
        this.A02 = c002301c;
        this.A00 = context;
        this.A03 = c02o;
    }

    @Override // X.C0Z8
    public void AMi(int i) {
        C26701Kg c26701Kg = this.A01;
        View findViewWithTag = c26701Kg.A0A.findViewWithTag(Integer.valueOf(c26701Kg.A00));
        if (findViewWithTag != null) {
            ((AbsListView) findViewWithTag).setOnScrollListener(null);
        }
        if (this.A02.A0M()) {
            c26701Kg.A00 = i;
        } else {
            int length = (c26701Kg.A0D.length - 1) - i;
            c26701Kg.A00 = length;
            i = length;
        }
        c26701Kg.A03(i);
        View findViewWithTag2 = c26701Kg.A0A.findViewWithTag(Integer.valueOf(c26701Kg.A00));
        if (findViewWithTag2 != null) {
            ((AbsListView) findViewWithTag2).setOnScrollListener(c26701Kg.A0K);
            findViewWithTag2.getViewTreeObserver().addOnPreDrawListener(new C1KX(this, findViewWithTag2));
        }
    }
}
