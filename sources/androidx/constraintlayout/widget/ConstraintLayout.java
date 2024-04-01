package androidx.constraintlayout.widget;

import X.AbstractC07040Wj;
import X.AbstractC12400jM;
import X.C0Wg;
import X.C0YD;
import X.C0YE;
import X.C0YF;
import X.C0YG;
import X.C12330jF;
import X.C12340jG;
import X.C12390jL;
import X.C12420jO;
import X.C28581Sq;
import X.C28621Su;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public SparseArray A08;
    public SparseArray A09;
    public C0YD A0A;
    public C28621Su A0B;
    public C12330jF A0C;
    public C12390jL A0D;
    public ArrayList A0E;
    public HashMap A0F;
    public boolean A0G;

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [X.0jF] */
    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A08 = new SparseArray();
        this.A0E = new ArrayList(4);
        C0YD c0yd = new C0YD();
        this.A0A = c0yd;
        this.A06 = 0;
        this.A05 = 0;
        this.A04 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A0G = true;
        this.A07 = 263;
        this.A0D = null;
        this.A0C = null;
        this.A00 = -1;
        this.A0F = new HashMap();
        this.A02 = -1;
        this.A01 = -1;
        this.A09 = new SparseArray();
        C28621Su c28621Su = new C28621Su(this);
        this.A0B = c28621Su;
        c0yd.A0e = this;
        c0yd.A06 = c28621Su;
        c0yd.A08.A03 = c28621Su;
        this.A08.put(getId(), this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C12420jO.A0I, 0, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 9) {
                    this.A06 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A06);
                } else if (index == 10) {
                    this.A05 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A05);
                } else if (index == 7) {
                    this.A04 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A04);
                } else if (index == 8) {
                    this.A03 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A03);
                } else if (index == 89) {
                    this.A07 = obtainStyledAttributes.getInt(index, this.A07);
                } else if (index == 38) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.A0C = new Object(getContext(), resourceId) { // from class: X.0jF
                                public SparseArray A01 = new SparseArray();
                                public SparseArray A00 = new SparseArray();

                                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                /* JADX WARN: Code restructure failed: missing block: B:290:0x00dd, code lost:
                                    if (r7 == (-1)) goto L236;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:332:0x0184, code lost:
                                    if (r3.equals("Constraint") == false) goto L69;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:458:0x0052, code lost:
                                    continue;
                                 */
                                {
                                    /*
                                        Method dump skipped, instructions count: 1150
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C12330jF.<init>(android.content.Context, int):void");
                                }
                            };
                        } catch (Resources.NotFoundException unused) {
                            this.A0C = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C12390jL c12390jL = new C12390jL();
                        this.A0D = c12390jL;
                        Context context2 = getContext();
                        XmlResourceParser xml = context2.getResources().getXml(resourceId2);
                        try {
                            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                if (eventType == 0) {
                                    xml.getName();
                                } else if (eventType == 2) {
                                    String name = xml.getName();
                                    C12340jG A01 = C12390jL.A01(context2, Xml.asAttributeSet(xml));
                                    if (name.equalsIgnoreCase("Guideline")) {
                                        A01.A02.A0y = true;
                                    }
                                    c12390jL.A00.put(Integer.valueOf(A01.A00), A01);
                                }
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (XmlPullParserException e2) {
                            e2.printStackTrace();
                        }
                    } catch (Resources.NotFoundException unused2) {
                        this.A0D = null;
                    }
                    this.A00 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        C0YD c0yd2 = this.A0A;
        int i2 = this.A07;
        c0yd2.A01 = i2;
        C0YG.A0F = (i2 & 256) == 256;
    }

    public final C0YF A00(View view) {
        if (view == this) {
            return this.A0A;
        }
        if (view == null) {
            return null;
        }
        return ((C0Wg) view.getLayoutParams()).A0r;
    }

    public boolean A01() {
        return Build.VERSION.SDK_INT >= 17 && (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0Wg;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d2 A[ORIG_RETURN, RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dispatchDraw(android.graphics.Canvas r24) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void forceLayout() {
        this.A0G = true;
        this.A02 = -1;
        this.A01 = -1;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0Wg();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0Wg(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0Wg(layoutParams);
    }

    public int getMaxHeight() {
        return this.A03;
    }

    public int getMaxWidth() {
        return this.A04;
    }

    public int getMinHeight() {
        return this.A05;
    }

    public int getMinWidth() {
        return this.A06;
    }

    public int getOptimizationLevel() {
        return this.A0A.A01;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        if (Build.VERSION.SDK_INT >= 17) {
            int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
            if (max2 > 0) {
                return max2;
            }
        }
        return max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            C0Wg c0Wg = (C0Wg) childAt.getLayoutParams();
            C0YF c0yf = c0Wg.A0r;
            if (childAt.getVisibility() != 8 || c0Wg.A0x || c0Wg.A0y || isInEditMode) {
                int A02 = c0yf.A02();
                int A03 = c0yf.A03();
                childAt.layout(A02, A03, c0yf.A01() + A02, c0yf.A00() + A03);
            }
        }
        int size = this.A0E.size();
        if (size > 0) {
            do {
                ((AbstractC07040Wj) this.A0E.get(i5)).A07(this);
                i5++;
            } while (i5 < size);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:1079:0x0771, code lost:
        if ((r11 & 64) == 64) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1092:0x079f, code lost:
        if (r11.A01 <= 0.0f) goto L696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1101:0x07b2, code lost:
        if (r13 != false) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1139:0x084b, code lost:
        if (r13 != false) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1244:0x0a94, code lost:
        if (r11 != 2) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1374:0x0cd1, code lost:
        if (r1 == r12.A07) goto L657;
     */
    /* JADX WARN: Removed duplicated region for block: B:1032:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:1057:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:1063:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:1068:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:1071:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:1074:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:1190:0x096f  */
    /* JADX WARN: Removed duplicated region for block: B:1191:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:1193:0x0982  */
    /* JADX WARN: Removed duplicated region for block: B:1378:0x0cdf  */
    /* JADX WARN: Removed duplicated region for block: B:1382:0x0d1a  */
    /* JADX WARN: Removed duplicated region for block: B:1384:0x0d1d  */
    /* JADX WARN: Removed duplicated region for block: B:1387:0x0d26  */
    /* JADX WARN: Removed duplicated region for block: B:825:0x0191 A[LOOP:6: B:824:0x018f->B:825:0x0191, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:828:0x01af A[LOOP:7: B:827:0x01ad->B:828:0x01af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:831:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:874:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:945:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:950:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:955:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:960:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:968:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:971:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:972:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:977:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:982:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:992:0x0571  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r32, int r33) {
        /*
            Method dump skipped, instructions count: 3368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C0YF A00 = A00(view);
        if ((view instanceof Guideline) && !(A00 instanceof C28581Sq)) {
            C0Wg c0Wg = (C0Wg) view.getLayoutParams();
            C28581Sq c28581Sq = new C28581Sq();
            c0Wg.A0r = c28581Sq;
            c0Wg.A0x = true;
            c28581Sq.A0J(c0Wg.A0b);
        }
        if (view instanceof AbstractC07040Wj) {
            AbstractC07040Wj abstractC07040Wj = (AbstractC07040Wj) view;
            abstractC07040Wj.A02();
            ((C0Wg) view.getLayoutParams()).A0y = true;
            if (!this.A0E.contains(abstractC07040Wj)) {
                this.A0E.add(abstractC07040Wj);
            }
        }
        this.A08.put(view.getId(), view);
        this.A0G = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.A08.remove(view.getId());
        C0YF A00 = A00(view);
        ((C0YE) this.A0A).A00.remove(A00);
        A00.A0Z = null;
        this.A0E.remove(view);
        this.A0G = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.A0G = true;
        this.A02 = -1;
        this.A01 = -1;
        super.requestLayout();
    }

    public void setConstraintSet(C12390jL c12390jL) {
        this.A0D = c12390jL;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.A08.remove(getId());
        super.setId(i);
        this.A08.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.A03) {
            return;
        }
        this.A03 = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.A04) {
            return;
        }
        this.A04 = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.A05) {
            return;
        }
        this.A05 = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.A06) {
            return;
        }
        this.A06 = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC12400jM abstractC12400jM) {
    }

    public void setOptimizationLevel(int i) {
        this.A07 = i;
        this.A0A.A01 = i;
        C0YG.A0F = (i & 256) == 256;
    }
}
