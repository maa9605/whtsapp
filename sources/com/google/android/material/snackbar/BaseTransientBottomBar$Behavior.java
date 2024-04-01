package com.google.android.material.snackbar;

import X.C09290cz;
import X.C1BB;
import X.C1BJ;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {
    public final C1BB A00 = new C1BB(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, X.AbstractC08910cJ
    public boolean A0B(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C1BB c1bb = this.A00;
        if (c1bb != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C1BJ.A00().A03(c1bb.A00);
                }
            } else if (coordinatorLayout.A0H(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C1BJ.A00().A02(c1bb.A00);
            }
            return super.A0B(coordinatorLayout, view, motionEvent);
        }
        throw null;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public boolean A0I(View view) {
        if (this.A00 != null) {
            return view instanceof C09290cz;
        }
        throw null;
    }
}
