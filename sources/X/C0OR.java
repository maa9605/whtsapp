package X;

import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0OR */
/* loaded from: classes.dex */
public class C0OR {
    public static final String A09 = AbstractC16430qO.A01("WorkContinuationImpl");
    public C0OE A00;
    public boolean A01;
    public final C0OO A02;
    public final C0OP A03;
    public final String A04;
    public final List A05 = new ArrayList();
    public final List A06;
    public final List A07;
    public final List A08;

    public C0OR(C0OP workManagerImpl, String name, C0OO existingWorkPolicy, List work, List parents) {
        this.A03 = workManagerImpl;
        this.A04 = name;
        this.A02 = existingWorkPolicy;
        this.A08 = work;
        this.A07 = parents;
        this.A06 = new ArrayList(work.size());
        if (parents != null) {
            Iterator it = parents.iterator();
            while (it.hasNext()) {
                this.A05.addAll(((C0OR) it.next()).A05);
            }
        }
        for (int i = 0; i < work.size(); i++) {
            String obj = ((C0OM) work.get(i)).A02.toString();
            this.A06.add(obj);
            this.A05.add(obj);
        }
    }

    public static Set A00(C0OR continuation) {
        HashSet hashSet = new HashSet();
        List<C0OR> list = continuation.A07;
        if (list != null && !list.isEmpty()) {
            for (C0OR c0or : list) {
                hashSet.addAll(c0or.A06);
            }
        }
        return hashSet;
    }

    public static boolean A01(C0OR continuation, Set visited) {
        List list = continuation.A06;
        visited.addAll(list);
        Set A00 = A00(continuation);
        for (Object obj : visited) {
            if (((AbstractCollection) A00).contains(obj)) {
                return true;
            }
        }
        List<C0OR> list2 = continuation.A07;
        if (list2 != null && !list2.isEmpty()) {
            for (C0OR c0or : list2) {
                if (A01(c0or, visited)) {
                    return true;
                }
            }
        }
        visited.removeAll(list);
        return false;
    }

    public C0OE A02() {
        if (!this.A01) {
            RunnableC17050rS runnableC17050rS = new RunnableC17050rS(this);
            ((C1WH) this.A03.A06).A01.execute(runnableC17050rS);
            this.A00 = runnableC17050rS.A00;
        } else {
            AbstractC16430qO.A00().A05(A09, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.A06)), new Throwable[0]);
        }
        return this.A00;
    }
}
