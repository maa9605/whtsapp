package X;

/* renamed from: X.07M  reason: invalid class name */
/* loaded from: classes.dex */
public enum C07M {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public boolean A00() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
