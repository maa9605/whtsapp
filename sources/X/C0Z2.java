package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Z2  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Z2 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.3MD
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C0Z2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C0Z2[i];
        }
    };
    public final C05020My A00;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C0Z2(C05020My c05020My) {
        this.A00 = c05020My;
    }

    public C0Z2(Parcel parcel) {
        this.A00 = new C05020My(parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C05020My c05020My = this.A00;
        parcel.writeByteArray(c05020My.A01);
        parcel.writeByteArray(c05020My.A00);
        parcel.writeByteArray(c05020My.A02);
    }
}
