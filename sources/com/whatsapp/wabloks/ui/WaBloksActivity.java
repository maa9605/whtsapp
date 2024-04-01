package com.whatsapp.wabloks.ui;

import X.AbstractC02800Cx;
import X.AbstractC75073eJ;
import X.ActivityC02290Ap;
import X.AnonymousClass017;
import X.AnonymousClass082;
import X.AnonymousClass084;
import X.AnonymousClass460;
import X.AnonymousClass478;
import X.C000700j;
import X.C002301c;
import X.C00J;
import X.C02160Ac;
import X.C02820Cz;
import X.C09M;
import X.C09O;
import X.C0U1;
import X.C0We;
import X.C25001Dr;
import X.C25311Ew;
import X.C33821gW;
import X.C45Q;
import X.C46E;
import X.C46M;
import X.C47P;
import X.C47Q;
import X.C4G2;
import X.C4G5;
import X.C4G6;
import X.C4I8;
import X.C4KF;
import X.C893746t;
import X.C893846u;
import X.C90344Aq;
import X.C91574Fl;
import X.InterfaceC021309t;
import X.InterfaceC06230Sb;
import X.InterfaceC41281tf;
import X.View$OnClickListenerC74973e9;
import android.app.Application;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.base.BkScreenFragment;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class WaBloksActivity extends C4KF {
    public AbstractC75073eJ A00;
    public C4G5 A01;
    public C4G6 A02;
    public C00J A03;
    public C00J A04;
    public List A05;
    public Map A06;
    public final Set A07 = new HashSet();
    public final Set A08 = new HashSet();

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.A00.A00();
    }

    @Override // X.C4KF, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC75073eJ ADy = ((InterfaceC41281tf) this.A04.get()).ADy(this, getIntent());
        this.A00 = ADy;
        C91574Fl c91574Fl = (C91574Fl) ADy;
        if (c91574Fl != null) {
            try {
                AnonymousClass017.A00(((AbstractC75073eJ) c91574Fl).A01.getApplicationContext());
            } catch (IOException unused) {
            }
            ((AbstractC75073eJ) c91574Fl).A01.setContentView(R.layout.activity_wablok_screen_main);
            View findViewById = ((AbstractC75073eJ) c91574Fl).A01.findViewById(R.id.wabloks_screen_toolbar);
            if (findViewById != null) {
                Toolbar toolbar = (Toolbar) findViewById;
                c91574Fl.A00 = toolbar;
                toolbar.setTitle("");
                Toolbar toolbar2 = c91574Fl.A00;
                toolbar2.A09();
                ((AbstractC75073eJ) c91574Fl).A01.A0k(toolbar2);
                C0U1 A0c = ((AbstractC75073eJ) c91574Fl).A01.A0c();
                if (A0c != null) {
                    A0c.A0L(true);
                }
                C0We c0We = new C0We((C002301c) c91574Fl.A08.get(), C02160Ac.A03(((AbstractC75073eJ) c91574Fl).A01, R.drawable.ic_back_teal));
                c0We.setColorFilter(((AbstractC75073eJ) c91574Fl).A01.getResources().getColor(R.color.wabloksui_screen_back_arrow), PorterDuff.Mode.SRC_ATOP);
                c91574Fl.A00.setNavigationIcon(c0We);
                c91574Fl.A00.setBackgroundColor(((AbstractC75073eJ) c91574Fl).A01.getResources().getColor(R.color.wabloksui_screen_toolbar));
                c91574Fl.A00.setNavigationOnClickListener(new View$OnClickListenerC74973e9(c91574Fl));
                if (((AbstractC75073eJ) c91574Fl).A00.getBooleanExtra("has_options", false)) {
                    AnonymousClass082 anonymousClass082 = (AnonymousClass082) ((C46M) c91574Fl.A06.get()).A01("wa_screen_options", ((AbstractC75073eJ) c91574Fl).A00.getStringExtra("options_key"));
                    if (anonymousClass082 == null) {
                        ((AbstractC75073eJ) c91574Fl).A01.finish();
                    } else {
                        AnonymousClass084 anonymousClass084 = C46E.A00;
                        if (anonymousClass082.ABT(anonymousClass084) != null) {
                            AnonymousClass082 anonymousClass0822 = (AnonymousClass082) anonymousClass082.ABT(anonymousClass084);
                            c91574Fl.A00.setTitle(anonymousClass0822.ADJ(AnonymousClass460.A01));
                            List A8u = anonymousClass0822.A8u(AnonymousClass460.A00);
                            if (A8u != null) {
                                try {
                                    WaBloksActivity waBloksActivity = (WaBloksActivity) ((AbstractC75073eJ) c91574Fl).A01;
                                    if (A8u != null) {
                                        waBloksActivity.A05 = A8u;
                                        if (A8u.size() > 0) {
                                            ((ActivityC02290Ap) waBloksActivity).A07.A08();
                                            waBloksActivity.onCreateOptionsMenu(((ActivityC02290Ap) waBloksActivity).A07.getMenu());
                                        }
                                    }
                                } catch (ClassCastException unused2) {
                                    Log.e("This is not an instance of WaBloksActity");
                                }
                            }
                        }
                    }
                }
                String stringExtra = ((AbstractC75073eJ) c91574Fl).A00.getStringExtra("screen_name");
                C000700j.A03(stringExtra);
                AbstractC02800Cx A0N = ((AbstractC75073eJ) c91574Fl).A01.A0N();
                if (A0N.A03() == 0) {
                    C02820Cz c02820Cz = new C02820Cz(A0N);
                    Serializable serializableExtra = ((AbstractC75073eJ) c91574Fl).A00.getSerializableExtra("screen_params");
                    BkScreenFragment bkScreenFragment = new BkScreenFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("screen_name", stringExtra);
                    bundle2.putSerializable("screen_params", serializableExtra);
                    bkScreenFragment.A0P(bundle2);
                    c02820Cz.A00(R.id.bloks_fragment_container, bkScreenFragment);
                    c02820Cz.A03(stringExtra);
                    c02820Cz.A05();
                }
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    String string = extras.getString("screen_name");
                    if (string != null) {
                        if (this.A06.containsKey(string)) {
                            this.A01 = new C4I8((C90344Aq) this.A03.get(), this);
                            C4G6 c4g6 = new C4G6(this, ((C4G2) this.A06.get(string)).A00);
                            this.A02 = c4g6;
                            this.A07.add(c4g6);
                            this.A08.add(this.A02);
                        } else {
                            this.A01 = new C4G5(this) { // from class: X.4I7
                                {
                                    super(this, 0);
                                }
                            };
                        }
                        Set<Application.ActivityLifecycleCallbacks> set = this.A07;
                        set.add(this.A01);
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : set) {
                            activityLifecycleCallbacks.onActivityCreated(this, bundle);
                        }
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0029 A[SYNTHETIC] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onCreateOptionsMenu(android.view.Menu r6) {
        /*
            r5 = this;
            java.util.Set r0 = r5.A08
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.next()
            X.0Sb r0 = (X.InterfaceC06230Sb) r0
            r0.AJ9(r6)
            goto L6
        L16:
            java.util.List r0 = r5.A05     // Catch: java.lang.NullPointerException -> Le9
            if (r0 == 0) goto Le9
            int r0 = r0.size()     // Catch: java.lang.NullPointerException -> Le9
            if (r0 <= 0) goto Le9
            r6.clear()     // Catch: java.lang.NullPointerException -> Le9
            java.util.List r0 = r5.A05     // Catch: java.lang.NullPointerException -> Le9
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.NullPointerException -> Le9
        L29:
            boolean r0 = r3.hasNext()     // Catch: java.lang.NullPointerException -> Le9
            if (r0 == 0) goto Le9
            java.lang.Object r2 = r3.next()     // Catch: java.lang.NullPointerException -> Le9
            X.081 r2 = (X.AnonymousClass081) r2     // Catch: java.lang.NullPointerException -> Le9
            X.084 r0 = X.C891745z.A01     // Catch: java.lang.NullPointerException -> Le9
            java.lang.String r1 = r2.ADJ(r0)     // Catch: java.lang.NullPointerException -> Le9
            r4 = 0
            int r0 = r1.hashCode()     // Catch: X.C018208m -> Ld5 java.lang.NullPointerException -> Le9
            switch(r0) {
                case -934641255: goto L4f;
                case 96417: goto L58;
                case 3015911: goto L61;
                case 3089282: goto L6a;
                case 3237038: goto L73;
                case 3357525: goto L7c;
                case 3377907: goto L85;
                case 3387192: goto L8e;
                case 94627080: goto L97;
                case 94756344: goto La0;
                default: goto L43;
            }     // Catch: X.C018208m -> Ld5 java.lang.NullPointerException -> Le9
        L43:
            java.lang.String r0 = "Unsupported icon type: "
            java.lang.String r1 = X.C000200d.A0H(r0, r1)     // Catch: X.C018208m -> Ld5 java.lang.NullPointerException -> Le9
            X.08m r0 = new X.08m     // Catch: X.C018208m -> Ld5 java.lang.NullPointerException -> Le9
            r0.<init>(r1)     // Catch: X.C018208m -> Ld5 java.lang.NullPointerException -> Le9
            throw r0     // Catch: X.C018208m -> Ld5 java.lang.NullPointerException -> Le9
        L4f:
            java.lang.String r0 = "reload"
            boolean r0 = r1.equals(r0)     // Catch: X.C018208m -> Ld5 java.lang.NullPointerException -> Le9
            if (r0 == 0) goto L43
            goto La8
        L58:
            java.lang.String r0 = "add"
            boolean r0 = r1.equals(r0)     // Catch: X.C018208m -> Ld5 java.lang.NullPointerException -> Le9
            if (r0 == 0) goto L43
            goto Lab
        L61:
            java.lang.String r0 = "back"
            boolean r0 = r1.equals(r0)     // Catch: X.C018208m -> Ld5 java.lang.NullPointerException -> Le9
            if (r0 == 0) goto L43
            goto La8
        L6a:
            java.lang.String r0 = "done"
            boolean r0 = r1.equals(r0)     // Catch: X.C018208m -> Ld5 java.lang.NullPointerException -> Le9
            if (r0 == 0) goto L43
            goto Lab
        L73:
            java.lang.String r0 = "info"
            boolean r0 = r1.equals(r0)     // Catch: X.C018208m -> Ld5 java.lang.NullPointerException -> Le9
            if (r0 == 0) goto L43
            goto Lab
        L7c:
            java.lang.String r0 = "more"
            boolean r0 = r1.equals(r0)     // Catch: X.C018208m -> Ld5 java.lang.NullPointerException -> Le9
            if (r0 == 0) goto L43
            goto La8
        L85:
            java.lang.String r0 = "next"
            boolean r0 = r1.equals(r0)     // Catch: X.C018208m -> Ld5 java.lang.NullPointerException -> Le9
            if (r0 == 0) goto L43
            goto Lab
        L8e:
            java.lang.String r0 = "none"
            boolean r0 = r1.equals(r0)     // Catch: X.C018208m -> Ld5 java.lang.NullPointerException -> Le9
            if (r0 == 0) goto L43
            goto Lab
        L97:
            java.lang.String r0 = "check"
            boolean r0 = r1.equals(r0)     // Catch: X.C018208m -> Ld5 java.lang.NullPointerException -> Le9
            if (r0 == 0) goto L43
            goto Lab
        La0:
            java.lang.String r0 = "close"
            boolean r0 = r1.equals(r0)     // Catch: X.C018208m -> Ld5 java.lang.NullPointerException -> Le9
            if (r0 == 0) goto L43
        La8:
            X.45u r0 = X.EnumC891345u.A01     // Catch: X.C018208m -> Ld5 java.lang.NullPointerException -> Le9
            goto Lac
        Lab:
            r0 = 0
        Lac:
            java.lang.String r1 = r0.name()     // Catch: java.lang.NullPointerException -> Le9
            java.lang.String r0 = "MORE"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.NullPointerException -> Le9
            if (r0 == 0) goto L29
            r1 = 2131363508(0x7f0a06b4, float:1.8346827E38)
            r0 = 2131889832(0x7f120ea8, float:1.9414339E38)
            r6.add(r4, r1, r4, r0)     // Catch: java.lang.NullPointerException -> Le9
            androidx.appcompat.widget.Toolbar r0 = r5.A07     // Catch: java.lang.NullPointerException -> Le9
            android.view.Menu r0 = r0.getMenu()     // Catch: java.lang.NullPointerException -> Le9
            r5.onPrepareOptionsMenu(r0)     // Catch: java.lang.NullPointerException -> Le9
            androidx.appcompat.widget.Toolbar r1 = r5.A07     // Catch: java.lang.NullPointerException -> Le9
            X.4G3 r0 = new X.4G3     // Catch: java.lang.NullPointerException -> Le9
            r0.<init>()     // Catch: java.lang.NullPointerException -> Le9
            r1.A0R = r0     // Catch: java.lang.NullPointerException -> Le9
            goto L29
        Ld5:
            r3 = move-exception
            java.lang.String r2 = "%s: Failed to parse button icon resource"
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.NullPointerException -> Le9
            java.lang.String r0 = "WaBloksActivity"
            r1[r4] = r0     // Catch: java.lang.NullPointerException -> Le9
            java.lang.String r1 = java.lang.String.format(r2, r1)     // Catch: java.lang.NullPointerException -> Le9
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.NullPointerException -> Le9
            r0.<init>(r1, r3)     // Catch: java.lang.NullPointerException -> Le9
            throw r0     // Catch: java.lang.NullPointerException -> Le9
        Le9:
            boolean r0 = super.onCreateOptionsMenu(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wabloks.ui.WaBloksActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        if (this.A00 != null) {
            super.onDestroy();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        for (InterfaceC06230Sb interfaceC06230Sb : this.A08) {
            if (interfaceC06230Sb.AMZ(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        if (this.A00 != null) {
            super.onPause();
            return;
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        for (InterfaceC06230Sb interfaceC06230Sb : this.A08) {
            interfaceC06230Sb.ANF(menu);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        C91574Fl c91574Fl = (C91574Fl) this.A00;
        C45Q.A0A();
        C25311Ew c25311Ew = new C25311Ew(C45Q.A01);
        C45Q.A0A();
        Map emptyMap = Collections.emptyMap();
        C47P c47p = c91574Fl.A02;
        AnonymousClass478 anonymousClass478 = c91574Fl.A03;
        C47Q c47q = c91574Fl.A04;
        C09O c09o = c91574Fl.A01;
        C893746t c893746t = c91574Fl.A05;
        C09M.A0C = new C09M(((AbstractC75073eJ) c91574Fl).A01.getApplicationContext(), (InterfaceC021309t) c91574Fl.A07.get(), c25311Ew, C893846u.A00, new C25001Dr(), new C33821gW(), emptyMap, c47p, anonymousClass478, c47q, c09o, c893746t);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.A00 == null) {
            throw null;
        }
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        if (this.A00 != null) {
            super.onStop();
            return;
        }
        throw null;
    }
}
