package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1U6  reason: invalid class name */
/* loaded from: classes.dex */
public class C1U6 extends C14250me {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0n5
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C1U6(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C1U6[i];
        }
    };
    public boolean A00;

    public C1U6(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt() == 1;
    }

    public C1U6(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
