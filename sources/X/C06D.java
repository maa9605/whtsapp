package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.06D  reason: invalid class name */
/* loaded from: classes.dex */
public class C06D extends UserJid implements Parcelable {
    public static final C06D A00;
    public static final Parcelable.Creator CREATOR;

    @Override // com.whatsapp.jid.UserJid, com.whatsapp.jid.Jid
    public int getType() {
        return 7;
    }

    static {
        try {
            A00 = new C06D();
            CREATOR = new Parcelable.Creator() { // from class: X.06H
                @Override // android.os.Parcelable.Creator
                public Object createFromParcel(Parcel parcel) {
                    return new C06D(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public Object[] newArray(int i) {
                    return new C06D[i];
                }
            };
        } catch (C011305p e) {
            throw new IllegalStateException(e);
        }
    }

    public C06D() {
        super("0");
    }

    public C06D(Parcel parcel) {
        super(parcel);
    }

    @Override // com.whatsapp.jid.UserJid, com.whatsapp.jid.Jid
    public String getObfuscatedString() {
        return getRawString();
    }
}
