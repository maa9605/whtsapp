package com.whatsapp.greenalert;

import X.AbstractActivityC49942Nv;
import X.AbstractC000600i;
import X.AnonymousClass072;
import X.C002301c;
import X.C003701t;
import X.C006602x;
import X.C018308n;
import X.C018508q;
import X.C02180Ae;
import X.C02E;
import X.C06870Vj;
import X.C0AS;
import X.C0AT;
import X.C0VJ;
import X.C0Z7;
import X.C1BQ;
import X.C1BR;
import X.C2A8;
import X.C3C9;
import X.C40071rX;
import X.C41941ul;
import X.C41951um;
import X.InterfaceC13310l3;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.ViewOnClickEBaseShape0S0110000_I0;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.components.Button;
import com.whatsapp.greenalert.GreenAlertActivity;

/* loaded from: classes2.dex */
public class GreenAlertActivity extends AbstractActivityC49942Nv {
    public View A00;
    public View A01;
    public ViewPager A02;
    public TabLayout A03;
    public C018308n A04;
    public AbstractC000600i A05;
    public C018508q A06;
    public WaImageButton A07;
    public WaImageButton A08;
    public WaImageButton A09;
    public C06870Vj A0A;
    public Button A0B;
    public C02E A0C;
    public AnonymousClass072 A0D;
    public C002301c A0E;
    public C003701t A0F;
    public C3C9 A0G;
    public C40071rX A0H;
    public C41941ul A0I;
    public C41951um A0J;
    public C006602x A0K;
    public final InterfaceC13310l3 A0L = new InterfaceC13310l3() { // from class: X.3C6
        {
            GreenAlertActivity.this = this;
        }

        @Override // X.InterfaceC13310l3
        public final void AOL(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            GreenAlertActivity greenAlertActivity = GreenAlertActivity.this;
            greenAlertActivity.A1S(greenAlertActivity.A0G.A0F(greenAlertActivity.A02.getCurrentItem()));
        }
    };
    public static final int[] A0S = {R.string.green_alert_tos_title, R.string.green_alert_tos_eu_title};
    public static final int[] A0M = {R.string.green_alert_tos_opening_paragraph, R.string.green_alert_tos_eu_opening_paragraph};
    public static final int[] A0N = {R.string.green_alert_tos_bullets_intro, R.string.green_alert_tos_eu_bullets_intro};
    public static final int[] A0O = {R.string.green_alert_tos_bullet_1, R.string.green_alert_tos_eu_bullet_1};
    public static final int[] A0P = {R.string.green_alert_tos_bullet_2, R.string.green_alert_tos_eu_bullet_2};
    public static final int[] A0Q = {R.string.green_alert_tos_bullet_3, R.string.green_alert_tos_bullet_3};
    public static final int[] A0R = {R.string.green_alert_tos_footer, R.string.green_alert_tos_eu_footer};

    public final void A1P() {
        int A0F = this.A0G.A0F(this.A02.getCurrentItem());
        if (C2A8.A03(this.A0J)) {
            if (A0F == 1) {
                C41941ul c41941ul = this.A0I;
                if (c41941ul != null) {
                    c41941ul.A01(4);
                } else {
                    throw null;
                }
            } else {
                this.A0I.A01(12);
            }
            finish();
            return;
        }
        C018308n.A03(this);
    }

    public final void A1Q() {
        ViewPager viewPager = this.A02;
        final NestedScrollView nestedScrollView = (NestedScrollView) viewPager.findViewWithTag(Integer.valueOf(this.A0G.A0F(viewPager.getCurrentItem())));
        if (nestedScrollView == null) {
            return;
        }
        nestedScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2wK
            {
                GreenAlertActivity.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                nestedScrollView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                GreenAlertActivity greenAlertActivity = GreenAlertActivity.this;
                greenAlertActivity.A1S(greenAlertActivity.A0G.A0F(greenAlertActivity.A02.getCurrentItem()));
            }
        });
    }

    public final void A1R(int i) {
        if (i == 1) {
            C41941ul c41941ul = this.A0I;
            if (C2A8.A03(this.A0J)) {
                c41941ul.A01(3);
                return;
            } else {
                c41941ul.A01(7);
                return;
            }
        }
        this.A0I.A01(11);
    }

    public final void A1S(int i) {
        View findViewWithTag = this.A02.findViewWithTag(Integer.valueOf(i));
        if (findViewWithTag == null) {
            return;
        }
        if (i == 1 && this.A02.findViewWithTag(1).canScrollVertically(1)) {
            this.A0B.setVisibility(4);
            this.A09.setVisibility(0);
        } else {
            this.A0B.setVisibility(0);
            this.A09.setVisibility(8);
        }
        float dimension = getResources().getDimension(R.dimen.green_alert_sticky_top_panel_elevation);
        View view = this.A01;
        if (findViewWithTag.getScrollY() <= 0) {
            dimension = 0.0f;
        }
        C0AT.A0P(view, dimension);
        float dimension2 = getResources().getDimension(R.dimen.green_alert_sticky_bottom_panel_elevation);
        C0AT.A0P(this.A00, findViewWithTag.canScrollVertically(1) ? dimension2 : 0.0f);
    }

    public final void A1T(int i) {
        this.A02.setCurrentItem(this.A0G.A0F(i));
        this.A07.setVisibility(i == 0 ? 8 : 0);
        Button button = this.A0B;
        int i2 = R.string.green_alert_interstitial_continue_button;
        if (i == 1) {
            i2 = R.string.green_alert_interstitial_agree;
        }
        button.setText(i2);
        A1S(i);
    }

    public /* synthetic */ void lambda$onCreate$2614$GreenAlertActivity(View view) {
        A1P();
    }

    public /* synthetic */ void lambda$onCreate$2616$GreenAlertActivity(View view) {
        C02180Ae.A1A((NestedScrollView) this.A02.findViewWithTag(1));
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        int max = Math.max(-1, this.A0G.A0F(this.A02.getCurrentItem()) - 1);
        if (max < 0) {
            A1P();
        } else {
            A1T(max);
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A1Q();
    }

    @Override // X.AbstractActivityC49942Nv, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_green_alert);
        this.A07 = (WaImageButton) C0VJ.A0A(this, R.id.green_alert_back_button);
        this.A08 = (WaImageButton) C0VJ.A0A(this, R.id.green_alert_dismiss_button);
        this.A0B = (Button) C0VJ.A0A(this, R.id.green_alert_continue_button);
        this.A09 = (WaImageButton) C0VJ.A0A(this, R.id.green_alert_scroll_tos_button);
        this.A03 = (TabLayout) C0VJ.A0A(this, R.id.green_alert_tab_layout);
        this.A01 = C0VJ.A0A(this, R.id.green_alert_sticky_top_panel);
        this.A00 = C0VJ.A0A(this, R.id.green_alert_sticky_bottom_panel);
        this.A02 = (ViewPager) C0VJ.A0A(this, R.id.green_alert_viewpager);
        boolean A03 = C2A8.A03(this.A0J);
        C3C9 c3c9 = new C3C9(this.A0F, this.A06, this.A05, this.A0K, this.A04, this.A0A, this.A0H, this.A0C, this.A0E, this.A0D, this.A0L);
        this.A0G = c3c9;
        this.A02.setAdapter(c3c9);
        this.A02.A0F(new C0Z7() { // from class: X.3Kb
            {
                GreenAlertActivity.this = this;
            }

            @Override // X.C0Z8
            public void AMi(int i) {
                GreenAlertActivity greenAlertActivity = GreenAlertActivity.this;
                int A0F = greenAlertActivity.A0G.A0F(i);
                greenAlertActivity.A1R(A0F);
                greenAlertActivity.A07.setVisibility(A0F == 0 ? 8 : 0);
                Button button = greenAlertActivity.A0B;
                int i2 = R.string.green_alert_interstitial_continue_button;
                if (A0F == 1) {
                    i2 = R.string.green_alert_interstitial_agree;
                }
                button.setText(i2);
                greenAlertActivity.A1S(A0F);
            }
        });
        this.A02.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2wJ
            {
                GreenAlertActivity.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                GreenAlertActivity greenAlertActivity = GreenAlertActivity.this;
                greenAlertActivity.A02.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                greenAlertActivity.A1Q();
            }
        });
        C0AT.A0W(this.A03, 0);
        this.A03.setupWithViewPager(this.A02);
        C0AT.A0c(this.A03, new C0AS() { // from class: X.3C7
            @Override // X.C0AS
            public void A04(View view, C08420bS c08420bS) {
                C13230ko c13230ko;
                this.A01.onInitializeAccessibilityNodeInfo(view, c08420bS.A02);
                if (Build.VERSION.SDK_INT >= 19) {
                    c13230ko = new C13230ko(AccessibilityNodeInfo.CollectionInfo.obtain(1, 2, false));
                } else {
                    c13230ko = new C13230ko(null);
                }
                c08420bS.A09(c13230ko);
            }
        });
        TabLayout tabLayout = this.A03;
        int tabCount = tabLayout.getTabCount() + 1;
        View[] viewArr = new View[tabCount];
        viewArr[tabLayout.getTabCount()] = this.A0B;
        int i = 0;
        do {
            C1BQ A04 = this.A03.A04(this.A0G.A0F(i));
            if (A04 != null) {
                C1BR c1br = A04.A01;
                viewArr[i] = c1br;
                c1br.setClickable(false);
            }
            i++;
        } while (i < 2);
        for (int i2 = 0; i2 < tabCount; i2++) {
            final View view = null;
            if (i2 != 0) {
                view = viewArr[i2 - 1];
            }
            View view2 = viewArr[i2];
            final int A0F = this.A0G.A0F(i2);
            C0AT.A0c(view2, new C0AS() { // from class: X.3C8
                @Override // X.C0AS
                public void A04(View view3, C08420bS c08420bS) {
                    C13240kp c13240kp;
                    View.AccessibilityDelegate accessibilityDelegate = super.A01;
                    AccessibilityNodeInfo accessibilityNodeInfo = c08420bS.A02;
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view3, accessibilityNodeInfo);
                    View view4 = view;
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 22) {
                        accessibilityNodeInfo.setTraversalAfter(view4);
                    }
                    int i4 = A0F;
                    if (i4 == -1) {
                        return;
                    }
                    if (i3 >= 19) {
                        c13240kp = new C13240kp(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i4, 1, false));
                    } else {
                        c13240kp = new C13240kp(null);
                    }
                    c08420bS.A0A(c13240kp);
                }
            });
        }
        this.A07.setOnClickListener(new ViewOnClickEBaseShape0S0110000_I0(this, A03, 2));
        this.A08.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 7));
        this.A0B.setOnClickListener(new ViewOnClickEBaseShape0S0110000_I0(this, A03, 1));
        this.A09.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 6));
        A1T(0);
        A1R(0);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        if (C2A8.A03(this.A0J)) {
            this.A08.setVisibility(0);
        } else {
            this.A08.setVisibility(8);
        }
    }
}
