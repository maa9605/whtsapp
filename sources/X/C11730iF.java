package X;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: X.0iF  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C11730iF {
    public CharSequence A01 = null;
    public CharSequence A00 = null;
    public boolean A02 = true;
    public boolean A03 = false;

    public C11740iG A00() {
        if (!TextUtils.isEmpty(this.A01)) {
            if (!C07O.A0y(0)) {
                StringBuilder A0P = C000200d.A0P("Authenticator combination is unsupported on API ");
                A0P.append(Build.VERSION.SDK_INT);
                A0P.append(": ");
                A0P.append(String.valueOf(0));
                throw new IllegalArgumentException(A0P.toString());
            }
            boolean z = this.A03;
            if (TextUtils.isEmpty(this.A00) && !z) {
                throw new IllegalArgumentException("Negative text must be set and non-empty.");
            }
            if (!TextUtils.isEmpty(this.A00) && z) {
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }
            return new C11740iG(this.A01, this.A00, this.A02, this.A03);
        }
        throw new IllegalArgumentException("Title must be set and non-empty.");
    }
}
