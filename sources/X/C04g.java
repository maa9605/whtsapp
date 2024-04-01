package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Iterator;

/* renamed from: X.04g  reason: invalid class name */
/* loaded from: classes.dex */
public class C04g extends AnonymousClass038 {
    public static volatile C04g A01;
    public final C01R A00;

    public C04g(C01R c01r) {
        this.A00 = c01r;
    }

    public static C04g A00() {
        if (A01 == null) {
            synchronized (C04g.class) {
                if (A01 == null) {
                    A01 = new C04g(C01R.A02);
                }
            }
        }
        return A01;
    }

    public void A02(DeviceJid deviceJid) {
        this.A00.A00();
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC04210Jh) c0g5.next()).AL0(deviceJid);
                }
            }
        }
    }

    public void A03(DeviceJid deviceJid) {
        this.A00.A00();
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC04210Jh) c0g5.next()).AL1(deviceJid);
                }
            }
        }
    }

    public void A04(DeviceJid deviceJid) {
        this.A00.A00();
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC04210Jh) c0g5.next()).AL2(deviceJid);
                }
            }
        }
    }
}
