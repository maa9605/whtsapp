package X;

/* renamed from: X.1R8  reason: invalid class name */
/* loaded from: classes.dex */
public class C1R8 {
    public final C02640Cf A00;

    public C1R8(C02640Cf c02640Cf) {
        this.A00 = c02640Cf;
    }

    public C1R8(byte[] bArr) {
        this.A00 = AnonymousClass029.A13(bArr);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1R8)) {
            return this.A00.equals(((C1R8) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
