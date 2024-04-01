package X;

/* renamed from: X.0iw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C12150iw implements Comparable {
    public C0YK A00;
    public final /* synthetic */ C38401o5 A01;

    public C12150iw(C38401o5 c38401o5) {
        this.A01 = c38401o5;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return this.A00.A02 - ((C0YK) obj).A02;
    }

    public String toString() {
        String str = "[ ";
        if (this.A00 != null) {
            int i = 0;
            do {
                StringBuilder A0P = C000200d.A0P(str);
                A0P.append(this.A00.A09[i]);
                A0P.append(" ");
                str = A0P.toString();
                i++;
            } while (i < 9);
            StringBuilder A0V = C000200d.A0V(str, "] ");
            A0V.append(this.A00);
            return A0V.toString();
        }
        StringBuilder A0V2 = C000200d.A0V(str, "] ");
        A0V2.append(this.A00);
        return A0V2.toString();
    }
}
