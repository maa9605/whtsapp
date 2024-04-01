package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1zj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44831zj extends AbstractC44571zI {
    public final C02L A00;
    public final C05W A01;
    public final C018708s A02;
    public final AnonymousClass012 A03;
    public final C0C8 A04;

    public C44831zj(AnonymousClass012 anonymousClass012, C02L c02l, C05W c05w, C018708s c018708s, C44351yv c44351yv, C0C8 c0c8) {
        super(c44351yv);
        this.A03 = anonymousClass012;
        this.A00 = c02l;
        this.A01 = c05w;
        this.A02 = c018708s;
        this.A04 = c0c8;
    }

    public static final void A00(Jid jid, UserJid userJid, List list, Map map) {
        UserJid of = UserJid.of(jid);
        if (of == null || userJid.equals(jid) || !map.containsKey(of)) {
            return;
        }
        StringBuilder sb = new StringBuilder("contact-mutation-handler/populateJidList adding jid: ");
        sb.append(of);
        Log.i(sb.toString());
        list.add(of);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List A08(java.util.Collection r19, X.C44841zk r20) {
        /*
            r18 = this;
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            int r0 = r19.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            r4 = r18
            X.012 r0 = r4.A03
            long r10 = r0.A05()
            java.util.Iterator r7 = r19.iterator()
        L1a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r14 = r7.next()
            com.whatsapp.jid.UserJid r14 = (com.whatsapp.jid.UserJid) r14
            boolean r0 = r3.contains(r14)
            if (r0 != 0) goto L1a
            X.1zk r1 = X.C44841zk.A03
            r6 = r20
            boolean r0 = r6.equals(r1)
            r15 = 0
            if (r0 == 0) goto L7b
            X.05W r0 = r4.A01
            X.06C r5 = r0.A09(r14)
            if (r5 != 0) goto L5c
        L3f:
            boolean r0 = r6.equals(r1)
            if (r0 == 0) goto L5c
            java.lang.String r0 = "contact-sync-handler/create-contact-mutations given contact "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r14)
            java.lang.String r0 = " doesn't exist in DB but should"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0)
            goto L1a
        L5c:
            if (r5 == 0) goto L78
            java.lang.String r15 = r5.A0H
            X.08s r1 = r4.A02
            r0 = 0
            java.lang.String r16 = r1.A08(r5, r0)
        L67:
            r9 = 0
            r13 = 0
            r12 = r9
            r17 = r6
            X.1zo r8 = new X.1zo
            r8.<init>(r9, r10, r12, r13, r14, r15, r16, r17)
            r2.add(r8)
            r3.add(r14)
            goto L1a
        L78:
            r16 = r15
            goto L67
        L7b:
            r5 = r15
            goto L3f
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44831zj.A08(java.util.Collection, X.1zk):java.util.List");
    }

    public List A09(List list) {
        C02L c02l = this.A00;
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid == null) {
            Log.e("contact-mutation-handler/createBootstrapMutations me is null");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.A01.A05.A0V(arrayList, 1, false, false);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C06C c06c = (C06C) it.next();
            UserJid of = UserJid.of(c06c.A02());
            if (of != null) {
                hashMap.put(of, c06c);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C2GN c2gn = (C2GN) it2.next();
            AbstractC005302j abstractC005302j = c2gn.A01.A0A;
            if (C003101m.A0b(abstractC005302j)) {
                Log.i("contact-mutation-handler/createBootstrapMutations attempting to add jid from 1:1 chat");
                A00(abstractC005302j, userJid, arrayList2, hashMap);
            } else if (C003101m.A0U(abstractC005302j)) {
                C000200d.A0v("contact-mutation-handler/createBootstrapMutations attempting to add jids that messaged in group or were mentioned: ", abstractC005302j);
                for (AnonymousClass092 anonymousClass092 : c2gn.A02) {
                    A00(anonymousClass092.A0A(), userJid, arrayList3, hashMap);
                    List<Jid> list2 = anonymousClass092.A0c;
                    if (list2 != null) {
                        for (Jid jid : list2) {
                            A00(jid, userJid, arrayList3, hashMap);
                        }
                    }
                }
                C0C8 c0c8 = this.A04;
                GroupJid of2 = GroupJid.of(abstractC005302j);
                if (of2 != null) {
                    C07D A04 = c0c8.A01(of2).A04();
                    StringBuilder sb = new StringBuilder("contact-mutation-handler/createBootstrapMutations attempting to add all participant jids for group: ");
                    sb.append(abstractC005302j);
                    Log.i(sb.toString());
                    Iterator it3 = A04.iterator();
                    while (true) {
                        C04250Jl c04250Jl = (C04250Jl) it3;
                        if (c04250Jl.hasNext()) {
                            A00((Jid) c04250Jl.next(), userJid, arrayList4, hashMap);
                        }
                    }
                } else {
                    throw null;
                }
            } else {
                continue;
            }
        }
        List<Collection> asList = Arrays.asList(arrayList2, arrayList3, arrayList4, hashMap.keySet());
        ArrayList arrayList5 = new ArrayList();
        for (Collection collection : asList) {
            arrayList5.addAll(collection);
        }
        return A08(arrayList5, C44841zk.A03);
    }
}
