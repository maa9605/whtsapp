package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.0JM */
/* loaded from: classes.dex */
public class C0JM implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.3Y1
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C0JM(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C0JM[i];
        }
    };
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C04050If A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C0JM() {
    }

    public C0JM(Parcel parcel) {
        if (parcel != null) {
            this.A0B = parcel.readString();
            this.A07 = parcel.readString();
            this.A09 = parcel.readString();
            this.A0A = parcel.readString();
            this.A02 = parcel.readInt();
            this.A03 = parcel.readInt();
            this.A0D = parcel.readString();
            this.A08 = parcel.readString();
            this.A00 = parcel.readInt();
            this.A0E = parcel.readString();
            this.A05 = parcel.readString();
            this.A06 = parcel.readString();
            this.A0F = parcel.readInt() == 1;
        }
    }

    public static String A00(C2CI[] c2ciArr) {
        ArrayList arrayList = new ArrayList(c2ciArr.length);
        for (C2CI c2ci : c2ciArr) {
            arrayList.add(c2ci.toString());
        }
        return TextUtils.join(" ", arrayList);
    }

    /* renamed from: A01 */
    public C0JM clone() {
        C0JM c0jm = new C0JM();
        c0jm.A0B = this.A0B;
        String str = this.A08;
        if (str != null) {
            int i = this.A01;
            c0jm.A08 = str;
            c0jm.A01 = i;
        }
        c0jm.A0E = this.A0E;
        c0jm.A07 = this.A07;
        c0jm.A05 = this.A05;
        c0jm.A0A = this.A0A;
        c0jm.A09 = this.A09;
        c0jm.A00 = this.A00;
        c0jm.A03 = this.A03;
        c0jm.A02 = this.A02;
        c0jm.A04 = this.A04;
        c0jm.A06 = this.A06;
        c0jm.A0F = this.A0F;
        return c0jm;
    }

    public boolean A02() {
        return (this.A08 == null || this.A01 == 1) ? false : true;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Sticker{");
        stringBuffer.append(", mimeType='");
        C000200d.A1E(stringBuffer, this.A0A, ", height=");
        stringBuffer.append(this.A02);
        stringBuffer.append(", width=");
        stringBuffer.append(this.A03);
        stringBuffer.append(", metadata=");
        stringBuffer.append(this.A04);
        stringBuffer.append(", saltedFileHash='");
        C000200d.A1E(stringBuffer, this.A0C, ", fileSize=");
        stringBuffer.append(this.A00);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0B);
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A0F ? 1 : 0);
    }
}
