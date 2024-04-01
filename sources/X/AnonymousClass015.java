package X;

import java.util.Random;

/* renamed from: X.015  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass015 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Random A03 = new Random();
    public final boolean A04;

    public AnonymousClass015(int i, int i2, int i3, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A04 = z;
    }

    public boolean A00() {
        return this.A03.nextInt(this.A02) == 0;
    }

    public boolean A01(Object obj) {
        if (obj == null) {
            return A00();
        }
        return obj.hashCode() % this.A02 == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass015.class != obj.getClass()) {
            return false;
        }
        AnonymousClass015 anonymousClass015 = (AnonymousClass015) obj;
        return this.A01 == anonymousClass015.A01 && this.A00 == anonymousClass015.A00 && this.A02 == anonymousClass015.A02 && this.A04 == anonymousClass015.A04;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + this.A00) * 31) + this.A02) * 31) + (this.A04 ? 1 : 0);
    }
}
