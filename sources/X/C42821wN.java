package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Collections;

/* renamed from: X.1wN  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42821wN {
    public static volatile C42821wN A05;
    public final C02L A00;
    public final C01J A01;
    public final C43071wo A02;
    public final C0EC A03;
    public final ExecutorC004702d A04;

    public C42821wN(C02L c02l, InterfaceC002901k interfaceC002901k, C01J c01j, C0EC c0ec, C43071wo c43071wo) {
        this.A00 = c02l;
        this.A03 = c0ec;
        this.A01 = c01j;
        this.A02 = c43071wo;
        this.A04 = new ExecutorC004702d(interfaceC002901k, false);
    }

    public static C42821wN A00() {
        if (A05 == null) {
            synchronized (C42821wN.class) {
                if (A05 == null) {
                    A05 = new C42821wN(C02L.A00(), C002801j.A00(), C01J.A00(), C0EC.A00(), C43071wo.A00());
                }
            }
        }
        return A05;
    }

    public C0IQ A01(UserJid userJid) {
        C0IO A0T = C002701i.A0T(DeviceJid.of(userJid));
        C01J c01j = this.A01;
        C0IP A0A = c01j.A0A(A0T);
        if (A0A == null) {
            return null;
        }
        C02L c02l = this.A00;
        c02l.A05();
        UserJid userJid2 = c02l.A03;
        if (userJid2 != null) {
            return c01j.A09(C40731sm.A0S(userJid2.user), Collections.emptyList(), C40731sm.A0S(A0T.A01), Collections.singletonList(A0A.A00));
        }
        throw null;
    }
}
