package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1NH  reason: invalid class name */
/* loaded from: classes.dex */
public class C1NH implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2po
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C1NH(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C1NH[i];
        }
    };
    public final String A00;
    public final String A01;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C1NH(Parcel parcel) {
        String readString = parcel.readString();
        C000700j.A03(readString);
        this.A00 = readString;
        String readString2 = parcel.readString();
        C000700j.A03(readString2);
        this.A01 = readString2;
    }

    public C1NH(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public static String A00(List list, String str) {
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1NH c1nh = (C1NH) it.next();
                if (c1nh != null) {
                    String str2 = c1nh.A01;
                    if (!TextUtils.isEmpty(str2)) {
                        sb.append(str2);
                        sb.append(str);
                    }
                }
                Log.e(new NullPointerException("Category is null"));
            }
            int length = sb.length();
            int length2 = str.length();
            return length > length2 ? sb.substring(0, sb.length() - length2) : "";
        }
        return "";
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1NH) {
            C1NH c1nh = (C1NH) obj;
            return this.A00.equals(c1nh.A00) && this.A01.equals(c1nh.A01);
        }
        return false;
    }

    public int hashCode() {
        return this.A01.hashCode() + (this.A00.hashCode() * 31);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("BizCategory:{'id'='");
        A0P.append(this.A00);
        A0P.append("', 'name'='");
        return C000200d.A0L(A0P, this.A01, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
