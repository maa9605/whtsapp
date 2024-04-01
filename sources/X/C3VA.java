package X;

import android.view.ViewTreeObserver;
import com.whatsapp.registration.ChangeNumberOverview;

/* renamed from: X.3VA  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3VA implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChangeNumberOverview A00;

    public C3VA(ChangeNumberOverview changeNumberOverview) {
        this.A00 = changeNumberOverview;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ChangeNumberOverview changeNumberOverview = this.A00;
        changeNumberOverview.A02.getViewTreeObserver().removeOnPreDrawListener(this);
        if (changeNumberOverview.A02.canScrollVertically(1)) {
            changeNumberOverview.A01.setElevation(changeNumberOverview.A00);
            return false;
        }
        changeNumberOverview.A01.setElevation(0.0f);
        return false;
    }
}
