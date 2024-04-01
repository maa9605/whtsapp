package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: X.0UJ  reason: invalid class name */
/* loaded from: classes.dex */
public class C0UJ implements LayoutInflater.Factory2 {
    public final AbstractC02800Cx A00;

    public C0UJ(AbstractC02800Cx abstractC02800Cx) {
        this.A00 = abstractC02800Cx;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        int i;
        AbstractC02800Cx abstractC02800Cx;
        if (C0Wk.class.getName().equals(str)) {
            return new C0Wk(context, attributeSet, this.A00);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13530lP.A03);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                ClassLoader classLoader = context.getClassLoader();
                try {
                    C006802z c006802z = C0UP.A00;
                    Class<?> cls = (Class) c006802z.getOrDefault(attributeValue, null);
                    if (cls == null) {
                        cls = Class.forName(attributeValue, false, classLoader);
                        c006802z.put(attributeValue, cls);
                    }
                    z = C0BA.class.isAssignableFrom(cls);
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    if (view != null) {
                        i = view.getId();
                    } else {
                        i = 0;
                    }
                    if (i == -1 && resourceId == -1 && string == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(attributeSet.getPositionDescription());
                        sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                        sb.append(attributeValue);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    C0BA A06 = resourceId != -1 ? this.A00.A06(resourceId) : null;
                    if (A06 == null && string != null) {
                        A06 = this.A00.A0Q.A01(string);
                    }
                    if (A06 == null && i != -1) {
                        A06 = this.A00.A06(i);
                    }
                    if (AbstractC02800Cx.A01(2)) {
                        StringBuilder A0P = C000200d.A0P("onCreateView: id=0x");
                        A0P.append(Integer.toHexString(resourceId));
                        A0P.append(" fname=");
                        A0P.append(attributeValue);
                        A0P.append(" existing=");
                        A0P.append(A06);
                        Log.v("FragmentManager", A0P.toString());
                    }
                    if (A06 == null) {
                        abstractC02800Cx = this.A00;
                        A06 = abstractC02800Cx.A08().A00(context.getClassLoader(), attributeValue);
                        A06.A0X = true;
                        int i2 = i;
                        if (resourceId != 0) {
                            i2 = resourceId;
                        }
                        A06.A03 = i2;
                        A06.A02 = i;
                        A06.A0Q = string;
                        A06.A0b = true;
                        A06.A0H = abstractC02800Cx;
                        A06.A0F = abstractC02800Cx.A06;
                        A06.A0I();
                        abstractC02800Cx.A0Q(A06);
                        abstractC02800Cx.A0c(A06, abstractC02800Cx.A00);
                    } else if (!A06.A0b) {
                        A06.A0b = true;
                        abstractC02800Cx = this.A00;
                        A06.A0F = abstractC02800Cx.A06;
                        A06.A0I();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(attributeSet.getPositionDescription());
                        sb2.append(": Duplicate id 0x");
                        sb2.append(Integer.toHexString(resourceId));
                        sb2.append(", tag ");
                        sb2.append(string);
                        sb2.append(", or parent id 0x");
                        sb2.append(Integer.toHexString(i));
                        sb2.append(" with another fragment for ");
                        sb2.append(attributeValue);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    int i3 = abstractC02800Cx.A00;
                    if (i3 < 1 && A06.A0X) {
                        abstractC02800Cx.A0c(A06, 1);
                    } else {
                        abstractC02800Cx.A0c(A06, i3);
                    }
                    View view2 = A06.A0A;
                    if (view2 != null) {
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (A06.A0A.getTag() == null) {
                            A06.A0A.setTag(string);
                        }
                        return A06.A0A;
                    }
                    throw new IllegalStateException(C000200d.A0I("Fragment ", attributeValue, " did not create a view."));
                }
            }
            return null;
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
