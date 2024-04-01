package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.2wp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C61852wp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2wo
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C61852wp(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C61852wp[i];
        }
    };
    public final ArrayList A00;
    public final boolean A01;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C61852wp(Parcel parcel) {
        this.A01 = parcel.readByte() != 0;
        this.A00 = parcel.createStringArrayList();
    }

    public C61852wp(boolean z, ArrayList arrayList) {
        this.A01 = z;
        this.A00 = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A01 ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.A00);
    }
}
