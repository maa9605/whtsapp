package X;

import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.0vl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19640vl {
    public int A00;
    public final int A01;
    public final int A02;
    public final Queue A03;

    public C19640vl(int i, int i2, int i3) {
        C07K.A1Z(i > 0);
        C07K.A1Z(i2 >= 0);
        C07K.A1Z(i3 >= 0);
        this.A01 = i;
        this.A02 = i2;
        this.A03 = new LinkedList();
        this.A00 = i3;
    }

    public Object A00() {
        return this.A03.poll();
    }

    public void A01(Object obj) {
        this.A03.add(obj);
    }
}
