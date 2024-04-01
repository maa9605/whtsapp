package X;

import android.text.TextUtils;

/* renamed from: X.3AE  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3AE extends AbstractC27811Ow {
    public C3AE(C06C c06c) {
        super(c06c);
    }

    @Override // X.AbstractC27811Ow
    public boolean A00(C06C c06c) {
        C06C c06c2 = this.A00;
        boolean z = !TextUtils.equals(c06c2.A0L, c06c.A0L);
        c06c.A0L = c06c2.A0L;
        c06c.A07 = c06c2.A07;
        return z;
    }
}
