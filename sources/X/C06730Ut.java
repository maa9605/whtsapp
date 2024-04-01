package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* renamed from: X.0Ut */
/* loaded from: classes.dex */
public class C06730Ut extends C0U1 implements InterfaceC06740Uu {
    public static final Interpolator A0Q = new AccelerateInterpolator();
    public static final Interpolator A0R = new DecelerateInterpolator();
    public Context A01;
    public Context A02;
    public View A03;
    public C28311Rh A04;
    public C0O8 A05;
    public C0U0 A06;
    public C10750ga A07;
    public ActionBarContainer A08;
    public ActionBarContextView A09;
    public ActionBarOverlayLayout A0A;
    public InterfaceC08830c9 A0B;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0L;
    public boolean A0M;
    public ArrayList A0C = new ArrayList();
    public int A00 = 0;
    public boolean A0D = true;
    public boolean A0K = true;
    public final C0TU A0N = new C06680Un() { // from class: X.1nj
        {
            C06730Ut.this = this;
        }

        @Override // X.C0TU
        public void AH8(View view) {
            View view2;
            C06730Ut c06730Ut = C06730Ut.this;
            if (c06730Ut.A0D && (view2 = c06730Ut.A03) != null) {
                view2.setTranslationY(0.0f);
                c06730Ut.A08.setTranslationY(0.0f);
            }
            c06730Ut.A08.setVisibility(8);
            c06730Ut.A08.setTransitioning(false);
            c06730Ut.A07 = null;
            C0O8 c0o8 = c06730Ut.A05;
            if (c0o8 != null) {
                c0o8.AJK(c06730Ut.A06);
                c06730Ut.A06 = null;
                c06730Ut.A05 = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = c06730Ut.A0A;
            if (actionBarOverlayLayout != null) {
                C0AT.A0L(actionBarOverlayLayout);
            }
        }
    };
    public final C0TU A0O = new C06680Un() { // from class: X.1nk
        {
            C06730Ut.this = this;
        }

        @Override // X.C0TU
        public void AH8(View view) {
            C06730Ut c06730Ut = C06730Ut.this;
            c06730Ut.A07 = null;
            c06730Ut.A08.requestLayout();
        }
    };
    public final InterfaceC13190kk A0P = new C28301Rg(this);

    public C06730Ut(Activity activity, boolean z) {
        View decorView = activity.getWindow().getDecorView();
        A0W(decorView);
        if (z) {
            return;
        }
        this.A03 = decorView.findViewById(16908290);
    }

    public C06730Ut(Dialog dialog) {
        A0W(dialog.getWindow().getDecorView());
    }

    @Override // X.C0U1
    public float A00() {
        return C0AT.A00(this.A08);
    }

    @Override // X.C0U1
    public int A01() {
        return this.A0B.A9o();
    }

    @Override // X.C0U1
    public Context A02() {
        Context context = this.A02;
        if (context == null) {
            TypedValue typedValue = new TypedValue();
            this.A01.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.A01, i);
                this.A02 = contextThemeWrapper;
                return contextThemeWrapper;
            }
            Context context2 = this.A01;
            this.A02 = context2;
            return context2;
        }
        return context;
    }

    @Override // X.C0U1
    public C0U0 A03(C0O8 c0o8) {
        C28311Rh c28311Rh = this.A04;
        if (c28311Rh != null) {
            c28311Rh.A05();
        }
        this.A0A.setHideOnContentScrollEnabled(false);
        ActionBarContextView actionBarContextView = this.A09;
        actionBarContextView.removeAllViews();
        actionBarContextView.A04 = null;
        ((C0Ud) actionBarContextView).A02 = null;
        C28311Rh c28311Rh2 = new C28311Rh(this, this.A09.getContext(), c0o8);
        C06650Uk c06650Uk = c28311Rh2.A03;
        c06650Uk.A07();
        try {
            if (c28311Rh2.A00.AJ5(c28311Rh2, c06650Uk)) {
                this.A04 = c28311Rh2;
                c28311Rh2.A06();
                this.A09.A05(c28311Rh2);
                A0X(true);
                this.A09.sendAccessibilityEvent(32);
                return c28311Rh2;
            }
            return null;
        } finally {
            c06650Uk.A06();
        }
    }

    @Override // X.C0U1
    public void A05() {
        if (this.A0G) {
            return;
        }
        this.A0G = true;
        A0Z(false);
    }

    @Override // X.C0U1
    public void A06(float f) {
        C0AT.A0P(this.A08, f);
    }

    @Override // X.C0U1
    public void A07(int i) {
        this.A0B.ATv(this.A01.getString(i));
    }

    @Override // X.C0U1
    public void A08(int i) {
        this.A0B.AU0(this.A01.getString(i));
    }

    @Override // X.C0U1
    public void A09(Configuration configuration) {
        A0Y(this.A01.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
    }

    @Override // X.C0U1
    public void A0A(Drawable drawable) {
        this.A0B.ATR(drawable);
    }

    @Override // X.C0U1
    public void A0B(Drawable drawable) {
        this.A08.setPrimaryBackground(drawable);
    }

    @Override // X.C0U1
    public void A0C(Drawable drawable) {
        this.A0B.ATG(null);
    }

    @Override // X.C0U1
    public void A0D(View view) {
        this.A0B.ASx(view);
    }

    @Override // X.C0U1
    public void A0E(View view, C0U2 c0u2) {
        view.setLayoutParams(c0u2);
        this.A0B.ASx(view);
    }

    @Override // X.C0U1
    public void A0F(CharSequence charSequence) {
        this.A0B.setWindowTitle(charSequence);
    }

    @Override // X.C0U1
    public void A0G(CharSequence charSequence) {
        this.A0B.ATv(charSequence);
    }

    @Override // X.C0U1
    public void A0H(CharSequence charSequence) {
        this.A0B.AU0(charSequence);
    }

    @Override // X.C0U1
    public void A0I(boolean z) {
        if (z == this.A0J) {
            return;
        }
        this.A0J = z;
        ArrayList arrayList = this.A0C;
        if (0 < arrayList.size()) {
            arrayList.get(0);
            throw null;
        }
    }

    @Override // X.C0U1
    public void A0J(boolean z) {
        if (this.A0E) {
            return;
        }
        A0V(z ? 4 : 0, 4);
    }

    @Override // X.C0U1
    public void A0K(boolean z) {
        C10750ga c10750ga;
        this.A0L = z;
        if (z || (c10750ga = this.A07) == null) {
            return;
        }
        c10750ga.A00();
    }

    @Override // X.C0U1
    public void A0L(boolean z) {
        A0V(z ? 4 : 0, 4);
    }

    @Override // X.C0U1
    public void A0M(boolean z) {
        A0V(z ? 16 : 0, 16);
    }

    @Override // X.C0U1
    public void A0N(boolean z) {
        A0V(z ? 2 : 0, 2);
    }

    @Override // X.C0U1
    public void A0O(boolean z) {
        A0V(z ? 8 : 0, 8);
    }

    @Override // X.C0U1
    public boolean A0Q() {
        InterfaceC08830c9 interfaceC08830c9 = this.A0B;
        if (interfaceC08830c9 == null || !interfaceC08830c9.AER()) {
            return false;
        }
        interfaceC08830c9.A6I();
        return true;
    }

    @Override // X.C0U1
    public boolean A0T(int i, KeyEvent keyEvent) {
        C06650Uk c06650Uk;
        int i2;
        C28311Rh c28311Rh = this.A04;
        if (c28311Rh == null || (c06650Uk = c28311Rh.A03) == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        c06650Uk.setQwertyMode(KeyCharacterMap.load(i2).getKeyboardType() != 1);
        return c06650Uk.performShortcut(i, keyEvent, 0);
    }

    public void A0V(int i, int i2) {
        InterfaceC08830c9 interfaceC08830c9 = this.A0B;
        int A9o = interfaceC08830c9.A9o();
        if ((i2 & 4) != 0) {
            this.A0E = true;
        }
        interfaceC08830c9.ASz((i & i2) | ((i2 ^ (-1)) & A9o));
    }

    public final void A0W(View view) {
        InterfaceC08830c9 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.A0A = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof InterfaceC08830c9) {
            wrapper = (InterfaceC08830c9) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder A0P = C000200d.A0P("Can't make a decor toolbar out of ");
            A0P.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(A0P.toString());
        }
        this.A0B = wrapper;
        this.A09 = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.A08 = actionBarContainer;
        InterfaceC08830c9 interfaceC08830c9 = this.A0B;
        if (interfaceC08830c9 != null && this.A09 != null && actionBarContainer != null) {
            Context context = interfaceC08830c9.getContext();
            this.A01 = context;
            if ((this.A0B.A9o() & 4) != 0) {
                this.A0E = true;
            }
            context.getApplicationInfo();
            A0Y(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.A01.obtainStyledAttributes(null, C0UY.A00, R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.A0A;
                if (actionBarOverlayLayout2.A0F) {
                    this.A0I = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                C0AT.A0P(this.A08, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("WindowDecorActionBar");
        sb.append(" can only be used with a compatible window decor layout");
        throw new IllegalStateException(sb.toString());
    }

    public void A0X(boolean z) {
        C0TT AUI;
        C0TT A03;
        long j;
        boolean z2 = this.A0M;
        if (z) {
            if (!z2) {
                this.A0M = true;
                A0Z(false);
            }
        } else if (z2) {
            this.A0M = false;
            A0Z(false);
        }
        if (C0AT.A0h(this.A08)) {
            if (z) {
                A03 = this.A0B.AUI(4, 100L);
                AUI = this.A09.A03(0, 200L);
            } else {
                AUI = this.A0B.AUI(0, 200L);
                A03 = this.A09.A03(8, 100L);
            }
            C10750ga c10750ga = new C10750ga();
            ArrayList arrayList = c10750ga.A05;
            arrayList.add(A03);
            View view = (View) A03.A01.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = (View) AUI.A01.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            arrayList.add(AUI);
            c10750ga.A01();
        } else if (z) {
            this.A0B.AU8(4);
            this.A09.setVisibility(0);
        } else {
            this.A0B.AU8(0);
            this.A09.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x001b, code lost:
        if (r2 == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0Y(boolean r6) {
        /*
            r5 = this;
            r5.A0F = r6
            r1 = 0
            if (r6 != 0) goto L2e
            androidx.appcompat.widget.ActionBarContainer r0 = r5.A08
            r0.setTabContainer(r1)
        La:
            X.0c9 r4 = r5.A0B
            int r1 = r4.ABY()
            r0 = 2
            r3 = 1
            r2 = 0
            if (r1 != r0) goto L16
            r2 = 1
        L16:
            boolean r0 = r5.A0F
            if (r0 != 0) goto L1d
            r0 = 1
            if (r2 != 0) goto L1e
        L1d:
            r0 = 0
        L1e:
            r4.ASp(r0)
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r5.A0A
            boolean r0 = r5.A0F
            if (r0 != 0) goto L2c
            if (r2 == 0) goto L2c
        L29:
            r1.A0C = r3
            return
        L2c:
            r3 = 0
            goto L29
        L2e:
            androidx.appcompat.widget.ActionBarContainer r0 = r5.A08
            r0.setTabContainer(r1)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06730Ut.A0Y(boolean):void");
    }

    public final void A0Z(boolean z) {
        View view;
        int[] iArr;
        View view2;
        View view3;
        int[] iArr2;
        if (this.A0M || !(this.A0G || this.A0H)) {
            if (!this.A0K) {
                this.A0K = true;
                C10750ga c10750ga = this.A07;
                if (c10750ga != null) {
                    c10750ga.A00();
                }
                this.A08.setVisibility(0);
                if (this.A00 == 0 && (this.A0L || z)) {
                    this.A08.setTranslationY(0.0f);
                    float f = -this.A08.getHeight();
                    if (z) {
                        this.A08.getLocationInWindow(new int[]{0, 0});
                        f -= iArr2[1];
                    }
                    this.A08.setTranslationY(f);
                    C10750ga c10750ga2 = new C10750ga();
                    C0TT A0E = C0AT.A0E(this.A08);
                    A0E.A03(0.0f);
                    A0E.A07(this.A0P);
                    boolean z2 = c10750ga2.A03;
                    if (!z2) {
                        c10750ga2.A05.add(A0E);
                    }
                    if (this.A0D && (view3 = this.A03) != null) {
                        view3.setTranslationY(f);
                        C0TT A0E2 = C0AT.A0E(this.A03);
                        A0E2.A03(0.0f);
                        z2 = c10750ga2.A03;
                        if (!z2) {
                            c10750ga2.A05.add(A0E2);
                        }
                    }
                    Interpolator interpolator = A0R;
                    if (!z2) {
                        c10750ga2.A01 = interpolator;
                        c10750ga2.A00 = 250L;
                    }
                    C0TU c0tu = this.A0O;
                    if (!z2) {
                        c10750ga2.A02 = c0tu;
                    }
                    this.A07 = c10750ga2;
                    c10750ga2.A01();
                } else {
                    this.A08.setAlpha(1.0f);
                    this.A08.setTranslationY(0.0f);
                    if (this.A0D && (view2 = this.A03) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.A0O.AH8(null);
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.A0A;
                if (actionBarOverlayLayout != null) {
                    C0AT.A0L(actionBarOverlayLayout);
                }
            }
        } else if (!this.A0K) {
        } else {
            this.A0K = false;
            C10750ga c10750ga3 = this.A07;
            if (c10750ga3 != null) {
                c10750ga3.A00();
            }
            if (this.A00 == 0 && (this.A0L || z)) {
                this.A08.setAlpha(1.0f);
                this.A08.setTransitioning(true);
                C10750ga c10750ga4 = new C10750ga();
                float f2 = -this.A08.getHeight();
                if (z) {
                    this.A08.getLocationInWindow(new int[]{0, 0});
                    f2 -= iArr[1];
                }
                C0TT A0E3 = C0AT.A0E(this.A08);
                A0E3.A03(f2);
                A0E3.A07(this.A0P);
                boolean z3 = c10750ga4.A03;
                if (!z3) {
                    c10750ga4.A05.add(A0E3);
                }
                if (this.A0D && (view = this.A03) != null) {
                    C0TT A0E4 = C0AT.A0E(view);
                    A0E4.A03(f2);
                    z3 = c10750ga4.A03;
                    if (!z3) {
                        c10750ga4.A05.add(A0E4);
                    }
                }
                Interpolator interpolator2 = A0Q;
                if (!z3) {
                    c10750ga4.A01 = interpolator2;
                    c10750ga4.A00 = 250L;
                }
                C0TU c0tu2 = this.A0N;
                if (!z3) {
                    c10750ga4.A02 = c0tu2;
                }
                this.A07 = c10750ga4;
                c10750ga4.A01();
                return;
            }
            this.A0N.AH8(null);
        }
    }
}
