package X;

import java.util.Arrays;

/* renamed from: X.127  reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass127 {
    public int A00;
    public int A01;
    public int A02;
    public C223211z[] A03;
    public final int A04;
    public final boolean A05;
    public final C223211z[] A06;

    public AnonymousClass127() {
        if (1 != 0) {
            this.A05 = true;
            this.A04 = 32768;
            this.A01 = 0;
            this.A03 = new C223211z[100];
            this.A06 = new C223211z[1];
            return;
        }
        throw new IllegalArgumentException();
    }

    public synchronized void A00() {
        int i = this.A02;
        int i2 = this.A04;
        int max = Math.max(0, (((i + i2) - 1) / i2) - this.A00);
        int i3 = this.A01;
        if (max >= i3) {
            return;
        }
        Arrays.fill(this.A03, max, i3, (Object) null);
        this.A01 = max;
    }

    public synchronized void A01(int i) {
        boolean z = i < this.A02;
        this.A02 = i;
        if (z) {
            A00();
        }
    }

    public synchronized void A02(C223211z[] c223211zArr) {
        int i = this.A01;
        int length = c223211zArr.length;
        int i2 = i + length;
        C223211z[] c223211zArr2 = this.A03;
        C223211z[] c223211zArr3 = c223211zArr2;
        int length2 = c223211zArr2.length;
        if (i2 >= length2) {
            c223211zArr3 = (C223211z[]) Arrays.copyOf(c223211zArr2, Math.max(length2 << 1, i2));
            this.A03 = c223211zArr3;
        }
        for (C223211z c223211z : c223211zArr) {
            int i3 = this.A01;
            this.A01 = i3 + 1;
            c223211zArr3[i3] = c223211z;
        }
        this.A00 -= length;
        notifyAll();
    }
}
