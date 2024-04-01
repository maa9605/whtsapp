package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.0aX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C08060aX extends UserJid implements Parcelable {
    public static final C08060aX A00;
    public static final Parcelable.Creator CREATOR;

    @Override // com.whatsapp.jid.UserJid, com.whatsapp.jid.Jid
    public int getType() {
        return 8;
    }

    static {
        try {
            A00 = new C08060aX();
            CREATOR = new Parcelable.Creator() { // from class: X.1PU
                @Override // android.os.Parcelable.Creator
                public Object createFromParcel(Parcel parcel) {
                    return new C08060aX(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public Object[] newArray(int i) {
                    return new C08060aX[i];
                }
            };
        } catch (C011305p e) {
            throw new IllegalStateException(e);
        }
    }

    public C08060aX() {
        super("Server");
    }

    public C08060aX(Parcel parcel) {
        super(parcel);
    }

    @Override // com.whatsapp.jid.UserJid, com.whatsapp.jid.Jid
    public String getObfuscatedString() {
        return getRawString();
    }
}
