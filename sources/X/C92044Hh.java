package X;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.4Hh */
/* loaded from: classes3.dex */
public class C92044Hh extends C4FC {
    public C461825l A00;
    public final C018508q A01;
    public final C02L A02;
    public final C0E7 A03;
    public final AnonymousClass012 A04;
    public final C001200o A05;
    public final C0C9 A06;
    public final C013606n A07;
    public final C47W A08;
    public final C28S A09;
    public final C03550Gd A0A;
    public final C0EU A0B;
    public final C463026g A0C;
    public final C47302Ar A0D;
    public final C0DV A0E;
    public final C49682Lx A0F;
    public final InterfaceC002901k A0G;

    public C92044Hh(InterfaceC02360Aw interfaceC02360Aw, AnonymousClass012 anonymousClass012, C018508q c018508q, C02L c02l, C001200o c001200o, InterfaceC002901k interfaceC002901k, C013406l c013406l, C49682Lx c49682Lx, C0DV c0dv, C0C9 c0c9, C47W c47w, C0EU c0eu, C0E7 c0e7, C463026g c463026g, C013606n c013606n, C013306k c013306k, C47302Ar c47302Ar, C28S c28s, C03550Gd c03550Gd) {
        super(interfaceC02360Aw, c018508q, interfaceC002901k, c013406l, c0dv, c013306k);
        this.A00 = new C461825l();
        this.A04 = anonymousClass012;
        this.A01 = c018508q;
        this.A02 = c02l;
        this.A05 = c001200o;
        this.A0G = interfaceC002901k;
        this.A0F = c49682Lx;
        this.A0E = c0dv;
        this.A06 = c0c9;
        this.A08 = c47w;
        this.A0B = c0eu;
        this.A03 = c0e7;
        this.A0C = c463026g;
        this.A07 = c013606n;
        this.A0D = c47302Ar;
        this.A09 = c28s;
        this.A0A = c03550Gd;
    }

    public static void A00(C92044Hh c92044Hh) {
        if (c92044Hh != null) {
            C900549m c900549m = new C900549m(5);
            c900549m.A08 = false;
            c92044Hh.A00.A0B(c900549m);
            return;
        }
        throw null;
    }

    public static void A01(C92044Hh c92044Hh, int i) {
        if (c92044Hh != null) {
            C900549m c900549m = new C900549m(6);
            c900549m.A00 = i;
            c92044Hh.A00.A0B(c900549m);
            return;
        }
        throw null;
    }

    public void A05() {
        AbstractC466427q abstractC466427q = (AbstractC466427q) ((C4FC) this).A01.A06;
        if (TextUtils.isEmpty(abstractC466427q.A08)) {
            return;
        }
        C900549m c900549m = new C900549m(3);
        c900549m.A05 = abstractC466427q.A08.replaceAll("[^\\d]", "");
        this.A00.A0B(c900549m);
    }

    public void A06() {
        C92234Ic c92234Ic = (C92234Ic) ((C4FC) this).A01.A06;
        if (c92234Ic == null || TextUtils.isEmpty(c92234Ic.A02)) {
            return;
        }
        C900549m c900549m = new C900549m(2);
        c900549m.A03 = Uri.parse(c92234Ic.A02);
        this.A00.A0B(c900549m);
    }

    public /* synthetic */ void A07() {
        this.A00.A0B(new C900549m(1));
    }

    public /* synthetic */ void A08() {
        this.A00.A0B(new C900549m(0));
    }

    public void A09(C92234Ic c92234Ic) {
        if (TextUtils.isEmpty(c92234Ic.A08)) {
            return;
        }
        C900549m c900549m = new C900549m(3);
        c900549m.A05 = c92234Ic.A08.replaceAll("[^\\d]", "");
        this.A00.A0B(c900549m);
    }

    /* renamed from: A0A */
    public final void A0C(final C92234Ic c92234Ic) {
        C900549m c900549m = new C900549m(5);
        c900549m.A08 = true;
        c900549m.A02 = R.string.payments_loading;
        this.A00.A0B(c900549m);
        new C896247u(this.A05.A00, this.A01, this.A03, this.A0C, this.A07, this.A09, new C47t() { // from class: X.3js
            {
                C92044Hh.this = this;
            }

            @Override // X.C47t
            public final void AKl(List list, C28Q c28q) {
                C92044Hh.this.A0D(c92234Ic, list, c28q);
            }
        }).A00();
    }

    public void A0D(C92234Ic c92234Ic, List list, C28Q c28q) {
        C900549m c900549m = new C900549m(5);
        c900549m.A08 = false;
        this.A00.A0B(c900549m);
        if (c28q == null) {
            JSONArray A01 = C47W.A01(list);
            C900549m c900549m2 = new C900549m(4);
            HashMap hashMap = new HashMap();
            c900549m2.A07 = hashMap;
            hashMap.put("update", "1");
            HashMap hashMap2 = c900549m2.A07;
            if (A01 != null) {
                hashMap2.put("banks", A01.toString());
                String str = ((AbstractC466427q) c92234Ic).A02;
                if (TextUtils.isEmpty(str)) {
                    str = this.A02.A02();
                }
                c900549m2.A07.put("business_name", str);
                c900549m2.A06 = "brpay_m_payout_info";
                this.A00.A0B(c900549m2);
                return;
            }
            throw null;
        }
        C900549m c900549m3 = new C900549m(7);
        c900549m3.A04 = c28q;
        this.A00.A0B(c900549m3);
    }
}
