package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.1Ag  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC24301Ag implements Runnable {
    public final int A00;
    public final View A01;
    public final /* synthetic */ BottomSheetBehavior A02;

    public RunnableC24301Ag(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.A02 = bottomSheetBehavior;
        this.A01 = view;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        BottomSheetBehavior bottomSheetBehavior = this.A02;
        C13460lI c13460lI = bottomSheetBehavior.A0D;
        if (c13460lI == null || !c13460lI.A0B()) {
            bottomSheetBehavior.A0M(this.A00);
        } else {
            this.A01.postOnAnimation(this);
        }
    }
}
