package X;

import com.google.android.search.verification.client.R;
import java.math.BigDecimal;

/* renamed from: X.4Fe  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C91504Fe implements C4AP {
    public final C002301c A00;
    public final InterfaceC013706o A01;
    public final C014006r A02;
    public final C014006r A03;
    public final C014006r A04;

    public C91504Fe(InterfaceC013706o interfaceC013706o, C002301c c002301c, C014006r c014006r, C014006r c014006r2) {
        this.A01 = interfaceC013706o;
        this.A00 = c002301c;
        this.A02 = c014006r;
        this.A04 = c014006r2;
        this.A03 = c014006r;
    }

    public C91504Fe(InterfaceC013706o interfaceC013706o, C002301c c002301c, C014006r c014006r, C014006r c014006r2, C014006r c014006r3) {
        this.A01 = interfaceC013706o;
        this.A00 = c002301c;
        this.A02 = c014006r;
        this.A04 = c014006r2;
        this.A03 = c014006r3;
    }

    public final C4AO A00(int i, BigDecimal bigDecimal, String str, boolean z) {
        BigDecimal bigDecimal2;
        if (i == 0) {
            bigDecimal2 = this.A02.A00;
        } else {
            bigDecimal2 = this.A03.A00;
        }
        if (bigDecimal.compareTo(bigDecimal2) > 0 || (bigDecimal.compareTo(bigDecimal2) == 0 && str.endsWith(".") && !z)) {
            C002301c c002301c = this.A00;
            return new C4AO(3, c002301c.A0D(R.string.payments_send_payment_max_amount, this.A01.A83(c002301c, bigDecimal2)));
        }
        return new C4AO(0, "");
    }
}
