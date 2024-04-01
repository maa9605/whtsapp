package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0Mg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04880Mg extends C0HK {
    public C02550Bw A00 = new C02550Bw();

    @Override // X.C0HL
    public void A02() {
        Iterator it = this.A00.iterator();
        while (true) {
            AbstractC09960f4 abstractC09960f4 = (AbstractC09960f4) it;
            if (!abstractC09960f4.hasNext()) {
                return;
            }
            C09090cd c09090cd = (C09090cd) ((Map.Entry) abstractC09960f4.next()).getValue();
            c09090cd.A01.A08(c09090cd);
        }
    }

    @Override // X.C0HL
    public void A03() {
        Iterator it = this.A00.iterator();
        while (true) {
            AbstractC09960f4 abstractC09960f4 = (AbstractC09960f4) it;
            if (!abstractC09960f4.hasNext()) {
                return;
            }
            C09090cd c09090cd = (C09090cd) ((Map.Entry) abstractC09960f4.next()).getValue();
            c09090cd.A01.A09(c09090cd);
        }
    }

    public void A0C(C0HL c0hl, InterfaceC05620Pl interfaceC05620Pl) {
        C09090cd c09090cd = new C09090cd(c0hl, interfaceC05620Pl);
        C09090cd c09090cd2 = (C09090cd) this.A00.A02(c0hl, c09090cd);
        if (c09090cd2 != null) {
            if (c09090cd2.A02 != interfaceC05620Pl) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
        } else if (super.A00 > 0) {
            c09090cd.A01.A08(c09090cd);
        }
    }
}
