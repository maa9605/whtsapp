package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.search.verification.client.R;

/* renamed from: X.0bh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08560bh {
    public static final int[] A00 = {R.attr.colorPrimary};
    public static final int[] A01 = {R.attr.colorSecondary};

    public static TypedArray A00(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        A01(context, attributeSet, i, i2);
        A02(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static void A01(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08550bg.A0y, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            A03(context, A01, "Theme.MaterialComponents");
        }
        A03(context, A00, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r6.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(android.content.Context r7, android.util.AttributeSet r8, int[] r9, int r10, int r11, int... r12) {
        /*
            int[] r0 = X.C08550bg.A0y
            android.content.res.TypedArray r6 = r7.obtainStyledAttributes(r8, r0, r10, r11)
            r0 = 2
            r5 = 0
            boolean r0 = r6.getBoolean(r0, r5)
            if (r0 != 0) goto L12
            r6.recycle()
            return
        L12:
            r4 = -1
            int r3 = r12.length
            if (r3 != 0) goto L23
            int r0 = r6.getResourceId(r5, r4)
            if (r0 == r4) goto L1d
        L1c:
            r5 = 1
        L1d:
            r6.recycle()
            if (r5 == 0) goto L3c
            return
        L23:
            android.content.res.TypedArray r2 = r7.obtainStyledAttributes(r8, r9, r10, r11)
            r1 = 0
        L28:
            r0 = r12[r1]
            int r0 = r2.getResourceId(r0, r4)
            if (r0 != r4) goto L34
            r2.recycle()
            goto L1d
        L34:
            int r1 = r1 + 1
            if (r1 < r3) goto L28
            r2.recycle()
            goto L1c
        L3c:
            java.lang.String r1 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08560bh.A02(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void A03(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (!hasValue) {
            throw new IllegalArgumentException(C000200d.A0I("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }
}
