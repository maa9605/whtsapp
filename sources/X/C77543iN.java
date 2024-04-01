package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3iN  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C77543iN implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.3O4
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            if (readString != null) {
                return new C77543iN(readString, parcel.readByte() == 1);
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C77543iN[i];
        }
    };
    public String A00 = "WEBVIEW";
    public final String A01;
    public final boolean A02;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C77543iN(String str, boolean z) {
        this.A01 = str;
        this.A02 = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
    }
}
