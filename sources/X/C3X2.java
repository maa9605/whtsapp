package X;

import android.view.ViewTreeObserver;
import com.whatsapp.status.StatusPrivacyActivity;

/* renamed from: X.3X2  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3X2 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ StatusPrivacyActivity A00;

    public C3X2(StatusPrivacyActivity statusPrivacyActivity) {
        this.A00 = statusPrivacyActivity;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        StatusPrivacyActivity statusPrivacyActivity = this.A00;
        statusPrivacyActivity.A05.getViewTreeObserver().removeOnPreDrawListener(this);
        if (statusPrivacyActivity.A05.canScrollVertically(1)) {
            statusPrivacyActivity.A01.setElevation(statusPrivacyActivity.A00);
            return false;
        }
        statusPrivacyActivity.A01.setElevation(0.0f);
        return false;
    }
}
