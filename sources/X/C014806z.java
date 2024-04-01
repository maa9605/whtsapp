package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.06z  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C014806z {
    public static volatile C014806z A03;
    public final AnonymousClass070 A00;
    public final C05B A01;
    public final C05E A02;

    public C014806z(C05B c05b, C05E c05e, AnonymousClass070 anonymousClass070) {
        this.A01 = c05b;
        this.A02 = c05e;
        this.A00 = anonymousClass070;
    }

    public static C014806z A00() {
        if (A03 == null) {
            synchronized (C014806z.class) {
                if (A03 == null) {
                    A03 = new C014806z(C05B.A00(), C05E.A00(), AnonymousClass070.A01());
                }
            }
        }
        return A03;
    }

    public AnonymousClass092 A01(AnonymousClass092 anonymousClass092, UserJid userJid, Map map, long j) {
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        AnonymousClass094 anonymousClass0942 = new AnonymousClass094(userJid, true, anonymousClass094.A01);
        C000700j.A07(anonymousClass092 instanceof AnonymousClass098);
        C000700j.A07(anonymousClass092.A0f);
        AnonymousClass092 A6G = ((AnonymousClass098) anonymousClass092).A6G(anonymousClass0942);
        A6G.A0a = null;
        A6G.A0d(anonymousClass094.A00);
        C0CM A02 = this.A00.A02(A6G, j);
        if (A02 != null) {
            map.put(DeviceJid.of(userJid), A02);
        }
        return A6G;
    }
}
