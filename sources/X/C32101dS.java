package X;

import android.graphics.PointF;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.HashSet;

/* renamed from: X.1dS */
/* loaded from: classes.dex */
public final class C32101dS extends C19H {
    public final C32131dV A01;
    public final C19R A02 = new C19R();
    public final Object A03 = new Object();
    public boolean A00 = true;

    public final void finalize() {
        try {
            synchronized (this.A03) {
                if (this.A00) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    A01();
                }
            }
        } finally {
            super.finalize();
        }
    }

    public C32101dS(C32131dV c32131dV) {
        this.A01 = c32131dV;
    }

    @Override // X.C19H
    public final SparseArray A00(C19J c19j) {
        C19K[] c19kArr;
        C19L[] c19lArr;
        int i;
        ByteBuffer byteBuffer = c19j.A01;
        synchronized (this.A03) {
            if (!this.A00) {
                throw new RuntimeException("Cannot use detector after release()");
            }
            C32131dV c32131dV = this.A01;
            C31731cm c31731cm = new C31731cm();
            C19I c19i = c19j.A00;
            c31731cm.A03 = c19i.A03;
            c31731cm.A00 = c19i.A00;
            c31731cm.A02 = c19i.A02;
            c31731cm.A01 = c19i.A01;
            c31731cm.A04 = c19i.A04;
            if (!(c32131dV.A00() != null)) {
                c19kArr = new C19K[0];
            } else {
                try {
                    C32111dT[] AXA = ((C19O) c32131dV.A00()).AXA(new BinderC06190Rw(byteBuffer), c31731cm);
                    int length = AXA.length;
                    c19kArr = new C19K[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        C32111dT c32111dT = AXA[i2];
                        int i3 = c32111dT.A09;
                        PointF pointF = new PointF(c32111dT.A00, c32111dT.A01);
                        float f = c32111dT.A03;
                        float f2 = c32111dT.A02;
                        C32121dU[] c32121dUArr = c32111dT.A0B;
                        if (c32121dUArr == null) {
                            c19lArr = new C19L[0];
                        } else {
                            int length2 = c32121dUArr.length;
                            c19lArr = new C19L[length2];
                            for (int i4 = 0; i4 < length2; i4++) {
                                C32121dU c32121dU = c32121dUArr[i4];
                                c19lArr[i4] = new Object(new PointF(c32121dU.A00, c32121dU.A01)) { // from class: X.19L
                                    public final PointF A00;

                                    {
                                        this.A00 = r1;
                                    }
                                };
                            }
                        }
                        c19kArr[i2] = new C19K(i3, pointF, f, f2, c19lArr);
                    }
                } catch (RemoteException e) {
                    Log.e("FaceNativeHandle", "Could not call native face detector", e);
                    c19kArr = new C19K[0];
                }
            }
        }
        HashSet hashSet = new HashSet();
        SparseArray sparseArray = new SparseArray(c19kArr.length);
        int i5 = 0;
        for (C19K c19k : c19kArr) {
            int i6 = c19k.A02;
            i5 = Math.max(i5, i6);
            if (hashSet.contains(Integer.valueOf(i6))) {
                i6 = i5 + 1;
                i5 = i6;
            }
            Integer valueOf = Integer.valueOf(i6);
            hashSet.add(valueOf);
            C19R c19r = this.A02;
            if (c19r == null) {
                throw null;
            }
            synchronized (C19R.A03) {
                SparseArray sparseArray2 = c19r.A00;
                Integer num = (Integer) sparseArray2.get(i6);
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = C19R.A02;
                    C19R.A02 = i + 1;
                    sparseArray2.append(i6, Integer.valueOf(i));
                    c19r.A01.append(i, valueOf);
                }
            }
            sparseArray.append(i, c19k);
        }
        return sparseArray;
    }

    @Override // X.C19H
    public final void A01() {
        super.A01();
        synchronized (this.A03) {
            if (this.A00) {
                C32131dV c32131dV = this.A01;
                synchronized (c32131dV.A03) {
                    if (((AbstractC237617z) c32131dV).A00 != null) {
                        try {
                            ((C19O) c32131dV.A00()).AXL();
                        } catch (RemoteException e) {
                            Log.e(c32131dV.A04, "Could not finalize native handle", e);
                        }
                    }
                }
                this.A00 = false;
            }
        }
    }
}
