package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0cL */
/* loaded from: classes.dex */
public class C08930cL extends ViewGroup.MarginLayoutParams {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public View A08;
    public View A09;
    public AbstractC08910cJ A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Rect A0F;

    public C08930cL() {
        super(-2, -2);
        this.A0B = false;
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = -1;
        this.A05 = -1;
        this.A03 = 0;
        this.A01 = 0;
        this.A0F = new Rect();
    }

    public C08930cL(C08930cL c08930cL) {
        super((ViewGroup.MarginLayoutParams) c08930cL);
        this.A0B = false;
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = -1;
        this.A05 = -1;
        this.A03 = 0;
        this.A01 = 0;
        this.A0F = new Rect();
    }

    public C08930cL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC08910cJ abstractC08910cJ;
        this.A0B = false;
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = -1;
        this.A05 = -1;
        this.A03 = 0;
        this.A01 = 0;
        this.A0F = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12450jR.A02);
        this.A02 = obtainStyledAttributes.getInteger(0, 0);
        this.A05 = obtainStyledAttributes.getResourceId(1, -1);
        this.A00 = obtainStyledAttributes.getInteger(2, 0);
        this.A04 = obtainStyledAttributes.getInteger(6, -1);
        this.A03 = obtainStyledAttributes.getInt(5, 0);
        this.A01 = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.A0B = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            if (TextUtils.isEmpty(string)) {
                abstractC08910cJ = null;
            } else {
                if (string.startsWith(".")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(context.getPackageName());
                    sb.append(string);
                    string = sb.toString();
                } else if (string.indexOf(46) < 0) {
                    String str = CoordinatorLayout.A0J;
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append('.');
                        sb2.append(string);
                        string = sb2.toString();
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.A0K;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = context.getClassLoader().loadClass(string).getConstructor(CoordinatorLayout.A0M);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC08910cJ = (AbstractC08910cJ) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(C000200d.A0H("Could not inflate Behavior subclass ", string), e);
                }
            }
            this.A0A = abstractC08910cJ;
        }
        obtainStyledAttributes.recycle();
        AbstractC08910cJ abstractC08910cJ2 = this.A0A;
        if (abstractC08910cJ2 != null) {
            abstractC08910cJ2.A0G(this);
        }
    }

    public C08930cL(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A0B = false;
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = -1;
        this.A05 = -1;
        this.A03 = 0;
        this.A01 = 0;
        this.A0F = new Rect();
    }

    public C08930cL(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.A0B = false;
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = -1;
        this.A05 = -1;
        this.A03 = 0;
        this.A01 = 0;
        this.A0F = new Rect();
    }

    public void A00(AbstractC08910cJ abstractC08910cJ) {
        if (this.A0A != abstractC08910cJ) {
            this.A0A = abstractC08910cJ;
            this.A0B = true;
            if (abstractC08910cJ != null) {
                abstractC08910cJ.A0G(this);
            }
        }
    }
}
