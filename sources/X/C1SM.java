package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1SM  reason: invalid class name */
/* loaded from: classes.dex */
public class C1SM extends AbstractC13390lB {
    public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: X.0hl
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C1SM(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C1SM(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C1SM[i];
        }
    };
    public boolean A00;

    public C1SM(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public C1SM(Parcelable parcelable) {
        super(parcelable);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("SearchView.SavedState{");
        A0P.append(Integer.toHexString(System.identityHashCode(this)));
        A0P.append(" isIconified=");
        A0P.append(this.A00);
        A0P.append("}");
        return A0P.toString();
    }

    @Override // X.AbstractC13390lB, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(super.A00, i);
        parcel.writeValue(Boolean.valueOf(this.A00));
    }
}
