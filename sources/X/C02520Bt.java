package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.0Bt */
/* loaded from: classes.dex */
public class C02520Bt extends AbstractC02530Bu {
    public final WeakReference A06;
    public C02540Bv A01 = new C02540Bv();
    public int A00 = 0;
    public boolean A04 = false;
    public boolean A05 = false;
    public ArrayList A03 = new ArrayList();
    public EnumC02560Bx A02 = EnumC02560Bx.INITIALIZED;

    public C02520Bt(InterfaceC02360Aw interfaceC02360Aw) {
        this.A06 = new WeakReference(interfaceC02360Aw);
    }

    public static C0C1 A00(EnumC02560Bx enumC02560Bx) {
        int ordinal = enumC02560Bx.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return C0C1.ON_CREATE;
        }
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    StringBuilder sb = new StringBuilder("Unexpected state value ");
                    sb.append(enumC02560Bx);
                    throw new IllegalArgumentException(sb.toString());
                }
                throw new IllegalArgumentException();
            }
            return C0C1.ON_RESUME;
        }
        return C0C1.ON_START;
    }

    public static EnumC02560Bx A01(C0C1 c0c1) {
        int ordinal = c0c1.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return EnumC02560Bx.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return EnumC02560Bx.DESTROYED;
                        }
                        StringBuilder sb = new StringBuilder("Unexpected event value ");
                        sb.append(c0c1);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
            return EnumC02560Bx.STARTED;
        }
        return EnumC02560Bx.CREATED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0029, code lost:
        if (r6.A04 != false) goto L27;
     */
    @Override // X.AbstractC02530Bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(X.C0MW r7) {
        /*
            r6 = this;
            X.0Bx r1 = r6.A02
            X.0Bx r0 = X.EnumC02560Bx.DESTROYED
            if (r1 == r0) goto L8
            X.0Bx r0 = X.EnumC02560Bx.INITIALIZED
        L8:
            X.0UB r3 = new X.0UB
            r3.<init>(r7, r0)
            X.0Bv r0 = r6.A01
            java.lang.Object r0 = r0.A02(r7, r3)
            if (r0 == 0) goto L16
            return
        L16:
            java.lang.ref.WeakReference r0 = r6.A06
            java.lang.Object r2 = r0.get()
            X.0Aw r2 = (X.InterfaceC02360Aw) r2
            if (r2 != 0) goto L21
            return
        L21:
            int r0 = r6.A00
            r5 = 1
            if (r0 != 0) goto L2b
            boolean r0 = r6.A04
            r4 = 0
            if (r0 == 0) goto L2c
        L2b:
            r4 = 1
        L2c:
            X.0Bx r1 = r6.A03(r7)
            int r0 = r6.A00
            int r0 = r0 + r5
            r6.A00 = r0
        L35:
            X.0Bx r0 = r3.A00
            int r0 = r0.compareTo(r1)
            if (r0 >= 0) goto L65
            X.0Bv r0 = r6.A01
            java.util.HashMap r0 = r0.A00
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L65
            X.0Bx r1 = r3.A00
            java.util.ArrayList r0 = r6.A03
            r0.add(r1)
            X.0C1 r0 = A00(r1)
            r3.A00(r2, r0)
            java.util.ArrayList r1 = r6.A03
            int r0 = r1.size()
            int r0 = r0 + (-1)
            r1.remove(r0)
            X.0Bx r1 = r6.A03(r7)
            goto L35
        L65:
            if (r4 != 0) goto L6a
            r6.A04()
        L6a:
            int r0 = r6.A00
            int r0 = r0 - r5
            r6.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02520Bt.A02(X.0MW):void");
    }

    public final EnumC02560Bx A03(C0MW c0mw) {
        EnumC02560Bx enumC02560Bx;
        C0UC c0uc;
        C02540Bv c02540Bv = this.A01;
        if (c02540Bv.A00.containsKey(c0mw) && (c0uc = ((C0UC) c02540Bv.A00.get(c0mw)).A01) != null) {
            enumC02560Bx = ((C0UB) c0uc.getValue()).A00;
        } else {
            enumC02560Bx = null;
        }
        ArrayList arrayList = this.A03;
        EnumC02560Bx enumC02560Bx2 = arrayList.isEmpty() ? null : (EnumC02560Bx) arrayList.get(arrayList.size() - 1);
        EnumC02560Bx enumC02560Bx3 = this.A02;
        if (enumC02560Bx != null && enumC02560Bx.compareTo(enumC02560Bx3) < 0) {
            enumC02560Bx3 = enumC02560Bx;
        }
        return (enumC02560Bx2 == null || enumC02560Bx2.compareTo(enumC02560Bx3) >= 0) ? enumC02560Bx3 : enumC02560Bx2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x004f, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A04() {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02520Bt.A04():void");
    }

    public void A05(C0C1 c0c1) {
        A06(A01(c0c1));
    }

    public final void A06(EnumC02560Bx enumC02560Bx) {
        if (this.A02 == enumC02560Bx) {
            return;
        }
        this.A02 = enumC02560Bx;
        if (!this.A04 && this.A00 == 0) {
            this.A04 = true;
            A04();
            this.A04 = false;
            return;
        }
        this.A05 = true;
    }
}
