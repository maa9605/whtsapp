package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2N3 */
/* loaded from: classes2.dex */
public class C2N3 {
    public final C2MT A01;
    public boolean A00 = false;
    public final Set A02 = new HashSet();

    public C2N3(C2MT c2mt) {
        this.A01 = c2mt;
        if (c2mt.A00 == 0) {
            File file = new File(c2mt.A06.A00.getCacheDir(), "product_catalog_images");
            AnonymousClass336 anonymousClass336 = new AnonymousClass336(c2mt.A01);
            C66923Cy c66923Cy = new C66923Cy(c2mt.A03, c2mt.A05, c2mt.A07, c2mt.A04, c2mt.A09, c2mt.A08, file, anonymousClass336);
            c2mt.A02 = c66923Cy;
            anonymousClass336.A00 = c66923Cy;
        }
        c2mt.A00++;
    }

    public void A00() {
        C66923Cy c66923Cy;
        Set<C40231ro> set = this.A02;
        for (C40231ro c40231ro : set) {
            this.A01.A00(c40231ro);
        }
        set.clear();
        C2MT c2mt = this.A01;
        int i = c2mt.A00 - 1;
        c2mt.A00 = i;
        if (i == 0 && (c66923Cy = c2mt.A02) != null) {
            c66923Cy.A01(false);
            c2mt.A02 = null;
        }
        this.A00 = true;
    }

    public void A01(C2A2 c2a2, int i, InterfaceC49482Kq interfaceC49482Kq, InterfaceC56142mm interfaceC56142mm, ImageView imageView) {
        A02(c2a2, i, interfaceC49482Kq, interfaceC56142mm, null, imageView);
    }

    public void A02(final C2A2 c2a2, final int i, final InterfaceC49482Kq interfaceC49482Kq, final InterfaceC56142mm interfaceC56142mm, final InterfaceC56152mn interfaceC56152mn, ImageView imageView) {
        C40231ro c40231ro = new C40231ro(c2a2, i, new InterfaceC49482Kq() { // from class: X.32i
            {
                C2N3.this = this;
            }

            @Override // X.InterfaceC49482Kq
            public final void ALY(C40231ro c40231ro2, Bitmap bitmap, boolean z) {
                C2N3 c2n3 = C2N3.this;
                InterfaceC49482Kq interfaceC49482Kq2 = interfaceC49482Kq;
                if (!z) {
                    c2n3.A02.remove(c40231ro2);
                }
                interfaceC49482Kq2.ALY(c40231ro2, bitmap, z);
            }
        }, new InterfaceC56142mm() { // from class: X.32j
            {
                C2N3.this = this;
            }

            @Override // X.InterfaceC56142mm
            public final void AHM(C40231ro c40231ro2) {
                C2N3 c2n3 = C2N3.this;
                InterfaceC56142mm interfaceC56142mm2 = interfaceC56142mm;
                c2n3.A02.add(c40231ro2);
                if (interfaceC56142mm2 != null) {
                    interfaceC56142mm2.AHM(c40231ro2);
                }
            }
        }, new InterfaceC56152mn() { // from class: X.32h
            @Override // X.InterfaceC56152mn
            public final void ALQ(C40231ro c40231ro2) {
                InterfaceC56152mn interfaceC56152mn2 = interfaceC56152mn;
                if (interfaceC56152mn2 != null) {
                    interfaceC56152mn2.ALQ(c40231ro2);
                }
            }
        }, Integer.MAX_VALUE, Integer.MAX_VALUE, imageView);
        C2MT c2mt = this.A01;
        if (c2mt.A02 != null) {
            ImageView A00 = c40231ro.A00();
            if (A00 != null) {
                A00.setTag(R.id.image_id, c40231ro.A08.A02);
                A00.setTag(R.id.image_quality, Integer.valueOf(c40231ro.A04));
                if (!c40231ro.ADk().equals(A00.getTag(R.id.loaded_image_url))) {
                    A00.setTag(R.id.loaded_image_url, null);
                }
            }
            c2mt.A02.A00(c40231ro, true);
        }
    }

    public void finalize() {
        super.finalize();
    }
}
