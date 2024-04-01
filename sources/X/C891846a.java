package X;

import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.46a  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C891846a implements InterfaceC010405f {
    public final /* synthetic */ C45T A00;
    public final /* synthetic */ C889345a A01;
    public final /* synthetic */ C90604Br A02;

    public C891846a(C889345a c889345a, C45T c45t, C90604Br c90604Br) {
        this.A01 = c889345a;
        this.A00 = c45t;
        this.A02 = c90604Br;
    }

    public /* synthetic */ void A00(C45T c45t, C02590Ca c02590Ca) {
        if (c45t != null) {
            c45t.A04("on_success", this.A01.A01(c02590Ca));
        }
    }

    public /* synthetic */ void A01(C90604Br c90604Br, C02590Ca c02590Ca, C45T c45t) {
        if (c90604Br != null) {
            Iterator it = ((AbstractCollection) C28V.A00(c02590Ca)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C28Q) it.next()).A00 == 453) {
                    c90604Br.A00.A0T(true);
                    break;
                }
            }
        }
        if (c45t != null) {
            c45t.A04("on_failure", this.A01.A01(c02590Ca));
        }
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        C45T c45t = this.A00;
        if (c45t != null) {
            c45t.A00("on_failure");
        }
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        StringBuilder A0P = C000200d.A0P("Bloks: IQRequestHelper/sendIQRequest onError: ");
        A0P.append(c02590Ca.toString());
        Log.e(A0P.toString());
        this.A01.A00.A0G(new RunnableC56622ne(this, this.A02, c02590Ca, this.A00));
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        this.A01.A00.A0G(new RunnableC56612nd(this, this.A00, c02590Ca));
    }
}
