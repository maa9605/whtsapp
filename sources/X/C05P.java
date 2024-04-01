package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.05P  reason: invalid class name */
/* loaded from: classes.dex */
public class C05P {
    public static volatile C05P A01;
    public final C05A A00;

    public C05P(C05A c05a) {
        this.A00 = c05a;
    }

    public static C05P A00() {
        if (A01 == null) {
            synchronized (C05P.class) {
                if (A01 == null) {
                    A01 = new C05P(C05A.A00());
                }
            }
        }
        return A01;
    }

    public static String A01(int i) {
        StringBuilder A0P = C000200d.A0P("(");
        A0P.append(TextUtils.join(",", Collections.nCopies(i, "?")));
        A0P.append(")");
        return A0P.toString();
    }

    public static void A02(String str, boolean z, StringBuilder sb, boolean z2) {
        if ("document".equals(str)) {
            sb.append(C0HD.A0F);
        } else if ("url".equals(str)) {
            if (z2) {
                sb.append(C0HD.A0M);
            } else {
                sb.append(C0HD.A0N);
            }
        } else if ("all_media".equals(str)) {
            sb.append(C0HD.A0b);
        } else {
            sb.append(C0HD.A19);
            A03(sb, z);
            if (str == null) {
                return;
            }
            C000200d.A15("sqlStatementsBuilder/getStartSqlForType/unexpected type string=", str);
        }
    }

    public static void A03(StringBuilder sb, boolean z) {
        if (z) {
            sb.append(" AND message_type != '");
            sb.append(8);
            sb.append("' ");
            return;
        }
        sb.append(" ");
    }

    public static void A04(boolean z, StringBuilder sb) {
        if (z) {
            sb.append(" AND _id < ? ");
            sb.append(" ORDER BY _id DESC");
            return;
        }
        sb.append("AND _id > ? ");
        sb.append(" ORDER BY _id ASC");
    }

    public C0FK A05(AnonymousClass092 anonymousClass092) {
        String str;
        ArrayList arrayList = new ArrayList();
        List<AbstractC005302j> A0P = anonymousClass092.A0P();
        if (A0P != null && A0P.size() >= anonymousClass092.A06) {
            arrayList.add(anonymousClass092.A0n.A01);
            C05A c05a = this.A00;
            if (c05a != null) {
                HashMap hashMap = new HashMap();
                for (AbstractC005302j abstractC005302j : A0P) {
                    long A05 = c05a.A05(abstractC005302j);
                    if (A05 != -1) {
                        hashMap.put(abstractC005302j, Long.valueOf(A05));
                    }
                }
                StringBuilder A0P2 = C000200d.A0P(" WHERE from_me=1 AND key_id=? AND chat_row_id IN ");
                A0P2.append(A01(hashMap.size()));
                str = A0P2.toString();
                for (Object obj : hashMap.values()) {
                    arrayList.add(obj.toString());
                }
            } else {
                throw null;
            }
        } else {
            arrayList.add(String.valueOf(anonymousClass092.A0E));
            arrayList.add(anonymousClass092.A0n.A01);
            arrayList.add(String.valueOf(anonymousClass092.A0p));
            str = " WHERE timestamp=? AND from_me=1 AND key_id=? AND _id!=?";
        }
        return new C0FK(str, arrayList);
    }
}
