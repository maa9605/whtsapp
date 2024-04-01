package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Kz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04580Kz extends AbstractC011205o {
    public static final C04580Kz A00 = new C04580Kz();
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2ju
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C04580Kz(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C04580Kz[i];
        }
    };

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "broadcast";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 5;
    }

    public C04580Kz() {
        super("status");
    }

    public C04580Kz(Parcel parcel) {
        super(parcel);
    }
}
