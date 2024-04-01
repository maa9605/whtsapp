package com.google.android.material.chip;

import X.AbstractC02790Cw;
import X.AnonymousClass088;
import X.C07O;
import X.C08550bg;
import X.C08560bh;
import X.C08570bi;
import X.C08740bz;
import X.C09L;
import X.C0AT;
import X.C0SI;
import X.C0X1;
import X.C0Y5;
import X.C1B4;
import X.C31741cr;
import X.C32641eS;
import X.InterfaceC09530eG;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.material.chip.Chip;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements InterfaceC09530eG {
    public static final Rect A0D = new Rect();
    public static final int[] A0E = {16842913};
    public int A00;
    public RippleDrawable A01;
    public View.OnClickListener A02;
    public CompoundButton.OnCheckedChangeListener A03;
    public C32641eS A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Rect A09;
    public final RectF A0A;
    public final C0X1 A0B;
    public final C31741cr A0C;

    /* JADX WARN: Type inference failed for: r0v72, types: [X.0AS, X.1cr] */
    public Chip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle);
        C1B4 c1b4;
        int resourceId;
        this.A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A09 = new Rect();
        this.A0A = new RectF();
        this.A0B = new C0X1() { // from class: X.1eQ
            @Override // X.C0X1
            public void A01(int i) {
            }

            {
                Chip.this = this;
            }

            @Override // X.C0X1
            public void A03(Typeface typeface) {
                Chip chip = Chip.this;
                chip.setText(chip.getText());
                chip.requestLayout();
                chip.invalidate();
            }
        };
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                                if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                    if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                        Log.w("Chip", "Chip text must be vertically center and start aligned");
                                    }
                                } else {
                                    throw new UnsupportedOperationException("Chip does not support multi-line text");
                                }
                            } else {
                                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
            }
        }
        C32641eS c32641eS = new C32641eS(context);
        Context context2 = c32641eS.A0p;
        TypedArray A00 = C08560bh.A00(context2, attributeSet, C08550bg.A0J, R.attr.chipStyle, 2131952470, new int[0]);
        ColorStateList A0L = AnonymousClass088.A0L(context2, A00, 8);
        if (c32641eS.A0L != A0L) {
            c32641eS.A0L = A0L;
            c32641eS.onStateChange(c32641eS.getState());
        }
        float dimension = A00.getDimension(16, 0.0f);
        if (c32641eS.A03 != dimension) {
            c32641eS.A03 = dimension;
            c32641eS.invalidateSelf();
            c32641eS.A04();
        }
        float dimension2 = A00.getDimension(9, 0.0f);
        if (c32641eS.A00 != dimension2) {
            c32641eS.A00 = dimension2;
            c32641eS.invalidateSelf();
        }
        ColorStateList A0L2 = AnonymousClass088.A0L(context2, A00, 18);
        if (c32641eS.A0N != A0L2) {
            c32641eS.A0N = A0L2;
            c32641eS.onStateChange(c32641eS.getState());
        }
        c32641eS.A06(A00.getDimension(19, 0.0f));
        c32641eS.A0E(AnonymousClass088.A0L(context2, A00, 30));
        c32641eS.A0L(A00.getText(3));
        if (A00.hasValue(0) && (resourceId = A00.getResourceId(0, 0)) != 0) {
            c1b4 = new C1B4(context2, resourceId);
        } else {
            c1b4 = null;
        }
        c32641eS.A0K(c1b4);
        int i = A00.getInt(1, 0);
        if (i == 1) {
            c32641eS.A0Y = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            c32641eS.A0Y = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            c32641eS.A0Y = TextUtils.TruncateAt.END;
        }
        c32641eS.A0O(A00.getBoolean(15, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c32641eS.A0O(A00.getBoolean(12, false));
        }
        c32641eS.A0H(AnonymousClass088.A0O(context2, A00, 11));
        c32641eS.A0C(AnonymousClass088.A0L(context2, A00, 14));
        c32641eS.A05(A00.getDimension(13, 0.0f));
        c32641eS.A0P(A00.getBoolean(26, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c32641eS.A0P(A00.getBoolean(21, false));
        }
        c32641eS.A0I(AnonymousClass088.A0O(context2, A00, 20));
        c32641eS.A0D(AnonymousClass088.A0L(context2, A00, 25));
        c32641eS.A08(A00.getDimension(23, 0.0f));
        c32641eS.A0M(A00.getBoolean(4, false));
        c32641eS.A0N(A00.getBoolean(7, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c32641eS.A0N(A00.getBoolean(6, false));
        }
        c32641eS.A0G(AnonymousClass088.A0O(context2, A00, 5));
        c32641eS.A0a = C08570bi.A01(context2, A00, 31);
        c32641eS.A0Z = C08570bi.A01(context2, A00, 27);
        float dimension3 = A00.getDimension(17, 0.0f);
        if (c32641eS.A04 != dimension3) {
            c32641eS.A04 = dimension3;
            c32641eS.invalidateSelf();
            c32641eS.A04();
        }
        c32641eS.A0B(A00.getDimension(29, 0.0f));
        c32641eS.A0A(A00.getDimension(28, 0.0f));
        float dimension4 = A00.getDimension(33, 0.0f);
        if (c32641eS.A0C != dimension4) {
            c32641eS.A0C = dimension4;
            c32641eS.invalidateSelf();
            c32641eS.A04();
        }
        float dimension5 = A00.getDimension(32, 0.0f);
        if (c32641eS.A0B != dimension5) {
            c32641eS.A0B = dimension5;
            c32641eS.invalidateSelf();
            c32641eS.A04();
        }
        c32641eS.A09(A00.getDimension(24, 0.0f));
        c32641eS.A07(A00.getDimension(22, 0.0f));
        float dimension6 = A00.getDimension(10, 0.0f);
        if (c32641eS.A01 != dimension6) {
            c32641eS.A01 = dimension6;
            c32641eS.invalidateSelf();
            c32641eS.A04();
        }
        c32641eS.A0K = A00.getDimensionPixelSize(2, Integer.MAX_VALUE);
        A00.recycle();
        setChipDrawable(c32641eS);
        ?? r0 = new AbstractC02790Cw(this) { // from class: X.1cr
            {
                Chip.this = this;
            }

            @Override // X.AbstractC02790Cw
            public int A06(float f, float f2) {
                Chip chip = Chip.this;
                C32641eS c32641eS2 = chip.A04;
                return (c32641eS2 == null || c32641eS2.A03() == null || !Chip.getCloseIconTouchBounds(chip).contains(f, f2)) ? -1 : 0;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x000b, code lost:
                if (r1 == null) goto L19;
             */
            @Override // X.AbstractC02790Cw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A0A(int r9, X.C08420bS r10) {
                /*
                    r8 = this;
                    com.google.android.material.chip.Chip r6 = com.google.android.material.chip.Chip.this
                    X.1eS r0 = r6.A04
                    if (r0 == 0) goto Ld
                    android.graphics.drawable.Drawable r1 = r0.A03()
                    r0 = 1
                    if (r1 != 0) goto Le
                Ld:
                    r0 = 0
                Le:
                    java.lang.String r7 = ""
                    if (r0 == 0) goto L57
                    java.lang.CharSequence r0 = r6.getCloseIconContentDescription()
                    if (r0 == 0) goto L31
                    android.view.accessibility.AccessibilityNodeInfo r1 = r10.A02
                    r1.setContentDescription(r0)
                L1d:
                    android.graphics.Rect r0 = com.google.android.material.chip.Chip.getCloseIconTouchBoundsInt(r6)
                    r1.setBoundsInParent(r0)
                    X.0bU r0 = X.C08440bU.A01
                    r10.A06(r0)
                    boolean r0 = r6.isEnabled()
                    r1.setEnabled(r0)
                    return
                L31:
                    java.lang.CharSequence r5 = r6.getText()
                    android.content.Context r4 = r6.getContext()
                    r3 = 2131888339(0x7f1208d3, float:1.941131E38)
                    r0 = 1
                    java.lang.Object[] r2 = new java.lang.Object[r0]
                    r1 = 0
                    boolean r0 = android.text.TextUtils.isEmpty(r5)
                    if (r0 != 0) goto L47
                    r7 = r5
                L47:
                    r2[r1] = r7
                    java.lang.String r0 = r4.getString(r3, r2)
                    java.lang.String r0 = r0.trim()
                    android.view.accessibility.AccessibilityNodeInfo r1 = r10.A02
                    r1.setContentDescription(r0)
                    goto L1d
                L57:
                    android.view.accessibility.AccessibilityNodeInfo r1 = r10.A02
                    r1.setContentDescription(r7)
                    android.graphics.Rect r0 = com.google.android.material.chip.Chip.A0D
                    r1.setBoundsInParent(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C31741cr.A0A(int, X.0bS):void");
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0009, code lost:
                if (r1 == false) goto L12;
             */
            @Override // X.AbstractC02790Cw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A0B(X.C08420bS r5) {
                /*
                    r4 = this;
                    com.google.android.material.chip.Chip r2 = com.google.android.material.chip.Chip.this
                    X.1eS r0 = r2.A04
                    if (r0 == 0) goto Lb
                    boolean r1 = r0.A0g
                    r0 = 1
                    if (r1 != 0) goto Lc
                Lb:
                    r0 = 0
                Lc:
                    android.view.accessibility.AccessibilityNodeInfo r3 = r5.A02
                    r3.setCheckable(r0)
                    java.lang.Class<com.google.android.material.chip.Chip> r0 = com.google.android.material.chip.Chip.class
                    java.lang.String r0 = r0.getName()
                    r3.setClassName(r0)
                    java.lang.CharSequence r2 = r2.getText()
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r0 = 23
                    if (r1 < r0) goto L28
                    r3.setText(r2)
                    return
                L28:
                    r3.setContentDescription(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C31741cr.A0B(X.0bS):void");
            }

            @Override // X.AbstractC02790Cw
            public void A0C(List list) {
                C32641eS c32641eS2 = Chip.this.A04;
                if (c32641eS2 == null || c32641eS2.A03() == null) {
                    return;
                }
                list.add(0);
            }

            @Override // X.AbstractC02790Cw
            public boolean A0F(int i2, int i3, Bundle bundle) {
                if (i3 == 16 && i2 == 0) {
                    return Chip.this.A02();
                }
                return false;
            }
        };
        this.A0C = r0;
        C0AT.A0c(this, r0);
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new ViewOutlineProvider() { // from class: X.1Al
                {
                    Chip.this = this;
                }

                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    C32641eS c32641eS2 = Chip.this.A04;
                    if (c32641eS2 != null) {
                        c32641eS2.getOutline(outline);
                    } else {
                        outline.setAlpha(0.0f);
                    }
                }
            });
        }
        setChecked(this.A08);
        c32641eS.A0l = false;
        setText(c32641eS.A0d);
        setEllipsize(c32641eS.A0Y);
        setIncludeFontPadding(false);
        C1B4 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            A01(textAppearance);
        }
        setSingleLine();
        setGravity(8388627);
        A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x002b, code lost:
        if (r1 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0039, code lost:
        if (isChecked() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x003b, code lost:
        r2 = r6.A04;
        r3 = r3 + ((r2.A0A + r2.A09) + r2.A02);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A00() {
        /*
            r6 = this;
            java.lang.CharSequence r0 = r6.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L7a
            X.1eS r2 = r6.A04
            if (r2 == 0) goto L7a
            float r3 = r2.A04
            float r0 = r2.A01
            float r3 = r3 + r0
            float r0 = r2.A0C
            float r3 = r3 + r0
            float r0 = r2.A0B
            float r3 = r3 + r0
            boolean r0 = r2.A0i
            if (r0 == 0) goto L2d
            android.graphics.drawable.Drawable r1 = r2.A0W
            if (r1 == 0) goto L7b
            boolean r0 = r1 instanceof X.C0Y5
            if (r0 == 0) goto L2b
            X.0Y5 r1 = (X.C0Y5) r1
            android.graphics.drawable.Drawable r1 = r1.AE4()
        L2b:
            if (r1 != 0) goto L3b
        L2d:
            android.graphics.drawable.Drawable r0 = r2.A0V
            if (r0 == 0) goto L46
            boolean r0 = r2.A0h
            if (r0 == 0) goto L46
            boolean r0 = r6.isChecked()
            if (r0 == 0) goto L46
        L3b:
            X.1eS r2 = r6.A04
            float r1 = r2.A0A
            float r0 = r2.A09
            float r1 = r1 + r0
            float r0 = r2.A02
            float r1 = r1 + r0
            float r3 = r3 + r1
        L46:
            X.1eS r2 = r6.A04
            boolean r0 = r2.A0j
            if (r0 == 0) goto L5b
            android.graphics.drawable.Drawable r0 = r2.A03()
            if (r0 == 0) goto L5b
            float r1 = r2.A08
            float r0 = r2.A06
            float r1 = r1 + r0
            float r0 = r2.A07
            float r1 = r1 + r0
            float r3 = r3 + r1
        L5b:
            int r0 = X.C0AT.A06(r6)
            float r0 = (float) r0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L7a
            int r5 = X.C0AT.A07(r6)
            int r4 = r6.getPaddingTop()
            int r3 = (int) r3
            int r2 = r6.getPaddingBottom()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 17
            if (r1 < r0) goto L7d
            r6.setPaddingRelative(r5, r4, r3, r2)
        L7a:
            return
        L7b:
            r1 = 0
            goto L2b
        L7d:
            r6.setPadding(r5, r4, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.A00():void");
    }

    public final void A01(C1B4 c1b4) {
        TextPaint paint = getPaint();
        paint.drawableState = this.A04.getState();
        c1b4.A01(getContext(), paint, this.A0B);
    }

    public boolean A02() {
        boolean z;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.A02;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        } else {
            z = false;
        }
        A09(0, 1);
        return z;
    }

    public final boolean A03(boolean z) {
        if (this.A00 == Integer.MIN_VALUE) {
            setFocusedVirtualView(-1);
        }
        if (z) {
            if (this.A00 == -1) {
                setFocusedVirtualView(0);
                return true;
            }
            return false;
        } else if (this.A00 == 0) {
            setFocusedVirtualView(-1);
            return true;
        } else {
            return false;
        }
    }

    @Override // X.InterfaceC09530eG
    public void AIS() {
        A00();
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = AbstractC02790Cw.class.getDeclaredField("mHoveredVirtualViewId");
                declaredField.setAccessible(true);
                C31741cr c31741cr = this.A0C;
                if (((Number) declaredField.get(c31741cr)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = AbstractC02790Cw.class.getDeclaredMethod("updateHoveredVirtualView", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(c31741cr, Integer.valueOf((int) EditorInfoCompat.IME_FLAG_FORCE_ASCII));
                    return true;
                }
            } catch (IllegalAccessException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            } catch (NoSuchFieldException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (NoSuchMethodException e3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (InvocationTargetException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            }
        }
        return A0I(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return A0H(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0011, code lost:
        if (r1 == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void drawableStateChanged() {
        /*
            r4 = this;
            super.drawableStateChanged()
            X.1eS r0 = r4.A04
            r3 = 0
            if (r0 == 0) goto L8d
            android.graphics.drawable.Drawable r0 = r0.A0X
            if (r0 == 0) goto L13
            boolean r1 = r0.isStateful()
            r0 = 1
            if (r1 != 0) goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L8d
            X.1eS r2 = r4.A04
            boolean r1 = r4.isEnabled()
            boolean r0 = r4.A05
            if (r0 == 0) goto L22
            int r1 = r1 + 1
        L22:
            boolean r0 = r4.A06
            if (r0 == 0) goto L28
            int r1 = r1 + 1
        L28:
            boolean r0 = r4.A07
            if (r0 == 0) goto L2e
            int r1 = r1 + 1
        L2e:
            boolean r0 = r4.isChecked()
            if (r0 == 0) goto L36
            int r1 = r1 + 1
        L36:
            int[] r1 = new int[r1]
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L44
            r0 = 16842910(0x101009e, float:2.3694E-38)
            r1[r3] = r0
            r3 = 1
        L44:
            boolean r0 = r4.A05
            if (r0 == 0) goto L4f
            r0 = 16842908(0x101009c, float:2.3693995E-38)
            r1[r3] = r0
            int r3 = r3 + 1
        L4f:
            boolean r0 = r4.A06
            if (r0 == 0) goto L5a
            r0 = 16843623(0x1010367, float:2.3696E-38)
            r1[r3] = r0
            int r3 = r3 + 1
        L5a:
            boolean r0 = r4.A07
            if (r0 == 0) goto L65
            r0 = 16842919(0x10100a7, float:2.3694026E-38)
            r1[r3] = r0
            int r3 = r3 + 1
        L65:
            boolean r0 = r4.isChecked()
            if (r0 == 0) goto L70
            r0 = 16842913(0x10100a1, float:2.369401E-38)
            r1[r3] = r0
        L70:
            int[] r0 = r2.A0o
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 != 0) goto L8e
            r2.A0o = r1
            boolean r0 = r2.A0S()
            if (r0 == 0) goto L8e
            int[] r0 = r2.getState()
            boolean r0 = r2.A0T(r0, r1)
        L88:
            if (r0 == 0) goto L8d
            r4.invalidate()
        L8d:
            return
        L8e:
            r0 = 0
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.drawableStateChanged():void");
    }

    public Drawable getCheckedIcon() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A0V;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A0L;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A00;
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.A04;
    }

    public float getChipEndPadding() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A01;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C32641eS c32641eS = this.A04;
        if (c32641eS != null && (drawable = c32641eS.A0W) != null) {
            if (drawable instanceof C0Y5) {
                return ((C0Y5) drawable).AE4();
            }
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A02;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A0M;
        }
        return null;
    }

    public float getChipMinHeight() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A03;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A04;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A0N;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A05;
        }
        return 0.0f;
    }

    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A03();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A0c;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A06;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A07;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A08;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A0O;
        }
        return null;
    }

    public static RectF getCloseIconTouchBounds(Chip chip) {
        RectF rectF = chip.A0A;
        rectF.setEmpty();
        C32641eS c32641eS = chip.A04;
        if (c32641eS != null && c32641eS.A03() != null) {
            Rect bounds = c32641eS.getBounds();
            rectF.setEmpty();
            if (c32641eS.A0S()) {
                float f = c32641eS.A01 + c32641eS.A06 + c32641eS.A07 + c32641eS.A08 + c32641eS.A0B;
                if (C07O.A08(c32641eS) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    public static Rect getCloseIconTouchBoundsInt(Chip chip) {
        RectF closeIconTouchBounds = getCloseIconTouchBounds(chip);
        Rect rect = chip.A09;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A0Y;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.A00 == 0) {
            rect.set(getCloseIconTouchBoundsInt(this));
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C08570bi getHideMotionSpec() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A0Z;
        }
        return null;
    }

    public float getIconEndPadding() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A09;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A0A;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A0Q;
        }
        return null;
    }

    public C08570bi getShowMotionSpec() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A0a;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        C32641eS c32641eS = this.A04;
        return c32641eS != null ? c32641eS.A0d : "";
    }

    private C1B4 getTextAppearance() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A0b;
        }
        return null;
    }

    public float getTextEndPadding() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A0B;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            return c32641eS.A0C;
        }
        return 0.0f;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, A0E);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        C32641eS c32641eS;
        if (!TextUtils.isEmpty(getText()) && (c32641eS = this.A04) != null && !c32641eS.A0l) {
            int save = canvas.save();
            float textStartPadding = getTextStartPadding() + this.A04.A00() + getChipStartPadding();
            if (C0AT.A05(this) != 0) {
                textStartPadding = -textStartPadding;
            }
            canvas.translate(textStartPadding, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            setFocusedVirtualView(-1);
        } else {
            setFocusedVirtualView(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        invalidate();
        super.onFocusChanged(z, i, rect);
        C31741cr c31741cr = this.A0C;
        int i2 = ((AbstractC02790Cw) c31741cr).A01;
        if (i2 != Integer.MIN_VALUE) {
            c31741cr.A0D(i2);
        }
        if (z) {
            c31741cr.A0G(i, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds(this).contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x003d  */
    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r6, android.view.KeyEvent r7) {
        /*
            r5 = this;
            int r1 = r7.getKeyCode()
            r0 = 61
            r4 = 1
            if (r1 == r0) goto L4c
            r0 = 66
            if (r1 == r0) goto L41
            switch(r1) {
                case 21: goto L29;
                case 22: goto L15;
                case 23: goto L41;
                default: goto L10;
            }
        L10:
            boolean r0 = super.onKeyDown(r6, r7)
            return r0
        L15:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L10
            int r1 = X.C0AT.A05(r5)
            r0 = 1
            if (r1 == r4) goto L23
            r0 = 0
        L23:
            r0 = r0 ^ r4
            boolean r0 = r5.A03(r0)
            goto L3b
        L29:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L10
            int r1 = X.C0AT.A05(r5)
            r0 = 1
            if (r1 == r4) goto L37
            r0 = 0
        L37:
            boolean r0 = r5.A03(r0)
        L3b:
            if (r0 == 0) goto L10
            r5.invalidate()
            return r4
        L41:
            int r1 = r5.A00
            r0 = -1
            if (r1 == r0) goto L72
            if (r1 != 0) goto L10
            r5.A02()
            return r4
        L4c:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L6a
            r3 = 2
        L53:
            android.view.ViewParent r2 = r5.getParent()
            r1 = r5
        L58:
            android.view.View r1 = r1.focusSearch(r3)
            if (r1 == 0) goto L10
            if (r1 == r5) goto L66
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == r2) goto L58
        L66:
            r1.requestFocus()
            return r4
        L6a:
            boolean r0 = r7.hasModifiers(r4)
            if (r0 == 0) goto L10
            r3 = 1
            goto L53
        L72:
            r5.performClick()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds(this).contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x001e, code lost:
        if (r3 != 3) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x003d, code lost:
        if (r0 != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0026 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r3 = r5.getActionMasked()
            android.graphics.RectF r2 = getCloseIconTouchBounds(r4)
            float r1 = r5.getX()
            float r0 = r5.getY()
            boolean r2 = r2.contains(r1, r0)
            r1 = 0
            r0 = 1
            if (r3 == 0) goto L42
            if (r3 == r0) goto L32
            r0 = 2
            if (r3 == r0) goto L28
            r0 = 3
            if (r3 == r0) goto L40
        L20:
            boolean r0 = super.onTouchEvent(r5)
            if (r0 == 0) goto L27
        L26:
            r1 = 1
        L27:
            return r1
        L28:
            boolean r0 = r4.A07
            if (r0 == 0) goto L20
            if (r2 != 0) goto L26
            r4.setCloseIconPressed(r1)
            goto L26
        L32:
            boolean r0 = r4.A07
            if (r0 == 0) goto L40
            r4.A02()
            r0 = 1
        L3a:
            r4.setCloseIconPressed(r1)
            if (r0 != 0) goto L26
            goto L20
        L40:
            r0 = 0
            goto L3a
        L42:
            if (r2 == 0) goto L20
            r4.setCloseIconPressed(r0)
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != this.A04 && drawable != this.A01) {
            throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        throw new UnsupportedOperationException("Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != this.A04 && drawable != this.A01) {
            throw new UnsupportedOperationException("Do not set the background drawable; Chip manages its own background drawable.");
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
        throw new UnsupportedOperationException("Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        throw new UnsupportedOperationException("Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        throw new UnsupportedOperationException("Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0M(z);
        }
    }

    public void setCheckableResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0M(c32641eS.A0p.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C32641eS c32641eS = this.A04;
        if (c32641eS == null) {
            this.A08 = z;
        } else if (!c32641eS.A0g) {
        } else {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked == z || (onCheckedChangeListener = this.A03) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0G(drawable);
        }
    }

    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0G(C09L.A01(c32641eS.A0p, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0N(c32641eS.A0p.getResources().getBoolean(i));
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0N(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C32641eS c32641eS = this.A04;
        if (c32641eS == null || c32641eS.A0L == colorStateList) {
            return;
        }
        c32641eS.A0L = colorStateList;
        c32641eS.onStateChange(c32641eS.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList A00;
        C32641eS c32641eS = this.A04;
        if (c32641eS != null && c32641eS.A0L != (A00 = C09L.A00(c32641eS.A0p, i))) {
            c32641eS.A0L = A00;
            c32641eS.onStateChange(c32641eS.getState());
        }
    }

    public void setChipCornerRadius(float f) {
        C32641eS c32641eS = this.A04;
        if (c32641eS == null || c32641eS.A00 == f) {
            return;
        }
        c32641eS.A00 = f;
        c32641eS.invalidateSelf();
    }

    public void setChipCornerRadiusResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            float dimension = c32641eS.A0p.getResources().getDimension(i);
            if (c32641eS.A00 != dimension) {
                c32641eS.A00 = dimension;
                c32641eS.invalidateSelf();
            }
        }
    }

    public void setChipDrawable(C32641eS c32641eS) {
        C32641eS c32641eS2 = this.A04;
        if (c32641eS2 != c32641eS) {
            if (c32641eS2 != null) {
                c32641eS2.A0f = new WeakReference(null);
            }
            this.A04 = c32641eS;
            if (c32641eS != null) {
                c32641eS.A0f = new WeakReference(this);
                if (C08740bz.A00) {
                    this.A01 = new RippleDrawable(C08740bz.A01(this.A04.A0Q), this.A04, null);
                    C32641eS c32641eS3 = this.A04;
                    if (c32641eS3.A0n) {
                        c32641eS3.A0n = false;
                        c32641eS3.A0P = null;
                        c32641eS3.onStateChange(c32641eS3.getState());
                    }
                    setBackground(this.A01);
                    return;
                }
                C32641eS c32641eS4 = this.A04;
                if (!c32641eS4.A0n) {
                    c32641eS4.A0n = true;
                    c32641eS4.A0P = C08740bz.A01(c32641eS4.A0Q);
                    c32641eS4.onStateChange(c32641eS4.getState());
                }
                setBackground(this.A04);
                return;
            }
            throw null;
        }
    }

    public void setChipEndPadding(float f) {
        C32641eS c32641eS = this.A04;
        if (c32641eS == null || c32641eS.A01 == f) {
            return;
        }
        c32641eS.A01 = f;
        c32641eS.invalidateSelf();
        c32641eS.A04();
    }

    public void setChipEndPaddingResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            float dimension = c32641eS.A0p.getResources().getDimension(i);
            if (c32641eS.A01 != dimension) {
                c32641eS.A01 = dimension;
                c32641eS.invalidateSelf();
                c32641eS.A04();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0H(drawable);
        }
    }

    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0H(C09L.A01(c32641eS.A0p, i));
        }
    }

    public void setChipIconSize(float f) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A05(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A05(c32641eS.A0p.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0C(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0C(C09L.A00(c32641eS.A0p, i));
        }
    }

    public void setChipIconVisible(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0O(c32641eS.A0p.getResources().getBoolean(i));
        }
    }

    public void setChipIconVisible(boolean z) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0O(z);
        }
    }

    public void setChipMinHeight(float f) {
        C32641eS c32641eS = this.A04;
        if (c32641eS == null || c32641eS.A03 == f) {
            return;
        }
        c32641eS.A03 = f;
        c32641eS.invalidateSelf();
        c32641eS.A04();
    }

    public void setChipMinHeightResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            float dimension = c32641eS.A0p.getResources().getDimension(i);
            if (c32641eS.A03 != dimension) {
                c32641eS.A03 = dimension;
                c32641eS.invalidateSelf();
                c32641eS.A04();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C32641eS c32641eS = this.A04;
        if (c32641eS == null || c32641eS.A04 == f) {
            return;
        }
        c32641eS.A04 = f;
        c32641eS.invalidateSelf();
        c32641eS.A04();
    }

    public void setChipStartPaddingResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            float dimension = c32641eS.A0p.getResources().getDimension(i);
            if (c32641eS.A04 != dimension) {
                c32641eS.A04 = dimension;
                c32641eS.invalidateSelf();
                c32641eS.A04();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C32641eS c32641eS = this.A04;
        if (c32641eS == null || c32641eS.A0N == colorStateList) {
            return;
        }
        c32641eS.A0N = colorStateList;
        c32641eS.onStateChange(c32641eS.getState());
    }

    public void setChipStrokeColorResource(int i) {
        ColorStateList A00;
        C32641eS c32641eS = this.A04;
        if (c32641eS != null && c32641eS.A0N != (A00 = C09L.A00(c32641eS.A0p, i))) {
            c32641eS.A0N = A00;
            c32641eS.onStateChange(c32641eS.getState());
        }
    }

    public void setChipStrokeWidth(float f) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A06(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A06(c32641eS.A0p.getResources().getDimension(i));
        }
    }

    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0I(drawable);
        }
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C32641eS c32641eS = this.A04;
        if (c32641eS == null || c32641eS.A0c == charSequence) {
            return;
        }
        C0SI A02 = C0SI.A02();
        c32641eS.A0c = A02.A03(charSequence, A02.A01);
        c32641eS.invalidateSelf();
    }

    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A07(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A07(c32641eS.A0p.getResources().getDimension(i));
        }
    }

    private void setCloseIconFocused(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconHovered(boolean z) {
        if (this.A06 != z) {
            this.A06 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.A07 != z) {
            this.A07 = z;
            refreshDrawableState();
        }
    }

    public void setCloseIconResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0I(C09L.A01(c32641eS.A0p, i));
        }
    }

    public void setCloseIconSize(float f) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A08(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A08(c32641eS.A0p.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A09(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A09(c32641eS.A0p.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0D(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0D(C09L.A00(c32641eS.A0p, i));
        }
    }

    public void setCloseIconVisible(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0P(c32641eS.A0p.getResources().getBoolean(i));
        }
    }

    public void setCloseIconVisible(boolean z) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0P(z);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.A04 == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            C32641eS c32641eS = this.A04;
            if (c32641eS != null) {
                c32641eS.A0Y = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    private void setFocusedVirtualView(int i) {
        int i2 = this.A00;
        if (i2 != i) {
            if (i2 == 0) {
                setCloseIconFocused(false);
            }
            this.A00 = i;
            if (i == 0) {
                setCloseIconFocused(true);
            }
        }
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C08570bi c08570bi) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0Z = c08570bi;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0Z = C08570bi.A00(c32641eS.A0p, i);
        }
    }

    public void setIconEndPadding(float f) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0A(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0A(c32641eS.A0p.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0B(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0B(c32641eS.A0p.getResources().getDimension(i));
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0K = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A03 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.A02 = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0E(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0E(C09L.A00(c32641eS.A0p, i));
        }
    }

    public void setShowMotionSpec(C08570bi c08570bi) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0a = c08570bi;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0a = C08570bi.A00(c32641eS.A0p, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.A04 == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        C0SI A02 = C0SI.A02();
        CharSequence A03 = A02.A03(charSequence, A02.A01);
        if (this.A04.A0l) {
            A03 = null;
        }
        super.setText(A03, bufferType);
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0L(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0K(new C1B4(c32641eS.A0p, i));
        }
        C1B4 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.A02(getContext(), getPaint(), this.A0B);
            A01(getTextAppearance());
        }
    }

    public void setTextAppearance(C1B4 c1b4) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0K(c1b4);
        }
        C1B4 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.A02(getContext(), getPaint(), this.A0B);
            A01(c1b4);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0K(new C1B4(c32641eS.A0p, i));
        }
        C1B4 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.A02(context, getPaint(), this.A0B);
            A01(getTextAppearance());
        }
    }

    public void setTextAppearanceResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            c32641eS.A0K(new C1B4(c32641eS.A0p, i));
        }
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C32641eS c32641eS = this.A04;
        if (c32641eS == null || c32641eS.A0B == f) {
            return;
        }
        c32641eS.A0B = f;
        c32641eS.invalidateSelf();
        c32641eS.A04();
    }

    public void setTextEndPaddingResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            float dimension = c32641eS.A0p.getResources().getDimension(i);
            if (c32641eS.A0B != dimension) {
                c32641eS.A0B = dimension;
                c32641eS.invalidateSelf();
                c32641eS.A04();
            }
        }
    }

    public void setTextStartPadding(float f) {
        C32641eS c32641eS = this.A04;
        if (c32641eS == null || c32641eS.A0C == f) {
            return;
        }
        c32641eS.A0C = f;
        c32641eS.invalidateSelf();
        c32641eS.A04();
    }

    public void setTextStartPaddingResource(int i) {
        C32641eS c32641eS = this.A04;
        if (c32641eS != null) {
            float dimension = c32641eS.A0p.getResources().getDimension(i);
            if (c32641eS.A0C != dimension) {
                c32641eS.A0C = dimension;
                c32641eS.invalidateSelf();
                c32641eS.A04();
            }
        }
    }
}
