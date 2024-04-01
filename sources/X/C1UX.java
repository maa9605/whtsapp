package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1UX  reason: invalid class name */
/* loaded from: classes.dex */
public class C1UX extends AbstractC13390lB {
    public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: X.0oK
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C1UX(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C1UX(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C1UX[i];
        }
    };
    public Parcelable A00;

    public C1UX(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readParcelable(classLoader == null ? C0SV.class.getClassLoader() : classLoader);
    }

    public C1UX(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // X.AbstractC13390lB, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(super.A00, i);
        parcel.writeParcelable(this.A00, 0);
    }
}
