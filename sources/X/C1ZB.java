package X;

import java.util.Arrays;

/* renamed from: X.1ZB  reason: invalid class name */
/* loaded from: classes.dex */
public class C1ZB implements InterfaceC21560zX {
    public final C1ZH A00;
    public final C1ZI A01;
    public final InterfaceC21420zJ[] A02;

    public C1ZB(InterfaceC21420zJ... interfaceC21420zJArr) {
        int length = interfaceC21420zJArr.length;
        this.A02 = (InterfaceC21420zJ[]) Arrays.copyOf(interfaceC21420zJArr, length + 2);
        this.A00 = new C1ZH();
        C1ZI c1zi = new C1ZI();
        this.A01 = c1zi;
        InterfaceC21420zJ[] interfaceC21420zJArr2 = this.A02;
        interfaceC21420zJArr2[length] = this.A00;
        interfaceC21420zJArr2[length + 1] = c1zi;
    }

    @Override // X.InterfaceC21560zX
    public C21120yp A5X(C21120yp c21120yp) {
        C1ZH c1zh = this.A00;
        boolean z = c21120yp.A03;
        c1zh.A09 = z;
        c1zh.flush();
        C1ZI c1zi = this.A01;
        float f = c21120yp.A01;
        if (c1zi != null) {
            float max = Math.max(0.1f, Math.min(f, 8.0f));
            if (c1zi.A01 != max) {
                c1zi.A01 = max;
                c1zi.A08 = null;
            }
            c1zi.flush();
            float f2 = c21120yp.A00;
            if (c1zi != null) {
                float max2 = Math.max(0.1f, Math.min(f2, 8.0f));
                if (c1zi.A00 != max2) {
                    c1zi.A00 = max2;
                    c1zi.A08 = null;
                }
                c1zi.flush();
                return new C21120yp(max, max2, z);
            }
            throw null;
        }
        throw null;
    }

    @Override // X.InterfaceC21560zX
    public long ABA(long j) {
        C1ZI c1zi = this.A01;
        long j2 = c1zi.A07;
        if (j2 >= 1024) {
            int i = c1zi.A03;
            int i2 = c1zi.A05;
            long j3 = c1zi.A06;
            if (i == i2) {
                return C08M.A04(j, j3, j2);
            }
            return C08M.A04(j, j3 * i, j2 * i2);
        }
        return (long) (c1zi.A01 * j);
    }

    @Override // X.InterfaceC21560zX
    public long ADC() {
        return this.A00.A06;
    }
}
