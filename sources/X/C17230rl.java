package X;

/* renamed from: X.0rl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17230rl {
    public static final C17230rl A02;
    public static final C17230rl A03;
    public final Throwable A00;
    public final boolean A01;

    static {
        if (AbstractC09620eR.A03) {
            return;
        }
        A02 = new C17230rl(false, null);
        A03 = new C17230rl(true, null);
    }

    public C17230rl(boolean wasInterrupted, Throwable cause) {
        this.A01 = wasInterrupted;
        this.A00 = cause;
    }
}
