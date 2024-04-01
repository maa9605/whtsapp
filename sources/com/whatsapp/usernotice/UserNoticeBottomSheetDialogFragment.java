package com.whatsapp.usernotice;

import X.AbstractC08940cM;
import X.C003301p;
import X.C018508q;
import X.C02180Ae;
import X.C02770Cu;
import X.C02780Cv;
import X.C02E;
import X.C0AT;
import X.C0Wg;
import X.C40801st;
import X.C40811su;
import X.C40891t2;
import X.C40901t3;
import X.C40911t4;
import X.C40921t5;
import X.C41941ul;
import X.C41951um;
import X.C50772Tc;
import X.C83563sK;
import X.InterfaceC13310l3;
import X.ViewTreeObserver$OnGlobalLayoutListenerC72263Zh;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.BulletSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I0_6;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.usernotice.UserNoticeBottomSheetDialogFragment;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I0_3;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class UserNoticeBottomSheetDialogFragment extends Hilt_UserNoticeBottomSheetDialogFragment {
    public int A00;
    public ValueAnimator A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public LinearLayout A05;
    public TextView A06;
    public TextView A07;
    public NestedScrollView A08;
    public C018508q A09;
    public C02E A0A;
    public C50772Tc A0B;
    public C41941ul A0C;
    public C41951um A0D;
    public C40811su A0E;
    public UserNoticeModalIconView A0F;
    public Runnable A0G;
    public final View.OnClickListener A0H = new ViewOnClickCListenerShape11S0100000_I0_3(this, 7);
    public final InterfaceC13310l3 A0I = new InterfaceC13310l3() { // from class: X.3sJ
        {
            UserNoticeBottomSheetDialogFragment.this = this;
        }

        @Override // X.InterfaceC13310l3
        public final void AOL(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = UserNoticeBottomSheetDialogFragment.this;
            userNoticeBottomSheetDialogFragment.A1D(false, false);
            userNoticeBottomSheetDialogFragment.A1B();
            Runnable runnable = userNoticeBottomSheetDialogFragment.A0G;
            if (runnable != null) {
                userNoticeBottomSheetDialogFragment.A09.A02.removeCallbacks(runnable);
            }
            if (!((userNoticeBottomSheetDialogFragment.A02.getY() - ((float) userNoticeBottomSheetDialogFragment.A08.getHeight())) - ((float) userNoticeBottomSheetDialogFragment.A08.getScrollY()) < 0.0f)) {
                RunnableEBaseShape7S0100000_I0_7 runnableEBaseShape7S0100000_I0_7 = new RunnableEBaseShape7S0100000_I0_7(userNoticeBottomSheetDialogFragment, 21);
                userNoticeBottomSheetDialogFragment.A0G = runnableEBaseShape7S0100000_I0_7;
                userNoticeBottomSheetDialogFragment.A09.A02.postDelayed(runnableEBaseShape7S0100000_I0_7, 600L);
            }
        }
    };
    public final C83563sK A0J = new C83563sK(this);

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C40901t3 c40901t3;
        C40901t3 c40901t32;
        Object[] spans;
        Log.i("UserNoticeBottomSheetDialogFragment/onCreateView");
        Bundle A02 = A02();
        String string = A02.getString("icon_light_url");
        if (string != null) {
            String string2 = A02.getString("icon_dark_url");
            if (string2 != null) {
                String string3 = A02.getString("icon_description");
                if (string3 != null) {
                    String string4 = A02.getString("title");
                    if (string4 != null) {
                        int i = A02.getInt("bullets_size", 0);
                        ArrayList arrayList = new ArrayList(i);
                        for (int i2 = 0; i2 < i; i2++) {
                            StringBuilder sb = new StringBuilder("bullet_text_");
                            sb.append(i2);
                            String string5 = A02.getString(sb.toString());
                            if (string5 != null) {
                                StringBuilder sb2 = new StringBuilder("bullet_icon_light_url_");
                                sb2.append(i2);
                                String string6 = A02.getString(sb2.toString());
                                StringBuilder sb3 = new StringBuilder("bullet_icon_dark_url_");
                                sb3.append(i2);
                                arrayList.add(new C40921t5(string5, string6, A02.getString(sb3.toString())));
                            } else {
                                throw null;
                            }
                        }
                        String string7 = A02.getString("agree_button_text");
                        if (string7 != null) {
                            long j = A02.getLong("start_time_millis");
                            if (j != 0) {
                                c40901t3 = new C40901t3(j);
                            } else {
                                c40901t3 = null;
                            }
                            C40911t4 c40911t4 = new C40911t4(A02.getLong("duration_static", -1L), A02.getLongArray("duration_repeat"));
                            long j2 = A02.getLong("end_time_millis");
                            if (j2 != 0) {
                                c40901t32 = new C40901t3(j2);
                            } else {
                                c40901t32 = null;
                            }
                            C40811su c40811su = new C40811su(string, string2, string3, string4, arrayList, string7, new C40891t2(c40901t3, c40911t4, c40901t32), A02.getString("body"), A02.getString("footer"), A02.getString("dismiss_button_text"));
                            String string8 = A02.getString("light_icon_path");
                            ((C40801st) c40811su).A01 = string8 == null ? null : new File(string8);
                            String string9 = A02.getString("dark_icon_path");
                            ((C40801st) c40811su).A00 = string9 == null ? null : new File(string9);
                            this.A0E = c40811su;
                            final View inflate = layoutInflater.inflate(R.layout.user_notice_modal, viewGroup, true);
                            inflate.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.3Zf
                                {
                                    UserNoticeBottomSheetDialogFragment.this = this;
                                }

                                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                public void onGlobalLayout() {
                                    inflate.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                    UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = UserNoticeBottomSheetDialogFragment.this;
                                    userNoticeBottomSheetDialogFragment.A07.setVisibility(4);
                                    userNoticeBottomSheetDialogFragment.A06.setVisibility(8);
                                    userNoticeBottomSheetDialogFragment.A1B();
                                }
                            });
                            this.A08 = (NestedScrollView) C0AT.A0D(inflate, R.id.user_notice_modal_scrollview);
                            this.A03 = C0AT.A0D(inflate, R.id.user_notice_modal_scroll_decoration_group);
                            C0AT.A0D(inflate, R.id.user_notice_modal_scroll_button).setOnClickListener(this.A0H);
                            this.A08.setNestedScrollingEnabled(false);
                            NestedScrollView nestedScrollView = this.A08;
                            nestedScrollView.A0E = this.A0I;
                            nestedScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC72263Zh(this));
                            this.A02 = C0AT.A0D(inflate, R.id.user_notice_modal_button_divider);
                            ImageView imageView = (ImageView) C0AT.A0D(inflate, R.id.user_notice_modal_default_icon);
                            this.A04 = imageView;
                            imageView.setContentDescription(((C40801st) this.A0E).A02);
                            UserNoticeModalIconView userNoticeModalIconView = (UserNoticeModalIconView) C0AT.A0D(inflate, R.id.user_notice_modal_server_icon);
                            this.A0F = userNoticeModalIconView;
                            userNoticeModalIconView.A00 = this.A04;
                            userNoticeModalIconView.A02(this.A0E);
                            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C0AT.A0D(inflate, R.id.user_notice_modal_body);
                            textEmojiLabel.setMovementMethod(LinkMovementMethod.getInstance());
                            A1C(textEmojiLabel, this.A0E.A02);
                            A1C((TextEmojiLabel) C0AT.A0D(inflate, R.id.user_notice_modal_footer), this.A0E.A04);
                            TextView textView = (TextView) C0AT.A0D(inflate, R.id.user_notice_modal_title);
                            this.A07 = textView;
                            textView.setText(this.A0E.A07);
                            C0AT.A0M(this.A07);
                            this.A06 = (TextView) C0AT.A0D(inflate, R.id.user_notice_modal_sticky_title);
                            int dimensionPixelSize = A01().getDimensionPixelSize(R.dimen.user_notice_modal_horizontal_padding);
                            int dimensionPixelSize2 = A01().getDimensionPixelSize(R.dimen.user_notice_modal_sticky_title_padding);
                            this.A00 = dimensionPixelSize2;
                            this.A06.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
                            this.A06.setMaxLines(5);
                            this.A06.setEllipsize(TextUtils.TruncateAt.END);
                            this.A06.setBackground(C02180Ae.A0N(A00(), R.drawable.bottom_sheet_background));
                            this.A06.setText(this.A0E.A07);
                            C0AT.A0P(this.A06, A01().getDimension(R.dimen.user_notice_modal_sticky_title_elevation));
                            C0AT.A0M(this.A06);
                            LinearLayout linearLayout = (LinearLayout) C0AT.A0D(inflate, R.id.user_notice_modal_bullets);
                            this.A05 = linearLayout;
                            LayoutInflater from = LayoutInflater.from(A00());
                            int dimensionPixelSize3 = A01().getDimensionPixelSize(R.dimen.user_notice_modal_bullet_span_gap);
                            for (int i3 = 0; i3 < this.A0E.A08.size(); i3++) {
                                TextEmojiLabel textEmojiLabel2 = (TextEmojiLabel) from.inflate(R.layout.user_notice_modal_text_bullet, (ViewGroup) linearLayout, false);
                                textEmojiLabel2.setTag(Integer.valueOf(i3));
                                linearLayout.addView(textEmojiLabel2);
                                textEmojiLabel2.setMovementMethod(new C02770Cu());
                                textEmojiLabel2.setAccessibilityHelper(new C02780Cv(this.A0A, textEmojiLabel2));
                                SpannableString A0S = C02180Ae.A0S(A00(), ((C40921t5) this.A0E.A08.get(i3)).A02, this.A0J);
                                SpannableString spannableString = new SpannableString(A0S.toString());
                                spannableString.setSpan(new BulletSpan(dimensionPixelSize3), 0, A0S.length(), 17);
                                for (Object obj : A0S.getSpans(0, A0S.length(), Object.class)) {
                                    spannableString.setSpan(obj, A0S.getSpanStart(obj), A0S.getSpanEnd(obj), 17);
                                }
                                textEmojiLabel2.setText(spannableString);
                            }
                            TextView textView2 = (TextView) C0AT.A0D(inflate, R.id.user_notice_modal_agree_button);
                            textView2.setText(this.A0E.A01);
                            textView2.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(this, 2));
                            TextView textView3 = (TextView) C0AT.A0D(inflate, R.id.user_notice_modal_dismiss_button);
                            if (!TextUtils.isEmpty(this.A0E.A03)) {
                                textView3.setText(this.A0E.A03);
                                textView3.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(this, 1));
                            } else {
                                textView3.setVisibility(8);
                                C0Wg c0Wg = (C0Wg) textView2.getLayoutParams();
                                c0Wg.A0T = 0;
                                textView2.setLayoutParams(c0Wg);
                            }
                            A15(!TextUtils.isEmpty(this.A0E.A03));
                            C41941ul c41941ul = this.A0C;
                            if (!TextUtils.isEmpty(this.A0E.A03)) {
                                c41941ul.A01(3);
                                return inflate;
                            }
                            c41941ul.A01(7);
                            return inflate;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0r() {
        super.A0r();
        this.A08.A0E = null;
    }

    @Override // com.whatsapp.RoundedBottomSheetDialogFragment
    public void A1A(View view) {
        super.A1A(view);
        final BottomSheetBehavior A00 = BottomSheetBehavior.A00(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = Resources.getSystem().getDisplayMetrics().heightPixels - C003301p.A02(view.getContext());
        view.setLayoutParams(layoutParams);
        A00.A0E = new AbstractC08940cM() { // from class: X.3sL
            @Override // X.AbstractC08940cM
            public void A00(View view2, float f) {
            }

            @Override // X.AbstractC08940cM
            public void A01(View view2, int i) {
                if (i != 3) {
                    A00.A0O(3);
                }
            }
        };
        A00.A0O(3);
    }

    public final void A1B() {
        boolean z = ((float) this.A08.getScrollY()) > this.A07.getY() - ((float) this.A00);
        this.A07.setVisibility(z ? 4 : 0);
        this.A06.setVisibility(z ? 0 : 8);
    }

    public final void A1C(TextEmojiLabel textEmojiLabel, String str) {
        if (TextUtils.isEmpty(str)) {
            textEmojiLabel.setVisibility(8);
            return;
        }
        textEmojiLabel.setMovementMethod(new C02770Cu());
        textEmojiLabel.setAccessibilityHelper(new C02780Cv(this.A0A, textEmojiLabel));
        Context A00 = A00();
        if (str != null) {
            textEmojiLabel.setText(C02180Ae.A0S(A00, str, this.A0J));
            return;
        }
        throw null;
    }

    public final void A1D(final boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.A01 = valueAnimator2;
            valueAnimator2.setInterpolator(new AccelerateDecelerateInterpolator());
            this.A01.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3Zd
                {
                    UserNoticeBottomSheetDialogFragment.this = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    UserNoticeBottomSheetDialogFragment.this.A03.setAlpha(((Number) valueAnimator3.getAnimatedValue()).floatValue());
                }
            });
        } else {
            valueAnimator.cancel();
            this.A01.removeAllListeners();
        }
        this.A01.addListener(new AnimatorListenerAdapter() { // from class: X.3Zg
            {
                UserNoticeBottomSheetDialogFragment.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                UserNoticeBottomSheetDialogFragment.this.A03.setVisibility(z ? 0 : 8);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                UserNoticeBottomSheetDialogFragment.this.A03.setVisibility(0);
            }
        });
        this.A01.setFloatValues(this.A03.getAlpha(), z ? 1.0f : 0.0f);
        this.A01.setDuration(z2 ? 400L : 0L);
        this.A01.start();
    }

    @Override // X.C0BA, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.A0U = true;
        View findViewById = A0y().findViewById(R.id.design_bottom_sheet);
        if (findViewById != null) {
            A1A(findViewById);
            int dimensionPixelSize = A01().getDimensionPixelSize(R.dimen.user_notice_modal_default_icon_size);
            ImageView imageView = this.A04;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = dimensionPixelSize;
                layoutParams.height = dimensionPixelSize;
                imageView.setLayoutParams(layoutParams);
            }
            int dimensionPixelSize2 = A01().getDimensionPixelSize(R.dimen.user_notice_modal_server_icon_size);
            UserNoticeModalIconView userNoticeModalIconView = this.A0F;
            ViewGroup.LayoutParams layoutParams2 = userNoticeModalIconView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = dimensionPixelSize2;
                layoutParams2.height = dimensionPixelSize2;
                userNoticeModalIconView.setLayoutParams(layoutParams2);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A05.getLayoutParams();
            int dimensionPixelSize3 = A01().getDimensionPixelSize(R.dimen.user_notice_modal_bullets_horizontal_margin);
            marginLayoutParams.leftMargin = dimensionPixelSize3;
            marginLayoutParams.rightMargin = dimensionPixelSize3;
            this.A05.setLayoutParams(marginLayoutParams);
            int dimensionPixelSize4 = A01().getDimensionPixelSize(R.dimen.user_notice_modal_horizontal_padding);
            NestedScrollView nestedScrollView = this.A08;
            nestedScrollView.setPadding(dimensionPixelSize4, nestedScrollView.getPaddingTop(), dimensionPixelSize4, this.A08.getPaddingBottom());
            TextView textView = this.A06;
            textView.setPadding(dimensionPixelSize4, textView.getPaddingTop(), dimensionPixelSize4, this.A06.getPaddingBottom());
            this.A08.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC72263Zh(this));
            return;
        }
        throw null;
    }
}
