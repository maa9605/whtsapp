package com.whatsapp.collections.observablelistview;

import X.C2SH;
import X.C54172iE;
import X.C54192iG;
import X.C54202iH;
import X.EnumC54332iZ;
import X.InterfaceC05820Qj;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import com.whatsapp.HomeActivity;
import com.whatsapp.collections.observablelistview.ObservableListView;

/* loaded from: classes2.dex */
public class ObservableListView extends C2SH {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public SparseIntArray A05;
    public MotionEvent A06;
    public ViewGroup A07;
    public AbsListView.OnScrollListener A08;
    public InterfaceC05820Qj A09;
    public C54172iE A0A;
    public EnumC54332iZ A0B;
    public C54192iG A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final AbsListView.OnScrollListener A0G;

    public ObservableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = -1;
        this.A0G = new AbsListView.OnScrollListener() { // from class: X.2iC
            {
                ObservableListView.this = this;
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                int height;
                int height2;
                ObservableListView observableListView = ObservableListView.this;
                AbsListView.OnScrollListener onScrollListener = observableListView.A08;
                if (onScrollListener != null) {
                    onScrollListener.onScroll(absListView, i, i2, i3);
                }
                if (observableListView.A09 == null || observableListView.getChildCount() <= 0) {
                    return;
                }
                int firstVisiblePosition = observableListView.getFirstVisiblePosition();
                int firstVisiblePosition2 = observableListView.getFirstVisiblePosition();
                int i4 = 0;
                while (firstVisiblePosition2 <= observableListView.getLastVisiblePosition()) {
                    if (observableListView.A05.indexOfKey(firstVisiblePosition2) < 0 || observableListView.getChildAt(i4).getHeight() != observableListView.A05.get(firstVisiblePosition2)) {
                        observableListView.A05.put(firstVisiblePosition2, observableListView.getChildAt(i4).getHeight());
                    }
                    firstVisiblePosition2++;
                    i4++;
                }
                View childAt = observableListView.getChildAt(0);
                if (childAt != null) {
                    int i5 = observableListView.A01;
                    if (i5 < firstVisiblePosition) {
                        int i6 = 0;
                        if (firstVisiblePosition - i5 != 1) {
                            for (int i7 = firstVisiblePosition - 1; i7 > observableListView.A01; i7--) {
                                if (observableListView.A05.indexOfKey(i7) > 0) {
                                    height2 = observableListView.A05.get(i7);
                                } else {
                                    height2 = childAt.getHeight();
                                }
                                i6 += height2;
                            }
                        }
                        observableListView.A03 = observableListView.A00 + i6 + observableListView.A03;
                        observableListView.A00 = childAt.getHeight();
                    } else if (firstVisiblePosition >= i5) {
                        if (firstVisiblePosition == 0) {
                            observableListView.A00 = childAt.getHeight();
                        }
                    } else {
                        int i8 = 0;
                        if (i5 - firstVisiblePosition != 1) {
                            for (int i9 = i5 - 1; i9 > firstVisiblePosition; i9--) {
                                if (observableListView.A05.indexOfKey(i9) > 0) {
                                    height = observableListView.A05.get(i9);
                                } else {
                                    height = childAt.getHeight();
                                }
                                i8 += height;
                            }
                        }
                        observableListView.A03 -= childAt.getHeight() + i8;
                        observableListView.A00 = childAt.getHeight();
                    }
                    if (observableListView.A00 < 0) {
                        observableListView.A00 = 0;
                    }
                    int top = observableListView.A03 - childAt.getTop();
                    observableListView.A04 = top;
                    observableListView.A01 = firstVisiblePosition;
                    InterfaceC05820Qj interfaceC05820Qj = observableListView.A09;
                    boolean z = observableListView.A0E;
                    boolean z2 = observableListView.A0D;
                    HomeActivity homeActivity = (HomeActivity) interfaceC05820Qj;
                    if (observableListView == homeActivity.A1X()) {
                        if (homeActivity.A1s()) {
                            View currentFocus = homeActivity.getCurrentFocus();
                            InputMethodManager A0I = homeActivity.A0l.A0I();
                            if (!z && z2) {
                                if (currentFocus != null && A0I != null) {
                                    A0I.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
                                }
                                if (homeActivity.A1r() && homeActivity.A0N().A0Q.A01("search_fragment") != null) {
                                    homeActivity.A1m(true);
                                }
                            }
                        } else {
                            int height3 = homeActivity.A0I.getHeight();
                            boolean z3 = homeActivity.A02 < top;
                            homeActivity.A02 = top;
                            if (z || homeActivity.A1l != z3) {
                                homeActivity.A1l = z3;
                                homeActivity.A00 = homeActivity.A01 + top;
                                homeActivity.A09.animate().cancel();
                                homeActivity.A09.setTranslationY(homeActivity.A01);
                            }
                            int max = Math.max(-height3, Math.min(-(top - homeActivity.A00), 0));
                            if (max != homeActivity.A01) {
                                homeActivity.A01 = max;
                                homeActivity.A09.animate().cancel();
                                homeActivity.A09.setTranslationY(homeActivity.A01);
                            }
                        }
                    }
                    if (observableListView.A0E) {
                        observableListView.A0E = false;
                    }
                    int i10 = observableListView.A02;
                    int i11 = observableListView.A04;
                    if (i10 < i11) {
                        observableListView.A0B = EnumC54332iZ.UP;
                    } else if (i11 < i10) {
                        observableListView.A0B = EnumC54332iZ.DOWN;
                    } else {
                        observableListView.A0B = EnumC54332iZ.STOP;
                    }
                    observableListView.A02 = i11;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:41:0x0033, code lost:
                if (r2.A04 < r4.A0I.getHeight()) goto L21;
             */
            @Override // android.widget.AbsListView.OnScrollListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onScrollStateChanged(android.widget.AbsListView r7, int r8) {
                /*
                    r6 = this;
                    com.whatsapp.collections.observablelistview.ObservableListView r1 = com.whatsapp.collections.observablelistview.ObservableListView.this
                    android.widget.AbsListView$OnScrollListener r0 = r1.A08
                    if (r0 == 0) goto L9
                    r0.onScrollStateChanged(r7, r8)
                L9:
                    X.0Qj r4 = r1.A09
                    if (r4 == 0) goto L38
                    if (r8 != 0) goto L38
                    com.whatsapp.HomeActivity r4 = (com.whatsapp.HomeActivity) r4
                    com.whatsapp.collections.observablelistview.ObservableListView r0 = r4.A1X()
                    if (r1 != r0) goto L38
                    int r0 = r4.A01
                    int r1 = -r0
                    androidx.appcompat.widget.Toolbar r0 = r4.A0I
                    int r0 = r0.getHeight()
                    int r0 = r0 >> 1
                    r5 = 0
                    if (r1 <= r0) goto L35
                    com.whatsapp.collections.observablelistview.ObservableListView r2 = r4.A1X()
                    if (r2 == 0) goto L39
                    androidx.appcompat.widget.Toolbar r0 = r4.A0I
                    int r1 = r0.getHeight()
                    int r0 = r2.A04
                    if (r0 >= r1) goto L39
                L35:
                    r4.A1a()
                L38:
                    return
                L39:
                    androidx.appcompat.widget.Toolbar r0 = r4.A0I
                    int r1 = r0.getHeight()
                    android.view.View r0 = r4.A09
                    float r0 = r0.getTranslationY()
                    int r3 = -r1
                    float r1 = (float) r3
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 == 0) goto L69
                    android.view.View r0 = r4.A09
                    android.view.ViewPropertyAnimator r0 = r0.animate()
                    r0.cancel()
                    android.view.View r0 = r4.A09
                    android.view.ViewPropertyAnimator r0 = r0.animate()
                    android.view.ViewPropertyAnimator r2 = r0.translationY(r1)
                    r0 = 250(0xfa, double:1.235E-321)
                    android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
                    r0.start()
                    r4.A01 = r3
                L69:
                    r4.A1n(r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C54152iC.onScrollStateChanged(android.widget.AbsListView, int):void");
            }
        };
        this.A05 = new SparseIntArray();
        this.A0A = new C54172iE();
        this.A0C = new C54192iG();
        super.setOnScrollListener(this.A0G);
    }

    @Override // android.widget.AbsListView, android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.A0C.A00();
    }

    public int getCurrentScrollY() {
        return this.A04;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A09 != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.A0D = true;
                this.A0E = true;
                if (this.A09 == null) {
                    throw null;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.A0D = false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A0A.A01();
        super.onLayout(z, i, i2, i3, i4);
        this.A0A.A00();
    }

    @Override // android.widget.AbsListView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        C54202iH c54202iH = (C54202iH) parcelable;
        this.A01 = c54202iH.A01;
        this.A00 = c54202iH.A00;
        this.A03 = c54202iH.A03;
        this.A02 = c54202iH.A02;
        this.A04 = c54202iH.A04;
        this.A05 = c54202iH.A05;
        super.onRestoreInstanceState(c54202iH.getSuperState());
    }

    @Override // android.widget.AbsListView, android.view.View
    public Parcelable onSaveInstanceState() {
        C54202iH c54202iH = new C54202iH(super.onSaveInstanceState());
        c54202iH.A01 = this.A01;
        c54202iH.A00 = this.A00;
        c54202iH.A03 = this.A03;
        c54202iH.A02 = this.A02;
        c54202iH.A04 = this.A04;
        c54202iH.A05 = this.A05;
        return c54202iH;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0010, code lost:
        if (r1 != 3) goto L37;
     */
    @Override // android.widget.AbsListView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            X.0Qj r0 = r8.A09
            if (r0 == 0) goto L12
            int r1 = r9.getActionMasked()
            r6 = 1
            r5 = 0
            if (r1 == r6) goto L3c
            r0 = 2
            if (r1 == r0) goto L17
            r0 = 3
            if (r1 == r0) goto L3c
        L12:
            boolean r0 = super.onTouchEvent(r9)
            return r0
        L17:
            android.view.MotionEvent r0 = r8.A06
            if (r0 != 0) goto L1d
            r8.A06 = r9
        L1d:
            float r1 = r9.getY()
            android.view.MotionEvent r0 = r8.A06
            float r0 = r0.getY()
            float r1 = r1 - r0
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r9)
            r8.A06 = r0
            int r0 = r8.A04
            float r0 = (float) r0
            float r0 = r0 - r1
            r7 = 0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L12
            boolean r0 = r8.A0F
            if (r0 == 0) goto L46
            return r5
        L3c:
            r8.A0F = r5
            r8.A0D = r5
            X.0Qj r0 = r8.A09
            if (r0 != 0) goto L12
            r0 = 0
            throw r0
        L46:
            android.view.ViewGroup r4 = r8.A07
            if (r4 != 0) goto L50
            android.view.ViewParent r4 = r8.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
        L50:
            r3 = 0
            r0 = r8
        L52:
            if (r0 == r4) goto L73
            int r2 = r0.getLeft()
            int r1 = r0.getScrollX()
            int r2 = r2 - r1
            float r1 = (float) r2
            float r7 = r7 + r1
            int r2 = r0.getTop()
            int r1 = r0.getScrollY()
            int r2 = r2 - r1
            float r1 = (float) r2
            float r3 = r3 + r1
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L73
            goto L52
        L73:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtainNoHistory(r9)
            r1.offsetLocation(r7, r3)
            boolean r0 = r4.onInterceptTouchEvent(r1)
            if (r0 == 0) goto L8e
            r8.A0F = r6
            r1.setAction(r5)
            java.lang.RunnableEBaseShape0S0200000_I0_0 r0 = new java.lang.RunnableEBaseShape0S0200000_I0_0
            r0.<init>(r4, r1)
            r8.post(r0)
            return r5
        L8e:
            boolean r0 = super.onTouchEvent(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.collections.observablelistview.ObservableListView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.A08 = onScrollListener;
    }

    public void setScrollViewCallbacks(InterfaceC05820Qj interfaceC05820Qj) {
        this.A09 = interfaceC05820Qj;
    }

    public void setTouchInterceptionViewGroup(ViewGroup viewGroup) {
        this.A07 = viewGroup;
    }
}
