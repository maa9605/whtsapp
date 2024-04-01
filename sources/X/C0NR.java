package X;

/* renamed from: X.0NR */
/* loaded from: classes.dex */
public class C0NR {
    public final C0AD A00 = new C0AD();

    public void A00(Exception exc) {
        C0AD c0ad = this.A00;
        if (c0ad != null) {
            C07K.A1Q(exc, "Exception must not be null");
            synchronized (c0ad.A04) {
                if (c0ad.A02) {
                    return;
                }
                c0ad.A02 = true;
                c0ad.A00 = exc;
                c0ad.A03.A00(c0ad);
                return;
            }
        }
        throw null;
    }
}
