package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.0Jm  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04260Jm extends Jid implements Parcelable {
    public static final C04260Jm A00 = new C04260Jm();
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2xZ
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C04260Jm(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C04260Jm[i];
        }
    };

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "s.whatsapp.net";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 13;
    }

    public C04260Jm() {
        super("");
    }

    public C04260Jm(Parcel parcel) {
        super(parcel);
    }
}
