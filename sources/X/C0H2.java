package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0H2  reason: invalid class name */
/* loaded from: classes.dex */
public class C0H2 {
    public static volatile C0H2 A0B;
    public final C02L A00;
    public final C05W A01;
    public final AnonymousClass075 A02;
    public final AnonymousClass012 A03;
    public final C01J A04;
    public final C01R A05;
    public final C05E A06;
    public final C0FE A07;
    public final C0F3 A08;
    public final C0EB A09;
    public final C0EC A0A;

    public C0H2(AnonymousClass012 anonymousClass012, C02L c02l, C0EB c0eb, C05W c05w, C01R c01r, C01J c01j, C0EC c0ec, AnonymousClass075 anonymousClass075, C05E c05e, C0F3 c0f3, C0FE c0fe) {
        this.A03 = anonymousClass012;
        this.A00 = c02l;
        this.A09 = c0eb;
        this.A05 = c01r;
        this.A01 = c05w;
        this.A04 = c01j;
        this.A0A = c0ec;
        this.A02 = anonymousClass075;
        this.A06 = c05e;
        this.A08 = c0f3;
        this.A07 = c0fe;
    }

    public final Set A00(int i, ArrayList arrayList) {
        HashSet hashSet;
        if (i != 2 && i != 0) {
            if (i == 1) {
                hashSet = new HashSet();
                Iterator it = ((AbstractCollection) this.A09.A0A()).iterator();
                while (it.hasNext()) {
                    AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
                    UserJid of = UserJid.of(abstractC005302j);
                    C06C A09 = this.A01.A09(abstractC005302j);
                    if (of != null && A09 != null && A09.A08 != null && !this.A02.A02(of)) {
                        hashSet.add(of);
                        arrayList.add(A09);
                    }
                }
            } else {
                throw new IllegalStateException("unknown status distribution mode");
            }
        } else {
            HashSet hashSet2 = new HashSet();
            if (i != 0) {
                Iterator it2 = ((AbstractCollection) this.A09.A09()).iterator();
                while (it2.hasNext()) {
                    hashSet2.add(UserJid.of((Jid) it2.next()));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            this.A01.A05.A0V(arrayList2, 1, false, false);
            hashSet = new HashSet(arrayList2.size(), 1.0f);
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C06C c06c = (C06C) it3.next();
                UserJid userJid = (UserJid) c06c.A03(UserJid.class);
                if (userJid != null && !hashSet2.contains(userJid) && !this.A02.A02(userJid)) {
                    hashSet.add(userJid);
                    arrayList.add(c06c);
                }
            }
        }
        return hashSet;
    }
}
