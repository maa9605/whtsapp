package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0XT  reason: invalid class name */
/* loaded from: classes.dex */
public class C0XT implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.3TP
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C0XT(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C0XT[i];
        }
    };
    public int A00;
    public C50332Rh A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public List A06;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C0XT(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A02 = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.A06 = arrayList;
        parcel.readList(arrayList, C50382Rm.class.getClassLoader());
        this.A00 = parcel.readInt();
    }

    public C0XT(String str, String str2, String str3, String str4, List list, C50332Rh c50332Rh, int i) {
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A02 = str4;
        this.A06 = list;
        this.A01 = c50332Rh;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeList(this.A06);
        parcel.writeInt(this.A00);
    }
}
