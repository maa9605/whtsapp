package X;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: X.1VA  reason: invalid class name */
/* loaded from: classes.dex */
public class C1VA extends AbstractC16340qF {
    public int A00;
    public int A01;
    public int A02;
    public final int A03;
    public final int A04;
    public final Parcel A05;
    public final SparseIntArray A06;
    public final String A07;

    public C1VA(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C006702y(), new C006702y(), new C006702y());
    }

    public C1VA(Parcel parcel, int i, int i2, String str, C006702y c006702y, C006702y c006702y2, C006702y c006702y3) {
        super(c006702y, c006702y2, c006702y3);
        this.A06 = new SparseIntArray();
        this.A00 = -1;
        this.A02 = 0;
        this.A01 = -1;
        this.A05 = parcel;
        this.A04 = i;
        this.A03 = i2;
        this.A02 = i;
        this.A07 = str;
    }

    @Override // X.AbstractC16340qF
    public AbstractC16340qF A02() {
        Parcel parcel = this.A05;
        int dataPosition = parcel.dataPosition();
        int i = this.A02;
        if (i == this.A04) {
            i = this.A03;
        }
        return new C1VA(parcel, dataPosition, i, C000200d.A0L(new StringBuilder(), this.A07, "  "), super.A01, super.A02, super.A00);
    }

    @Override // X.AbstractC16340qF
    public void A05() {
        int i = this.A00;
        if (i >= 0) {
            int i2 = this.A06.get(i);
            Parcel parcel = this.A05;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(dataPosition - i2);
            parcel.setDataPosition(dataPosition);
        }
    }

    @Override // X.AbstractC16340qF
    public void A06(int i) {
        A05();
        this.A00 = i;
        SparseIntArray sparseIntArray = this.A06;
        Parcel parcel = this.A05;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    @Override // X.AbstractC16340qF
    public boolean A09(int i) {
        while (true) {
            int i2 = this.A02;
            if (i2 >= this.A03) {
                return this.A01 == i;
            }
            int i3 = this.A01;
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            Parcel parcel = this.A05;
            parcel.setDataPosition(i2);
            int readInt = parcel.readInt();
            this.A01 = parcel.readInt();
            this.A02 += readInt;
        }
    }
}
