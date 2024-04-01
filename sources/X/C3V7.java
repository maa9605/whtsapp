package X;

import android.view.ViewTreeObserver;
import com.whatsapp.registration.ChangeNumber;

/* renamed from: X.3V7  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3V7 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChangeNumber A00;

    public C3V7(ChangeNumber changeNumber) {
        this.A00 = changeNumber;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ChangeNumber changeNumber = this.A00;
        changeNumber.A05.getViewTreeObserver().removeOnPreDrawListener(this);
        if (changeNumber.A05.canScrollVertically(1)) {
            changeNumber.A04.setElevation(changeNumber.A00);
            return false;
        }
        changeNumber.A04.setElevation(0.0f);
        return false;
    }
}
