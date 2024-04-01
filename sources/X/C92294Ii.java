package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.payments.ui.BrazilPaymentSettingsActivity;
import com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Ii  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C92294Ii extends AbstractC91964Gz {
    public static volatile C92294Ii A0F;
    public C28T A00;
    public final C018508q A01;
    public final C02L A02;
    public final C01B A03;
    public final AnonymousClass012 A04;
    public final C001200o A05;
    public final C002301c A06;
    public final C4BZ A07;
    public final C47Z A08;
    public final C41751uS A09;
    public final C0GZ A0A;
    public final C03550Gd A0B;
    public final C0DW A0C;
    public final C49G A0D;
    public final C49I A0E;

    @Override // X.C0DX
    public String AC1() {
        return null;
    }

    @Override // X.C0DX
    public int AD6() {
        return 2;
    }

    @Override // X.C0DX
    public boolean AFA() {
        return true;
    }

    @Override // X.C0DX
    public boolean AFy(C69173Nk c69173Nk) {
        return true;
    }

    public C92294Ii(C001200o c001200o, AnonymousClass012 anonymousClass012, C018508q c018508q, C02L c02l, C01B c01b, C002301c c002301c, C0DV c0dv, C4BZ c4bz, C0GZ c0gz, C49G c49g, C0DW c0dw, C47Z c47z, C41751uS c41751uS, C03550Gd c03550Gd, C49I c49i) {
        super(c0dv);
        this.A00 = new C28T() { // from class: X.4Cq
            @Override // X.C28T
            public void AG6(int i, C28Q c28q) {
            }

            @Override // X.C28T
            public void AKk(C28Q c28q) {
            }

            @Override // X.C28T
            public void AKp(C28Q c28q) {
            }

            @Override // X.C28T
            public void AKq(C28Q c28q) {
            }

            @Override // X.C28T
            public void AV3() {
            }

            @Override // X.C28T
            public void reset() {
            }
        };
        this.A05 = c001200o;
        this.A04 = anonymousClass012;
        this.A01 = c018508q;
        this.A02 = c02l;
        this.A03 = c01b;
        this.A06 = c002301c;
        this.A07 = c4bz;
        this.A0A = c0gz;
        this.A0D = c49g;
        this.A0C = c0dw;
        this.A08 = c47z;
        this.A09 = c41751uS;
        this.A0B = c03550Gd;
        this.A0E = c49i;
    }

    public static C92294Ii A00() {
        if (A0F == null) {
            synchronized (C92294Ii.class) {
                if (A0F == null) {
                    C001200o c001200o = C001200o.A01;
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C018508q A002 = C018508q.A00();
                    C02L A003 = C02L.A00();
                    C01B A004 = C01B.A00();
                    C002301c A005 = C002301c.A00();
                    C0DV A006 = C0DV.A00();
                    C4BZ A007 = C4BZ.A00();
                    C0GZ A008 = C0GZ.A00();
                    C49G A009 = C49G.A00();
                    C0DW A0010 = C0DW.A00();
                    if (C47Z.A03 == null) {
                        synchronized (C47Z.class) {
                            if (C47Z.A03 == null) {
                                C47Z.A03 = new C47Z(C013406l.A00(), C48z.A00(), C47Y.A00());
                            }
                        }
                    }
                    A0F = new C92294Ii(c001200o, A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, C47Z.A03, C41751uS.A00, C03550Gd.A00(), C49I.A00());
                }
            }
        }
        return A0F;
    }

    @Override // X.C0DX
    public Class A8G() {
        return BrazilPaymentCardDetailsActivity.class;
    }

    @Override // X.C0DX
    public InterfaceC03660Go A9B() {
        return this.A07;
    }

    @Override // X.C0DX
    public InterfaceC06790Va A9D() {
        return new C90454Bb(this.A06, this.A0C);
    }

    @Override // X.C0DY
    public C2GP A9E() {
        final AnonymousClass012 anonymousClass012 = this.A04;
        final C018508q c018508q = this.A01;
        final C0DV c0dv = super.A00;
        final C0GZ c0gz = this.A0A;
        final C49G c49g = this.A0D;
        final C41751uS c41751uS = this.A09;
        final C03550Gd c03550Gd = this.A0B;
        return new C2GP(anonymousClass012, c018508q, c0dv, c0gz, c49g, c41751uS, c03550Gd) { // from class: X.4Bc
            public final C018508q A00;
            public final AnonymousClass012 A01;
            public final C41751uS A02;
            public final C0GZ A03;
            public final C03550Gd A04;
            public final C0DV A05;
            public final C49G A06;

            @Override // X.C2GP
            public byte[] AKz(C0N2 c0n2) {
                return null;
            }

            {
                this.A01 = anonymousClass012;
                this.A00 = c018508q;
                this.A05 = c0dv;
                this.A03 = c0gz;
                this.A06 = c49g;
                this.A02 = c41751uS;
                this.A04 = c03550Gd;
            }

            @Override // X.C2GP
            public void A5L(List list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C0N2 c0n2 = (C0N2) it.next();
                    int A08 = c0n2.A08();
                    if (A08 != 1 && A08 != 4) {
                        if (A08 == 5) {
                            C03550Gd c03550Gd2 = this.A04;
                            c03550Gd2.A05(c03550Gd2.A01("add_business"));
                        } else if (A08 != 6 && A08 != 7) {
                            StringBuilder sb = new StringBuilder("PAY: Not supported method type for Brazil: ");
                            sb.append(c0n2);
                            Log.w(sb.toString());
                        }
                    }
                    C0GZ c0gz2 = this.A03;
                    c0gz2.A05(c0gz2.A01("add_card"));
                }
                this.A00.A0G(new RunnableEBaseShape8S0100000_I1_0(this.A02, 48));
            }

            @Override // X.C2GP
            public C0N2 A5e(C0N2 c0n2) {
                C0N0 c0n0;
                C0N0 c0n02;
                int A08 = c0n2.A08();
                if (A08 != 1 && A08 != 4) {
                    if (A08 == 5) {
                        C92234Ic c92234Ic = (C92234Ic) c0n2.A06;
                        if (c92234Ic != null) {
                            C0DV c0dv2 = this.A05;
                            c0dv2.A04();
                            C0N2 A082 = c0dv2.A08.A08(c0n2.A07);
                            if (A082 != null && (c0n02 = A082.A06) != null) {
                                C92234Ic c92234Ic2 = (C92234Ic) c0n02;
                                if (TextUtils.isEmpty(c92234Ic.A06)) {
                                    c92234Ic.A06 = c92234Ic2.A06;
                                }
                                if (TextUtils.isEmpty(c92234Ic.A08)) {
                                    c92234Ic.A08 = c92234Ic2.A08;
                                }
                                if (TextUtils.isEmpty(((AbstractC466427q) c92234Ic).A02)) {
                                    ((AbstractC466427q) c92234Ic).A02 = ((AbstractC466427q) c92234Ic2).A02;
                                }
                                if (TextUtils.isEmpty(c92234Ic.A02)) {
                                    c92234Ic.A02 = c92234Ic2.A02;
                                }
                                if (TextUtils.isEmpty(c92234Ic.A05)) {
                                    c92234Ic.A05 = c92234Ic2.A05;
                                }
                                String str = c92234Ic.A05;
                                if ("VERIFIED".equals(str) && !"VERIFIED".equals(c92234Ic2.A05)) {
                                    c92234Ic.A04 = "MERCHANT_VERIFIED";
                                    return c0n2;
                                } else if ("NEEDS_MORE_INFO".equals(str) && "VERIFYING".equals(c92234Ic2.A05)) {
                                    c92234Ic.A04 = "MERCHANT_VERIFICATION_FAILURE";
                                    return c0n2;
                                } else if ("DISABLED".equals(str) && !"DISABLED".equals(c92234Ic2.A05)) {
                                    c92234Ic.A04 = "MERCHANT_DISABLED";
                                    return c0n2;
                                }
                            }
                        } else {
                            Log.w("PAY:BrazilPaymentStorageObserver/beforeMethodAdded: methodData is null");
                            return c0n2;
                        }
                    } else if (A08 != 6 && A08 != 7) {
                        StringBuilder A0P = C000200d.A0P("PAY: method type not expected: ");
                        A0P.append(A08);
                        Log.w(A0P.toString());
                    }
                    return c0n2;
                }
                C92224Ib c92224Ib = (C92224Ib) c0n2.A06;
                if (c92224Ib != null) {
                    String str2 = c92224Ib.A09;
                    if (!TextUtils.isEmpty(str2) && c0n2.A0B != null) {
                        c0n2.A0B = C40841sx.A0o(str2);
                    }
                    C0DV c0dv3 = this.A05;
                    c0dv3.A04();
                    C0N2 A083 = c0dv3.A08.A08(c0n2.A07);
                    if (A083 != null && (c0n0 = A083.A06) != null) {
                        C92224Ib c92224Ib2 = (C92224Ib) c0n0;
                        AnonymousClass012 anonymousClass0122 = this.A01;
                        if (!c92224Ib.A0X) {
                            c92224Ib.A0T = c92224Ib2.A0T;
                            ((C0N8) c92224Ib).A02 = ((C0N8) c92224Ib2).A02;
                        }
                        if (TextUtils.isEmpty(c92224Ib.A06)) {
                            c92224Ib.A06 = c92224Ib2.A06;
                        }
                        if (TextUtils.isEmpty(c92224Ib.A03)) {
                            c92224Ib.A03 = c92224Ib2.A03;
                        }
                        if (!TextUtils.isEmpty(c92224Ib.A0C) && !c92224Ib.A0C.equals(c92224Ib2.A0C)) {
                            c92224Ib.A0E = null;
                            c92224Ib.A0D = null;
                        } else {
                            c92224Ib.A0C = c92224Ib2.A0C;
                            if (TextUtils.isEmpty(c92224Ib.A0E)) {
                                c92224Ib.A0E = c92224Ib2.A0E;
                            }
                            if (TextUtils.isEmpty(c92224Ib.A0D)) {
                                c92224Ib.A0D = c92224Ib2.A0D;
                            }
                        }
                        if (!TextUtils.isEmpty(c92224Ib.A0J) && !c92224Ib.A0J.equals(c92224Ib2.A0J)) {
                            ((C0N8) c92224Ib).A07 = Long.valueOf(anonymousClass0122.A05());
                        }
                        if (!c92224Ib2.A0X && c92224Ib.A0X) {
                            c92224Ib.A05 = "PAYMENT_METHOD_VERIFIED";
                        }
                        if (TextUtils.isEmpty(c92224Ib.A0E)) {
                            this.A06.A01(c0n2, null);
                            return c0n2;
                        }
                    }
                }
                return c0n2;
            }
        };
    }

    @Override // X.C0DX
    public C28T AA9() {
        return this.A00;
    }

    @Override // X.C0DX
    public C2EG ABu() {
        return new C2EG() { // from class: X.4Bd
            @Override // X.C2EG
            public /* synthetic */ int ADO() {
                return 0;
            }

            @Override // X.C2EG
            public ArrayList AQa(C013606n c013606n, C02590Ca c02590Ca) {
                ArrayList arrayList = new ArrayList();
                String str = c02590Ca.A00;
                if (str.equals("card-update")) {
                    try {
                        C02590Ca A0E = c02590Ca.A0E("card");
                        C92224Ib c92224Ib = new C92224Ib();
                        c92224Ib.A03(c013606n, 0, A0E);
                        arrayList.add(c92224Ib);
                        return arrayList;
                    } catch (C0L4 unused) {
                        Log.w("PAY: BrazilProtoParser/parse: no card node for card-update notification");
                    }
                } else if (str.equals("merchant-update")) {
                    try {
                        C02590Ca A0E2 = c02590Ca.A0E("merchant");
                        C92234Ic c92234Ic = new C92234Ic();
                        c92234Ic.A03(c013606n, 0, A0E2);
                        arrayList.add(c92234Ic);
                        return arrayList;
                    } catch (C0L4 unused2) {
                        Log.w("PAY: BrazilProtoParser/parse: no merchant node for merchant-update notification");
                        return arrayList;
                    }
                }
                return arrayList;
            }

            @Override // X.C2EG
            public /* synthetic */ C0CI AQb(C02590Ca c02590Ca) {
                throw new UnsupportedOperationException("Asynchronous parsing is not supported in Sync Mode");
            }
        };
    }

    @Override // X.C0DX
    public InterfaceC467528c AC0() {
        return new InterfaceC467528c() { // from class: X.4Ba
            @Override // X.InterfaceC467528c
            public long ACH() {
                return 604800000L;
            }

            @Override // X.InterfaceC467528c
            public void ARC(AnonymousClass093 anonymousClass093, C3NS c3ns, Activity activity) {
            }

            @Override // X.InterfaceC467528c
            public void AVz(String str, InterfaceC53332eX interfaceC53332eX) {
            }
        };
    }

    @Override // X.C0DX
    public C3NT AC2(final C001200o c001200o, final C0EU c0eu) {
        return new C90684Ca(c001200o, c0eu) { // from class: X.4H1
        };
    }

    @Override // X.C0DX
    public int AC3() {
        return R.string.brazil_ecosystem_name;
    }

    @Override // X.C0DX
    public InterfaceC55152jx AC5() {
        return new C90694Cb() { // from class: X.4H0
            @Override // X.InterfaceC55152jx
            public View A5p(Context context, C0N2 c0n2, String str) {
                C4DD c4dd = new C4DD(context);
                c4dd.setContactInformation(this.A02);
                return c4dd;
            }
        };
    }

    @Override // X.C0DX
    public C49H ACD() {
        return new C49H(this.A05.A00, this.A02, this.A06, super.A00);
    }

    @Override // X.C0DX
    public Class ACK() {
        return BrazilPaymentSettingsActivity.class;
    }

    @Override // X.C0DX
    public Class ACL() {
        return BrazilPaymentTransactionDetailActivity.class;
    }

    @Override // X.C0DX
    public Class AD3() {
        this.A0C.A01();
        return BrazilPaymentActivity.class;
    }

    @Override // X.C0DY
    public C0N5 AEl() {
        return new C92214Ia();
    }

    @Override // X.C0DY
    public C0TN AEn() {
        return new C91924Gv();
    }

    @Override // X.C0DY
    public C0K8 AEp() {
        return new C91934Gw();
    }

    @Override // X.C0DX
    public void AUJ(C0GR c0gr) {
        C03650Gn A02 = c0gr.A02();
        if (A02 != null) {
            String str = A02.A02;
            InterfaceC013706o interfaceC013706o = C03650Gn.A00(str).A09;
            if (str.equals(C03650Gn.A0D.A02) && interfaceC013706o.A9K().equalsIgnoreCase(C013806p.A04.A9K())) {
                interfaceC013706o.ATK(new C014006r(new BigDecimal(this.A03.A07(C01C.A3h)), interfaceC013706o.A9i()));
            }
        }
    }
}
