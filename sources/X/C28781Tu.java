package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Tu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28781Tu extends C14250me {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0mY
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C28781Tu(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C28781Tu[i];
        }
    };
    public String A00;

    public C28781Tu(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
    }

    public C28781Tu(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
