package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.0aM  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07950aM implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2jX
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C07950aM(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C07950aM[i];
        }
    };
    public final int A00;
    public final UserJid A01;
    public final String A02;
    public final boolean A03;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C07950aM(Parcel parcel) {
        this.A01 = (UserJid) parcel.readParcelable(UserJid.class.getClassLoader());
        this.A03 = parcel.readInt() > 0;
        String readString = parcel.readString();
        if (readString != null) {
            this.A02 = readString;
            this.A00 = parcel.readInt();
            return;
        }
        throw null;
    }

    public C07950aM(UserJid userJid, boolean z, String str, int i) {
        this.A01 = userJid;
        this.A03 = z;
        this.A02 = str;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C07950aM.class == obj.getClass()) {
            C07950aM c07950aM = (C07950aM) obj;
            return this.A01.equals(c07950aM.A01) && this.A03 == c07950aM.A03 && TextUtils.equals(this.A02, c07950aM.A02) && this.A00 == c07950aM.A00;
        }
        return false;
    }

    public int hashCode() {
        return ((this.A02.hashCode() + ((((this.A01.hashCode() + 31) * 31) + (this.A03 ? 1231 : 1237)) * 31)) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("CallLog.Key[jid=");
        A0P.append(this.A01);
        A0P.append("; fromMe=");
        A0P.append(this.A03);
        A0P.append("; callId=");
        A0P.append(this.A02);
        A0P.append("; transactionId=");
        return C000200d.A0K(A0P, this.A00, "]");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
    }
}
