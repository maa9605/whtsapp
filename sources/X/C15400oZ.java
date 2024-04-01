package X;

import android.view.View;

/* renamed from: X.0oZ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15400oZ {
    public C15380oX A00 = new C15380oX();
    public final InterfaceC15390oY A01;

    public C15400oZ(InterfaceC15390oY interfaceC15390oY) {
        this.A01 = interfaceC15390oY;
    }

    public View A00(int i, int i2, int i3, int i4) {
        InterfaceC15390oY interfaceC15390oY = this.A01;
        int ABt = interfaceC15390oY.ABt();
        int ABs = interfaceC15390oY.ABs();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View A8p = interfaceC15390oY.A8p(i);
            int A8s = interfaceC15390oY.A8s(A8p);
            int A8r = interfaceC15390oY.A8r(A8p);
            C15380oX c15380oX = this.A00;
            c15380oX.A04 = ABt;
            c15380oX.A03 = ABs;
            c15380oX.A02 = A8s;
            c15380oX.A01 = A8r;
            c15380oX.A00 = 0;
            c15380oX.A00 = i3 | 0;
            if (c15380oX.A00()) {
                return A8p;
            }
            if (i4 != 0) {
                c15380oX.A00 = 0;
                c15380oX.A00 = i4 | 0;
                if (c15380oX.A00()) {
                    view = A8p;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean A01(View view) {
        C15380oX c15380oX = this.A00;
        InterfaceC15390oY interfaceC15390oY = this.A01;
        int ABt = interfaceC15390oY.ABt();
        int ABs = interfaceC15390oY.ABs();
        int A8s = interfaceC15390oY.A8s(view);
        int A8r = interfaceC15390oY.A8r(view);
        c15380oX.A04 = ABt;
        c15380oX.A03 = ABs;
        c15380oX.A02 = A8s;
        c15380oX.A01 = A8r;
        C15380oX c15380oX2 = this.A00;
        c15380oX2.A00 = 0;
        c15380oX2.A00 = 24579;
        return c15380oX2.A00();
    }
}
