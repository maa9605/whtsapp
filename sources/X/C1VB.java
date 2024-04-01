package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1VB  reason: invalid class name */
/* loaded from: classes.dex */
public class C1VB extends AbstractC13390lB {
    public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: X.0qI
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C1VB(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C1VB(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C1VB[i];
        }
    };
    public int A00;
    public Parcelable A01;
    public ClassLoader A02;

    public C1VB(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? C1VB.class.getClassLoader() : classLoader;
        this.A00 = parcel.readInt();
        this.A01 = parcel.readParcelable(classLoader);
        this.A02 = classLoader;
    }

    public C1VB(Parcelable parcelable) {
        super(parcelable);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("FragmentPager.SavedState{");
        A0P.append(Integer.toHexString(System.identityHashCode(this)));
        A0P.append(" position=");
        return C000200d.A0K(A0P, this.A00, "}");
    }

    @Override // X.AbstractC13390lB, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(super.A00, i);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i);
    }
}
