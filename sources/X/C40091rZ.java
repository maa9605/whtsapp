package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.Date;

/* renamed from: X.1rZ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40091rZ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2tt
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C40091rZ(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C40091rZ[i];
        }
    };
    public final BigDecimal A00;
    public final Date A01;
    public final Date A02;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C40091rZ(Parcel parcel) {
        this.A00 = (BigDecimal) parcel.readSerializable();
        this.A02 = (Date) parcel.readSerializable();
        this.A01 = (Date) parcel.readSerializable();
    }

    public C40091rZ(BigDecimal bigDecimal, Date date, Date date2) {
        this.A00 = bigDecimal;
        this.A02 = date;
        this.A01 = date2;
    }

    public boolean A00(Date date) {
        Date date2;
        Date date3 = this.A02;
        return date3 == null || (date2 = this.A01) == null || (date.after(date3) && date.before(date2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C40091rZ.class != obj.getClass()) {
            return false;
        }
        C40091rZ c40091rZ = (C40091rZ) obj;
        return AnonymousClass024.A0l(this.A00, c40091rZ.A00) && AnonymousClass024.A0l(this.A02, c40091rZ.A02) && AnonymousClass024.A0l(this.A01, c40091rZ.A01);
    }

    public int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        Date date = this.A02;
        int hashCode2 = (hashCode + (date != null ? date.hashCode() : 0)) * 31;
        Date date2 = this.A01;
        return hashCode2 + (date2 != null ? date2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A00);
        parcel.writeSerializable(this.A02);
        parcel.writeSerializable(this.A01);
    }
}
