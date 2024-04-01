package com.whatsapp.phonematching;

import X.ActivityC02310Ar;
import X.AnonymousClass031;
import X.C000200d;
import X.C006602x;
import X.C02160Ac;
import X.C02180Ae;
import X.C07630Zb;
import X.C0DJ;
import X.C0We;
import X.C2OZ;
import X.C70453Si;
import X.InterfaceC07650Zd;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I0_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.phonematching.CountryPicker;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class CountryPicker extends C2OZ {
    public static final int A06;
    public static final int A07;
    public static final String A08;
    public static final String A09;
    public View A00;
    public SearchView A01;
    public Toolbar A02;
    public AnonymousClass031 A03;
    public C70453Si A04;
    public C006602x A05;

    static {
        StringBuilder sb = new StringBuilder();
        String name = CountryPicker.class.getName();
        sb.append(name);
        sb.append(".EXTRA_COUNTRY_ISO");
        A09 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append(".EXTRA_COUNTRY_DISPLAY_NAME");
        A08 = sb2.toString();
        int i = Build.VERSION.SDK_INT;
        A06 = i >= 21 ? 250 : 220;
        A07 = i < 21 ? 220 : 250;
    }

    public final void A1R() {
        if (A1S()) {
            this.A01.A0H("");
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            long j = A07;
            alphaAnimation.setDuration(j);
            this.A02.startAnimation(alphaAnimation);
            if (Build.VERSION.SDK_INT >= 21) {
                int width = (this.A00.getWidth() - getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_overflow_material)) - ((getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material) * 3) >> 1);
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.A00, ((ActivityC02310Ar) this).A01.A0M() ? width : this.A00.getWidth() - width, this.A00.getHeight() >> 1, width, 0.0f);
                createCircularReveal.setDuration(j);
                createCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: X.3Sh
                    {
                        CountryPicker.this = this;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        CountryPicker countryPicker = CountryPicker.this;
                        countryPicker.A01.setIconified(true);
                        countryPicker.A00.setVisibility(8);
                        countryPicker.A02.setVisibility(0);
                    }
                });
                createCircularReveal.start();
                return;
            }
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -this.A00.getHeight());
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(alphaAnimation2);
            animationSet.addAnimation(translateAnimation);
            animationSet.setDuration(j);
            animationSet.setAnimationListener(new C0DJ() { // from class: X.3kK
                {
                    CountryPicker.this = this;
                }

                @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    CountryPicker countryPicker = CountryPicker.this;
                    countryPicker.A01.setIconified(true);
                    countryPicker.A00.setVisibility(8);
                    countryPicker.A02.setVisibility(0);
                }
            });
            this.A00.startAnimation(animationSet);
        }
    }

    public final boolean A1S() {
        C000200d.A1V(C000200d.A0P("Visible"), this.A00.getVisibility() == 0);
        return this.A00.getVisibility() == 0;
    }

    @Override // X.ActivityC02290Ap, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public /* synthetic */ void lambda$initSearchView$2061$CountryPicker(View view) {
        A1R();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (A1S()) {
            A1R();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x00e5, code lost:
        if (r2.A01(r1) == false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.widget.ListAdapter, X.3Si] */
    @Override // X.C2OZ, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.phonematching.CountryPicker.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        Drawable A03 = C02160Ac.A03(this, R.drawable.ic_action_search_teal);
        if (A03 != null) {
            menu.add(0, R.id.menuitem_search, 0, R.string.search).setIcon(C02180Ae.A0Q(A03, C02160Ac.A00(this, R.color.reg_toolbar_icon_color))).setShowAsAction(2);
            return true;
        }
        throw null;
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        StringBuilder A0P = C000200d.A0P("item.getItemId()");
        A0P.append(menuItem.getItemId());
        A0P.append(menuItem.getItemId() == R.id.menuitem_search);
        Log.i(A0P.toString());
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            super.onBackPressed();
        } else if (itemId == R.id.menuitem_search) {
            if (!A1S()) {
                if (this.A01 == null) {
                    C07630Zb.A00(this.A00);
                    getLayoutInflater().inflate(R.layout.home_search_view_layout, (ViewGroup) this.A00, true);
                    SearchView searchView = (SearchView) this.A00.findViewById(R.id.search_view);
                    this.A01 = searchView;
                    TextView textView = (TextView) searchView.findViewById(R.id.search_src_text);
                    textView.setTextColor(C02160Ac.A00(this, R.color.body_gray));
                    textView.setHintTextColor(C02160Ac.A00(this, R.color.body_light_gray));
                    this.A01.setIconifiedByDefault(false);
                    this.A01.setQueryHint(getString(R.string.search_country_hint));
                    SearchView searchView2 = this.A01;
                    searchView2.A0B = new InterfaceC07650Zd() { // from class: X.3kI
                        @Override // X.InterfaceC07650Zd
                        public boolean ANY(String str) {
                            return false;
                        }

                        {
                            CountryPicker.this = this;
                        }

                        @Override // X.InterfaceC07650Zd
                        public boolean ANX(String str) {
                            getFilter().filter(str);
                            return false;
                        }
                    };
                    ((ImageView) searchView2.findViewById(R.id.search_mag_icon)).setImageDrawable(new InsetDrawable(C02160Ac.A03(this, R.drawable.ic_back_teal)) { // from class: X.3Sg
                        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
                        public void draw(Canvas canvas) {
                        }
                    });
                    ImageView imageView = (ImageView) this.A01.findViewById(R.id.search_close_btn);
                    if (imageView != null) {
                        imageView.setImageResource(R.drawable.ic_backup_cancel);
                    }
                    ImageView imageView2 = (ImageView) this.A00.findViewById(R.id.search_back);
                    imageView2.setImageDrawable(new C0We(((ActivityC02310Ar) this).A01, C02160Ac.A03(this, R.drawable.ic_back_teal)));
                    imageView2.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 17));
                    this.A01.setMaxWidth(Integer.MAX_VALUE);
                }
                this.A02.setVisibility(8);
                this.A00.setVisibility(0);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(A07);
                alphaAnimation.setAnimationListener(new C0DJ() { // from class: X.3kJ
                    {
                        CountryPicker.this = this;
                    }

                    @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        CountryPicker.this.A01.setIconified(false);
                    }
                });
                this.A02.startAnimation(alphaAnimation);
                if (Build.VERSION.SDK_INT >= 21) {
                    if (this.A00.isAttachedToWindow()) {
                        int width = (this.A02.getWidth() - getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_overflow_material)) - ((getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material) * 3) >> 1);
                        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.A00, ((ActivityC02310Ar) this).A01.A0M() ? width : this.A02.getWidth() - width, this.A02.getHeight() >> 1, 0.0f, width);
                        createCircularReveal.setDuration(A06);
                        createCircularReveal.start();
                        Log.i("Detach");
                    }
                } else {
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, -this.A02.getHeight(), 0.0f);
                    translateAnimation.setDuration(A06);
                    this.A00.clearAnimation();
                    this.A00.startAnimation(translateAnimation);
                    return true;
                }
            }
            return true;
        }
        return false;
    }
}
