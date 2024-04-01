package X;

import android.app.Activity;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.PopupWindow;
import com.whatsapp.WaEditText;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0R7 */
/* loaded from: classes.dex */
public abstract class C0R7 extends PopupWindow {
    public int A00;
    public int A01;
    public final Activity A02;
    public final AbstractC000600i A03;
    public final InterfaceC08240b0 A04;
    public final C02E A05;
    public final C000500h A06;
    public final C2MB A07;
    public final Runnable A08;
    public final Set A09;

    public abstract int A01(int i);

    public C0R7(Activity activity, C2MB c2mb, AbstractC000600i abstractC000600i, C02E c02e, C000500h c000500h, final InterfaceC08240b0 interfaceC08240b0) {
        super(activity);
        this.A01 = -1;
        this.A00 = 0;
        this.A02 = activity;
        this.A07 = c2mb;
        this.A03 = abstractC000600i;
        this.A05 = c02e;
        this.A06 = c000500h;
        this.A04 = interfaceC08240b0;
        this.A09 = new HashSet();
        this.A08 = new Runnable() { // from class: X.1HW
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC08240b0 interfaceC08240b02 = interfaceC08240b0;
                interfaceC08240b02.unlock();
                ((View) interfaceC08240b02).requestLayout();
            }
        };
    }

    public static boolean A00(Point point, View view) {
        int i;
        int i2;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = point.x;
        int i4 = iArr[0];
        return i3 >= i4 && i3 <= view.getWidth() + i4 && (i = point.y) >= (i2 = iArr[1]) && i <= view.getHeight() + i2;
    }

    public void A02() {
        this.A01 = A01(-1);
    }

    public final void A03(InterfaceC26781Kq interfaceC26781Kq, Runnable runnable, WaEditText waEditText) {
        InputMethodManager A0I = this.A05.A0I();
        waEditText.requestFocus();
        Handler handler = new Handler(Looper.getMainLooper());
        Set set = this.A09;
        if (interfaceC26781Kq.A5r(A0I, new ResultReceiverC26791Kr(handler, runnable, set))) {
            return;
        }
        InterfaceC08240b0 interfaceC08240b0 = this.A04;
        interfaceC08240b0.unlock();
        ((View) interfaceC08240b0).requestLayout();
        set.remove(runnable);
    }

    public void A04(final WaEditText waEditText) {
        InterfaceC08240b0 interfaceC08240b0 = this.A04;
        ((View) interfaceC08240b0).getHandler().removeCallbacks(this.A08);
        interfaceC08240b0.lock();
        dismiss();
        if (waEditText != null) {
            interfaceC08240b0.A6B();
            A03(new InterfaceC26781Kq() { // from class: X.1hR
                @Override // X.InterfaceC26781Kq
                public final boolean A5r(InputMethodManager inputMethodManager, ResultReceiver resultReceiver) {
                    return inputMethodManager.showSoftInput(waEditText, 0, resultReceiver);
                }
            }, new Runnable() { // from class: X.1HV
                {
                    C0R7.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0R7 c0r7 = C0R7.this;
                    ((View) c0r7.A04).postDelayed(c0r7.A08, 100L);
                }
            }, waEditText);
        }
    }

    public boolean A05() {
        return Build.VERSION.SDK_INT >= 24 && this.A02.isInMultiWindowMode();
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        if (isShowing()) {
            A02();
            super.dismiss();
            InterfaceC08240b0 interfaceC08240b0 = this.A04;
            interfaceC08240b0.A6B();
            ((View) interfaceC08240b0).requestLayout();
        }
    }
}
