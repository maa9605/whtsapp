package X;

import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0E8  reason: invalid class name */
/* loaded from: classes.dex */
public class C0E8 {
    public static volatile C0E8 A05;
    public final AbstractC000600i A00;
    public final C02L A01;
    public final C0C8 A02;
    public final C0E9 A03;
    public final C0EC A04;

    public C0E8(AbstractC000600i abstractC000600i, C02L c02l, C0EC c0ec, C0E9 c0e9, C0C8 c0c8) {
        this.A00 = abstractC000600i;
        this.A01 = c02l;
        this.A04 = c0ec;
        this.A03 = c0e9;
        this.A02 = c0c8;
    }

    public static C0E8 A00() {
        if (A05 == null) {
            synchronized (C0E8.class) {
                if (A05 == null) {
                    A05 = new C0E8(AbstractC000600i.A00(), C02L.A00(), C0EC.A00(), C0E9.A00(), C0C8.A00());
                }
            }
        }
        return A05;
    }

    public final Set A01(AbstractC005302j abstractC005302j) {
        AbstractC011205o abstractC011205o;
        if (abstractC005302j instanceof UserJid) {
            C0EC c0ec = this.A04;
            HashSet A02 = c0ec.A02().A02();
            if (!this.A01.A0A(abstractC005302j)) {
                UserJid of = UserJid.of(abstractC005302j);
                if (of != null) {
                    A02.addAll(c0ec.A06(of));
                } else {
                    throw null;
                }
            }
            return A02;
        }
        HashSet hashSet = new HashSet();
        C0C8 c0c8 = this.A02;
        if ((abstractC005302j instanceof AbstractC011205o) && (abstractC011205o = (AbstractC011205o) abstractC005302j) != null) {
            Iterator it = c0c8.A01(abstractC011205o).A05().iterator();
            while (true) {
                C04250Jl c04250Jl = (C04250Jl) it;
                if (c04250Jl.hasNext()) {
                    hashSet.addAll(C07D.A01(((C0D7) c04250Jl.next()).A04.keySet()).A02());
                } else {
                    C02L c02l = this.A01;
                    c02l.A05();
                    hashSet.remove(c02l.A02);
                    return hashSet;
                }
            }
        } else {
            throw null;
        }
    }

    public Set A02(AnonymousClass092 anonymousClass092) {
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (anonymousClass094.A02) {
            Set A03 = A03(anonymousClass092);
            if (A03 != null && (abstractC005302j instanceof AbstractC011205o) && anonymousClass092.A0C != 0) {
                A03.addAll(A01(abstractC005302j));
            }
            return A03;
        }
        return null;
    }

    public final Set A03(AnonymousClass092 anonymousClass092) {
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (abstractC005302j instanceof AbstractC011205o) {
            Set A04 = this.A03.A04(anonymousClass094);
            HashSet hashSet = new HashSet(A04);
            for (UserJid userJid : C003101m.A0I(this.A00, A04)) {
                hashSet.addAll(this.A04.A06(userJid));
            }
            hashSet.addAll(this.A04.A02().A02());
            C02L c02l = this.A01;
            c02l.A05();
            hashSet.remove(c02l.A02);
            return hashSet;
        } else if (abstractC005302j instanceof UserJid) {
            return A01(abstractC005302j);
        } else {
            return null;
        }
    }
}
