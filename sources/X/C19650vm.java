package X;

import java.util.LinkedList;

/* renamed from: X.0vm  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19650vm {
    public int A00;
    public LinkedList A03;
    public C19650vm A02 = null;
    public C19650vm A01 = null;

    public C19650vm(int i, LinkedList linkedList) {
        this.A00 = i;
        this.A03 = linkedList;
    }

    public String toString() {
        return C000200d.A0K(C000200d.A0P("LinkedEntry(key: "), this.A00, ")");
    }
}
