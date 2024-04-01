package X;

/* renamed from: X.4B4  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4B4 extends Exception {
    public final int errorCode;
    public final String errorMessage;

    public C4B4(C4B5 c4b5) {
        super(c4b5.description);
        this.errorCode = c4b5.code;
        this.errorMessage = c4b5.description;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder A0P = C000200d.A0P("Error ");
        A0P.append(this.errorCode);
        A0P.append(" : ");
        A0P.append(this.errorMessage);
        return A0P.toString();
    }
}
