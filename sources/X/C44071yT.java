package X;

import android.graphics.Bitmap;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.1yT  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44071yT implements InterfaceC011705t {
    public static volatile C44071yT A01;
    public final C011605s A00;

    public C44071yT(C011605s c011605s, ComponentCallbacks2C011905v componentCallbacks2C011905v) {
        this.A00 = c011605s;
        componentCallbacks2C011905v.A00(this);
    }

    public void A00(String str, int i, Bitmap bitmap) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_frame_");
        sb.append(i);
        String obj = sb.toString();
        if (bitmap.isRecycled()) {
            return;
        }
        this.A00.A04().A05(obj, bitmap);
    }

    @Override // X.InterfaceC011705t
    public void AHI() {
        C011605s c011605s = this.A00;
        if (c011605s.A0J != null) {
            c011605s.A0J.A03(0);
        }
    }

    @Override // X.InterfaceC011705t
    public void AHJ() {
        C011605s c011605s = this.A00;
        if (c011605s.A0J != null) {
            c011605s.A0J.A03(SearchActionVerificationClientService.NOTIFICATION_ID);
        }
    }
}
