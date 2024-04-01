package X;

import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2JQ  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2JQ {
    public static final List A00;
    public static final Map A01;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2JR(0, R.string.filter_name_none, null));
        arrayList.add(new C2JR(1, R.string.filter_name_pop, "filter_pop.png"));
        arrayList.add(new C2JR(2, R.string.filter_name_bw, "filter_bw.png"));
        arrayList.add(new C2JR(3, R.string.filter_name_cool, "filter_cool.png"));
        arrayList.add(new C2JR(4, R.string.filter_name_chrome, "filter_chrome.png"));
        arrayList.add(new C2JR(5, R.string.filter_name_film, "filter_film.png"));
        List<C2JR> unmodifiableList = Collections.unmodifiableList(arrayList);
        A00 = unmodifiableList;
        HashMap hashMap = new HashMap();
        for (C2JR c2jr : unmodifiableList) {
            hashMap.put(c2jr.A02, c2jr);
        }
        A01 = Collections.unmodifiableMap(hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
        if (r3 >= X.C2JQ.A00.size()) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C2JR A00(int r3) {
        /*
            if (r3 < 0) goto Lb
            java.util.List r0 = X.C2JQ.A00
            int r0 = r0.size()
            r2 = 1
            if (r3 < r0) goto Lc
        Lb:
            r2 = 0
        Lc:
            java.lang.String r1 = "Filter ID does not exist: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            X.C000700j.A09(r2, r0)
            java.util.List r0 = X.C2JQ.A00
            java.lang.Object r0 = r0.get(r3)
            X.2JR r0 = (X.C2JR) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2JQ.A00(int):X.2JR");
    }
}
