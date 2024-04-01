package X;

import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.BusinessAppEducation;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.group.NewGroup;
import com.whatsapp.storage.StorageUsageActivity;
import com.whatsapp.util.Log;

/* renamed from: X.0as */
/* loaded from: classes.dex */
public class C08190as extends AbstractC08200at {
    public static int A0P = 3;
    public static int A0Q = 3;
    public static int A0R = 3;
    public static int A0S = -1;
    public static int A0T = -1;
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public C018308n A05;
    public C02L A06;
    public C01B A07;
    public C06K A08;
    public C0L7 A09;
    public C000400f A0A;
    public AnonymousClass012 A0B;
    public C000500h A0C;
    public C0CA A0D;
    public C003701t A0E;
    public AnonymousClass011 A0F;
    public C2V0 A0G;
    public C51212Uz A0H;
    public C50772Tc A0I;
    public C41941ul A0J;
    public C41951um A0K;
    public InterfaceC002901k A0L;
    public String A0M;
    public int[] A0N;
    public final C468828q A0O;

    public C08190as(Context context) {
        super(context);
        this.A0N = new int[]{12, 1, 11, 13, 14};
        this.A0O = new C468828q(this.A0F, this.A0C);
        C0AT.A0c(this, new C0AS() { // from class: X.0er
            @Override // X.C0AS
            public void A03(View view, AccessibilityEvent accessibilityEvent) {
                view.setLongClickable(false);
            }
        });
        A0Q = this.A0E.A03(354);
        A0P = this.A0E.A03(351);
        A0R = this.A0E.A03(350);
        A0T = this.A0E.A03(352);
        A0S = this.A0E.A03(353);
        this.A0L.ARy(new C0HS() { // from class: X.0es
            {
                C08190as.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0011, code lost:
                if (X.C40731sm.A0l(r3.A07, r3.A0A, r3.A0C) == false) goto L8;
             */
            @Override // X.C0HS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object A07(java.lang.Object[] r5) {
                /*
                    r4 = this;
                    X.0as r3 = X.C08190as.this
                    android.view.View r0 = r3.A03
                    if (r0 != 0) goto L13
                    X.01B r2 = r3.A07
                    X.00f r1 = r3.A0A
                    X.00h r0 = r3.A0C
                    boolean r1 = X.C40731sm.A0l(r2, r1, r0)
                    r0 = 1
                    if (r1 != 0) goto L14
                L13:
                    r0 = 0
                L14:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C09850es.A07(java.lang.Object[]):java.lang.Object");
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    C08190as c08190as = C08190as.this;
                    c08190as.addView(C08190as.getStorageBanner(c08190as));
                }
            }
        }, new Void[0]);
    }

    public static boolean A00(C000500h c000500h) {
        if (c000500h.A00.getInt("education_banner_count", 0) < A0P) {
            return true;
        }
        if (c000500h.A0p(7 * 86400000, "education_banner_timestamp")) {
            C000200d.A0g(c000500h, "education_banner_count", 0);
            return true;
        }
        return false;
    }

    public void A01() {
        this.A00.setVisibility(8);
        C468828q c468828q = this.A0O;
        C000500h c000500h = c468828q.A00;
        c000500h.A0D().putInt("biz_app_cross_sell_banner_dismiss_count", c000500h.A00.getInt("biz_app_cross_sell_banner_dismiss_count", 0) + 1).apply();
        c468828q.A00(3);
    }

    public void A02() {
        this.A0F.A06(new AnonymousClass014() { // from class: X.0et
            {
                AnonymousClass015 anonymousClass015 = AnonymousClass014.DEFAULT_SAMPLING_RATE;
            }
        });
        A07(1, 3);
        C000200d.A0g(this.A0C, "education_banner_count", A0P);
        getGenericBanner().setVisibility(8);
        C000500h c000500h = this.A0C;
        c000500h.A00.edit().putInt("create_group_tip_count", c000500h.A00.getInt("create_group_tip_count", 0) + 1).putLong("create_group_tip_time", this.A0B.A05()).apply();
    }

    public void A03() {
        View view = this.A01;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.A03;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.A04;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = this.A00;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        View view5 = this.A02;
        if (view5 != null) {
            view5.setVisibility(8);
        }
        int bannerType = getBannerType();
        if (bannerType == 12) {
            if (this.A04 == null) {
                addView(getUserNoticeBanner());
                this.A0J.A01(1);
            }
            View userNoticeBanner = getUserNoticeBanner();
            C40791ss A01 = this.A0K.A01();
            if (A01 != null) {
                ((TextView) userNoticeBanner.findViewById(R.id.user_notice_banner_text)).setText(C02180Ae.A0S(getContext(), A01.A04, null));
                ((C2ZT) userNoticeBanner.findViewById(R.id.user_notice_banner_icon)).A02(A01);
                String str = A01.A01;
                String A0m = C02180Ae.A0m(str);
                C003701t c003701t = this.A0E;
                C2A7 A02 = this.A0K.A02();
                if (A02 != null) {
                    boolean A022 = C2A8.A02(c003701t, A02);
                    userNoticeBanner.setOnClickListener(new C09870eu(this, A022, A0m, C02180Ae.A0r(str), userNoticeBanner));
                    View findViewById = userNoticeBanner.findViewById(R.id.cancel);
                    if (A022) {
                        findViewById.setVisibility(0);
                        findViewById.setOnClickListener(new C09880ev(this, userNoticeBanner));
                    } else {
                        findViewById.setVisibility(8);
                    }
                    Log.i("EducationBannerView/updateUserNoticeBanner/banner shown");
                    userNoticeBanner.setVisibility(0);
                    return;
                }
                throw null;
            }
            throw null;
        } else if (bannerType == 0) {
        } else {
            if (bannerType == 1) {
                if (this.A01 == null) {
                    addView(getGenericBanner());
                }
                View genericBanner = getGenericBanner();
                setBackgroundResource(R.color.education_banner);
                TextView textView = (TextView) genericBanner.findViewById(R.id.banner_title);
                textView.setVisibility(0);
                TextView textView2 = (TextView) genericBanner.findViewById(R.id.banner_description);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                this.A09.A05((ImageView) genericBanner.findViewById(R.id.banner_image), R.drawable.new_group_banner);
                textView.setText(R.string.start_group_chat);
                textView2.setText(R.string.start_group_chat_explanation);
                setOnClickListener(new View.OnClickListener() { // from class: X.1Gf
                    {
                        C08190as.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        C08190as.this.A06();
                    }
                });
                genericBanner.findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() { // from class: X.1Gj
                    {
                        C08190as.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        C08190as.this.A02();
                    }
                });
                A07(1, 1);
                if (this.A0C.A0p(86400000L, "education_banner_timestamp")) {
                    C000500h c000500h = this.A0C;
                    C000200d.A0g(c000500h, "education_banner_count", c000500h.A00.getInt("education_banner_count", 0) + 1);
                    C000500h c000500h2 = this.A0C;
                    C000200d.A0g(c000500h2, "groups_banner_total_day_count", c000500h2.A00.getInt("groups_banner_total_day_count", 0) + 1);
                    this.A0C.A0C("education_banner_timestamp");
                }
                getGenericBanner().setVisibility(0);
            } else if (bannerType == 11) {
                getStorageBanner(this).setVisibility(0);
                setBackgroundResource(R.color.storage_usage_banner_almost_full_background_color);
                if (this.A0M == null) {
                    this.A0M = C40731sm.A0N(3, this.A0F);
                }
            } else if (bannerType != 13) {
                if (bannerType == 14) {
                    if (this.A0G.A01() && this.A02 == null) {
                        A07(16, 4);
                        addView(getPaymentsOnboardingBanner());
                    }
                    View paymentsOnboardingBanner = getPaymentsOnboardingBanner();
                    ((TextView) C0AT.A0D(paymentsOnboardingBanner, R.id.banner_title)).setText(getContext().getString(R.string.payments_onboarding_banner_title));
                    ((TextView) C0AT.A0D(paymentsOnboardingBanner, R.id.banner_description)).setText(getContext().getString(R.string.payments_onboarding_banner_description));
                    TextView textView3 = (TextView) C0AT.A0D(paymentsOnboardingBanner, R.id.banner_image);
                    C03650Gn A023 = this.A0G.A03.A02();
                    textView3.setText(A023 != null ? A023.A09.A9O() : null);
                    setBackgroundResource(R.color.chat_banner_background);
                    setOnClickListener(new View.OnClickListener() { // from class: X.1Gl
                        {
                            C08190as.this = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view6) {
                            C08190as.this.A09(view6);
                        }
                    });
                    C0AT.A0D(paymentsOnboardingBanner, R.id.cancel).setOnClickListener(new View.OnClickListener() { // from class: X.1Gh
                        {
                            C08190as.this = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view6) {
                            C08190as.this.A04();
                        }
                    });
                    paymentsOnboardingBanner.setVisibility(0);
                    A07(16, 1);
                    return;
                }
                throw new IllegalStateException(C000200d.A0D("Unhandled banner type: ", bannerType));
            } else {
                C468828q c468828q = this.A0O;
                if (c468828q.A01(this.A07, getContext()) && this.A00 == null) {
                    addView(getBizAppUpsellBanner());
                }
                View bizAppUpsellBanner = getBizAppUpsellBanner();
                ((TextEmojiLabel) bizAppUpsellBanner.findViewById(R.id.smb_upsell_chat_banner_description)).A03(Spannable.Factory.getInstance().newSpannable(Html.fromHtml(getContext().getString(R.string.smb_upsell_chat_banner_description))));
                setBackgroundResource(R.color.chat_banner_background);
                setOnClickListener(new View.OnClickListener() { // from class: X.1Gg
                    {
                        C08190as.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        C08190as.this.A08(view6);
                    }
                });
                bizAppUpsellBanner.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() { // from class: X.1Ge
                    {
                        C08190as.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        C08190as.this.A01();
                    }
                });
                bizAppUpsellBanner.setVisibility(0);
                c468828q.A00(1);
            }
            C000200d.A0h(this.A0G.A00, "payments_onboarding_banner_start_cool_off_timestamp", System.currentTimeMillis());
        }
    }

    public final void A04() {
        View view = this.A02;
        if (view != null) {
            view.setVisibility(8);
            this.A0G.A00();
            A07(16, 3);
            return;
        }
        throw null;
    }

    public /* synthetic */ void A05() {
        C000200d.A0j(this.A0C, "storage_usage_banner_dismissed", true);
        this.A05.A06(getContext(), StorageUsageActivity.A00(getContext(), this.A0M, 3));
    }

    public /* synthetic */ void A06() {
        this.A0F.A06(new AnonymousClass014() { // from class: X.0ew
            {
                AnonymousClass015 anonymousClass015 = AnonymousClass014.DEFAULT_SAMPLING_RATE;
            }
        });
        A07(1, 2);
        C000200d.A0g(this.A0C, "education_banner_count", A0P);
        C000500h c000500h = this.A0C;
        C000200d.A0g(c000500h, "groups_banner_click_count", c000500h.A00.getInt("groups_banner_click_count", 0) + 1);
        NewGroup.A00(C018308n.A00(getContext()), 1, null);
    }

    public final void A07(int i, int i2) {
        C09900ex c09900ex = new C09900ex();
        c09900ex.A00 = Integer.valueOf(i2);
        c09900ex.A01 = Integer.valueOf(i);
        this.A0F.A09(c09900ex, 1);
        AnonymousClass011.A01(c09900ex, "");
    }

    public void A08(View view) {
        Context context = view.getContext();
        context.startActivity(new Intent(context, BusinessAppEducation.class));
        C468828q c468828q = this.A0O;
        C000500h c000500h = c468828q.A00;
        c000500h.A0D().putInt("biz_app_cross_sell_banner_click_count", c000500h.A00.getInt("biz_app_cross_sell_banner_click_count", 0) + 1).apply();
        c468828q.A00(2);
    }

    public void A09(View view) {
        C2V0 c2v0 = this.A0G;
        Context context = view.getContext();
        context.startActivity(new Intent(context, c2v0.A05.A03().ACK()));
        c2v0.A00();
        A04();
        A07(16, 2);
    }

    public boolean A0A() {
        if (this.A0K.A01() != null) {
            return true;
        }
        return A00(this.A0C) && getBannerType() != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x000f, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int getBannerType() {
        /*
            r12 = this;
            int[] r7 = r12.A0N
            int r6 = r7.length
            r5 = 0
            r4 = 0
        L5:
            if (r4 >= r6) goto Ld4
            r0 = r7[r4]
            r3 = 1
            if (r0 == r3) goto L4c
            switch(r0) {
                case 11: goto L39;
                case 12: goto L2e;
                case 13: goto L1d;
                case 14: goto L12;
                default: goto Lf;
            }
        Lf:
            int r4 = r4 + 1
            goto L5
        L12:
            X.2V0 r0 = r12.A0G
            boolean r0 = r0.A01()
            if (r0 == 0) goto Lf
            r0 = 14
            return r0
        L1d:
            X.28q r2 = r12.A0O
            X.01B r1 = r12.A07
            android.content.Context r0 = r12.getContext()
            boolean r0 = r2.A01(r1, r0)
            if (r0 == 0) goto Lf
            r0 = 13
            return r0
        L2e:
            X.1um r0 = r12.A0K
            X.1ss r0 = r0.A01()
            if (r0 == 0) goto Lf
            r0 = 12
            return r0
        L39:
            android.view.View r0 = r12.A03
            if (r0 == 0) goto Lf
            X.01B r2 = r12.A07
            X.00f r1 = r12.A0A
            X.00h r0 = r12.A0C
            boolean r0 = X.C40731sm.A0l(r2, r1, r0)
            if (r0 == 0) goto Lf
            r0 = 11
            return r0
        L4c:
            X.00h r0 = r12.A0C
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = "create_group_tip_count"
            int r2 = r1.getInt(r0, r5)
            X.00h r0 = r12.A0C
            android.content.SharedPreferences r9 = r0.A00
            java.lang.String r8 = "create_group_tip_time"
            r0 = 0
            long r10 = r9.getLong(r8, r0)
            X.0CA r9 = r12.A0D
            X.00h r8 = r12.A0C
            int r0 = X.C08190as.A0T
            if (r0 <= 0) goto L77
            android.content.SharedPreferences r1 = r8.A00
            java.lang.String r0 = "groups_banner_total_day_count"
            int r1 = r1.getInt(r0, r5)
            int r0 = X.C08190as.A0T
            if (r1 <= r0) goto L77
            goto Lf
        L77:
            int r0 = X.C08190as.A0S
            if (r0 <= 0) goto L88
            android.content.SharedPreferences r1 = r8.A00
            java.lang.String r0 = "groups_banner_click_count"
            int r1 = r1.getInt(r0, r5)
            int r0 = X.C08190as.A0S
            if (r1 < r0) goto L88
            goto Lf
        L88:
            X.05M r0 = r9.A00
            r0.A0C()
            java.util.ArrayList r8 = r9.A01
            monitor-enter(r8)
            java.util.Iterator r1 = r8.iterator()     // Catch: java.lang.Throwable -> Ld1
        L94:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r0 == 0) goto Lab
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Ld1
            X.0KM r0 = (X.C0KM) r0     // Catch: java.lang.Throwable -> Ld1
            X.02j r0 = r0.A01     // Catch: java.lang.Throwable -> Ld1
            boolean r0 = X.C003101m.A0U(r0)     // Catch: java.lang.Throwable -> Ld1
            if (r0 == 0) goto L94
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Ld1
            goto Lf
        Lab:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Ld1
            int r1 = r9.A03()
            int r0 = X.C08190as.A0R
            if (r1 < r0) goto Lf
            int r0 = X.C08190as.A0Q
            if (r2 >= r0) goto Lf
            r0 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r10 = r10 + r0
            X.012 r0 = r12.A0B
            long r1 = r0.A05()
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lf
            X.00h r0 = r12.A0C
            boolean r0 = A00(r0)
            if (r0 == 0) goto Lf
            return r3
        Ld1:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Ld1
            throw r0
        Ld4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08190as.getBannerType():int");
    }

    private View getBizAppUpsellBanner() {
        View view = this.A00;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.coversations_biz_app_upsell_chat_banner, (ViewGroup) null, false);
            this.A00 = inflate;
            return inflate;
        }
        return view;
    }

    private View getGenericBanner() {
        if (this.A01 == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.education_banner_row, (ViewGroup) null, false);
            this.A01 = inflate;
            inflate.findViewById(R.id.banner_image);
            C003301p.A06((TextView) this.A01.findViewById(R.id.banner_title));
            this.A01.setBackgroundResource(R.drawable.selector_orange_gradient);
        }
        return this.A01;
    }

    private View getPaymentsOnboardingBanner() {
        View view = this.A02;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.conversations_payments_onboarding_banner, (ViewGroup) null, false);
            this.A02 = inflate;
            return inflate;
        }
        return view;
    }

    public static View getStorageBanner(C08190as c08190as) {
        if (c08190as.A03 == null) {
            View inflate = LayoutInflater.from(c08190as.getContext()).inflate(R.layout.storage_usage_banner, (ViewGroup) null, false);
            c08190as.A03 = inflate;
            inflate.setOnClickListener(new View.OnClickListener() { // from class: X.1Gi
                {
                    C08190as.this = c08190as;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C08190as.this.A05();
                }
            });
            C0AT.A0D(c08190as.A03, R.id.storage_usage_full_close_container).setOnClickListener(new View.OnClickListener() { // from class: X.1Gk
                {
                    C08190as.this = c08190as;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C08190as c08190as2 = C08190as.this;
                    C000200d.A0j(c08190as2.A0C, "storage_usage_banner_dismissed", true);
                    c08190as2.A03.setVisibility(8);
                }
            });
        }
        return c08190as.A03;
    }

    private View getUserNoticeBanner() {
        View view = this.A04;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.conversations_user_notice_banner, (ViewGroup) null, false);
            this.A04 = inflate;
            return inflate;
        }
        return view;
    }
}
