package X;

import java.util.HashMap;

/* renamed from: X.1yQ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44041yQ {
    public final C44001yM A00;
    public final HashMap A01;

    public C44041yQ(C44001yM c44001yM, HashMap hashMap) {
        this.A00 = c44001yM;
        this.A01 = hashMap;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C44041yQ) {
            C44041yQ c44041yQ = (C44041yQ) obj;
            return this.A00.equals(c44041yQ.A00) && this.A01.equals(c44041yQ.A01);
        }
        return false;
    }

    public int hashCode() {
        return this.A01.hashCode() + ((this.A00.hashCode() + 159) * 53);
    }
}
