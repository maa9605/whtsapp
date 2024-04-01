package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.search.verification.client.R;

/* renamed from: X.0gl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C10860gl {
    public View A01;
    public PopupWindow.OnDismissListener A02;
    public C1Rx A03;
    public C0VF A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final C06650Uk A0A;
    public final boolean A0B;
    public int A00 = 8388611;
    public final PopupWindow.OnDismissListener A09 = new PopupWindow.OnDismissListener() { // from class: X.0gk
        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C10860gl.this.A02();
        }
    };

    public C10860gl(Context context, C06650Uk c06650Uk, View view, boolean z, int i, int i2) {
        this.A08 = context;
        this.A0A = c06650Uk;
        this.A01 = view;
        this.A0B = z;
        this.A06 = i;
        this.A07 = i2;
    }

    public C1Rx A00() {
        C1Rx c1Rx = this.A03;
        if (c1Rx == null) {
            Context context = this.A08;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                c1Rx = new View$OnKeyListenerC38261np(context, this.A01, this.A06, this.A07, this.A0B);
            } else {
                c1Rx = new View$OnKeyListenerC38281nr(context, this.A0A, this.A01, this.A06, this.A07, this.A0B);
            }
            c1Rx.A06(this.A0A);
            c1Rx.A05(this.A09);
            c1Rx.A04(this.A01);
            c1Rx.ASo(this.A04);
            c1Rx.A07(this.A05);
            c1Rx.A01(this.A00);
            this.A03 = c1Rx;
        }
        return c1Rx;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r1 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01() {
        /*
            r2 = this;
            X.1Rx r0 = r2.A03
            if (r0 == 0) goto Lb
            boolean r1 = r0.AFo()
            r0 = 1
            if (r1 != 0) goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L13
            X.1Rx r0 = r2.A03
            r0.dismiss()
        L13:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10860gl.A01():void");
    }

    public void A02() {
        this.A03 = null;
        PopupWindow.OnDismissListener onDismissListener = this.A02;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void A03(int i, int i2, boolean z, boolean z2) {
        C1Rx A00 = A00();
        A00.A08(z2);
        if (z) {
            if ((C07O.A01(this.A00, C0AT.A05(this.A01)) & 7) == 5) {
                i -= this.A01.getWidth();
            }
            A00.A02(i);
            A00.A03(i2);
            int i3 = (int) ((this.A08.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            A00.A00 = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        A00.AUa();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r1 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04() {
        /*
            r3 = this;
            X.1Rx r0 = r3.A03
            if (r0 == 0) goto Lb
            boolean r1 = r0.AFo()
            r0 = 1
            if (r1 != 0) goto Lc
        Lb:
            r0 = 0
        Lc:
            r2 = 1
            if (r0 == 0) goto L10
            return r2
        L10:
            android.view.View r1 = r3.A01
            r0 = 0
            if (r1 != 0) goto L16
            return r0
        L16:
            r3.A03(r0, r0, r0, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10860gl.A04():boolean");
    }
}
