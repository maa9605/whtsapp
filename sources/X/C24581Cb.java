package X;

/* renamed from: X.1Cb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C24581Cb extends Exception {
    public EnumC10110fJ errorType;
    public String message;

    public C24581Cb(EnumC10110fJ enumC10110fJ, String str) {
        super(str);
        this.message = str;
        this.errorType = enumC10110fJ;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder A0P = C000200d.A0P("Error type: ");
        A0P.append(this.errorType);
        A0P.append(". ");
        A0P.append(this.message);
        return A0P.toString();
    }
}
