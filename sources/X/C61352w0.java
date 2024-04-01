package X;

/* renamed from: X.2w0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C61352w0 {
    public final C2BT A00;

    public C61352w0(C2BT c2bt) {
        this.A00 = c2bt;
    }

    public void A00(String str) {
        C0CD c0cd = new C0CD(null, this.A00, true);
        try {
            c0cd.A02.A01("downloadable_gifs", "content_url LIKE ?", new String[]{str});
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    c0cd.close();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
