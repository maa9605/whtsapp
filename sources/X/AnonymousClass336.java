package X;

import android.graphics.Bitmap;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* renamed from: X.336  reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass336 implements InterfaceC55972mU {
    public C66923Cy A00;
    public final int A01;

    public AnonymousClass336(int i) {
        this.A01 = i;
    }

    @Override // X.InterfaceC55972mU
    public void AHL(InterfaceC40241rp interfaceC40241rp) {
        InterfaceC56142mm interfaceC56142mm;
        C40231ro c40231ro = (C40231ro) interfaceC40241rp;
        if (!c40231ro.A01() || (interfaceC56142mm = c40231ro.A05) == null) {
            return;
        }
        interfaceC56142mm.AHM(c40231ro);
    }

    @Override // X.InterfaceC55972mU
    public void ALO(InterfaceC40241rp interfaceC40241rp) {
        InterfaceC56152mn interfaceC56152mn;
        final C40231ro c40231ro = (C40231ro) interfaceC40241rp;
        if (c40231ro.A04 != 1) {
            if (c40231ro.A01() && (interfaceC56152mn = c40231ro.A06) != null) {
                interfaceC56152mn.ALQ(c40231ro);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList(2);
        InterfaceC49482Kq interfaceC49482Kq = new InterfaceC49482Kq() { // from class: X.335
            public boolean A00;

            @Override // X.InterfaceC49482Kq
            public void ALY(C40231ro c40231ro2, Bitmap bitmap, boolean z) {
                if (!this.A00) {
                    if (c40231ro2.A04 == 3) {
                        this.A00 = true;
                        C40231ro c40231ro3 = C40231ro.this;
                        c40231ro3.A07.ALY(c40231ro3, bitmap, z);
                        return;
                    }
                    C40231ro.this.A07.ALY(c40231ro2, bitmap, z);
                }
            }
        };
        C2A2 c2a2 = c40231ro.A08;
        int i = this.A01;
        C40231ro c40231ro2 = new C40231ro(c2a2, 2, interfaceC49482Kq, null, null, i, i, c40231ro.A00());
        C40231ro c40231ro3 = new C40231ro(c2a2, 3, interfaceC49482Kq, null, null, Integer.MAX_VALUE, Integer.MAX_VALUE, c40231ro.A00());
        arrayList.add(c40231ro2);
        arrayList.add(c40231ro3);
        c40231ro.A02 = arrayList;
        C66923Cy c66923Cy = this.A00;
        if (c66923Cy == null) {
            return;
        }
        c66923Cy.A00(c40231ro2, true);
        this.A00.A00(c40231ro3, true);
    }

    @Override // X.InterfaceC55972mU
    public void ALU(InterfaceC40241rp interfaceC40241rp) {
    }

    @Override // X.InterfaceC55972mU
    public void ALX(InterfaceC40241rp interfaceC40241rp, Bitmap bitmap, boolean z) {
        C40231ro c40231ro = (C40231ro) interfaceC40241rp;
        if (c40231ro.A01()) {
            if (c40231ro.A00() != null) {
                c40231ro.A00().setTag(R.id.loaded_image_url, c40231ro.ADk());
            }
            c40231ro.A07.ALY(c40231ro, bitmap, z);
        }
    }
}
