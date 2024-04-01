package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.0l5  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C13330l5 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0l4
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C13330l5(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C13330l5[i];
        }
    };
    public int A00;

    public C13330l5(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
    }

    public C13330l5(Parcelable parcelable) {
        super(parcelable);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("HorizontalScrollView.SavedState{");
        A0P.append(Integer.toHexString(System.identityHashCode(this)));
        A0P.append(" scrollPosition=");
        return C000200d.A0K(A0P, this.A00, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }
}
