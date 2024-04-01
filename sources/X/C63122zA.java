package X;

/* renamed from: X.2zA  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C63122zA extends Exception {
    public final int downloadStatus;

    public C63122zA(int i) {
        this.downloadStatus = i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder A0P = C000200d.A0P("DownloadResultException{downloadStatus=");
        A0P.append(C04020Ic.A00(this.downloadStatus));
        A0P.append('}');
        return A0P.toString();
    }
}
