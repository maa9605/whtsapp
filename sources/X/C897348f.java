package X;

/* renamed from: X.48f  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C897348f extends Exception {
    public final Exception innerException;

    public C897348f(Exception exc) {
        this.innerException = exc;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.innerException.toString();
    }
}
