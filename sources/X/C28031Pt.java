package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Pt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28031Pt implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.3O1
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C28031Pt(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C28031Pt[i];
        }
    };
    public final String A00;
    public final String[] A01;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C28031Pt(Parcel parcel) {
        String readString = parcel.readString();
        if (readString != null) {
            this.A00 = readString;
            String[] createStringArray = parcel.createStringArray();
            if (createStringArray == null) {
                throw null;
            }
            this.A01 = createStringArray;
            return;
        }
        throw null;
    }

    public C28031Pt(String str, String[] strArr) {
        this.A00 = str;
        this.A01 = strArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeStringArray(this.A01);
    }
}
