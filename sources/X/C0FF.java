package X;

import java.util.Map;

/* renamed from: X.0FF  reason: invalid class name */
/* loaded from: classes.dex */
public class C0FF {
    public static volatile C0FF A02;
    public final C01B A00;
    public final C0FG A01;

    public C0FF(C01B c01b, C0FG c0fg) {
        this.A00 = c01b;
        this.A01 = c0fg;
    }

    public static C0FF A00() {
        if (A02 == null) {
            synchronized (C0F4.class) {
                if (A02 == null) {
                    C01B A00 = C01B.A00();
                    if (C0FG.A05 == null) {
                        synchronized (C0FG.class) {
                            if (C0FG.A05 == null) {
                                C0FG.A05 = new C0FG(C05B.A00(), C05L.A00(), C05E.A00());
                            }
                        }
                    }
                    A02 = new C0FF(A00, C0FG.A05);
                }
            }
        }
        return A02;
    }

    public void A01(C011005l c011005l, long j) {
        if (A03()) {
            C0FG c0fg = this.A01;
            C0CD A04 = c0fg.A01.A04();
            try {
                C03790Hb A00 = A04.A00();
                C0CF A01 = c0fg.A02.A01("UPDATE group_notification_version SET participant_version = ? WHERE group_jid_row_id = ?");
                A01.A04(1, j);
                A01.A04(2, c0fg.A00.A02(c011005l));
                if (A01.A00() != 1) {
                    c0fg.A03(c011005l, 0L, 0L, j);
                }
                A00.A00();
                A00.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        A04.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public void A02(C011005l c011005l, long j) {
        if (A03()) {
            Map map = this.A01.A04;
            synchronized (map) {
                map.put(c011005l, Long.valueOf(j));
            }
        }
    }

    public boolean A03() {
        return this.A00.A0E(C01C.A1L);
    }
}
