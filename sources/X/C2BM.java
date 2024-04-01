package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2BM */
/* loaded from: classes2.dex */
public class C2BM {
    public static volatile C2BM A03;
    public final C018608r A00;
    public final C44581zJ A01;
    public final C0C9 A02;

    public C2BM(C018608r c018608r, C0C9 c0c9, C44581zJ c44581zJ) {
        this.A00 = c018608r;
        this.A02 = c0c9;
        this.A01 = c44581zJ;
    }

    public final List A00(AbstractC005302j abstractC005302j, boolean z, Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C2FF c2ff = (C2FF) it.next();
            C0C9 c0c9 = this.A02;
            AnonymousClass092 A05 = c0c9.A0H.A05(new AnonymousClass094(abstractC005302j, c2ff.A04, c2ff.A03));
            if (A05 != null && (!A05.A0j || z)) {
                arrayList.add(A05);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:342:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x00cb A[Catch: all -> 0x02b7, LOOP:5: B:347:0x00cb->B:349:0x00d1, LOOP_START, TRY_ENTER, TryCatch #15 {all -> 0x02b7, blocks: (B:337:0x00a0, B:347:0x00cb, B:349:0x00d1), top: B:544:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0175 A[Catch: all -> 0x02a7, LOOP:4: B:377:0x0175->B:379:0x017b, LOOP_START, TRY_ENTER, TryCatch #5 {all -> 0x02a7, blocks: (B:364:0x0138, B:377:0x0175, B:379:0x017b), top: B:527:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:633:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(X.AbstractC005302j r26, boolean r27, boolean r28, X.C44591zK r29) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2BM.A01(X.02j, boolean, boolean, X.1zK):void");
    }
}
