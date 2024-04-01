package X;

import android.util.SparseIntArray;

/* renamed from: X.0vw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19750vw {
    public final int A00;
    public final InterfaceC18980ue A01;
    public final C19770vy A02;
    public final C19770vy A03;
    public final C19770vy A04;
    public final C19770vy A05;
    public final InterfaceC19780vz A06;
    public final InterfaceC19780vz A07;
    public final InterfaceC19780vz A08;
    public final String A09;

    public C19750vw() {
        C1XN c1xn;
        int i;
        int i2;
        C0w3.A00();
        this.A02 = C19670vo.A00();
        this.A06 = C1Y9.A00();
        int i3 = C19680vp.A00;
        int i4 = i3 * 4194304;
        SparseIntArray sparseIntArray = new SparseIntArray();
        int i5 = C42271vT.A09;
        do {
            sparseIntArray.put(i5, i3);
            i5 <<= 1;
        } while (i5 <= 4194304);
        this.A03 = new C19770vy(4194304, i4, sparseIntArray, i3);
        synchronized (C1XN.class) {
            c1xn = C1XN.A00;
            if (c1xn == null) {
                c1xn = new C1XN();
                C1XN.A00 = c1xn;
            }
        }
        this.A01 = c1xn;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(1024, 5);
        sparseIntArray2.put(2048, 5);
        sparseIntArray2.put(4096, 5);
        sparseIntArray2.put(8192, 5);
        sparseIntArray2.put(16384, 5);
        sparseIntArray2.put(32768, 5);
        sparseIntArray2.put(65536, 5);
        sparseIntArray2.put(C42271vT.A09, 5);
        sparseIntArray2.put(262144, 2);
        sparseIntArray2.put(524288, 2);
        sparseIntArray2.put(1048576, 2);
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            i = 3145728;
        } else {
            i = 12582912;
            if (min < 33554432) {
                i = 6291456;
            }
        }
        int min2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min2 < 16777216) {
            i2 = min2 / 2;
        } else {
            i2 = (min2 >> 2) * 3;
        }
        this.A04 = new C19770vy(i, i2, sparseIntArray2, -1);
        this.A07 = C1Y9.A00();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(16384, 5);
        this.A05 = new C19770vy(81920, 1048576, sparseIntArray3, -1);
        this.A08 = C1Y9.A00();
        this.A09 = "legacy";
        this.A00 = 4194304;
        C0w3.A00();
    }
}
