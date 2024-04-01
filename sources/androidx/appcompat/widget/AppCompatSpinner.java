package androidx.appcompat.widget;

import X.AbstractView$OnTouchListenerC11180hK;
import X.C07980aP;
import X.C09L;
import X.C11050h6;
import X.C11100hB;
import X.InterfaceC02710Co;
import X.InterfaceC11110hC;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements InterfaceC02710Co {
    public static final int[] A08 = {16843505};
    public int A00;
    public SpinnerAdapter A01;
    public InterfaceC11110hC A02;
    public AbstractView$OnTouchListenerC11180hK A03;
    public final Context A04;
    public final Rect A05;
    public final C07980aP A06;
    public final boolean A07;

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0048, code lost:
        if (r5 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.A05 = r0
            int[] r7 = X.C0UY.A0X
            r2 = 0
            android.content.res.TypedArray r4 = r9.obtainStyledAttributes(r10, r7, r11, r2)
            X.0aP r0 = new X.0aP
            r0.<init>(r8)
            r8.A06 = r0
            r0 = 4
            int r1 = r4.getResourceId(r0, r2)
            if (r1 == 0) goto L29
            X.0CP r0 = new X.0CP
            r0.<init>(r9, r1)
            r8.A04 = r0
        L26:
            r3 = 0
            r6 = -1
            goto L2c
        L29:
            r8.A04 = r9
            goto L26
        L2c:
            int[] r0 = androidx.appcompat.widget.AppCompatSpinner.A08     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> Lc8
            android.content.res.TypedArray r5 = r9.obtainStyledAttributes(r10, r0, r11, r2)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> Lc8
            boolean r0 = r5.hasValue(r2)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> Lc1
            if (r0 == 0) goto L4a
            int r6 = r5.getInt(r2, r2)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> Lc1
            goto L4a
        L3d:
            r2 = move-exception
            goto L41
        L3f:
            r2 = move-exception
            r5 = r3
        L41:
            java.lang.String r1 = "AppCompatSpinner"
            java.lang.String r0 = "Could not read android:spinnerMode"
            android.util.Log.i(r1, r0, r2)     // Catch: java.lang.Throwable -> Lc1
            if (r5 == 0) goto L4d
        L4a:
            r5.recycle()
        L4d:
            r2 = 1
            if (r6 == 0) goto Lb1
            if (r6 != r2) goto L85
            android.content.Context r0 = r8.A04
            X.1nv r6 = new X.1nv
            r6.<init>(r8, r0, r10, r11)
            android.content.Context r0 = r8.A04
            X.0V9 r7 = X.C0V9.A00(r0, r10, r7, r11)
            r1 = 3
            r0 = -2
            android.content.res.TypedArray r5 = r7.A02
            int r0 = r5.getLayoutDimension(r1, r0)
            r8.A00 = r0
            android.graphics.drawable.Drawable r1 = r7.A02(r2)
            android.widget.PopupWindow r0 = r6.A0D
            r0.setBackgroundDrawable(r1)
            r0 = 2
            java.lang.String r0 = r4.getString(r0)
            r6.A02 = r0
            r5.recycle()
            r8.A02 = r6
            X.1SE r0 = new X.1SE
            r0.<init>(r8)
            r8.A03 = r0
        L85:
            r0 = 0
            java.lang.CharSequence[] r5 = r4.getTextArray(r0)
            if (r5 == 0) goto L9d
            r0 = 17367048(0x1090008, float:2.5162948E-38)
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r1.<init>(r9, r0, r5)
            r0 = 2131559268(0x7f0d0364, float:1.8743875E38)
            r1.setDropDownViewResource(r0)
            r8.setAdapter(r1)
        L9d:
            r4.recycle()
            r8.A07 = r2
            android.widget.SpinnerAdapter r0 = r8.A01
            if (r0 == 0) goto Lab
            r8.setAdapter(r0)
            r8.A01 = r3
        Lab:
            X.0aP r0 = r8.A06
            r0.A08(r10, r11)
            return
        Lb1:
            X.1SF r1 = new X.1SF
            r1.<init>(r8)
            r8.A02 = r1
            r0 = 2
            java.lang.String r0 = r4.getString(r0)
            r1.ATi(r0)
            goto L85
        Lc1:
            r0 = move-exception
            if (r5 == 0) goto Lc9
            r5.recycle()
            throw r0
        Lc8:
            r0 = move-exception
        Lc9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public int A00(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.A05;
            drawable.getPadding(rect);
            return i2 + rect.left + rect.right;
        }
        return i2;
    }

    public void A01() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.A02.AUb(getTextDirection(), getTextAlignment());
        } else {
            this.A02.AUb(-1, -1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C07980aP c07980aP = this.A06;
        if (c07980aP != null) {
            c07980aP.A02();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC11110hC interfaceC11110hC = this.A02;
        if (interfaceC11110hC != null) {
            return interfaceC11110hC.AAW();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC11110hC interfaceC11110hC = this.A02;
        if (interfaceC11110hC != null) {
            return interfaceC11110hC.ADo();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.A02 != null) {
            return this.A00;
        }
        return super.getDropDownWidth();
    }

    public final InterfaceC11110hC getInternalPopup() {
        return this.A02;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC11110hC interfaceC11110hC = this.A02;
        if (interfaceC11110hC != null) {
            return interfaceC11110hC.A8T();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.A04;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC11110hC interfaceC11110hC = this.A02;
        return interfaceC11110hC != null ? interfaceC11110hC.AAV() : super.getPrompt();
    }

    @Override // X.InterfaceC02710Co
    public ColorStateList getSupportBackgroundTintList() {
        C07980aP c07980aP = this.A06;
        if (c07980aP != null) {
            return c07980aP.A00();
        }
        return null;
    }

    @Override // X.InterfaceC02710Co
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C07980aP c07980aP = this.A06;
        if (c07980aP != null) {
            return c07980aP.A01();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC11110hC interfaceC11110hC = this.A02;
        if (interfaceC11110hC == null || !interfaceC11110hC.AFo()) {
            return;
        }
        this.A02.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A02 == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), A00(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C11100hB c11100hB = (C11100hB) parcelable;
        super.onRestoreInstanceState(c11100hB.getSuperState());
        if (!c11100hB.A00 || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0h5
            {
                AppCompatSpinner.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                if (!appCompatSpinner.A02.AFo()) {
                    appCompatSpinner.A01();
                }
                ViewTreeObserver viewTreeObserver2 = appCompatSpinner.getViewTreeObserver();
                if (viewTreeObserver2 != null) {
                    viewTreeObserver2.removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0012, code lost:
        if (r1 == false) goto L8;
     */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            X.0hB r2 = new X.0hB
            r2.<init>(r0)
            X.0hC r0 = r3.A02
            if (r0 == 0) goto L14
            boolean r1 = r0.AFo()
            r0 = 1
            if (r1 != 0) goto L15
        L14:
            r0 = 0
        L15:
            r2.A00 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.onSaveInstanceState():android.os.Parcelable");
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC11180hK abstractView$OnTouchListenerC11180hK = this.A03;
        if (abstractView$OnTouchListenerC11180hK == null || !abstractView$OnTouchListenerC11180hK.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC11110hC interfaceC11110hC = this.A02;
        if (interfaceC11110hC != null) {
            if (interfaceC11110hC.AFo()) {
                return true;
            }
            A01();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.A07) {
            this.A01 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.A02 != null) {
            Context context = this.A04;
            if (context == null) {
                context = getContext();
            }
            this.A02.ASg(new C11050h6(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C07980aP c07980aP = this.A06;
        if (c07980aP != null) {
            c07980aP.A03();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C07980aP c07980aP = this.A06;
        if (c07980aP != null) {
            c07980aP.A04(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC11110hC interfaceC11110hC = this.A02;
        if (interfaceC11110hC == null) {
            super.setDropDownHorizontalOffset(i);
            return;
        }
        interfaceC11110hC.AT6(i);
        this.A02.AT5(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC11110hC interfaceC11110hC = this.A02;
        if (interfaceC11110hC != null) {
            interfaceC11110hC.AU6(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.A02 != null) {
            this.A00 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC11110hC interfaceC11110hC = this.A02;
        if (interfaceC11110hC != null) {
            interfaceC11110hC.ASk(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C09L.A01(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC11110hC interfaceC11110hC = this.A02;
        if (interfaceC11110hC != null) {
            interfaceC11110hC.ATi(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // X.InterfaceC02710Co
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C07980aP c07980aP = this.A06;
        if (c07980aP != null) {
            c07980aP.A06(colorStateList);
        }
    }

    @Override // X.InterfaceC02710Co
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C07980aP c07980aP = this.A06;
        if (c07980aP != null) {
            c07980aP.A07(mode);
        }
    }
}
