package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton$Behavior;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Iterator;

@CoordinatorLayout.DefaultBehavior(FloatingActionButton$Behavior.class)
/* renamed from: X.0bA */
/* loaded from: classes.dex */
public class C08280bA extends C08290bB implements InterfaceC02710Co, InterfaceC04870Mf, InterfaceC08300bC {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ColorStateList A05;
    public ColorStateList A06;
    public ColorStateList A07;
    public PorterDuff.Mode A08;
    public PorterDuff.Mode A09;
    public C08640bp A0A;
    public boolean A0B;
    public final Rect A0C;
    public final Rect A0D;
    public final C08600bl A0E;
    public final C08610bm A0F;

    public C08280bA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.floatingActionButtonStyle);
        this.A0C = new Rect();
        this.A0D = new Rect();
        TypedArray A00 = C08560bh.A00(context, attributeSet, C08550bg.A0T, R.attr.floatingActionButtonStyle, 2131952448, new int[0]);
        this.A05 = AnonymousClass088.A0L(context, A00, 1);
        this.A08 = AnonymousClass088.A0N(A00.getInt(2, -1), null);
        this.A07 = AnonymousClass088.A0L(context, A00, 11);
        this.A04 = A00.getInt(6, -1);
        this.A01 = A00.getDimensionPixelSize(5, 0);
        this.A00 = A00.getDimensionPixelSize(3, 0);
        float dimension = A00.getDimension(4, 0.0f);
        float dimension2 = A00.getDimension(8, 0.0f);
        float dimension3 = A00.getDimension(10, 0.0f);
        this.A0B = A00.getBoolean(13, false);
        this.A03 = A00.getDimensionPixelSize(9, 0);
        C08570bi A01 = C08570bi.A01(context, A00, 12);
        C08570bi A012 = C08570bi.A01(context, A00, 7);
        A00.recycle();
        C08600bl c08600bl = new C08600bl(this);
        this.A0E = c08600bl;
        c08600bl.A02(attributeSet, R.attr.floatingActionButtonStyle);
        this.A0F = new C08610bm(this);
        getImpl().A0D(this.A05, this.A08, this.A07, this.A00);
        C08640bp impl = getImpl();
        if (impl.A00 != dimension) {
            impl.A00 = dimension;
            impl.A0A(dimension, impl.A01, impl.A03);
        }
        C08640bp impl2 = getImpl();
        if (impl2.A01 != dimension2) {
            impl2.A01 = dimension2;
            impl2.A0A(impl2.A00, dimension2, impl2.A03);
        }
        C08640bp impl3 = getImpl();
        if (impl3.A03 != dimension3) {
            impl3.A03 = dimension3;
            impl3.A0A(impl3.A00, impl3.A01, dimension3);
        }
        C08640bp impl4 = getImpl();
        int i = this.A03;
        if (impl4.A06 != i) {
            impl4.A06 = i;
            impl4.A09(impl4.A02);
        }
        getImpl().A0F = A01;
        getImpl().A0E = A012;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public static int A00(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return size;
                }
                throw new IllegalArgumentException();
            }
            return i;
        }
        return Math.min(i, size);
    }

    public final int A02(int i) {
        int i2 = this.A01;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return A02(1);
        } else {
            return A02(0);
        }
    }

    public final void A03() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.A06;
        if (colorStateList == null) {
            C07O.A0U(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.A09;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C0UV.A00(colorForState, mode));
    }

    public void A04(final boolean z) {
        final C08640bp impl = getImpl();
        C08290bB c08290bB = impl.A0P;
        if (c08290bB.getVisibility() == 0) {
            if (impl.A05 == 1) {
                return;
            }
        } else if (impl.A05 != 2) {
            return;
        }
        Animator animator = impl.A07;
        if (animator != null) {
            animator.cancel();
        }
        if (!C0AT.A0h(c08290bB) || c08290bB.isInEditMode()) {
            c08290bB.A00(z ? 8 : 4, z);
            return;
        }
        C08570bi c08570bi = impl.A0E;
        if (c08570bi == null && (c08570bi = impl.A0C) == null) {
            c08570bi = C08570bi.A00(c08290bB.getContext(), R.animator.design_fab_hide_motion_spec);
            impl.A0C = c08570bi;
        }
        AnimatorSet A02 = impl.A02(c08570bi, 0.0f, 0.0f, 0.0f);
        A02.addListener(new AnimatorListenerAdapter() { // from class: X.1Aw
            public boolean A00;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                this.A00 = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                C08640bp c08640bp = impl;
                c08640bp.A05 = 0;
                c08640bp.A07 = null;
                if (!this.A00) {
                    C08290bB c08290bB2 = c08640bp.A0P;
                    boolean z2 = z;
                    c08290bB2.A00(z2 ? 8 : 4, z2);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                C08640bp c08640bp = impl;
                c08640bp.A0P.A00(0, z);
                c08640bp.A05 = 1;
                c08640bp.A07 = animator2;
                this.A00 = false;
            }
        });
        ArrayList arrayList = impl.A0I;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                A02.addListener((Animator.AnimatorListener) it.next());
            }
        }
        A02.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x002a, code lost:
        if (r4.isInEditMode() != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(final boolean r6) {
        /*
            r5 = this;
            X.0bp r3 = r5.getImpl()
            X.0bB r4 = r3.A0P
            int r0 = r4.getVisibility()
            r1 = 1
            if (r0 == 0) goto L13
            int r1 = r3.A05
            r0 = 2
            if (r1 != r0) goto L18
            return
        L13:
            int r0 = r3.A05
            if (r0 == r1) goto L18
            return
        L18:
            android.animation.Animator r0 = r3.A07
            if (r0 == 0) goto L1f
            r0.cancel()
        L1f:
            boolean r0 = X.C0AT.A0h(r4)
            if (r0 == 0) goto L2c
            boolean r1 = r4.isInEditMode()
            r0 = 1
            if (r1 == 0) goto L2d
        L2c:
            r0 = 0
        L2d:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L81
            int r0 = r4.getVisibility()
            if (r0 == 0) goto L44
            r0 = 0
            r4.setAlpha(r0)
            r4.setScaleY(r0)
            r4.setScaleX(r0)
            r3.A09(r0)
        L44:
            X.0bi r0 = r3.A0F
            if (r0 != 0) goto L59
            X.0bi r0 = r3.A0D
            if (r0 != 0) goto L59
            android.content.Context r1 = r4.getContext()
            r0 = 2130837506(0x7f020002, float:1.7279968E38)
            X.0bi r0 = X.C08570bi.A00(r1, r0)
            r3.A0D = r0
        L59:
            android.animation.AnimatorSet r2 = r3.A02(r0, r2, r2, r2)
            X.1Ax r0 = new X.1Ax
            r0.<init>()
            r2.addListener(r0)
            java.util.ArrayList r0 = r3.A0J
            if (r0 == 0) goto L7d
            java.util.Iterator r1 = r0.iterator()
        L6d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r1.next()
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r2.addListener(r0)
            goto L6d
        L7d:
            r2.start()
            return
        L81:
            r0 = 0
            r4.A00(r0, r6)
            r4.setAlpha(r2)
            r4.setScaleY(r2)
            r4.setScaleX(r2)
            r3.A09(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08280bA.A05(boolean):void");
    }

    @Override // X.InterfaceC08300bC
    public boolean AFF() {
        return this.A0F.A01;
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().A0G(getDrawableState());
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.A05;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.A08;
    }

    public float getCompatElevation() {
        return getImpl().A01();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().A01;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().A03;
    }

    public Drawable getContentBackground() {
        return getImpl().A08;
    }

    public int getCustomSize() {
        return this.A01;
    }

    public int getExpandedComponentIdHint() {
        return this.A0F.A00;
    }

    public C08570bi getHideMotionSpec() {
        return getImpl().A0E;
    }

    private C08640bp getImpl() {
        C08640bp c08640bp = this.A0A;
        if (c08640bp == null) {
            if (Build.VERSION.SDK_INT >= 21) {
                c08640bp = new C08640bp(this, new C08620bn(this)) { // from class: X.1eV
                    public InsetDrawable A00;

                    @Override // X.C08640bp
                    public void A06() {
                    }

                    @Override // X.C08640bp
                    public boolean A0H() {
                        return false;
                    }

                    @Override // X.C08640bp
                    public float A01() {
                        return this.A0P.getElevation();
                    }

                    @Override // X.C08640bp
                    public GradientDrawable A03() {
                        return new GradientDrawable() { // from class: X.1Az
                            @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
                            public boolean isStateful() {
                                return true;
                            }
                        };
                    }

                    @Override // X.C08640bp
                    public C08750c0 A04() {
                        return new C08750c0() { // from class: X.1eX
                            @Override // android.graphics.drawable.Drawable
                            public void getOutline(Outline outline) {
                                Rect rect = this.A0A;
                                copyBounds(rect);
                                outline.setOval(rect);
                            }
                        };
                    }

                    @Override // X.C08640bp
                    public void A07() {
                        A08();
                    }

                    @Override // X.C08640bp
                    public void A0A(float f, float f2, float f3) {
                        if (Build.VERSION.SDK_INT == 21) {
                            this.A0P.refreshDrawableState();
                        } else {
                            StateListAnimator stateListAnimator = new StateListAnimator();
                            stateListAnimator.addState(C08640bp.A0X, A0I(f, f3));
                            stateListAnimator.addState(C08640bp.A0W, A0I(f, f2));
                            stateListAnimator.addState(C08640bp.A0U, A0I(f, f2));
                            stateListAnimator.addState(C08640bp.A0V, A0I(f, f2));
                            AnimatorSet animatorSet = new AnimatorSet();
                            ArrayList arrayList = new ArrayList();
                            C08290bB c08290bB = this.A0P;
                            arrayList.add(ObjectAnimator.ofFloat(c08290bB, "elevation", f).setDuration(0L));
                            int i = Build.VERSION.SDK_INT;
                            if (i >= 22 && i <= 24) {
                                arrayList.add(ObjectAnimator.ofFloat(c08290bB, View.TRANSLATION_Z, c08290bB.getTranslationZ()).setDuration(100L));
                            }
                            arrayList.add(ObjectAnimator.ofFloat(c08290bB, View.TRANSLATION_Z, 0.0f).setDuration(100L));
                            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
                            animatorSet.setInterpolator(C08640bp.A0R);
                            stateListAnimator.addState(C08640bp.A0T, animatorSet);
                            stateListAnimator.addState(C08640bp.A0S, A0I(0.0f, 0.0f));
                            c08290bB.setStateListAnimator(stateListAnimator);
                        }
                        if (((C08620bn) this.A0Q).A00.A0B) {
                            A08();
                        }
                    }

                    @Override // X.C08640bp
                    public void A0C(ColorStateList colorStateList) {
                        Drawable drawable = this.A09;
                        if (drawable instanceof RippleDrawable) {
                            ((RippleDrawable) drawable).setColor(C08740bz.A01(colorStateList));
                        } else if (drawable == null) {
                        } else {
                            C07O.A0Z(drawable, C08740bz.A01(colorStateList));
                        }
                    }

                    @Override // X.C08640bp
                    public void A0D(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
                        Drawable drawable;
                        GradientDrawable A03 = A03();
                        A03.setShape(1);
                        A03.setColor(-1);
                        Drawable A0I = C07O.A0I(A03);
                        this.A0A = A0I;
                        C07O.A0Z(A0I, colorStateList);
                        if (mode != null) {
                            C07O.A0a(this.A0A, mode);
                        }
                        if (i > 0) {
                            C08750c0 A05 = A05(i, colorStateList);
                            this.A0G = A05;
                            drawable = new LayerDrawable(new Drawable[]{A05, this.A0A});
                        } else {
                            this.A0G = null;
                            drawable = this.A0A;
                        }
                        RippleDrawable rippleDrawable = new RippleDrawable(C08740bz.A01(colorStateList2), drawable, null);
                        this.A09 = rippleDrawable;
                        this.A08 = rippleDrawable;
                        super/*android.widget.ImageButton*/.setBackgroundDrawable(rippleDrawable);
                    }

                    @Override // X.C08640bp
                    public void A0E(Rect rect) {
                        C08280bA c08280bA = ((C08620bn) this.A0Q).A00;
                        if (!c08280bA.A0B) {
                            rect.set(0, 0, 0, 0);
                            return;
                        }
                        c08280bA.A02(c08280bA.A04);
                        float elevation = this.A0P.getElevation() + this.A03;
                        int ceil = (int) Math.ceil(elevation);
                        int ceil2 = (int) Math.ceil(elevation * 1.5f);
                        rect.set(ceil, ceil2, ceil, ceil2);
                    }

                    @Override // X.C08640bp
                    public void A0F(Rect rect) {
                        C08280bA c08280bA = ((C08620bn) this.A0Q).A00;
                        if (!c08280bA.A0B) {
                            super/*android.widget.ImageButton*/.setBackgroundDrawable(this.A09);
                            return;
                        }
                        InsetDrawable insetDrawable = new InsetDrawable(this.A09, rect.left, rect.top, rect.right, rect.bottom);
                        this.A00 = insetDrawable;
                        super/*android.widget.ImageButton*/.setBackgroundDrawable(insetDrawable);
                    }

                    @Override // X.C08640bp
                    public void A0G(int[] iArr) {
                        if (Build.VERSION.SDK_INT == 21) {
                            C08290bB c08290bB = this.A0P;
                            if (c08290bB.isEnabled()) {
                                c08290bB.setElevation(super.A00);
                                if (c08290bB.isPressed()) {
                                    c08290bB.setTranslationZ(this.A03);
                                    return;
                                } else if (!c08290bB.isFocused() && !c08290bB.isHovered()) {
                                    c08290bB.setTranslationZ(0.0f);
                                    return;
                                } else {
                                    c08290bB.setTranslationZ(this.A01);
                                    return;
                                }
                            }
                            c08290bB.setElevation(0.0f);
                            c08290bB.setTranslationZ(0.0f);
                        }
                    }

                    public final Animator A0I(float f, float f2) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        C08290bB c08290bB = this.A0P;
                        animatorSet.play(ObjectAnimator.ofFloat(c08290bB, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(c08290bB, View.TRANSLATION_Z, f2).setDuration(100L));
                        animatorSet.setInterpolator(C08640bp.A0R);
                        return animatorSet;
                    }
                };
            } else {
                c08640bp = new C08640bp(this, new C08620bn(this));
            }
            this.A0A = c08640bp;
        }
        return c08640bp;
    }

    public int getRippleColor() {
        ColorStateList colorStateList = this.A07;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.A07;
    }

    public C08570bi getShowMotionSpec() {
        return getImpl().A0F;
    }

    public int getSize() {
        return this.A04;
    }

    public int getSizeDimension() {
        return A02(this.A04);
    }

    @Override // X.InterfaceC02710Co
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // X.InterfaceC02710Co
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // X.InterfaceC04870Mf
    public ColorStateList getSupportImageTintList() {
        return this.A06;
    }

    @Override // X.InterfaceC04870Mf
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.A09;
    }

    public boolean getUseCompatPadding() {
        return this.A0B;
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().A06();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final C08640bp impl = getImpl();
        if (impl.A0H()) {
            if (impl.A0B == null) {
                impl.A0B = new ViewTreeObserver.OnPreDrawListener() { // from class: X.0ct
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        C08640bp c08640bp = impl;
                        C08290bB c08290bB = c08640bp.A0P;
                        float rotation = c08290bB.getRotation();
                        if (c08640bp.A04 != rotation) {
                            c08640bp.A04 = rotation;
                            if (Build.VERSION.SDK_INT == 19) {
                                if (rotation % 90.0f != 0.0f) {
                                    if (c08290bB.getLayerType() != 1) {
                                        c08290bB.setLayerType(1, null);
                                    }
                                } else if (c08290bB.getLayerType() != 0) {
                                    c08290bB.setLayerType(0, null);
                                }
                            }
                            C08770c2 c08770c2 = c08640bp.A0H;
                            if (c08770c2 != null) {
                                float f = -c08640bp.A04;
                                if (c08770c2.A03 != f) {
                                    c08770c2.A03 = f;
                                    c08770c2.invalidateSelf();
                                }
                            }
                            C08750c0 c08750c0 = c08640bp.A0G;
                            if (c08750c0 != null) {
                                float f2 = -c08640bp.A04;
                                if (f2 != c08750c0.A01) {
                                    c08750c0.A01 = f2;
                                    c08750c0.invalidateSelf();
                                }
                            }
                        }
                        return true;
                    }
                };
            }
            impl.A0P.getViewTreeObserver().addOnPreDrawListener(impl.A0B);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C08640bp impl = getImpl();
        if (impl.A0B != null) {
            impl.A0P.getViewTreeObserver().removeOnPreDrawListener(impl.A0B);
            impl.A0B = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int A02 = A02(this.A04);
        this.A02 = (A02 - this.A03) >> 1;
        getImpl().A08();
        int min = Math.min(A00(A02, i), A00(A02, i2));
        Rect rect = this.A0C;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C32791ek)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C32791ek c32791ek = (C32791ek) parcelable;
        super.onRestoreInstanceState(((AbstractC13390lB) c32791ek).A00);
        C08610bm c08610bm = this.A0F;
        Bundle bundle = (Bundle) c32791ek.A00.getOrDefault("expandableWidgetHelper", null);
        if (c08610bm != null) {
            c08610bm.A01 = bundle.getBoolean("expanded", false);
            c08610bm.A00 = bundle.getInt("expandedComponentIdHint", 0);
            if (c08610bm.A01) {
                View view = c08610bm.A02;
                ViewParent parent = view.getParent();
                if (parent instanceof CoordinatorLayout) {
                    ((CoordinatorLayout) parent).A0A(view);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C32791ek c32791ek = new C32791ek(super.onSaveInstanceState());
        C006802z c006802z = c32791ek.A00;
        C08610bm c08610bm = this.A0F;
        if (c08610bm != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("expanded", c08610bm.A01);
            bundle.putInt("expandedComponentIdHint", c08610bm.A00);
            c006802z.put("expandableWidgetHelper", bundle);
            return c32791ek;
        }
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 0) {
            Rect rect = this.A0D;
            if (C0AT.A0h(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                int i = rect.left;
                Rect rect2 = this.A0C;
                rect.left = i + rect2.left;
                rect.top += rect2.top;
                rect.right -= rect2.right;
                rect.bottom -= rect2.bottom;
                z = true;
            } else {
                z = false;
            }
            if (z && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.A05 != colorStateList) {
            this.A05 = colorStateList;
            C08640bp impl = getImpl();
            Drawable drawable = impl.A0A;
            if (drawable != null) {
                C07O.A0Z(drawable, colorStateList);
            }
            C08750c0 c08750c0 = impl.A0G;
            if (c08750c0 != null) {
                if (colorStateList != null) {
                    c08750c0.A04 = colorStateList.getColorForState(c08750c0.getState(), c08750c0.A04);
                }
                c08750c0.A07 = colorStateList;
                c08750c0.A08 = true;
                c08750c0.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.A08 != mode) {
            this.A08 = mode;
            Drawable drawable = getImpl().A0A;
            if (drawable != null) {
                C07O.A0a(drawable, mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        C08640bp impl = getImpl();
        if (impl.A00 != f) {
            impl.A00 = f;
            impl.A0A(f, impl.A01, impl.A03);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        C08640bp impl = getImpl();
        if (impl.A01 != f) {
            impl.A01 = f;
            impl.A0A(impl.A00, f, impl.A03);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        C08640bp impl = getImpl();
        if (impl.A03 != f) {
            impl.A03 = f;
            impl.A0A(impl.A00, impl.A01, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            this.A01 = i;
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    public void setExpandedComponentIdHint(int i) {
        this.A0F.A00 = i;
    }

    public void setHideMotionSpec(C08570bi c08570bi) {
        getImpl().A0E = c08570bi;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C08570bi.A00(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C08640bp impl = getImpl();
        impl.A09(impl.A02);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.A0E.A01(i);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.A07 != colorStateList) {
            this.A07 = colorStateList;
            getImpl().A0C(this.A07);
        }
    }

    public void setShowMotionSpec(C08570bi c08570bi) {
        getImpl().A0F = c08570bi;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C08570bi.A00(getContext(), i));
    }

    public void setSize(int i) {
        this.A01 = 0;
        if (i != this.A04) {
            this.A04 = i;
            requestLayout();
        }
    }

    @Override // X.InterfaceC02710Co
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // X.InterfaceC02710Co
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // X.InterfaceC04870Mf
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.A06 != colorStateList) {
            this.A06 = colorStateList;
            A03();
        }
    }

    @Override // X.InterfaceC04870Mf
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.A09 != mode) {
            this.A09 = mode;
            A03();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.A0B != z) {
            this.A0B = z;
            getImpl().A07();
        }
    }
}
