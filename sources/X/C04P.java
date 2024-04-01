package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.04P */
/* loaded from: classes.dex */
public final class C04P implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.3TM
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C04P(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C04P[i];
        }
    };
    public final byte A00;
    public final Jid A01;
    public final String A02;
    public final String A03;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C04P(Parcel parcel) {
        String readString;
        Jid jid;
        this.A02 = parcel.readString();
        byte readByte = parcel.readByte();
        this.A00 = readByte;
        if (readByte == 1) {
            jid = (Jid) parcel.readParcelable(Jid.class.getClassLoader());
            readString = jid.getRawString();
        } else {
            readString = parcel.readString();
            jid = null;
        }
        this.A03 = readString;
        this.A01 = jid;
    }

    public C04P(String str, int i) {
        this(str, String.valueOf(i), null, (byte) 0);
    }

    public C04P(String str, long j) {
        this(str, String.valueOf(j), null, (byte) 0);
    }

    public C04P(String str, Jid jid) {
        this(str, jid.getRawString(), jid, (byte) 1);
    }

    public C04P(String str, String str2) {
        this(str, str2, null, (byte) 0);
    }

    public C04P(String str, String str2, Jid jid, byte b) {
        if (jid != null) {
            boolean z = false;
            z = (C003101m.A0W(jid) || jid.getType() == 8) ? true : true;
            StringBuilder A0P = C000200d.A0P("Jid: ");
            A0P.append(C003101m.A07(jid));
            A0P.append(" is not protocol compliant");
            C000700j.A09(z, A0P.toString());
        }
        if (str != null) {
            this.A02 = str;
            if (str2 != null) {
                this.A03 = str2;
                this.A01 = jid;
                this.A00 = b;
                return;
            }
            throw null;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C04P.class == obj.getClass()) {
            C04P c04p = (C04P) obj;
            return this.A02.equals(c04p.A02) && this.A03.equals(c04p.A03);
        }
        return false;
    }

    public int hashCode() {
        return this.A03.hashCode() + ((this.A02.hashCode() + 31) * 31);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("KeyValue{key='");
        C000200d.A1P(A0P, this.A02, '\'', ", value='");
        C000200d.A1P(A0P, this.A03, '\'', ", type='");
        A0P.append((int) this.A00);
        A0P.append('\'');
        A0P.append('}');
        return A0P.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        byte b = this.A00;
        parcel.writeByte(b);
        if (b == 1) {
            parcel.writeParcelable(this.A01, i);
        } else {
            parcel.writeString(this.A03);
        }
    }
}
