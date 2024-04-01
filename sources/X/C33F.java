package X;

import android.graphics.Bitmap;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.33F  reason: invalid class name */
/* loaded from: classes2.dex */
public class C33F implements InterfaceC49482Kq {
    public boolean A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ CatalogMediaViewFragment A02;
    public final /* synthetic */ PhotoView A03;

    public C33F(CatalogMediaViewFragment catalogMediaViewFragment, PhotoView photoView, int i) {
        this.A02 = catalogMediaViewFragment;
        this.A03 = photoView;
        this.A01 = i;
    }

    @Override // X.InterfaceC49482Kq
    public void ALY(C40231ro c40231ro, final Bitmap bitmap, boolean z) {
        if (this.A00) {
            CatalogMediaViewFragment catalogMediaViewFragment = this.A02;
            final PhotoView photoView = this.A03;
            InterfaceC48642Gc interfaceC48642Gc = new InterfaceC48642Gc() { // from class: X.32p
                @Override // X.InterfaceC48642Gc
                public final void APt(boolean z2) {
                    ActivityC02330At A09;
                    C33F c33f = C33F.this;
                    PhotoView photoView2 = photoView;
                    Bitmap bitmap2 = bitmap;
                    if (z2 && (A09 = c33f.A02.A09()) != null && !A09.isFinishing()) {
                        photoView2.A06(bitmap2);
                    }
                }
            };
            if (!((MediaViewBaseFragment) catalogMediaViewFragment).A0E) {
                interfaceC48642Gc.APt(true);
                return;
            } else {
                ((MediaViewBaseFragment) catalogMediaViewFragment).A0A = interfaceC48642Gc;
                return;
            }
        }
        this.A00 = true;
        PhotoView photoView2 = this.A03;
        photoView2.A06(bitmap);
        CatalogMediaViewFragment catalogMediaViewFragment2 = this.A02;
        String str = catalogMediaViewFragment2.A08;
        if (str == null || !str.equals(C06960Vv.A01(catalogMediaViewFragment2.A06.A09, this.A01))) {
            return;
        }
        photoView2.post(new RunnableEBaseShape8S0100000_I1_0(catalogMediaViewFragment2.A0A(), 7));
    }
}
