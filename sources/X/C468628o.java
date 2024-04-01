package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.28o */
/* loaded from: classes2.dex */
public final class C468628o implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2tn
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C468628o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C468628o[i];
        }
    };
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final C09R A03;
    public final C468728p A04;
    public final C40091rZ A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final BigDecimal A0C;
    public final List A0D;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C468628o(Parcel parcel) {
        this.A09 = parcel.readString();
        this.A0B = parcel.readString();
        this.A06 = parcel.readString();
        String readString = parcel.readString();
        this.A0C = TextUtils.isEmpty(readString) ? null : new BigDecimal(readString);
        String readString2 = parcel.readString();
        this.A03 = TextUtils.isEmpty(readString2) ? null : new C09R(readString2);
        this.A08 = parcel.readString();
        this.A0A = parcel.readString();
        this.A0D = parcel.createTypedArrayList(C2A2.CREATOR);
        this.A04 = (C468728p) parcel.readParcelable(C468728p.class.getClassLoader());
        this.A05 = (C40091rZ) parcel.readParcelable(C40091rZ.class.getClassLoader());
        this.A07 = parcel.readString();
        this.A00 = parcel.readByte() != 0;
        this.A01 = parcel.readByte() != 0;
        this.A02 = parcel.readInt();
    }

    public C468628o(String str, String str2, String str3, BigDecimal bigDecimal, C09R c09r, String str4, String str5, List list, C468728p c468728p, C40091rZ c40091rZ, String str6, int i, boolean z, boolean z2) {
        this.A09 = str;
        this.A0B = str2;
        if (bigDecimal != null && c09r != null) {
            this.A0C = bigDecimal;
            this.A03 = c09r;
        } else {
            this.A0C = null;
            this.A03 = null;
        }
        this.A08 = str4;
        this.A0A = str5;
        this.A06 = str3;
        this.A07 = str6;
        this.A0D = A01() ? new ArrayList() : list;
        this.A04 = c468728p;
        this.A05 = c40091rZ;
        this.A00 = z;
        this.A01 = z2;
        this.A02 = i;
    }

    public boolean A00() {
        C468728p c468728p = this.A04;
        return ((c468728p != null && c468728p.A00 != 0) || A01() || this.A01) ? false : true;
    }

    public boolean A01() {
        String str = this.A07;
        return "FETCH_FAILED".equals(str) || "PARTIAL_FETCH".equals(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C468628o) {
            C468628o c468628o = (C468628o) obj;
            if (AnonymousClass024.A0k(this.A09, c468628o.A09) && AnonymousClass024.A0k(this.A0B, c468628o.A0B) && AnonymousClass024.A0k(this.A06, c468628o.A06)) {
                C09R c09r = this.A03;
                if ((c09r == null || c09r.equals(c468628o.A03)) && (c09r != null || c468628o.A03 == null)) {
                    BigDecimal bigDecimal = this.A0C;
                    if ((bigDecimal == null || bigDecimal.equals(c468628o.A0C)) && ((bigDecimal != null || c468628o.A0C == null) && AnonymousClass024.A0k(this.A08, c468628o.A08) && AnonymousClass024.A0k(this.A0A, c468628o.A0A))) {
                        C468728p c468728p = this.A04;
                        if ((c468728p == null || c468728p.equals(c468628o.A04)) && (c468728p != null || c468628o.A04 == null)) {
                            C40091rZ c40091rZ = this.A05;
                            if ((c40091rZ == null || c40091rZ.equals(c468628o.A05)) && (c40091rZ != null || c468628o.A05 == null)) {
                                List list = this.A0D;
                                int size = list.size();
                                List list2 = c468628o.A0D;
                                if (size != list2.size()) {
                                    return false;
                                }
                                if (list != list2) {
                                    for (int i = 0; i < list.size(); i++) {
                                        if (!list.get(i).equals(list2.get(i))) {
                                            return false;
                                        }
                                    }
                                }
                                return this.A00 == c468628o.A00 && this.A01 == c468628o.A01 && this.A02 == c468628o.A02;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        C09R c09r;
        int hashCode = this.A0B.hashCode() + ((this.A09.hashCode() + 217) * 31);
        String str = this.A06;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        BigDecimal bigDecimal = this.A0C;
        if (bigDecimal != null && (c09r = this.A03) != null) {
            hashCode = c09r.hashCode() + bigDecimal.hashCode() + (hashCode * 31);
        }
        String str2 = this.A08;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.A0A;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        C468728p c468728p = this.A04;
        if (c468728p != null) {
            hashCode = (hashCode * 31) + c468728p.hashCode();
        }
        C40091rZ c40091rZ = this.A05;
        if (c40091rZ != null) {
            hashCode = (hashCode * 31) + c40091rZ.hashCode();
        }
        for (C2A2 c2a2 : this.A0D) {
            hashCode = (hashCode * 31) + c2a2.A02.hashCode();
        }
        return (((hashCode * 31) + (this.A01 ? 1 : 0)) * 31) + this.A02;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A09);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A06);
        BigDecimal bigDecimal = this.A0C;
        parcel.writeString(bigDecimal == null ? null : bigDecimal.toString());
        C09R c09r = this.A03;
        parcel.writeString(c09r != null ? c09r.A00 : null);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0A);
        parcel.writeTypedList(this.A0D);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeString(this.A07);
        parcel.writeByte(this.A00 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A01 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A02);
    }
}
