package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: X.1Sy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28631Sy extends AbstractC13390lB {
    public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: X.0jV
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C28631Sy(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C28631Sy(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C28631Sy[i];
        }
    };
    public SparseArray A00;

    public C28631Sy(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        SparseArray sparseArray = new SparseArray(readInt);
        this.A00 = sparseArray;
        for (int i = 0; i < readInt; i++) {
            sparseArray.append(iArr[i], readParcelableArray[i]);
        }
    }

    public C28631Sy(Parcelable parcelable) {
        super(parcelable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC13390lB, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(super.A00, i);
        SparseArray sparseArray = this.A00;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.A00.keyAt(i2);
            parcelableArr[i2] = this.A00.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
