package X;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.0cw */
/* loaded from: classes.dex */
public abstract class AbstractC09260cw {
    public static final Handler A08;
    public static final boolean A09;
    public static final int[] A0A;
    public int A00;
    public List A01;
    public final Context A02;
    public final ViewGroup A03;
    public final AccessibilityManager A04;
    public final C09290cz A05;
    public final C1BE A06;
    public final C1BH A07 = new C1BH() { // from class: X.1ed
        {
            AbstractC09260cw.this = this;
        }

        @Override // X.C1BH
        public void A7K(int i) {
            Handler handler = AbstractC09260cw.A08;
            handler.sendMessage(handler.obtainMessage(1, i, 0, AbstractC09260cw.this));
        }

        @Override // X.C1BH
        public void AUa() {
            Handler handler = AbstractC09260cw.A08;
            handler.sendMessage(handler.obtainMessage(0, AbstractC09260cw.this));
        }
    };

    static {
        A09 = Build.VERSION.SDK_INT <= 19;
        A0A = new int[]{R.attr.snackbarStyle};
        A08 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.1B7
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i = message.what;
                if (i != 0) {
                    if (i != 1) {
                        return false;
                    }
                    final AbstractC09260cw abstractC09260cw = (AbstractC09260cw) message.obj;
                    final int i2 = message.arg1;
                    boolean z = true;
                    List<AccessibilityServiceInfo> enabledAccessibilityServiceList = abstractC09260cw.A04.getEnabledAccessibilityServiceList(1);
                    if ((enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) ? false : false) {
                        C09290cz c09290cz = abstractC09260cw.A05;
                        if (c09290cz.getVisibility() == 0) {
                            ValueAnimator valueAnimator = new ValueAnimator();
                            int[] iArr = new int[2];
                            iArr[0] = 0;
                            int height = c09290cz.getHeight();
                            ViewGroup.LayoutParams layoutParams = c09290cz.getLayoutParams();
                            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            }
                            iArr[1] = height;
                            valueAnimator.setIntValues(iArr);
                            valueAnimator.setInterpolator(C08580bj.A02);
                            valueAnimator.setDuration(250L);
                            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: X.1B5
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(Animator animator) {
                                    abstractC09260cw.A03(i2);
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationStart(Animator animator) {
                                    SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) abstractC09260cw.A06;
                                    snackbarContentLayout.A03.setAlpha(1.0f);
                                    long j = 180;
                                    long j2 = 0;
                                    snackbarContentLayout.A03.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
                                    if (snackbarContentLayout.A02.getVisibility() == 0) {
                                        snackbarContentLayout.A02.setAlpha(1.0f);
                                        snackbarContentLayout.A02.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
                                    }
                                }
                            });
                            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.1B6
                                public int A00 = 0;

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    int intValue = ((Number) valueAnimator2.getAnimatedValue()).intValue();
                                    if (AbstractC09260cw.A09) {
                                        C0AT.A0T(abstractC09260cw.A05, intValue - this.A00);
                                    } else {
                                        abstractC09260cw.A05.setTranslationY(intValue);
                                    }
                                    this.A00 = intValue;
                                }
                            });
                            valueAnimator.start();
                            return true;
                        }
                    }
                    abstractC09260cw.A03(i2);
                    return true;
                }
                AbstractC09260cw abstractC09260cw2 = (AbstractC09260cw) message.obj;
                if (abstractC09260cw2.A05.getParent() == null) {
                    C09290cz c09290cz2 = abstractC09260cw2.A05;
                    ViewGroup.LayoutParams layoutParams2 = c09290cz2.getLayoutParams();
                    if (layoutParams2 instanceof C08930cL) {
                        C08930cL c08930cL = (C08930cL) layoutParams2;
                        BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                        C1BB c1bb = baseTransientBottomBar$Behavior.A00;
                        if (c1bb != null) {
                            c1bb.A00 = abstractC09260cw2.A07;
                            baseTransientBottomBar$Behavior.A05 = new C32751ee(abstractC09260cw2);
                            c08930cL.A00(baseTransientBottomBar$Behavior);
                            c08930cL.A03 = 80;
                        } else {
                            throw null;
                        }
                    }
                    abstractC09260cw2.A03.addView(c09290cz2);
                }
                C09290cz c09290cz3 = abstractC09260cw2.A05;
                c09290cz3.A00 = new C32761ef(abstractC09260cw2);
                if (C0AT.A0h(c09290cz3)) {
                    boolean z2 = true;
                    List<AccessibilityServiceInfo> enabledAccessibilityServiceList2 = abstractC09260cw2.A04.getEnabledAccessibilityServiceList(1);
                    if ((enabledAccessibilityServiceList2 == null || !enabledAccessibilityServiceList2.isEmpty()) ? false : false) {
                        abstractC09260cw2.A00();
                        return true;
                    }
                    abstractC09260cw2.A01();
                    return true;
                }
                c09290cz3.A01 = new C32771eg(abstractC09260cw2);
                return true;
            }
        });
    }

    public AbstractC09260cw(ViewGroup viewGroup, View view, C1BE c1be) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (c1be != null) {
            this.A03 = viewGroup;
            this.A06 = c1be;
            Context context = viewGroup.getContext();
            this.A02 = context;
            C08560bh.A03(context, C08560bh.A00, "Theme.AppCompat");
            LayoutInflater from = LayoutInflater.from(this.A02);
            TypedArray obtainStyledAttributes = this.A02.obtainStyledAttributes(A0A);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            C09290cz c09290cz = (C09290cz) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, this.A03, false);
            this.A05 = c09290cz;
            c09290cz.addView(view);
            C0AT.A0U(this.A05, 1);
            C0AT.A0V(this.A05, 1);
            this.A05.setFitsSystemWindows(true);
            C0AT.A0d(this.A05, new C0V5() { // from class: X.1eb
                @Override // X.C0V5
                public C07110Wv AHK(View view2, C07110Wv c07110Wv) {
                    view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), c07110Wv.A01());
                    return c07110Wv;
                }
            });
            C0AT.A0c(this.A05, new C0AS() { // from class: X.1ec
                {
                    AbstractC09260cw.this = this;
                }

                @Override // X.C0AS
                public void A04(View view2, C08420bS c08420bS) {
                    View.AccessibilityDelegate accessibilityDelegate = this.A01;
                    AccessibilityNodeInfo accessibilityNodeInfo = c08420bS.A02;
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfo);
                    accessibilityNodeInfo.addAction(1048576);
                    c08420bS.A0B(true);
                }

                @Override // X.C0AS
                public boolean A05(View view2, int i, Bundle bundle) {
                    if (i == 1048576) {
                        AbstractC09260cw.this.A02(3);
                        return true;
                    }
                    return super.A05(view2, i, bundle);
                }
            });
            this.A04 = (AccessibilityManager) this.A02.getSystemService("accessibility");
            return;
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
    }

    public void A00() {
        C09290cz c09290cz = this.A05;
        int height = c09290cz.getHeight();
        ViewGroup.LayoutParams layoutParams = c09290cz.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        if (A09) {
            C0AT.A0T(c09290cz, height);
        } else {
            c09290cz.setTranslationY(height);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(height, 0);
        valueAnimator.setInterpolator(C08580bj.A02);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: X.1B9
            {
                AbstractC09260cw.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AbstractC09260cw.this.A01();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) AbstractC09260cw.this.A06;
                snackbarContentLayout.A03.setAlpha(0.0f);
                long j = 180;
                long j2 = 70;
                snackbarContentLayout.A03.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
                if (snackbarContentLayout.A02.getVisibility() == 0) {
                    snackbarContentLayout.A02.setAlpha(0.0f);
                    snackbarContentLayout.A02.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
                }
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(height) { // from class: X.1BA
            public int A00;
            public final /* synthetic */ int A01;

            {
                AbstractC09260cw.this = this;
                this.A01 = height;
                this.A00 = height;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int intValue = ((Number) valueAnimator2.getAnimatedValue()).intValue();
                if (AbstractC09260cw.A09) {
                    C0AT.A0T(AbstractC09260cw.this.A05, intValue - this.A00);
                } else {
                    AbstractC09260cw.this.A05.setTranslationY(intValue);
                }
                this.A00 = intValue;
            }
        });
        valueAnimator.start();
    }

    public void A01() {
        C1BJ A00 = C1BJ.A00();
        C1BH c1bh = this.A07;
        synchronized (A00.A03) {
            if (A00.A05(c1bh)) {
                A00.A04(A00.A00);
            }
        }
        List list = this.A01;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.A01.get(size);
            }
        }
    }

    public void A02(int i) {
        C1BJ A00 = C1BJ.A00();
        C1BH c1bh = this.A07;
        synchronized (A00.A03) {
            if (A00.A05(c1bh)) {
                A00.A06(A00.A00, i);
            } else {
                C1BI c1bi = A00.A01;
                boolean z = false;
                if (c1bi != null && c1bh != null && c1bi.A02.get() == c1bh) {
                    z = true;
                }
                if (z) {
                    A00.A06(c1bi, i);
                }
            }
        }
    }

    public void A03(int i) {
        C1BJ A00 = C1BJ.A00();
        C1BH c1bh = this.A07;
        synchronized (A00.A03) {
            if (A00.A05(c1bh)) {
                A00.A00 = null;
                if (A00.A01 != null) {
                    A00.A01();
                }
            }
        }
        List list = this.A01;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((AbstractC09280cy) this.A01.get(size)).A00(this, i);
            }
        }
        C09290cz c09290cz = this.A05;
        ViewParent parent = c09290cz.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(c09290cz);
        }
    }
}
