package X;

/* renamed from: X.2BS  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2BS {
    public final C2BT A00;

    public C2BS(C2BT c2bt) {
        this.A00 = c2bt;
    }

    public void A00(C2BR c2br) {
        C0CD c0cd = new C0CD(null, this.A00, true);
        try {
            c0cd.A02.A01("gifs", "plain_file_hash LIKE ?", new String[]{c2br.A04});
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
