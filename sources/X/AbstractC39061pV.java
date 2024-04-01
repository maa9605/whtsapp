package X;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: X.1pV */
/* loaded from: classes.dex */
public abstract class AbstractC39061pV implements C1XO {
    public boolean A00;
    public final SparseArray A01;
    public final InterfaceC18980ue A02;
    public final C19610vi A03;
    public final C19610vi A04;
    public final C19770vy A05;
    public final InterfaceC19780vz A06;
    public final Class A07 = getClass();
    public final Set A08;

    public abstract int A00(int i);

    public abstract int A01(Object obj);

    public abstract Object A04(int i);

    public abstract void A07(Object obj);

    public boolean A09(Object obj) {
        return true;
    }

    public AbstractC39061pV(InterfaceC18980ue interfaceC18980ue, C19770vy c19770vy, InterfaceC19780vz interfaceC19780vz) {
        if (interfaceC18980ue != null) {
            this.A02 = interfaceC18980ue;
            if (c19770vy != null) {
                this.A05 = c19770vy;
                if (interfaceC19780vz != null) {
                    this.A06 = interfaceC19780vz;
                    this.A01 = new SparseArray();
                    SparseIntArray sparseIntArray = new SparseIntArray(0);
                    synchronized (this) {
                        this.A01.clear();
                        SparseIntArray sparseIntArray2 = this.A05.A03;
                        if (sparseIntArray2 != null) {
                            for (int i = 0; i < sparseIntArray2.size(); i++) {
                                int keyAt = sparseIntArray2.keyAt(i);
                                this.A01.put(keyAt, new C19640vl(keyAt, sparseIntArray2.valueAt(i), sparseIntArray.get(keyAt, 0)));
                            }
                            this.A00 = false;
                        } else {
                            this.A00 = true;
                        }
                    }
                    this.A08 = Collections.newSetFromMap(new IdentityHashMap());
                    this.A03 = new C19610vi();
                    this.A04 = new C19610vi();
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public C19640vl A02(int i) {
        return new C19640vl(i, Integer.MAX_VALUE, 0);
    }

    public synchronized C19640vl A03(int i) {
        SparseArray sparseArray = this.A01;
        C19640vl c19640vl = (C19640vl) sparseArray.get(i);
        if (c19640vl == null && this.A00) {
            C19640vl A02 = A02(i);
            sparseArray.put(i, A02);
            return A02;
        }
        return c19640vl;
    }

    public synchronized Object A05(C19640vl c19640vl) {
        Object A00;
        A00 = c19640vl.A00();
        if (A00 != null) {
            c19640vl.A00++;
        }
        return A00;
    }

    public synchronized void A06(int i) {
        int i2 = this.A04.A01;
        C19610vi c19610vi = this.A03;
        int i3 = c19610vi.A01;
        int min = Math.min((i2 + i3) - i, i3);
        if (min <= 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.A01;
            if (i4 >= sparseArray.size() || min <= 0) {
                break;
            }
            C19640vl c19640vl = (C19640vl) sparseArray.valueAt(i4);
            while (true) {
                Object A00 = c19640vl.A00();
                if (A00 != null) {
                    A07(A00);
                    min -= c19640vl.A01;
                    c19610vi.A00(c19640vl.A01);
                    if (min > 0) {
                    }
                }
            }
            i4++;
        }
    }

    public synchronized boolean A08() {
        return this.A04.A01 + this.A03.A01 > this.A05.A02;
    }

    @Override // X.C1XO, X.InterfaceC19050ul
    public void ARD(Object obj) {
        if (obj != null) {
            int A01 = A01(obj);
            synchronized (this) {
                C19640vl c19640vl = (C19640vl) this.A01.get(A01);
                if (!this.A08.remove(obj)) {
                    C18960uc.A00.A00(6, this.A07.getSimpleName(), String.format(null, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(A01)));
                    A07(obj);
                } else {
                    if (c19640vl != null) {
                        if (c19640vl.A00 + c19640vl.A03.size() <= c19640vl.A02 && !A08() && A09(obj)) {
                            int i = c19640vl.A00;
                            if (i > 0) {
                                c19640vl.A00 = i - 1;
                                c19640vl.A01(obj);
                            } else {
                                C18960uc.A00.A00(6, "BUCKET", String.format(null, "Tried to release value %s from an empty bucket!", obj));
                            }
                            C19610vi c19610vi = this.A03;
                            c19610vi.A00++;
                            c19610vi.A01 += A01;
                            this.A04.A00(A01);
                        } else {
                            int i2 = c19640vl.A00;
                            C07K.A1Z(i2 > 0);
                            c19640vl.A00 = i2 - 1;
                        }
                    }
                    A07(obj);
                    this.A04.A00(A01);
                }
            }
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x000e, code lost:
        if (r11.A03.A01 == 0) goto L80;
     */
    @Override // X.C1XO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object get(int r12) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC39061pV.get(int):java.lang.Object");
    }
}
