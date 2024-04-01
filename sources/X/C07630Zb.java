package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.os.Bundle;
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
import com.google.android.search.verification.client.R;

/* renamed from: X.0Zb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07630Zb {
    public static final int A07;
    public static final int A08;
    public int A00;
    public SearchView A01;
    public final Activity A02;
    public final View A03;
    public final InterfaceC07650Zd A04;
    public final Toolbar A05;
    public final C002301c A06;

    static {
        int i = Build.VERSION.SDK_INT;
        A07 = i >= 21 ? 250 : 220;
        A08 = i < 21 ? 220 : 250;
    }

    public C07630Zb(Activity activity, C002301c c002301c, View view, Toolbar toolbar, InterfaceC07650Zd interfaceC07650Zd) {
        this.A02 = activity;
        this.A06 = c002301c;
        this.A03 = view;
        this.A05 = toolbar;
        this.A04 = interfaceC07650Zd;
    }

    public static void A00(View view) {
        view.setBackgroundResource(R.drawable.search_background);
        if (Build.VERSION.SDK_INT >= 21 || !(view.getBackground() instanceof NinePatchDrawable)) {
            return;
        }
        C02180Ae.A0Q(view.getBackground(), C02160Ac.A00(view.getContext(), R.color.searchBackgroundLegacyTint));
    }

    public void A01() {
        int width;
        int i;
        if (A05()) {
            return;
        }
        if (this.A01 == null) {
            View view = this.A03;
            A00(view);
            Activity activity = this.A02;
            activity.getLayoutInflater().inflate(R.layout.home_search_view_layout, (ViewGroup) view, true);
            SearchView searchView = (SearchView) view.findViewById(R.id.search_view);
            this.A01 = searchView;
            ((TextView) searchView.findViewById(R.id.search_src_text)).setTextColor(C02160Ac.A00(activity, R.color.search_text_color));
            this.A01.setIconifiedByDefault(false);
            this.A01.setQueryHint(activity.getString(R.string.search_hint));
            SearchView searchView2 = this.A01;
            searchView2.A0B = this.A04;
            final Drawable A03 = C02160Ac.A03(activity, R.drawable.ic_back_teal);
            ((ImageView) searchView2.findViewById(R.id.search_mag_icon)).setImageDrawable(new InsetDrawable(A03) { // from class: X.1L7
                @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
                public void draw(Canvas canvas) {
                }
            });
            ImageView imageView = (ImageView) view.findViewById(R.id.search_back);
            imageView.setImageDrawable(new C0We(this.A06, C02160Ac.A03(activity, R.drawable.ic_back_teal)));
            imageView.setOnClickListener(new View.OnClickListener() { // from class: X.1IR
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C07630Zb.this.A04(true);
                }
            });
        }
        View view2 = this.A03;
        view2.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 21) {
            if (view2.isAttachedToWindow()) {
                View findViewById = this.A05.findViewById(R.id.menuitem_search);
                if (findViewById != null) {
                    int[] iArr = new int[2];
                    findViewById.getLocationInWindow(iArr);
                    if (this.A06.A0M()) {
                        width = (view2.getWidth() - iArr[0]) - (findViewById.getWidth() / 2);
                    } else {
                        width = (findViewById.getWidth() / 2) + iArr[0];
                    }
                    this.A00 = width;
                } else {
                    width = view2.getWidth() / 2;
                    this.A00 = width;
                }
                int max = Math.max(width, view2.getWidth() - this.A00);
                if (this.A06.A0M()) {
                    i = view2.getWidth() - this.A00;
                } else {
                    i = this.A00;
                }
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i, view2.getHeight() / 2, 0.0f, max);
                createCircularReveal.setDuration(A07);
                createCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: X.1L5
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C07630Zb c07630Zb = C07630Zb.this;
                        c07630Zb.A01.setIconified(false);
                        c07630Zb.A05.setVisibility(4);
                    }
                });
                createCircularReveal.start();
            }
        } else {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(A07);
            alphaAnimation.setAnimationListener(new C0DJ() { // from class: X.1j9
                @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    C07630Zb.this.A01.setIconified(false);
                }
            });
            view2.clearAnimation();
            view2.startAnimation(alphaAnimation);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            Toolbar toolbar = this.A05;
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (-toolbar.getHeight()) >> 3);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(alphaAnimation2);
            animationSet.addAnimation(translateAnimation);
            animationSet.setDuration(A08);
            toolbar.startAnimation(animationSet);
            toolbar.setVisibility(4);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            Activity activity2 = this.A02;
            activity2.getWindow().setStatusBarColor(C02160Ac.A00(activity2, R.color.black_alpha_54));
        }
    }

    public void A02(Bundle bundle) {
        CharSequence charSequence;
        if (bundle == null || (charSequence = bundle.getCharSequence("search_text")) == null) {
            return;
        }
        A01();
        this.A00 = bundle.getInt("search_button_x_pos");
        this.A01.A0H(charSequence);
    }

    public void A03(Bundle bundle) {
        if (this.A01 == null || !A05()) {
            return;
        }
        bundle.putCharSequence("search_text", this.A01.getQuery());
        bundle.putInt("search_button_x_pos", this.A00);
    }

    public void A04(boolean z) {
        int i;
        if (A05()) {
            this.A01.A0H("");
            Toolbar toolbar = this.A05;
            toolbar.setVisibility(0);
            if (z) {
                if (Build.VERSION.SDK_INT >= 21) {
                    int i2 = this.A00;
                    View view = this.A03;
                    int width = view.getWidth();
                    int i3 = this.A00;
                    int max = Math.max(i2, width - i3);
                    if (i3 == 0) {
                        this.A00 = view.getWidth() >> 1;
                    }
                    if (this.A06.A0M()) {
                        i = view.getWidth() - this.A00;
                    } else {
                        i = this.A00;
                    }
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, view.getHeight() >> 1, max, 0.0f);
                    createCircularReveal.setDuration(A08);
                    createCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: X.1L6
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            C07630Zb c07630Zb = C07630Zb.this;
                            c07630Zb.A01.setIconified(true);
                            c07630Zb.A03.setVisibility(4);
                        }
                    });
                    createCircularReveal.start();
                } else {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    long j = A08;
                    alphaAnimation.setDuration(j);
                    alphaAnimation.setAnimationListener(new C0DJ() { // from class: X.1jA
                        @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            C07630Zb c07630Zb = C07630Zb.this;
                            c07630Zb.A01.setIconified(true);
                            c07630Zb.A03.setVisibility(4);
                        }
                    });
                    this.A03.startAnimation(alphaAnimation);
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (-toolbar.getHeight()) / 4, 0.0f);
                    AnimationSet animationSet = new AnimationSet(true);
                    animationSet.addAnimation(alphaAnimation2);
                    animationSet.addAnimation(translateAnimation);
                    animationSet.setDuration(j);
                    toolbar.startAnimation(animationSet);
                }
            } else {
                this.A01.setIconified(true);
                this.A03.setVisibility(4);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                Activity activity = this.A02;
                activity.getWindow().setStatusBarColor(C02160Ac.A00(activity, R.color.primary_dark));
            }
        }
    }

    public boolean A05() {
        return this.A03.getVisibility() == 0;
    }
}
