package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.4IC */
/* loaded from: classes3.dex */
public class C4IC extends AbstractC90614Bs {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final C018508q A03;
    public final C02L A04;
    public final C0E7 A05;
    public final AnonymousClass012 A06;
    public final C013606n A07;
    public final C28S A08;
    public final C463026g A09;
    public final C0DV A0A;
    public final C014406v A0B;
    public final C77763ij A0C;
    public final C49G A0D;
    public final C49682Lx A0E;
    public final InterfaceC002901k A0F;
    public final String A0G;
    public final String A0H;

    public C4IC(AnonymousClass012 anonymousClass012, Context context, C018508q c018508q, C02L c02l, InterfaceC002901k interfaceC002901k, C2OR c2or, C49682Lx c49682Lx, C0DV c0dv, C0EU c0eu, C49692Lz c49692Lz, C0E7 c0e7, C49G c49g, C013606n c013606n, C463026g c463026g, C28S c28s, String str, String str2, int i, int i2, C77763ij c77763ij) {
        super(c2or, c0eu, c49692Lz, c0e7, c463026g);
        this.A0B = C014406v.A00("BaseTokenAddCardAction", "network", "COMMON");
        this.A03 = c018508q;
        this.A0F = interfaceC002901k;
        this.A0E = c49682Lx;
        this.A0A = c0dv;
        this.A09 = c463026g;
        this.A08 = c28s;
        this.A0G = str;
        this.A0H = str2;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = anonymousClass012;
        this.A02 = context;
        this.A04 = c02l;
        this.A05 = c0e7;
        this.A0D = c49g;
        this.A07 = c013606n;
        this.A0C = c77763ij;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C0FK c0fk = (C0FK) obj;
        String str = (String) c0fk.A00;
        C28Q c28q = (C28Q) c0fk.A01;
        if (str == null) {
            StringBuilder sb = new StringBuilder("PAY: BrazilAddCardAction token error: ");
            sb.append(c28q);
            Log.i(sb.toString());
            this.A0C.A00(null, false, null, c28q);
            return;
        }
        ArrayList A0Y = C000200d.A0Y("PAY: BrazilAddCardAction sendAddCard token success");
        A0Y.add(new C04P("action", "br-add-card", null, (byte) 0));
        A0Y.add(new C04P("token", str, null, (byte) 0));
        A0Y.add(new C04P("device-id", this.A0E.A02(), null, (byte) 0));
        A0Y.add(new C04P("card-expiry-month", String.format(Locale.US, "%02d", Integer.valueOf(this.A00)), null, (byte) 0));
        A0Y.add(new C04P("card-expiry-year", Integer.toString(this.A01), null, (byte) 0));
        byte[] A03 = C05V.A03(this.A06, this.A04, false);
        if (A03 != null) {
            A0Y.add(new C04P("nonce", C02A.A03(A03), null, (byte) 0));
            this.A09.A0F("set", new C02590Ca("account", (C04P[]) A0Y.toArray(new C04P[0]), null, null), new C4GM(this, this.A02, this.A03, this.A05, this.A08), 0L);
            return;
        }
        throw null;
    }
}
