package X;

import android.util.SparseIntArray;

/* renamed from: X.1Cq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC24731Cq extends AbstractC39061pV {
    public final int[] A00;

    @Override // X.AbstractC39061pV
    /* renamed from: A0A */
    public abstract InterfaceC19710vs A04(int i);

    public AbstractC24731Cq(InterfaceC18980ue interfaceC18980ue, C19770vy c19770vy, InterfaceC19780vz interfaceC19780vz) {
        super(interfaceC18980ue, c19770vy, interfaceC19780vz);
        SparseIntArray sparseIntArray = c19770vy.A03;
        this.A00 = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.A00;
            if (i < iArr.length) {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // X.AbstractC39061pV
    public int A00(int i) {
        int[] iArr;
        if (i > 0) {
            for (int i2 : this.A00) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new C19620vj(Integer.valueOf(i));
    }

    @Override // X.AbstractC39061pV
    public int A01(Object obj) {
        return ((InterfaceC19710vs) obj).ADA();
    }

    @Override // X.AbstractC39061pV
    public void A07(Object obj) {
        ((InterfaceC19710vs) obj).close();
    }

    @Override // X.AbstractC39061pV
    public boolean A09(Object obj) {
        return !((InterfaceC19710vs) obj).isClosed();
    }
}
