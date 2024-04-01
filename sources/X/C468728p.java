package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.28p  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C468728p implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2tr
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C468728p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C468728p[i];
        }
    };
    public int A00;
    public String A01;
    public String A02;
    public final List A03;
    public final boolean A04;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C468728p(int i) {
        this.A00 = i;
        this.A04 = false;
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
    }

    public C468728p(int i, boolean z, List list, String str, String str2) {
        this.A00 = i;
        this.A04 = z;
        this.A03 = list;
        this.A02 = str;
        this.A01 = str2;
    }

    public C468728p(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A04 = parcel.readByte() != 0;
        this.A03 = parcel.createStringArrayList();
    }

    public static int A00(String str) {
        if (AnonymousClass024.A0j(str) || "approved".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("rejected".equalsIgnoreCase(str)) {
            return 2;
        }
        return "deleted".equalsIgnoreCase(str) ? 3 : 1;
    }

    public boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C468728p)) {
            return false;
        }
        C468728p c468728p = (C468728p) obj;
        if (this.A00 == c468728p.A00 && this.A04 == c468728p.A04 && this.A02 == c468728p.A02 && AnonymousClass024.A0l(this.A01, c468728p.A01)) {
            List list2 = this.A03;
            if (list2 == null || (list = c468728p.A03) == null || list2.size() != list.size()) {
                return list2 == c468728p.A03;
            }
            for (int i = 0; i < list2.size(); i++) {
                if (!((String) list2.get(i)).equals(list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeByte(this.A04 ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.A03);
    }
}
