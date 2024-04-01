package X;

import android.content.Context;
import android.util.SparseIntArray;

/* renamed from: X.154  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass154 {
    public C06220Rz A00;
    public final SparseIntArray A01 = new SparseIntArray();

    public AnonymousClass154(C06220Rz c06220Rz) {
        C07K.A1P(c06220Rz);
        this.A00 = c06220Rz;
    }

    public int A00(Context context, InterfaceC30511ah interfaceC30511ah) {
        C07K.A1P(context);
        C07K.A1P(interfaceC30511ah);
        int i = 0;
        if (interfaceC30511ah.ARf()) {
            int ABP = interfaceC30511ah.ABP();
            SparseIntArray sparseIntArray = this.A01;
            int i2 = sparseIntArray.get(ABP, -1);
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            while (true) {
                if (i3 < sparseIntArray.size()) {
                    int keyAt = sparseIntArray.keyAt(i3);
                    if (keyAt > ABP && sparseIntArray.get(keyAt) == 0) {
                        break;
                    }
                    i3++;
                } else {
                    i = C0CL.A00(context, ABP);
                    if (C0CL.A04(context, i)) {
                        i = 18;
                    }
                }
            }
            sparseIntArray.put(ABP, i);
            return i;
        }
        return 0;
    }
}
