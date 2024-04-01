package X;

/* renamed from: X.0yW  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20930yW extends Exception {
    public final Throwable cause;
    public final int rendererIndex;
    public final int type;

    public C20930yW(int i, Throwable th, int i2) {
        super(th);
        this.type = i;
        this.cause = th;
        this.rendererIndex = i2;
    }
}
