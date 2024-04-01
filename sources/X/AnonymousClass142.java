package X;

/* renamed from: X.142  reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass142 extends UnsupportedOperationException {
    public final C30461ac zzar;

    public AnonymousClass142(C30461ac c30461ac) {
        this.zzar = c30461ac;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String valueOf = String.valueOf(this.zzar);
        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
