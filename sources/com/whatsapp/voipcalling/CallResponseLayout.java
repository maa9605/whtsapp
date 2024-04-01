package com.whatsapp.voipcalling;

import X.AbstractC13450lH;
import X.AbstractC52012Zm;
import X.C02E;
import X.C0AT;
import X.C13460lI;
import X.InterfaceC74273cz;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import com.whatsapp.voipcalling.CallResponseLayout;

/* loaded from: classes2.dex */
public class CallResponseLayout extends AbstractC52012Zm {
    public View A00;
    public View A01;
    public ViewConfiguration A02;
    public C13460lI A03;
    public C02E A04;
    public InterfaceC74273cz A05;
    public boolean A06;
    public boolean A07;

    public CallResponseLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = new C13460lI(getContext(), this, new AbstractC13450lH() { // from class: X.3to
            public int A00;
            public int A01;

            {
                CallResponseLayout.this = this;
            }

            @Override // X.AbstractC13450lH
            public int A02(View view, int i, int i2) {
                return view.getLeft();
            }

            @Override // X.AbstractC13450lH
            public int A03(View view, int i, int i2) {
                CallResponseLayout callResponseLayout = CallResponseLayout.this;
                int paddingTop = callResponseLayout.getPaddingTop();
                return Math.min(Math.max(i, paddingTop), callResponseLayout.getHeight() - view.getHeight());
            }

            @Override // X.AbstractC13450lH
            public void A05(View view, float f, float f2) {
                InterfaceC74273cz interfaceC74273cz;
                CallResponseLayout callResponseLayout = CallResponseLayout.this;
                AccessibilityManager A0H = callResponseLayout.A04.A0H();
                if (A0H != null && A0H.isTouchExplorationEnabled()) {
                    callResponseLayout.A05.AI7();
                    return;
                }
                if (this.A01 - view.getTop() > callResponseLayout.getHeight() / 3 && (interfaceC74273cz = callResponseLayout.A05) != null) {
                    interfaceC74273cz.AI7();
                    if (!callResponseLayout.A07) {
                        return;
                    }
                }
                callResponseLayout.A03.A0E(this.A00, this.A01);
                if (callResponseLayout.A06) {
                    callResponseLayout.A01.startAnimation(C02180Ae.A0V(callResponseLayout.A01));
                    callResponseLayout.A00.setVisibility(0);
                }
                callResponseLayout.invalidate();
            }

            @Override // X.AbstractC13450lH
            public void A06(View view, int i) {
                this.A00 = view.getLeft();
                this.A01 = view.getTop();
                CallResponseLayout callResponseLayout = CallResponseLayout.this;
                if (callResponseLayout.A06) {
                    callResponseLayout.A01.setAnimation(null);
                    callResponseLayout.A00.setVisibility(8);
                }
            }

            @Override // X.AbstractC13450lH
            public void A07(View view, int i, int i2, int i3, int i4) {
                CallResponseLayout callResponseLayout = CallResponseLayout.this;
                if (!callResponseLayout.A06 && this.A01 - view.getTop() > callResponseLayout.A02.getScaledTouchSlop() && callResponseLayout.A00.getVisibility() == 0) {
                    callResponseLayout.A00.clearAnimation();
                    callResponseLayout.A00.setVisibility(4);
                }
            }

            @Override // X.AbstractC13450lH
            public boolean A08(View view, int i) {
                return view == CallResponseLayout.this.A01;
            }
        });
        this.A02 = ViewConfiguration.get(getContext());
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.A03.A0B()) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3 && actionMasked != 1) {
            return this.A03.A0G(motionEvent);
        }
        this.A03.A02();
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.A03.A08(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        int height;
        super.onVisibilityChanged(view, i);
        if (this.A01 == null || i != 0 || (height = (getHeight() - this.A01.getHeight()) - ((int) this.A01.getY())) == 0) {
            return;
        }
        C0AT.A0T(this.A01, height);
    }

    public void setCallResponseSwipeUpHintView(View view) {
        this.A00 = view;
    }

    public void setCallResponseView(View view) {
        this.A01 = view;
    }

    public void setResponseListener(InterfaceC74273cz interfaceC74273cz) {
        this.A05 = interfaceC74273cz;
    }

    public void setShowSwipeUpHintByDefault(boolean z) {
        this.A06 = z;
    }

    public void setTouchDownAfterDrag(boolean z) {
        this.A07 = z;
    }
}
