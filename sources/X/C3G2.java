package X;

import java.io.File;

/* renamed from: X.3G2  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3G2 extends AnonymousClass235 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;
    public final int[] A05;

    public C3G2(File file, byte[] bArr, boolean z, int i, int i2, int i3, int i4, boolean z2, int[] iArr, String str) {
        super(file, bArr, z, str);
        this.A02 = i;
        this.A03 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A04 = z2;
        if (iArr != null && iArr.length >= 2) {
            this.A05 = iArr;
        } else {
            this.A05 = new int[0];
        }
    }
}
