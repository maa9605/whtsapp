package X;

/* renamed from: X.281  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass281 implements InterfaceC04440Ke {
    public int A00;
    public boolean A01;
    public final C000500h A02;
    public final /* synthetic */ C22P A03;

    public AnonymousClass281(C22P c22p, C000500h c000500h, C22R c22r, boolean z) {
        this.A03 = c22p;
        this.A00 = 0;
        this.A02 = c000500h;
        this.A01 = z;
        int i = (c22r.A05 ? 1 : 0) + 0;
        this.A00 = i;
        int i2 = i + (c22r.A03 ? 1 : 0);
        this.A00 = i2;
        int i3 = i2 + (c22r.A04 ? 1 : 0);
        this.A00 = i3;
        this.A00 = i3 + (c22r.A01 ? 1 : 0);
    }

    public synchronized void A00(int i) {
        int i2 = this.A00 - 1;
        this.A00 = i2;
        if (this.A01 && i2 == 0) {
            this.A03.A07.A0P("account_sync", null);
        }
        if (i == 1) {
            C000200d.A0f(this.A02, "account_sync_status_num_retries");
        } else if (i == 2) {
            C000200d.A0f(this.A02, "account_sync_picture_num_retries");
        } else if (i == 3) {
            C000200d.A0f(this.A02, "account_sync_privacy_num_retries");
        } else if (i == 4) {
            C000200d.A0f(this.A02, "account_sync_blocklist_num_retries");
        }
    }
}
