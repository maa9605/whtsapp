package X;

import android.graphics.drawable.Drawable;
import com.google.android.search.verification.client.R;

/* renamed from: X.3p1  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81513p1 implements InterfaceC59442sl {
    public final /* synthetic */ C018508q A00;

    @Override // X.InterfaceC59442sl
    public void A6D() {
    }

    @Override // X.InterfaceC59442sl
    public void AWF() {
    }

    public C81513p1(C018508q c018508q) {
        this.A00 = c018508q;
    }

    @Override // X.InterfaceC59442sl
    public void AUA(Drawable drawable) {
        if (drawable == null) {
            this.A00.A07(R.string.wallpaper_reset, 0);
        } else {
            this.A00.A07(R.string.wallpaper_set_successful, 0);
        }
    }
}
