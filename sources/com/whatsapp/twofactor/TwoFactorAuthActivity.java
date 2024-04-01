package com.whatsapp.twofactor;

import X.AbstractC02800Cx;
import X.C000200d;
import X.C000700j;
import X.C02160Ac;
import X.C02820Cz;
import X.C07O;
import X.C0BA;
import X.C0D0;
import X.C0U1;
import X.C2E8;
import X.C2QN;
import X.C41911ui;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class TwoFactorAuthActivity extends C2QN implements C2E8 {
    public static final int[] A09 = {R.id.page_indicator_1, R.id.page_indicator_2, R.id.page_indicator_3};
    public C0U1 A00;
    public C41911ui A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public int[] A06;
    public final Handler A07 = new Handler(Looper.getMainLooper());
    public final Runnable A08 = new RunnableEBaseShape7S0100000_I0_7(this, 16);

    public C0BA A1P() {
        int i = this.A06[0];
        if (i == 1) {
            Bundle A01 = C000200d.A01("type", 1);
            SetCodeFragment setCodeFragment = new SetCodeFragment();
            setCodeFragment.A0P(A01);
            return setCodeFragment;
        } else if (i == 2) {
            Bundle A012 = C000200d.A01("type", 1);
            SetEmailFragment setEmailFragment = new SetEmailFragment();
            setEmailFragment.A0P(A012);
            return setEmailFragment;
        } else {
            StringBuilder A0P = C000200d.A0P("Invalid work flow:");
            A0P.append(i);
            throw new IllegalStateException(A0P.toString());
        }
    }

    public void A1Q() {
        A12(R.string.two_factor_auth_submitting);
        this.A07.postDelayed(this.A08, C41911ui.A08);
        String str = this.A02;
        if (str == null) {
            str = this.A01.A02();
            this.A02 = str;
        }
        this.A01.A04(str, this.A04);
    }

    public void A1R(View view, int i) {
        int i2 = 0;
        while (i2 < i) {
            i2++;
            C07O.A0h((ImageView) view.findViewById(A09[i2]), ColorStateList.valueOf(C02160Ac.A00(this, R.color.pageIndicatorSelected)));
        }
        int length = this.A06.length;
        while (true) {
            length++;
            int[] iArr = A09;
            if (length >= iArr.length) {
                return;
            }
            view.findViewById(iArr[length]).setVisibility(8);
        }
    }

    public void A1S(C0BA c0ba, boolean z) {
        AbstractC02800Cx A0N = A0N();
        if (A0N != null) {
            C02820Cz c02820Cz = new C02820Cz(A0N);
            ((C0D0) c02820Cz).A02 = R.anim.slide_in_right;
            c02820Cz.A03 = R.anim.slide_out_left;
            c02820Cz.A04 = R.anim.slide_in_left;
            c02820Cz.A05 = R.anim.slide_out_right;
            c02820Cz.A01(R.id.container, c0ba, null);
            if (z) {
                c02820Cz.A03(null);
            }
            c02820Cz.A04();
            return;
        }
        throw null;
    }

    public boolean A1T(C0BA c0ba) {
        return this.A06.length == 1 || c0ba.getClass() == SetEmailFragment.class;
    }

    @Override // X.C2E8
    public void APy() {
        Handler handler = this.A07;
        handler.removeCallbacks(this.A08);
        handler.postDelayed(new RunnableEBaseShape7S0100000_I0_7(this, 20), 700L);
    }

    @Override // X.C2E8
    public void APz() {
        Handler handler = this.A07;
        handler.removeCallbacks(this.A08);
        handler.postDelayed(new RunnableEBaseShape7S0100000_I0_7(this, 19), 700L);
    }

    @Override // X.C2QN, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.settings_two_factor_auth);
        C0U1 A0c = A0c();
        this.A00 = A0c;
        if (A0c != null) {
            A0c.A0L(true);
        }
        setContentView(R.layout.activity_two_factor_auth);
        int[] intArrayExtra = getIntent().getIntArrayExtra("workflows");
        if (intArrayExtra != null) {
            this.A06 = intArrayExtra;
            C000700j.A07(intArrayExtra.length > 0);
            AbstractC02800Cx A0N = A0N();
            if (A0N != null) {
                C02820Cz c02820Cz = new C02820Cz(A0N);
                c02820Cz.A01(R.id.container, A1P(), null);
                c02820Cz.A04();
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            AbstractC02800Cx A0N = A0N();
            if (A0N.A03() > 0) {
                A0N.A0D();
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        C41911ui c41911ui = this.A01;
        C000700j.A07(c41911ui.A06.contains(this));
        c41911ui.A06.remove(this);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        this.A01.A03(this);
    }
}
