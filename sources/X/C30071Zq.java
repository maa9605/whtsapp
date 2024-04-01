package X;

import android.text.Layout;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.1Zq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30071Zq extends AnonymousClass113 implements Comparable {
    public final int A00;

    public C30071Zq(CharSequence charSequence, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        super(charSequence, alignment, null, f, 0, i, f2, i2, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, z, i3);
        this.A00 = i4;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        int i = ((C30071Zq) obj).A00;
        int i2 = this.A00;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }
}
