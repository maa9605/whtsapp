package com.whatsapp.camera;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes2.dex */
public class CameraBottomSheetBehavior extends BottomSheetBehavior {
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC08910cJ
    public void A05(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        if (this.A0B == 4) {
            return;
        }
        super.A05(coordinatorLayout, view, view2, i);
    }
}
