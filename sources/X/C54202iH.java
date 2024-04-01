package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;

/* renamed from: X.2iH  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C54202iH extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2pG
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C54202iH(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C54202iH[i];
        }
    };
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public SparseIntArray A05;

    public C54202iH(Parcel parcel) {
        super(parcel);
        this.A00 = -1;
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A05 = new SparseIntArray();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int i = 0;
            do {
                this.A05.put(parcel.readInt(), parcel.readInt());
                i++;
            } while (i < readInt);
        }
    }

    public C54202iH(Parcelable parcelable) {
        super(parcelable);
        this.A00 = -1;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A04);
        SparseIntArray sparseIntArray = this.A05;
        int i2 = 0;
        int size = sparseIntArray == null ? 0 : sparseIntArray.size();
        parcel.writeInt(size);
        if (size > 0) {
            do {
                parcel.writeInt(this.A05.keyAt(i2));
                parcel.writeInt(this.A05.valueAt(i2));
                i2++;
            } while (i2 < size);
        }
    }
}
