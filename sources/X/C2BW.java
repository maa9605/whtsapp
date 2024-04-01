package X;

/* renamed from: X.2BW  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2BW {
    public final String A00;

    public C2BW(String str) {
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2BW) {
            return ((C2BW) obj).A00.equals(this.A00);
        }
        return false;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("RecentGifIdentifier{fileHash='");
        A0P.append(this.A00);
        A0P.append('}');
        return A0P.toString();
    }
}
