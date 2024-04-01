package X;

/* renamed from: X.1VH  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VH extends AbstractC16450qQ {
    public final Throwable A00;

    public C1VH(Throwable exception) {
        this.A00 = exception;
    }

    public String toString() {
        return String.format("FAILURE (%s)", this.A00.getMessage());
    }
}
