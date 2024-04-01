package X;

import java.util.Iterator;

/* renamed from: X.00k */
/* loaded from: classes.dex */
public class C000800k extends AnonymousClass009 {
    public static final C000800k A02 = new C000800k();
    public C05050Nc A00;
    public final Object A01 = new Object();

    public C05050Nc A02() {
        C05050Nc c05050Nc;
        synchronized (this.A01) {
            c05050Nc = this.A00;
        }
        return c05050Nc;
    }

    public void A03(C05050Nc c05050Nc) {
        C000700j.A01();
        synchronized (this.A01) {
            this.A00 = c05050Nc;
        }
        Iterator it = super.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((InterfaceC001000m) c0g5.next()).AIx(c05050Nc);
        }
    }
}
