package X;

import android.graphics.Matrix;
import com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout;

/* renamed from: X.3H5  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3H5 {
    public final /* synthetic */ ImagePreviewContentLayout A00;

    public C3H5(ImagePreviewContentLayout imagePreviewContentLayout) {
        this.A00 = imagePreviewContentLayout;
    }

    public void A00(Matrix matrix) {
        ImagePreviewContentLayout imagePreviewContentLayout = this.A00;
        C48742Gm c48742Gm = imagePreviewContentLayout.A03;
        c48742Gm.A0H.A0A.set(matrix);
        c48742Gm.A0G.invalidate();
        imagePreviewContentLayout.invalidate();
    }

    public void A01(boolean z) {
        InterfaceC63522zv interfaceC63522zv = this.A00.A04;
        if (interfaceC63522zv != null) {
            if (z) {
                ((C67623Gf) interfaceC63522zv).A00.A09.A01();
            } else {
                ((C67623Gf) interfaceC63522zv).A00.A09.A06(true);
            }
        }
    }
}
