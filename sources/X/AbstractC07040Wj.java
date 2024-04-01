package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.0Wj */
/* loaded from: classes.dex */
public abstract class AbstractC07040Wj extends View {
    public int A00;
    public Context A01;
    public InterfaceC12180iz A02;
    public String A03;
    public HashMap A04;
    public int[] A05;

    public void A05(C0YF c0yf, boolean z) {
    }

    public void A07(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public AbstractC07040Wj(Context context) {
        super(context);
        this.A05 = new int[32];
        this.A04 = new HashMap();
        this.A01 = context;
        A04(null);
    }

    public AbstractC07040Wj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A05 = new int[32];
        this.A04 = new HashMap();
        this.A01 = context;
        A04(attributeSet);
    }

    public final int A00(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || (resources = this.A01.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void A01() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        A06((ConstraintLayout) parent);
    }

    public void A02() {
        if (this.A02 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C0Wg) {
            ((C0Wg) layoutParams).A0r = (C0YF) this.A02;
        }
    }

    public final void A03(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.A00 + 1;
        int[] iArr = this.A05;
        int length = iArr.length;
        if (i2 > length) {
            iArr = Arrays.copyOf(iArr, length << 1);
            this.A05 = iArr;
        }
        int i3 = this.A00;
        iArr[i3] = i;
        this.A00 = i3 + 1;
    }

    public void A04(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C12420jO.A0I);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.A03 = string;
                    setIds(string);
                }
            }
        }
    }

    public void A06(ConstraintLayout constraintLayout) {
        float f;
        int visibility = getVisibility();
        if (Build.VERSION.SDK_INT >= 21) {
            f = getElevation();
        } else {
            f = 0.0f;
        }
        for (int i = 0; i < this.A00; i++) {
            View view = (View) constraintLayout.A08.get(this.A05[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (f > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    view.setTranslationZ(view.getTranslationZ() + f);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0050, code lost:
        if (r2 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0056, code lost:
        if (r2 == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x005b, code lost:
        if (r4 != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A08(java.lang.String r7) {
        /*
            r6 = this;
            if (r7 == 0) goto La5
            int r0 = r7.length()
            if (r0 == 0) goto La5
            android.content.Context r0 = r6.A01
            if (r0 != 0) goto Ld
            return
        Ld:
            java.lang.String r3 = r7.trim()
            android.view.ViewParent r0 = r6.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L1c
            r6.getParent()
        L1c:
            android.view.ViewParent r0 = r6.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r5 = 0
            if (r0 == 0) goto L5e
            android.view.ViewParent r4 = r6.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
        L2b:
            boolean r0 = r6.isInEditMode()
            r2 = 0
            if (r0 == 0) goto L5b
            if (r4 == 0) goto L60
            if (r3 == 0) goto L59
            java.util.HashMap r0 = r4.A0F
            if (r0 == 0) goto L59
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L59
            java.util.HashMap r0 = r4.A0F
            java.lang.Object r1 = r0.get(r3)
        L46:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L52
            java.lang.Number r1 = (java.lang.Number) r1
            int r2 = r1.intValue()
            if (r2 != 0) goto L99
        L52:
            int r2 = r6.A00(r4, r3)
            if (r2 != 0) goto L99
            goto L60
        L59:
            r1 = 0
            goto L46
        L5b:
            if (r4 == 0) goto L60
            goto L52
        L5e:
            r4 = r5
            goto L2b
        L60:
            java.lang.Class<X.0jN> r0 = X.C12410jN.class
            java.lang.reflect.Field r0 = r0.getField(r3)     // Catch: java.lang.Exception -> L6a
            int r2 = r0.getInt(r5)     // Catch: java.lang.Exception -> L6a
        L6a:
            if (r2 != 0) goto L99
            android.content.Context r0 = r6.A01
            android.content.res.Resources r2 = r0.getResources()
            android.content.Context r0 = r6.A01
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "id"
            int r2 = r2.getIdentifier(r3, r0, r1)
            if (r2 != 0) goto L99
            java.lang.String r0 = "Could not find id of \""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = "\""
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r1)
            return
        L99:
            java.util.HashMap r1 = r6.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.put(r0, r3)
            r6.A03(r2)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC07040Wj.A08(java.lang.String):void");
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.A05, this.A00);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.A03;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.A03 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.A00 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                A08(str.substring(i));
                return;
            } else {
                A08(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.A03 = null;
        this.A00 = 0;
        for (int i : iArr) {
            A03(i);
        }
    }
}
