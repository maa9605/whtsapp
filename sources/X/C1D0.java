package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.util.ArrayList;

/* renamed from: X.1D0  reason: invalid class name */
/* loaded from: classes.dex */
public class C1D0 extends C39041pT implements InterfaceC18420ti {
    public static Bitmap A04;
    public static C18650u5 A05;
    public static final ArrayList A06 = new ArrayList(5);
    public int A00;
    public boolean A01;
    public final C29451Wv A02;
    public final C24821Cz A03;

    @Override // X.AbstractC29401Wq
    public int A0C() {
        return 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1D0(X.C0T4 r19, X.C24821Cz r20) {
        /*
            r18 = this;
            X.0uI r2 = new X.0uI
            r2.<init>()
            r3 = r20
            r2.A00 = r3
            r1 = 0
            X.0u5 r0 = X.C1D0.A05
            if (r0 != 0) goto L15
            X.0u5 r0 = new X.0u5
            r0.<init>()
            X.C1D0.A05 = r0
        L15:
            r4 = r19
            r5 = r18
            r5.<init>(r4, r2, r0)
            r0 = 1
            r5.A00 = r0
            r5.A03 = r1
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            r5.A00 = r0
            r5.A03 = r3
            X.1Wv r0 = new X.1Wv
            r0.<init>(r4)
            r5.A02 = r0
            X.0T4 r1 = r5.A0A
            r1.A09(r0)
            X.0Sx r0 = r1.A0E
            r0.A0P = r5
            X.1X2 r0 = new X.1X2
            r0.<init>()
            r5.A0A = r0
            android.graphics.Bitmap r0 = X.C1D0.A04
            if (r0 != 0) goto Laa
            int r3 = r1.A0O
            android.content.Context r0 = r1.A0P
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.densityDpi
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r3, r0)
            X.C1D0.A04 = r0
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r0)
            r0 = 320(0x140, float:4.48E-43)
            r2 = 16
            if (r1 < r0) goto L65
            r2 = 32
        L65:
            android.graphics.Paint r9 = new android.graphics.Paint
            r9.<init>()
            r0 = -7235677(0xffffffffff9197a3, float:NaN)
            r9.setColor(r0)
            r6 = 0
            r5 = 0
        L72:
            float r8 = (float) r3
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 > 0) goto Laa
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 == 0) goto L81
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            r0 = 18
            if (r1 != 0) goto L83
        L81:
            r0 = 44
        L83:
            r9.setAlpha(r0)
            r7 = r5
            r4.drawLine(r5, r6, r7, r8, r9)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r11 = r5 - r0
            r10 = r4
            r12 = r6
            r13 = r11
            r14 = r8
            r15 = r9
            r10.drawLine(r11, r12, r13, r14, r15)
            r12 = r4
            r13 = r6
            r14 = r5
            r15 = r8
            r16 = r5
            r17 = r9
            r12.drawLine(r13, r14, r15, r16, r17)
            r14 = r11
            r16 = r11
            r12.drawLine(r13, r14, r15, r16, r17)
            float r0 = (float) r2
            float r5 = r5 + r0
            goto L72
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1D0.<init>(X.0T4, X.1Cz):void");
    }

    public static void A00(int[] iArr) {
        ArrayList arrayList = A06;
        int size = arrayList.size();
        if (size == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
            return;
        }
        double max = Math.max(1.6d - (size * 0.1d), 1.1d);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((AbstractC29401Wq) arrayList.get(i2)).A01;
        }
        int i3 = ((int) (i * max)) + 1;
        iArr[0] = i3;
        iArr[1] = Math.max((i3 - i) - 1, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r3.getHeight() < r1) goto L13;
     */
    @Override // X.AbstractC29401Wq, X.C0SK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0A() {
        /*
            r4 = this;
            r4.A0G()
            X.0T4 r0 = r4.A0A
            X.0Sx r3 = r0.A0E
            r0 = 1132068864(0x437a0000, float:250.0)
            float r1 = r4.A06
            float r1 = r1 * r0
            int r0 = r3.getWidth()
            float r0 = (float) r0
            r2 = 1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L20
            int r0 = r3.getHeight()
            float r0 = (float) r0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r0 = 1
            if (r1 >= 0) goto L21
        L20:
            r0 = 0
        L21:
            r4.A01 = r0
            X.1Wv r1 = r4.A02
            if (r0 == 0) goto L31
            boolean r0 = r4.A04
            if (r0 == 0) goto L31
        L2b:
            r1.A04 = r2
            r1.A01()
            return
        L31:
            r2 = 0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1D0.A0A():void");
    }

    @Override // X.AbstractC29401Wq, X.C0SK
    public void A0B(Canvas canvas) {
        long nanoTime = System.nanoTime();
        super.A0B(canvas);
        C18680u8.A0L.A03(System.nanoTime() - nanoTime);
    }

    @Override // X.C39041pT, X.AbstractC29401Wq
    public C18760uH A0D(int i, int i2, int i3) {
        C18760uH A0D = super.A0D(i, i2, i3);
        if (A0D != null) {
            A0D.A02 = i;
            A0D.A03 = i2;
            A0D.A04 = i3;
        }
        return A0D;
    }

    @Override // X.AbstractC29401Wq
    public void A0E() {
        if (this.A03 != null) {
            ((AbstractC29401Wq) this).A01 = 0;
            ArrayList arrayList = A06;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                A0I(false);
            }
            int[] iArr = ((AbstractC29401Wq) this).A0D;
            A00(iArr);
            C18650u5 c18650u5 = ((AbstractC29401Wq) this).A0C;
            c18650u5.A01 = iArr[0];
            c18650u5.A02 = iArr[1];
            c18650u5.A01();
            return;
        }
        throw null;
    }

    @Override // X.AbstractC29401Wq
    public void A0F() {
        ((AbstractC29401Wq) this).A00 = 1.2d;
    }

    @Override // X.AbstractC29401Wq
    public void A0J(int[] iArr) {
        ArrayList arrayList = A06;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        A00(iArr);
    }
}
