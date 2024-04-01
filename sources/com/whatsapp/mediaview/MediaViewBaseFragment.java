package com.whatsapp.mediaview;

import X.AbstractC73093b5;
import X.ActivityC02320As;
import X.ActivityC02330At;
import X.AnonymousClass097;
import X.C000200d;
import X.C018308n;
import X.C018508q;
import X.C02160Ac;
import X.C02F;
import X.C06960Vv;
import X.C08930cL;
import X.C0AT;
import X.C0BA;
import X.C1M7;
import X.C2HB;
import X.C2HC;
import X.C3IU;
import X.C3LB;
import X.C68763Lu;
import X.InterfaceC05780Qf;
import X.InterfaceC48642Gc;
import X.InterfaceC48692Gh;
import X.InterfaceC61212vm;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I0_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.base.WaFragment;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.gesture.VerticalSwipeDismissBehavior;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.ExoPlaybackControlView;

/* loaded from: classes2.dex */
public abstract class MediaViewBaseFragment extends WaFragment implements InterfaceC48642Gc {
    public static final boolean A0H;
    public Rect A00;
    public Bundle A01;
    public View A02;
    public View A03;
    public ViewGroup A04;
    public TextView A05;
    public Toolbar A06;
    public TextEmojiLabel A07;
    public C3LB A08;
    public C68763Lu A09;
    public InterfaceC48642Gc A0A;
    public C2HC A0B;
    public OutOfMemoryError A0C;
    public Runnable A0D;
    public boolean A0G = true;
    public boolean A0F = false;
    public boolean A0E = false;

    static {
        A0H = Build.VERSION.SDK_INT >= 21;
    }

    public static void A05(Activity activity, boolean z) {
        int i = z ? 1280 : 1285;
        if (Build.VERSION.SDK_INT >= 19) {
            i |= 2048;
        }
        if (A0H) {
            i |= 512;
            if (!z) {
                i |= 2;
            }
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(i);
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            return layoutInflater.inflate(R.layout.media_view, viewGroup, false);
        } catch (OutOfMemoryError e) {
            this.A0C = e;
            return null;
        }
    }

    @Override // X.C0BA
    public void A0q() {
        if (this.A09 != null) {
            for (int i = 0; i < this.A09.getChildCount(); i++) {
                View childAt = this.A09.getChildAt(i);
                if (childAt instanceof FrameLayout) {
                    int i2 = 0;
                    while (true) {
                        ViewGroup viewGroup = (ViewGroup) childAt;
                        if (i2 < viewGroup.getChildCount()) {
                            View childAt2 = viewGroup.getChildAt(i2);
                            if (childAt2 instanceof PhotoView) {
                                ((PhotoView) childAt2).A01();
                            }
                            i2++;
                        }
                    }
                }
            }
        }
        this.A0U = true;
    }

    @Override // X.C0BA
    public void A0r() {
        this.A04.removeView(this.A09);
        this.A04 = null;
        this.A0U = true;
    }

    @Override // X.C0BA
    public void A0s() {
        this.A0U = true;
        A17();
        A1A(true, true);
    }

    @Override // X.C0BA
    public void A0t() {
        if (!(this instanceof MediaViewFragment)) {
            this.A0U = true;
            A1A(true, true);
            return;
        }
        MediaViewFragment mediaViewFragment = (MediaViewFragment) this;
        ((C0BA) mediaViewFragment).A0U = true;
        mediaViewFragment.A1A(true, true);
        if (!MediaViewFragment.A1P || mediaViewFragment.A16 == null) {
            return;
        }
        C018508q c018508q = mediaViewFragment.A0E;
        c018508q.A02.removeCallbacks(mediaViewFragment.A1K);
        mediaViewFragment.A16.A09();
        AbstractC73093b5 abstractC73093b5 = mediaViewFragment.A16.A0D;
        if (abstractC73093b5 != null) {
            abstractC73093b5.A01();
        }
    }

    @Override // X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        C018308n.A05(A0A().getWindow());
    }

    @Override // X.C0BA
    public void A0v(Bundle bundle) {
        C1M7 c1m7;
        A17();
        super.A0v(bundle);
        if (!(this instanceof MediaViewFragment)) {
            c1m7 = new C1M7(A0A());
        } else {
            c1m7 = new C1M7(A0A());
        }
        this.A0B = C2HC.A00 ? new C2HB(c1m7, this) : new C3IU(this);
        this.A09 = new C68763Lu(this, A00());
        Bundle bundle2 = super.A06;
        if (bundle2 == null) {
            A13();
        } else {
            this.A01 = bundle2.getBundle("animation_bundle");
        }
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        if (A0H) {
            A0A().getWindow().getDecorView().setSystemUiVisibility(1792);
            view.findViewById(R.id.media_view_layout).setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: X.30r
                {
                    MediaViewBaseFragment.this = this;
                }

                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    MediaViewBaseFragment mediaViewBaseFragment = MediaViewBaseFragment.this;
                    Rect rect = new Rect();
                    mediaViewBaseFragment.A00 = rect;
                    rect.set(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                    if (mediaViewBaseFragment.A09 != null) {
                        for (int i = 0; i < mediaViewBaseFragment.A09.getChildCount(); i++) {
                            mediaViewBaseFragment.A18(mediaViewBaseFragment.A09.getChildAt(i));
                        }
                    }
                    return windowInsets;
                }
            });
        } else {
            A0A().getWindow().getDecorView().setSystemUiVisibility(1280);
        }
        Toolbar toolbar = (Toolbar) C0AT.A0D(A05(), R.id.toolbar);
        this.A06 = toolbar;
        toolbar.A09();
        ((ActivityC02320As) A0A()).A0k(this.A06);
        this.A06.setBackground(new ColorDrawable(C02160Ac.A00(A00(), R.color.media_view_action_bar_background)));
        ((ActivityC02320As) A0A()).A0c().A0O(false);
        ((ActivityC02320As) A0A()).A0c().A0L(true);
        this.A06.setNavigationOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 9));
        View inflate = LayoutInflater.from(((ActivityC02320As) A0A()).A0c().A02()).inflate(R.layout.media_view_actionbar, (ViewGroup) null, false);
        View findViewById = inflate.findViewById(R.id.title_holder);
        findViewById.setClickable(true);
        findViewById.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 8));
        this.A07 = (TextEmojiLabel) findViewById.findViewById(R.id.contact_name);
        this.A05 = (TextView) findViewById.findViewById(R.id.date_time);
        this.A02 = inflate.findViewById(R.id.progress_bar);
        ((ActivityC02320As) A0A()).A0c().A0M(true);
        ((ActivityC02320As) A0A()).A0c().A0D(inflate);
        this.A03 = view.findViewById(R.id.title_protection);
        ViewGroup viewGroup = (ViewGroup) C0AT.A0D(view, R.id.pager_container);
        this.A04 = viewGroup;
        viewGroup.addView(this.A09);
        final View findViewById2 = view.findViewById(R.id.background);
        findViewById2.setBackground(new ColorDrawable(-16777216));
        VerticalSwipeDismissBehavior verticalSwipeDismissBehavior = new VerticalSwipeDismissBehavior(A00()) { // from class: com.whatsapp.mediaview.MediaViewBaseFragment.1
            {
                MediaViewBaseFragment.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x001e, code lost:
                if (r1 == false) goto L11;
             */
            @Override // com.whatsapp.gesture.VerticalSwipeDismissBehavior, X.AbstractC08910cJ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean A0B(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.MotionEvent r5) {
                /*
                    r2 = this;
                    int r1 = r5.getPointerCount()
                    r0 = 1
                    if (r1 > r0) goto L28
                    com.whatsapp.mediaview.MediaViewBaseFragment r1 = com.whatsapp.mediaview.MediaViewBaseFragment.this
                    X.3Lu r0 = r1.A09
                    int r0 = r0.getCurrentItem()
                    java.lang.Object r0 = r1.A11(r0)
                    com.whatsapp.mediaview.PhotoView r0 = r1.A0y(r0)
                    if (r0 == 0) goto L20
                    boolean r1 = r0.A0A()
                    r0 = 1
                    if (r1 != 0) goto L21
                L20:
                    r0 = 0
                L21:
                    if (r0 != 0) goto L28
                    boolean r0 = super.A0B(r3, r4, r5)
                    return r0
                L28:
                    X.0lI r0 = r2.A05
                    if (r0 == 0) goto L2f
                    r0.A02()
                L2f:
                    r0 = 0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.MediaViewBaseFragment.AnonymousClass1.A0B(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
            }
        };
        verticalSwipeDismissBehavior.A02 = 0.5f;
        verticalSwipeDismissBehavior.A0B = true;
        verticalSwipeDismissBehavior.A06 = new InterfaceC61212vm() { // from class: X.3IG
            public final float A00;

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0014, code lost:
                if (r0 == false) goto L11;
             */
            {
                /*
                    r2 = this;
                    com.whatsapp.mediaview.MediaViewBaseFragment.this = r3
                    r4 = r4
                    r2.<init>()
                    com.whatsapp.mediaview.MediaViewBaseFragment r1 = com.whatsapp.mediaview.MediaViewBaseFragment.this
                    X.2HC r0 = r1.A0B
                    boolean r0 = r0 instanceof X.C3IU
                    if (r0 != 0) goto L16
                    boolean r0 = r1.A1B()
                    r1 = 0
                    if (r0 != 0) goto L17
                L16:
                    r1 = 1
                L17:
                    r0 = 1061997773(0x3f4ccccd, float:0.8)
                    if (r1 == 0) goto L1e
                    r0 = 1056964608(0x3f000000, float:0.5)
                L1e:
                    r2.A00 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C3IG.<init>(com.whatsapp.mediaview.MediaViewBaseFragment, android.view.View):void");
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x000d, code lost:
                if (r1.A1B() == false) goto L12;
             */
            @Override // X.InterfaceC61212vm
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void AJR(android.view.View r3) {
                /*
                    r2 = this;
                    com.whatsapp.mediaview.MediaViewBaseFragment r1 = com.whatsapp.mediaview.MediaViewBaseFragment.this
                    X.2HC r0 = r1.A0B
                    boolean r0 = r0 instanceof X.C3IU
                    if (r0 != 0) goto Lf
                    boolean r1 = r1.A1B()
                    r0 = 0
                    if (r1 != 0) goto L10
                Lf:
                    r0 = 1
                L10:
                    if (r0 == 0) goto L20
                    com.whatsapp.mediaview.MediaViewBaseFragment r1 = com.whatsapp.mediaview.MediaViewBaseFragment.this
                    X.2HC r0 = r1.A0B
                    boolean r0 = r0 instanceof X.C2HB
                    if (r0 == 0) goto L20
                    X.3Lu r1 = r1.A09
                    r0 = 0
                    r1.setAlpha(r0)
                L20:
                    com.whatsapp.mediaview.MediaViewBaseFragment r0 = com.whatsapp.mediaview.MediaViewBaseFragment.this
                    r0.A15()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C3IG.AJR(android.view.View):void");
            }

            @Override // X.InterfaceC61212vm
            public void AJc(int i) {
                C06260Si c06260Si;
                MediaViewBaseFragment mediaViewBaseFragment = MediaViewBaseFragment.this;
                if (mediaViewBaseFragment instanceof MediaViewFragment) {
                    MediaViewFragment mediaViewFragment = (MediaViewFragment) mediaViewBaseFragment;
                    C48652Gd c48652Gd = mediaViewFragment.A16;
                    if (i == 1) {
                        if (c48652Gd != null) {
                            c48652Gd.A06();
                            ExoPlaybackControlView exoPlaybackControlView = mediaViewFragment.A16.A0C;
                            if (exoPlaybackControlView != null && !exoPlaybackControlView.A07()) {
                                exoPlaybackControlView.A01();
                                exoPlaybackControlView.A06(3000);
                            }
                        }
                        mediaViewFragment.A1E();
                    } else if (c48652Gd == null || c48652Gd.A0C != null || (c06260Si = c48652Gd.A08) == null) {
                    } else {
                        c06260Si.ATc(true);
                    }
                }
            }

            @Override // X.InterfaceC61212vm
            public void AOa(View view2) {
                InterfaceC05780Qf interfaceC05780Qf = (InterfaceC05780Qf) MediaViewBaseFragment.this.A09();
                if (interfaceC05780Qf != null) {
                    interfaceC05780Qf.APP();
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x002f, code lost:
                if (r1.A1B() == false) goto L20;
             */
            @Override // X.InterfaceC61212vm
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void AOl(android.view.View r7, float r8) {
                /*
                    r6 = this;
                    com.whatsapp.mediaview.MediaViewBaseFragment r4 = com.whatsapp.mediaview.MediaViewBaseFragment.this
                    X.0At r0 = r4.A09()
                    X.0Qf r0 = (X.InterfaceC05780Qf) r0
                    if (r0 == 0) goto Ld
                    r0.AJT()
                Ld:
                    r2 = 1065353216(0x3f800000, float:1.0)
                    float r5 = r2 - r8
                    float r1 = r6.A00
                    int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                    if (r0 >= 0) goto L57
                    r5 = 0
                L18:
                    android.view.View r0 = r4
                    r0.setAlpha(r5)
                    androidx.appcompat.widget.Toolbar r0 = r4.A06
                    r0.setAlpha(r5)
                    com.whatsapp.mediaview.MediaViewBaseFragment r1 = com.whatsapp.mediaview.MediaViewBaseFragment.this
                    X.2HC r0 = r1.A0B
                    boolean r0 = r0 instanceof X.C3IU
                    if (r0 != 0) goto L31
                    boolean r1 = r1.A1B()
                    r0 = 0
                    if (r1 != 0) goto L32
                L31:
                    r0 = 1
                L32:
                    if (r0 == 0) goto L39
                    X.3Lu r0 = r4.A09
                    r0.setAlpha(r5)
                L39:
                    X.3Lu r0 = r4.A09
                    int r3 = r0.getChildCount()
                    r2 = 0
                L40:
                    if (r2 >= r3) goto L5b
                    X.3Lu r0 = r4.A09
                    android.view.View r1 = r0.getChildAt(r2)
                    r0 = 2131363000(0x7f0a04b8, float:1.8345796E38)
                    android.view.View r1 = r1.findViewById(r0)
                    float r0 = r5 * r5
                    r1.setAlpha(r0)
                    int r2 = r2 + 1
                    goto L40
                L57:
                    float r5 = r5 - r1
                    float r2 = r2 - r1
                    float r5 = r5 / r2
                    goto L18
                L5b:
                    r0 = 1
                    r4.A1A(r0, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C3IG.AOl(android.view.View, float):void");
            }
        };
        ((C08930cL) view.findViewById(R.id.pager_container).getLayoutParams()).A00(verticalSwipeDismissBehavior);
        onConfigurationChanged(A01().getConfiguration());
    }

    public PhotoView A0x(ViewGroup viewGroup) {
        PhotoView A0x;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof PhotoView) {
                return (PhotoView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (A0x = A0x((ViewGroup) childAt)) != null) {
                return A0x;
            }
        }
        return null;
    }

    public PhotoView A0y(Object obj) {
        if (obj == null) {
            return null;
        }
        View findViewWithTag = this.A09.findViewWithTag(obj);
        if (findViewWithTag instanceof ViewGroup) {
            return A0x((ViewGroup) findViewWithTag);
        }
        return null;
    }

    public Object A0z() {
        if (!(this instanceof MediaViewFragment)) {
            return ((CatalogMediaViewFragment) this).A08;
        }
        AnonymousClass097 anonymousClass097 = ((MediaViewFragment) this).A0w;
        if (anonymousClass097 == null) {
            return null;
        }
        return anonymousClass097.A0n;
    }

    public Object A10() {
        if (!(this instanceof MediaViewFragment)) {
            CatalogMediaViewFragment catalogMediaViewFragment = (CatalogMediaViewFragment) this;
            return C06960Vv.A01(catalogMediaViewFragment.A06.A09, catalogMediaViewFragment.A00);
        }
        return ((MediaViewFragment) this).A0v;
    }

    public Object A11(int i) {
        AnonymousClass097 ABE;
        if (!(this instanceof MediaViewFragment)) {
            return C06960Vv.A01(((CatalogMediaViewFragment) this).A06.A09, i);
        }
        InterfaceC48692Gh interfaceC48692Gh = ((MediaViewFragment) this).A0q;
        if (interfaceC48692Gh == null || (ABE = interfaceC48692Gh.ABE(i)) == null) {
            return null;
        }
        return ABE.A0n;
    }

    public void A12() {
        InterfaceC05780Qf interfaceC05780Qf = (InterfaceC05780Qf) A09();
        if (interfaceC05780Qf != null) {
            interfaceC05780Qf.AJT();
        }
        Bundle bundle = this.A01;
        if (bundle == null) {
            A13();
            return;
        }
        this.A0E = true;
        this.A0B.A09(bundle);
    }

    public void A13() {
        ActivityC02330At A09 = A09();
        if (A09 != null && !A09.isFinishing()) {
            if (A0A() instanceof InterfaceC05780Qf) {
                ((InterfaceC05780Qf) A0A()).AM0();
                return;
            }
            StringBuilder A0P = C000200d.A0P("mediaview/finish called from non-host activity: ");
            A0P.append(A0A().getLocalClassName());
            Log.e(A0P.toString());
            A0A().finish();
        }
    }

    public void A14() {
        C3LB c3lb;
        if (A09() == null || (c3lb = this.A08) == null) {
            return;
        }
        c3lb.A04();
    }

    public void A15() {
        if (!(this instanceof MediaViewFragment)) {
            A12();
            return;
        }
        MediaViewFragment mediaViewFragment = (MediaViewFragment) this;
        RunnableEBaseShape0S0310000_I0 runnableEBaseShape0S0310000_I0 = mediaViewFragment.A18;
        if (runnableEBaseShape0S0310000_I0 != null) {
            runnableEBaseShape0S0310000_I0.A03 = true;
            ((Thread) runnableEBaseShape0S0310000_I0.A02).interrupt();
            mediaViewFragment.A18 = null;
        }
        InterfaceC48692Gh interfaceC48692Gh = mediaViewFragment.A0q;
        if (interfaceC48692Gh != null) {
            interfaceC48692Gh.AVA();
        }
        mediaViewFragment.A12();
    }

    public void A16() {
    }

    public final void A17() {
        C02F c02f;
        if (this.A0F) {
            return;
        }
        Context A00 = A00();
        if (!(this instanceof MediaViewFragment)) {
            c02f = ((CatalogMediaViewFragment) this).A05;
        } else {
            c02f = ((MediaViewFragment) this).A0W;
        }
        if (RequestPermissionActivity.A0Q(A00, c02f)) {
            return;
        }
        this.A0F = true;
        A13();
    }

    public void A18(View view) {
        View view2;
        if (this.A00 != null) {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.footerView);
            if (viewGroup == null && (viewGroup = (ViewGroup) view.findViewById(R.id.footer)) == null) {
                return;
            }
            View findViewById = viewGroup.findViewById(R.id.caption);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            int i = A01().getConfiguration().orientation;
            if (findViewById == null) {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), 0);
                View findViewWithTag = viewGroup.findViewWithTag("navigation_protection");
                if (i == 1) {
                    if (findViewWithTag == null) {
                        view2 = new View(A00());
                    } else {
                        view2 = findViewWithTag;
                    }
                    view2.setBackgroundColor(C02160Ac.A00(A00(), R.color.media_view_footer_background));
                    view2.setTag("navigation_protection");
                    view2.setLayoutParams(new LinearLayout.LayoutParams(-1, this.A00.bottom));
                    if (findViewWithTag == null) {
                        viewGroup.addView(view2);
                    }
                } else if (findViewWithTag != null) {
                    viewGroup.removeViewInLayout(findViewWithTag);
                }
                View findViewById2 = viewGroup.findViewById(R.id.footer_padding_bottom);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
            } else if (i == 1) {
                viewGroup.setPadding(0, viewGroup.getPaddingTop(), 0, this.A00.bottom);
            } else if (i == 2) {
                viewGroup.setPadding(0, 0, 0, 0);
            }
            Rect rect = this.A00;
            layoutParams.leftMargin = rect.left;
            layoutParams.rightMargin = rect.right;
            viewGroup.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0033 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A19(boolean r10, int r11) {
        /*
            r9 = this;
            X.3Lu r0 = r9.A09
            int r8 = r0.getChildCount()
            r7 = 0
            r6 = 0
        L8:
            if (r6 >= r8) goto L42
            X.3Lu r0 = r9.A09
            android.view.View r1 = r0.getChildAt(r6)
            r0 = 2131363000(0x7f0a04b8, float:1.8345796E38)
            android.view.View r5 = r1.findViewById(r0)
            r4 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = r5.getVisibility()
            if (r10 == 0) goto L36
            if (r1 == 0) goto L33
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r4, r3)
            r5.setVisibility(r7)
        L2a:
            if (r11 <= 0) goto L33
            long r0 = (long) r11
            r2.setDuration(r0)
            r5.startAnimation(r2)
        L33:
            int r6 = r6 + 1
            goto L8
        L36:
            r0 = 4
            if (r1 == r0) goto L33
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r3, r4)
            r5.setVisibility(r0)
            goto L2a
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.MediaViewBaseFragment.A19(boolean, int):void");
    }

    public void A1A(boolean z, boolean z2) {
        ActivityC02330At A09;
        if (this.A0E || this.A0G == z) {
            return;
        }
        this.A0G = z;
        A19(z, 400);
        if (z) {
            AlphaAnimation A03 = C000200d.A03(0.0f, 1.0f, 250L);
            if (this.A03.getVisibility() != 0) {
                this.A03.setVisibility(0);
                this.A03.startAnimation(A03);
            }
            if (this.A06.getVisibility() != 0) {
                this.A06.setVisibility(0);
                this.A06.startAnimation(A03);
            }
        } else {
            AlphaAnimation A032 = C000200d.A03(1.0f, 0.0f, 250L);
            if (this.A03.getVisibility() != 4) {
                this.A03.setVisibility(4);
                this.A03.startAnimation(A032);
            }
            if (this.A06.getVisibility() != 4) {
                this.A06.setVisibility(4);
                this.A06.startAnimation(A032);
            }
        }
        if (!z2 || (A09 = A09()) == null) {
            return;
        }
        A05(A09, this.A0G);
    }

    public boolean A1B() {
        ActivityC02330At A09 = A09();
        return (A09 instanceof InterfaceC05780Qf) && ((InterfaceC05780Qf) A09).AUZ();
    }

    @Override // X.InterfaceC48642Gc
    public void APt(boolean z) {
        Runnable runnable = this.A0D;
        if (runnable != null && z) {
            runnable.run();
        }
        this.A0E = false;
        InterfaceC48642Gc interfaceC48642Gc = this.A0A;
        if (interfaceC48642Gc != null) {
            interfaceC48642Gc.APt(z);
            this.A0A = null;
        }
    }

    @Override // X.C0BA, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.A0U = true;
        if (A0H) {
            A0A().getWindow().setStatusBarColor(C02160Ac.A00(A00(), R.color.media_view_status_bar_background));
            int i = configuration.orientation;
            if (i == 2) {
                A0A().getWindow().setNavigationBarColor(C02160Ac.A00(A00(), R.color.media_view_footer_background));
            } else if (i == 1) {
                A0A().getWindow().setNavigationBarColor(C02160Ac.A00(A00(), 17170445));
            }
            A0A().getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
    }
}
