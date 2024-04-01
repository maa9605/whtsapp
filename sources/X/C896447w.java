package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.47w  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C896447w {
    public final Context A00;
    public final C018508q A01;
    public final C02L A02;
    public final C0E7 A03;
    public final AnonymousClass012 A04;
    public final C013606n A05;
    public final C47Y A06;
    public final C28S A07;
    public final C463026g A08;
    public final C0DV A09;
    public final C48z A0A;
    public final C49682Lx A0B;
    public final String A0C;

    public C896447w(AnonymousClass012 anonymousClass012, Context context, C018508q c018508q, C02L c02l, C49682Lx c49682Lx, C0DV c0dv, C0E7 c0e7, C463026g c463026g, C48z c48z, C013606n c013606n, C47Y c47y, C28S c28s, String str) {
        this.A04 = anonymousClass012;
        this.A00 = context;
        this.A01 = c018508q;
        this.A02 = c02l;
        this.A0B = c49682Lx;
        this.A09 = c0dv;
        this.A03 = c0e7;
        this.A08 = c463026g;
        this.A0A = c48z;
        this.A05 = c013606n;
        this.A06 = c47y;
        this.A07 = c28s;
        this.A0C = str;
    }

    public void A01(final InterfaceC896347v interfaceC896347v) {
        C0DV c0dv = this.A09;
        c0dv.A04();
        C013406l c013406l = c0dv.A08;
        String str = this.A0C;
        C0N2 A08 = c013406l.A08(str);
        if (A08 != null) {
            C0N7 c0n7 = (C0N7) A08;
            C92224Ib c92224Ib = (C92224Ib) c0n7.A06;
            if (c92224Ib == null || !c92224Ib.A07) {
                C463026g c463026g = this.A08;
                C02590Ca c02590Ca = new C02590Ca("account", new C04P[]{new C04P("action", "br-get-verification-methods", null, (byte) 0), new C04P("device-id", this.A0B.A02(), null, (byte) 0), new C04P("credential-id", str, null, (byte) 0)}, null, null);
                final Context context = this.A00;
                final C018508q c018508q = this.A01;
                final C0E7 c0e7 = this.A03;
                final C28S c28s = this.A07;
                c463026g.A0F("get", c02590Ca, new C28V(context, c018508q, c0e7, c28s) { // from class: X.4GQ
                    @Override // X.C28V
                    public void A02(C28Q c28q) {
                        StringBuilder sb = new StringBuilder("PAY: BrazilGetVerificationMethods onRequestError: ");
                        sb.append(c28q);
                        Log.i(sb.toString());
                        interfaceC896347v.AOD(null, c28q);
                    }

                    @Override // X.C28V
                    public void A03(C28Q c28q) {
                        StringBuilder sb = new StringBuilder("PAY: BrazilGetVerificationMethods onResponseError: ");
                        sb.append(c28q);
                        Log.i(sb.toString());
                        interfaceC896347v.AOD(null, c28q);
                    }

                    @Override // X.C28V
                    public void A04(C02590Ca c02590Ca2) {
                        int length;
                        C02590Ca A0D = c02590Ca2.A0D("account");
                        if (A0D != null) {
                            ArrayList arrayList = new ArrayList();
                            C02590Ca A0D2 = A0D.A0D("verify-method-list");
                            C02590Ca A0D3 = A0D.A0D("card");
                            if (A0D3 != null) {
                                C92224Ib c92224Ib2 = new C92224Ib();
                                c92224Ib2.A03(C896447w.this.A05, 0, A0D3);
                                C0N7 c0n72 = (C0N7) c92224Ib2.A05();
                                if (c92224Ib2.A0X) {
                                    interfaceC896347v.AIH(c0n72);
                                    return;
                                }
                            }
                            if (A0D2 != null) {
                                C02590Ca[] c02590CaArr = A0D2.A03;
                                if (c02590CaArr != null && (length = c02590CaArr.length) > 0) {
                                    for (int i = 0; i < length; i++) {
                                        arrayList.add(new C898048m(A0D2.A0C(i)));
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    interfaceC896347v.AOD(null, new C28Q());
                                } else {
                                    interfaceC896347v.AOD(arrayList, null);
                                }
                            }
                        }
                    }
                }, 0L);
                return;
            }
            new C896147r(this.A04, this.A00, this.A01, this.A02, c0dv, this.A03, this.A08, this.A0A, this.A05, this.A06, this.A07, new InterfaceC896047q() { // from class: X.3hs
                @Override // X.InterfaceC896047q
                public final void AJL(C0N7 c0n72, ArrayList arrayList, C28Q c28q) {
                    C896447w.this.A02(interfaceC896347v, c0n72, arrayList, c28q);
                }
            }).A00(c0n7);
            return;
        }
        throw null;
    }

    public /* synthetic */ void A02(final InterfaceC896347v interfaceC896347v, C0N7 c0n7, final ArrayList arrayList, C28Q c28q) {
        if (c28q == null) {
            this.A09.A01().A02(c0n7, new C28N() { // from class: X.3hr
                @Override // X.C28N
                public final void AH2(List list) {
                    InterfaceC896347v.this.AOD(arrayList, null);
                }
            });
        } else {
            interfaceC896347v.AOD(null, c28q);
        }
    }
}
