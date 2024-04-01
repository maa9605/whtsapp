package X;

import java.util.ArrayList;

/* renamed from: X.2c3 */
/* loaded from: classes2.dex */
public class C53202c3 {
    public final C05W A00;
    public final C018708s A01;
    public final AnonymousClass012 A02;
    public final ArrayList A03;

    public C53202c3(AnonymousClass012 anonymousClass012, C05W c05w, C018708s c018708s) {
        this.A03 = new ArrayList();
        this.A02 = anonymousClass012;
        this.A00 = c05w;
        this.A01 = c018708s;
    }

    public C53202c3(AnonymousClass012 anonymousClass012, C05W c05w, C018708s c018708s, C0D3 c0d3) {
        ArrayList arrayList = new ArrayList();
        this.A03 = arrayList;
        this.A02 = anonymousClass012;
        this.A00 = c05w;
        this.A01 = c018708s;
        arrayList.add(c0d3);
    }

    public int A00() {
        ArrayList arrayList = this.A03;
        if (arrayList.isEmpty()) {
            return 3;
        }
        C0D3 c0d3 = (C0D3) arrayList.get(0);
        if (c0d3.A09.A03) {
            return 0;
        }
        int i = c0d3.A00;
        return (i == 5 || i == 6) ? 1 : 2;
    }

    public long A01() {
        ArrayList arrayList = this.A03;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        return this.A02.A06(((C0D3) arrayList.get(0)).A08);
    }

    public C06C A02() {
        ArrayList arrayList = this.A03;
        if (arrayList.isEmpty()) {
            return null;
        }
        return this.A00.A0A(((C0D3) arrayList.get(0)).A09.A01);
    }

    public String A03() {
        ArrayList arrayList = this.A03;
        if (arrayList.isEmpty()) {
            return null;
        }
        C0D3 c0d3 = (C0D3) arrayList.get(0);
        if (c0d3.A0E()) {
            StringBuilder A0P = C000200d.A0P("G:");
            C07950aM c07950aM = c0d3.A09;
            A0P.append(C003101m.A07(c07950aM.A01));
            A0P.append(c07950aM.A03);
            A0P.append(c07950aM.A02);
            A0P.append(c07950aM.A00);
            return A0P.toString();
        }
        StringBuilder A0P2 = C000200d.A0P("O:");
        A0P2.append(C003101m.A07(c0d3.A09.A01));
        A0P2.append(c0d3.A08);
        return A0P2.toString();
    }

    public boolean A04() {
        ArrayList arrayList = this.A03;
        return !arrayList.isEmpty() && ((C0D3) arrayList.get(0)).A0E();
    }

    public boolean A05() {
        ArrayList arrayList = this.A03;
        return !arrayList.isEmpty() && ((C0D3) arrayList.get(0)).A0E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0044, code lost:
        if (r1 == 6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0052, code lost:
        if (r2 == 6) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A06(X.C0D3 r10) {
        /*
            r9 = this;
            java.util.ArrayList r4 = r9.A03
            boolean r0 = r4.isEmpty()
            r8 = 0
            r1 = 1
            if (r0 != 0) goto L5d
            int r0 = r4.size()
            int r0 = r0 - r1
            java.lang.Object r5 = r4.get(r0)
            X.0D3 r5 = (X.C0D3) r5
            boolean r0 = r10.A0E()
            if (r0 != 0) goto L61
            boolean r0 = r5.A0E()
            if (r0 != 0) goto L61
            X.0aM r7 = r10.A09
            com.whatsapp.jid.UserJid r1 = r7.A01
            X.0aM r6 = r5.A09
            com.whatsapp.jid.UserJid r0 = r6.A01
            boolean r0 = X.AnonymousClass024.A0l(r1, r0)
            if (r0 == 0) goto L61
            long r2 = r10.A08
            long r0 = r5.A08
            boolean r0 = X.C02620Cd.A06(r2, r0)
            if (r0 == 0) goto L61
            boolean r0 = r7.A03
            if (r0 != 0) goto L46
            int r1 = r10.A00
            r0 = 5
            if (r1 == r0) goto L46
            r0 = 6
            r3 = 1
            if (r1 != r0) goto L47
        L46:
            r3 = 0
        L47:
            boolean r0 = r6.A03
            if (r0 != 0) goto L54
            int r2 = r5.A00
            r0 = 5
            if (r2 == r0) goto L54
            r1 = 6
            r0 = 1
            if (r2 != r1) goto L55
        L54:
            r0 = 0
        L55:
            if (r3 != r0) goto L61
            boolean r1 = r10.A0E
            boolean r0 = r5.A0E
            if (r1 != r0) goto L61
        L5d:
            r8 = 1
            r4.add(r10)
        L61:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53202c3.A06(X.0D3):boolean");
    }

    public String toString() {
        if (this.A03.isEmpty()) {
            return null;
        }
        return this.A01.A08(A02(), false);
    }
}
