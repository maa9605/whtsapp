package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0Nt */
/* loaded from: classes.dex */
public final class C05210Nt implements Parcelable {
    public C09480eA A00;
    public C09510eD A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public final UserJid A0A;
    public final List A0B;
    public final List A0C;
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2pr
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C05210Nt(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C05210Nt[i];
        }
    };
    public static final String[] A0E = {"time_zone", "hours_note", "day_of_week", "mode", "open_time", "close_time"};
    public static final String[] A0D = {"category_id", "category_name"};

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C05210Nt(Parcel parcel) {
        this.A0B = new ArrayList();
        this.A0C = new ArrayList();
        this.A0A = (UserJid) parcel.readParcelable(UserJid.class.getClassLoader());
        this.A06 = parcel.readString();
        ArrayList createTypedArrayList = parcel.createTypedArrayList(C1NH.CREATOR);
        List list = this.A0B;
        if (list != createTypedArrayList) {
            list.clear();
            if (createTypedArrayList != null) {
                this.A0B.addAll(createTypedArrayList);
            }
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        List list2 = this.A0C;
        if (list2 != createStringArrayList) {
            list2.clear();
            if (createStringArrayList != null) {
                list2.addAll(createStringArrayList);
            }
        }
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        C09510eD c09510eD = (C09510eD) parcel.readParcelable(C09510eD.class.getClassLoader());
        this.A01 = c09510eD == null ? C09510eD.A04 : c09510eD;
        this.A00 = (C09480eA) parcel.readParcelable(C09480eA.class.getClassLoader());
        this.A09 = parcel.readByte() != 0;
        this.A07 = parcel.readString();
        this.A02 = parcel.readString();
        this.A05 = parcel.readString();
        this.A08 = parcel.readByte() != 0;
    }

    public C05210Nt(UserJid userJid) {
        this.A0B = new ArrayList();
        this.A0C = new ArrayList();
        this.A0A = userJid;
        this.A01 = C09510eD.A04;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C05210Nt) {
            C05210Nt c05210Nt = (C05210Nt) obj;
            if (AnonymousClass024.A0l(this.A0A, c05210Nt.A0A) && AnonymousClass024.A0k(this.A06, c05210Nt.A06) && this.A0B.equals(c05210Nt.A0B)) {
                List list = this.A0C;
                List list2 = c05210Nt.A0C;
                ArrayList arrayList = new ArrayList(list);
                ArrayList arrayList2 = new ArrayList(list2);
                arrayList.removeAll(Arrays.asList("", null));
                arrayList2.removeAll(Arrays.asList("", null));
                return arrayList.equals(arrayList2) && AnonymousClass024.A0k(this.A04, c05210Nt.A04) && AnonymousClass024.A0k(this.A03, c05210Nt.A03) && AnonymousClass024.A0l(this.A01, c05210Nt.A01) && AnonymousClass024.A0l(this.A00, c05210Nt.A00) && this.A09 == c05210Nt.A09 && AnonymousClass024.A0k(this.A02, c05210Nt.A02) && AnonymousClass024.A0k(this.A05, c05210Nt.A05) && this.A08 == c05210Nt.A08 && AnonymousClass024.A0k(this.A07, c05210Nt.A07);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        UserJid userJid = this.A0A;
        int hashCode = (userJid != null ? userJid.hashCode() : 0) * 31;
        String str = this.A06;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.A07;
        int hashCode3 = (this.A0C.hashCode() + ((this.A0B.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31;
        String str3 = this.A04;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.A03;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        C09510eD c09510eD = this.A01;
        int hashCode6 = (hashCode5 + (c09510eD != null ? c09510eD.hashCode() : 0)) * 31;
        C09480eA c09480eA = this.A00;
        int hashCode7 = (((hashCode6 + (c09480eA != null ? c09480eA.hashCode() : 0)) * 31) + (this.A09 ? 1 : 0)) * 31;
        String str5 = this.A02;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.A05;
        return ((hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31) + (this.A08 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("BusinessProfile{jid='");
        A0P.append(this.A0A);
        A0P.append('\'');
        A0P.append(", tag='");
        C000200d.A1P(A0P, this.A06, '\'', ", websites=");
        A0P.append(this.A0C);
        A0P.append(", email='");
        C000200d.A1P(A0P, this.A04, '\'', ", description='");
        C000200d.A1P(A0P, this.A03, '\'', ", address='");
        A0P.append(this.A01);
        A0P.append('\'');
        A0P.append(", vertical='");
        C000200d.A1P(A0P, this.A07, '\'', ", categories='");
        A0P.append(this.A0B.size());
        A0P.append('\'');
        A0P.append(", hours='");
        A0P.append(this.A00);
        A0P.append('\'');
        A0P.append(", has_catalog='");
        A0P.append(this.A09);
        A0P.append('\'');
        A0P.append(", commerceExperience='");
        C000200d.A1P(A0P, this.A02, '\'', ", shopUrl='");
        C000200d.A1P(A0P, this.A05, '\'', ", cart_enabled='");
        A0P.append(this.A08);
        A0P.append('\'');
        A0P.append('}');
        return A0P.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A0A, i);
        parcel.writeString(this.A06);
        parcel.writeTypedList(this.A0B);
        parcel.writeStringList(this.A0C);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
    }
}
