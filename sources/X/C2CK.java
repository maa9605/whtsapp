package X;

import com.whatsapp.util.Log;

/* renamed from: X.2CK  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2CK {
    public static volatile C2CK A02;
    public final C0E7 A00;
    public final C000500h A01;

    public C2CK(C0E7 c0e7, C000500h c000500h) {
        this.A00 = c0e7;
        this.A01 = c000500h;
    }

    public static C2CK A00() {
        if (A02 == null) {
            synchronized (C2CK.class) {
                if (A02 == null) {
                    A02 = new C2CK(C0E7.A00(), C000500h.A00());
                }
            }
        }
        return A02;
    }

    public void A01() {
        C000500h c000500h = this.A01;
        C000200d.A0g(c000500h, "sticker_store_backoff_attempt", 0);
        C000200d.A0h(c000500h, "sticker_store_backoff_time", 0L);
        c000500h.A0D().putLong("sticker_store_last_fetch_time", System.currentTimeMillis()).apply();
        Log.i("StickerRequestBackoffManager/clearAttempts");
    }

    public void A02() {
        C000500h c000500h = this.A01;
        int i = c000500h.A00.getInt("sticker_store_backoff_attempt", 0) + 1;
        C0J5 c0j5 = new C0J5(1L, 720L);
        c0j5.A03(i);
        long A01 = c0j5.A01();
        long currentTimeMillis = System.currentTimeMillis();
        C000200d.A0g(c000500h, "sticker_store_backoff_attempt", i);
        c000500h.A0D().putLong("sticker_store_backoff_time", currentTimeMillis + (60 * A01 * 1000)).apply();
        StringBuilder sb = new StringBuilder("StickerRequestBackoffManager/incrementAttempt/Backing off for ");
        sb.append(A01);
        sb.append(" minutes.");
        Log.e(sb.toString());
    }
}
