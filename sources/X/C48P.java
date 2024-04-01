package X;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.48P */
/* loaded from: classes3.dex */
public abstract class C48P {
    public final Context A00;
    public final C018508q A01;
    public final C02L A02;
    public final C0E7 A03;
    public final AnonymousClass012 A04;
    public final C466327p A05;
    public final C466327p A06;
    public final UserJid A07;
    public final UserJid A08;
    public final C28S A09;
    public final C463026g A0A;
    public final C0DV A0B;
    public final C895947p A0C;
    public final C48R A0D;
    public final C899048w A0E;
    public final C014406v A0F = C014406v.A00("PaymentPrecheckAction", "network", "COMMON");
    public final AnonymousClass493 A0G;
    public final AnonymousClass499 A0H;
    public final C49B A0I;
    public final C49682Lx A0J;
    public final InterfaceC002901k A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;

    public C48P(AnonymousClass012 anonymousClass012, Context context, C018508q c018508q, C02L c02l, InterfaceC002901k interfaceC002901k, C895947p c895947p, C49682Lx c49682Lx, C0DV c0dv, C0E7 c0e7, AnonymousClass499 anonymousClass499, C463026g c463026g, C28S c28s, AnonymousClass493 anonymousClass493, C899048w c899048w, String str, UserJid userJid, C466327p c466327p, C466327p c466327p2, String str2, String str3) {
        this.A04 = anonymousClass012;
        this.A00 = context;
        this.A01 = c018508q;
        this.A02 = c02l;
        this.A0K = interfaceC002901k;
        this.A0C = c895947p;
        this.A0J = c49682Lx;
        this.A0B = c0dv;
        this.A03 = c0e7;
        this.A0H = anonymousClass499;
        this.A0A = c463026g;
        this.A09 = c28s;
        this.A0G = anonymousClass493;
        this.A0E = c899048w;
        this.A0I = new C49B(anonymousClass012, c463026g);
        this.A0D = new C48R(context, c018508q, c0e7, c463026g, c28s, c899048w, "PIN");
        this.A0L = str;
        c02l.A05();
        this.A08 = c02l.A03;
        this.A07 = userJid;
        this.A05 = c466327p;
        this.A06 = c466327p2;
        this.A0P = str2;
        this.A0M = "BR";
        this.A0O = "FB";
        this.A0N = str3;
    }

    public static void A00(C48P c48p, String str, C02590Ca c02590Ca, final C48O c48o) {
        C0DX c0dx;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C04P("action", "pay-precheck", null, (byte) 0));
        String str2 = c48p.A0M;
        arrayList.add(new C04P("country", str2, null, (byte) 0));
        arrayList.add(new C04P("credential-id", c48p.A0L, null, (byte) 0));
        arrayList.add(new C04P("nonce", str, null, (byte) 0));
        arrayList.add(new C04P("receiver", c48p.A07));
        arrayList.add(new C04P("device-id", c48p.A0J.A02(), null, (byte) 0));
        arrayList.add(new C04P("transaction-type", c48p.A0P, null, (byte) 0));
        String str3 = c48p.A0N;
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(new C04P("payment-rails", str3, null, (byte) 0));
        }
        if (!TextUtils.isEmpty(null)) {
            arrayList.add(new C04P("request-id", null, null, (byte) 0));
        }
        InterfaceC03590Gh A02 = c48p.A0B.A02(str2);
        if (A02 != null) {
            c0dx = A02.ACJ(c48p.A05.A01.A9K());
        } else {
            c0dx = null;
        }
        c48p.A0A.A0F("set", new C02590Ca("account", (C04P[]) arrayList.toArray(new C04P[0]), new C02590Ca[]{c02590Ca, new C02590Ca("amount", new C04P[0], c0dx.ABU(c48p.A05)), new C02590Ca("total-amount", new C04P[0], c0dx.ABU(c48p.A06))}, null), new C28V(c48p.A00, c48p.A01, c48p.A03, c48p.A09) { // from class: X.4Go
            {
                C48P.this = c48p;
            }

            @Override // X.C28V
            public void A02(C28Q c28q) {
                c48o.AJs(c28q);
            }

            @Override // X.C28V
            public void A03(C28Q c28q) {
                c48o.AJs(c28q);
            }

            @Override // X.C28V
            public void A04(C02590Ca c02590Ca2) {
                try {
                    C02590Ca A0E = c02590Ca2.A0E("account");
                    C28Q A00 = C28Q.A00(A0E);
                    if (A00 != null) {
                        int i = A00.A00;
                        if (i == 1441) {
                            C48P.this.A0H.A03(A00.A02);
                        } else if (i == 1448) {
                            C48P c48p2 = C48P.this;
                            c48p2.A0E.A04(c48p2.A0O, "PIN", A00);
                        }
                        c48o.AJs(A00);
                        return;
                    }
                    C02590Ca A0D = A0E.A0D("transaction");
                    if (A0D != null) {
                        String A0G = A0D.A0G("id");
                        if (!TextUtils.isEmpty(A0G)) {
                            c48o.AOA(A0G);
                            return;
                        }
                    }
                    c48o.AJs(new C28Q(500));
                } catch (C0L4 e) {
                    C014406v c014406v = C48P.this.A0F;
                    StringBuilder sb = new StringBuilder("sendPrecheckWithSignature/onResponseSuccess/corrupt stream exception: ");
                    sb.append(e);
                    c014406v.A04(sb.toString());
                    c48o.AJs(new C28Q(500));
                }
            }
        }, 30000L);
    }

    public void A01() {
        final C90634Bu c90634Bu = (C90634Bu) this;
        C03560Ge A01 = c90634Bu.A00.A01();
        String str = c90634Bu.A0L;
        C0CI c0ci = new C0CI();
        A01.A03.AS1(new RunnableEBaseShape0S1200000_I0(A01, str, c0ci, 9));
        c0ci.A01.A03(new C0CG() { // from class: X.3hw
            @Override // X.C0CG
            public final void A54(Object obj) {
                c90634Bu.A03((C0N2) obj);
            }
        }, c90634Bu.A01.A06);
    }

    public final void A02(final C49A c49a, C0HE c0he, final C4H4 c4h4) {
        AnonymousClass012 anonymousClass012 = this.A04;
        byte[] A03 = C05V.A03(anonymousClass012, this.A02, false);
        if (A03 != null) {
            final String A032 = C02A.A03(A03);
            final long A05 = anonymousClass012.A05() / 1000;
            C466327p c466327p = this.A05;
            if (this.A0G.A06(AnonymousClass498.A00(this.A07.user, Integer.valueOf(c466327p.A01()), Integer.valueOf(c466327p.A00), c466327p.A01.A9K(), Long.valueOf(A05), A032), c0he, new InterfaceC06550Tv() { // from class: X.4CM
                {
                    C48P.this = this;
                }

                @Override // X.InterfaceC06550Tv
                public void AHZ(int i, CharSequence charSequence) {
                    C014406v c014406v = C48P.this.A0F;
                    StringBuilder A0P = C000200d.A0P("authenticateBiometric/onAuthenticationError/error: ");
                    A0P.append(charSequence.toString());
                    c014406v.A04(A0P.toString());
                    c4h4.AHZ(i, charSequence);
                }

                @Override // X.InterfaceC06550Tv
                public void AHa() {
                    C48P.this.A0F.A04("authenticateBiometric/onAuthenticationFailed");
                    c4h4.AHa();
                }

                @Override // X.InterfaceC06550Tv
                public void AHb(int i, CharSequence charSequence) {
                    C014406v c014406v = C48P.this.A0F;
                    StringBuilder A0P = C000200d.A0P("authenticateBiometric/onAuthenticationHelp/help: ");
                    A0P.append(charSequence.toString());
                    c014406v.A04(A0P.toString());
                    c4h4.AHb(i, charSequence);
                }

                @Override // X.InterfaceC06550Tv
                public void AHc(byte[] bArr) {
                    if (bArr != null) {
                        C48P c48p = C48P.this;
                        c48p.A0F.A07(null, "authenticateBiometric/onAuthenticationSucceeded/success", null);
                        C4H4 c4h42 = c4h4;
                        c4h42.AHc(bArr);
                        String str = A032;
                        C49A c49a2 = c49a;
                        long j = A05;
                        if (c48p.A0I != null) {
                            C48P.A00(c48p, str, c49a2.A00(C49B.A00("AUTH", Boolean.FALSE, bArr, j, null, null, new Object[0])), c4h42);
                            return;
                        }
                        throw null;
                    }
                    C48P.this.A0F.A04("authenticateBiometric/onAuthenticationSucceeded/null signature");
                    c4h4.AHa();
                }
            })) {
                return;
            }
            C4H5 c4h5 = c4h4.A01;
            c4h5.A02.A10();
            C019208x c019208x = new C019208x(c4h5.A01);
            c019208x.A03(R.string.payments_biometric_invalidated_key_title);
            c019208x.A02(R.string.payments_biometric_invalidated_key_error);
            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3Nw
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    c4h4.A00();
                }
            });
            c019208x.A01.A0J = false;
            c019208x.A01();
            return;
        }
        throw null;
    }
}
