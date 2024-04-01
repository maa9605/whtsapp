package X;

import android.content.Context;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4Ga */
/* loaded from: classes3.dex */
public class C91724Ga extends AbstractC90614Bs {
    public final int A00;
    public final Context A01;
    public final C018508q A02;
    public final C0E7 A03;
    public final C013606n A04;
    public final C28S A05;
    public final C463026g A06;
    public final C0DV A07;
    public final C77683ib A08;
    public final C49682Lx A09;
    public final InterfaceC002901k A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public C91724Ga(Context context, C018508q c018508q, InterfaceC002901k interfaceC002901k, C2OR c2or, C49682Lx c49682Lx, C0DV c0dv, C0EU c0eu, C49692Lz c49692Lz, C0E7 c0e7, C463026g c463026g, C013606n c013606n, C28S c28s, String str, String str2, String str3, String str4, int i, C77683ib c77683ib) {
        super(c2or, c0eu, c49692Lz, c0e7, c463026g);
        this.A01 = context;
        this.A02 = c018508q;
        this.A0A = interfaceC002901k;
        this.A09 = c49682Lx;
        this.A07 = c0dv;
        this.A03 = c0e7;
        this.A06 = c463026g;
        this.A04 = c013606n;
        this.A05 = c28s;
        this.A0B = str;
        this.A0D = str2;
        this.A0C = str3;
        this.A00 = i;
        this.A0E = str4;
        this.A08 = c77683ib;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C0FK c0fk = (C0FK) obj;
        String str = (String) c0fk.A00;
        C28Q c28q = (C28Q) c0fk.A01;
        if (str == null) {
            StringBuilder sb = new StringBuilder("PAY: BrazilUpdateMerchantAccountAction token error: ");
            sb.append(c28q);
            Log.e(sb.toString());
            BrazilPayBloksActivity.A04(this.A08.A00, c28q);
            return;
        }
        this.A06.A0F("set", new C02590Ca("account", new C04P[]{new C04P("action", "br-update-merchant-account", null, (byte) 0), new C04P("bank-token", str, null, (byte) 0), new C04P("bank-code", this.A0D, null, (byte) 0), new C04P("bank-branch", this.A0C, null, (byte) 0), new C04P("bank-account-type", String.valueOf(this.A00), null, (byte) 0), new C04P("device-id", this.A09.A02(), null, (byte) 0), new C04P("nonce", this.A0E, null, (byte) 0)}, null, null), new C4GZ(this, this.A01, this.A02, this.A03, this.A05), 30000L);
    }
}
