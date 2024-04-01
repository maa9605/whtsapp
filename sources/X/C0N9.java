package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.0N9  reason: invalid class name */
/* loaded from: classes.dex */
public class C0N9 extends Jid implements Parcelable {
    public static final C0N9 A00 = new C0N9();
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2xY
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C0N9(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C0N9[i];
        }
    };

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "g.us";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 16;
    }

    public C0N9() {
        super("");
    }

    public C0N9(Parcel parcel) {
        super(parcel);
    }
}
