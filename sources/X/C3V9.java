package X;

import android.view.ViewTreeObserver;
import com.whatsapp.registration.ChangeNumberNotifyContacts;

/* renamed from: X.3V9  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3V9 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChangeNumberNotifyContacts A00;

    public C3V9(ChangeNumberNotifyContacts changeNumberNotifyContacts) {
        this.A00 = changeNumberNotifyContacts;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ChangeNumberNotifyContacts changeNumberNotifyContacts = this.A00;
        changeNumberNotifyContacts.A08.getViewTreeObserver().removeOnPreDrawListener(this);
        if (changeNumberNotifyContacts.A08.canScrollVertically(1)) {
            changeNumberNotifyContacts.A02.setElevation(changeNumberNotifyContacts.A00);
            return false;
        }
        changeNumberNotifyContacts.A02.setElevation(0.0f);
        return false;
    }
}
