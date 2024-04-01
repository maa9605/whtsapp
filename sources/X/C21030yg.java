package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0yg */
/* loaded from: classes.dex */
public final class C21030yg implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0yf
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C21030yg(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C21030yg[i];
        }
    };
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final long A0G;
    public final C21690zk A0H;
    public final C10L A0I;
    public final C225512w A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final List A0Q;
    public final byte[] A0R;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C21030yg(Parcel parcel) {
        byte[] bArr;
        this.A0M = parcel.readString();
        this.A0N = parcel.readString();
        this.A0L = parcel.readString();
        this.A0P = parcel.readString();
        this.A0K = parcel.readString();
        this.A04 = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A0F = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A01 = parcel.readFloat();
        this.A0B = parcel.readInt();
        this.A02 = parcel.readFloat();
        if (parcel.readInt() != 0) {
            bArr = parcel.createByteArray();
        } else {
            bArr = null;
        }
        this.A0R = bArr;
        this.A0E = parcel.readInt();
        this.A0J = (C225512w) parcel.readParcelable(C225512w.class.getClassLoader());
        this.A05 = parcel.readInt();
        this.A0C = parcel.readInt();
        this.A0A = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A0D = parcel.readInt();
        this.A0O = parcel.readString();
        this.A03 = parcel.readInt();
        this.A0G = parcel.readLong();
        int readInt = parcel.readInt();
        this.A0Q = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.A0Q.add(parcel.createByteArray());
        }
        this.A0H = (C21690zk) parcel.readParcelable(C21690zk.class.getClassLoader());
        this.A0I = (C10L) parcel.readParcelable(C10L.class.getClassLoader());
    }

    public C21030yg(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, C225512w c225512w, int i7, int i8, int i9, int i10, int i11, int i12, String str6, int i13, long j, List list, C21690zk c21690zk, C10L c10l) {
        int i14 = i5;
        float f3 = f2;
        int i15 = i11;
        int i16 = i10;
        List list2 = list;
        this.A0M = str;
        this.A0N = str2;
        this.A0L = str3;
        this.A0P = str4;
        this.A0K = str5;
        this.A04 = i;
        this.A09 = i2;
        this.A0F = i3;
        this.A08 = i4;
        this.A01 = f;
        this.A0B = i14 == -1 ? 0 : i14;
        this.A02 = f2 == -1.0f ? 1.0f : f3;
        this.A0R = bArr;
        this.A0E = i6;
        this.A0J = c225512w;
        this.A05 = i7;
        this.A0C = i8;
        this.A0A = i9;
        this.A06 = i16 == -1 ? 0 : i16;
        this.A07 = i15 == -1 ? 0 : i15;
        this.A0D = i12;
        this.A0O = str6;
        this.A03 = i13;
        this.A0G = j;
        this.A0Q = list == null ? Collections.emptyList() : list2;
        this.A0H = c21690zk;
        this.A0I = c10l;
    }

    public static C21030yg A00(String str, String str2, int i, int i2, int i3, List list, String str3) {
        return new C21030yg(str, null, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i, i2, i3, -1, -1, 0, str3, -1, Long.MAX_VALUE, list, null, null);
    }

    public C21030yg A01(int i, int i2) {
        return new C21030yg(this.A0M, this.A0N, this.A0L, this.A0P, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0R, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, i, i2, this.A0D, this.A0O, this.A03, this.A0G, this.A0Q, this.A0H, this.A0I);
    }

    public C21030yg A02(C10L c10l) {
        return new C21030yg(this.A0M, this.A0N, this.A0L, this.A0P, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0R, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0O, this.A03, this.A0G, this.A0Q, this.A0H, c10l);
    }

    public boolean A03(C21030yg c21030yg) {
        List list = this.A0Q;
        int size = list.size();
        List list2 = c21030yg.A0Q;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || C21030yg.class != obj.getClass()) {
            return false;
        }
        C21030yg c21030yg = (C21030yg) obj;
        int i2 = this.A00;
        return (i2 == 0 || (i = c21030yg.A00) == 0 || i2 == i) && this.A04 == c21030yg.A04 && this.A09 == c21030yg.A09 && this.A0F == c21030yg.A0F && this.A08 == c21030yg.A08 && Float.compare(this.A01, c21030yg.A01) == 0 && this.A0B == c21030yg.A0B && Float.compare(this.A02, c21030yg.A02) == 0 && this.A0E == c21030yg.A0E && this.A05 == c21030yg.A05 && this.A0C == c21030yg.A0C && this.A0A == c21030yg.A0A && this.A06 == c21030yg.A06 && this.A07 == c21030yg.A07 && this.A0G == c21030yg.A0G && this.A0D == c21030yg.A0D && C08M.A08(this.A0M, c21030yg.A0M) && C08M.A08(this.A0N, c21030yg.A0N) && C08M.A08(this.A0O, c21030yg.A0O) && this.A03 == c21030yg.A03 && C08M.A08(this.A0L, c21030yg.A0L) && C08M.A08(this.A0P, c21030yg.A0P) && C08M.A08(this.A0K, c21030yg.A0K) && C08M.A08(this.A0H, c21030yg.A0H) && C08M.A08(this.A0I, c21030yg.A0I) && C08M.A08(this.A0J, c21030yg.A0J) && Arrays.equals(this.A0R, c21030yg.A0R) && A03(c21030yg);
    }

    public int hashCode() {
        int i = this.A00;
        if (i == 0) {
            String str = this.A0M;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.A0L;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.A0P;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.A0K;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.A04) * 31) + this.A0F) * 31) + this.A08) * 31) + this.A05) * 31) + this.A0C) * 31;
            String str5 = this.A0O;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.A03) * 31;
            C21690zk c21690zk = this.A0H;
            int hashCode6 = (hashCode5 + (c21690zk == null ? 0 : c21690zk.hashCode())) * 31;
            C10L c10l = this.A0I;
            int hashCode7 = (hashCode6 + (c10l == null ? 0 : c10l.hashCode())) * 31;
            String str6 = this.A0N;
            int floatToIntBits = ((((((((((((Float.floatToIntBits(this.A02) + ((Float.floatToIntBits(this.A01) + ((((((hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.A09) * 31) + ((int) this.A0G)) * 31)) * 31)) * 31) + this.A0B) * 31) + this.A0E) * 31) + this.A0A) * 31) + this.A06) * 31) + this.A07) * 31) + this.A0D;
            this.A00 = floatToIntBits;
            return floatToIntBits;
        }
        return i;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("Format(");
        A0P.append(this.A0M);
        A0P.append(", ");
        A0P.append(this.A0N);
        A0P.append(", ");
        A0P.append(this.A0L);
        A0P.append(", ");
        A0P.append(this.A0P);
        A0P.append(", ");
        A0P.append(this.A0K);
        A0P.append(", ");
        A0P.append(this.A04);
        A0P.append(", ");
        A0P.append(this.A0O);
        A0P.append(", [");
        A0P.append(this.A0F);
        A0P.append(", ");
        A0P.append(this.A08);
        A0P.append(", ");
        A0P.append(this.A01);
        A0P.append("], [");
        A0P.append(this.A05);
        A0P.append(", ");
        return C000200d.A0K(A0P, this.A0C, "])");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0K);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A0F);
        parcel.writeInt(this.A08);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A0B);
        parcel.writeFloat(this.A02);
        byte[] bArr = this.A0R;
        parcel.writeInt(bArr != null ? 1 : 0);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.A0E);
        parcel.writeParcelable(this.A0J, i);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A0D);
        parcel.writeString(this.A0O);
        parcel.writeInt(this.A03);
        parcel.writeLong(this.A0G);
        List list = this.A0Q;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) list.get(i2));
        }
        parcel.writeParcelable(this.A0H, 0);
        parcel.writeParcelable(this.A0I, 0);
    }
}
