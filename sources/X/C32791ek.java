package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1ek  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C32791ek extends AbstractC13390lB {
    public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: X.1BK
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C32791ek(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C32791ek(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C32791ek[i];
        }
    };
    public final C006802z A00;

    public C32791ek(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.A00 = new C006802z(readInt);
        for (int i = 0; i < readInt; i++) {
            this.A00.put(strArr[i], bundleArr[i]);
        }
    }

    public C32791ek(Parcelable parcelable) {
        super(parcelable);
        this.A00 = new C006802z();
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("ExtendableSavedState{");
        A0P.append(Integer.toHexString(System.identityHashCode(this)));
        A0P.append(" states=");
        A0P.append(this.A00);
        A0P.append("}");
        return A0P.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC13390lB, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(super.A00, i);
        C006802z c006802z = this.A00;
        int i2 = c006802z.A00;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            Object[] objArr = c006802z.A02;
            int i4 = i3 << 1;
            strArr[i3] = objArr[i4];
            bundleArr[i3] = objArr[i4 + 1];
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
