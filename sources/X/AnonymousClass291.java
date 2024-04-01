package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.291  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass291 extends RunnableEmptyBase implements Runnable {
    public final C468528n A00;
    public final /* synthetic */ C468928r A01;

    public AnonymousClass291(C468928r c468928r, C468528n c468528n) {
        this.A01 = c468928r;
        this.A00 = c468528n;
    }

    public final void A00(EnumC40721sl enumC40721sl) {
        ArrayList arrayList = new ArrayList();
        C468528n c468528n = this.A00;
        List<C469028s> list = c468528n.A03;
        for (C469028s c469028s : list) {
            if (!c469028s.A00) {
                arrayList.add(c469028s);
                c469028s.A01 = enumC40721sl;
                c469028s.A02 = true;
                c469028s.A03.countDown();
            }
        }
        list.removeAll(arrayList);
        if (list.isEmpty()) {
            return;
        }
        c468528n.A01 = false;
        this.A01.A04(c468528n);
    }

    public final void A01(EnumC40721sl enumC40721sl) {
        for (C0Ml c0Ml : this.A00.A03) {
            c0Ml.A01 = enumC40721sl;
            c0Ml.A02 = true;
            c0Ml.A03.countDown();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:253:0x0691, code lost:
        if (r10 == r25) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x069d, code lost:
        if (r10 == r25) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x06aa, code lost:
        if (r27 == false) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x09e8, code lost:
        if (r5 == 6) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0a0d, code lost:
        if (r4 != null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01ff, code lost:
        if (r7 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0209, code lost:
        if (r0.A0M.A03() == false) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0266, code lost:
        if (r0.A0L.A05.A04() == false) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02c4, code lost:
        if (r4 == r25) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02d2, code lost:
        if (r4 == r25) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02f2, code lost:
        if (r2 == 0) goto L99;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0b34 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v68, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.011] */
    /* JADX WARN: Type inference failed for: r2v118, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v18, types: [X.011] */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.database.Cursor] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 3020
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass291.run():void");
    }
}
