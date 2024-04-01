package com.whatsapp.jid;

import X.AnonymousClass024;
import X.C011305p;
import X.C06E;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class Jid implements Parcelable, Comparable {
    public static final C06E JID_FACTORY = C06E.A00();
    public final String user;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAgent() {
        return 0;
    }

    public int getDevice() {
        return 0;
    }

    public abstract String getServer();

    public abstract int getType();

    public Jid(Parcel parcel) {
        this.user = parcel.readString();
    }

    public Jid(String str) {
        this.user = str;
    }

    public static String buildRawString(String str, String str2) {
        if (str.isEmpty()) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        sb.append(str2);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return getRawString().compareTo(((Jid) obj).getRawString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Jid) {
            Jid jid = (Jid) obj;
            return AnonymousClass024.A0l(this.user, jid.user) && getServer().equals(jid.getServer()) && getType() == jid.getType();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x0111, code lost:
        if (r3 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.whatsapp.jid.Jid get(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jid.Jid.get(java.lang.String):com.whatsapp.jid.Jid");
    }

    public static Jid getNullable(String str) {
        Jid jid = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            jid = get(str);
            return jid;
        } catch (C011305p unused) {
            return jid;
        }
    }

    public String getObfuscatedString() {
        return getRawString();
    }

    public String getRawString() {
        return buildRawString(this.user, getServer());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.user, getServer(), Integer.valueOf(getType())});
    }

    public boolean isProtocolCompliant() {
        int type = getType();
        return (type == 2 || type == 9 || type == 11 || type == 8) ? false : true;
    }

    public final String toString() {
        return getObfuscatedString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.user);
    }
}
