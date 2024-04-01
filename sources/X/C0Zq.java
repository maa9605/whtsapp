package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Zq  reason: invalid class name */
/* loaded from: classes.dex */
public class C0Zq extends AbstractC011205o {
    public static final C0Zq A00 = new C0Zq();
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2xV
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C0Zq(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C0Zq[i];
        }
    };

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "broadcast";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 6;
    }

    public C0Zq() {
        super("location");
    }

    public C0Zq(Parcel parcel) {
        super(parcel);
    }
}
