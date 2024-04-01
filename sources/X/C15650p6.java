package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: X.0p6  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15650p6 {
    public final String A00;
    public final Map A01;
    public final Set A02;
    public final Set A03;

    public C15650p6(String str, Map map, Set set, Set set2) {
        this.A00 = str;
        this.A01 = Collections.unmodifiableMap(map);
        this.A02 = Collections.unmodifiableSet(set);
        this.A03 = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static C15650p6 A00(InterfaceC15820pO interfaceC15820pO, String str) {
        C28931Um c28931Um = (C28931Um) interfaceC15820pO;
        Cursor A00 = c28931Um.A00(new C28921Ul(C000200d.A0I("PRAGMA table_info(`", str, "`)")));
        HashMap hashMap = new HashMap();
        try {
            if (A00.getColumnCount() > 0) {
                int columnIndex = A00.getColumnIndex("name");
                int columnIndex2 = A00.getColumnIndex("type");
                int columnIndex3 = A00.getColumnIndex("notnull");
                int columnIndex4 = A00.getColumnIndex("pk");
                int columnIndex5 = A00.getColumnIndex("dflt_value");
                while (A00.moveToNext()) {
                    String string = A00.getString(columnIndex);
                    String string2 = A00.getString(columnIndex2);
                    boolean z = false;
                    if (A00.getInt(columnIndex3) != 0) {
                        z = true;
                    }
                    hashMap.put(string, new C15610p2(string, string2, z, A00.getInt(columnIndex4), A00.getString(columnIndex5), 2));
                }
            }
            A00.close();
            HashSet hashSet = new HashSet();
            StringBuilder sb = new StringBuilder("PRAGMA foreign_key_list(`");
            sb.append(str);
            sb.append("`)");
            A00 = c28931Um.A00(new C28921Ul(sb.toString()));
            try {
                int columnIndex6 = A00.getColumnIndex("id");
                int columnIndex7 = A00.getColumnIndex("seq");
                int columnIndex8 = A00.getColumnIndex("table");
                int columnIndex9 = A00.getColumnIndex("on_delete");
                int columnIndex10 = A00.getColumnIndex("on_update");
                int columnIndex11 = A00.getColumnIndex("id");
                int columnIndex12 = A00.getColumnIndex("seq");
                int columnIndex13 = A00.getColumnIndex("from");
                int columnIndex14 = A00.getColumnIndex("to");
                int count = A00.getCount();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < count; i++) {
                    A00.moveToPosition(i);
                    arrayList.add(new C15630p4(A00.getInt(columnIndex11), A00.getInt(columnIndex12), A00.getString(columnIndex13), A00.getString(columnIndex14)));
                }
                Collections.sort(arrayList);
                int count2 = A00.getCount();
                for (int i2 = 0; i2 < count2; i2++) {
                    A00.moveToPosition(i2);
                    if (A00.getInt(columnIndex7) == 0) {
                        int i3 = A00.getInt(columnIndex6);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C15630p4 c15630p4 = (C15630p4) it.next();
                            if (c15630p4.A00 == i3) {
                                arrayList2.add(c15630p4.A02);
                                arrayList3.add(c15630p4.A03);
                            }
                        }
                        hashSet.add(new C15620p3(A00.getString(columnIndex8), A00.getString(columnIndex9), A00.getString(columnIndex10), arrayList2, arrayList3));
                    }
                }
                A00.close();
                StringBuilder sb2 = new StringBuilder("PRAGMA index_list(`");
                sb2.append(str);
                sb2.append("`)");
                A00 = c28931Um.A00(new C28921Ul(sb2.toString()));
                try {
                    int columnIndex15 = A00.getColumnIndex("name");
                    int columnIndex16 = A00.getColumnIndex("origin");
                    int columnIndex17 = A00.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex15 != -1 && columnIndex16 != -1 && columnIndex17 != -1) {
                        HashSet hashSet3 = new HashSet();
                        while (A00.moveToNext()) {
                            if ("c".equals(A00.getString(columnIndex16))) {
                                String string3 = A00.getString(columnIndex15);
                                boolean z2 = A00.getInt(columnIndex17) == 1;
                                Cursor A002 = c28931Um.A00(new C28921Ul(C000200d.A0I("PRAGMA index_xinfo(`", string3, "`)")));
                                int columnIndex18 = A002.getColumnIndex("seqno");
                                int columnIndex19 = A002.getColumnIndex("cid");
                                int columnIndex20 = A002.getColumnIndex("name");
                                if (columnIndex18 != -1 && columnIndex19 != -1 && columnIndex20 != -1) {
                                    TreeMap treeMap = new TreeMap();
                                    while (A002.moveToNext()) {
                                        if (A002.getInt(columnIndex19) >= 0) {
                                            treeMap.put(Integer.valueOf(A002.getInt(columnIndex18)), A002.getString(columnIndex20));
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList(treeMap.size());
                                    arrayList4.addAll(treeMap.values());
                                    C15640p5 c15640p5 = new C15640p5(string3, z2, arrayList4);
                                    A002.close();
                                    hashSet3.add(c15640p5);
                                } else {
                                    A002.close();
                                }
                            }
                        }
                        A00.close();
                        hashSet2 = hashSet3;
                        return new C15650p6(str, hashMap, hashSet, hashSet2);
                    }
                    return new C15650p6(str, hashMap, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || C15650p6.class != obj.getClass()) {
            return false;
        }
        C15650p6 c15650p6 = (C15650p6) obj;
        String str = this.A00;
        if (str != null) {
            if (!str.equals(c15650p6.A00)) {
                return false;
            }
        } else if (c15650p6.A00 != null) {
            return false;
        }
        Map map = this.A01;
        if (map != null) {
            if (!map.equals(c15650p6.A01)) {
                return false;
            }
        } else if (c15650p6.A01 != null) {
            return false;
        }
        Set set2 = this.A02;
        if (set2 != null) {
            if (!set2.equals(c15650p6.A02)) {
                return false;
            }
        } else if (c15650p6.A02 != null) {
            return false;
        }
        Set set3 = this.A03;
        if (set3 == null || (set = c15650p6.A03) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.A00;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.A01;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.A02;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("TableInfo{name='");
        C000200d.A1P(A0P, this.A00, '\'', ", columns=");
        A0P.append(this.A01);
        A0P.append(", foreignKeys=");
        A0P.append(this.A02);
        A0P.append(", indices=");
        A0P.append(this.A03);
        A0P.append('}');
        return A0P.toString();
    }
}
