package com.whatsapp.payments.ui;

import X.AbstractActivityC92484Li;
import X.ActivityC02290Ap;
import X.C000200d;
import X.C002701i;
import X.C013606n;
import X.C014006r;
import X.C014406v;
import X.C018508q;
import X.C019208x;
import X.C019308y;
import X.C02L;
import X.C0DV;
import X.C0E7;
import X.C0GR;
import X.C0GZ;
import X.C0N6;
import X.C28661Tc;
import X.C28Q;
import X.C28S;
import X.C463026g;
import X.C49682Lx;
import X.C4A3;
import X.C4CB;
import X.C4CE;
import X.C4CV;
import X.C4F7;
import X.C4GI;
import X.C4KG;
import X.C4Lo;
import X.C894947f;
import X.C900749o;
import X.C900849p;
import X.C901249t;
import X.C90564Bm;
import X.C90944Da;
import X.InterfaceC05620Pl;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;

/* loaded from: classes3.dex */
public class IndiaUpiCheckBalanceActivity extends C4Lo {
    public C0N6 A00;
    public C013606n A01;
    public C28S A02;
    public C4F7 A03;
    public C901249t A04;
    public String A05;
    public String A06;
    public String A07;
    public final C014406v A08 = C014406v.A00("IndiaUpiCheckPinActivity", "payment-settings", "IN");

    @Override // X.C48E
    public void AOZ(C28Q c28q) {
    }

    public void A1n(C900849p c900849p) {
        int i = c900849p.A00;
        if (i == 0) {
            A1m(c900849p.A05, c900849p.A04, this.A07, c900849p.A01, 3, c900849p.A06);
        } else if (i == 1) {
            finish();
            overridePendingTransition(0, 0);
        } else if (i == 2) {
            this.A05 = c900849p.A02;
            C002701i.A19(this, 100);
        } else if (i == 3) {
            this.A06 = c900849p.A03;
            C002701i.A19(this, 101);
        }
    }

    public /* synthetic */ void A1o(C4A3 c4a3) {
        ARS();
        if (c4a3.A01) {
            return;
        }
        A1C(c4a3.A00);
    }

    @Override // X.C48E
    public void AIO(boolean z, boolean z2, C014006r c014006r, C014006r c014006r2, C4GI c4gi, C4GI c4gi2, C28Q c28q) {
        this.A08.A07(null, "onCheckPin called", null);
    }

    @Override // X.C48E
    public void ALJ(String str, C28Q c28q) {
        Integer num;
        if (!TextUtils.isEmpty(str)) {
            this.A08.A07(null, "onListKeys called", null);
            C900749o c900749o = new C900749o(1);
            c900749o.A01 = str;
            this.A03.A03(c900749o);
        } else if (c28q == null || C90944Da.A03(this, "upi-list-keys", c28q.A00, false)) {
        } else {
            if (((AbstractActivityC92484Li) this).A09.A07("upi-list-keys")) {
                ((AbstractActivityC92484Li) this).A05.A0B();
                ARS();
                A12(R.string.payments_still_working);
                ((AbstractActivityC92484Li) this).A0E.A00();
                return;
            }
            C014406v c014406v = this.A08;
            StringBuilder A0P = C000200d.A0P("onListKeys: ");
            if (str != null) {
                num = Integer.valueOf(str.length());
            } else {
                num = null;
            }
            A0P.append(num);
            A0P.append(" failed; ; showErrorAndFinish");
            c014406v.A07(null, A0P.toString(), null);
            finish();
        }
    }

    @Override // X.C4Lo, X.AbstractActivityC92484Li, X.C4LI, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00 = (C0N6) getIntent().getParcelableExtra("payment_bank_account");
        C018508q c018508q = ((ActivityC02290Ap) this).A0A;
        C02L c02l = ((AbstractActivityC92484Li) this).A01;
        C49682Lx c49682Lx = ((AbstractActivityC92484Li) this).A0H;
        C0DV c0dv = ((AbstractActivityC92484Li) this).A0C;
        C0E7 c0e7 = ((ActivityC02290Ap) this).A0D;
        C0GZ c0gz = ((C4KG) this).A0B;
        C894947f c894947f = ((AbstractActivityC92484Li) this).A04;
        C463026g c463026g = ((C4KG) this).A0C;
        C013606n c013606n = this.A01;
        C0GR c0gr = ((AbstractActivityC92484Li) this).A0B;
        C4CV c4cv = ((AbstractActivityC92484Li) this).A0F;
        C28S c28s = this.A02;
        C90564Bm c90564Bm = ((AbstractActivityC92484Li) this).A05;
        ((AbstractActivityC92484Li) this).A0E = new C4CE(this, c018508q, c02l, c49682Lx, c0dv, c0e7, c0gz, c894947f, c463026g, c013606n, c0gr, c4cv, c28s, c90564Bm, this);
        final C4CB c4cb = new C4CB(this, c018508q, c02l, c0dv, c49682Lx, c894947f, c0e7, c463026g, c013606n, c4cv, c28s, c90564Bm);
        final String A1U = A1U(((AbstractActivityC92484Li) this).A05.A02());
        this.A07 = A1U;
        final C901249t c901249t = this.A04;
        final C4CE c4ce = ((AbstractActivityC92484Li) this).A0E;
        final C0N6 c0n6 = this.A00;
        if (c901249t != null) {
            C4F7 c4f7 = (C4F7) C002701i.A0J(this, new C28661Tc() { // from class: X.4Hq
                @Override // X.C28661Tc, X.C0CR
                public C0MU A6e(Class cls) {
                    if (cls.isAssignableFrom(C4F7.class)) {
                        return new C4F7(this, c901249t.A0A, c4ce, c4cb, c0n6, A1U);
                    }
                    throw new IllegalArgumentException("Invalid viewModel");
                }
            }).A00(C4F7.class);
            this.A03 = c4f7;
            c4f7.A01.A05(c4f7.A00, new InterfaceC05620Pl() { // from class: X.3iv
                {
                    IndiaUpiCheckBalanceActivity.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    IndiaUpiCheckBalanceActivity.this.A1o((C4A3) obj);
                }
            });
            C4F7 c4f72 = this.A03;
            c4f72.A02.A05(c4f72.A00, new InterfaceC05620Pl() { // from class: X.3iw
                {
                    IndiaUpiCheckBalanceActivity.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    IndiaUpiCheckBalanceActivity.this.A1n((C900849p) obj);
                }
            });
            this.A03.A03(new C900749o(0));
            return;
        }
        throw null;
    }

    @Override // X.AbstractActivityC92484Li, X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i == 100) {
            C019208x c019208x = new C019208x(this);
            String str = this.A05;
            C019308y c019308y = c019208x.A01;
            c019308y.A0E = str;
            c019308y.A0J = false;
            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3P8
                {
                    IndiaUpiCheckBalanceActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    IndiaUpiCheckBalanceActivity indiaUpiCheckBalanceActivity = IndiaUpiCheckBalanceActivity.this;
                    indiaUpiCheckBalanceActivity.finish();
                    indiaUpiCheckBalanceActivity.overridePendingTransition(0, 0);
                }
            });
            return c019208x.A00();
        } else if (i != 101) {
            return super.onCreateDialog(i);
        } else {
            C019208x c019208x2 = new C019208x(this);
            String str2 = this.A06;
            C019308y c019308y2 = c019208x2.A01;
            c019308y2.A0E = str2;
            c019308y2.A0J = false;
            c019208x2.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3P9
                {
                    IndiaUpiCheckBalanceActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    IndiaUpiCheckBalanceActivity indiaUpiCheckBalanceActivity = IndiaUpiCheckBalanceActivity.this;
                    indiaUpiCheckBalanceActivity.finish();
                    indiaUpiCheckBalanceActivity.overridePendingTransition(0, 0);
                }
            });
            return c019208x2.A00();
        }
    }
}
