package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.PublicKey;
import java.util.ArrayList;

/* renamed from: X.498 */
/* loaded from: classes3.dex */
public class AnonymousClass498 {
    public static volatile AnonymousClass498 A0B;
    public C48R A00;
    public C49B A01;
    public final C018508q A02;
    public final C0E7 A03;
    public final C001200o A04;
    public final C28S A05;
    public final C895947p A06;
    public final C899048w A07;
    public final C014406v A08 = C014406v.A00("PaymentPinHelper", "network", "COMMON");
    public final AnonymousClass493 A09;
    public final AnonymousClass499 A0A;

    public AnonymousClass498(C001200o c001200o, AnonymousClass012 anonymousClass012, C018508q c018508q, C02L c02l, C895947p c895947p, C0E7 c0e7, AnonymousClass499 anonymousClass499, C463026g c463026g, C28S c28s, AnonymousClass493 anonymousClass493, C899048w c899048w) {
        this.A04 = c001200o;
        this.A02 = c018508q;
        this.A06 = c895947p;
        this.A03 = c0e7;
        this.A0A = anonymousClass499;
        this.A05 = c28s;
        this.A09 = anonymousClass493;
        this.A07 = c899048w;
        this.A01 = new C49B(anonymousClass012, c463026g);
        this.A00 = new C48R(c001200o.A00, c018508q, c0e7, c463026g, c28s, c899048w, "PIN");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] A00(Object... objArr) {
        int length = objArr.length;
        byte[][] bArr = new byte[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            try {
                if (objArr[i2] == null) {
                    bArr[i2] = new byte[0];
                } else if (objArr[i2] instanceof Long) {
                    bArr[i2] = String.valueOf(((Number) objArr[i2]).longValue()).getBytes("UTF-8");
                } else if (objArr[i2] instanceof Integer) {
                    bArr[i2] = String.valueOf(((Number) objArr[i2]).intValue()).getBytes("UTF-8");
                } else if (objArr[i2] instanceof byte[]) {
                    bArr[i2] = objArr[i2];
                } else if (objArr[i2] instanceof String) {
                    bArr[i2] = ((String) objArr[i2]).getBytes("UTF-8");
                } else {
                    throw new IllegalArgumentException(C014406v.A01("PaymentPinHelper", "constructPayload: should only accept long, byte[], and String args"));
                }
                i += bArr[i2].length;
            } catch (UnsupportedEncodingException e) {
                StringBuilder sb = new StringBuilder(" UTF-8 not supported: ");
                sb.append(e);
                Log.e(C014406v.A01("PaymentPinHelper", sb.toString()));
                throw new Error(e);
            }
        }
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            Object[] objArr2 = bArr[i4];
            System.arraycopy(objArr2, 0, bArr2, i3, objArr2.length);
            i3 += objArr2.length;
        }
        return bArr2;
    }

    public final void A01(String str, final AnonymousClass495 anonymousClass495, final AnonymousClass496 anonymousClass496) {
        C77343i3 A02 = this.A07.A02(str, "PIN", true);
        if (A02 == null) {
            this.A00.A00(str, new C48Q() { // from class: X.4Cf
                @Override // X.C48Q
                public void AJs(C28Q c28q) {
                    AnonymousClass496 anonymousClass4962 = anonymousClass496;
                    if (anonymousClass4962 != null) {
                        anonymousClass4962.AO5(c28q);
                    }
                }

                @Override // X.C48Q
                public void AO6(C77343i3 c77343i3) {
                    anonymousClass495.AO7(new C49A(c77343i3));
                }
            });
        } else {
            anonymousClass495.AO7(new C49A(A02));
        }
    }

    public /* synthetic */ void A02(String str, final AnonymousClass496 anonymousClass496, final C49A c49a) {
        this.A06.A01(c49a, str, new InterfaceC895747n() { // from class: X.4Cg
            {
                AnonymousClass498.this = this;
            }

            @Override // X.InterfaceC895747n
            public void AJs(C28Q c28q) {
                AnonymousClass496 anonymousClass4962 = anonymousClass496;
                if (anonymousClass4962 != null) {
                    anonymousClass4962.AO5(c28q);
                }
            }

            @Override // X.InterfaceC895747n
            public void API(String str2) {
                AnonymousClass498 anonymousClass498 = AnonymousClass498.this;
                C49A c49a2 = c49a;
                AnonymousClass496 anonymousClass4962 = anonymousClass496;
                anonymousClass498.A08.A05("[Set PIN] called");
                C49B c49b = anonymousClass498.A01;
                c49b.A01.A0F("set", new C02590Ca("account", new C04P[]{new C04P("action", "create-payment-pin", null, (byte) 0)}, c49a2.A00(C49B.A00("CREATE", null, null, c49b.A00.A05() / 1000, str2, null, new Object[0]))), new C92264If(anonymousClass498, anonymousClass498.A04.A00, anonymousClass498.A02, anonymousClass498.A03, anonymousClass498.A05, anonymousClass4962, c49a2), 30000L);
            }
        });
    }

    public /* synthetic */ void A03(String str, final AnonymousClass496 anonymousClass496, final C49A c49a) {
        this.A06.A01(c49a, str, new InterfaceC895747n() { // from class: X.4Ce
            {
                AnonymousClass498.this = this;
            }

            @Override // X.InterfaceC895747n
            public void AJs(C28Q c28q) {
                AnonymousClass496 anonymousClass4962 = anonymousClass496;
                if (anonymousClass4962 != null) {
                    anonymousClass4962.AO5(c28q);
                }
            }

            @Override // X.InterfaceC895747n
            public void API(String str2) {
                AnonymousClass498 anonymousClass498 = AnonymousClass498.this;
                C49A c49a2 = c49a;
                AnonymousClass496 anonymousClass4962 = anonymousClass496;
                String A02 = anonymousClass498.A09.A02(2);
                C49B c49b = anonymousClass498.A01;
                c49b.A01.A0F("set", new C02590Ca("account", new C04P[]{new C04P("action", "delete-payment-bio", null, (byte) 0)}, c49a2.A00(C49B.A00("DELETEBIO", Boolean.TRUE, str2, c49b.A00.A05() / 1000, null, null, new Object[0]))), new C92254Ie(anonymousClass498, anonymousClass498.A04.A00, anonymousClass498.A02, anonymousClass498.A03, anonymousClass498.A05, anonymousClass4962, A02, c49a2), 30000L);
            }
        });
    }

    public /* synthetic */ void A04(String str, final AnonymousClass496 anonymousClass496, final C49A c49a) {
        this.A06.A01(c49a, str, new InterfaceC895747n() { // from class: X.4Cl
            {
                AnonymousClass498.this = this;
            }

            @Override // X.InterfaceC895747n
            public void AJs(C28Q c28q) {
                AnonymousClass496 anonymousClass4962 = anonymousClass496;
                if (anonymousClass4962 != null) {
                    anonymousClass4962.AO5(c28q);
                }
            }

            @Override // X.InterfaceC895747n
            public void API(String str2) {
                AnonymousClass498 anonymousClass498 = AnonymousClass498.this;
                C49A c49a2 = c49a;
                AnonymousClass496 anonymousClass4962 = anonymousClass496;
                AnonymousClass493 anonymousClass493 = anonymousClass498.A09;
                try {
                    Pair pair = new Pair(anonymousClass493.A02(2), AnonymousClass088.A13());
                    Object obj = pair.second;
                    if (obj != null) {
                        anonymousClass498.A08.A05("[Set Touch ID] success");
                        C49B c49b = anonymousClass498.A01;
                        byte[] encoded = ((PublicKey) obj).getEncoded();
                        c49b.A01.A0F("set", new C02590Ca("account", new C04P[]{new C04P("action", "set-payment-bio", null, (byte) 0)}, c49a2.A00(C49B.A00("SETBIO", Boolean.TRUE, str2, c49b.A00.A05() / 1000, null, encoded, new Object[0]))), new C92244Id(anonymousClass498, anonymousClass498.A04.A00, anonymousClass498.A02, anonymousClass498.A03, anonymousClass498.A05, anonymousClass4962, (String) pair.first, c49a2), 30000L);
                        return;
                    }
                    anonymousClass498.A08.A05("[Set Touch ID] failure");
                } catch (RuntimeException e) {
                    anonymousClass493.A02(0);
                    throw e;
                }
            }
        });
    }

    public /* synthetic */ void A05(String str, final AnonymousClass496 anonymousClass496, final C49A c49a) {
        this.A06.A01(c49a, str, new InterfaceC895747n() { // from class: X.4Ch
            {
                AnonymousClass498.this = this;
            }

            @Override // X.InterfaceC895747n
            public void AJs(C28Q c28q) {
                AnonymousClass496 anonymousClass4962 = anonymousClass496;
                if (anonymousClass4962 != null) {
                    anonymousClass4962.AO5(c28q);
                }
            }

            @Override // X.InterfaceC895747n
            public void API(String str2) {
                AnonymousClass498 anonymousClass498 = AnonymousClass498.this;
                C49A c49a2 = c49a;
                AnonymousClass496 anonymousClass4962 = anonymousClass496;
                C49B c49b = anonymousClass498.A01;
                C92274Ig c92274Ig = new C92274Ig(anonymousClass498, anonymousClass498.A04.A00, anonymousClass498.A02, anonymousClass498.A03, anonymousClass498.A05, anonymousClass4962, c49a2);
                if (c49b != null) {
                    c49b.A01.A0F("get", new C02590Ca("account", new C04P[]{new C04P("action", "verify-payment-pin", null, (byte) 0)}, c49a2.A00(C49B.A00("VERIFY", Boolean.TRUE, str2, c49b.A00.A05() / 1000, null, null, new Object[0]))), c92274Ig, 30000L);
                    return;
                }
                throw null;
            }
        });
    }

    public /* synthetic */ void A06(String str, final AnonymousClass497 anonymousClass497, final C49A c49a) {
        this.A06.A01(c49a, str, new InterfaceC895747n() { // from class: X.4Ci
            {
                AnonymousClass498.this = this;
            }

            @Override // X.InterfaceC895747n
            public void AJs(C28Q c28q) {
                anonymousClass497.AO8(null, c28q);
            }

            @Override // X.InterfaceC895747n
            public void API(String str2) {
                anonymousClass497.AO8(c49a.A00(C49B.A00("REMOVEMETHOD", Boolean.TRUE, str2, AnonymousClass498.this.A01.A00.A05() / 1000, null, null, new Object[0])), null);
            }
        });
    }

    public /* synthetic */ void A07(String str, String str2, final AnonymousClass496 anonymousClass496, final C49A c49a) {
        C895947p c895947p = this.A06;
        String[] strArr = {str, str2};
        InterfaceC895847o interfaceC895847o = new InterfaceC895847o() { // from class: X.4Ck
            {
                AnonymousClass498.this = this;
            }

            @Override // X.InterfaceC895847o
            public void AJs(C28Q c28q) {
                AnonymousClass496 anonymousClass4962 = anonymousClass496;
                if (anonymousClass4962 != null) {
                    anonymousClass4962.AO5(c28q);
                }
            }

            @Override // X.InterfaceC895847o
            public void APL(String[] strArr2) {
                AnonymousClass498 anonymousClass498 = AnonymousClass498.this;
                C49A c49a2 = c49a;
                String str3 = strArr2[0];
                String str4 = strArr2[1];
                AnonymousClass496 anonymousClass4962 = anonymousClass496;
                C49B c49b = anonymousClass498.A01;
                c49b.A01.A0F("set", new C02590Ca("account", new C04P[]{new C04P("action", "change-payment-pin", null, (byte) 0)}, c49a2.A00(C49B.A00("CHANGE", Boolean.TRUE, str3, c49b.A00.A05() / 1000, str4, null, new Object[0]))), new C92284Ih(anonymousClass498, anonymousClass498.A04.A00, anonymousClass498.A02, anonymousClass498.A03, anonymousClass498.A05, anonymousClass4962, c49a2), 30000L);
            }
        };
        if ("token".equals(c49a.A00.A03)) {
            C895647m c895647m = new C895647m(2, interfaceC895847o);
            for (int i = 0; i < 2; i++) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C0FK("fbpay_pin", strArr[i]));
                c895947p.A05.ARy(new C4GL(c895947p.A03, c895947p.A01, c895947p.A04, c895947p.A00, c895947p.A02, arrayList, null, i, c895647m), new Void[0]);
            }
            return;
        }
        interfaceC895847o.APL(strArr);
    }

    public /* synthetic */ void A08(String str, final String str2, final AnonymousClass497 anonymousClass497, final C49A c49a) {
        this.A06.A01(c49a, str, new InterfaceC895747n() { // from class: X.4Cj
            {
                AnonymousClass498.this = this;
            }

            @Override // X.InterfaceC895747n
            public void AJs(C28Q c28q) {
                anonymousClass497.AO8(null, c28q);
            }

            @Override // X.InterfaceC895747n
            public void API(String str3) {
                anonymousClass497.AO8(c49a.A00(C49B.A00(str2, Boolean.TRUE, str3, AnonymousClass498.this.A01.A00.A05() / 1000, null, null, new Object[0])), null);
            }
        });
    }
}
