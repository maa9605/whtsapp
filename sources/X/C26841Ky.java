package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.1Ky  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C26841Ky extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.1Kx
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C26841Ky(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C26841Ky[i];
        }
    };
    public int A00;

    public C26841Ky(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
    }

    public C26841Ky(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }
}
