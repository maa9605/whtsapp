package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.util.Log;

/* renamed from: X.49G */
/* loaded from: classes3.dex */
public class C49G {
    public static volatile C49G A09;
    public final C018508q A00;
    public final C02L A01;
    public final C0E7 A02;
    public final AnonymousClass012 A03;
    public final C001200o A04;
    public final C28S A05;
    public final C463026g A06;
    public final C0DV A07;
    public final C90904Cw A08;

    public C49G(C001200o c001200o, AnonymousClass012 anonymousClass012, C018508q c018508q, C02L c02l, C0DV c0dv, C90904Cw c90904Cw, C0E7 c0e7, C463026g c463026g, C28S c28s) {
        this.A04 = c001200o;
        this.A03 = anonymousClass012;
        this.A00 = c018508q;
        this.A01 = c02l;
        this.A07 = c0dv;
        this.A08 = c90904Cw;
        this.A02 = c0e7;
        this.A06 = c463026g;
        this.A05 = c28s;
    }

    public static C49G A00() {
        if (A09 == null) {
            synchronized (C49G.class) {
                if (A09 == null) {
                    A09 = new C49G(C001200o.A01, AnonymousClass012.A00(), C018508q.A00(), C02L.A00(), C0DV.A00(), C90904Cw.A00(), C0E7.A00(), C463026g.A00(), C28S.A00());
                }
            }
        }
        return A09;
    }

    public final void A01(C0N2 c0n2, ImageView imageView) {
        C92224Ib c92224Ib = (C92224Ib) c0n2.A06;
        if (c92224Ib != null && !TextUtils.isEmpty(c92224Ib.A0C)) {
            final C47s c47s = new C47s(this.A03, this.A04.A00, this.A00, this.A01, this.A02, this.A06, this.A05, c0n2.A07, c92224Ib.A0C, new C90874Ct(this, c0n2, c92224Ib, imageView));
            String str = c47s.A08;
            if (!TextUtils.isEmpty(str)) {
                String str2 = c47s.A09;
                if (!TextUtils.isEmpty(str2)) {
                    byte[] A03 = C05V.A03(c47s.A04, c47s.A02, false);
                    if (A03 != null) {
                        c47s.A06.A0F("get", new C02590Ca("account", new C04P[]{new C04P("action", "get-image-content", null, (byte) 0), new C04P("credential-id", str, null, (byte) 0), new C04P("image-content-id", str2, null, (byte) 0), new C04P("nonce", C02A.A03(A03), null, (byte) 0)}, null, null), new C28V(c47s.A00, c47s.A01, c47s.A03, c47s.A05) { // from class: X.4GO
                            @Override // X.C28V
                            public void A02(C28Q c28q) {
                                C90874Ct.A00(c47s.A08, new C28Q());
                            }

                            @Override // X.C28V
                            public void A03(C28Q c28q) {
                                C90874Ct.A00(c47s.A08, new C28Q());
                            }

                            @Override // X.C28V
                            public void A04(C02590Ca c02590Ca) {
                                C02590Ca A0D;
                                String str3;
                                String str4;
                                String str5;
                                C02590Ca A0D2 = c02590Ca.A0D("account");
                                if (A0D2 != null && (A0D = A0D2.A0D("image")) != null) {
                                    C90874Ct c90874Ct = c47s.A07;
                                    C04P A0A = A0D.A0A("credential-id");
                                    if (A0A != null) {
                                        str3 = A0A.A03;
                                    } else {
                                        str3 = null;
                                    }
                                    A0D.A0A("image-content-id");
                                    C04P A0A2 = A0D.A0A("image-url");
                                    if (A0A2 != null) {
                                        str4 = A0A2.A03;
                                    } else {
                                        str4 = null;
                                    }
                                    C04P A0A3 = A0D.A0A("image-label-color");
                                    if (A0A3 != null) {
                                        str5 = A0A3.A03;
                                    } else {
                                        str5 = null;
                                    }
                                    C0N2 c0n22 = c90874Ct.A01;
                                    String str6 = c0n22.A07;
                                    if (str3.equals(str6)) {
                                        if (!TextUtils.isEmpty(str4)) {
                                            c90874Ct.A02.A0E = str4;
                                            ImageView imageView2 = c90874Ct.A00;
                                            if (imageView2 != null) {
                                                c90874Ct.A03.A08.A03.A01(str4, imageView2);
                                            } else {
                                                AnonymousClass241 anonymousClass241 = c90874Ct.A03.A08.A03;
                                                int i = anonymousClass241.A00;
                                                anonymousClass241.A01.A00(new C83473sB(str4, i, i) { // from class: X.3xo
                                                    {
                                                        super(str4, str4, null, null, null, i, i, null);
                                                    }
                                                }, false);
                                            }
                                        }
                                        if (!TextUtils.isEmpty(str5)) {
                                            c90874Ct.A02.A0D = str5;
                                        }
                                        c90874Ct.A03.A07.A01().A02(c0n22, null);
                                        return;
                                    }
                                    StringBuilder A0P = C000200d.A0P("PAY: fetchCardArtImageContentDetails credentialIds don't match; request: ");
                                    A0P.append(str6);
                                    A0P.append(" response: ");
                                    A0P.append(str3);
                                    Log.w(A0P.toString());
                                    return;
                                }
                                C90874Ct.A00(c47s.A08, new C28Q());
                            }
                        }, 30000L);
                        return;
                    }
                    throw null;
                }
            }
            C90874Ct.A00(str, new C28Q());
            return;
        }
        StringBuilder sb = new StringBuilder("PAY: fetchCardArtImageContentDetails card method data invalid: ");
        sb.append(c92224Ib);
        Log.w(sb.toString());
    }

    public final void A02(final C0N2 c0n2, final ImageView imageView, Drawable drawable, final boolean z) {
        C0N8 c0n8 = (C0N8) c0n2.A06;
        if (c0n8 != null && !TextUtils.isEmpty(c0n8.A0E)) {
            C90904Cw c90904Cw = this.A08;
            c90904Cw.A03.A03(c0n8.A0E, imageView, drawable, drawable, new C3ZK() { // from class: X.4Cu
                @Override // X.C3ZK
                public void APb() {
                }

                {
                    C49G.this = this;
                }

                @Override // X.C3ZK
                public void ALN() {
                    StringBuilder A0P = C000200d.A0P("PAY: Failed to display card art, empty image shown. Re-fetch ");
                    boolean z2 = z;
                    A0P.append(z2);
                    Log.w(A0P.toString());
                    if (z2) {
                        C49G.this.A01(c0n2, imageView);
                    }
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder("PAY: Failed to display card art, card art url missing, re-fetch: ");
        sb.append(z);
        Log.w(sb.toString());
        if (!z) {
            return;
        }
        A01(c0n2, imageView);
    }

    public void A03(C0N2 c0n2, PaymentMethodRow paymentMethodRow) {
        C40841sx.A0b(paymentMethodRow, c0n2);
        A02(c0n2, paymentMethodRow.A00, this.A04.A00.getResources().getDrawable(C40841sx.A00((C0N7) c0n2)), false);
    }
}
