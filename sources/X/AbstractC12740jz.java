package X;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: X.0jz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12740jz {
    public int A00;
    public boolean A01;
    public final ComponentName A02;

    public void A00() {
    }

    public void A01() {
    }

    public void A02() {
    }

    public abstract void A04(Intent intent);

    public AbstractC12740jz(ComponentName componentName) {
        this.A02 = componentName;
    }

    public void A03(int i) {
        if (!this.A01) {
            this.A01 = true;
            this.A00 = i;
            return;
        }
        int i2 = this.A00;
        if (i2 == i) {
            return;
        }
        StringBuilder A0Q = C000200d.A0Q("Given job ID ", i, " is different than previous ");
        A0Q.append(i2);
        throw new IllegalArgumentException(A0Q.toString());
    }
}
