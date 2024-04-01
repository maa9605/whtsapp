package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.0hB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C11100hB extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0hA
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C11100hB(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C11100hB[i];
        }
    };
    public boolean A00;

    public C11100hB(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readByte() != 0;
    }

    public C11100hB(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A00 ? (byte) 1 : (byte) 0);
    }
}
