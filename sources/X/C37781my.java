package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.1my  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C37781my extends Jid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2xU
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C37781my(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C37781my[i];
        }
    };

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "call";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 10;
    }

    public C37781my(Parcel parcel) {
        super(parcel);
    }

    public C37781my(String str) {
        super(str);
        int i;
        int length = str.length();
        if (length >= 18 && length <= 32) {
            while (i < length) {
                char charAt = str.charAt(i);
                i = ((charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'f') || (charAt >= 'A' && charAt <= 'F')) ? i + 1 : 0;
            }
            return;
        }
        throw new C011305p(str);
    }
}
