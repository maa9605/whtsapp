package X;

/* renamed from: X.0In  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04100In extends Exception {
    public final int errorCode;

    public C04100In(int i, String str) {
        super(str);
        this.errorCode = i;
    }

    public C04100In(int i, String str, Throwable th) {
        super(str, th);
        this.errorCode = i;
    }
}
