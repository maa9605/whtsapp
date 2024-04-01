package X;

import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.008 */
/* loaded from: classes.dex */
public class AnonymousClass008 extends AnonymousClass009 {
    public static final AnonymousClass008 A01 = new AnonymousClass008();
    public C05470Ow A00;

    public void A02() {
        C000700j.A01();
        Iterator it = super.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((C0GA) c0g5.next()).A00();
        }
    }

    public void A03(AbstractC005302j abstractC005302j) {
        C000700j.A01();
        Iterator it = super.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((C0GA) c0g5.next()).A01(abstractC005302j);
        }
    }

    public void A04(AbstractC005302j abstractC005302j) {
        C000700j.A01();
        Iterator it = super.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((C0GA) c0g5.next()).A02(abstractC005302j);
        }
    }

    public void A05(UserJid userJid) {
        C000700j.A01();
        Iterator it = super.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((C0GA) c0g5.next()).A03(userJid);
        }
    }

    public void A06(UserJid userJid) {
        C000700j.A01();
        Iterator it = super.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((C0GA) c0g5.next()).A04(userJid);
        }
    }

    public void A07(Collection collection) {
        C000700j.A01();
        Iterator it = super.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((C0GA) c0g5.next()).A05(collection);
        }
    }
}
