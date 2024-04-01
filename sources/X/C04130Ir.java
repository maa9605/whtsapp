package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0Ir */
/* loaded from: classes.dex */
public class C04130Ir {
    public AnonymousClass097 A00;
    public final CopyOnWriteArrayList A01;

    public C04130Ir(List list) {
        this.A01 = new CopyOnWriteArrayList(list);
        AnonymousClass097 anonymousClass097 = (AnonymousClass097) list.get(0);
        this.A00 = anonymousClass097;
        C09H c09h = anonymousClass097.A02;
        C000700j.A08(c09h != null, "First media data is null");
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass097 anonymousClass0972 = (AnonymousClass097) it.next();
            C09H c09h2 = anonymousClass0972.A02;
            C000700j.A08(c09h2 != null, "Media data is null");
            C000700j.A08(this.A00.A0m == anonymousClass0972.A0m, "Media type mismatch");
            C000700j.A08(((AnonymousClass092) this.A00).A04 == ((AnonymousClass092) anonymousClass0972).A04, "Origin mismatch");
            C000700j.A08(AnonymousClass024.A0l(this.A00.A1A(), anonymousClass0972.A1A()), "Caption mismatch");
            C000700j.A08(AnonymousClass024.A0l(this.A00.A06, anonymousClass0972.A06), "Hash mismatch");
            C000700j.A08(AnonymousClass024.A0l(this.A00.A05, anonymousClass0972.A05), "Encrypted hash mismatch");
            C000700j.A08(this.A00.A00 == anonymousClass0972.A00, "Duration mismatch");
            C000700j.A08(AnonymousClass024.A0l(this.A00.A07, anonymousClass0972.A07), "Mime mismatch");
            C000700j.A08(AnonymousClass024.A0l(this.A00.A1B(), anonymousClass0972.A1B()), "Name mismatch");
            C000700j.A08(AnonymousClass024.A0l(this.A00.A0A, anonymousClass0972.A0A), "Multicast id mismatch");
            if (c09h != null) {
                String str = c09h.A0I;
                if (c09h2 != null) {
                    C000700j.A08(AnonymousClass024.A0l(str, c09h2.A0I), "Media Job Id mismatch");
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }

    public synchronized AnonymousClass097 A00() {
        return this.A00;
    }

    public final AnonymousClass097 A01(AnonymousClass094 anonymousClass094) {
        if (anonymousClass094 == null) {
            return null;
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass097 anonymousClass097 = (AnonymousClass097) it.next();
            if (anonymousClass094.equals(anonymousClass097.A0n)) {
                return anonymousClass097;
            }
        }
        return null;
    }

    public String A02() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
            if (sb.length() != 0) {
                sb.append(',');
            }
            sb.append(anonymousClass092.A0n);
        }
        return sb.toString();
    }

    public synchronized void A03(AnonymousClass094 anonymousClass094) {
        StringBuilder sb = new StringBuilder();
        sb.append("messagelist/remove ");
        sb.append(anonymousClass094);
        sb.append(" from ");
        sb.append(A02());
        Log.i(sb.toString());
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        copyOnWriteArrayList.remove(A01(anonymousClass094));
        if (!copyOnWriteArrayList.isEmpty()) {
            this.A00 = (AnonymousClass097) copyOnWriteArrayList.get(0);
        }
    }

    public boolean A04() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            if (C003101m.A0Z(((AnonymousClass092) it.next()).A0n.A00)) {
                return true;
            }
        }
        return false;
    }

    public synchronized boolean A05() {
        return this.A01.size() == 0;
    }
}
