package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1eN  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C32591eN extends AbstractC13390lB {
    public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: X.1Af
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C32591eN(parcel, (ClassLoader) null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C32591eN(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C32591eN[i];
        }
    };
    public final int A00;

    public C32591eN(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readInt();
    }

    public C32591eN(Parcelable parcelable, int i) {
        super(parcelable);
        this.A00 = i;
    }

    @Override // X.AbstractC13390lB, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(super.A00, i);
        parcel.writeInt(this.A00);
    }
}
