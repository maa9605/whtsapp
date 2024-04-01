package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.09L */
/* loaded from: classes.dex */
public final class C09L {
    public static final ThreadLocal A01 = new ThreadLocal();
    public static final WeakHashMap A02 = new WeakHashMap(0);
    public static final Object A00 = new Object();

    public static ColorStateList A00(Context context, int i) {
        WeakHashMap weakHashMap;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        int next;
        C08080aZ c08080aZ;
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        Object obj = A00;
        synchronized (obj) {
            weakHashMap = A02;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(context);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (c08080aZ = (C08080aZ) sparseArray.get(i)) != null) {
                if (c08080aZ.A01.equals(context.getResources().getConfiguration())) {
                    colorStateList2 = c08080aZ.A00;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        Resources resources = context.getResources();
        ThreadLocal threadLocal = A01;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (!((i2 < 28 || i2 > 31) ? false : false)) {
            Resources resources2 = context.getResources();
            XmlResourceParser xml = resources2.getXml(i);
            try {
                Resources.Theme theme = context.getTheme();
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        colorStateList = C07O.A0F(resources2, xml, asAttributeSet, theme);
                    }
                } while (next != 1);
                throw new XmlPullParserException("No start tag found");
            } catch (Exception e) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList != null) {
            synchronized (obj) {
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(context);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(context, sparseArray2);
                }
                sparseArray2.append(i, new C08080aZ(colorStateList, context.getResources().getConfiguration()));
            }
            return colorStateList;
        }
        return C02160Ac.A02(context, i);
    }

    public static Drawable A01(Context context, int i) {
        return C06720Us.A01().A04(context, i);
    }
}
