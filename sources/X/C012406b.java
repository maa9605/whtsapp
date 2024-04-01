package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.06b  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C012406b {
    public static volatile C012406b A04;
    public final C05M A00;
    public final C012506c A01 = new C012506c();
    public final Map A02 = new ConcurrentHashMap();
    public final AtomicBoolean A03 = new AtomicBoolean();

    public C012406b(C05M c05m) {
        this.A00 = c05m;
    }

    public static C012406b A00() {
        if (A04 == null) {
            synchronized (C012406b.class) {
                if (A04 == null) {
                    A04 = new C012406b(C05M.A00());
                }
            }
        }
        return A04;
    }

    public void A01(C0IV c0iv) {
        Collection<C0IT> values;
        this.A01.A00(c0iv);
        for (AnonymousClass092 anonymousClass092 : this.A02.values()) {
            c0iv.AVl(anonymousClass092);
        }
        C05M c05m = this.A00;
        synchronized (c05m) {
            values = c05m.A0C().values();
        }
        for (C0IT c0it : values) {
            AnonymousClass092 anonymousClass0922 = c0it.A0P;
            if (anonymousClass0922 != null) {
                c0iv.AVl(anonymousClass0922);
            }
        }
    }

    public void A02(AbstractC005302j abstractC005302j) {
        C012506c c012506c = this.A01;
        synchronized (c012506c) {
            Iterator it = new HashSet(((LinkedHashMap) c012506c.A01.A06()).keySet()).iterator();
            while (it.hasNext()) {
                AnonymousClass094 anonymousClass094 = (AnonymousClass094) it.next();
                if (abstractC005302j.equals(anonymousClass094.A00)) {
                    c012506c.A01.A05(anonymousClass094);
                }
            }
            ArrayList arrayList = new ArrayList();
            for (AnonymousClass094 anonymousClass0942 : c012506c.A02.keySet()) {
                if (abstractC005302j.equals(anonymousClass0942.A00)) {
                    arrayList.add(anonymousClass0942);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c012506c.A02.remove((AnonymousClass094) it2.next());
            }
        }
        Iterator it3 = new HashSet(this.A02.keySet()).iterator();
        while (it3.hasNext()) {
            AnonymousClass094 anonymousClass0943 = (AnonymousClass094) it3.next();
            if (abstractC005302j.equals(anonymousClass0943.A00)) {
                this.A02.remove(anonymousClass0943);
            }
        }
    }

    public void A03(AnonymousClass094 anonymousClass094) {
        C012506c c012506c = this.A01;
        synchronized (c012506c) {
            c012506c.A02.remove(anonymousClass094);
            c012506c.A01.A05(anonymousClass094);
        }
        this.A02.remove(anonymousClass094);
        C05M c05m = this.A00;
        synchronized (c05m) {
            C0IT A07 = c05m.A07(anonymousClass094.A00);
            if (A07 != null) {
                AnonymousClass092 anonymousClass092 = A07.A0P;
                if (anonymousClass092 != null && anonymousClass092.A0n.equals(anonymousClass094)) {
                    A07.A0P = null;
                }
                AnonymousClass092 anonymousClass0922 = A07.A0O;
                if (anonymousClass0922 != null && anonymousClass0922.A0n.equals(anonymousClass094)) {
                    A07.A0O = null;
                }
            }
        }
    }

    public void A04(AnonymousClass092 anonymousClass092) {
        C012506c c012506c = this.A01;
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        c012506c.A01(anonymousClass094, anonymousClass092);
        C05M c05m = this.A00;
        synchronized (c05m) {
            C0IT A07 = c05m.A07(anonymousClass094.A00);
            if (A07 != null) {
                AnonymousClass092 anonymousClass0922 = A07.A0P;
                if (anonymousClass0922 != null && anonymousClass0922.A0n.equals(anonymousClass094)) {
                    A07.A0P = anonymousClass092;
                }
                AnonymousClass092 anonymousClass0923 = A07.A0O;
                if (anonymousClass0923 != null && anonymousClass0923.A0n.equals(anonymousClass094)) {
                    A07.A0O = anonymousClass092;
                }
            }
        }
    }
}
