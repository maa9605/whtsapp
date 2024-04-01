package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.1YV */
/* loaded from: classes.dex */
public class C1YV extends C08P {
    public Drawable A00;
    public SparseArray A01;
    public InterfaceC20420xV A02;
    public Object A03;
    public boolean A04;
    public boolean A05;
    public int[] A06;
    public C20450xY[] A07;
    public C20450xY[] A08;
    public final C20410xU A09;

    public void A03(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public C1YV(Context context) {
        super(context);
        this.A09 = new C20410xU(this);
        this.A06 = new int[0];
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
        this.A07 = new C20450xY[8];
    }

    public static void A00(C1YV c1yv) {
        int childCount = c1yv.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c1yv.getChildAt(i);
            if (childAt.isLayoutRequested()) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(childAt.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getHeight(), 1073741824));
                childAt.layout(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            }
            if (childAt instanceof C1YV) {
                A00((C1YV) childAt);
            }
        }
    }

    @Override // X.C08P
    public void A01(int i, C20450xY c20450xY) {
        if (c20450xY.A01.A07.A04 == EnumC20560xj.DRAWABLE) {
            Drawable drawable = (Drawable) c20450xY.A02;
            drawable.setVisible(getVisibility() == 0, false);
            drawable.setCallback(this);
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
            invalidate(c20450xY.A01.A04);
        } else {
            View view = (View) c20450xY.A02;
            this.A05 = true;
            if ((view instanceof C1YV) && view.getParent() == this) {
                C0AT.A0I(view);
                view.setVisibility(0);
            } else {
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(generateDefaultLayoutParams());
                }
                if (this.A04) {
                    super.addViewInLayout(view, -1, view.getLayoutParams(), true);
                } else {
                    super.addView(view, -1, view.getLayoutParams());
                }
            }
        }
        C20450xY[] c20450xYArr = this.A07;
        int length = c20450xYArr.length;
        if (i >= length) {
            int i2 = length;
            do {
                i2 <<= 1;
            } while (i >= i2);
            C20450xY[] c20450xYArr2 = new C20450xY[i2];
            System.arraycopy(c20450xYArr, 0, c20450xYArr2, 0, length);
            this.A07 = c20450xYArr2;
            c20450xYArr = c20450xYArr2;
        }
        c20450xYArr[i] = c20450xY;
    }

    @Override // X.C08P
    public void A02(int i, C20450xY c20450xY) {
        EnumC20560xj enumC20560xj = c20450xY.A01.A07.A04;
        EnumC20560xj enumC20560xj2 = EnumC20560xj.DRAWABLE;
        Object obj = c20450xY.A02;
        if (enumC20560xj == enumC20560xj2) {
            Drawable drawable = (Drawable) obj;
            drawable.setCallback(null);
            invalidate(drawable.getBounds());
        } else {
            View view = (View) obj;
            this.A05 = true;
            if (view.isPressed()) {
                view.setPressed(false);
            }
            if (this.A04) {
                super.removeViewInLayout(view);
            } else {
                super.removeView(view);
            }
            this.A05 = true;
        }
        C20450xY[] c20450xYArr = this.A07;
        C20450xY[] c20450xYArr2 = this.A08;
        if (c20450xYArr2 != null && c20450xYArr2[i] != null) {
            c20450xYArr2[i] = null;
        } else {
            c20450xYArr[i] = null;
        }
        if (c20450xYArr2 != null) {
            for (C20450xY c20450xY2 : c20450xYArr2) {
                if (c20450xY2 != null) {
                    return;
                }
            }
            this.A08 = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        C20410xU c20410xU = this.A09;
        c20410xU.A02 = canvas;
        c20410xU.A00 = 0;
        C20450xY[] c20450xYArr = c20410xU.A03.A07;
        c20410xU.A01 = c20450xYArr == null ? 0 : c20450xYArr.length;
        super.dispatchDraw(canvas);
        if (c20410xU.A02 != null && c20410xU.A00 < c20410xU.A01) {
            C20410xU.A00(c20410xU);
        }
        c20410xU.A02 = null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C20450xY[] c20450xYArr = this.A07;
        if (c20450xYArr != null) {
            int length = c20450xYArr.length;
            for (int i = 0; i < length; i++) {
                C20450xY c20450xY = this.A07[i];
                if (c20450xY != null && c20450xY.A01.A07.A04 == EnumC20560xj.DRAWABLE) {
                    Drawable drawable = (Drawable) c20450xY.A02;
                    if (drawable.isStateful()) {
                        drawable.setState(getDrawableState());
                    }
                }
            }
        }
        Drawable drawable2 = this.A00;
        if (drawable2 != null) {
            drawable2.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.A05) {
            int childCount = getChildCount();
            if (this.A06.length < childCount) {
                this.A06 = new int[childCount + 5];
            }
            C20450xY[] c20450xYArr = this.A07;
            if (c20450xYArr != null) {
                int length = c20450xYArr.length;
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    C20450xY c20450xY = this.A07[i4];
                    if (c20450xY != null && c20450xY.A01.A07.A04 == EnumC20560xj.VIEW) {
                        this.A06[i3] = indexOfChild((View) c20450xY.A02);
                        i3++;
                    }
                }
            }
            this.A05 = false;
        }
        C20410xU c20410xU = this.A09;
        if (c20410xU.A02 != null && c20410xU.A00 < c20410xU.A01) {
            C20410xU.A00(c20410xU);
        }
        return this.A06[i2];
    }

    @Override // X.C08P
    public int getMountItemCount() {
        int i = 0;
        int i2 = 0;
        while (true) {
            C20450xY[] c20450xYArr = this.A07;
            if (i >= c20450xYArr.length) {
                return i2;
            }
            if (c20450xYArr[i] != null) {
                i2++;
            }
            i++;
        }
    }

    @Override // android.view.View
    public Object getTag() {
        Object obj = this.A03;
        return obj != null ? obj : super.getTag();
    }

    @Override // android.view.View
    public Object getTag(int i) {
        Object obj;
        SparseArray sparseArray = this.A01;
        return (sparseArray == null || (obj = sparseArray.get(i)) == null) ? super.getTag(i) : obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        C20450xY[] c20450xYArr = this.A07;
        if (c20450xYArr != null) {
            int length = c20450xYArr.length;
            for (int i = 0; i < length; i++) {
                C20450xY c20450xY = this.A07[i];
                if (c20450xY != null && c20450xY.A01.A07.A04 == EnumC20560xj.DRAWABLE) {
                    ((Drawable) c20450xY.A02).jumpToCurrentState();
                }
            }
        }
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A04 = true;
        A03(z, i, i2, i3, i4);
        this.A04 = false;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(0, 0, getRight(), getBottom());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C20450xY[] c20450xYArr;
        if (isEnabled() && (c20450xYArr = this.A07) != null) {
            for (int length = c20450xYArr.length - 1; length >= 0; length--) {
                C20450xY c20450xY = c20450xYArr[length];
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        for (ViewParent viewParent = this; viewParent instanceof C1YV; viewParent = viewParent.getParent()) {
            if (!(!((C1YV) viewParent).A04)) {
                return;
            }
        }
        super.requestLayout();
    }

    public void setForegroundCompat(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            setForeground(drawable);
        } else {
            setForegroundLollipop(drawable);
        }
    }

    private void setForegroundLollipop(Drawable drawable) {
        Drawable drawable2 = this.A00;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.A00);
            }
            this.A00 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
            }
            invalidate();
        }
    }

    public void setInterceptTouchEventHandler(InterfaceC20420xV interfaceC20420xV) {
        this.A02 = interfaceC20420xV;
    }

    public void setViewTag(Object obj) {
        this.A03 = obj;
    }

    public void setViewTags(SparseArray sparseArray) {
        this.A01 = sparseArray;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        C20450xY[] c20450xYArr = this.A07;
        if (c20450xYArr != null) {
            int length = c20450xYArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                C20450xY c20450xY = this.A07[i2];
                if (c20450xY != null && c20450xY.A01.A07.A04 == EnumC20560xj.DRAWABLE) {
                    ((Drawable) c20450xY.A02).setVisible(i == 0, false);
                }
            }
        }
    }
}
