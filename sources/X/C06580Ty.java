package X;

import android.content.res.Configuration;

/* renamed from: X.0Ty  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C06580Ty extends C0MU {
    public int A00;
    public final C0HK A01 = new C0HK();

    public void A02(Configuration configuration) {
        int i = AbstractC004101x.A00;
        if (i != 3 && i != -1) {
            this.A01.A0B(0);
            return;
        }
        int i2 = configuration.uiMode & 48;
        if (this.A00 == i2) {
            this.A01.A0B(0);
        } else if (i2 == 16 || i2 == 32) {
            this.A01.A0B(1);
        }
    }
}
