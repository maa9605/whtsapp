package X;

import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.4GL  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4GL extends AbstractC90614Bs {
    public final int A00;
    public final C895647m A01;
    public final InterfaceC895747n A02;
    public final List A03;

    public C4GL(C2OR c2or, C0EU c0eu, C49692Lz c49692Lz, C0E7 c0e7, C463026g c463026g, List list, InterfaceC895747n interfaceC895747n, int i, C895647m c895647m) {
        super(c2or, c0eu, c49692Lz, c0e7, c463026g);
        this.A03 = list;
        this.A02 = interfaceC895747n;
        this.A00 = i;
        this.A01 = c895647m;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C0FK c0fk = (C0FK) obj;
        String str = (String) c0fk.A00;
        C28Q c28q = (C28Q) c0fk.A01;
        InterfaceC895747n interfaceC895747n = this.A02;
        if (interfaceC895747n != null) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("PaymentPinTokenTask token error: ");
                sb.append(c28q);
                Log.i(C014406v.A01("PinTokenizer", sb.toString()));
                interfaceC895747n.AJs(c28q != null ? c28q : new C28Q());
            } else {
                interfaceC895747n.API(str);
            }
        }
        C895647m c895647m = this.A01;
        if (c895647m != null) {
            if (str == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("PaymentPinTokenTask token error: ");
                sb2.append(c28q);
                Log.i(C014406v.A01("PinTokenizer", sb2.toString()));
                if (c28q == null) {
                    c28q = new C28Q();
                }
                if (c895647m.A01.compareAndSet(false, true)) {
                    c895647m.A02.decrementAndGet();
                    c895647m.A00.AJs(c28q);
                    return;
                }
                return;
            }
            c895647m.A00(this.A00, str);
        }
    }
}
