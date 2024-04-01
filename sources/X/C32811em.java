package X;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* renamed from: X.1em  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C32811em implements C0Z8 {
    public int A00;
    public int A01;
    public final WeakReference A02;

    public C32811em(TabLayout tabLayout) {
        this.A02 = new WeakReference(tabLayout);
    }

    @Override // X.C0Z8
    public void AMg(int i) {
        this.A00 = this.A01;
        this.A01 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r7.A00 == 1) goto L14;
     */
    @Override // X.C0Z8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AMh(int r8, float r9, int r10) {
        /*
            r7 = this;
            java.lang.ref.WeakReference r0 = r7.A02
            java.lang.Object r6 = r0.get()
            com.google.android.material.tabs.TabLayout r6 = (com.google.android.material.tabs.TabLayout) r6
            if (r6 == 0) goto L21
            int r5 = r7.A01
            r4 = 0
            r3 = 2
            r2 = 1
            if (r5 != r3) goto L16
            int r0 = r7.A00
            r1 = 0
            if (r0 != r2) goto L17
        L16:
            r1 = 1
        L17:
            if (r5 != r3) goto L1d
            int r0 = r7.A00
            if (r0 == 0) goto L1e
        L1d:
            r4 = 1
        L1e:
            r6.A0A(r8, r9, r1, r4)
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32811em.AMh(int, float, int):void");
    }

    @Override // X.C0Z8
    public void AMi(int i) {
        TabLayout tabLayout = (TabLayout) this.A02.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
            return;
        }
        int i2 = this.A01;
        tabLayout.A0F(tabLayout.A04(i), i2 == 0 || (i2 == 2 && this.A00 == 0));
    }
}
