package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.PopupWindow;
import com.whatsapp.KeyboardPopupLayout;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.4AQ */
/* loaded from: classes3.dex */
public class C4AQ {
    public Activity A00;
    public final AbstractC000600i A01;
    public final KeyboardPopupLayout A02;
    public final C02E A03;
    public final C000500h A04;
    public final C002301c A05;
    public final C43871y8 A06;
    public final C40081rY A07;
    public final C47682Ce A08;
    public final C2MI A09;
    public final C455822q A0A;
    public final C02O A0B;
    public final C2MB A0C;
    public final HashMap A0D = new HashMap();

    public C4AQ(C455822q c455822q, C2MB c2mb, AbstractC000600i abstractC000600i, C40081rY c40081rY, C43871y8 c43871y8, C47682Ce c47682Ce, C02E c02e, C002301c c002301c, C2MI c2mi, C000500h c000500h, C02O c02o, Activity activity, KeyboardPopupLayout keyboardPopupLayout) {
        this.A0A = c455822q;
        this.A0C = c2mb;
        this.A01 = abstractC000600i;
        this.A07 = c40081rY;
        this.A06 = c43871y8;
        this.A08 = c47682Ce;
        this.A03 = c02e;
        this.A05 = c002301c;
        this.A09 = c2mi;
        this.A04 = c000500h;
        this.A0B = c02o;
        this.A00 = activity;
        this.A02 = keyboardPopupLayout;
    }

    public void A00() {
        PopupWindow popupWindow;
        HashMap hashMap = this.A0D;
        if (!hashMap.containsKey(1) || (popupWindow = (PopupWindow) hashMap.get(1)) == null) {
            return;
        }
        popupWindow.dismiss();
    }

    public void A01() {
        View view;
        PopupWindow popupWindow;
        HashMap hashMap = this.A0D;
        for (Number number : hashMap.keySet()) {
            if (number.intValue() != 1 && (popupWindow = (PopupWindow) hashMap.get(number)) != null) {
                popupWindow.dismiss();
            }
        }
        if (hashMap.containsKey(1)) {
            C0R7 c0r7 = (C0R7) hashMap.get(1);
            if (c0r7 instanceof C76933hO) {
                C76933hO c76933hO = (C76933hO) c0r7;
                if (!c76933hO.isShowing()) {
                    Iterator it = c76933hO.A03.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            view = (View) it.next();
                            if (C2MB.A00(view)) {
                                break;
                            }
                        } else {
                            view = null;
                            break;
                        }
                    }
                    if (view != null) {
                        InterfaceC08240b0 interfaceC08240b0 = c76933hO.A04;
                        interfaceC08240b0.lock();
                        if (!c76933hO.A05.A0I().hideSoftInputFromWindow(view.getWindowToken(), 0, new ResultReceiverC26791Kr(new Handler(Looper.getMainLooper()), new RunnableEBaseShape8S0100000_I1_0(c76933hO, 45), c76933hO.A09))) {
                            interfaceC08240b0.unlock();
                            ((View) interfaceC08240b0).requestLayout();
                        }
                    } else if (!c76933hO.isShowing()) {
                        Activity activity = ((C0R7) c76933hO).A02;
                        if (activity.getCurrentFocus() != null) {
                            activity.getCurrentFocus().clearFocus();
                        }
                        c76933hO.setHeight(c76933hO.A00);
                        c76933hO.setWidth(-1);
                        InterfaceC08240b0 interfaceC08240b02 = c76933hO.A04;
                        interfaceC08240b02.setKeyboardPopup(c76933hO);
                        if (interfaceC08240b02.AFV()) {
                            View view2 = (View) interfaceC08240b02;
                            view2.getViewTreeObserver().addOnGlobalLayoutListener(new C3NL(c76933hO));
                            interfaceC08240b02.unlock();
                            view2.requestLayout();
                        } else if (!c76933hO.isShowing()) {
                            c76933hO.showAtLocation((View) interfaceC08240b02, 48, 0, 1000000);
                        }
                        c76933hO.A02.setHasFocus(true);
                    }
                }
            } else if (c0r7 instanceof C48362Ey) {
                ((C48362Ey) c0r7).A09();
            }
        }
    }

    public /* synthetic */ void A02(AnonymousClass223 anonymousClass223) {
        A00();
        this.A00.getWindow().setSoftInputMode(1);
        if (anonymousClass223.A01()) {
            anonymousClass223.A00(true);
        }
    }
}
