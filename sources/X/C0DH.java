package X;

import android.graphics.BitmapFactory;

/* renamed from: X.0DH  reason: invalid class name */
/* loaded from: classes.dex */
public class C0DH {
    public final int A00;
    public final int A01;
    public final BitmapFactory.Options A02;
    public final Long A03;
    public final boolean A04;

    public C0DH(int i, int i2) {
        this(i, i2, null, false, null);
    }

    public C0DH(int i, int i2, Long l, boolean z, BitmapFactory.Options options) {
        boolean z2 = i >= 2 && i2 >= 2 && (l == null || l.longValue() > 0) && (!z || i == i2);
        StringBuilder A0R = C000200d.A0R("bitmaputils/bitmapspec/wrong/", i, ",", i2, ",");
        A0R.append(l);
        A0R.append(",");
        A0R.append(z);
        C000700j.A08(z2, A0R.toString());
        if (!z2) {
            this.A01 = Integer.MAX_VALUE;
            this.A00 = Integer.MAX_VALUE;
            this.A03 = null;
            this.A04 = false;
        } else {
            this.A01 = i;
            this.A00 = i2;
            this.A03 = l;
            this.A04 = z;
        }
        this.A02 = options == null ? new BitmapFactory.Options() : options;
    }
}
