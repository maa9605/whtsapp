package com.whatsapp.gallerypicker;

import X.AbstractC04890Mh;
import X.AbstractC15100o5;
import X.AbstractC15200oF;
import X.C3BJ;
import X.C66303An;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.gallerypicker.RecyclerFastScroller;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class RecyclerFastScroller extends C3BJ {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public CoordinatorLayout A04;
    public AbstractC04890Mh A05;
    public RecyclerView A06;
    public AppBarLayout A07;
    public C66303An A08;
    public boolean A09;
    public boolean A0A;
    public final AbstractC15100o5 A0B;
    public final Runnable A0C;

    public RecyclerFastScroller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A0B = new AbstractC15100o5() { // from class: X.3BR
            @Override // X.AbstractC15100o5
            public void A00() {
                RecyclerFastScroller.this.requestLayout();
            }
        };
        this.A0C = new RunnableEBaseShape8S0100000_I1_0(this, 26);
        this.A01 = 1500;
        this.A09 = true;
    }

    public void A00() {
        RecyclerView recyclerView = this.A06;
        if (recyclerView == null || !this.A09) {
            return;
        }
        Runnable runnable = this.A0C;
        recyclerView.removeCallbacks(runnable);
        this.A06.postDelayed(runnable, this.A01);
    }

    public final void A01() {
        requestLayout();
        if (this.A03.getVisibility() != 0) {
            this.A03.setVisibility(0);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, this.A0A ? -1.0f : 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(200L);
            this.A03.startAnimation(translateAnimation);
        }
        A00();
    }

    public int getHideDelay() {
        return this.A01;
    }

    public static int getVisibleHeight(RecyclerFastScroller recyclerFastScroller) {
        if (recyclerFastScroller.A04 != null && recyclerFastScroller.A07 != null) {
            return Math.min(recyclerFastScroller.getHeight(), (recyclerFastScroller.A04.getHeight() - recyclerFastScroller.A07.getHeight()) + recyclerFastScroller.A00);
        }
        return recyclerFastScroller.getHeight();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RecyclerView recyclerView = this.A06;
        if (recyclerView == null) {
            return;
        }
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset() + this.A00;
        int computeVerticalScrollRange = this.A06.computeVerticalScrollRange();
        AppBarLayout appBarLayout = this.A07;
        int paddingBottom = this.A06.getPaddingBottom() + computeVerticalScrollRange + (appBarLayout == null ? 0 : appBarLayout.getTotalScrollRange());
        int visibleHeight = getVisibleHeight(this);
        float f = computeVerticalScrollOffset / (paddingBottom - visibleHeight);
        View view = this.A03;
        if (view != null) {
            float height = f * (visibleHeight - view.getHeight());
            if (this.A0A) {
                View view2 = this.A03;
                int i5 = (int) height;
                view2.layout(0, i5, view2.getWidth(), this.A03.getHeight() + i5);
            } else {
                int i6 = (int) height;
                this.A03.layout(getRight() - this.A03.getWidth(), i6, getRight(), this.A03.getHeight() + i6);
            }
            View view3 = this.A02;
            if (view3 != null) {
                if (this.A0A) {
                    view3.layout(this.A03.getRight(), ((this.A03.getBottom() + this.A03.getTop()) - this.A02.getHeight()) >> 1, this.A02.getWidth() + this.A03.getRight(), (this.A02.getHeight() + (this.A03.getBottom() + this.A03.getTop())) >> 1);
                    return;
                }
                int left = this.A03.getLeft() - this.A02.getWidth();
                int top = this.A03.getTop();
                view3.layout(left, ((this.A03.getBottom() + top) - this.A02.getHeight()) >> 1, this.A03.getLeft(), (this.A02.getHeight() + (this.A03.getBottom() + this.A03.getTop())) >> 1);
            }
        }
    }

    public void setAdapter(AbstractC04890Mh abstractC04890Mh) {
        AbstractC04890Mh abstractC04890Mh2 = this.A05;
        if (abstractC04890Mh2 == abstractC04890Mh) {
            return;
        }
        if (abstractC04890Mh2 != null) {
            abstractC04890Mh2.A01.unregisterObserver(this.A0B);
        }
        if (abstractC04890Mh != null) {
            abstractC04890Mh.A01.registerObserver(this.A0B);
        }
        this.A05 = abstractC04890Mh;
    }

    public void setHideDelay(int i) {
        this.A01 = i;
    }

    public void setHidingEnabled(boolean z) {
        this.A09 = z;
        if (z) {
            A00();
        }
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.A06 = recyclerView;
        recyclerView.A0m(new AbstractC15200oF() { // from class: X.3BS
            @Override // X.AbstractC15200oF
            public void A01(RecyclerView recyclerView2, int i, int i2) {
                if (i2 != 0) {
                    RecyclerFastScroller recyclerFastScroller = RecyclerFastScroller.this;
                    recyclerFastScroller.A01();
                    if (recyclerFastScroller.A08 == null || recyclerFastScroller.A02.getVisibility() != 0) {
                        return;
                    }
                    recyclerFastScroller.A08.A00();
                }
            }
        });
        AbstractC04890Mh abstractC04890Mh = recyclerView.A0N;
        if (abstractC04890Mh != null) {
            setAdapter(abstractC04890Mh);
        }
    }

    public void setRtl(boolean z) {
        this.A0A = z;
    }

    public void setThumbView(View view) {
        View view2 = this.A03;
        if (view2 != null) {
            removeView(view2);
        }
        this.A03 = view;
        view.setVisibility(4);
        this.A03.setOnTouchListener(new View.OnTouchListener() { // from class: X.2vl
            public float A00;
            public float A01;
            public int A02;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view3, MotionEvent motionEvent) {
                AppBarLayout appBarLayout;
                int i;
                AppBarLayout appBarLayout2;
                if (motionEvent.getActionMasked() == 0) {
                    RecyclerFastScroller recyclerFastScroller = RecyclerFastScroller.this;
                    recyclerFastScroller.A03.setPressed(true);
                    C66303An c66303An = recyclerFastScroller.A08;
                    if (c66303An != null) {
                        c66303An.A00();
                    }
                    View view4 = recyclerFastScroller.A02;
                    if (view4 != null && view4.getVisibility() != 0) {
                        recyclerFastScroller.A02.setVisibility(0);
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                        alphaAnimation.setDuration(100L);
                        recyclerFastScroller.A02.startAnimation(alphaAnimation);
                    }
                    recyclerFastScroller.A06.A0S();
                    recyclerFastScroller.A06.startNestedScroll(2);
                    this.A00 = RecyclerFastScroller.getVisibleHeight(recyclerFastScroller);
                    this.A01 = motionEvent.getY() + recyclerFastScroller.A03.getTop();
                    this.A02 = recyclerFastScroller.A00;
                } else if (motionEvent.getActionMasked() == 2) {
                    RecyclerFastScroller recyclerFastScroller2 = RecyclerFastScroller.this;
                    View view5 = recyclerFastScroller2.A02;
                    if (view5 != null) {
                        view5.setVisibility(0);
                    }
                    int visibleHeight = RecyclerFastScroller.getVisibleHeight(recyclerFastScroller2);
                    float f = this.A00;
                    float f2 = visibleHeight;
                    float y = (f - f2) + motionEvent.getY() + recyclerFastScroller2.A03.getTop();
                    float f3 = (y - this.A01) / f;
                    int computeVerticalScrollRange = recyclerFastScroller2.A06.computeVerticalScrollRange();
                    int totalScrollRange = (int) (f3 * (computeVerticalScrollRange + (recyclerFastScroller2.A07 == null ? 0 : appBarLayout.getTotalScrollRange())));
                    if (recyclerFastScroller2.A04 != null && (appBarLayout2 = recyclerFastScroller2.A07) != null) {
                        appBarLayout2.getLayoutParams();
                    }
                    if (recyclerFastScroller2.A06 != null && recyclerFastScroller2.A03 != null) {
                        int abs = Math.abs(totalScrollRange);
                        if (abs > RecyclerFastScroller.getVisibleHeight(recyclerFastScroller2)) {
                            int min = (int) ((Math.min(Math.max(0.0f, y), f2) * recyclerFastScroller2.A06.A0N.A0C()) / f2);
                            recyclerFastScroller2.A06.A0Y(min);
                            if (min != 0) {
                                i = abs % visibleHeight;
                            } else {
                                i = 0;
                            }
                        } else {
                            i = (totalScrollRange + this.A02) - recyclerFastScroller2.A00;
                        }
                        try {
                            recyclerFastScroller2.A06.scrollBy(0, i);
                        } catch (Throwable th) {
                            Log.e(th);
                        }
                    }
                    this.A01 = y;
                    this.A02 = recyclerFastScroller2.A00;
                    return true;
                } else if (motionEvent.getActionMasked() == 1) {
                    this.A01 = -1.0f;
                    RecyclerFastScroller recyclerFastScroller3 = RecyclerFastScroller.this;
                    recyclerFastScroller3.A06.stopNestedScroll();
                    recyclerFastScroller3.A03.setPressed(false);
                    recyclerFastScroller3.A00();
                    View view6 = recyclerFastScroller3.A02;
                    if (view6 != null && view6.getVisibility() != 4) {
                        recyclerFastScroller3.A02.setVisibility(4);
                        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimation2.setDuration(300L);
                        recyclerFastScroller3.A02.startAnimation(alphaAnimation2);
                        return true;
                    }
                }
                return true;
            }
        });
        addView(this.A03, -2, -2);
    }
}
