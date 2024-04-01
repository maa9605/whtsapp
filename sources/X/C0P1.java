package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0P1  reason: invalid class name */
/* loaded from: classes.dex */
public class C0P1 extends AnonymousClass068 {
    public final /* synthetic */ C05W A00;

    public C0P1(C05W c05w) {
        this.A00 = c05w;
    }

    @Override // X.AnonymousClass068
    public void A00(C06C c06c) {
        C06A c06a = this.A00.A03;
        c06a.A01.remove(c06c.A03(AbstractC005302j.class));
    }

    @Override // X.AnonymousClass068
    public void A01(final Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C06A c06a = this.A00.A03;
            c06a.A01.remove(((C06C) it.next()).A03(AbstractC005302j.class));
        }
        this.A00.A00.post(new Runnable() { // from class: X.1ND
            @Override // java.lang.Runnable
            public final void run() {
                C0P1 c0p1 = C0P1.this;
                Collection collection2 = collection;
                AnonymousClass008 anonymousClass008 = c0p1.A00.A06;
                C000700j.A01();
                Iterator it2 = ((AnonymousClass009) anonymousClass008).A00.iterator();
                while (true) {
                    C0G5 c0g5 = (C0G5) it2;
                    if (c0g5.hasNext()) {
                        ((C0GA) c0g5.next()).A06(collection2);
                    } else {
                        return;
                    }
                }
            }
        });
    }

    @Override // X.AnonymousClass068
    public void A02(final Collection collection) {
        C05W c05w = this.A00;
        c05w.A00.post(new Runnable() { // from class: X.1NC
            @Override // java.lang.Runnable
            public final void run() {
                C0P1 c0p1 = C0P1.this;
                Collection collection2 = collection;
                AnonymousClass008 anonymousClass008 = c0p1.A00.A06;
                C000700j.A01();
                Iterator it = ((AnonymousClass009) anonymousClass008).A00.iterator();
                while (true) {
                    C0G5 c0g5 = (C0G5) it;
                    if (c0g5.hasNext()) {
                        ((C0GA) c0g5.next()).A07(collection2);
                    } else {
                        return;
                    }
                }
            }
        });
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C06A c06a = c05w.A03;
            c06a.A01.remove(((C06C) it.next()).A03(AbstractC005302j.class));
        }
    }

    @Override // X.AnonymousClass068
    public void A03(Collection collection) {
        C05W c05w = this.A00;
        c05w.A04.A02(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C06C c06c = (C06C) it.next();
            C011505r c011505r = c05w.A07;
            c011505r.A05(c06c);
            if (c011505r != null) {
                c011505r.A06(c06c.A04());
                c06c.A0R = true;
            } else {
                throw null;
            }
        }
    }
}
