package X;

import java.util.Iterator;

/* renamed from: X.0Fh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03340Fh extends AnonymousClass038 {
    public static final C03340Fh A00 = new C03340Fh();

    public void A02() {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((C0GG) c0g5.next()).A00();
                }
            }
        }
    }

    public void A03(int i) {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((C0GG) c0g5.next()).A01(i);
                }
            }
        }
    }

    public void A04(AbstractC005302j abstractC005302j) {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((C0GG) c0g5.next()).A02(abstractC005302j);
                }
            }
        }
    }

    public void A05(AbstractC005302j abstractC005302j) {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((C0GG) c0g5.next()).A03(abstractC005302j);
                }
            }
        }
    }

    public void A06(AbstractC005302j abstractC005302j) {
        if (abstractC005302j != null) {
            synchronized (this.A00) {
                Iterator it = this.A00.iterator();
                while (true) {
                    C0G5 c0g5 = (C0G5) it;
                    if (c0g5.hasNext()) {
                        ((C0GG) c0g5.next()).A05(abstractC005302j);
                    }
                }
            }
            return;
        }
        throw null;
    }

    public void A07(AbstractC005302j abstractC005302j, boolean z) {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((C0GG) c0g5.next()).A08(abstractC005302j, z);
                }
            }
        }
    }
}
