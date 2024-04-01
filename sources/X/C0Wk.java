package X;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* renamed from: X.0Wk  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Wk extends FrameLayout {
    public ArrayList A00;
    public ArrayList A01;
    public boolean A02;

    public C0Wk(Context context, AttributeSet attributeSet, AbstractC02800Cx abstractC02800Cx) {
        super(context, attributeSet);
        String str;
        this.A02 = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13530lP.A04);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        C0BA A06 = abstractC02800Cx.A06(id);
        if (classAttribute == null || A06 != null) {
            return;
        }
        if (id <= 0) {
            if (string != null) {
                str = C000200d.A0H(" with tag ", string);
            } else {
                str = "";
            }
            throw new IllegalStateException(C000200d.A0I("FragmentContainerView must have an android:id to add Fragment ", classAttribute, str));
        }
        C0BA A00 = abstractC02800Cx.A08().A00(context.getClassLoader(), classAttribute);
        A00.A0I();
        C02820Cz c02820Cz = new C02820Cz(abstractC02800Cx);
        c02820Cz.A0F = true;
        A00.A0B = this;
        c02820Cz.A09(getId(), A00, string, 1);
        c02820Cz.A08();
    }

    public final void A00(View view) {
        ArrayList arrayList;
        if (view.getAnimation() != null || ((arrayList = this.A01) != null && arrayList.contains(view))) {
            ArrayList arrayList2 = this.A00;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.A00 = arrayList2;
            }
            arrayList2.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof C0BA) && tag != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        StringBuilder sb = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof C0BA) && tag != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        StringBuilder sb = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.A02 && this.A00 != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.A00;
                if (i >= arrayList.size()) {
                    break;
                }
                super.drawChild(canvas, (View) arrayList.get(i), getDrawingTime());
                i++;
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList arrayList;
        if (!this.A02 || (arrayList = this.A00) == null || arrayList.size() <= 0 || !arrayList.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList arrayList = this.A01;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.A00;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.A02 = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            A00(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            A00(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        A00(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        A00(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        A00(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            A00(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            A00(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.A02 = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            ArrayList arrayList = this.A01;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.A01 = arrayList;
            }
            arrayList.add(view);
        }
        super.startViewTransition(view);
    }
}
