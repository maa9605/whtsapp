package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.storage.StorageUsageMediaPreviewView;

/* renamed from: X.2ZG  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2ZG extends LinearLayout implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public C2ZG(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        if (!this.A01) {
            this.A01 = true;
            ((AbstractC07960aN) generatedComponent()).A2l((StorageUsageMediaPreviewView) this);
        }
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
