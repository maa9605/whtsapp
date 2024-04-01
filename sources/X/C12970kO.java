package X;

import android.net.Uri;

/* renamed from: X.0kO  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C12970kO {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Uri A03;
    public final boolean A04;

    public C12970kO(Uri uri, int i, int i2, boolean z, int i3) {
        if (uri != null) {
            this.A03 = uri;
            this.A01 = i;
            this.A02 = i2;
            this.A04 = z;
            this.A00 = i3;
            return;
        }
        throw null;
    }
}
