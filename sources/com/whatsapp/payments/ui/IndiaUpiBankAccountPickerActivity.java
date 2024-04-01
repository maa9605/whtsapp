package com.whatsapp.payments.ui;

import X.AbstractActivityC92444Kp;
import X.AbstractC05550Pe;
import X.ActivityC02290Ap;
import X.AnonymousClass241;
import X.AnonymousClass242;
import X.C000200d;
import X.C013606n;
import X.C014406v;
import X.C018508q;
import X.C02590Ca;
import X.C04P;
import X.C05V;
import X.C07A;
import X.C0C9;
import X.C0DV;
import X.C0EU;
import X.C0N0;
import X.C0N5;
import X.C0N6;
import X.C0U1;
import X.C1O1;
import X.C28Q;
import X.C28S;
import X.C2Lw;
import X.C36971lf;
import X.C37041lm;
import X.C37311mD;
import X.C3NV;
import X.C40841sx;
import X.C41451tw;
import X.C464626x;
import X.C468228k;
import X.C48B;
import X.C48F;
import X.C49682Lx;
import X.C49F;
import X.C49M;
import X.C49N;
import X.C4AS;
import X.C4CG;
import X.C4CV;
import X.C4CW;
import X.C4IA;
import X.C4IY;
import X.C4KG;
import X.C4L6;
import X.C77113hg;
import X.C894947f;
import X.C90564Bm;
import X.C90944Da;
import X.InterfaceC03640Gm;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendPaymentInviteOrSetupJob;
import com.whatsapp.jobqueue.job.SendPaymentInviteSetupJob;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class IndiaUpiBankAccountPickerActivity extends C4L6 implements InterfaceC03640Gm, C48F {
    public View A00;
    public ListView A01;
    public C018508q A02;
    public C013606n A03;
    public C41451tw A04;
    public C4IA A05;
    public C894947f A06;
    public C90564Bm A07;
    public C464626x A08;
    public C28S A09;
    public C3NV A0A;
    public C0DV A0B;
    public C4CG A0C;
    public C4CV A0D;
    public C2Lw A0E;
    public C4CW A0F;
    public C4AS A0G;
    public C49682Lx A0H;
    public AnonymousClass241 A0I;
    public String A0J;
    public ArrayList A0K;
    public List A0L;
    public final C014406v A0O = C014406v.A00("IndiaUpiBankAccountPickerActivity", "onboarding", "IN");
    public final C37041lm A0M = new C37041lm();
    public final C37311mD A0N = new C37311mD();

    @Override // X.AbstractActivityC92444Kp, X.ActivityC02290Ap
    public void A10(int i) {
        ListView listView = this.A01;
        if (listView != null) {
            listView.setEnabled(true);
        }
        if (i == R.string.payments_add_bank_success) {
            if (((AbstractActivityC92444Kp) this).A03 != null) {
                Intent intent = new Intent();
                intent.putExtra("extra_bank_account", ((AbstractActivityC92444Kp) this).A03);
                C0N0 c0n0 = ((AbstractActivityC92444Kp) this).A03.A06;
                if (c0n0 != null) {
                    intent.putExtra("extra_is_pin_set", ((C4IA) c0n0).A0G);
                }
                setResult(-1, intent);
            }
            A1W();
            finish();
            return;
        }
        A1W();
        finish();
    }

    public /* synthetic */ void A1a() {
        this.A0G.A00(this);
    }

    public final void A1b(int i) {
        C014406v c014406v = this.A0O;
        StringBuilder sb = new StringBuilder("showSuccessAndFinish: resId ");
        sb.append(i);
        c014406v.A07(null, sb.toString(), null);
        A1X();
        if (i == 0) {
            i = R.string.payments_setup_error;
            if ("upi-register-vpa".equalsIgnoreCase(this.A0A.A03)) {
                i = R.string.payments_error_vpa_handle;
            }
        }
        if (!((AbstractActivityC92444Kp) this).A0G) {
            AUj(i);
            return;
        }
        A1W();
        Intent intent = new Intent(this, IndiaUpiBankAccountLinkingRetryActivity.class);
        intent.putExtra("error", i);
        A1Z(intent);
        A14(intent);
        finish();
    }

    public void A1c(AdapterView adapterView, View view, int i) {
        this.A00 = view;
        adapterView.setEnabled(false);
        A1Y();
        C4IA c4ia = (C4IA) this.A0K.get(i);
        this.A05 = c4ia;
        C4CG c4cg = this.A0C;
        boolean z = ((AbstractActivityC92444Kp) this).A0G;
        C49F c49f = new C49F() { // from class: X.3iu
            {
                IndiaUpiBankAccountPickerActivity.this = this;
            }

            @Override // X.C49F
            public final void AGP() {
                IndiaUpiBankAccountPickerActivity.this.A1a();
            }
        };
        if (c4cg != null) {
            Log.i("PAY: IndiaUpiPaymentSetup registerVpa called");
            C3NV c3nv = ((C48B) c4cg).A00;
            c3nv.A04("upi-register-vpa");
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(c4ia.A0D)) {
                arrayList.add(new C04P("vpa", c4ia.A0D, null, (byte) 0));
            }
            if (!TextUtils.isEmpty(c4ia.A0E)) {
                arrayList.add(new C04P("vpa-id", c4ia.A0E, null, (byte) 0));
            }
            arrayList.add(new C04P("action", "upi-register-vpa", null, (byte) 0));
            arrayList.add(new C04P("device-id", c4cg.A0A.A02(), null, (byte) 0));
            String str = c4ia.A0A;
            if (str == null) {
                str = "";
            }
            arrayList.add(new C04P("upi-bank-info", str, null, (byte) 0));
            arrayList.add(new C04P("default-debit", z ? "1" : "0", null, (byte) 0));
            arrayList.add(new C04P("default-credit", z ? "1" : "0", null, (byte) 0));
            String A03 = c4cg.A06.A03();
            if (!TextUtils.isEmpty(A03)) {
                C000200d.A1A("provider-type", A03, arrayList);
            }
            c4cg.A00 = c4ia;
            ((C48B) c4cg).A01.A0F("set", new C02590Ca("account", (C04P[]) arrayList.toArray(new C04P[0]), null, null), new C4IY(c4cg, c4cg.A02, c4cg.A03, c4cg.A04, c4cg.A08, c3nv, c49f), 0L);
            this.A0D.A03.A04();
            this.A0F.A03.A04();
            C37041lm c37041lm = this.A0M;
            Long valueOf = Long.valueOf(i);
            c37041lm.A01 = valueOf;
            ((AbstractActivityC92444Kp) this).A04.A07(c37041lm);
            C37311mD c37311mD = this.A0N;
            c37311mD.A0B = valueOf;
            c37311mD.A04 = 5;
            c37311mD.A0P = "nav_select_account";
            ((AbstractActivityC92444Kp) this).A04.A07(c37311mD);
            return;
        }
        throw null;
    }

    public final void A1d(C0N6 c0n6) {
        C014406v c014406v = this.A0O;
        StringBuilder A0P = C000200d.A0P("showSuccessAndFinish: ");
        A0P.append(this.A0A.toString());
        c014406v.A07(null, A0P.toString(), null);
        A1X();
        ((AbstractActivityC92444Kp) this).A03 = c0n6;
        if (!((AbstractActivityC92444Kp) this).A0G) {
            AUj(R.string.payments_add_bank_success);
            return;
        }
        A1W();
        finish();
        Intent intent = new Intent(this, IndiaUpiPaymentsAccountSetupActivity.class);
        A1Z(intent);
        A14(intent);
    }

    public void A1e(C0N6 c0n6, C28Q c28q) {
        int i;
        C014406v c014406v = this.A0O;
        StringBuilder sb = new StringBuilder("onRegisterVpa registered: ");
        sb.append(c0n6);
        c014406v.A03(sb.toString());
        C36971lf A01 = this.A0D.A01(5);
        if (!TextUtils.isEmpty(this.A07.A03())) {
            this.A0D.A04(this.A07.A03());
        }
        if (c28q != null) {
            A01.A05 = String.valueOf(c28q.A00);
            A01.A06 = c28q.A06;
        }
        A01.A01 = Integer.valueOf(c28q != null ? 2 : 1);
        C4IA c4ia = this.A05;
        A01.A04 = c4ia != null ? c4ia.A09 : "";
        ((AbstractActivityC92444Kp) this).A04.A0B(A01, null, false);
        StringBuilder sb2 = new StringBuilder("logRegisterVpa: ");
        sb2.append(A01);
        c014406v.A03(sb2.toString());
        C37311mD A012 = this.A0F.A01(5);
        if (!TextUtils.isEmpty(this.A07.A03())) {
            this.A0F.A04(this.A07.A03());
        }
        if (c28q != null) {
            A012.A0M = String.valueOf(c28q.A00);
            A012.A0N = c28q.A06;
            i = 2;
        } else {
            i = 1;
        }
        A012.A07 = Integer.valueOf(i);
        C4IA c4ia2 = this.A05;
        A012.A0I = c4ia2 != null ? c4ia2.A09 : "";
        ((AbstractActivityC92444Kp) this).A04.A0B(A012, null, false);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("logRegisterVpa: ");
        sb3.append(A012);
        c014406v.A03(sb3.toString());
        if (c0n6 != null) {
            C464626x c464626x = this.A08;
            UserJid userJid = ((C4KG) this).A09;
            Iterator it = ((AbstractCollection) c464626x.A04.A0C()).iterator();
            while (it.hasNext()) {
                UserJid userJid2 = (UserJid) it.next();
                c464626x.A00.A00.A01(new SendPaymentInviteOrSetupJob(userJid2, false));
                c464626x.A04.A0G(userJid2, false);
            }
            C0EU c0eu = c464626x.A04;
            for (UserJid userJid3 : ((AbstractMap) c0eu.A09()).keySet()) {
                c464626x.A00.A00.A01(new SendPaymentInviteSetupJob(userJid3, 3, userJid3.equals(userJid)));
                c0eu.A0G(userJid3, true);
            }
            if (userJid != null) {
                C07A c07a = c464626x.A07;
                long A05 = c464626x.A01.A05();
                C05V c05v = c07a.A05;
                AbstractC05550Pe abstractC05550Pe = (AbstractC05550Pe) C07A.A00(C05V.A00(c05v.A01, c05v.A00, userJid, false), A05, 65, c07a.A00);
                abstractC05550Pe.A00 = 3;
                abstractC05550Pe.A01 = true;
                C0C9 c0c9 = c464626x.A02;
                c0c9.A0F.A01(new C1O1(c0c9, abstractC05550Pe, 16), 26);
            }
            A1d(c0n6);
        } else if (c28q != null && c28q.A00 == 11472) {
            ((C4KG) this).A0C.A05(2, this);
        } else {
            A1b(C90944Da.A00(0, this.A0A));
        }
    }

    @Override // X.InterfaceC03640Gm
    public void ANw(C28Q c28q) {
        C014406v c014406v = this.A0O;
        StringBuilder sb = new StringBuilder("getPaymentMethods. paymentNetworkError: ");
        sb.append(c28q);
        c014406v.A07(null, sb.toString(), null);
        A1b(C90944Da.A00(c28q.A00, this.A0A));
    }

    @Override // X.InterfaceC03640Gm
    public void AO1(C28Q c28q) {
        C014406v c014406v = this.A0O;
        StringBuilder sb = new StringBuilder("getPaymentMethods. paymentNetworkError: ");
        sb.append(c28q);
        c014406v.A07(null, sb.toString(), null);
        if (C90944Da.A03(this, "upi-register-vpa", c28q.A00, true)) {
            return;
        }
        A1b(C90944Da.A00(c28q.A00, this.A0A));
    }

    @Override // X.InterfaceC03640Gm
    public void AO2(C468228k c468228k) {
        C014406v c014406v = this.A0O;
        StringBuilder A0P = C000200d.A0P("getPaymentMethods. onResponseSuccess: ");
        A0P.append(c468228k.A02);
        c014406v.A07(null, A0P.toString(), null);
        List list = ((C77113hg) c468228k).A00;
        if (list != null && !list.isEmpty()) {
            ((C4KG) this).A0B.A05(((C4KG) this).A0B.A01("add_bank"));
            A1d(null);
            return;
        }
        A1b(C90944Da.A00(0, this.A0A));
    }

    @Override // X.AbstractActivityC92444Kp, X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        this.A0O.A07(null, "onBackPressed", null);
        ArrayList<? extends Parcelable> arrayList = this.A06.A06;
        if (arrayList != null) {
            Intent intent = new Intent(this, IndiaUpiBankPickerActivity.class);
            intent.putParcelableArrayListExtra("extra_banks_list", arrayList);
            A1Z(intent);
            startActivity(intent);
        }
        finish();
        C37041lm c37041lm = this.A0M;
        c37041lm.A00 = Boolean.TRUE;
        ((AbstractActivityC92444Kp) this).A04.A07(c37041lm);
        C37311mD c37311mD = this.A0N;
        c37311mD.A04 = 1;
        c37311mD.A0P = "nav_select_account";
        ((AbstractActivityC92444Kp) this).A04.A07(c37311mD);
    }

    @Override // X.C4L6, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        getWindow().addFlags(8192);
        super.onCreate(bundle);
        this.A0G = new C4AS(((C4KG) this).A0B);
        if (getIntent().getExtras() != null) {
            this.A0K = getIntent().getExtras().getParcelableArrayList("extra_accounts_list");
            this.A0J = getIntent().getExtras().getString("extra_selected_account_bank_logo");
            C3NV c3nv = this.A06.A04;
            this.A0A = c3nv;
            c3nv.A02("upi-bank-account-picker");
            this.A0C = new C4CG(this, this.A02, this.A0H, this.A0B, ((ActivityC02290Ap) this).A0D, ((C4KG) this).A0B, this.A03, this.A06, ((C4KG) this).A0C, this.A09, this.A07, this);
            File file = new File(getCacheDir(), "BankLogos");
            if (!file.mkdirs() && !file.isDirectory()) {
                this.A0O.A07(null, "BankAccountPickerUI/create unable to create bank logos cache directory", null);
            }
            AnonymousClass242 anonymousClass242 = new AnonymousClass242(this.A02, this.A04, file);
            anonymousClass242.A01 = getResources().getDimensionPixelSize(R.dimen.india_upi_bank_picker_thumb_size);
            this.A0I = anonymousClass242.A00();
            C37041lm c37041lm = this.A0M;
            String str = this.A0E.A02;
            c37041lm.A03 = str;
            C37311mD c37311mD = this.A0N;
            c37311mD.A0O = str;
            setContentView(R.layout.india_upi_bank_account_picker);
            this.A0L = new ArrayList();
            ArrayList arrayList = this.A0K;
            c37041lm.A02 = Long.valueOf(arrayList != null ? arrayList.size() : 0L);
            c37311mD.A0C = Long.valueOf(arrayList != null ? arrayList.size() : 0L);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C4IA c4ia = (C4IA) it.next();
                this.A0L.add(new C49M(c4ia.A06, C40841sx.A0M(((C0N5) c4ia).A06), ((C0N5) c4ia).A05));
            }
            C0U1 A0c = A0c();
            if (A0c != null) {
                A0c.A0L(true);
                A0c.A08(R.string.payments_bank_account_picker_activity_title);
            }
            if (this.A0L != null) {
                this.A01 = (ListView) findViewById(R.id.bank_account_picker_list);
                C49N c49n = new C49N(this, this);
                this.A01.setAdapter((ListAdapter) c49n);
                c49n.A00 = this.A0L;
                c49n.notifyDataSetChanged();
                this.A01.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: X.3P0
                    {
                        IndiaUpiBankAccountPickerActivity.this = this;
                    }

                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                        IndiaUpiBankAccountPickerActivity.this.A1c(adapterView, view, i);
                    }
                });
            }
            ((TextView) findViewById(R.id.footer_processed_by_psp)).setText(getString(R.string.payments_processed_by_psp, getString(C40841sx.A0A(this.A07.A03()).A01)));
            return;
        }
        throw null;
    }

    @Override // X.C4KG, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A0C.A01 = null;
        this.A0B.A05(this);
        this.A0I.A00();
    }

    @Override // X.AbstractActivityC92444Kp, X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        this.A0O.A07(null, "action bar home", null);
        ArrayList<? extends Parcelable> arrayList = this.A06.A06;
        if (arrayList != null) {
            Intent intent = new Intent(this, IndiaUpiBankPickerActivity.class);
            intent.putParcelableArrayListExtra("extra_banks_list", arrayList);
            A1Z(intent);
            startActivity(intent);
        }
        finish();
        return true;
    }
}
