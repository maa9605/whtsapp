package com.whatsapp.payments.ui;

import X.AbstractActivityC92444Kp;
import X.AbstractC04890Mh;
import X.AbstractC15200oF;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass241;
import X.AnonymousClass242;
import X.C000700j;
import X.C014406v;
import X.C02160Ac;
import X.C07630Zb;
import X.C0LX;
import X.C0N5;
import X.C0U1;
import X.C2Lw;
import X.C37031ll;
import X.C37311mD;
import X.C3NV;
import X.C3P3;
import X.C4CV;
import X.C4CW;
import X.C4DS;
import X.C4DT;
import X.C4IA;
import X.C4KG;
import X.C4L7;
import X.C894947f;
import X.InterfaceC07650Zd;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiBankPickerActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class IndiaUpiBankPickerActivity extends C4L7 {
    public TextView A00;
    public RecyclerView A01;
    public C07630Zb A02;
    public C894947f A03;
    public C3NV A04;
    public C4CV A05;
    public C2Lw A06;
    public C4CW A07;
    public C4DS A08;
    public C4DT A09;
    public AnonymousClass241 A0A;
    public String A0B;
    public ArrayList A0C;
    public ArrayList A0D;
    public List A0E;
    public final C014406v A0H = C014406v.A00("IndiaUpiBankPickerActivity", "onboarding", "IN");
    public final C37031ll A0F = new C37031ll();
    public final C37311mD A0G = new C37311mD();

    @Override // X.AbstractActivityC92444Kp, X.ActivityC02290Ap
    public void A10(int i) {
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null) {
            recyclerView.setEnabled(true);
        }
        if (i != R.string.payments_bank_accounts_not_found) {
            A1W();
            finish();
        }
    }

    public /* synthetic */ void lambda$onSearchRequested$124$IndiaUpiBankPickerActivity(View view) {
        A1X();
        this.A02.A04(true);
    }

    @Override // X.AbstractActivityC92444Kp, X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (this.A02.A05()) {
            this.A02.A04(true);
            C37031ll c37031ll = this.A0F;
            c37031ll.A01 = Boolean.TRUE;
            ((AbstractActivityC92444Kp) this).A04.A07(c37031ll);
            C37311mD c37311mD = this.A0G;
            c37311mD.A02 = Boolean.TRUE;
            c37311mD.A0P = "nav_bank_select";
            c37311mD.A05 = 1;
            c37311mD.A0J = this.A0B;
            c37311mD.A04 = 1;
            ((AbstractActivityC92444Kp) this).A04.A07(c37311mD);
            return;
        }
        A1W();
        super.onBackPressed();
    }

    @Override // X.C4L7, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            ArrayList<C0N5> parcelableArrayList = extras.getParcelableArrayList("extra_banks_list");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C0N5 c0n5 : parcelableArrayList) {
                if (((C4IA) c0n5).A0H) {
                    arrayList.add(c0n5);
                } else {
                    arrayList2.add(c0n5);
                }
            }
            Collections.sort(arrayList2, new Comparator() { // from class: X.3P1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    C0N5 c0n52 = (C0N5) obj2;
                    String A0B = ((C0N5) obj).A0B();
                    if (A0B != null) {
                        String A0B2 = c0n52.A0B();
                        if (A0B2 != null) {
                            return A0B.compareTo(A0B2);
                        }
                        throw null;
                    }
                    throw null;
                }
            });
            arrayList.addAll(arrayList2);
            this.A0C = arrayList;
            File file = new File(getCacheDir(), "BankLogos");
            Character ch = null;
            if (!file.mkdirs() && !file.isDirectory()) {
                this.A0H.A07(null, "create unable to create bank logos cache directory", null);
            }
            AnonymousClass242 anonymousClass242 = new AnonymousClass242(((ActivityC02290Ap) this).A0A, ((ActivityC02290Ap) this).A0J, file);
            anonymousClass242.A04 = C02160Ac.A03(this, R.drawable.bank_logo_placeholder);
            anonymousClass242.A03 = C02160Ac.A03(this, R.drawable.bank_logo_placeholder);
            anonymousClass242.A01 = getResources().getDimensionPixelSize(R.dimen.india_upi_bank_picker_thumb_size);
            this.A0A = anonymousClass242.A00();
            setContentView(R.layout.india_upi_payment_bank_picker);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            A0k(toolbar);
            this.A02 = new C07630Zb(this, ((ActivityC02310Ar) this).A01, findViewById(R.id.search_holder), toolbar, new InterfaceC07650Zd() { // from class: X.4DO
                @Override // X.InterfaceC07650Zd
                public boolean ANY(String str) {
                    return false;
                }

                {
                    IndiaUpiBankPickerActivity.this = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v0, types: [X.4DT, X.0HS] */
                @Override // X.InterfaceC07650Zd
                public boolean ANX(String str) {
                    IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = IndiaUpiBankPickerActivity.this;
                    indiaUpiBankPickerActivity.A0B = str;
                    ArrayList A03 = C09940f2.A03(str, ((ActivityC02310Ar) indiaUpiBankPickerActivity).A01);
                    indiaUpiBankPickerActivity.A0D = A03;
                    if (A03.isEmpty()) {
                        indiaUpiBankPickerActivity.A0D = null;
                    }
                    C4DT c4dt = indiaUpiBankPickerActivity.A09;
                    if (c4dt != null) {
                        c4dt.A05(true);
                        indiaUpiBankPickerActivity.A09 = null;
                    }
                    ?? r3 = new C0HS(indiaUpiBankPickerActivity.A0D) { // from class: X.4DT
                        public final ArrayList A00;

                        {
                            this.A00 = r3 != null ? new ArrayList(r3) : null;
                        }

                        @Override // X.C0HS
                        public Object A07(Object[] objArr) {
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = this.A00;
                            if (arrayList4 != null && !arrayList4.isEmpty()) {
                                IndiaUpiBankPickerActivity indiaUpiBankPickerActivity2 = IndiaUpiBankPickerActivity.this;
                                ArrayList arrayList5 = indiaUpiBankPickerActivity2.A0C;
                                if (arrayList5 != null) {
                                    Iterator it = arrayList5.iterator();
                                    while (it.hasNext()) {
                                        C0N5 c0n52 = (C0N5) it.next();
                                        if (C09940f2.A04(c0n52.A0B(), arrayList4, ((ActivityC02310Ar) indiaUpiBankPickerActivity2).A01)) {
                                            arrayList3.add(c0n52);
                                        }
                                        if (A04()) {
                                            break;
                                        }
                                    }
                                }
                                return arrayList3;
                            }
                            arrayList3.addAll(IndiaUpiBankPickerActivity.this.A0E);
                            return arrayList3;
                        }

                        @Override // X.C0HS
                        public void A09(Object obj) {
                            List list = (List) obj;
                            IndiaUpiBankPickerActivity indiaUpiBankPickerActivity2 = IndiaUpiBankPickerActivity.this;
                            indiaUpiBankPickerActivity2.A09 = null;
                            if (list.isEmpty()) {
                                indiaUpiBankPickerActivity2.A00.setText(indiaUpiBankPickerActivity2.getString(R.string.search_no_results, indiaUpiBankPickerActivity2.A0B));
                            }
                            boolean isEmpty = list.isEmpty();
                            indiaUpiBankPickerActivity2.A01.setVisibility(isEmpty ? 8 : 0);
                            indiaUpiBankPickerActivity2.A00.setVisibility(isEmpty ? 0 : 8);
                            C4DS c4ds = indiaUpiBankPickerActivity2.A08;
                            c4ds.A00 = list;
                            ((AbstractC04890Mh) c4ds).A01.A00();
                            indiaUpiBankPickerActivity2.A01.A0Z(0);
                        }
                    };
                    indiaUpiBankPickerActivity.A09 = r3;
                    ((AbstractActivityC92444Kp) indiaUpiBankPickerActivity).A06.ARy(r3, new Void[0]);
                    return false;
                }
            });
            C0U1 A0c = A0c();
            if (A0c != null) {
                A0c.A0L(true);
                A0c.A08(R.string.payments_bank_picker_activity_title);
            }
            if (this.A0C != null) {
                this.A01 = (RecyclerView) findViewById(R.id.bank_picker_list);
                this.A00 = (TextView) findViewById(R.id.bank_picker_empty_tv);
                C4DS c4ds = new C4DS(this);
                this.A08 = c4ds;
                this.A01.setAdapter(c4ds);
                this.A01.setLayoutManager(new LinearLayoutManager(1));
                ArrayList<C0N5> arrayList3 = this.A0C;
                ArrayList arrayList4 = new ArrayList();
                for (C0N5 c0n52 : arrayList3) {
                    if (((C4IA) c0n52).A0H) {
                        arrayList4.add(c0n52);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                if (arrayList4.size() > 0) {
                    arrayList5.add(getString(R.string.payments_bank_picker_popular_banks_header));
                    arrayList5.addAll(arrayList4);
                }
                for (C0N5 c0n53 : arrayList3) {
                    if (!((C4IA) c0n53).A0H) {
                        String A0B = c0n53.A0B();
                        C000700j.A03(A0B);
                        char charAt = A0B.charAt(0);
                        if (ch == null || ch.charValue() != charAt) {
                            ch = Character.valueOf(charAt);
                            arrayList5.add(ch.toString());
                        }
                        arrayList5.add(c0n53);
                    }
                }
                this.A0E = arrayList5;
                C4DS c4ds2 = this.A08;
                c4ds2.A00 = arrayList5;
                ((AbstractC04890Mh) c4ds2).A01.A00();
            } else {
                this.A0H.A06("onboarding", "got empty banks", null);
            }
            C3NV c3nv = this.A03.A04;
            this.A04 = c3nv;
            c3nv.A02("upi-bank-picker");
            this.A05.A03.A04();
            C37031ll c37031ll = this.A0F;
            c37031ll.A08 = this.A06.A02;
            c37031ll.A02 = Boolean.FALSE;
            this.A01.A0m(new AbstractC15200oF() { // from class: X.4DP
                {
                    IndiaUpiBankPickerActivity.this = this;
                }

                @Override // X.AbstractC15200oF
                public void A00(RecyclerView recyclerView, int i) {
                    IndiaUpiBankPickerActivity.this.A0F.A02 = Boolean.TRUE;
                }
            });
            c37031ll.A00 = Boolean.valueOf(((C4KG) this).A0B.A0B("add_bank"));
            this.A07.A03.A04();
            C37311mD c37311mD = this.A0G;
            c37311mD.A0O = this.A06.A02;
            c37311mD.A01 = Boolean.FALSE;
            this.A01.A0m(new AbstractC15200oF() { // from class: X.4DQ
                {
                    IndiaUpiBankPickerActivity.this = this;
                }

                @Override // X.AbstractC15200oF
                public void A00(RecyclerView recyclerView, int i) {
                    IndiaUpiBankPickerActivity.this.A0G.A01 = Boolean.TRUE;
                }
            });
            c37311mD.A00 = Boolean.valueOf(((C4KG) this).A0B.A0B("add_bank"));
            return;
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_search, 0, ((ActivityC02310Ar) this).A01.A07(R.string.search)).setIcon(R.drawable.ic_action_search).setShowAsAction(9);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.C4KG, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C4DT c4dt = this.A09;
        if (c4dt != null) {
            c4dt.A05(true);
            this.A09 = null;
        }
        this.A0A.A00();
    }

    @Override // X.AbstractActivityC92444Kp, X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            this.A0H.A03("action bar home");
            A1W();
            finish();
            return true;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        this.A0F.A03 = Boolean.TRUE;
        this.A02.A01();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        C0LX.A05(((ActivityC02310Ar) this).A01, this.A02.A01, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), 0);
        C0LX.A05(((ActivityC02310Ar) this).A01, this.A02.A03.findViewById(R.id.search_back), (int) TypedValue.applyDimension(1, 8.0f, displayMetrics), 0);
        C07630Zb c07630Zb = this.A02;
        String string = getString(R.string.payments_bank_picker_search_query_hint);
        SearchView searchView = c07630Zb.A01;
        if (searchView != null) {
            searchView.setQueryHint(string);
        }
        findViewById(R.id.search_back).setOnClickListener(new C3P3(this));
        return false;
    }
}
