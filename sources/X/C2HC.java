package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.2HC */
/* loaded from: classes2.dex */
public abstract class C2HC {
    public static final boolean A00;

    static {
        A00 = Build.VERSION.SDK_INT >= 22;
    }

    public static Bundle A03(Activity activity, View view) {
        if (view == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        A07(activity.getWindow().getDecorView(), arrayList);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Bundle bundle = new Bundle();
        bundle.putInt("x", iArr[0]);
        bundle.putInt("y", iArr[1]);
        bundle.putInt("width", view.getWidth());
        bundle.putInt("height", view.getHeight());
        bundle.putStringArrayList("visible_shared_elements", arrayList);
        return bundle;
    }

    public static Bundle A04(Activity activity, View view, String str) {
        C08950cN c08950cN;
        if (A00) {
            if (Build.VERSION.SDK_INT >= 21) {
                c08950cN = new C28641Sz(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
            } else {
                c08950cN = new C08950cN();
            }
            return c08950cN.A01();
        }
        return null;
    }

    public static View A05(View view, String str) {
        if (str.equals(C0AT.A0G(view))) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View A05 = A05(viewGroup.getChildAt(i), str);
                if (A05 != null) {
                    return A05;
                }
            }
            return null;
        }
        return null;
    }

    public static void A06(Context context, C1M7 c1m7, Intent intent, View view, String str) {
        ActivityC02320As activityC02320As = (ActivityC02320As) C02180Ae.A0G(context, ActivityC02320As.class);
        if (A00 && activityC02320As != null) {
            C2HB.A02(activityC02320As, c1m7, intent, view, str);
            return;
        }
        context.startActivity(intent);
        if (activityC02320As != null) {
            activityC02320As.overridePendingTransition(0, 0);
        }
    }

    public static void A07(View view, Collection collection) {
        if (!TextUtils.isEmpty(C0AT.A0G(view))) {
            collection.add(C0AT.A0G(view));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                A07(viewGroup.getChildAt(i), collection);
            }
        }
    }

    public void A08() {
        MediaViewBaseFragment mediaViewBaseFragment = ((C3IU) this).A06;
        if (mediaViewBaseFragment.A0z() != null) {
            mediaViewBaseFragment.A0A().overridePendingTransition(0, 0);
        }
    }

    public void A09(Bundle bundle) {
        final C3IU c3iu = (C3IU) this;
        MediaViewBaseFragment mediaViewBaseFragment = c3iu.A06;
        if (mediaViewBaseFragment.A0z() == null) {
            mediaViewBaseFragment.A13();
            return;
        }
        C68763Lu c68763Lu = mediaViewBaseFragment.A09;
        Object A11 = mediaViewBaseFragment.A11(c68763Lu.getCurrentItem());
        if (mediaViewBaseFragment.A01().getConfiguration().orientation != c3iu.A03 || A11 == null || !A11.equals(mediaViewBaseFragment.A10())) {
            c68763Lu.setPivotX(c68763Lu.getWidth() / 2);
            c68763Lu.setPivotY(c68763Lu.getHeight() / 2);
            c3iu.A02 = 0;
            c3iu.A04 = 0;
        }
        c68763Lu.animate().setDuration(240L).scaleX(c3iu.A01).scaleY(c3iu.A00).translationX(c3iu.A02).translationY(c3iu.A04).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: X.31C
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                c3iu.A06.A13();
            }
        });
        ObjectAnimator ofInt = ObjectAnimator.ofInt(c3iu.A05, "alpha", 255, 0);
        ofInt.setDuration(240L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.start();
    }

    public void A0A(final InterfaceC48642Gc interfaceC48642Gc, Bundle bundle) {
        final C3IU c3iu = (C3IU) this;
        MediaViewBaseFragment mediaViewBaseFragment = c3iu.A06;
        final C68763Lu c68763Lu = mediaViewBaseFragment.A09;
        final int i = bundle.getInt("x", 0);
        final int i2 = bundle.getInt("y", 0);
        final int i3 = bundle.getInt("width", 0);
        final int i4 = bundle.getInt("height", 0);
        C0U1 A0c = ((ActivityC02320As) mediaViewBaseFragment.A0A()).A0c();
        if (A0c != null) {
            A0c.A05();
            mediaViewBaseFragment.A0G = false;
            View findViewById = mediaViewBaseFragment.A05().findViewById(R.id.background);
            ColorDrawable colorDrawable = new ColorDrawable(-16777216);
            c3iu.A05 = colorDrawable;
            findViewById.setBackground(colorDrawable);
            c68763Lu.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.31B
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    View view = c68763Lu;
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    final C3IU c3iu2 = c3iu;
                    c3iu2.A02 = i - iArr[0];
                    c3iu2.A04 = i2 - iArr[1];
                    float f = i3;
                    c3iu2.A01 = f / view.getWidth();
                    float f2 = i4;
                    float height = f2 / view.getHeight();
                    c3iu2.A00 = height;
                    float f3 = c3iu2.A01;
                    if (f3 < height) {
                        c3iu2.A01 = height;
                        c3iu2.A02 = (int) (c3iu2.A02 - (((view.getWidth() * c3iu2.A01) - f) / 2.0f));
                    } else {
                        c3iu2.A00 = f3;
                        c3iu2.A04 = (int) (c3iu2.A04 - (((view.getHeight() * c3iu2.A00) - f2) / 2.0f));
                    }
                    final InterfaceC48642Gc interfaceC48642Gc2 = interfaceC48642Gc;
                    MediaViewBaseFragment mediaViewBaseFragment2 = c3iu2.A06;
                    c3iu2.A03 = mediaViewBaseFragment2.A01().getConfiguration().orientation;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(c3iu2.A05, "alpha", 0, 255);
                    ofInt.setDuration(220L);
                    ofInt.setInterpolator(new AccelerateInterpolator());
                    ofInt.start();
                    C68763Lu c68763Lu2 = mediaViewBaseFragment2.A09;
                    c68763Lu2.setPivotX(0.0f);
                    c68763Lu2.setPivotY(0.0f);
                    c68763Lu2.setScaleX(c3iu2.A01);
                    c68763Lu2.setScaleY(c3iu2.A00);
                    c68763Lu2.setTranslationX(c3iu2.A02);
                    c68763Lu2.setTranslationY(c3iu2.A04);
                    View findViewWithTag = mediaViewBaseFragment2.A09.findViewWithTag(mediaViewBaseFragment2.A0z());
                    if (findViewWithTag != null) {
                        findViewWithTag.setAlpha(0.0f);
                        findViewWithTag.animate().setDuration(110L).alpha(1.0f).setInterpolator(new DecelerateInterpolator(2.0f));
                    }
                    c68763Lu2.animate().setDuration(220L).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setListener(new AnimatorListenerAdapter() { // from class: X.31D
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            MediaViewBaseFragment mediaViewBaseFragment3 = c3iu2.A06;
                            if (mediaViewBaseFragment3.A09() == null) {
                                return;
                            }
                            mediaViewBaseFragment3.A1A(true, true);
                            InterfaceC48642Gc interfaceC48642Gc3 = interfaceC48642Gc2;
                            if (interfaceC48642Gc3 != null) {
                                interfaceC48642Gc3.APt(true);
                            }
                        }
                    });
                    return true;
                }
            });
            return;
        }
        throw null;
    }
}
