package X;

import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.08s */
/* loaded from: classes.dex */
public class C018708s {
    public static volatile C018708s A08;
    public final C02L A00;
    public final C05W A01;
    public final AnonymousClass008 A02;
    public final C001200o A03;
    public final C002301c A04;
    public final C05M A05;
    public final C0C8 A06;
    public final ConcurrentHashMap A07 = new ConcurrentHashMap();

    public C018708s(C001200o c001200o, C02L c02l, C05M c05m, C05W c05w, C002301c c002301c, AnonymousClass008 anonymousClass008, C0C8 c0c8) {
        this.A03 = c001200o;
        this.A00 = c02l;
        this.A05 = c05m;
        this.A01 = c05w;
        this.A04 = c002301c;
        this.A02 = anonymousClass008;
        this.A06 = c0c8;
    }

    public static C018708s A00() {
        if (A08 == null) {
            synchronized (C018708s.class) {
                if (A08 == null) {
                    A08 = new C018708s(C001200o.A01, C02L.A00(), C05M.A00(), C05W.A00(), C002301c.A00(), AnonymousClass008.A01, C0C8.A00());
                }
            }
        }
        return A08;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.CharSequence A01(X.C002301c r3, X.C06C r4) {
        /*
            java.lang.Integer r2 = r4.A0C
            r0 = 0
            if (r2 == 0) goto Lca
            int r1 = r2.intValue()
            if (r1 != 0) goto Le
            java.lang.String r0 = r4.A0J
            return r0
        Le:
            if (r2 == 0) goto L13
            switch(r1) {
                case 1: goto Lb8;
                case 2: goto Lb0;
                case 3: goto La8;
                case 4: goto La0;
                case 5: goto L98;
                case 6: goto L90;
                case 7: goto L88;
                case 8: goto L80;
                case 9: goto L78;
                case 10: goto L70;
                case 11: goto L68;
                case 12: goto L60;
                case 13: goto L58;
                case 14: goto L50;
                case 15: goto L48;
                case 16: goto L40;
                case 17: goto L37;
                case 18: goto L2e;
                case 19: goto L25;
                case 20: goto L1c;
                default: goto L13;
            }
        L13:
            int r0 = android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(r1)
            java.lang.String r0 = r3.A07(r0)
            return r0
        L1c:
            r0 = 2131889190(0x7f120c26, float:1.9413037E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lbf
        L25:
            r0 = 2131889181(0x7f120c1d, float:1.9413018E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lbf
        L2e:
            r0 = 2131889200(0x7f120c30, float:1.9413057E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lbf
        L37:
            r0 = 2131889199(0x7f120c2f, float:1.9413055E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lbf
        L40:
            r0 = 2131889197(0x7f120c2d, float:1.941305E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lbf
        L48:
            r0 = 2131889196(0x7f120c2c, float:1.9413049E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lbf
        L50:
            r0 = 2131889195(0x7f120c2b, float:1.9413047E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lbf
        L58:
            r0 = 2131889193(0x7f120c29, float:1.9413043E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lbf
        L60:
            r0 = 2131889189(0x7f120c25, float:1.9413035E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lbf
        L68:
            r0 = 2131889188(0x7f120c24, float:1.9413033E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lbf
        L70:
            r0 = 2131889184(0x7f120c20, float:1.9413024E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lbf
        L78:
            r0 = 2131889183(0x7f120c1f, float:1.9413022E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lbf
        L80:
            r0 = 2131889182(0x7f120c1e, float:1.941302E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lbf
        L88:
            r0 = 2131889192(0x7f120c28, float:1.941304E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lbf
        L90:
            r0 = 2131889194(0x7f120c2a, float:1.9413045E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lbf
        L98:
            r0 = 2131889185(0x7f120c21, float:1.9413026E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lbf
        La0:
            r0 = 2131889186(0x7f120c22, float:1.9413028E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lbf
        La8:
            r0 = 2131889198(0x7f120c2e, float:1.9413053E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lbf
        Lb0:
            r0 = 2131889191(0x7f120c27, float:1.9413039E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lbf
        Lb8:
            r0 = 2131889187(0x7f120c23, float:1.941303E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        Lbf:
            if (r0 == 0) goto L13
            int r0 = r0.intValue()
            java.lang.String r0 = r3.A06(r0)
            return r0
        Lca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018708s.A01(X.01c, X.06C):java.lang.CharSequence");
    }

    public static String A02(C06C c06c, boolean z) {
        if (C003101m.A0Y(c06c.A02())) {
            return c06c.A05();
        }
        int i = c06c.A03;
        if (i == 3) {
            if (!z && c06c.A08 != null && !TextUtils.isEmpty(c06c.A0F)) {
                return c06c.A0F;
            }
            return c06c.A05();
        } else if (i != 2 && i != 1) {
            if (c06c.A0C() && c06c.A0S) {
                return c06c.A0F;
            }
            return null;
        } else if (c06c.A08 != null || !TextUtils.isEmpty(c06c.A0F)) {
            return c06c.A0F;
        } else {
            return null;
        }
    }

    public final int A03(C0I1 c0i1) {
        C02630Ce A01 = this.A06.A01(c0i1);
        boolean A0B = A01.A0B(this.A00);
        int size = A01.A01.size();
        if (A0B) {
            return size - 1;
        }
        return size;
    }

    public String A04(C06C c06c) {
        if (c06c.A08 != null && !TextUtils.isEmpty(c06c.A0H) && !c06c.A0E()) {
            return c06c.A0H;
        }
        return A08(c06c, false);
    }

    public String A05(C06C c06c) {
        if (C003101m.A0Z(c06c.A02())) {
            return this.A03.A00.getString(R.string.my_status);
        }
        if (c06c.A0E()) {
            return A02(c06c, false);
        }
        if (!TextUtils.isEmpty(c06c.A0F)) {
            return c06c.A0F;
        }
        if (!TextUtils.isEmpty(c06c.A0D)) {
            return c06c.A0D;
        }
        if (c06c.A0C()) {
            String A0A = this.A05.A0A((AbstractC005302j) c06c.A03(AbstractC005302j.class));
            return TextUtils.isEmpty(A0A) ? this.A03.A00.getString(R.string.group_subject_unknown) : A0A;
        } else if (c06c.A0D()) {
            Jid A03 = c06c.A03(C0I1.class);
            if (A03 != null) {
                int A032 = A03((C0I1) A03);
                return this.A03.A00.getResources().getQuantityString(R.plurals.broadcast_n_recipients, A032, Integer.valueOf(A032));
            }
            throw null;
        } else {
            String A0A2 = this.A05.A0A((AbstractC005302j) c06c.A03(AbstractC005302j.class));
            return TextUtils.isEmpty(A0A2) ? this.A04.A0F(C04630Le.A00(c06c)) : A0A2;
        }
    }

    public String A06(C06C c06c) {
        if (C003101m.A0Z(c06c.A02())) {
            return this.A03.A00.getString(R.string.my_status);
        }
        if (c06c.A0E()) {
            return A02(c06c, false);
        }
        if (!TextUtils.isEmpty(c06c.A0F)) {
            return c06c.A0F;
        }
        if (c06c.A0C()) {
            String A0A = this.A05.A0A((AbstractC005302j) c06c.A03(AbstractC005302j.class));
            return TextUtils.isEmpty(A0A) ? this.A03.A00.getString(R.string.group_subject_unknown) : A0A;
        } else if (c06c.A0D()) {
            Jid A03 = c06c.A03(C0I1.class);
            if (A03 != null) {
                int A032 = A03((C0I1) A03);
                return this.A03.A00.getResources().getQuantityString(R.plurals.broadcast_n_recipients, A032, Integer.valueOf(A032));
            }
            throw null;
        } else {
            String A0A2 = this.A05.A0A((AbstractC005302j) c06c.A03(AbstractC005302j.class));
            if (TextUtils.isEmpty(A0A2)) {
                if (!TextUtils.isEmpty(c06c.A0O)) {
                    StringBuilder A0P = C000200d.A0P("~");
                    A0P.append(c06c.A0O);
                    return A0P.toString();
                }
                return this.A04.A0F(C04630Le.A00(c06c));
            }
            return A0A2;
        }
    }

    public String A07(C06C c06c) {
        if (c06c.A0B() || TextUtils.isEmpty(c06c.A0O)) {
            return (!c06c.A0B() || c06c.A09() || TextUtils.isEmpty(c06c.A05())) ? "" : this.A03.A00.getString(R.string.conversation_header_pushname, c06c.A05());
        }
        return this.A03.A00.getString(R.string.conversation_header_pushname, c06c.A0O);
    }

    public String A08(C06C c06c, boolean z) {
        String A09 = A09(c06c, z);
        return TextUtils.isEmpty(A09) ? this.A04.A0F(C04630Le.A00(c06c)) : A09;
    }

    public String A09(C06C c06c, boolean z) {
        if (C003101m.A0Z(c06c.A02())) {
            return this.A03.A00.getString(R.string.my_status);
        }
        if (c06c.A0E()) {
            return A02(c06c, z);
        }
        if (!TextUtils.isEmpty(c06c.A0F)) {
            return c06c.A0F;
        }
        if (c06c.A0C()) {
            String A0A = this.A05.A0A((AbstractC005302j) c06c.A03(AbstractC005302j.class));
            return TextUtils.isEmpty(A0A) ? this.A03.A00.getString(R.string.group_subject_unknown) : A0A;
        } else if (c06c.A0D()) {
            Jid A03 = c06c.A03(C0I1.class);
            if (A03 != null) {
                int A032 = A03((C0I1) A03);
                return this.A03.A00.getResources().getQuantityString(R.plurals.broadcast_n_recipients, A032, Integer.valueOf(A032));
            }
            throw null;
        } else {
            AbstractC005302j abstractC005302j = (AbstractC005302j) c06c.A03(AbstractC005302j.class);
            String A0A2 = abstractC005302j == null ? null : this.A05.A0A(abstractC005302j);
            if (TextUtils.isEmpty(A0A2)) {
                return null;
            }
            return A0A2;
        }
    }

    public String A0A(AbstractC011205o abstractC011205o) {
        ConcurrentHashMap concurrentHashMap = this.A07;
        String str = (String) concurrentHashMap.get(abstractC011205o);
        if (str != null) {
            return str;
        }
        boolean z = false;
        HashSet hashSet = new HashSet();
        Iterator it = this.A06.A01(abstractC011205o).A05().iterator();
        while (true) {
            C04250Jl c04250Jl = (C04250Jl) it;
            if (!c04250Jl.hasNext()) {
                break;
            }
            C02L c02l = this.A00;
            UserJid userJid = ((C0D7) c04250Jl.next()).A03;
            if (c02l.A0A(userJid)) {
                z = true;
            } else {
                hashSet.add(this.A01.A0A(userJid));
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            C06C c06c = (C06C) it2.next();
            String A04 = A04(c06c);
            if (A04 != null) {
                if (c06c.A0A()) {
                    arrayList2.add(A04);
                } else {
                    arrayList.add(A04);
                }
            }
        }
        Collections.sort(arrayList, A0E());
        Collections.sort(arrayList2);
        arrayList.addAll(arrayList2);
        if (z && !C003101m.A0Q(abstractC011205o)) {
            arrayList.add(this.A03.A00.getString(R.string.you));
        }
        String A0o = AnonymousClass029.A0o(this.A04, false, arrayList);
        concurrentHashMap.put(abstractC011205o, A0o);
        return A0o;
    }

    public String A0B(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
            if (this.A00.A0A(abstractC005302j)) {
                z = true;
            } else {
                C06C A0A = this.A01.A0A(abstractC005302j);
                if (!arrayList.contains(A0A)) {
                    arrayList.add(A0A);
                }
            }
        }
        return A0D(arrayList, z);
    }

    public String A0C(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
            if (this.A00.A0A(abstractC005302j)) {
                z = true;
            } else {
                C06C A0A = this.A01.A0A(abstractC005302j);
                if (!arrayList.contains(A0A)) {
                    arrayList.add(A0A);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C06C c06c = (C06C) it2.next();
            String A082 = A08(c06c, false);
            if (A082 != null) {
                if (c06c.A0A()) {
                    arrayList3.add(A082);
                } else {
                    arrayList2.add(A082);
                }
            }
        }
        Collections.sort(arrayList2, A0E());
        Collections.sort(arrayList3);
        arrayList2.addAll(arrayList3);
        if (z) {
            arrayList2.add(this.A03.A00.getString(R.string.you));
        }
        return AnonymousClass029.A0o(this.A04, true, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String A0D(Iterable iterable, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C06C c06c = (C06C) it.next();
            String A082 = A08(c06c, false);
            if (A082 != null) {
                if (c06c.A0A()) {
                    arrayList2.add(A082);
                } else {
                    arrayList.add(A082);
                }
            }
        }
        Collections.sort(arrayList, A0E());
        Collections.sort(arrayList2);
        arrayList.addAll(arrayList2);
        if (z) {
            arrayList.add(this.A03.A00.getString(R.string.you));
        }
        int size = arrayList.size();
        if (size <= 3) {
            return AnonymousClass029.A0o(this.A04, true, arrayList);
        }
        String[] strArr = new String[4];
        int i = 0;
        do {
            strArr[i] = arrayList.get(i);
            i++;
        } while (i < 3);
        C002301c c002301c = this.A04;
        int i2 = size - 2;
        strArr[3] = c002301c.A0A(R.plurals.names_others, i2, Integer.valueOf(i2));
        return AnonymousClass029.A0o(c002301c, true, Arrays.asList(strArr));
    }

    public Collator A0E() {
        Collator collator = Collator.getInstance(this.A04.A0I());
        collator.setDecomposition(1);
        return collator;
    }

    public boolean A0F(C06C c06c) {
        if (c06c.A08 == null) {
            return false;
        }
        String str = c06c.A0F;
        String A05 = c06c.A05();
        return (TextUtils.isEmpty(A05) || TextUtils.isEmpty(str) || !AnonymousClass024.A0E(str).equals(AnonymousClass024.A0E(A05))) ? false : true;
    }

    public boolean A0G(C06C c06c, List list, boolean z) {
        String A00;
        if (list != null && !list.isEmpty()) {
            if (!TextUtils.isEmpty(c06c.A0F)) {
                A00 = C002701i.A0q(c06c.A0F);
            } else if (c06c.A0D()) {
                Jid A03 = c06c.A03(C0I1.class);
                if (A03 == null) {
                    throw null;
                }
                A00 = A0A((AbstractC011205o) A03);
            } else {
                A00 = C04630Le.A00(c06c);
            }
            C002301c c002301c = this.A04;
            if (!C09940f2.A05(A00, list, c002301c, z) && ((!c06c.A0B() || !c06c.A09() || !C09940f2.A05(c06c.A05(), list, c002301c, z)) && !C09940f2.A05(c06c.A0I, list, c002301c, z) && !C09940f2.A05(c06c.A0E, list, c002301c, z) && !C09940f2.A05(c06c.A0M, list, c002301c, z))) {
                if (c06c.A0D() || c06c.A0C()) {
                    return false;
                }
                Jid A032 = c06c.A03(AbstractC005302j.class);
                if (A032 != null) {
                    if (TextUtils.isEmpty(A032.user)) {
                        return false;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        String str2 = A032.user;
                        if (z) {
                            if (!str2.contains(str)) {
                                return false;
                            }
                        } else if (!str2.equals(str)) {
                            return false;
                        }
                    }
                    return true;
                }
                throw null;
            }
        }
        return true;
    }
}
