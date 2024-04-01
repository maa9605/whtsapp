package X;

import java.util.Arrays;

/* renamed from: X.0Nx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C05250Nx {
    public final int A00;
    public final long A01;

    public C05250Nx(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C05250Nx)) {
            return false;
        }
        C05250Nx c05250Nx = (C05250Nx) obj;
        return this.A00 == c05250Nx.A00 && this.A01 == c05250Nx.A01;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Long.valueOf(this.A01)});
    }
}
