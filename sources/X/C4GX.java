package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4GX  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4GX extends C28V {
    public final /* synthetic */ InterfaceC03640Gm A00;
    public final /* synthetic */ C896747z A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4GX(C896747z c896747z, Context context, C018508q c018508q, C0E7 c0e7, C28S c28s, InterfaceC03640Gm interfaceC03640Gm) {
        super(context, c018508q, c0e7, c28s);
        this.A01 = c896747z;
        this.A00 = interfaceC03640Gm;
    }

    @Override // X.C28V
    public void A02(C28Q c28q) {
        StringBuilder sb = new StringBuilder("PAY: BrazilRemoveMerchantAccount onRequestError: ");
        sb.append(c28q);
        Log.i(sb.toString());
        InterfaceC03640Gm interfaceC03640Gm = this.A00;
        if (interfaceC03640Gm != null) {
            interfaceC03640Gm.ANw(c28q);
        }
    }

    @Override // X.C28V
    public void A03(C28Q c28q) {
        StringBuilder sb = new StringBuilder("PAY: BrazilRemoveMerchantAccount onResponseError=");
        sb.append(c28q);
        Log.e(sb.toString());
        InterfaceC03640Gm interfaceC03640Gm = this.A00;
        if (interfaceC03640Gm != null) {
            interfaceC03640Gm.AO1(c28q);
        }
    }

    @Override // X.C28V
    public void A04(C02590Ca c02590Ca) {
        Log.i("Pay: BrazilRemoveMerchantAccount successfully removed merchant account");
        C896747z c896747z = this.A01;
        C0DV c0dv = c896747z.A08;
        c0dv.A04();
        C013406l c013406l = c0dv.A08;
        if (c013406l != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((AbstractCollection) c013406l.A09()).iterator();
            while (it.hasNext()) {
                arrayList.add(((C0N2) it.next()).A07);
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    c896747z.A09.AS1(new RunnableC69143Nh(this, (String) it2.next()));
                }
            }
            C03550Gd c03550Gd = c896747z.A06;
            synchronized (c03550Gd) {
                c03550Gd.A00.A0I(c03550Gd.A02);
            }
            InterfaceC03640Gm interfaceC03640Gm = this.A00;
            if (interfaceC03640Gm != null) {
                interfaceC03640Gm.AO2(new C77103hf());
                return;
            }
            return;
        }
        throw null;
    }

    public void A05() {
        C0DV c0dv = this.A01.A08;
        c0dv.A04();
        if (c0dv.A08 != null) {
            Log.w("PAY: removeMerchantPaymentMethod for nonSmbApp!");
            return;
        }
        throw null;
    }
}
