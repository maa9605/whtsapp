package com.whatsapp.jid;

import X.AbstractC005302j;
import X.AnonymousClass024;
import X.C000200d;
import X.C011305p;
import X.C06E;
import X.C06F;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* loaded from: classes.dex */
public class UserJid extends AbstractC005302j implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final C06E JID_FACTORY = C06E.A00();
    public static final UserJid WHATSAPP_SURVEY;

    @Override // com.whatsapp.jid.Jid, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "s.whatsapp.net";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 0;
    }

    static {
        try {
            WHATSAPP_SURVEY = getFromIdentifier("16505361212");
            CREATOR = new Parcelable.Creator() { // from class: X.06G
                @Override // android.os.Parcelable.Creator
                public Object createFromParcel(Parcel parcel) {
                    return new UserJid(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public Object[] newArray(int i) {
                    return new UserJid[i];
                }
            };
        } catch (C011305p e) {
            throw new IllegalStateException(e);
        }
    }

    public UserJid(Parcel parcel) {
        super(parcel);
    }

    public UserJid(String str) {
        super(str);
        int type;
        if (!isValidRegularUser(str) && (type = getType()) != 11 && type != 7 && type != 8) {
            throw new C011305p(C000200d.A0H("Invalid user: ", str));
        }
    }

    public static UserJid get(String str) {
        Jid jid = Jid.get(str);
        if (jid instanceof UserJid) {
            return (UserJid) jid;
        }
        throw new C011305p(str);
    }

    public static UserJid getFromIdentifier(String str) {
        C06E c06e = JID_FACTORY;
        String buildRawString = Jid.buildRawString(str, "s.whatsapp.net");
        C06F c06f = c06e.A00;
        Jid jid = (Jid) c06f.A04(buildRawString);
        if (jid instanceof UserJid) {
            return (UserJid) jid;
        }
        UserJid A01 = C06E.A01(str, "s.whatsapp.net");
        c06f.A08(buildRawString, A01);
        return A01;
    }

    public static UserJid getNullable(String str) {
        UserJid userJid = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            userJid = get(str);
            return userJid;
        } catch (C011305p unused) {
            return userJid;
        }
    }

    @Override // com.whatsapp.jid.Jid
    public String getObfuscatedString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass024.A0J(this.user, 4));
        sb.append('@');
        sb.append(getServer());
        return sb.toString();
    }

    public DeviceJid getPrimaryDevice() {
        try {
            return DeviceJid.getFromUserJidAndDeviceId(this, 0);
        } catch (C011305p e) {
            throw new IllegalStateException(e);
        }
    }

    public static boolean isValidRegularUser(String str) {
        char charAt;
        int length = str.length();
        if (length < 5 || length > 20 || str.startsWith("10") || (charAt = str.charAt(0)) < '1' || charAt > '9') {
            return false;
        }
        for (int i = 1; i < length; i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 < '0' || charAt2 > '9') {
                return false;
            }
        }
        return true;
    }

    public static UserJid of(Jid jid) {
        if (jid instanceof UserJid) {
            return (UserJid) jid;
        }
        return null;
    }

    @Override // com.whatsapp.jid.Jid, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.user);
    }
}
