package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4IY  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4IY extends C91754Gd {
    public final /* synthetic */ C4CG A00;
    public final /* synthetic */ C49F A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4IY(C4CG c4cg, Context context, C018508q c018508q, C0E7 c0e7, C28S c28s, C3NV c3nv, C49F c49f) {
        super(context, c018508q, c0e7, c28s, c3nv, "upi-register-vpa");
        this.A00 = c4cg;
        this.A01 = c49f;
    }

    @Override // X.C91754Gd, X.C28V
    public void A02(C28Q c28q) {
        super.A02(c28q);
        C48F c48f = this.A00.A01;
        if (c48f != null) {
            ((IndiaUpiBankAccountPickerActivity) c48f).A1e(null, c28q);
        }
    }

    @Override // X.C91754Gd, X.C28V
    public void A03(C28Q c28q) {
        super.A03(c28q);
        C48F c48f = this.A00.A01;
        if (c48f != null) {
            ((IndiaUpiBankAccountPickerActivity) c48f).A1e(null, c28q);
        }
    }

    @Override // X.C91754Gd, X.C28V
    public void A04(C02590Ca c02590Ca) {
        super.A04(c02590Ca);
        C4CG c4cg = this.A00;
        C0DV c0dv = c4cg.A09;
        C2EG ABu = c0dv.A03().ABu();
        if (ABu != null) {
            ArrayList AQa = ABu.AQa(c4cg.A05, c02590Ca);
            ArrayList arrayList = new ArrayList();
            Iterator it = AQa.iterator();
            final C4IA c4ia = null;
            final C0N6 c0n6 = null;
            while (it.hasNext()) {
                C4IA c4ia2 = (C4IA) ((C0K9) it.next());
                C03650Gn c03650Gn = C03650Gn.A0E;
                String str = ((C0N5) c4ia2).A04;
                boolean z = ((C0N5) c4ia2).A08;
                int i = z ? 2 : 0;
                boolean z2 = ((C0N5) c4ia2).A07;
                int i2 = z2 ? 2 : 0;
                String str2 = ((C0N5) c4ia2).A06;
                C0N6 c0n62 = new C0N6(c03650Gn, str, -1L, -1L, i, i2, str2, ((C0N5) c4ia2).A05, ((C0N5) c4ia2).A09, c4ia2);
                arrayList.add(c0n62);
                if ((str2 != null && str2.equals(((C0N5) c4cg.A00).A06)) || (c4ia == null && (z2 || z))) {
                    c4ia = c4ia2;
                    c0n6 = c0n62;
                }
            }
            C03560Ge A01 = c0dv.A01();
            final C49F c49f = this.A01;
            A01.A03(arrayList, new C28N() { // from class: X.3i0
                @Override // X.C28N
                public final void AH2(List list) {
                    C4IY.this.A05(c4ia, c0n6, c49f);
                }
            });
            return;
        }
        throw null;
    }

    public void A05(C4IA c4ia, C0N6 c0n6, C49F c49f) {
        if (c4ia != null && !TextUtils.isEmpty(c4ia.A0D)) {
            C0GZ c0gz = this.A00.A07;
            c0gz.A05(c0gz.A01("add_bank"));
        }
        C4CG c4cg = this.A00;
        C48F c48f = c4cg.A01;
        if (c48f == null || c0n6 == null) {
            return;
        }
        ((IndiaUpiBankAccountPickerActivity) c48f).A1e(c0n6, null);
        C4IA c4ia2 = (C4IA) c0n6.A06;
        if (c4ia2 == null || !c4ia2.A0G) {
            return;
        }
        C0GZ c0gz2 = c4cg.A07;
        c0gz2.A05(c0gz2.A01("2fa"));
        c49f.AGP();
    }
}
