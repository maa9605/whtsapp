package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.Html;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ListView;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1;
import java.util.Map;

/* renamed from: X.2J9 */
/* loaded from: classes2.dex */
public abstract class C2J9 {
    public final int A00;
    public final Conversation A01;

    public C2J9(Conversation conversation, int i) {
        this.A01 = conversation;
        this.A00 = i;
    }

    public final void A00() {
        C58322qx c58322qx = this.A01.A1R;
        Class<?> cls = getClass();
        C2J9 c2j9 = (C2J9) c58322qx.A00.get(cls);
        if (c2j9 == null || c58322qx.A01 == cls) {
            return;
        }
        if (c58322qx.A01 != null) {
            Map map = c58322qx.A00;
            C2J9 c2j92 = (C2J9) map.get(c58322qx.A01);
            if (c2j92 != null && c2j92.A00 < c2j9.A00) {
                Class cls2 = c58322qx.A01;
                if (cls2 != null) {
                    C2J9 c2j93 = (C2J9) map.get(cls2);
                    if (cls2.equals(c58322qx.A01) && c2j93 != null) {
                        c2j93.A01(new C37Q(c58322qx), false);
                    }
                } else {
                    throw null;
                }
            }
        }
        if (c58322qx.A01 == null && c2j9.A03()) {
            if (!(c2j9 instanceof C54452il)) {
                C37Y c37y = (C37Y) c2j9;
                ViewGroup viewGroup = c37y.A01;
                if (viewGroup.getVisibility() != 0) {
                    boolean z = viewGroup.getChildCount() > 0;
                    if (!(c37y instanceof C3JO)) {
                        C3JL c3jl = (C3JL) c37y;
                        ViewGroup viewGroup2 = ((C37Y) c3jl).A01;
                        if (viewGroup2.findViewById(R.id.group_description_text) == null) {
                            viewGroup2.removeAllViews();
                            ((C2J9) c3jl).A01.getLayoutInflater().inflate(R.layout.conversation_group_description, viewGroup2, true);
                            viewGroup2.findViewById(R.id.group_description_close).setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1(c3jl, 6));
                        }
                        c3jl.A06();
                    } else {
                        C3JO c3jo = (C3JO) c37y;
                        ViewGroup viewGroup3 = ((C37Y) c3jo).A01;
                        if (viewGroup3.findViewById(R.id.app_update_banner_text) == null) {
                            viewGroup3.removeAllViews();
                            Conversation conversation = ((C2J9) c3jo).A01;
                            conversation.getLayoutInflater().inflate(R.layout.conversation_app_update_banner, viewGroup3, true);
                            ImageView imageView = (ImageView) viewGroup3.findViewById(R.id.app_update_banner_close);
                            imageView.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1(c3jo, 8));
                            C02180Ae.A17(imageView, C02160Ac.A00(conversation, R.color.banner_close_icon_color));
                            viewGroup3.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1(c3jo, 9));
                            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) conversation.findViewById(R.id.app_update_banner_text);
                            Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(Html.fromHtml(conversation.getString(R.string.conversation_app_update_banner_text)));
                            c3jo.A05.A01(conversation, newSpannable);
                            textEmojiLabel.setAccessibilityHelper(new C02780Cv(c3jo.A04, textEmojiLabel));
                            textEmojiLabel.A06(newSpannable, null, false, 0);
                        }
                    }
                    C0U1 A0c = ((C2J9) c37y).A01.A0c();
                    if (A0c != null) {
                        A0c.A06(0.0f);
                        C0AT.A0P(viewGroup, c37y.A00);
                        viewGroup.setVisibility(0);
                        if (z) {
                            viewGroup.postDelayed(new RunnableEBaseShape8S0100000_I1_0(viewGroup, 20), 10L);
                        }
                    } else {
                        throw null;
                    }
                }
            } else {
                final C54452il c54452il = (C54452il) c2j9;
                if (c54452il.A00 == null) {
                    c54452il.A00 = ((C2J9) c54452il).A01.getLayoutInflater().inflate(R.layout.change_number_notification, c54452il.A04).findViewById(R.id.change_number_notification);
                    c54452il.A05();
                    TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
                    translateAnimation.setAnimationListener(new C0DJ() { // from class: X.37Z
                        @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                            View view = c54452il.A00;
                            if (view == null) {
                                throw null;
                            }
                            view.setVisibility(0);
                        }
                    });
                    translateAnimation.setDuration(400L);
                    View view = c54452il.A00;
                    if (view == null) {
                        throw null;
                    }
                    view.startAnimation(translateAnimation);
                }
            }
            c58322qx.A01 = cls;
        }
    }

    public void A01(final C37Q c37q, boolean z) {
        if (this instanceof C54452il) {
            final C54452il c54452il = (C54452il) this;
            if (z) {
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                translateAnimation.setAnimationListener(new C0DJ() { // from class: X.37a
                    @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        c54452il.A06(c37q);
                    }
                });
                translateAnimation.setDuration(400L);
                View view = c54452il.A00;
                if (view == null) {
                    throw null;
                }
                view.startAnimation(translateAnimation);
                return;
            }
            c54452il.A06(c37q);
            return;
        }
        final C37Y c37y = (C37Y) this;
        if (z) {
            Conversation conversation = ((C2J9) c37y).A01;
            if (conversation.A2R()) {
                TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                translateAnimation2.setDuration(220L);
                translateAnimation2.setInterpolator(new AccelerateInterpolator());
                c37y.A01.startAnimation(translateAnimation2);
                c37y.A05(c37q);
                return;
            }
            ViewGroup viewGroup = c37y.A01;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", 0.0f, -viewGroup.getHeight());
            ListView A1P = conversation.A1P();
            ObjectAnimator ofInt = ObjectAnimator.ofInt(A1P, "Top", A1P.getTop(), A1P.getTop() - viewGroup.getHeight());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofInt);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.2qv
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    C37Y c37y2 = c37y;
                    c37y2.A05(c37q);
                    c37y2.A01.setTranslationY(0.0f);
                }
            });
            animatorSet.setDuration(220L).start();
            return;
        }
        c37y.A05(c37q);
    }

    public final void A02(boolean z) {
        C58322qx c58322qx = this.A01.A1R;
        Class<?> cls = getClass();
        C2J9 c2j9 = (C2J9) c58322qx.A00.get(cls);
        if (cls.equals(c58322qx.A01) && c2j9 != null) {
            c2j9.A01(new C37Q(c58322qx), z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03() {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2J9.A03():boolean");
    }

    public final boolean A04() {
        C58322qx c58322qx = this.A01.A1R;
        return c58322qx.A01 != null && c58322qx.A00.get(c58322qx.A01) == this;
    }
}
