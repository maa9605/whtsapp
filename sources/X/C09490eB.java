package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0eB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09490eB implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2pq
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C09490eB(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C09490eB[i];
        }
    };
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final Integer A03;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C09490eB(int i, int i2, Integer num, Integer num2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = num;
        this.A02 = num2;
    }

    public C09490eB(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        if (parcel.readByte() == 0) {
            this.A03 = null;
        } else {
            this.A03 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readByte() == 0) {
            this.A02 = null;
        } else {
            this.A02 = Integer.valueOf(parcel.readInt());
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C09490eB) {
            C09490eB c09490eB = (C09490eB) obj;
            if (this.A00 == c09490eB.A00 && this.A01 == c09490eB.A01) {
                Integer num = this.A03;
                if (num == null) {
                    if (c09490eB.A03 != null) {
                        return false;
                    }
                } else if (!num.equals(c09490eB.A03)) {
                    return false;
                }
                Integer num2 = this.A02;
                Integer num3 = c09490eB.A02;
                if (num2 == null) {
                    if (num3 != null) {
                        return false;
                    }
                } else if (!num2.equals(num3)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = ((this.A00 * 31) + this.A01) * 31;
        Integer num = this.A03;
        int hashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.A02;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("dayOfWeek: ");
        A0P.append(this.A00);
        A0P.append(", mode: ");
        A0P.append(this.A01);
        A0P.append(", openTime: ");
        A0P.append(this.A03);
        A0P.append(", closeTime: ");
        A0P.append(this.A02);
        return A0P.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        Integer num = this.A03;
        if (num == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.A02;
        if (num2 == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeInt(num2.intValue());
    }
}
