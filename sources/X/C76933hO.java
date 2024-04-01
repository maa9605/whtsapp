package X;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.WaEditText;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import java.util.List;

/* renamed from: X.3hO */
/* loaded from: classes2.dex */
public class C76933hO extends C0R7 {
    public int A00;
    public NumberEntryKeyboard A01;
    public C2YG A02;
    public List A03;

    public C76933hO(Activity activity, C2MB c2mb, AbstractC000600i abstractC000600i, C02E c02e, C000500h c000500h, InterfaceC08240b0 interfaceC08240b0, C2YG c2yg, final List list, C3NG c3ng) {
        super(activity, c2mb, abstractC000600i, c02e, c000500h, interfaceC08240b0);
        this.A02 = c2yg;
        this.A03 = list;
        NumberEntryKeyboard numberEntryKeyboard = new NumberEntryKeyboard(activity, null);
        this.A01 = numberEntryKeyboard;
        numberEntryKeyboard.A06 = c2yg;
        numberEntryKeyboard.setCustomKey(c3ng);
        this.A02.setCustomCursorEnabled(true);
        setContentView(this.A01);
        setTouchable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        setAnimationStyle(0);
        setBackgroundDrawable(new ColorDrawable(-1));
        setTouchInterceptor(new View.OnTouchListener() { // from class: X.3NE
            {
                C76933hO.this = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C76933hO c76933hO = C76933hO.this;
                List<WaEditText> list2 = list;
                if (motionEvent.getActionMasked() != 2 && motionEvent.getActionMasked() != 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    Point point = new Point(((int) x) + iArr[0], ((int) y) + iArr[1]);
                    for (WaEditText waEditText : list2) {
                        if (C0R7.A00(point, waEditText) && waEditText.A03(point)) {
                            c76933hO.A04(waEditText);
                            return true;
                        }
                    }
                    if (motionEvent.getY() < 0.0f) {
                        return true;
                    }
                }
                c76933hO.A01.A0G.onTouch(view, motionEvent);
                return false;
            }
        });
        this.A01.measure(View.MeasureSpec.makeMeasureSpec(activity.getWindowManager().getDefaultDisplay().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.A00 = this.A01.getMeasuredHeight();
    }

    @Override // X.C0R7
    public int A01(int i) {
        return this.A00;
    }

    @Override // X.C0R7, android.widget.PopupWindow
    public void dismiss() {
        this.A02.setHasFocus(false);
        super.dismiss();
    }
}
