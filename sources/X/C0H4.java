package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0H4 */
/* loaded from: classes.dex */
public class C0H4 {
    public static volatile C0H4 A07;
    public final C002301c A00;
    public final C05Q A01;
    public final C0GK A02;
    public final C0D5 A03;
    public final C05N A04;
    public final C05E A05;
    public final Map A06 = Collections.synchronizedMap(new C04W(200));

    public C0H4(C0GK c0gk, C002301c c002301c, C0D5 c0d5, C05Q c05q, C05E c05e, C05N c05n) {
        this.A02 = c0gk;
        this.A00 = c002301c;
        this.A03 = c0d5;
        this.A01 = c05q;
        this.A05 = c05e;
        this.A04 = c05n;
        c0d5.A0K(new C0GX() { // from class: X.0H5
            @Override // X.C0GX
            public String ABV() {
                return "b";
            }

            {
                C0H4.this = this;
            }

            @Override // X.C0GX
            public Set ABF(AnonymousClass092 anonymousClass092) {
                HashSet hashSet = new HashSet();
                for (Number number : C0H4.this.A01(anonymousClass092.A0p)) {
                    long longValue = number.longValue();
                    StringBuilder A0P = C000200d.A0P("l");
                    A0P.append(Long.toString(longValue, 36));
                    hashSet.add(A0P.toString());
                }
                if (hashSet.isEmpty()) {
                    return null;
                }
                return hashSet;
            }

            @Override // X.C0GX
            public C27751Op ABW(C0IU c0iu) {
                HashSet hashSet = new HashSet();
                List list = c0iu.A0C;
                if (list == null || list.isEmpty()) {
                    return null;
                }
                List<String> list2 = c0iu.A0C;
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                for (String str : list2) {
                    C0GK c0gk2 = C0H4.this.A02;
                    ArrayList arrayList = new ArrayList();
                    C0GL c0gl = c0gk2.A00;
                    synchronized (c0gl) {
                        if (c0gl.A02) {
                            arrayList.addAll(c0gl.A03.values());
                            c0gl.A01.addAndGet(arrayList.size());
                            Collections.sort(arrayList, new Comparator() { // from class: X.1Ny
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    return (((C27641Oe) obj).A01 > ((C27641Oe) obj2).A01 ? 1 : (((C27641Oe) obj).A01 == ((C27641Oe) obj2).A01 ? 0 : -1));
                                }
                            });
                        } else {
                            C0CD A03 = c0gk2.A01.A03();
                            Cursor A09 = A03.A02.A09("labels", new String[]{"_id, label_name, predefined_id, color_id"}, null, null, "_id ASC", "getLabelList/QUERY_LABELS");
                            while (A09.moveToNext()) {
                                long j = A09.getLong(0);
                                String string = A09.getString(1);
                                if (!A09.isNull(2)) {
                                    A09.getLong(2);
                                }
                                A09.getInt(3);
                                C27641Oe c27641Oe = new C27641Oe(j, string);
                                arrayList.add(c27641Oe);
                                c0gl.A03.put(Long.valueOf(j), c27641Oe);
                                c0gl.A01.incrementAndGet();
                                c0gl.A00.incrementAndGet();
                            }
                            c0gl.A02 = true;
                            A09.close();
                            A03.close();
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C27641Oe c27641Oe2 = (C27641Oe) it.next();
                            if (str.equals(c27641Oe2.A02)) {
                                long j2 = c27641Oe2.A01;
                                StringBuilder A0P = C000200d.A0P("l");
                                A0P.append(Long.toString(j2, 36));
                                hashSet.add(A0P.toString());
                                break;
                            }
                        }
                    }
                }
                C27751Op c27751Op = new C27751Op();
                c27751Op.A00 = hashSet;
                return c27751Op;
            }
        });
    }

    public static C0H4 A00() {
        if (A07 == null) {
            synchronized (C0H4.class) {
                if (A07 == null) {
                    C0GK A00 = C0GK.A00();
                    C002301c A002 = C002301c.A00();
                    C0D5 A003 = C0D5.A00();
                    C05Q A004 = C05Q.A00();
                    C05E A005 = C05E.A00();
                    C05P.A00();
                    A07 = new C0H4(A00, A002, A003, A004, A005, C05N.A00());
                }
            }
        }
        return A07;
    }

    public List A01(long j) {
        Map map = this.A06;
        Long valueOf = Long.valueOf(j);
        List list = (List) map.get(valueOf);
        ArrayList arrayList = list;
        if (list == null) {
            C0CD A03 = this.A05.A03();
            try {
                Cursor A072 = A03.A02.A07("SELECT label_id FROM labeled_messages WHERE message_row_id = ? ORDER BY _id DESC", new String[]{Long.toString(j)});
                ArrayList arrayList2 = new ArrayList();
                while (A072.moveToNext()) {
                    arrayList2.add(Long.valueOf(A072.getLong(0)));
                }
                map.put(valueOf, arrayList2);
                A072.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        A03.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return arrayList;
    }
}
