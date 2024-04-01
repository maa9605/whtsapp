package X;

import java.util.ArrayList;

/* renamed from: X.0ZW  reason: invalid class name */
/* loaded from: classes.dex */
public class C0ZW implements C0D1 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final /* synthetic */ AbstractC02800Cx A03;

    public C0ZW(AbstractC02800Cx abstractC02800Cx, String str, int i, int i2) {
        this.A03 = abstractC02800Cx;
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.C0D1
    public boolean A89(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC02800Cx abstractC02800Cx = this.A03;
        C0BA c0ba = abstractC02800Cx.A03;
        if (c0ba == null || this.A01 >= 0 || this.A02 != null || !c0ba.A0B().A0s()) {
            return abstractC02800Cx.A0y(arrayList, arrayList2, this.A02, this.A01, this.A00);
        }
        return false;
    }
}
