package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.05q */
/* loaded from: classes.dex */
public class C011405q extends UserJid {
    public static final C011405q A00;
    public static final Parcelable.Creator CREATOR;

    @Override // com.whatsapp.jid.UserJid, com.whatsapp.jid.Jid
    public String getServer() {
        return "status_me";
    }

    @Override // com.whatsapp.jid.UserJid, com.whatsapp.jid.Jid
    public int getType() {
        return 11;
    }

    static {
        try {
            A00 = new C011405q();
            CREATOR = new Parcelable.Creator() { // from class: X.0Rc
                @Override // android.os.Parcelable.Creator
                public Object createFromParcel(Parcel parcel) {
                    return new C011405q(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public Object[] newArray(int i) {
                    return new C011405q[i];
                }
            };
        } catch (C011305p e) {
            throw new IllegalStateException(e);
        }
    }

    public C011405q() {
        super("");
    }

    public C011405q(Parcel parcel) {
        super(parcel);
    }

    public static boolean A03(Jid jid) {
        return jid == A00;
    }

    @Override // com.whatsapp.jid.UserJid, com.whatsapp.jid.Jid
    public String getObfuscatedString() {
        return getRawString();
    }

    @Override // com.whatsapp.jid.UserJid
    public DeviceJid getPrimaryDevice() {
        throw new UnsupportedOperationException("getPrimaryDevice() must not be called for MeJid");
    }
}
