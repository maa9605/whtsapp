package X;

import android.util.SparseIntArray;

/* renamed from: X.1Cs  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C24751Cs extends AbstractC39061pV implements C1XO {
    public final int[] A00;

    public C24751Cs(InterfaceC18980ue interfaceC18980ue, C19770vy c19770vy, InterfaceC19780vz interfaceC19780vz) {
        super(interfaceC18980ue, c19770vy, interfaceC19780vz);
        SparseIntArray sparseIntArray = c19770vy.A03;
        this.A00 = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.A00[i] = sparseIntArray.keyAt(i);
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
        return ((byte[]) obj).length;
    }

    @Override // X.AbstractC39061pV
    public Object A04(int i) {
        return new byte[i];
    }

    @Override // X.AbstractC39061pV
    public void A07(Object obj) {
    }
}
