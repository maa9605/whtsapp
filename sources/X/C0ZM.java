package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.HomeActivity;

/* renamed from: X.0ZM  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0ZM extends ViewPager implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public C0ZM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (this.A01) {
            return;
        }
        this.A01 = true;
        ((AbstractC07960aN) generatedComponent()).A0A((HomeActivity.TabsPager) this);
    }

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        C2UB c2ub = this.A00;
        if (c2ub == null) {
            c2ub = new C2UB(this);
            this.A00 = c2ub;
        }
        return c2ub.generatedComponent();
    }
}
