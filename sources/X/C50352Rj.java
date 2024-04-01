package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Rj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C50352Rj implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.3TT
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C50352Rj(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C50352Rj[i];
        }
    };
    public final String A00;
    public final List A01;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C50352Rj(Parcel parcel) {
        this.A00 = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        parcel.readList(arrayList, C50342Ri.class.getClassLoader());
    }

    public C50352Rj(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeList(this.A01);
    }
}
