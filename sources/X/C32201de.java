package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1de */
/* loaded from: classes.dex */
public final class C32201de extends C08G implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.19X
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            String str2 = null;
            String str3 = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i = 65535 & readInt;
                if (i == 2) {
                    str = C07K.A0u(parcel, readInt);
                } else if (i == 3) {
                    str2 = C07K.A0u(parcel, readInt);
                } else if (i != 4) {
                    C07K.A1H(parcel, readInt);
                } else {
                    str3 = C07K.A0u(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C32201de(str, str2, str3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C32201de[i];
        }
    };
    public final String A00;
    public final String A01;
    public final String A02;

    public C32201de(String str, String str2, String str3) {
        C07K.A1P(str);
        this.A00 = str;
        C07K.A1P(str2);
        this.A02 = str2;
        C07K.A1P(str3);
        this.A01 = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C32201de) {
            C32201de c32201de = (C32201de) obj;
            return this.A00.equals(c32201de.A00) && C07K.A1k(c32201de.A02, this.A02) && C07K.A1k(c32201de.A01, this.A01);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        String str = this.A00;
        int i = 0;
        for (char c : str.toCharArray()) {
            i += c;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            String substring = trim.substring(0, 10);
            String substring2 = trim.substring(length - 10, length);
            StringBuilder sb = new StringBuilder(C000200d.A00(substring2, C000200d.A00(substring, 16)));
            sb.append(substring);
            sb.append("...");
            sb.append(substring2);
            sb.append("::");
            sb.append(i);
            trim = sb.toString();
        }
        String str2 = this.A02;
        String str3 = this.A01;
        StringBuilder sb2 = new StringBuilder(C000200d.A00(str3, C000200d.A00(str2, C000200d.A00(trim, 31))));
        sb2.append("Channel{token=");
        sb2.append(trim);
        sb2.append(", nodeId=");
        sb2.append(str2);
        return C000200d.A0M(sb2, ", path=", str3, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1M(parcel, 2, this.A00, false);
        AnonymousClass088.A1M(parcel, 3, this.A02, false);
        AnonymousClass088.A1M(parcel, 4, this.A01, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
