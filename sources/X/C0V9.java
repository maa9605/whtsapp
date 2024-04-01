package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: X.0V9  reason: invalid class name */
/* loaded from: classes.dex */
public class C0V9 {
    public TypedValue A00;
    public final Context A01;
    public final TypedArray A02;

    public C0V9(Context context, TypedArray typedArray) {
        this.A01 = context;
        this.A02 = typedArray;
    }

    public static C0V9 A00(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0V9(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public ColorStateList A01(int i) {
        int resourceId;
        ColorStateList A00;
        TypedArray typedArray = this.A02;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A00 = C09L.A00(this.A01, resourceId)) == null) ? typedArray.getColorStateList(i) : A00;
    }

    public Drawable A02(int i) {
        int resourceId;
        TypedArray typedArray = this.A02;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return C09L.A01(this.A01, resourceId);
        }
        return typedArray.getDrawable(i);
    }

    public Drawable A03(int i) {
        int resourceId;
        Drawable A05;
        TypedArray typedArray = this.A02;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        C0UV A01 = C0UV.A01();
        Context context = this.A01;
        synchronized (A01) {
            A05 = A01.A00.A05(context, resourceId, true);
        }
        return A05;
    }
}
