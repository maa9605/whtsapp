package X;

/* renamed from: X.0DP  reason: invalid class name */
/* loaded from: classes.dex */
public class C0DP extends C0DL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int[] A05;

    @Override // X.C0DO
    public String A8K() {
        return "MD5";
    }

    @Override // X.C0DO
    public int A9n() {
        return 16;
    }

    public C0DP() {
        this.A05 = new int[16];
        reset();
    }

    public C0DP(C0DP c0dp) {
        super(c0dp);
        this.A05 = new int[16];
        A05(c0dp);
    }

    public static final void A00(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r10v53 ?? I:int)
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:114)
        */
    @Override // X.C0DL
    public void A02() {
        /*
            Method dump skipped, instructions count: 1383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DP.A02():void");
    }

    @Override // X.C0DL
    public void A03(long j) {
        if (this.A04 > 14) {
            A02();
        }
        int[] iArr = this.A05;
        iArr[14] = (int) ((-1) & j);
        iArr[15] = (int) (j >>> 32);
    }

    @Override // X.C0DL
    public void A04(byte[] bArr, int i) {
        int[] iArr = this.A05;
        int i2 = this.A04;
        int i3 = i2 + 1;
        this.A04 = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            A02();
        }
    }

    public final void A05(C0DP c0dp) {
        super.A01(c0dp);
        this.A00 = c0dp.A00;
        this.A01 = c0dp.A01;
        this.A02 = c0dp.A02;
        this.A03 = c0dp.A03;
        int[] iArr = c0dp.A05;
        System.arraycopy(iArr, 0, this.A05, 0, iArr.length);
        this.A04 = c0dp.A04;
    }

    @Override // X.C0DM
    public C0DM A6a() {
        return new C0DP(this);
    }

    @Override // X.C0DO
    public int A7P(byte[] bArr, int i) {
        A00();
        A00(this.A00, bArr, i);
        A00(this.A01, bArr, i + 4);
        A00(this.A02, bArr, i + 8);
        A00(this.A03, bArr, i + 12);
        reset();
        return 16;
    }

    @Override // X.C0DM
    public void ARi(C0DM c0dm) {
        A05((C0DP) c0dm);
    }

    @Override // X.C0DL, X.C0DO
    public void reset() {
        super.reset();
        this.A00 = 1732584193;
        this.A01 = -271733879;
        this.A02 = -1732584194;
        this.A03 = 271733878;
        this.A04 = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.A05;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }
}
