package com.whatsapp.inappsupport.ui;

import X.AbstractC02800Cx;
import X.ActivityC02310Ar;
import X.C002701i;
import X.C018808t;
import X.C02180Ae;
import X.C02820Cz;
import X.C0U1;
import X.C0VJ;
import X.C0Wa;
import X.C0We;
import X.C2OD;
import X.C61872wr;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class SupportTopicsActivity extends C2OD implements C0Wa {
    public int A00;
    public int A01;
    public MenuItem A02;
    public C018808t A03;
    public List A04;

    public static Intent A00(Context context, ArrayList arrayList, Bundle bundle) {
        Intent intent = new Intent(context, SupportTopicsActivity.class);
        intent.putParcelableArrayListExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.support_topics", arrayList);
        intent.putExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.ui_version", 1);
        intent.putExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.contact_us_action", 3);
        if (bundle != null) {
            intent.putExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.describe_problem_bundle", bundle);
        }
        return intent;
    }

    public void A1P(C61872wr c61872wr) {
        int i = this.A00;
        if (i != 1 && i != 2) {
            ArrayList arrayList = new ArrayList(this.A04.size());
            ArrayList arrayList2 = new ArrayList(this.A04.size());
            for (int i2 = 0; i2 < this.A04.size(); i2++) {
                if (((SupportTopicsFragment) this.A04.get(i2)).A00 != null) {
                    C61872wr c61872wr2 = ((SupportTopicsFragment) this.A04.get(i2)).A00;
                    arrayList.add(c61872wr2.A03);
                    arrayList2.add(c61872wr2.A02);
                }
            }
            if (c61872wr != null) {
                arrayList.add(c61872wr.A03);
                arrayList2.add(c61872wr.A02);
            }
            String string = getIntent().getBundleExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.describe_problem_bundle").getString("com.whatsapp.support.DescribeProblemActivity.from");
            C018808t c018808t = this.A03;
            if (string == null) {
                string = "support_topics";
            }
            startActivity(C002701i.A09(this, c018808t, string, null, null, arrayList2, arrayList, getIntent().getBundleExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.describe_problem_bundle")));
            return;
        }
        setResult(-1, getIntent());
        finish();
    }

    public /* synthetic */ void lambda$onCreate$1836$SupportTopicsActivity(View view) {
        onBackPressed();
    }

    public /* synthetic */ void lambda$onCreate$1837$SupportTopicsActivity(View view) {
        A1P(null);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 15 && i2 == -1) {
            setResult(-1, getIntent());
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (!this.A04.isEmpty()) {
            List list = this.A04;
            list.remove(list.size() - 1);
            if (!this.A04.isEmpty()) {
                List list2 = this.A04;
                SupportTopicsFragment supportTopicsFragment = (SupportTopicsFragment) list2.get(list2.size() - 1);
                MenuItem menuItem = this.A02;
                if (menuItem != null) {
                    C61872wr c61872wr = supportTopicsFragment.A00;
                    if (c61872wr != null) {
                        menuItem.setVisible(c61872wr.A06);
                    } else {
                        menuItem.setVisible(false);
                    }
                }
            }
        }
        super.onBackPressed();
    }

    @Override // X.C0Wa
    public void onBackStackChanged() {
        String string;
        C0U1 A0c = A0c();
        if (A0c != null) {
            if (A0N().A03() == 0) {
                string = getString(R.string.payment_support_topic_flow_primary_title);
            } else {
                string = getString(R.string.payment_support_topic_flow_secondary_title);
            }
            A0c.A0H(string);
            A0c.A0L(true);
        }
    }

    @Override // X.C2OD, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        this.A01 = intent.getIntExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.ui_version", 1);
        this.A00 = intent.getIntExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.contact_us_action", 3);
        if (this.A01 == 2) {
            String string = getString(R.string.settings_help);
            setTheme(2131952219);
            super.onCreate(bundle);
            setTitle(string);
            setContentView(R.layout.support_topics_activity);
            findViewById(R.id.toolbar_layout).setVisibility(0);
            Toolbar toolbar = (Toolbar) C0VJ.A0A(this, R.id.toolbar);
            toolbar.setNavigationIcon(new C0We(((ActivityC02310Ar) this).A01, C02180Ae.A0Q(getResources().getDrawable(R.drawable.ic_back_teal), getResources().getColor(R.color.lightActionBarItemDrawableTint))));
            toolbar.setTitle(string);
            toolbar.setNavigationOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 24));
            A0k(toolbar);
            View findViewById = findViewById(R.id.contact_us_button);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 23));
        } else {
            super.onCreate(bundle);
            setContentView(R.layout.support_topics_activity);
            C0U1 A0c = A0c();
            if (A0c != null) {
                A0c.A0H(getString(R.string.payment_support_topic_flow_primary_title));
                A0c.A0L(true);
            }
        }
        this.A04 = new ArrayList();
        AbstractC02800Cx A0N = A0N();
        ArrayList arrayList = A0N.A0A;
        if (arrayList == null) {
            arrayList = new ArrayList();
            A0N.A0A = arrayList;
        }
        arrayList.add(this);
        ArrayList<? extends Parcelable> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.support_topics");
        SupportTopicsFragment supportTopicsFragment = new SupportTopicsFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("parent_topic", null);
        bundle2.putParcelableArrayList("topics", parcelableArrayListExtra);
        supportTopicsFragment.A0P(bundle2);
        AbstractC02800Cx A0N2 = A0N();
        if (A0N2 != null) {
            C02820Cz c02820Cz = new C02820Cz(A0N2);
            c02820Cz.A00(R.id.support_topics_container, supportTopicsFragment);
            c02820Cz.A04();
            this.A04.add(supportTopicsFragment);
            return;
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A01 == 1) {
            getMenuInflater().inflate(R.menu.support_topics_menu, menu);
            MenuItem findItem = menu.findItem(R.id.support_topic_skip);
            this.A02 = findItem;
            findItem.setVisible(false);
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332 && !this.A04.isEmpty()) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() == R.id.support_topic_skip) {
            A1P(null);
            return true;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }
}
