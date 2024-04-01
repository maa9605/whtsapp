package X;

import android.os.ConditionVariable;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3MA  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3MA extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ ConditionVariable A01;
    public final /* synthetic */ C2AV A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ HashMap A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ C3MA(C2AV c2av, HashMap hashMap, String str, boolean z, ConditionVariable conditionVariable, ConditionVariable conditionVariable2) {
        this.A02 = c2av;
        this.A04 = hashMap;
        this.A03 = str;
        this.A05 = z;
        this.A00 = conditionVariable;
        this.A01 = conditionVariable2;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        List list;
        AnonymousClass094 anonymousClass094;
        C2AV c2av = this.A02;
        HashMap hashMap = this.A04;
        String str = this.A03;
        boolean z = this.A05;
        ConditionVariable conditionVariable = this.A00;
        ConditionVariable conditionVariable2 = this.A01;
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList2 = new ArrayList();
        try {
            for (Map.Entry entry : hashMap.entrySet()) {
                AbstractC005302j abstractC005302j = (AbstractC005302j) entry.getKey();
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) entry.getValue();
                C451920u A03 = c2av.A0D.A03(abstractC005302j);
                arrayList.add(A03);
                if (anonymousClass092 != null && C003101m.A0P(abstractC005302j) && anonymousClass092.A08 == 6) {
                    c2av.A0F.A05((C0I1) abstractC005302j, true);
                }
                if (currentTimeMillis - 86400000 < A03.A08 || A03.A07 > 0) {
                    if (anonymousClass092 != null) {
                        arrayList2.add(Pair.create(anonymousClass092.A0n, Integer.valueOf(A03.A01)));
                        A03.A0O = true;
                    }
                }
            }
            c2av.A0E.A03(str, arrayList, z ? 7 : 0, z, null);
            conditionVariable.open();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (((Number) pair.second).intValue() < c2av.A02.A07(C01B.A00)) {
                    list = c2av.A08.A05((AnonymousClass094) pair.first, ((Number) pair.second).intValue() + 20, null);
                    anonymousClass094 = null;
                    i = 1;
                } else {
                    i = 5;
                    C451520p c451520p = c2av.A0D;
                    AbstractC005302j abstractC005302j2 = ((AnonymousClass094) pair.first).A00;
                    if (abstractC005302j2 != null) {
                        Pair A01 = c451520p.A01(abstractC005302j2);
                        list = (List) A01.second;
                        anonymousClass094 = (AnonymousClass094) A01.first;
                    } else {
                        throw null;
                    }
                }
                if (list != null) {
                    c2av.A01(i, list, false, z, null, conditionVariable2, anonymousClass094);
                }
            }
        } catch (Throwable th) {
            c2av.A0E.A03(str, arrayList, z ? 7 : 0, z, null);
            conditionVariable.open();
            throw th;
        }
    }
}
