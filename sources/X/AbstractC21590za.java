package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.0za  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC21590za {
    public int A00;

    public final boolean A00() {
        return (this.A00 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE;
    }

    public final boolean A01() {
        return (this.A00 & 4) == 4;
    }
}
