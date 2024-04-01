package X;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.os.OperationCanceledException;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.26G */
/* loaded from: classes2.dex */
public class C26G {
    public final C05W A0D;
    public final C018708s A0E;
    public final C0D5 A0F;
    public final C0IU A0G;
    public final C0IU A0H;
    public final C04880Mg A04 = new C04880Mg();
    public final C04880Mg A07 = new C04880Mg();
    public final C04880Mg A05 = new C04880Mg();
    public final C04880Mg A02 = new C04880Mg();
    public final C04880Mg A03 = new C04880Mg();
    public final C0HK A0C = new C0HK();
    public final C0HK A09 = new C0HK();
    public final C0HK A0B = new C0HK();
    public final C0HK A08 = new C0HK();
    public final C0HK A0A = new C0HK();
    public final C04880Mg A06 = new C04880Mg();
    public AtomicBoolean A01 = new AtomicBoolean();
    public C00T A00 = new C00T() { // from class: X.2as
        {
            C26G.this = this;
        }

        @Override // X.C00T
        public void A05(AbstractC005302j abstractC005302j) {
            C26G c26g = C26G.this;
            c26g.A00(c26g.A0G.A02 == 0);
        }

        @Override // X.C00T
        public void A0A(Collection collection, AbstractC005302j abstractC005302j, Map map, boolean z) {
            C04880Mg c04880Mg = C26G.this.A05;
            C52382ad c52382ad = (C52382ad) c04880Mg.A01();
            if (c52382ad == null || collection == null) {
                return;
            }
            if (z) {
                c52382ad.A03.removeAll(collection);
                List list = c52382ad.A02;
                TreeSet treeSet = new TreeSet(C52562aw.A00);
                treeSet.addAll(list);
                treeSet.addAll(collection);
                list.clear();
                list.addAll(treeSet);
            } else {
                c52382ad.A02.removeAll(collection);
                List list2 = c52382ad.A03;
                TreeSet treeSet2 = new TreeSet(C52562aw.A00);
                treeSet2.addAll(list2);
                treeSet2.addAll(collection);
                list2.clear();
                list2.addAll(treeSet2);
            }
            c04880Mg.A0A(c52382ad);
        }

        @Override // X.C00T
        public void A0B(Collection collection, Map map, Map map2) {
            C26G c26g = C26G.this;
            C04880Mg c04880Mg = c26g.A05;
            C52382ad c52382ad = (C52382ad) c04880Mg.A01();
            if (c52382ad != null) {
                c52382ad.A03.removeAll(collection);
                c52382ad.A01.removeAll(collection);
                c52382ad.A02.removeAll(collection);
                c52382ad.A00.removeAll(collection);
                c04880Mg.A0A(c52382ad);
                c26g.A07.A0A(c26g.A0H);
            }
        }
    };

    public C26G(C2M6 c2m6, C05W c05w, C018708s c018708s, C002301c c002301c, C0D5 c0d5, C0HL c0hl, C0HL c0hl2, C0HL c0hl3) {
        C0IU c0iu = new C0IU(c002301c);
        c0iu.A01 = 100;
        this.A0G = c0iu;
        this.A0H = new C0IU(c002301c);
        this.A0D = c05w;
        this.A0E = c018708s;
        this.A0F = c0d5;
        A00(false);
        c2m6.A00(this.A05, this.A04, new InterfaceC04240Jk() { // from class: X.2at
            {
                C26G.this = this;
            }

            @Override // X.InterfaceC04240Jk
            public final Object A5S(Object obj) {
                boolean z;
                C26G c26g = C26G.this;
                C2IH c2ih = (C2IH) obj;
                C0HK c0hk = c26g.A0B;
                c0hk.A0A(Boolean.TRUE);
                boolean z2 = true;
                c26g.A01.set(true);
                C0IU c0iu2 = (C0IU) c2ih.A01;
                int i = c0iu2.A00;
                C52382ad c52382ad = (C52382ad) c26g.A05.A01();
                StringBuilder A0P = C000200d.A0P("MessageSearchManager/getMessagesForQuery/");
                A0P.append(c0iu2.A02().length());
                C0HC c0hc = new C0HC(A0P.toString());
                if (c0iu2.A07 != null && !c0iu2.A01().booleanValue()) {
                    c0iu2.A07 = null;
                    z = true;
                } else {
                    z = false;
                }
                C0D5 c0d52 = c26g.A0F;
                C0HE c0he = c2ih.A00;
                Pair A07 = c0d52.A07(c0iu2, c0he);
                if (((Number) A07.first).intValue() == -2) {
                    c0iu2.A0E = false;
                    A07 = c0d52.A07(c0iu2, c0he);
                }
                int intValue = ((Number) A07.first).intValue();
                if (intValue != 0 && intValue != -1) {
                    z2 = false;
                }
                Iterator it = ((List) A07.second).iterator();
                while (it.hasNext()) {
                    AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
                    if (z && anonymousClass092.A0j) {
                        it.remove();
                    }
                }
                ArrayList arrayList = new ArrayList((Collection) A07.second);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    AnonymousClass092 anonymousClass0922 = (AnonymousClass092) it2.next();
                    if (anonymousClass0922 != null && !anonymousClass0922.A0r) {
                        if (anonymousClass0922.A0j) {
                            arrayList2.add(anonymousClass0922);
                        } else {
                            arrayList3.add(anonymousClass0922);
                        }
                        if ((anonymousClass0922 instanceof AnonymousClass095) || (anonymousClass0922 instanceof C09F) || (anonymousClass0922 instanceof C09G)) {
                            AnonymousClass097 anonymousClass097 = (AnonymousClass097) anonymousClass0922;
                            if (anonymousClass097.A1F()) {
                                arrayList4.add(anonymousClass097);
                            }
                        }
                    } else {
                        it2.remove();
                    }
                }
                if (c52382ad != null) {
                    c52382ad.A01.addAll(arrayList);
                    c52382ad.A02.addAll(arrayList2);
                    c52382ad.A03.addAll(arrayList3);
                    c52382ad.A00.addAll(arrayList4);
                } else {
                    c52382ad = new C52382ad(arrayList, arrayList2, arrayList3, arrayList4);
                }
                if (!c0he.A03()) {
                    StringBuilder A0P2 = C000200d.A0P("found: ");
                    A0P2.append(A07.first);
                    A0P2.append("|:");
                    A0P2.append(((List) A07.second).size());
                    c0hc.A02(A0P2.toString());
                    c0hc.A01();
                    if (z2) {
                        c26g.A09.A0A(-1);
                        if (!c0iu2.A01().booleanValue()) {
                            c0hk.A0A(Boolean.FALSE);
                        }
                    } else {
                        c26g.A09.A0A(Integer.valueOf(i));
                    }
                    c26g.A01.set(false);
                }
                return c52382ad;
            }
        });
        c2m6.A00(this.A02, this.A07, new InterfaceC04240Jk() { // from class: X.2au
            {
                C26G.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:225:0x022f, code lost:
                r8.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:226:0x0232, code lost:
                r3.close();
             */
            @Override // X.InterfaceC04240Jk
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object A5S(java.lang.Object r20) {
                /*
                    Method dump skipped, instructions count: 638
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C52542au.A5S(java.lang.Object):java.lang.Object");
            }
        });
        c2m6.A00(this.A03, this.A07, new InterfaceC04240Jk() { // from class: X.2av
            {
                C26G.this = this;
            }

            @Override // X.InterfaceC04240Jk
            public final Object A5S(Object obj) {
                C0CD A03;
                C26G c26g = C26G.this;
                C2IH c2ih = (C2IH) obj;
                C0IU c0iu2 = (C0IU) c2ih.A01;
                if (c0iu2.A02 != 0) {
                    return new SparseIntArray();
                }
                C0HK c0hk = c26g.A0A;
                c0hk.A0A(Boolean.TRUE);
                C0D5 c0d52 = c26g.A0F;
                C0HE c0he = c2ih.A00;
                if (c0d52 != null) {
                    StringBuilder A0P = C000200d.A0P("FtsMessageStore/getMediaCounts/");
                    A0P.append(c0iu2.A02().length());
                    C0HC c0hc = new C0HC(A0P.toString());
                    SparseIntArray sparseIntArray = new SparseIntArray();
                    if (!c0d52.A0O()) {
                        c0hc.A02("FtsMessageStore not ready");
                        c0hc.A01();
                    } else if (C0D5.A02(c0he)) {
                        c0hc.A02("cancelled");
                        c0hc.A01();
                    } else if (c0d52.A04() == 1) {
                        c0hc.A02("v1");
                        c0hc.A01();
                    } else {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        String A0B = (TextUtils.isEmpty(c0iu2.A02()) && c0iu2.A04 == null) ? "" : c0d52.A0B(c0iu2, c0he);
                        C0IU c0iu3 = new C0IU(c0d52.A03);
                        int[] iArr = C0D5.A0G;
                        for (int i : iArr) {
                            arrayList.add("SELECT count(*) AS count FROM message_ftsv2 WHERE message_ftsv2 MATCH ? ");
                            c0iu3.A02 = i;
                            String A0C = c0d52.A0C(c0iu3, "", c0he);
                            StringBuilder sb = new StringBuilder();
                            sb.append(A0C);
                            sb.append(" ");
                            sb.append(A0B);
                            arrayList2.add(sb.toString());
                        }
                        if (C0D5.A02(c0he)) {
                            c0hc.A02("cancelled");
                            c0hc.A01();
                        } else {
                            String join = TextUtils.join(" UNION ALL ", arrayList);
                            String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                            c0hc.A02("matchterm");
                            try {
                                A03 = c0d52.A0B.A03();
                            } catch (C0S2 unused) {
                            } catch (SQLiteDatabaseCorruptException e) {
                                Log.e(e);
                                c0d52.A0A.A03();
                            } catch (SQLiteException e2) {
                                Log.e("FtsMessageStore/search/error", e2);
                                c0hc.A02("error");
                                c0hc.A01();
                            } catch (Exception e3) {
                                if (!(e3 instanceof OperationCanceledException)) {
                                    throw e3;
                                }
                            }
                            try {
                                Cursor A08 = A03.A02.A08(join, strArr, c0he);
                                CursorWrapper cursorWrapper = (CursorWrapper) A08;
                                int columnIndex = cursorWrapper.getColumnIndex("count");
                                int i2 = 0;
                                while (((CursorWrapper) A08).moveToNext()) {
                                    if (C0D5.A02(c0he)) {
                                        c0hc.A02("cancelled");
                                        c0hc.A01();
                                        cursorWrapper.close();
                                        A03.close();
                                        break;
                                    }
                                    int i3 = cursorWrapper.getInt(columnIndex);
                                    if (i3 > 0) {
                                        sparseIntArray.put(iArr[i2], i3);
                                    }
                                    i2++;
                                }
                                c0hc.A02("counted");
                                cursorWrapper.close();
                                A03.close();
                                c0hc.A02("complete");
                                c0hc.A01();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    try {
                                        A03.close();
                                    } catch (Throwable unused2) {
                                    }
                                    throw th2;
                                }
                            }
                        }
                    }
                    c0hk.A0A(Boolean.FALSE);
                    return sparseIntArray;
                }
                throw null;
            }
        });
        this.A04.A0C(this.A06, new InterfaceC05620Pl() { // from class: X.3n6
            {
                C26G.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                C26G c26g = C26G.this;
                Pair pair = (Pair) obj;
                Object obj2 = pair.second;
                if (obj2 != null) {
                    Object obj3 = pair.first;
                    if (obj3 != null) {
                        c26g.A0G.A07 = Boolean.valueOf(((Boolean) obj3).booleanValue());
                    }
                    C0IU c0iu2 = c26g.A0G;
                    c0iu2.A00 = ((Number) obj2).intValue();
                    c26g.A01.set(true);
                    c26g.A0B.A0B(Boolean.TRUE);
                    c26g.A04.A0A(c0iu2);
                }
            }
        });
        this.A06.A0C(c0hl2, new InterfaceC05620Pl() { // from class: X.3n4
            {
                C26G.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                C26G c26g = C26G.this;
                C0IU c0iu2 = c26g.A0G;
                int intValue = ((Number) obj).intValue();
                c0iu2.A02 = intValue;
                c26g.A0H.A02 = intValue;
                c26g.A00(intValue == 0);
            }
        });
        this.A06.A0C(c0hl, new InterfaceC05620Pl() { // from class: X.3n3
            {
                C26G.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                C26G c26g = C26G.this;
                String str = (String) obj;
                C0IU c0iu2 = c26g.A0G;
                c0iu2.A08 = str;
                c0iu2.A03 = null;
                C0IU c0iu3 = c26g.A0H;
                c0iu3.A08 = str;
                c0iu3.A03 = null;
                c26g.A00(c0iu2.A02 == 0);
            }
        });
        this.A06.A0C(c0hl3, new InterfaceC05620Pl() { // from class: X.3n5
            {
                C26G.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                C26G c26g = C26G.this;
                AbstractC005302j abstractC005302j = (AbstractC005302j) obj;
                C0IU c0iu2 = c26g.A0G;
                c0iu2.A04 = abstractC005302j;
                c0iu2.A0F = false;
                C0IU c0iu3 = c26g.A0H;
                c0iu3.A04 = abstractC005302j;
                c0iu3.A0F = false;
                C0HK c0hk = c26g.A0C;
                String A02 = c0iu2.A02();
                UserJid of = UserJid.of(c0iu2.A04);
                if (of != null) {
                    C06C A0A = c26g.A0D.A0A(of);
                    C018708s c018708s2 = c26g.A0E;
                    List A04 = c0iu2.A04();
                    List A03 = c0iu2.A03();
                    if (c018708s2 != null) {
                        C000700j.A09(A03.size() % 2 == 0, "tokenPositions.size must be even");
                        Iterator it = A03.iterator();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(0);
                        for (Object obj2 : A04) {
                            Object next = it.next();
                            Object next2 = it.next();
                            if (c018708s2.A0G(A0A, Collections.singletonList(obj2), true)) {
                                arrayList.add(next);
                                arrayList.add(next2);
                            }
                        }
                        arrayList.add(Integer.valueOf(A02.length()));
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList();
                        while (it2.hasNext()) {
                            Number number = (Number) it2.next();
                            Number number2 = (Number) it2.next();
                            if (number != null && number2 != null) {
                                if (!number.equals(number2)) {
                                    String trim = A02.subSequence(number.intValue(), number2.intValue()).toString().trim();
                                    if (trim.length() > 0) {
                                        arrayList2.add(trim);
                                    }
                                }
                            } else {
                                Log.e("messageSearchModel/invalid index in token mapping");
                                break;
                            }
                        }
                        A02 = TextUtils.join(" ", arrayList2);
                    } else {
                        throw null;
                    }
                }
                c0hk.A0B(A02);
                c26g.A00(c0iu2.A02 == 0);
            }
        });
    }

    public void A00(boolean z) {
        this.A0B.A0B(Boolean.TRUE);
        this.A05.A0B(C52382ad.A00());
        this.A06.A0B(new Pair(z ? Boolean.TRUE : null, 0));
        this.A07.A0B(this.A0H);
        this.A0G.A0E = true;
    }
}
