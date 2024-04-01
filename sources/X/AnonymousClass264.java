package X;

/* renamed from: X.264 */
/* loaded from: classes2.dex */
public class AnonymousClass264 {
    public static volatile AnonymousClass264 A06;
    public final C000500h A00;
    public final C47532Bp A01;
    public final C2CK A02;
    public final C47492Bl A03;
    public final C40431sF A04;
    public final InterfaceC002901k A05;

    public AnonymousClass264(InterfaceC002901k interfaceC002901k, C40431sF c40431sF, C000500h c000500h, C47492Bl c47492Bl, C47532Bp c47532Bp, C2CK c2ck) {
        this.A05 = interfaceC002901k;
        this.A04 = c40431sF;
        this.A00 = c000500h;
        this.A03 = c47492Bl;
        this.A01 = c47532Bp;
        this.A02 = c2ck;
    }

    public static AnonymousClass264 A00() {
        if (A06 == null) {
            synchronized (AnonymousClass264.class) {
                if (A06 == null) {
                    A06 = new AnonymousClass264(C002801j.A00(), C40431sF.A00(), C000500h.A00(), C47492Bl.A00(), C47532Bp.A00(), C2CK.A00());
                }
            }
        }
        return A06;
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x00a4, code lost:
        if (r3.A00.A05() == false) goto L103;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List A01() {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass264.A01():java.util.List");
    }
}
