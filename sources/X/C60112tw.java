package X;

/* renamed from: X.2tw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C60112tw {
    public static volatile C60112tw A04;
    public final C0C9 A00;
    public final C03710Gt A01;
    public final C012406b A02;
    public final C05E A03;

    public C60112tw(C0C9 c0c9, C03710Gt c03710Gt, C012406b c012406b, C05E c05e) {
        this.A00 = c0c9;
        this.A01 = c03710Gt;
        this.A02 = c012406b;
        this.A03 = c05e;
    }

    public static final void A00(AbstractC005302j abstractC005302j, int i, int i2, C3AB c3ab) {
        if (c3ab != null) {
            C000500h c000500h = c3ab.A01.A02;
            C000200d.A0i(c000500h, "storage_usage_deletion_jid", abstractC005302j.getRawString());
            c000500h.A0D().putInt("storage_usage_deletion_current_msg_cnt", i2).putInt("storage_usage_deletion_all_msg_cnt", i).apply();
            c3ab.A00.ANO(i2, i);
        }
    }
}
