package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.AbstractMap;

/* renamed from: X.0F5  reason: invalid class name */
/* loaded from: classes.dex */
public class C0F5 {
    public static volatile C0F5 A04;
    public final C05B A00;
    public final C05E A01;
    public final C05L A02;
    public final C0F6 A03 = new C0F6();

    public C0F5(C05B c05b, C05E c05e, C05L c05l) {
        this.A00 = c05b;
        this.A02 = c05l;
        this.A01 = c05e;
    }

    public final void A00(C0CD c0cd, final UserJid userJid) {
        Runnable runnable = new Runnable() { // from class: X.1Ox
            @Override // java.lang.Runnable
            public final void run() {
                C0F5 c0f5 = C0F5.this;
                UserJid userJid2 = userJid;
                synchronized (c0f5) {
                    c0f5.A03.A00.remove(userJid2);
                }
            }
        };
        C000700j.A07(c0cd.A02.A00.inTransaction());
        C04l c04l = c0cd.A01;
        C27761Oq c27761Oq = new C27761Oq(runnable);
        Object obj = c04l.A01.get();
        if (obj != null) {
            ((AbstractMap) obj).put(userJid, c27761Oq);
            return;
        }
        throw null;
    }

    public final void A01(UserJid userJid, DeviceJid deviceJid, long j) {
        C05B c05b = this.A00;
        long A02 = c05b.A02(userJid);
        long A022 = c05b.A02(deviceJid);
        C0CF A01 = this.A02.A01("INSERT OR IGNORE INTO user_device(    user_jid_row_id,    device_jid_row_id,    key_index) VALUES (?, ?, ?)");
        A01.A04(1, A02);
        A01.A04(2, A022);
        A01.A04(3, j);
        A01.A01();
    }
}
