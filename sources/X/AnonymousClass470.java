package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.whatsapp.camera.litecamera.LiteCameraView;

/* renamed from: X.470  reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass470 extends FrameLayout implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AnonymousClass470(Context context) {
        super(context);
        if (this.A01) {
            return;
        }
        this.A01 = true;
        ((AbstractC07960aN) generatedComponent()).A0X((LiteCameraView) this);
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
