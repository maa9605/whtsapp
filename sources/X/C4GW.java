package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.4GW */
/* loaded from: classes3.dex */
public class C4GW extends AbstractC90614Bs {
    public final Context A00;
    public final C018508q A01;
    public final C02L A02;
    public final C0E7 A03;
    public final AnonymousClass012 A04;
    public final C013606n A05;
    public final C28S A06;
    public final C463026g A07;
    public final C0DV A08;
    public final C897748j A09;
    public final C898548r A0A;
    public final C77623iV A0B;
    public final C49682Lx A0C;
    public final InterfaceC002901k A0D;

    public C4GW(AnonymousClass012 anonymousClass012, Context context, C018508q c018508q, C02L c02l, InterfaceC002901k interfaceC002901k, C2OR c2or, C49682Lx c49682Lx, C0DV c0dv, C897748j c897748j, C0EU c0eu, C49692Lz c49692Lz, C0E7 c0e7, C463026g c463026g, C013606n c013606n, C28S c28s, C898548r c898548r, C77623iV c77623iV) {
        super(c2or, c0eu, c49692Lz, c0e7, c463026g);
        this.A04 = anonymousClass012;
        this.A00 = context;
        this.A01 = c018508q;
        this.A02 = c02l;
        this.A0D = interfaceC002901k;
        this.A0C = c49682Lx;
        this.A08 = c0dv;
        this.A09 = c897748j;
        this.A03 = c0e7;
        this.A07 = c463026g;
        this.A05 = c013606n;
        this.A06 = c28s;
        this.A0A = c898548r;
        this.A0B = c77623iV;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C0FK c0fk = (C0FK) obj;
        String str = (String) c0fk.A00;
        C28Q c28q = (C28Q) c0fk.A01;
        if (str == null) {
            StringBuilder sb = new StringBuilder("PAY: BrazilMerchantRegAction token error: ");
            sb.append(c28q);
            Log.e(sb.toString());
            this.A0B.A00(c28q);
            return;
        }
        byte[] A03 = C05V.A03(this.A04, this.A02, false);
        if (A03 != null) {
            String A032 = C02A.A03(A03);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C04P("action", "br-reg-merchant", null, (byte) 0));
            arrayList.add(new C04P("nonce", A032, null, (byte) 0));
            C898548r c898548r = this.A0A;
            String str2 = c898548r.A0I;
            C000700j.A03(str2);
            arrayList.add(new C04P("tax-id", str2, null, (byte) 0));
            String str3 = c898548r.A07;
            C000700j.A03(str3);
            arrayList.add(new C04P("business-name", str3, null, (byte) 0));
            String str4 = c898548r.A0A;
            C000700j.A03(str4);
            arrayList.add(new C04P("email", str4, null, (byte) 0));
            String str5 = c898548r.A0D;
            C000700j.A03(str5);
            arrayList.add(new C04P("owner-name", str5, null, (byte) 0));
            String str6 = c898548r.A09;
            C000700j.A03(str6);
            arrayList.add(new C04P("cpf", str6, null, (byte) 0));
            arrayList.add(new C04P("bank-token", str, null, (byte) 0));
            String str7 = c898548r.A06;
            C000700j.A03(str7);
            arrayList.add(new C04P("bank-code", str7, null, (byte) 0));
            String str8 = c898548r.A05;
            C000700j.A03(str8);
            arrayList.add(new C04P("bank-branch", str8, null, (byte) 0));
            String str9 = c898548r.A04;
            C000700j.A03(str9);
            arrayList.add(new C04P("bank-account-type", str9, null, (byte) 0));
            arrayList.add(new C04P("device-id", this.A0C.A02(), null, (byte) 0));
            C02590Ca[] c02590CaArr = new C02590Ca[2];
            c02590CaArr[0] = this.A09.A01(c898548r.A02, c898548r.A01, c898548r.A00);
            C04P[] c04pArr = new C04P[8];
            c04pArr[0] = new C04P("house-number", TextUtils.isEmpty(c898548r.A0B) ? "" : c898548r.A0B, null, (byte) 0);
            String str10 = c898548r.A0G;
            C000700j.A03(str10);
            c04pArr[1] = new C04P("street", str10, null, (byte) 0);
            c04pArr[2] = new C04P("extra-line", TextUtils.isEmpty(c898548r.A0H) ? "" : c898548r.A0H, null, (byte) 0);
            c04pArr[3] = new C04P("neighborhood", TextUtils.isEmpty(c898548r.A0C) ? "" : c898548r.A0C, null, (byte) 0);
            String str11 = c898548r.A08;
            C000700j.A03(str11);
            c04pArr[4] = new C04P("city", str11, null, (byte) 0);
            String str12 = c898548r.A0F;
            C000700j.A03(str12);
            c04pArr[5] = new C04P("state", str12, null, (byte) 0);
            c04pArr[6] = new C04P("country", "BR", null, (byte) 0);
            String str13 = c898548r.A0E;
            C000700j.A03(str13);
            c04pArr[7] = new C04P("post-code", str13, null, (byte) 0);
            c02590CaArr[1] = new C02590Ca("address", c04pArr, null, null);
            this.A07.A0F("set", new C02590Ca("account", (C04P[]) arrayList.toArray(new C04P[0]), c02590CaArr, null), new C4GV(this, this.A00, this.A01, this.A03, this.A06), 30000L);
            return;
        }
        throw null;
    }
}
