package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1eE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C32531eE extends AbstractC13390lB {
    public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: X.1AQ
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C32531eE(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C32531eE(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C32531eE[i];
        }
    };
    public float A00;
    public int A01;
    public boolean A02;

    public C32531eE(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readFloat();
        this.A02 = parcel.readByte() != 0;
    }

    public C32531eE(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // X.AbstractC13390lB, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(super.A00, i);
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
    }
}
