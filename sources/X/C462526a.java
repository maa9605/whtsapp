package X;

import android.util.Base64;

/* renamed from: X.26a  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C462526a {
    public static volatile C462526a A01;
    public final C000500h A00;

    public C462526a(C000500h c000500h) {
        this.A00 = c000500h;
    }

    public static C462526a A00() {
        if (A01 == null) {
            synchronized (C462526a.class) {
                if (A01 == null) {
                    A01 = new C462526a(C000500h.A00());
                }
            }
        }
        return A01;
    }

    public void A01(byte[] bArr) {
        if (bArr.length <= 256) {
            C000500h c000500h = this.A00;
            if (c000500h != null) {
                C000200d.A0i(c000500h, "routing_info", Base64.encodeToString(bArr, 3));
                return;
            }
            throw null;
        }
        throw new IllegalArgumentException("The routing info should be smaller than 256 bytes.");
    }
}
