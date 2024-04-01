package com.whatsapp.support.faq;

import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass011;
import X.C018808t;
import X.C01C;
import X.C02180Ae;
import X.C28C;
import X.C28D;
import X.C36741lI;
import X.C3Z9;
import X.C3ZA;
import X.C49082Ij;
import X.C69213No;
import X.C72153Yw;
import X.InterfaceC002901k;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class SearchFAQ extends C28C implements C28D {
    public int A00;
    public AnonymousClass011 A01;
    public C018808t A02;
    public C49082Ij A03;
    public C72153Yw A04;
    public InterfaceC002901k A05;
    public String A06;
    public String A07;
    public String A08;
    public ArrayList A09;
    public HashMap A0A;
    public HashSet A0B;
    public List A0C;

    public int A1R() {
        return this.A0B.size();
    }

    public final void A1S(int i) {
        C36741lI c36741lI = new C36741lI();
        c36741lI.A00 = Integer.valueOf(i);
        c36741lI.A01 = this.A07;
        c36741lI.A02 = ((ActivityC02310Ar) this).A01.A04();
        this.A05.AS1(new RunnableEBaseShape4S0200000_I0_4(this, c36741lI, 39));
    }

    public final void A1T(C3Z9 c3z9) {
        this.A0B.add(c3z9.A03);
        Intent intent = new Intent(this, FaqItemActivity.class);
        intent.putExtra("title", c3z9.A02);
        intent.putExtra("content", c3z9.A01);
        intent.putExtra("url", c3z9.A03);
        intent.putExtra("article_id", c3z9.A00);
        startActivityForResult(intent, 1);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override // X.C28D
    public void ANt(boolean z) {
        A1S(3);
        if (z) {
            setResult(-1);
            finish();
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            long longExtra = intent.getLongExtra("total_time_spent", 0L);
            long longExtra2 = intent.getLongExtra("article_id", -1L);
            HashMap hashMap = this.A0A;
            Long valueOf = Long.valueOf(longExtra2);
            if (hashMap.containsKey(valueOf)) {
                longExtra += ((Number) this.A0A.get(valueOf)).longValue();
            }
            this.A0A.put(valueOf, Long.valueOf(longExtra));
            TextUtils.join(", ", this.A0A.entrySet());
            Iterator it = this.A0A.values().iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        A1S(2);
        super.onBackPressed();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A04.A00();
    }

    @Override // X.C28C, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        final Runnable runnableEBaseShape4S0200000_I0_4;
        super.onCreate(bundle);
        int i = 0;
        boolean booleanExtra = getIntent().getBooleanExtra("com.whatsapp.support.faq.SearchFAQ.usePaymentsFlow", false);
        setTitle(R.string.search_help_center);
        A0c().A0L(true);
        setContentView(R.layout.search_faq);
        this.A0B = new HashSet();
        if (bundle != null) {
            String[] stringArray = bundle.getStringArray("FaqItemsReadTitles");
            if (stringArray != null) {
                Collections.addAll(this.A0B, stringArray);
            }
            if (bundle.containsKey("timeSpentPerArticle")) {
                HashMap hashMap = (HashMap) bundle.getSerializable("timeSpentPerArticle");
                this.A0A = hashMap;
                hashMap.size();
            }
        }
        Intent intent = getIntent();
        this.A06 = intent.getStringExtra("com.whatsapp.support.faq.SearchFAQ.from");
        ArrayList arrayList = new ArrayList();
        if (this.A0A == null) {
            this.A0A = new HashMap();
        }
        int intExtra = intent.getIntExtra("com.whatsapp.support.faq.SearchFAQ.count", 0);
        this.A00 = intExtra;
        if (!booleanExtra) {
            this.A07 = intent.getStringExtra("com.whatsapp.support.faq.SearchFAQ.problem");
            this.A08 = intent.getStringExtra("com.whatsapp.support.faq.SearchFAQ.status");
            this.A09 = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            String[] stringArrayExtra = intent.getStringArrayExtra("com.whatsapp.support.faq.SearchFAQ.additionalDetails");
            if (stringArrayExtra != null) {
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    String[] split = str.split(":");
                    if (split.length == 2) {
                        arrayList2.add(new Pair(split[0], split[1]));
                    }
                }
                this.A0C = arrayList2;
            }
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.titles");
            ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.descriptions");
            ArrayList<String> stringArrayListExtra3 = intent.getStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.urls");
            ArrayList<String> stringArrayListExtra4 = intent.getStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.ids");
            if (stringArrayListExtra != null && stringArrayListExtra2 != null && stringArrayListExtra3 != null && stringArrayListExtra4 != null) {
                if (stringArrayListExtra.size() < intExtra) {
                    intExtra = stringArrayListExtra.size();
                }
                if (stringArrayListExtra2.size() < intExtra) {
                    intExtra = stringArrayListExtra2.size();
                }
                if (stringArrayListExtra3.size() < intExtra) {
                    intExtra = stringArrayListExtra3.size();
                }
                if (stringArrayListExtra4.size() < intExtra) {
                    intExtra = stringArrayListExtra4.size();
                }
                for (int i2 = 0; i2 < intExtra; i2++) {
                    long parseLong = Long.parseLong(stringArrayListExtra4.get(i2));
                    stringArrayListExtra.get(i2);
                    stringArrayListExtra3.get(i2);
                    arrayList.add(new C3Z9(stringArrayListExtra.get(i2), stringArrayListExtra2.get(i2), stringArrayListExtra3.get(i2), parseLong));
                }
            }
            runnableEBaseShape4S0200000_I0_4 = new RunnableEBaseShape4S0200000_I0_4(this, intent, 38);
        } else {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("payments_support_faqs");
            ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("payments_support_topics");
            Bundle bundleExtra = intent.getBundleExtra("describe_problem_bundle");
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                C69213No c69213No = (C69213No) it.next();
                arrayList.add(new C3Z9(c69213No.A02, c69213No.A00, c69213No.A03, Long.parseLong(c69213No.A01)));
            }
            runnableEBaseShape4S0200000_I0_4 = new RunnableEBaseShape0S0300000_I0_0(this, parcelableArrayListExtra2, bundleExtra, 49);
        }
        ListAdapter c3za = new C3ZA(this, this, arrayList);
        ListView A1P = A1P();
        A1P.addHeaderView(((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.search_faq_header, (ViewGroup) null), null, false);
        A1Q(c3za);
        registerForContextMenu(A1P);
        if (arrayList.size() == 1) {
            A1T((C3Z9) arrayList.get(0));
        }
        View findViewById = findViewById(R.id.bottom_button_container);
        C72153Yw c72153Yw = new C72153Yw(A1P, findViewById, getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation));
        this.A04 = c72153Yw;
        c72153Yw.A00();
        this.A04.A02(this, (TextView) findViewById(R.id.does_not_match_button), getString(R.string.does_not_match_button), new ClickableSpan() { // from class: X.3Z8
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                runnableEBaseShape4S0200000_I0_4.run();
            }
        }, R.style.FaqInlineLink);
        this.A04.A01.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(runnableEBaseShape4S0200000_I0_4, 37));
        if (C02180Ae.A1Y(this.A06) && ((ActivityC02290Ap) this).A0B.A0E(C01C.A1o)) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A1S(2);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            HashSet hashSet = this.A0B;
            if (hashSet != null && hashSet.size() > 0) {
                bundle.putStringArray("FaqItemsReadTitles", (String[]) this.A0B.toArray(new String[0]));
            }
            HashMap hashMap = this.A0A;
            if (hashMap != null && hashMap.size() > 0) {
                bundle.putSerializable("timeSpentPerArticle", hashMap);
            }
        }
        super.onSaveInstanceState(bundle);
    }
}
