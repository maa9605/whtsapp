package X;

/* renamed from: X.3b5  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC73093b5 {
    public int A00;
    public final int A01;

    public AbstractC73093b5(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public void A00() {
        long j;
        if (!(this instanceof C84103tC)) {
            C67393Fi c67393Fi = (C67393Fi) this;
            if (!c67393Fi.A05) {
                c67393Fi.A05 = true;
                C06350Ss c06350Ss = c67393Fi.A04;
                if (c06350Ss != null) {
                    synchronized (c06350Ss) {
                        j = c06350Ss.A03;
                    }
                    c67393Fi.A02 = j;
                }
                c67393Fi.A0B.A02();
                return;
            }
            return;
        }
        C84103tC c84103tC = (C84103tC) this;
        c84103tC.A01 = true;
        c84103tC.A07.A02();
    }

    public void A01() {
        if (!(this instanceof C84103tC)) {
            C67393Fi c67393Fi = (C67393Fi) this;
            c67393Fi.A0D.A00();
            c67393Fi.A0C.A00();
            c67393Fi.A0B.A00();
            c67393Fi.A0A.A00();
            c67393Fi.A00 = 4;
            return;
        }
        ((C84103tC) this).A08.A00();
    }
}
