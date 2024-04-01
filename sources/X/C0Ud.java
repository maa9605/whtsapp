package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.search.verification.client.R;

/* renamed from: X.0Ud */
/* loaded from: classes.dex */
public abstract class C0Ud extends ViewGroup {
    public int A00;
    public C38311nu A01;
    public ActionMenuView A02;
    public C0TT A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final C1Rz A07;

    public abstract void setContentHeight(int i);

    public C0Ud(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.A07 = new C1Rz(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || (i2 = typedValue.resourceId) == 0) {
            this.A06 = context;
        } else {
            this.A06 = new ContextThemeWrapper(context, i2);
        }
    }

    public static int A00(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        return measuredWidth;
    }

    public C0TT A03(int i, long j) {
        C0TT c0tt = this.A03;
        if (c0tt != null) {
            c0tt.A00();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0TT A0E = C0AT.A0E(this);
            A0E.A02(1.0f);
            A0E.A04(j);
            C1Rz c1Rz = this.A07;
            c1Rz.A02.A03 = A0E;
            c1Rz.A00 = i;
            View view = (View) A0E.A01.get();
            if (view != null) {
                A0E.A05(view, c1Rz);
            }
            return A0E;
        }
        C0TT A0E2 = C0AT.A0E(this);
        A0E2.A02(0.0f);
        A0E2.A04(j);
        C1Rz c1Rz2 = this.A07;
        c1Rz2.A02.A03 = A0E2;
        c1Rz2.A00 = i;
        View view2 = (View) A0E2.A01.get();
        if (view2 != null) {
            A0E2.A05(view2, c1Rz2);
        }
        return A0E2;
    }

    public int getAnimatedVisibility() {
        if (this.A03 != null) {
            return this.A07.A00;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.A00;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0UY.A00, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C38311nu c38311nu = this.A01;
        if (c38311nu != null) {
            Configuration configuration2 = ((AbstractC28381Ro) c38311nu).A02.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = 2;
                if (i2 >= 360) {
                    i = 3;
                }
            }
            c38311nu.A01 = i;
            C06650Uk c06650Uk = ((AbstractC28381Ro) c38311nu).A05;
            if (c06650Uk != null) {
                c06650Uk.A0E(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.A04 = false;
        }
        if (!this.A04) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.A04 = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.A04 = false;
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A05 = false;
        }
        if (!this.A05) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.A05 = true;
                }
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A05 = false;
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0TT c0tt = this.A03;
            if (c0tt != null) {
                c0tt.A00();
            }
            super.setVisibility(i);
        }
    }
}
