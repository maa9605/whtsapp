package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import com.whatsapp.contact.picker.BidiContactListView;

/* renamed from: X.2SH */
/* loaded from: classes2.dex */
public abstract class C2SH extends ListView implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public C2SH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!(this instanceof AbstractC51302Vw)) {
            if (this.A01) {
                return;
            }
            this.A01 = true;
            generatedComponent();
            return;
        }
        AbstractC51302Vw abstractC51302Vw = (AbstractC51302Vw) this;
        if (abstractC51302Vw.A00) {
            return;
        }
        abstractC51302Vw.A00 = true;
        ((AbstractC07960aN) abstractC51302Vw.generatedComponent()).A0j((BidiContactListView) abstractC51302Vw);
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
