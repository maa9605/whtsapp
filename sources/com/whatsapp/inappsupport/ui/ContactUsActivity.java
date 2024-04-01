package com.whatsapp.inappsupport.ui;

import X.AbstractActivityC48892Hh;
import X.ActivityC02290Ap;
import X.AnonymousClass011;
import X.C000200d;
import X.C000400f;
import X.C002301c;
import X.C006602x;
import X.C018508q;
import X.C018808t;
import X.C02160Ac;
import X.C02590Ca;
import X.C04260Jm;
import X.C04940Mo;
import X.C04P;
import X.C05Y;
import X.C28D;
import X.C28I;
import X.C2O9;
import X.C36741lI;
import X.C40071rX;
import X.C48872He;
import X.C48882Hf;
import X.C48902Hi;
import X.C49082Ij;
import X.C55142jw;
import X.C61872wr;
import X.C61892wt;
import X.C72153Yw;
import X.C83363s0;
import X.InterfaceC002901k;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.search.verification.client.R;
import com.whatsapp.inappsupport.ui.ContactUsActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ContactUsActivity extends AbstractActivityC48892Hh implements C28D {
    public EditText A00;
    public TextView A01;
    public AppCompatCheckBox A02;
    public C04940Mo A03;
    public C018508q A04;
    public C000400f A05;
    public C002301c A06;
    public AnonymousClass011 A07;
    public C018808t A08;
    public C2O9 A09;
    public C55142jw A0C;
    public C49082Ij A0E;
    public C72153Yw A0F;
    public C40071rX A0G;
    public C006602x A0H;
    public InterfaceC002901k A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public boolean A0M;
    public C28I A0A = new C28I() { // from class: X.3D0
        {
            ContactUsActivity.this = this;
        }

        @Override // X.C28I
        public void AJl() {
            ContactUsActivity.this.A1S(null);
        }

        @Override // X.C28I
        public void AOP(C61892wt c61892wt) {
            ContactUsActivity.A00(ContactUsActivity.this, c61892wt, 1);
        }
    };
    public C28I A0B = new C28I() { // from class: X.3D1
        {
            ContactUsActivity.this = this;
        }

        @Override // X.C28I
        public void AJl() {
            ContactUsActivity.this.A1P();
        }

        @Override // X.C28I
        public void AOP(C61892wt c61892wt) {
            ContactUsActivity.A00(ContactUsActivity.this, c61892wt, 2);
        }
    };
    public C48882Hf A0D = new C48882Hf(this);

    public static void A00(ContactUsActivity contactUsActivity, C61892wt c61892wt, int i) {
        if (contactUsActivity != null) {
            int i2 = c61892wt.A00;
            if (i2 == 0) {
                if (i == 2) {
                    contactUsActivity.A1P();
                    return;
                } else {
                    contactUsActivity.A1S(null);
                    return;
                }
            }
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(new C61872wr((String) c61892wt.A04.get(i3), (String) c61892wt.A06.get(i3), null, false, (String) c61892wt.A03.get(i3), (String) c61892wt.A07.get(i3), null));
            }
            int i4 = i == 2 ? 1 : 2;
            Intent intent = new Intent(contactUsActivity, SupportTopicsActivity.class);
            intent.putParcelableArrayListExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.support_topics", arrayList);
            intent.putExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.ui_version", 2);
            intent.putExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.contact_us_action", i4);
            intent.putExtra("com.whatsapp.inappsupport.ui.ContactUsActvity.support_type", i);
            intent.putExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.debug_info", c61892wt.A01);
            contactUsActivity.startActivityForResult(intent, 11);
            return;
        }
        throw null;
    }

    public final void A1P() {
        String A0A = C000200d.A0A(this.A00);
        A1R(3, A0A);
        C49082Ij c49082Ij = this.A0E;
        String str = this.A0K;
        String str2 = this.A0J;
        String str3 = this.A0L;
        Uri[] uriArr = new Uri[0];
        boolean isChecked = this.A02.isChecked();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 0; i++) {
            Uri uri = uriArr[i];
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        c49082Ij.A00(this, str, A0A, str2, str3, arrayList, null, isChecked);
    }

    public final void A1Q(int i) {
        int length = C000200d.A0A(this.A00).getBytes().length;
        if (!this.A0M && length < 10) {
            this.A00.setBackground(C02160Ac.A03(this, R.drawable.describe_problem_edittext_bg_error));
            if (length == 0) {
                this.A01.setText(getString(R.string.describe_problem_description));
            } else {
                this.A01.setText(getString(R.string.describe_problem_description_further));
            }
            this.A01.setVisibility(0);
            return;
        }
        this.A01.setVisibility(8);
        this.A00.setBackground(C02160Ac.A03(this, R.drawable.describe_problem_edittext_state_list));
        InterfaceC002901k interfaceC002901k = this.A0I;
        C28I c28i = i == 1 ? this.A0A : this.A0B;
        C55142jw c55142jw = this.A0C;
        if (c55142jw != null && c55142jw.A00() == AsyncTask.Status.RUNNING) {
            this.A0C.A05(false);
        }
        C55142jw c55142jw2 = new C55142jw(this, this.A0H, this.A0G, this.A06, this.A03, this.A05, this.A08, ((ActivityC02290Ap) this).A0F, c28i, this.A0K, this.A0L, null, C000200d.A0A(this.A00), new Uri[0]);
        this.A0C = c55142jw2;
        interfaceC002901k.ARy(c55142jw2, new Void[0]);
    }

    public final void A1R(int i, String str) {
        C36741lI c36741lI = new C36741lI();
        c36741lI.A00 = Integer.valueOf(i);
        c36741lI.A01 = str;
        c36741lI.A02 = this.A06.A04();
        this.A07.A09(c36741lI, 1);
        AnonymousClass011.A01(c36741lI, "");
    }

    public final void A1S(String str) {
        C04P[] c04pArr;
        C02590Ca[] c02590CaArr;
        C02590Ca c02590Ca;
        String str2 = str;
        A1C(getString(R.string.support_ticket_sending));
        C2O9 c2o9 = this.A09;
        String A0A = C000200d.A0A(this.A00);
        if (!this.A02.isChecked()) {
            str2 = null;
        }
        boolean isChecked = this.A02.isChecked();
        C48882Hf c48882Hf = this.A0D;
        if (c2o9 != null) {
            StringBuilder sb = new StringBuilder("ChatSupportTicketManager/contactSupport called, shouldUploadLogs=");
            sb.append(isChecked);
            Log.i(sb.toString());
            C48902Hi c48902Hi = new C48902Hi(c2o9.A01, c2o9.A02, new C48872He(c2o9, c48882Hf, isChecked));
            C05Y c05y = c48902Hi.A02;
            String A02 = c05y.A02();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C04P("id", A02, null, (byte) 0));
            arrayList2.add(new C04P("type", "set", null, (byte) 0));
            arrayList2.add(new C04P("to", C04260Jm.A00));
            arrayList2.add(new C04P("xmlns", "fb:thrift_iq", null, (byte) 0));
            arrayList2.add(new C04P("smax_id", "3", null, (byte) 0));
            arrayList.add(new C02590Ca("description", (C04P[]) null, A0A));
            if (!TextUtils.isEmpty(str2)) {
                C000200d.A1B("debug_information_json", str2, arrayList);
            }
            if (!arrayList2.isEmpty()) {
                c04pArr = (C04P[]) arrayList2.toArray(new C04P[0]);
            } else {
                c04pArr = null;
            }
            if (!arrayList.isEmpty()) {
                c02590CaArr = (C02590Ca[]) arrayList.toArray(new C02590Ca[0]);
            } else {
                c02590CaArr = null;
            }
            if (c02590CaArr == null) {
                c02590Ca = new C02590Ca("iq", c04pArr, null, null);
            } else {
                c02590Ca = new C02590Ca("iq", c04pArr, c02590CaArr, null);
            }
            c05y.A0B(256, A02, c02590Ca, c48902Hi, 32000L);
            return;
        }
        throw null;
    }

    @Override // X.C28D
    public void ANt(boolean z) {
        finish();
    }

    public /* synthetic */ void lambda$onCreate$1839$ContactUsActivity(View view) {
        onBackPressed();
    }

    public /* synthetic */ void lambda$onCreate$1840$ContactUsActivity(View view) {
        A1Q(1);
    }

    public /* synthetic */ void lambda$onCreate$1841$ContactUsActivity(View view) {
        AppCompatCheckBox appCompatCheckBox = this.A02;
        appCompatCheckBox.setChecked(!appCompatCheckBox.isChecked());
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 11) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
        } else {
            String str = null;
            if (intent != null) {
                if (intent.getIntExtra("com.whatsapp.inappsupport.ui.ContactUsActvity.support_type", 1) == 2) {
                    A1P();
                    return;
                }
                str = intent.getStringExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.debug_info");
            }
            A1S(str);
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        A1R(1, null);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0F.A00();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0156  */
    @Override // X.AbstractActivityC48892Hh, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappsupport.ui.ContactUsActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_contact_us_email, 0, getString(R.string.contact_us_email)).setShowAsAction(0);
        return true;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C83363s0 c83363s0 = this.A0E.A00;
        if (c83363s0 != null) {
            c83363s0.A05(false);
        }
        C55142jw c55142jw = this.A0C;
        if (c55142jw != null) {
            c55142jw.A05(false);
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            A1R(1, null);
            finish();
            return true;
        } else if (itemId == R.id.menuitem_contact_us_email) {
            A1Q(2);
            return true;
        } else {
            return false;
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        this.A00.clearFocus();
    }
}
