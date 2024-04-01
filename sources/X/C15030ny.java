package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0ny  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15030ny implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0nx
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C15030ny(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C15030ny[i];
        }
    };
    public int A00;
    public int A01;
    public boolean A02;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C15030ny() {
    }

    public C15030ny(C15030ny c15030ny) {
        this.A01 = c15030ny.A01;
        this.A00 = c15030ny.A00;
        this.A02 = c15030ny.A02;
    }

    public C15030ny(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
