package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1ZQ  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZQ extends AnonymousClass100 {
    public final long A00;
    public final List A01;
    public final List A02;

    public C1ZQ(int i, long j) {
        super(i);
        this.A00 = j;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public C1ZQ A00(int i) {
        List list = this.A01;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1ZQ c1zq = (C1ZQ) list.get(i2);
            if (((AnonymousClass100) c1zq).A00 == i) {
                return c1zq;
            }
        }
        return null;
    }

    public C1ZR A01(int i) {
        List list = this.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1ZR c1zr = (C1ZR) list.get(i2);
            if (((AnonymousClass100) c1zr).A00 == i) {
                return c1zr;
            }
        }
        return null;
    }

    @Override // X.AnonymousClass100
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass100.A00(super.A00));
        sb.append(" leaves: ");
        sb.append(Arrays.toString(this.A02.toArray()));
        sb.append(" containers: ");
        sb.append(Arrays.toString(this.A01.toArray()));
        return sb.toString();
    }
}
