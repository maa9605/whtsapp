package X;

import java.util.Arrays;

/* renamed from: X.2A7  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2A7 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;

    public C2A7(int i, int i2, long j, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = j;
        this.A02 = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2A7) {
            C2A7 c2a7 = (C2A7) obj;
            return this.A00 == c2a7.A00 && this.A01 == c2a7.A01 && this.A03 == c2a7.A03 && this.A02 == c2a7.A02;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), Long.valueOf(this.A03), Integer.valueOf(this.A02)});
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("UserNoticeMetadata{noticeId=");
        A0P.append(this.A00);
        A0P.append(", stage=");
        A0P.append(this.A01);
        A0P.append(", timestamp=");
        A0P.append(this.A03);
        A0P.append(", version=");
        A0P.append(this.A02);
        A0P.append('}');
        return A0P.toString();
    }
}
