package com.whatsapp;

import X.AbstractActivityC05770Qe;
import X.AbstractC005302j;
import X.AbstractC02800Cx;
import X.AbstractC41791uW;
import X.AbstractC50702Sv;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.ActivityC02330At;
import X.AnonymousClass011;
import X.AnonymousClass012;
import X.AnonymousClass024;
import X.AnonymousClass029;
import X.AnonymousClass057;
import X.AnonymousClass075;
import X.C000200d;
import X.C000400f;
import X.C000500h;
import X.C001200o;
import X.C002301c;
import X.C002701i;
import X.C003601s;
import X.C003701t;
import X.C005002g;
import X.C005102h;
import X.C00A;
import X.C011505r;
import X.C011605s;
import X.C012005w;
import X.C015307e;
import X.C018308n;
import X.C018708s;
import X.C01B;
import X.C01V;
import X.C01o;
import X.C02160Ac;
import X.C02820Cz;
import X.C02C;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C02O;
import X.C03080Ec;
import X.C03120Eg;
import X.C03150Ej;
import X.C03300Fd;
import X.C03340Fh;
import X.C04480Ki;
import X.C04950Mp;
import X.C05480Ox;
import X.C05490Oy;
import X.C05E;
import X.C05G;
import X.C05M;
import X.C05W;
import X.C05Y;
import X.C06C;
import X.C07110Wv;
import X.C07610Yz;
import X.C07630Zb;
import X.C07710Zj;
import X.C07750Zs;
import X.C07800a1;
import X.C0AT;
import X.C0BA;
import X.C0C9;
import X.C0CA;
import X.C0D5;
import X.C0DJ;
import X.C0DK;
import X.C0DU;
import X.C0DV;
import X.C0DW;
import X.C0E6;
import X.C0E7;
import X.C0EG;
import X.C0GG;
import X.C0GR;
import X.C0GU;
import X.C0H4;
import X.C0H9;
import X.C0HA;
import X.C0L5;
import X.C0L6;
import X.C0L8;
import X.C0MJ;
import X.C0MK;
import X.C0MU;
import X.C0O8;
import X.C0U0;
import X.C0U1;
import X.C0V5;
import X.C0VW;
import X.C0We;
import X.C0Z7;
import X.C0Z9;
import X.C0ZM;
import X.C0ZR;
import X.C0ZV;
import X.C0ZW;
import X.C0Zn;
import X.C0Zo;
import X.C26S;
import X.C26Y;
import X.C29X;
import X.C2AQ;
import X.C2AR;
import X.C2L9;
import X.C2Lp;
import X.C2M0;
import X.C2M1;
import X.C2M2;
import X.C2M6;
import X.C2MG;
import X.C2MN;
import X.C2T2;
import X.C2T3;
import X.C2VU;
import X.C40291rx;
import X.C40301ry;
import X.C41181tV;
import X.C41641uH;
import X.C41681uL;
import X.C41911ui;
import X.C42151vF;
import X.C42371vd;
import X.C49722Mc;
import X.C49742Me;
import X.C49752Mf;
import X.C49762Mg;
import X.C50502Sa;
import X.C50512Sb;
import X.InterfaceC002901k;
import X.InterfaceC04900Mj;
import X.InterfaceC05620Pl;
import X.InterfaceC05780Qf;
import X.InterfaceC05790Qg;
import X.InterfaceC05800Qh;
import X.InterfaceC05810Qi;
import X.InterfaceC05820Qj;
import X.InterfaceC05880Qp;
import X.InterfaceC07650Zd;
import X.InterfaceMenuItemC07810a4;
import X.RunnableC28051Pv;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.CameraHomeFragment;
import com.whatsapp.HomeActivity;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.collections.observablelistview.ObservableListView;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.profile.ProfilePhotoReminder;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.settings.Settings;
import com.whatsapp.status.SetStatus;
import com.whatsapp.status.StatusesFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallsFragment;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class HomeActivity extends AbstractActivityC05770Qe implements InterfaceC05780Qf, InterfaceC05790Qg, InterfaceC05800Qh, InterfaceC05810Qi, InterfaceC05820Qj {
    public static List A1w = new ArrayList();
    public static final int A1x;
    public static final int A1y;
    public static final int A1z;
    public static final int A20;
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public AnimatorSet A05;
    public BroadcastReceiver A06;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public TextView A0F;
    public C0U0 A0G;
    public SearchView A0H;
    public Toolbar A0I;
    public CameraHomeFragment A0K;
    public C04480Ki A0L;
    public C012005w A0M;
    public TabsPager A0N;
    public C0ZR A0O;
    public C07710Zj A0P;
    public C02L A0Q;
    public PagerSlidingTabStrip A0R;
    public C005002g A0S;
    public C03150Ej A0T;
    public C01B A0U;
    public C04950Mp A0V;
    public C0E6 A0W;
    public C0L8 A0X;
    public C011605s A0Y;
    public C2Lp A0Z;
    public C29X A0a;
    public C05W A0b;
    public C42371vd A0c;
    public AnonymousClass075 A0d;
    public C018708s A0e;
    public C011505r A0f;
    public C0L5 A0g;
    public C2L9 A0h;
    public C03120Eg A0i;
    public C000400f A0j;
    public C0E7 A0k;
    public C02E A0l;
    public AnonymousClass012 A0m;
    public C001200o A0n;
    public C005102h A0o;
    public C02F A0p;
    public C41181tV A0q;
    public C05M A0r;
    public C0DK A0s;
    public C03340Fh A0u;
    public C0CA A0v;
    public C0C9 A0w;
    public C0D5 A0x;
    public C0GU A0y;
    public C0H4 A0z;
    public C00A A10;
    public C05E A11;
    public C003701t A12;
    public C03300Fd A13;
    public C0HA A14;
    public AnonymousClass011 A15;
    public C05Y A16;
    public C40291rx A17;
    public C0EG A18;
    public C41681uL A19;
    public C40301ry A1A;
    public C03080Ec A1B;
    public C0DU A1C;
    public C0GR A1D;
    public C0DW A1E;
    public C0DV A1F;
    public AnonymousClass057 A1G;
    public C2AQ A1H;
    public C02O A1I;
    public C26Y A1J;
    public C42151vF A1K;
    public C05G A1L;
    public SearchViewModel A1M;
    public AbstractC41791uW A1N;
    public C49742Me A1O;
    public C2M0 A1P;
    public C2M1 A1Q;
    public C2MN A1R;
    public C49752Mf A1S;
    public C49722Mc A1T;
    public C2AR A1U;
    public C2M2 A1V;
    public C26S A1W;
    public C2MG A1X;
    public C41911ui A1Y;
    public C0H9 A1Z;
    public C02C A1a;
    public C2M6 A1b;
    public InterfaceC002901k A1c;
    public C05480Ox A1e;
    public C49762Mg A1f;
    public C41641uH A1g;
    public C0L6 A1h;
    public boolean A1i;
    public boolean A1j;
    public boolean A1k;
    public boolean A1l;
    public final Rect A1m = new Rect();
    public final C07610Yz A1o = new C07610Yz();
    public final Random A1v = new Random();
    public int A03 = 200;
    public C0GG A0t = null;
    public C05490Oy A1d = null;
    public final Runnable A1s = new Runnable() { // from class: X.1HJ
        {
            HomeActivity.this = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            HomeActivity.this.A1e();
        }
    };
    public final Runnable A1r = new Runnable() { // from class: X.1HB
        {
            HomeActivity.this = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            HomeActivity.this.A1f();
        }
    };
    public final Runnable A1t = new Runnable() { // from class: X.1HC
        {
            HomeActivity.this = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            HomeActivity homeActivity = HomeActivity.this;
            if (homeActivity.A03 == 300) {
                homeActivity.A1Z();
            }
        }
    };
    public final Runnable A1u = new Runnable() { // from class: X.1HQ
        {
            HomeActivity.this = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    };
    public final C01o A1q = new C01o() { // from class: X.1hQ
        {
            HomeActivity.this = this;
        }

        @Override // X.C01o
        public final void ALd() {
            HomeActivity.this.A1k = true;
        }
    };
    public final InterfaceC05880Qp A1p = new InterfaceC05880Qp() { // from class: X.0Z3
        {
            HomeActivity.this = this;
        }

        @Override // X.InterfaceC05880Qp
        public void ANZ(String str) {
            HomeActivity homeActivity = HomeActivity.this;
            boolean A01 = C000400f.A01();
            int i = R.string.record_need_sd_card_title_shared_storage;
            if (A01) {
                i = R.string.record_need_sd_card_title;
            }
            boolean A012 = C000400f.A01();
            int i2 = R.string.record_need_sd_card_message_shared_storage;
            if (A012) {
                i2 = R.string.record_need_sd_card_message;
            }
            homeActivity.AUl(i, i2, new Object[0]);
        }

        @Override // X.InterfaceC05880Qp
        public void ANa() {
            HomeActivity.this.AUl(R.string.alert, R.string.permission_storage_need_access, new Object[0]);
        }

        @Override // X.InterfaceC05880Qp
        public void AQ0(String str) {
            HomeActivity homeActivity = HomeActivity.this;
            boolean A01 = C000400f.A01();
            int i = R.string.record_need_sd_card_title_shared_storage;
            if (A01) {
                i = R.string.record_need_sd_card_title;
            }
            boolean A012 = C000400f.A01();
            int i2 = R.string.record_need_sd_card_message_shared_storage;
            if (A012) {
                i2 = R.string.record_need_sd_card_message;
            }
            homeActivity.AUl(i, i2, new Object[0]);
        }

        @Override // X.InterfaceC05880Qp
        public void AQ1() {
            HomeActivity.this.AUl(R.string.alert, R.string.permission_storage_need_access, new Object[0]);
        }
    };
    public C0Z7 A0J = new C0Z7() { // from class: X.0Z4
        public boolean A00 = false;

        {
            HomeActivity.this = this;
        }

        public final void A00() {
            HomeActivity homeActivity = HomeActivity.this;
            C29X c29x = homeActivity.A0a;
            if (!c29x.A0S()) {
                CameraHomeFragment cameraHomeFragment = homeActivity.A0K;
                if (cameraHomeFragment != null) {
                    cameraHomeFragment.A0V(true);
                }
                homeActivity.getLayoutInflater().inflate(R.layout.camera_view, (ViewGroup) homeActivity.findViewById(R.id.camera_frame), true);
                homeActivity.A0a.A0H(homeActivity, null, 0L, null, false, null, null, null, null, homeActivity.A0U.A0E(C01C.A25) || (homeActivity.A1E.A04() && homeActivity.A0U.A0E(C01C.A1s)), false);
            } else {
                c29x.A07();
            }
            if (RequestPermissionActivity.A0N(homeActivity, homeActivity.A0p, 30) && homeActivity.A0j.A0A(homeActivity.A1p)) {
                if (homeActivity.A0j.A02() < ((homeActivity.A0U.A07(C01C.A3Y) << 10) << 10)) {
                    C40731sm.A0c(homeActivity.A15, homeActivity, homeActivity, 5);
                } else {
                    homeActivity.A0a.A08();
                    return;
                }
            }
            homeActivity.A0a.A0x.A01 = 0L;
        }

        /* JADX WARN: Code restructure failed: missing block: B:112:0x00e9, code lost:
            if (r5 != false) goto L13;
         */
        @Override // X.C0Z7, X.C0Z8
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void AMh(int r11, float r12, int r13) {
            /*
                Method dump skipped, instructions count: 240
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C0Z4.AMh(int, float, int):void");
        }

        @Override // X.C0Z8
        public void AMi(int i) {
            int i2;
            HomeActivity homeActivity = HomeActivity.this;
            C0U0 c0u0 = homeActivity.A0G;
            if (c0u0 != null) {
                c0u0.A05();
            }
            homeActivity.A1m(true);
            homeActivity.A03 = homeActivity.A1Q(i);
            homeActivity.A1d();
            int i3 = homeActivity.A03;
            if (i3 == 400) {
                C018508q c018508q = ((ActivityC02290Ap) homeActivity).A0A;
                Runnable runnable = homeActivity.A1s;
                c018508q.A02.removeCallbacks(runnable);
                ((ActivityC02290Ap) homeActivity).A0A.A02.postDelayed(runnable, 500L);
            } else if (i3 == 200) {
                C018508q c018508q2 = ((ActivityC02290Ap) homeActivity).A0A;
                Runnable runnable2 = homeActivity.A1r;
                c018508q2.A02.removeCallbacks(runnable2);
                ((ActivityC02290Ap) homeActivity).A0A.A02.postDelayed(runnable2, 500L);
            } else if (i3 == 300) {
                C018508q c018508q3 = ((ActivityC02290Ap) homeActivity).A0A;
                Runnable runnable3 = homeActivity.A1t;
                c018508q3.A02.removeCallbacks(runnable3);
                ((ActivityC02290Ap) homeActivity).A0A.A02.postDelayed(runnable3, 500L);
            }
            C0BA A1U = homeActivity.A1U();
            Iterator it = homeActivity.A0t().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0BA c0ba = (C0BA) it.next();
                if (c0ba instanceof C0MK) {
                    ((C0MK) c0ba).ATq(A1U == c0ba);
                }
            }
            if (A1U != null) {
                homeActivity.A0P.A01((C0MJ) A1U);
            }
            if (homeActivity.A03 != 100) {
                ObservableListView A1X = homeActivity.A1X();
                if (A1X != null && A1X.getChildCount() > 0) {
                    int height = homeActivity.A0R.getHeight();
                    int i4 = A1X.getFirstVisiblePosition() > 0 ? height : -A1X.getChildAt(0).getTop();
                    View childAt = A1X.getChildAt(A1X.getChildCount() - 1);
                    if (childAt.getBottom() > A1X.getBottom()) {
                        i2 = childAt.getBottom() - A1X.getBottom();
                    } else {
                        i2 = 0;
                    }
                    if (i4 + i2 >= height) {
                        if (homeActivity.A01 == 0) {
                            if (A1X.getCurrentScrollY() > 0) {
                                A1X.setSelection(0);
                                return;
                            }
                            return;
                        } else if (A1X.getCurrentScrollY() >= homeActivity.A0I.getHeight()) {
                            return;
                        } else {
                            A1X.setSelection(1);
                            return;
                        }
                    }
                }
                homeActivity.A1a();
            } else if (this.A00) {
            } else {
                this.A00 = true;
                A00();
            }
        }
    };
    public final Interpolator A1n = new C015307e();
    public View.OnLayoutChangeListener A07 = new C0Z9(this);

    @Override // X.InterfaceC05780Qf
    public boolean AUZ() {
        return false;
    }

    static {
        int i = Build.VERSION.SDK_INT;
        A1z = i >= 21 ? 250 : 220;
        A20 = i >= 21 ? 250 : 220;
        A1x = i >= 21 ? 500 : 220;
        A1y = i < 21 ? 220 : 250;
    }

    public static int A00(C002301c c002301c, int i) {
        if (c002301c.A0M()) {
            return A1w.indexOf(Integer.valueOf(i));
        }
        return (A1w.size() - A1w.indexOf(Integer.valueOf(i))) - 1;
    }

    public static Intent A01(Context context) {
        return new Intent(context, HomeActivity.class).setAction("com.whatsapp.intent.action.CHATS");
    }

    public static final Pair A02(int i, int i2, int i3, int i4) {
        double sqrt = i / (Build.VERSION.SDK_INT >= 21 ? Math.sqrt((i3 * i3) + (i2 * i2)) / i3 : 1.0d);
        int i5 = (int) ((i4 / i3) * sqrt);
        return new Pair(Integer.valueOf(i5), Integer.valueOf((int) (sqrt - i5)));
    }

    public static void A03(View view, C0BA c0ba, final int i) {
        ActivityC02330At A09 = c0ba.A09();
        if (A09 instanceof HomeActivity) {
            HomeActivity homeActivity = (HomeActivity) A09;
            ViewGroup viewGroup = (ViewGroup) view.findViewById(16908290);
            viewGroup.setPadding(0, homeActivity.A1P(), 0, 0);
            viewGroup.setClipToPadding(false);
            viewGroup.setClipChildren(false);
            ObservableListView observableListView = (ObservableListView) view.findViewById(16908298);
            View view2 = new View(homeActivity) { // from class: X.0ZB
                @Override // android.view.View
                public void onMeasure(int i2, int i3) {
                    super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(getContext().getResources().getDimensionPixelSize(R.dimen.tab_height), 1073741824));
                }
            };
            C0AT.A0V(view2, 2);
            observableListView.addHeaderView(view2, null, false);
            View view3 = new View(homeActivity) { // from class: X.0ZC
                @Override // android.view.View
                public void onMeasure(int i2, int i3) {
                    super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(i, 1073741824));
                }
            };
            C0AT.A0V(view3, 2);
            observableListView.addFooterView(view3, null, false);
            observableListView.setScrollViewCallbacks(homeActivity);
        }
    }

    @Override // X.ActivityC02330At
    public void A0Y(C0BA c0ba, Intent intent, int i, Bundle bundle) {
        if (intent.getLongExtra("row_id", -1L) == -1 && A1s()) {
            if (A1r()) {
                SearchFragment searchFragment = (SearchFragment) A0N().A0Q.A01("search_fragment");
                if (searchFragment != null) {
                    searchFragment.A16.A0F(1);
                }
            } else {
                ((ActivityC02290Ap) this).A0A.A02.postDelayed(new Runnable() { // from class: X.1HH
                    {
                        HomeActivity.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        HomeActivity.this.A1m(false);
                    }
                }, getResources().getInteger(17694722));
            }
        }
        super.A0Y(c0ba, intent, i, bundle);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As
    public C0U0 A0e(C0O8 c0o8) {
        this.A0G = super.A0e(c0o8);
        if (!A1s()) {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setObjectValues(Integer.valueOf(C02160Ac.A00(this, R.color.primary)), Integer.valueOf(C02160Ac.A00(this, R.color.action_mode)));
            valueAnimator.setEvaluator(new ArgbEvaluator());
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.1HO
                {
                    HomeActivity.this = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    HomeActivity homeActivity = HomeActivity.this;
                    homeActivity.A0R.setBackgroundColor(((Number) valueAnimator2.getAnimatedValue()).intValue());
                    int i = 0;
                    while (true) {
                        C0ZR c0zr = homeActivity.A0O;
                        if (i < c0zr.A00) {
                            c0zr.A0H(i).A03.setTextColor(((Number) valueAnimator2.getAnimatedValue()).intValue());
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            });
            valueAnimator.start();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C02160Ac.A00(this, R.color.action_mode_dark));
        }
        C018308n.A04(findViewById(R.id.action_mode_bar), getWindowManager());
        return this.A0G;
    }

    @Override // X.ActivityC02290Ap
    public void A10(int i) {
        if (A1Q(this.A0N.getCurrentItem()) == 100) {
            if (i == R.string.permission_storage_need_access || i == R.string.record_need_sd_card_message || i == R.string.record_need_sd_card_message_shared_storage || i == R.string.error_no_disc_space || i == R.string.insufficient_storage_dialog_subtitle) {
                this.A0N.A0B(A00(((ActivityC02310Ar) this).A01, 200), true);
            }
        }
    }

    public final int A1P() {
        int i = Build.VERSION.SDK_INT >= 22 ? 0 : 1;
        return A1w.size() > 1 ? i + getResources().getDimensionPixelSize(R.dimen.actionbar_height) : i;
    }

    public final int A1Q(int i) {
        if (((ActivityC02310Ar) this).A01.A0M()) {
            return ((Number) A1w.get(i)).intValue();
        }
        List list = A1w;
        return ((Number) list.get((list.size() - i) - 1)).intValue();
    }

    public final Animator A1R(int i) {
        final View A1T = A1T();
        if (A1T != null) {
            A1T.clearAnimation();
            ValueAnimator ofInt = ValueAnimator.ofInt((int) A1T.getTranslationY(), i);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.1HL
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    A1T.setTranslationY(((Number) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            return ofInt;
        }
        return null;
    }

    public final Animator A1S(int i, int i2, final boolean z) {
        final LinearLayout.LayoutParams layoutParams;
        this.A09.clearAnimation();
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        final FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        if (z) {
            layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.1HI
            {
                HomeActivity.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                HomeActivity homeActivity = HomeActivity.this;
                boolean z2 = z;
                FrameLayout.LayoutParams layoutParams3 = layoutParams2;
                LinearLayout.LayoutParams layoutParams4 = layoutParams;
                int intValue = ((Number) valueAnimator.getAnimatedValue()).intValue();
                if (z2) {
                    layoutParams3.height = intValue;
                } else {
                    layoutParams4.height = intValue;
                }
                homeActivity.A0E.setLayoutParams(layoutParams4);
                homeActivity.A09.setLayoutParams(layoutParams3);
            }
        });
        return ofInt;
    }

    public final View A1T() {
        View view;
        C0BA A1U = A1U();
        if (A1U == null || (view = A1U.A0A) == null) {
            return null;
        }
        return view.findViewById(16908290);
    }

    public final C0BA A1U() {
        return (C0BA) A1W(A00(((ActivityC02310Ar) this).A01, this.A03));
    }

    public final C0MK A1V() {
        return A1W(A00(((ActivityC02310Ar) this).A01, this.A03));
    }

    public final C0MK A1W(int i) {
        int A1Q = A1Q(i);
        for (C0BA c0ba : A0t()) {
            if (A1Q == 100) {
                if (c0ba instanceof CameraHomeFragment) {
                    return (CameraHomeFragment) c0ba;
                }
            } else if (A1Q == 200) {
                if (c0ba instanceof ConversationsFragment) {
                    return (C0MK) c0ba;
                }
            } else if (A1Q == 300) {
                if (c0ba instanceof StatusesFragment) {
                    return (C0MK) c0ba;
                }
            } else if (A1Q == 400 && (c0ba instanceof CallsFragment)) {
                return (C0MK) c0ba;
            }
        }
        return null;
    }

    public final ObservableListView A1X() {
        View view;
        C0BA A1U = A1U();
        if (A1U == null || (view = A1U.A0A) == null) {
            return null;
        }
        return (ObservableListView) view.findViewById(16908298);
    }

    public void A1Y() {
        if (!ProfilePhotoReminder.A01() && this.A0k.A05()) {
            C000500h c000500h = ((ActivityC02290Ap) this).A0F;
            C005002g c005002g = this.A0S;
            synchronized (ProfilePhotoReminder.class) {
                if (c005002g.A04()) {
                    return;
                }
                long j = ProfilePhotoReminder.A0Q;
                if (j < 0) {
                    j = c000500h.A00.getLong("wa_last_reminder_timestamp", -1L);
                    ProfilePhotoReminder.A0Q = j;
                }
                if (j >= 0) {
                    boolean z = (new Date(System.currentTimeMillis()).getTime() - new Date(ProfilePhotoReminder.A0Q).getTime()) / 86400000 >= 90;
                    if (!z) {
                        return;
                    }
                }
                C02L c02l = this.A0Q;
                c02l.A05();
                if (c02l.A01 != null) {
                    C011505r c011505r = this.A0f;
                    C02L c02l2 = this.A0Q;
                    c02l2.A05();
                    if (c011505r.A04(c02l2.A01).exists()) {
                        return;
                    }
                }
                ProfilePhotoReminder.A00(((ActivityC02290Ap) this).A0F, this.A0S);
                ((ActivityC02290Ap) this).A0A.A02.post(new Runnable() { // from class: X.1HD
                    {
                        HomeActivity.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        HomeActivity.this.A1g();
                    }
                });
            }
        }
    }

    public final void A1Z() {
        C0ZV A0H = this.A0O.A0H(A00(((ActivityC02310Ar) this).A01, 300));
        if (A0H.A00 != 0) {
            A0H.A00 = 0;
            A1d();
        }
        long j = this.A04;
        if (j != 0) {
            C000200d.A0h(((ActivityC02290Ap) this).A0F, "last_notified_status_row_id", j);
        }
    }

    public final void A1a() {
        if (this.A09.getTranslationY() != 0.0f) {
            this.A09.animate().cancel();
            this.A09.animate().translationY(0.0f).setDuration(250L).start();
            this.A01 = 0;
        }
        A1n(true);
    }

    public final void A1b() {
        this.A1j = false;
        AbstractC02800Cx A0N = A0N();
        if (A0N.A0r()) {
            return;
        }
        SearchFragment searchFragment = (SearchFragment) A0N.A0Q.A01("search_fragment");
        if (searchFragment != null) {
            searchFragment.A10();
            searchFragment.A16.A0L(false);
        }
        AbstractC02800Cx A0N2 = A0N();
        A0N2.A0g(new C0ZW(A0N2, "search_fragment", -1, 1), false);
        this.A0C.setVisibility(8);
        SearchViewModel searchViewModel = this.A1M;
        if (searchViewModel != null) {
            searchViewModel.A0G(0);
            this.A1M.A0F(4);
        }
    }

    public final void A1c() {
        Iterator it = this.A0v.A08().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.A0r.A01((AbstractC005302j) it.next()) != 0) {
                i++;
            }
        }
        this.A0O.A0H(A00(((ActivityC02310Ar) this).A01, 200)).A00 = i;
        if (A1w.contains(400)) {
            C0ZV A0H = this.A0O.A0H(A00(((ActivityC02310Ar) this).A01, 400));
            C03080Ec c03080Ec = this.A1B;
            c03080Ec.A04();
            int size = c03080Ec.A00.size();
            C49762Mg c49762Mg = this.A1f;
            c49762Mg.A02();
            A0H.A00 = size + c49762Mg.A00.size();
        }
        A1d();
    }

    public final void A1d() {
        int A00 = A00(((ActivityC02310Ar) this).A01, this.A03);
        int i = 0;
        while (true) {
            C0ZR c0zr = this.A0O;
            if (i < c0zr.A00) {
                C0ZV A0H = c0zr.A0H(i);
                if (A1Q(i) == 300) {
                    A0H.A03.setVisibility(8);
                    A0H.A02.setVisibility(A0H.A00 > 0 ? 0 : 8);
                } else if (A0H.A00 > 0) {
                    A0H.A03.setVisibility(0);
                    A0H.A03.setText(((ActivityC02310Ar) this).A01.A0G().format(A0H.A00));
                    int i2 = R.color.homeActivityTabInactive;
                    if (i == A00) {
                        i2 = R.color.homeActivityTabActive;
                    }
                    C50502Sa c50502Sa = new C50502Sa(C02160Ac.A00(this, i2));
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.tab_badge_padding);
                    c50502Sa.A04.set(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                    A0H.A03.setBackground(c50502Sa);
                } else {
                    A0H.A03.setVisibility(8);
                }
                if (A0H.A02.getDrawable() != null) {
                    A0H.A02.setSelected(i == A00);
                }
                A0H.A01.setSelected(i == A00);
                TextView textView = A0H.A04;
                int i3 = R.color.homeActivityTabInactive;
                if (i == A00) {
                    i3 = R.color.homeActivityTabActive;
                }
                textView.setTextColor(C02160Ac.A00(this, i3));
                i++;
            } else {
                return;
            }
        }
    }

    public /* synthetic */ void A1e() {
        if (this.A03 == 400) {
            this.A1f.A01();
            this.A1B.A02();
        }
    }

    public /* synthetic */ void A1f() {
        if (this.A03 == 200) {
            this.A1A.A0C(true);
            this.A1B.A03();
        }
    }

    public /* synthetic */ void A1g() {
        A14(new Intent(this, ProfilePhotoReminder.class));
    }

    public final void A1h(int i) {
        this.A0N.A0B(A00(((ActivityC02310Ar) this).A01, i), false);
        this.A03 = i;
    }

    public final void A1i(Intent intent) {
        if (intent.getBooleanExtra("show_mute", false)) {
            this.A13.A01 = 8;
            AbstractC005302j A02 = AbstractC005302j.A02(intent.getStringExtra("mute_jid"));
            if (A02 != null) {
                MuteDialogFragment.A01(Collections.singleton(A02)).A14(A0N(), null);
                return;
            }
            throw null;
        }
    }

    public final void A1j(Intent intent) {
        Uri data = intent.getData();
        if (C50512Sb.A01(data)) {
            C06C A05 = this.A0b.A05(C50512Sb.A00(data));
            C0MK A1V = A1V();
            if (A05 == null || A1V == null) {
                return;
            }
            A1V.ASF(A05);
        }
    }

    public /* synthetic */ void A1k(C07110Wv c07110Wv) {
        Rect rect = this.A1m;
        rect.set(c07110Wv.A02(), c07110Wv.A04(), c07110Wv.A03(), c07110Wv.A01());
        findViewById(R.id.navigation_bar_protection).setPadding(0, 0, 0, rect.bottom);
        View findViewById = findViewById(R.id.action_mode_bar);
        if (Build.VERSION.SDK_INT < 19 || findViewById == null) {
            return;
        }
        findViewById.setX(rect.left);
    }

    public final void A1l(String str) {
        int width;
        int i;
        C0MJ c0mj;
        C0MK A1V = A1V();
        if (A1V == null || !A1V.AVJ() || A1s()) {
            return;
        }
        View findViewById = findViewById(R.id.menuitem_search);
        if (findViewById != null) {
            int[] iArr = new int[2];
            findViewById.getLocationInWindow(iArr);
            width = (findViewById.getWidth() / 2) + iArr[0];
            i = (findViewById.getHeight() / 2) + findViewById.getTop();
        } else {
            width = this.A09.getWidth();
            i = 0;
        }
        if (AnonymousClass029.A1S(this.A0x) && this.A03 == 200) {
            if (this.A0C == null) {
                return;
            }
            C0MK A1V2 = A1V();
            if ((A1V2 instanceof C0MJ) && (c0mj = (C0MJ) A1V2) != null) {
                C07710Zj c07710Zj = this.A0P;
                c07710Zj.A02 = true;
                c07710Zj.A01(c0mj);
            }
            AbstractC02800Cx A0N = A0N();
            C0BA A01 = A0N.A0Q.A01("search_fragment");
            this.A0C.setVisibility(0);
            if (A01 == null) {
                Integer valueOf = Integer.valueOf(A1x);
                Integer valueOf2 = Integer.valueOf(A1y);
                SearchFragment searchFragment = new SearchFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("x", width);
                bundle.putInt("y", i);
                if (valueOf != null) {
                    bundle.putInt("enter_duration_ms", valueOf.intValue());
                }
                if (valueOf2 != null) {
                    bundle.putInt("exit_duration_ms", valueOf2.intValue());
                }
                searchFragment.A0P(bundle);
                C02820Cz c02820Cz = new C02820Cz(A0N);
                c02820Cz.A0F = true;
                c02820Cz.A01(R.id.search_fragment_holder, searchFragment, "search_fragment");
                c02820Cz.A03("search_fragment");
                c02820Cz.A04();
                A0N.A0B();
                this.A0C.addOnLayoutChangeListener(this.A07);
            }
        } else {
            if (this.A0H == null) {
                C07630Zb.A00(this.A0D);
                getLayoutInflater().inflate(R.layout.home_search_view_layout, (ViewGroup) this.A0D, true);
                SearchView searchView = (SearchView) this.A0D.findViewById(R.id.search_view);
                this.A0H = searchView;
                ((TextView) searchView.findViewById(R.id.search_src_text)).setTextColor(C02160Ac.A00(this, R.color.search_text_color));
                this.A0H.setIconifiedByDefault(false);
                this.A0H.setQueryHint(((ActivityC02310Ar) this).A01.A06(R.string.search_hint));
                SearchView searchView2 = this.A0H;
                searchView2.A0B = new InterfaceC07650Zd() { // from class: X.0Zc
                    @Override // X.InterfaceC07650Zd
                    public boolean ANY(String str2) {
                        return false;
                    }

                    {
                        HomeActivity.this = this;
                    }

                    @Override // X.InterfaceC07650Zd
                    public boolean ANX(String str2) {
                        HomeActivity homeActivity = HomeActivity.this;
                        C0MK A1W = homeActivity.A1W(HomeActivity.A00(((ActivityC02310Ar) homeActivity).A01, homeActivity.A03));
                        if (A1W != null) {
                            C07610Yz c07610Yz = homeActivity.A1o;
                            c07610Yz.A01 = str2;
                            A1W.A5V(c07610Yz);
                            return false;
                        }
                        return false;
                    }
                };
                ((ImageView) searchView2.findViewById(R.id.search_mag_icon)).setImageDrawable(new InsetDrawable(C02160Ac.A03(this, R.drawable.ic_back_teal)) { // from class: X.0Ze
                    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
                    public void draw(Canvas canvas) {
                    }
                });
                this.A0H.A07 = new View.OnClickListener() { // from class: X.1HE
                    {
                        HomeActivity.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HomeActivity.this.lambda$initSearchView$2839$HomeActivity(view);
                    }
                };
                if (!AnonymousClass024.A0j(str)) {
                    this.A0H.A0H(str);
                }
                ImageView imageView = (ImageView) this.A0D.findViewById(R.id.search_back);
                imageView.setImageDrawable(new C0We(((ActivityC02310Ar) this).A01, C02160Ac.A03(this, R.drawable.ic_back_teal)));
                imageView.setOnClickListener(new View.OnClickListener() { // from class: X.1H8
                    {
                        HomeActivity.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HomeActivity.this.A1m(true);
                    }
                });
            }
            this.A0D.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.A0D.isAttachedToWindow()) {
                    View view = this.A0D;
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, width, i, 0.0f, view.getWidth());
                    createCircularReveal.setDuration(A1z);
                    createCircularReveal.start();
                }
            } else {
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, -this.A0D.getHeight(), 0.0f);
                translateAnimation.setDuration(A1z);
                this.A0D.clearAnimation();
                this.A0D.startAnimation(translateAnimation);
            }
            View A1T = A1T();
            if (A1T != null) {
                A1T.setPadding(0, A1P() - getResources().getDimensionPixelSize(R.dimen.tab_height), 0, 0);
                A1T.clearAnimation();
                TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, getResources().getDimensionPixelSize(R.dimen.tab_height), 0.0f);
                translateAnimation2.setDuration((A1z << 2) / 3);
                translateAnimation2.setAnimationListener(new C0DJ() { // from class: X.0Zf
                    {
                        HomeActivity.this = this;
                    }

                    @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        HomeActivity.this.A0H.setIconified(false);
                    }
                });
                A1T.startAnimation(translateAnimation2);
            } else {
                this.A0H.setIconified(false);
            }
            TranslateAnimation translateAnimation3 = new TranslateAnimation(0.0f, 0.0f, 0.0f, -getResources().getDimensionPixelSize(R.dimen.tab_height));
            translateAnimation3.setDuration(A1z);
            this.A09.startAnimation(translateAnimation3);
            this.A09.setVisibility(8);
            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().setStatusBarColor(C02160Ac.A00(this, R.color.searchBackground_dark));
            }
        }
        C0BA A1U = A1U();
        if (A1U instanceof InterfaceC04900Mj) {
            ((InterfaceC04900Mj) A1U).A7E();
        }
    }

    public void A1m(boolean z) {
        int i;
        C0MJ c0mj;
        if (A1s() || A1q()) {
            if (!A1r() && !A1q()) {
                this.A1o.A01 = "";
                this.A0H.A0H("");
                if (z) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        int width = (this.A0D.getWidth() - getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_overflow_material)) - (getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material) / 2);
                        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.A0D, ((ActivityC02310Ar) this).A01.A0M() ? width : this.A0D.getWidth() - width, this.A0D.getHeight() / 2, width, 0.0f);
                        createCircularReveal.setDuration(A20);
                        createCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: X.0aB
                            {
                                HomeActivity.this = this;
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                super.onAnimationEnd(animator);
                                HomeActivity homeActivity = HomeActivity.this;
                                homeActivity.A0H.setIconified(true);
                                homeActivity.A0D.setVisibility(4);
                            }
                        });
                        createCircularReveal.start();
                    } else {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -this.A0D.getHeight());
                        AnimationSet animationSet = new AnimationSet(true);
                        animationSet.addAnimation(alphaAnimation);
                        animationSet.addAnimation(translateAnimation);
                        animationSet.setDuration(A20);
                        animationSet.setAnimationListener(new C0DJ() { // from class: X.0Zk
                            {
                                HomeActivity.this = this;
                            }

                            @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                            public void onAnimationEnd(Animation animation) {
                                HomeActivity homeActivity = HomeActivity.this;
                                homeActivity.A0H.setIconified(true);
                                homeActivity.A0D.setVisibility(4);
                            }
                        });
                        this.A0D.startAnimation(animationSet);
                    }
                } else {
                    this.A0H.setIconified(true);
                    this.A0D.setVisibility(4);
                }
                A1o(z);
            } else if (A0N().A0r()) {
                return;
            } else {
                A1o(false);
                C0MK A1V = A1V();
                if ((A1V instanceof C0MJ) && (c0mj = (C0MJ) A1V) != null) {
                    C07710Zj c07710Zj = this.A0P;
                    c07710Zj.A02 = false;
                    c07710Zj.A01(c0mj);
                }
                SearchFragment searchFragment = (SearchFragment) A0N().A0Q.A01("search_fragment");
                this.A0C.setBackgroundResource(0);
                if (!this.A1j) {
                    this.A1j = true;
                    if (searchFragment != null) {
                        if (!z) {
                            this.A1j = false;
                            AbstractC02800Cx A0N = A0N();
                            if (!A0N.A0r()) {
                                SearchFragment searchFragment2 = (SearchFragment) A0N.A0Q.A01("search_fragment");
                                if (searchFragment2 != null) {
                                    searchFragment2.A10();
                                    searchFragment2.A16.A0L(false);
                                }
                                AbstractC02800Cx A0N2 = A0N();
                                A0N2.A0g(new C0ZW(A0N2, "search_fragment", -1, 1), false);
                                this.A0C.setVisibility(8);
                                SearchViewModel searchViewModel = this.A1M;
                                if (searchViewModel != null) {
                                    searchViewModel.A0G(0);
                                    this.A1M.A0F(4);
                                }
                            }
                        } else {
                            Runnable runnable = new Runnable() { // from class: X.0Zm
                                {
                                    HomeActivity.this = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    HomeActivity.this.A1b();
                                }
                            };
                            if (searchFragment.A02 != null) {
                                searchFragment.A10();
                                searchFragment.A12(searchFragment.A02.getLeft(), searchFragment.A02.getTop(), searchFragment.A02.getRight(), searchFragment.A02.getBottom(), false, runnable);
                            }
                        }
                    }
                    this.A0C.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                    Animator A1R = A1R(0);
                    Animator A1S = A1S(this.A0E.getHeight(), 0, false);
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.tab_height) + A1P();
                    int width2 = this.A09.getWidth();
                    int height = this.A09.getHeight();
                    if (z) {
                        i = A1y;
                    } else {
                        i = 0;
                    }
                    Pair A02 = A02(i, height, width2, dimensionPixelSize);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setStartDelay(((Number) A02.first).intValue());
                    animatorSet.setDuration(((Number) A02.second).intValue());
                    animatorSet.setInterpolator(this.A1n);
                    animatorSet.playTogether(A1S, A1R);
                    animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.0Zl
                        {
                            HomeActivity.this = this;
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            HomeActivity.this.A09.setVisibility(0);
                        }
                    });
                    animatorSet.start();
                }
            }
            C0MK A1W = A1W(A00(((ActivityC02310Ar) this).A01, this.A03));
            if (A1W != null) {
                A1W.ATp(false);
            }
        }
    }

    public final void A1n(boolean z) {
        C0BA c0ba;
        View view;
        ObservableListView observableListView;
        int height = this.A0I.getHeight();
        for (int i = 0; i < this.A0O.A00; i++) {
            if (i != this.A0N.getCurrentItem() && (c0ba = (C0BA) A1W(i)) != null && (view = c0ba.A0A) != null && (observableListView = (ObservableListView) view.findViewById(16908298)) != null) {
                int currentScrollY = observableListView.getCurrentScrollY();
                if (z) {
                    if (currentScrollY > 0) {
                        observableListView.setSelection(0);
                    }
                } else if (currentScrollY < height) {
                    observableListView.setSelection(1);
                }
            }
        }
    }

    public final void A1o(boolean z) {
        this.A09.setVisibility(0);
        View A1T = A1T();
        if (A1T != null) {
            A1T.setPadding(0, A1P(), 0, 0);
        }
        if (z) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, -getResources().getDimensionPixelSize(R.dimen.tab_height), 0.0f);
            translateAnimation.setDuration(A20);
            this.A09.startAnimation(translateAnimation);
            if (A1T != null) {
                A1T.startAnimation(translateAnimation);
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C02160Ac.A00(this, R.color.primary_dark));
        }
        C0BA A1U = A1U();
        if (A1U instanceof InterfaceC04900Mj) {
            ((InterfaceC04900Mj) A1U).A7Z();
        }
    }

    public final boolean A1p() {
        C02L c02l = this.A0Q;
        c02l.A05();
        if (c02l.A00 != null) {
            C05E c05e = this.A11;
            c05e.A05();
            if (c05e.A01 && this.A1L.A02()) {
                return true;
            }
        }
        Log.i("home/create/no-me-or-msgstore-db");
        if (((ActivityC02290Ap) this).A0A != null) {
            ((ActivityC02290Ap) this).A08.A09("home/conversations bounced to main", null, false);
            startActivity(new Intent(this, Main.class));
            finish();
            return false;
        }
        throw null;
    }

    public final boolean A1q() {
        if (AnonymousClass029.A1S(this.A0x) && this.A03 == 200) {
            AbstractC02800Cx A0N = A0N();
            return (A0N.A0Q.A01("search_fragment") == null || A0N.A0Q.A01("media_view_fragment") == null) ? false : true;
        }
        return false;
    }

    public final boolean A1r() {
        if (AnonymousClass029.A1S(this.A0x) && this.A03 == 200) {
            AbstractC02800Cx A0N = A0N();
            return A0N.A03() == 1 && A0N.A0Q.A01("search_fragment") != null && this.A0C.getVisibility() == 0;
        }
        return false;
    }

    public final boolean A1s() {
        if (AnonymousClass029.A1S(this.A0x) && this.A03 == 200) {
            return A1r();
        }
        return this.A0D.getVisibility() == 0;
    }

    public final boolean A1t(Intent intent) {
        Uri data = intent.getData();
        if ("com.whatsapp.intent.action.CALLS".equals(intent.getAction())) {
            A1h(400);
            return true;
        } else if ("com.whatsapp.intent.action.CHATS".equals(intent.getAction())) {
            A1h(200);
            return true;
        } else if ("android.intent.action.VIEW".equals(intent.getAction()) && data != null && "whatsapp".equals(data.getScheme()) && "status".equals(data.getHost())) {
            A1h(300);
            return true;
        } else {
            return false;
        }
    }

    @Override // X.InterfaceC05800Qh
    public C29X A8l() {
        return this.A0a;
    }

    @Override // X.InterfaceC05790Qg
    public SearchViewModel ACz(C0Zn c0Zn) {
        C0Zo c0Zo = new C0Zo(this, ((ActivityC02290Ap) this).A0A, this.A1c, ((ActivityC02290Ap) this).A08, c0Zn, this.A0y, this.A0b, this.A1b, this.A0e, ((ActivityC02310Ar) this).A01, this.A0x, this.A10, this.A1U, this.A14, this.A0z, this.A0v, this.A1G, this.A0s) { // from class: X.2St
            public final AbstractC000600i A00;
            public final C018508q A01;
            public final C05W A02;
            public final C018708s A03;
            public final C0Zn A04;
            public final C002301c A05;
            public final C0DK A06;
            public final C0CA A07;
            public final C0D5 A08;
            public final C0GU A09;
            public final C0H4 A0A;
            public final C00A A0B;
            public final C0HA A0C;
            public final AnonymousClass057 A0D;
            public final C2AR A0E;
            public final C2M6 A0F;
            public final InterfaceC002901k A0G;

            {
                this.A04 = c0Zn;
                this.A01 = r3;
                this.A0G = r4;
                this.A00 = r5;
                this.A09 = r7;
                this.A02 = r8;
                this.A0F = r9;
                this.A03 = r10;
                this.A05 = r11;
                this.A08 = r12;
                this.A0B = r13;
                this.A0E = r14;
                this.A0C = r15;
                this.A0A = r16;
                this.A07 = r17;
                this.A0D = r18;
                this.A06 = r19;
            }

            @Override // X.C0Zo
            public C0MU A02(String str, Class cls, C07750Zs c07750Zs) {
                C000700j.A09(cls.isAssignableFrom(SearchViewModel.class), "Invalid viewModel");
                return new SearchViewModel(this.A01, this.A0G, this.A09, this.A02, this.A0F, this.A03, this.A05, this.A08, this.A0B, c07750Zs, this.A0E, this.A0C, this.A0A, this.A04, this.A07, this.A06);
            }
        };
        C0VW ADv = ADv();
        String canonicalName = SearchViewModel.class.getCanonicalName();
        if (canonicalName != null) {
            String A0H = C000200d.A0H("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            HashMap hashMap = ADv.A00;
            C0MU c0mu = (C0MU) hashMap.get(A0H);
            if (SearchViewModel.class.isInstance(c0mu)) {
                c0Zo.A00(c0mu);
            } else {
                c0mu = c0Zo.A01(A0H, SearchViewModel.class);
                C0MU c0mu2 = (C0MU) hashMap.put(A0H, c0mu);
                if (c0mu2 != null) {
                    c0mu2.A01();
                }
            }
            return (SearchViewModel) c0mu;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // X.InterfaceC05780Qf
    public void AJT() {
        SearchFragment searchFragment = (SearchFragment) A0N().A0Q.A01("search_fragment");
        if (searchFragment != null) {
            searchFragment.A16.A0G(4);
        }
    }

    @Override // X.InterfaceC05780Qf
    public void AM0() {
        SearchFragment searchFragment = (SearchFragment) A0N().A0Q.A01("search_fragment");
        if (searchFragment != null) {
            searchFragment.A16.onResume();
            searchFragment.A16.A0G(3);
        }
        A0N().A0D();
    }

    @Override // X.InterfaceC05810Qi
    public void ANV() {
        ((AbstractC50702Sv) this.A0a.A0X).A0D = false;
    }

    @Override // X.InterfaceC05790Qg
    public void AOO() {
        C07630Zb.A00(this.A0C);
        this.A09.setVisibility(4);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.AnonymousClass091
    public void APM(C0U0 c0u0) {
        super.APM(c0u0);
        this.A0G = null;
        if (A1s()) {
            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().setStatusBarColor(C02160Ac.A00(this, R.color.searchBackground_dark));
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setObjectValues(Integer.valueOf(C02160Ac.A00(this, R.color.action_mode)), Integer.valueOf(C02160Ac.A00(this, R.color.primary)));
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.setDuration(valueAnimator.getDuration() + 25);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.1HK
            {
                HomeActivity.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                HomeActivity homeActivity = HomeActivity.this;
                homeActivity.A0R.setBackgroundColor(((Number) valueAnimator2.getAnimatedValue()).intValue());
                int i = 0;
                while (true) {
                    C0ZR c0zr = homeActivity.A0O;
                    if (i < c0zr.A00) {
                        c0zr.A0H(i).A03.setTextColor(((Number) valueAnimator2.getAnimatedValue()).intValue());
                        i++;
                    } else {
                        return;
                    }
                }
            }
        });
        valueAnimator.start();
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        getWindow().setStatusBarColor(C02160Ac.A00(this, R.color.primary_dark));
    }

    @Override // X.InterfaceC05780Qf
    public void APP() {
        SearchFragment searchFragment = (SearchFragment) A0N().A0Q.A01("search_fragment");
        if (searchFragment != null) {
            searchFragment.A16.A0G(5);
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public /* synthetic */ void lambda$initSearchView$2839$HomeActivity(View view) {
        C0MK A1W = A1W(A00(((ActivityC02310Ar) this).A01, this.A03));
        if (A1W != null) {
            A1W.ATp(true);
        }
    }

    public /* synthetic */ void lambda$initSearchView$2842$HomeActivity(View view) {
        A1m(true);
    }

    public /* synthetic */ void lambda$onCreate$2831$HomeActivity(View view) {
        UserJid peerJid = Voip.getPeerJid();
        if (peerJid != null) {
            Intent A01 = VoipActivityV2.A01(this, peerJid, Boolean.FALSE);
            A01.putExtra("lobbyEntryPoint", 7);
            startActivity(A01);
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 30) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.A0N.A0B(A00(((ActivityC02310Ar) this).A01, 100), true);
            this.A0a.A08();
            this.A0a.A07();
            if (this.A0a.A0U()) {
                findViewById(R.id.root_view).setSystemUiVisibility(4);
            }
            this.A0X.A04();
        } else {
            this.A0N.A0B(A00(((ActivityC02310Ar) this).A01, 200), true);
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (A1s()) {
            if (A1r()) {
                SearchFragment searchFragment = (SearchFragment) A0N().A0Q.A01("search_fragment");
                if (searchFragment != null) {
                    SearchViewModel searchViewModel = searchFragment.A16;
                    C2T2 c2t2 = searchViewModel.A0L;
                    if (c2t2.size() >= 3) {
                        c2t2.pop();
                        C2T3 peek = c2t2.peek();
                        if (peek != null) {
                            C07750Zs c07750Zs = searchViewModel.A0d;
                            c07750Zs.A02("query_text", peek.A03);
                            c07750Zs.A02("search_type", peek.A02);
                            c07750Zs.A02("search_jid", peek.A01);
                            return;
                        }
                    }
                    searchViewModel.A0K(true);
                    return;
                }
                return;
            }
            A1m(true);
        } else if (A1q()) {
            SearchFragment searchFragment2 = (SearchFragment) A0N().A0Q.A01("search_fragment");
            if (searchFragment2 != null) {
                searchFragment2.A16.onResume();
                searchFragment2.A16.A0G(3);
            }
            super.onBackPressed();
        } else {
            C29X c29x = this.A0a;
            if (c29x == null || !c29x.A0V()) {
                if (this.A03 != 200) {
                    this.A0N.A0B(A00(((ActivityC02310Ar) this).A01, 200), true);
                } else {
                    super.onBackPressed();
                }
            }
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A1a();
        C018308n.A04(findViewById(R.id.action_mode_bar), getWindowManager());
    }

    @Override // X.AbstractActivityC05770Qe, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        C003601s.A01("HomeActivity/onCreate");
        try {
            this.A1k = false;
            ((ActivityC02310Ar) this).A02.A06("HomeActivity");
            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            }
            A0h(5);
            super.onCreate(bundle);
            A1w.clear();
            if (this.A0U != null) {
                A1w.add(100);
                A1w.add(200);
                A1w.add(300);
                A1w.add(400);
                setTitle(((ActivityC02310Ar) this).A01.A06(R.string.localized_app_name));
                View inflate = getLayoutInflater().inflate(R.layout.home, (ViewGroup) null, false);
                this.A0B = inflate;
                setContentView(inflate);
                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                this.A0I = toolbar;
                A0k(toolbar);
                this.A09 = C0AT.A0D(this.A0B, R.id.header);
                this.A0A = C0AT.A0D(this.A0B, R.id.pager_holder);
                this.A0E = C0AT.A0D(this.A09, R.id.toolbar_padding);
                this.A0D = findViewById(R.id.search_holder);
                this.A0C = findViewById(R.id.search_fragment_holder);
                this.A0P = new C07710Zj((ImageView) findViewById(R.id.fab), (ImageView) findViewById(R.id.fab_aux));
                try {
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    this.A0a = new C29X(this.A0n, this.A0m, this.A0Y, this.A12, ((ActivityC02290Ap) this).A0A, ((ActivityC02290Ap) this).A08, this.A0Q, this.A1c, this.A0M, this.A15, this.A0U, ((ActivityC02270An) this).A01, this.A1e, this.A16, this.A1h, this.A0b, this.A0l, ((ActivityC02310Ar) this).A01, this.A0L, this.A1F, this.A0h, this.A1H, this.A0k, this.A0d, this.A0p, ((ActivityC02290Ap) this).A0F, this.A0v, this.A1a, this.A1E, this.A19, this.A0Z, this.A1I, this.A0c) { // from class: X.0Zt
                        @Override // X.C29X
                        public int A01() {
                            return 1;
                        }

                        {
                            HomeActivity.this = this;
                        }

                        @Override // X.C29X
                        public void A02() {
                            A0Z();
                            HomeActivity homeActivity = HomeActivity.this;
                            homeActivity.getWindow().clearFlags(1024);
                            homeActivity.getWindow().addFlags(2048);
                        }

                        @Override // X.C29X
                        public void A06() {
                            A0Z();
                        }

                        public final void A0Z() {
                            HomeActivity homeActivity = HomeActivity.this;
                            homeActivity.A0a.A0N(false);
                            homeActivity.A0a.A0E(0L);
                            homeActivity.A09.setVisibility(0);
                            homeActivity.A0N.A0B(HomeActivity.A00(((ActivityC02310Ar) homeActivity).A01, 200), false);
                        }
                    };
                    this.A0B.setSystemUiVisibility(1024);
                    if (Build.VERSION.SDK_INT >= 19) {
                        getWindow().setFlags(134217728, 134217728);
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                    }
                    C018308n.A05(getWindow());
                    C0AT.A0d(this.A0B, new C0V5() { // from class: X.1hO
                        {
                            HomeActivity.this = this;
                        }

                        @Override // X.C0V5
                        public final C07110Wv AHK(View view, C07110Wv c07110Wv) {
                            HomeActivity.this.A1k(c07110Wv);
                            return c07110Wv;
                        }
                    });
                    C0U1 A0c = A0c();
                    if (A0c != null) {
                        A0c.A0L(false);
                        A0m(false);
                        if (!A1p()) {
                            C003601s.A00();
                            return;
                        }
                        this.A1Z.A01();
                        if (C005002g.A01()) {
                            Log.w("home/device-not-supported");
                            DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment displayExceptionDialogFactory$UnsupportedDeviceDialogFragment = new DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment();
                            this.A1A.A03 = true;
                            this.A17.A09(true);
                            AUh(displayExceptionDialogFactory$UnsupportedDeviceDialogFragment);
                        } else if (this.A0S.A04()) {
                            Log.w("home/clock-wrong");
                            DisplayExceptionDialogFactory$ClockWrongDialogFragment displayExceptionDialogFactory$ClockWrongDialogFragment = new DisplayExceptionDialogFactory$ClockWrongDialogFragment();
                            this.A1A.A03 = true;
                            this.A17.A09(true);
                            AUh(displayExceptionDialogFactory$ClockWrongDialogFragment);
                        } else if (!this.A0S.A03()) {
                            if (this.A0V.A01(this.A0S) > 0) {
                                AUh(new DisplayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment());
                            }
                        } else {
                            Log.w("home/sw-expired");
                            DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment displayExceptionDialogFactory$SoftwareExpiredDialogFragment = new DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment();
                            this.A1A.A03 = true;
                            this.A17.A09(true);
                            AUh(displayExceptionDialogFactory$SoftwareExpiredDialogFragment);
                        }
                        this.A0N = (TabsPager) findViewById(R.id.pager);
                        C0ZR c0zr = new C0ZR(this, A0N());
                        this.A0O = c0zr;
                        this.A0N.setAdapter(c0zr);
                        this.A0N.setOffscreenPageLimit(this.A0O.A00);
                        A0c().A06(0.0f);
                        C0AT.A0P(this.A09, getResources().getDimension(R.dimen.actionbar_elevation));
                        if (!A1t(getIntent())) {
                            A1h(200);
                        }
                        PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) findViewById(R.id.tabs);
                        this.A0R = pagerSlidingTabStrip;
                        C0AT.A0V(pagerSlidingTabStrip, 2);
                        C0AT.A0W(this.A0R, 0);
                        this.A0R.setViewPager(this.A0N);
                        this.A0R.A0M = this.A0J;
                        if (A1w.size() == 1) {
                            this.A0R.setVisibility(8);
                        }
                        A1c();
                        A1n(this.A01 == 0);
                        C0GG c0gg = new C0GG() { // from class: X.0Zx
                            {
                                HomeActivity.this = this;
                            }

                            @Override // X.C0GG
                            public void A00() {
                                final HomeActivity homeActivity = HomeActivity.this;
                                C018508q c018508q = ((ActivityC02290Ap) homeActivity).A0A;
                                c018508q.A02.post(new Runnable() { // from class: X.1HA
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        homeActivity.A1c();
                                    }
                                });
                            }

                            @Override // X.C0GG
                            public void A03(AbstractC005302j abstractC005302j) {
                                final HomeActivity homeActivity = HomeActivity.this;
                                C018508q c018508q = ((ActivityC02290Ap) homeActivity).A0A;
                                c018508q.A02.post(new Runnable() { // from class: X.1H9
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        homeActivity.A1c();
                                    }
                                });
                            }
                        };
                        this.A0t = c0gg;
                        this.A0u.A00(c0gg);
                        C05490Oy c05490Oy = new C05490Oy() { // from class: X.0Zy
                            {
                                HomeActivity.this = this;
                            }

                            @Override // X.C05490Oy
                            public void A01(long j) {
                                HomeActivity homeActivity = HomeActivity.this;
                                if (homeActivity.A0G != null) {
                                    homeActivity.A08.setVisibility(8);
                                    return;
                                }
                                if (homeActivity.A08.getVisibility() != 0) {
                                    homeActivity.A08.setVisibility(0);
                                }
                                homeActivity.A0F.setText(AnonymousClass029.A0g(((ActivityC02310Ar) homeActivity).A01, j / 1000));
                            }

                            @Override // X.C05490Oy
                            public void A02(C0D3 c0d3) {
                                HomeActivity.this.A08.setVisibility(8);
                            }

                            @Override // X.C05490Oy
                            public void A03(C0D3 c0d3) {
                                HomeActivity.this.A08.setVisibility(8);
                            }

                            @Override // X.C05490Oy
                            public void A04(C0D3 c0d3) {
                                HomeActivity.this.A0i.A03();
                            }
                        };
                        this.A1d = c05490Oy;
                        this.A1e.A01(c05490Oy);
                        View findViewById = findViewById(R.id.call_notification);
                        this.A08 = findViewById;
                        findViewById.setOnClickListener(new View.OnClickListener() { // from class: X.1HP
                            {
                                HomeActivity.this = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                HomeActivity.this.lambda$onCreate$2831$HomeActivity(view);
                            }
                        });
                        this.A0F = (TextView) findViewById(R.id.call_notification_timer);
                        SearchViewModel ACz = ACz(this.A0g.A04(getApplicationContext()));
                        this.A1M = ACz;
                        ACz.A03.A05(this, new InterfaceC05620Pl() { // from class: X.0Zz
                            {
                                HomeActivity.this = this;
                            }

                            @Override // X.InterfaceC05620Pl
                            public final void AIK(Object obj) {
                                HomeActivity homeActivity = HomeActivity.this;
                                Number number = (Number) obj;
                                if (number != null && !homeActivity.isFinishing()) {
                                    int intValue = number.intValue();
                                    if (intValue == 0) {
                                        homeActivity.A0k(homeActivity.A0I);
                                    } else if (intValue == 1) {
                                        homeActivity.A0k(homeActivity.A0I);
                                    }
                                }
                            }
                        });
                        this.A1M.A0P.A05(this, new InterfaceC05620Pl() { // from class: X.1hP
                            {
                                HomeActivity.this = this;
                            }

                            @Override // X.InterfaceC05620Pl
                            public final void AIK(Object obj) {
                                HomeActivity homeActivity = HomeActivity.this;
                                Boolean bool = (Boolean) obj;
                                if (bool != null) {
                                    homeActivity.A1M.A0G(1);
                                    if (!homeActivity.isFinishing()) {
                                        homeActivity.A1m(bool.booleanValue());
                                    }
                                }
                            }
                        });
                        final View view = this.A09;
                        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.0a0
                            @Override // android.view.ViewTreeObserver.OnPreDrawListener
                            public boolean onPreDraw() {
                                view.getViewTreeObserver().removeOnPreDrawListener(this);
                                return true;
                            }
                        });
                        C01V c01v = ((ActivityC02310Ar) this).A02;
                        C002701i.A1G(this.A09, new RunnableC28051Pv(c01v, "HomeActivity", 1, new Runnable() { // from class: X.1HF
                            {
                                HomeActivity.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C003601s.A01("wa_startup_complete");
                                C003601s.A00();
                            }
                        }), c01v.A0E);
                        if (bundle == null) {
                            C07800a1.A00(this, this.A0m, this.A0Q, this.A0r, this.A0q, this.A0W, this.A0b, this.A0w, this.A0p, this.A1W);
                            AcceptInviteLinkActivity.A01(this, getIntent());
                        }
                        this.A1c.AS1(new Runnable() { // from class: X.1HN
                            {
                                HomeActivity.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                HomeActivity.this.A1Y();
                            }
                        });
                        ((ActivityC02310Ar) this).A01.A0A.add(this.A1q);
                        A1i(getIntent());
                        A1j(getIntent());
                        ((ActivityC02310Ar) this).A02.A07("HomeActivity created");
                        C003601s.A00();
                        return;
                    }
                    throw null;
                } catch (Throwable th2) {
                    th = th2;
                    C003601s.A00();
                    throw th;
                }
            }
            throw null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (menu.size() == 0) {
            MenuItem icon = menu.add(0, R.id.menuitem_search, 0, ((ActivityC02310Ar) this).A01.A06(R.string.search)).setIcon(C02160Ac.A03(this, R.drawable.ic_action_search));
            icon.setShowAsAction(2);
            ColorStateList valueOf = ColorStateList.valueOf(C02160Ac.A00(this, R.color.homeActivityMenuItem));
            if (icon instanceof InterfaceMenuItemC07810a4) {
                ((InterfaceMenuItemC07810a4) icon).setIconTintList(valueOf);
            } else if (Build.VERSION.SDK_INT >= 26) {
                icon.setIconTintList(valueOf);
            }
            menu.add(4, R.id.menuitem_settings, 196608, ((ActivityC02310Ar) this).A01.A06(R.string.menuitem_settings)).setAlphabeticShortcut('o');
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C0GG c0gg = this.A0t;
        if (c0gg != null) {
            this.A0u.A01(c0gg);
            this.A0t = null;
        }
        C05490Oy c05490Oy = this.A1d;
        if (c05490Oy != null) {
            this.A1e.A00(c05490Oy);
            this.A1d = null;
        }
        this.A0a.A03();
        C002301c c002301c = ((ActivityC02310Ar) this).A01;
        c002301c.A0A.remove(this.A1q);
    }

    @Override // X.ActivityC02270An, X.ActivityC02320As, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return (this.A03 == 100 && this.A0a.A0X(i)) || super.onKeyDown(i, keyEvent);
    }

    @Override // X.ActivityC02270An, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return (this.A03 == 100 && this.A0a.A0Y(i)) || super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        A1V();
        return super.onMenuOpened(i, menu);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("home/newintent");
        if (A1t(intent)) {
            A1m(false);
        }
        C07800a1.A03(this, this.A0m, this.A0Q, this.A0r, this.A0q, this.A0W, this.A0b, this.A0w, this.A1W, intent);
        AcceptInviteLinkActivity.A01(this, intent);
        A1i(intent);
        A1j(intent);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_search) {
            A1l("");
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_status) {
            startActivity(new Intent(this, SetStatus.class));
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_settings) {
            startActivity(new Intent(this, Settings.class));
            return true;
        } else {
            if (menuItem.getItemId() == R.id.menuitem_payments) {
                Class ACK = this.A1F.A03().ACK();
                StringBuilder sb = new StringBuilder("PAY: HomeActivity - Loading payment class: ");
                sb.append(ACK);
                Log.i(sb.toString());
                startActivity(new Intent(this, ACK));
            } else if (menuItem.getItemId() == R.id.menuitem_debug) {
                startActivity(new Intent().setClassName(this, "com.whatsapp.Advanced"));
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_debug_new) {
                startActivity(new Intent().setClassName(this, "com.whatsapp.DebugToolsActivity"));
                return true;
            }
            return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        this.A0a.A04();
        BroadcastReceiver broadcastReceiver = this.A06;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
            this.A06 = null;
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public void onRestart() {
        ((ActivityC02310Ar) this).A02.A05(this.A09, "HomeActivity", 1, new Runnable() { // from class: X.1HG
            {
                HomeActivity.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C003601s.A01("wa_startup_complete");
                C003601s.A00();
            }
        });
        super.onRestart();
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        int i = bundle.getInt("selected_tab", this.A03);
        this.A03 = i;
        this.A0N.A0B(A00(((ActivityC02310Ar) this).A01, i), false);
        if (this.A03 == 100) {
            this.A0K = (CameraHomeFragment) this.A0O.A0G(A00(((ActivityC02310Ar) this).A01, 100));
        }
        if (bundle.getBoolean("search")) {
            A1l(bundle.getString("query", ""));
        }
        this.A0a.A0F(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00fd  */
    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.onResume():void");
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        SearchView searchView;
        bundle.putInt("selected_tab", this.A03);
        boolean A1s = A1s();
        bundle.putBoolean("search", A1s);
        if (A1s && (searchView = this.A0H) != null && searchView.getQuery().length() > 0) {
            bundle.putString("query", this.A0H.getQuery().toString());
        }
        this.A0a.A0G(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        A1l("");
        return false;
    }

    /* loaded from: classes.dex */
    public class TabsPager extends C0ZM {
        public C002301c A00;
        public boolean A01;

        public TabsPager(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0011, code lost:
            if (r4 != 0.0f) goto L8;
         */
        @Override // androidx.viewpager.widget.ViewPager
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void A09(int r3, float r4, int r5) {
            /*
                r2 = this;
                super.A09(r3, r4, r5)
                X.01c r1 = r2.A00
                r0 = 100
                int r0 = com.whatsapp.HomeActivity.A00(r1, r0)
                if (r3 != r0) goto L13
                r0 = 0
                int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                r0 = 1
                if (r1 == 0) goto L14
            L13:
                r0 = 0
            L14:
                r2.A01 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.TabsPager.A09(int, float, int):void");
        }

        public final boolean A0O(MotionEvent motionEvent) {
            C2VU c2vu;
            HomeActivity homeActivity = (HomeActivity) C018308n.A01(getContext(), HomeActivity.class);
            return !homeActivity.A0a.A0T() && ((c2vu = homeActivity.A0a.A0S) == null || c2vu.getVisibility() != 0) && (!this.A01 || motionEvent.getPointerCount() < 2);
        }

        @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return A0O(motionEvent) && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.viewpager.widget.ViewPager, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return A0O(motionEvent) && super.onTouchEvent(motionEvent);
        }

        @Override // androidx.viewpager.widget.ViewPager
        public void setCurrentItem(int i) {
            HomeActivity homeActivity;
            C0MK A1W;
            View view;
            AbsListView absListView;
            if (i == getCurrentItem() && (A1W = (homeActivity = (HomeActivity) C018308n.A01(getContext(), HomeActivity.class)).A1W(i)) != null && (view = ((C0BA) A1W).A0A) != null && (absListView = (AbsListView) view.findViewById(16908298)) != null) {
                if (absListView.getFirstVisiblePosition() < 8) {
                    absListView.smoothScrollToPosition(0);
                } else {
                    absListView.setSelection(0);
                }
                homeActivity.A1a();
            }
            super.setCurrentItem(i);
        }
    }
}
