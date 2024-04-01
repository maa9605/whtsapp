package X;

/* renamed from: X.3eg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C75303eg {
    public int A00;
    public InterfaceC54282iU A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public byte[] A05;

    public C75303eg() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r4.startsWith("PGP", r3) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C75303eg(X.InterfaceC54282iU r7) {
        /*
            r6 = this;
            r6.<init>()
            r6.A01 = r7
            int r0 = r7.A8X()
            byte[] r0 = new byte[r0]
            r6.A05 = r0
            r5 = 0
            r6.A00 = r5
            java.lang.String r4 = r7.A8K()
            r0 = 47
            int r3 = r4.indexOf(r0)
            r2 = 1
            int r3 = r3 + r2
            if (r3 <= 0) goto L27
            java.lang.String r0 = "PGP"
            boolean r1 = r4.startsWith(r0, r3)
            r0 = 1
            if (r1 != 0) goto L28
        L27:
            r0 = 0
        L28:
            r6.A04 = r0
            if (r0 != 0) goto L3e
            boolean r0 = r7 instanceof X.InterfaceC75323ei
            if (r0 != 0) goto L3e
            if (r3 <= 0) goto L3b
            java.lang.String r0 = "OpenPGP"
            boolean r0 = r4.startsWith(r0, r3)
            if (r0 == 0) goto L3b
            r5 = 1
        L3b:
            r6.A03 = r5
            return
        L3e:
            r6.A03 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75303eg.<init>(X.2iU):void");
    }

    public int A00(int i) {
        int length;
        if (!(this instanceof C85413vM)) {
            int i2 = i + this.A00;
            if (this.A04) {
                if (this.A02) {
                    length = (i2 % this.A05.length) - (this.A01.A8X() + 2);
                } else {
                    length = i2 % this.A05.length;
                }
            } else {
                length = i2 % this.A05.length;
            }
            return i2 - length;
        }
        int i3 = i + this.A00;
        int length2 = this.A05.length;
        int i4 = i3 % length2;
        return i4 == 0 ? Math.max(0, i3 - length2) : i3 - i4;
    }

    public void A01() {
        int i = 0;
        while (true) {
            byte[] bArr = this.A05;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                this.A00 = 0;
                this.A01.reset();
                return;
            }
        }
    }
}
