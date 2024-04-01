package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.0sO */
/* loaded from: classes.dex */
public class ViewTreeObserver$OnGlobalLayoutListenerC17620sO implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A01;
    public final View A02;
    public final List A03 = Collections.synchronizedList(new LinkedList());
    public boolean A00 = false;

    public ViewTreeObserver$OnGlobalLayoutListenerC17620sO(View view) {
        this.A02 = view;
        float f = view.getContext().getResources().getDisplayMetrics().density * 100.0f;
        this.A01 = (int) (f >= 0.0f ? f + 0.5f : f - 0.5f);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int height;
        C09P AA3;
        C09P AA32;
        Rect rect = new Rect();
        View view = this.A02;
        view.getWindowVisibleDisplayFrame(rect);
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            Display defaultDisplay = ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (view.getRootWindowInsets() != null) {
                defaultDisplay.getRealSize(point);
                height = point.y - view.getRootWindowInsets().getStableInsetBottom();
            } else {
                defaultDisplay.getSize(point);
                height = point.y;
            }
        } else if (i >= 21) {
            Display defaultDisplay2 = ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
            Point point2 = new Point();
            defaultDisplay2.getSize(point2);
            height = point2.y;
        } else {
            height = view.getRootView().getHeight();
        }
        int i2 = height - rect.bottom;
        boolean z = this.A00;
        if (!z && i2 > this.A01) {
            this.A00 = true;
            List<C1WO> list = this.A03;
            synchronized (list) {
                for (C1WO c1wo : list) {
                    if (c1wo != null && (AA32 = c1wo.A02.AA3(C17500sC.A01)) != null) {
                        C25031Du.A00(c1wo.A01.A00, AA32, new C021109r(new ArrayList()), c1wo.A00);
                    }
                }
            }
        } else if (z) {
            int i3 = this.A01;
            if (i2 > i3) {
                List list2 = this.A03;
                synchronized (list2) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            } else if (i2 < i3) {
                this.A00 = false;
                List<C1WO> list3 = this.A03;
                synchronized (list3) {
                    for (C1WO c1wo2 : list3) {
                        if (c1wo2 != null && (AA3 = c1wo2.A02.AA3(C17500sC.A00)) != null) {
                            C25031Du.A00(c1wo2.A01.A00, AA3, new C021109r(new ArrayList()), c1wo2.A00);
                        }
                    }
                }
            }
        }
    }
}
