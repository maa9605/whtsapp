package X;

import android.view.View;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.3IK */
/* loaded from: classes2.dex */
public class C3IK implements InterfaceC43821y3 {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ PhotoView A01;

    @Override // X.InterfaceC43821y3
    public void AKM() {
    }

    public C3IK(MediaViewFragment mediaViewFragment, PhotoView photoView) {
        this.A00 = mediaViewFragment;
        this.A01 = photoView;
    }

    @Override // X.InterfaceC43821y3
    public int ADA() {
        return this.A00.A14.A03(this.A01.getContext());
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x009b, code lost:
        if (r0 != 43) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0037, code lost:
        if (r1 != 43) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0046, code lost:
        if (r12 == null) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x003d  */
    @Override // X.InterfaceC43821y3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AUc(android.view.View r11, android.graphics.Bitmap r12, X.AnonymousClass092 r13) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3IK.AUc(android.view.View, android.graphics.Bitmap, X.092):void");
    }

    @Override // X.InterfaceC43821y3
    public void AUo(View view) {
        PhotoView photoView = this.A01;
        photoView.A0J = null;
        photoView.A04 = 0.0f;
    }
}
