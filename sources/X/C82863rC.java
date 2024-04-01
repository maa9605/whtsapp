package X;

import android.content.res.Resources;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3rC */
/* loaded from: classes2.dex */
public class C82863rC extends AbstractC15200oF {
    public Resources A00;
    public final GridLayoutManager A01;
    public final boolean A02;

    public C82863rC(C003701t c003701t, Resources resources, GridLayoutManager gridLayoutManager) {
        this.A01 = gridLayoutManager;
        this.A00 = resources;
        this.A02 = c003701t.A0C(272);
    }

    @Override // X.AbstractC15200oF
    public void A01(RecyclerView recyclerView, int i, int i2) {
        A02(recyclerView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0044, code lost:
        if (r3 > r7) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0052, code lost:
        if (r3 >= (r8 + r6)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x005e, code lost:
        if (r3 > r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0068, code lost:
        if (r3 > r9) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(androidx.recyclerview.widget.RecyclerView r14) {
        /*
            r13 = this;
            androidx.recyclerview.widget.GridLayoutManager r11 = r13.A01
            int r10 = r11.A1G()
            int r9 = r11.A1I()
            int r8 = r11.A1F()
            int r7 = r11.A1H()
            int r6 = r11.A00
            android.content.res.Resources r0 = r13.A00
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.orientation
            r0 = 1
            r12 = 0
            if (r1 != r0) goto L21
            r12 = 1
        L21:
            int r5 = r11.A0A()
            r4 = 0
        L26:
            if (r4 >= r5) goto L6f
            android.view.View r0 = r11.A0H(r4)
            if (r0 != 0) goto L2f
            return
        L2f:
            int r3 = androidx.recyclerview.widget.RecyclerView.A00(r0)
            X.0TS r2 = r14.A0E(r0)
            X.3rA r2 = (X.C82843rA) r2
            boolean r0 = r13.A02
            if (r0 == 0) goto L59
            if (r12 == 0) goto L65
            if (r9 != r7) goto L4d
            if (r3 < r8) goto L46
            r0 = 1
            if (r3 <= r7) goto L47
        L46:
            r0 = 0
        L47:
            r2.A0C(r0)
        L4a:
            int r4 = r4 + 1
            goto L26
        L4d:
            if (r3 < r8) goto L54
            int r1 = r8 + r6
            r0 = 1
            if (r3 < r1) goto L55
        L54:
            r0 = 0
        L55:
            r2.A0C(r0)
            goto L4a
        L59:
            if (r12 == 0) goto L65
            if (r3 < r8) goto L60
            r0 = 1
            if (r3 <= r7) goto L61
        L60:
            r0 = 0
        L61:
            r2.A0C(r0)
            goto L4a
        L65:
            if (r3 < r10) goto L6a
            r0 = 1
            if (r3 <= r9) goto L6b
        L6a:
            r0 = 0
        L6b:
            r2.A0C(r0)
            goto L4a
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82863rC.A02(androidx.recyclerview.widget.RecyclerView):void");
    }
}
