package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Tr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28761Tr extends C14250me {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0mX
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C28761Tr(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C28761Tr[i];
        }
    };
    public String A00;

    public C28761Tr(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
    }

    public C28761Tr(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
