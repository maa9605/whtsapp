package X;

import android.content.Context;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.4GU  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4GU extends AbstractC90614Bs {
    public final Context A00;
    public final C018508q A01;
    public final C02L A02;
    public final C0E7 A03;
    public final AnonymousClass012 A04;
    public final C28S A05;
    public final C463026g A06;
    public final C77733ig A07;
    public final C49682Lx A08;
    public final InterfaceC002901k A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;

    public C4GU(Context context, AnonymousClass012 anonymousClass012, C018508q c018508q, C02L c02l, InterfaceC002901k interfaceC002901k, C2OR c2or, C49682Lx c49682Lx, C0EU c0eu, C49692Lz c49692Lz, C0E7 c0e7, C463026g c463026g, C28S c28s, String str, String str2, String str3, String str4, String str5, String str6, String str7, C77733ig c77733ig) {
        super(c2or, c0eu, c49692Lz, c0e7, c463026g);
        this.A00 = context;
        this.A04 = anonymousClass012;
        this.A01 = c018508q;
        this.A02 = c02l;
        this.A09 = interfaceC002901k;
        this.A08 = c49682Lx;
        this.A03 = c0e7;
        this.A06 = c463026g;
        this.A05 = c28s;
        this.A0G = str;
        this.A0F = str2;
        this.A0D = str3;
        this.A0C = str4;
        this.A0B = str5;
        this.A0A = str6;
        this.A0E = str7;
        this.A07 = c77733ig;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C0FK c0fk = (C0FK) obj;
        String str = (String) c0fk.A00;
        C28Q c28q = (C28Q) c0fk.A01;
        if (str != null) {
            ArrayList arrayList = new ArrayList();
            C000200d.A1A("action", "br-prelink-merchant", arrayList);
            String str2 = this.A0G;
            if ("PREPAID".equals(str2)) {
                C000700j.A03(str);
                arrayList.add(new C04P("card-token", str, null, (byte) 0));
            } else if ("BANK".equals(str2)) {
                C000700j.A03(str);
                arrayList.add(new C04P("bank-token", str, null, (byte) 0));
                String str3 = this.A0D;
                C000700j.A03(str3);
                arrayList.add(new C04P("bank-code", str3, null, (byte) 0));
                String str4 = this.A0C;
                C000700j.A03(str4);
                arrayList.add(new C04P("bank-branch", str4, null, (byte) 0));
                String str5 = this.A0B;
                C000700j.A03(str5);
                arrayList.add(new C04P("bank-account-type", str5, null, (byte) 0));
            } else {
                throw new IllegalStateException("Expecting card token or bank account!");
            }
            arrayList.add(new C04P("device-id", this.A08.A02(), null, (byte) 0));
            byte[] A03 = C05V.A03(this.A04, this.A02, false);
            if (A03 != null) {
                arrayList.add(new C04P("nonce", C02A.A03(A03), null, (byte) 0));
                arrayList.add(new C04P("verify-type", str2, null, (byte) 0));
                arrayList.add(new C04P("verify-id", this.A0F, null, (byte) 0));
                C463026g c463026g = this.A06;
                C02590Ca c02590Ca = new C02590Ca("account", (C04P[]) arrayList.toArray(new C04P[0]), null, null);
                final Context context = this.A00;
                final C018508q c018508q = this.A01;
                final C0E7 c0e7 = this.A03;
                final C28S c28s = this.A05;
                c463026g.A0F("set", c02590Ca, new C28V(context, c018508q, c0e7, c28s) { // from class: X.4GT
                    @Override // X.C28V
                    public void A02(C28Q c28q2) {
                        StringBuilder sb = new StringBuilder("PAY: BrazilMerchantPreLinkAction request error: ");
                        sb.append(c28q2);
                        Log.e(sb.toString());
                        BrazilPayBloksActivity.A05(C4GU.this.A07.A00, null, c28q2);
                    }

                    @Override // X.C28V
                    public void A03(C28Q c28q2) {
                        StringBuilder sb = new StringBuilder("PAY: BrazilMerchantPreLinkAction response error: ");
                        sb.append(c28q2);
                        Log.e(sb.toString());
                        BrazilPayBloksActivity.A05(C4GU.this.A07.A00, null, c28q2);
                    }

                    @Override // X.C28V
                    public void A04(C02590Ca c02590Ca2) {
                        C02590Ca A0D = c02590Ca2.A0D("account");
                        if (A0D != null) {
                            C898248o c898248o = new C898248o(A0D);
                            C28Q c28q2 = c898248o.A00;
                            if (c28q2 == null) {
                                BrazilPayBloksActivity.A05(C4GU.this.A07.A00, c898248o, null);
                                return;
                            } else {
                                BrazilPayBloksActivity.A05(C4GU.this.A07.A00, null, c28q2);
                                return;
                            }
                        }
                        throw null;
                    }
                }, 30000L);
                return;
            }
            throw null;
        }
        StringBuilder sb = new StringBuilder("PAY: BrazilMerchantPreLinkAction token error: ");
        sb.append(c28q);
        Log.e(sb.toString());
        BrazilPayBloksActivity.A05(this.A07.A00, null, c28q);
    }
}
