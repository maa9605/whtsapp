package com.whatsapp.jid;

import X.AnonymousClass024;
import X.C000200d;
import X.C011305p;
import X.C011405q;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;

/* loaded from: classes.dex */
public class DeviceJid extends Jid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2GO
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new DeviceJid(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new DeviceJid[i];
        }
    };
    public final byte agent;
    public final byte device;
    public final UserJid userJid;

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
        return 17;
    }

    public DeviceJid(Parcel parcel) {
        super(parcel);
        UserJid userJid = (UserJid) parcel.readParcelable(UserJid.class.getClassLoader());
        if (userJid != null) {
            this.userJid = userJid;
            this.agent = parcel.readByte();
            this.device = parcel.readByte();
            return;
        }
        throw null;
    }

    public DeviceJid(UserJid userJid, int i, int i2) {
        super(userJid.user);
        if (userJid != C011405q.A00) {
            this.userJid = userJid;
            if (i >= 0 && i <= 99) {
                this.agent = (byte) i;
                if (i2 >= 0 && i2 <= 99) {
                    this.device = (byte) i2;
                    return;
                }
                throw new C011305p(C000200d.A0D("Invalid device: ", i2));
            }
            throw new C011305p(C000200d.A0D("Invalid agent: ", i));
        }
        throw new C011305p(userJid);
    }

    @Override // com.whatsapp.jid.Jid
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DeviceJid.class == obj.getClass() && super.equals(obj)) {
            DeviceJid deviceJid = (DeviceJid) obj;
            if (this.agent == deviceJid.agent && this.device == deviceJid.device) {
                return this.userJid.equals(deviceJid.userJid);
            }
            return false;
        }
        return false;
    }

    public static DeviceJid get(String str) {
        DeviceJid of;
        Jid jid = Jid.get(str);
        if (jid instanceof DeviceJid) {
            return (DeviceJid) jid;
        }
        if (!(jid instanceof UserJid) || (of = of(jid)) == null) {
            throw new C011305p(str);
        }
        return of;
    }

    @Override // com.whatsapp.jid.Jid
    public int getAgent() {
        return this.agent;
    }

    @Override // com.whatsapp.jid.Jid
    public int getDevice() {
        return this.device;
    }

    public static DeviceJid getFromUserJidAndDeviceId(UserJid userJid, int i) {
        String str = userJid.user;
        String server = userJid.getServer();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('.');
        sb.append(0);
        sb.append(':');
        sb.append(i);
        sb.append('@');
        sb.append(server);
        return get(sb.toString());
    }

    public static DeviceJid getNullable(String str) {
        DeviceJid deviceJid = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            deviceJid = get(str);
            return deviceJid;
        } catch (C011305p unused) {
            return deviceJid;
        }
    }

    @Override // com.whatsapp.jid.Jid
    public String getObfuscatedString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass024.A0J(this.user, 4));
        sb.append('.');
        sb.append((int) this.agent);
        sb.append(':');
        sb.append((int) this.device);
        sb.append('@');
        sb.append("s.whatsapp.net");
        return sb.toString();
    }

    @Override // com.whatsapp.jid.Jid
    public String getRawString() {
        String str = this.user;
        byte b = this.agent;
        byte b2 = this.device;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('.');
        sb.append((int) b);
        sb.append(':');
        sb.append((int) b2);
        sb.append('@');
        sb.append("s.whatsapp.net");
        return sb.toString();
    }

    @Override // com.whatsapp.jid.Jid
    public int hashCode() {
        return ((((this.userJid.hashCode() + (super.hashCode() * 31)) * 31) + this.agent) * 31) + this.device;
    }

    public boolean isPrimary() {
        return this.device == 0;
    }

    public static DeviceJid of(Jid jid) {
        if (jid instanceof DeviceJid) {
            return (DeviceJid) jid;
        }
        if (jid instanceof UserJid) {
            return ((UserJid) jid).getPrimaryDevice();
        }
        return null;
    }

    @Override // com.whatsapp.jid.Jid, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.user);
        parcel.writeParcelable(this.userJid, i);
        parcel.writeByte(this.agent);
        parcel.writeByte(this.device);
    }
}
