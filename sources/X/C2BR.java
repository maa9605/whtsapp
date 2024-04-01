package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.util.Arrays;

/* renamed from: X.2BR */
/* loaded from: classes2.dex */
public class C2BR implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2w4
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C2BR(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C2BR[i];
        }
    };
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public String A04;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C2BR() {
    }

    public C2BR(Parcel parcel) {
        if (parcel != null) {
            this.A04 = parcel.readString();
            this.A03 = parcel.readString();
            this.A01 = parcel.readInt();
            this.A02 = parcel.readInt();
            this.A00 = parcel.readInt();
        }
    }

    public C2BR(String str, String str2, int i, int i2, int i3) {
        this.A04 = str;
        this.A03 = str2;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
    }

    public static C2BR A00(C0LO c0lo) {
        C2BR c2br = new C2BR();
        C09H c09h = ((AnonymousClass097) c0lo).A02;
        if (c09h != null) {
            File file = c09h.A0F;
            if (file != null && file.exists()) {
                c2br.A03 = c09h.A0F.getAbsolutePath();
            } else {
                String str = ((AnonymousClass097) c0lo).A08;
                if (str != null) {
                    c2br.A03 = str;
                }
            }
            c2br.A04 = ((AnonymousClass097) c0lo).A06;
            c2br.A02 = c09h.A08;
            c2br.A01 = c09h.A06;
            c2br.A00 = c09h.A05;
        }
        return c2br;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2BR) {
            C2BR c2br = (C2BR) obj;
            return c2br.A04.equals(this.A04) && c2br.A03.equals(this.A03) && c2br.A01 == this.A01 && c2br.A02 == this.A02 && c2br.A00 == this.A00;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A03, Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A00)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
    }
}
