package com.whatsapp.dns;

import java.io.Serializable;
import java.net.InetAddress;
import java.util.Locale;

/* loaded from: classes.dex */
public final class DnsCacheEntrySerializable implements Serializable {
    public static final long serialVersionUID = 1;
    public final Long expirationTime;
    public final boolean forceOverride;
    public final InetAddress inetAddress;
    public final Short portNumber;
    public final int resolverType;
    public final boolean secureSocket;

    public DnsCacheEntrySerializable(Long l, InetAddress inetAddress, Short sh, boolean z, boolean z2, int i) {
        this.expirationTime = l;
        this.inetAddress = inetAddress;
        this.portNumber = sh;
        this.secureSocket = z;
        this.forceOverride = z2;
        this.resolverType = i;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof DnsCacheEntrySerializable)) {
            return false;
        }
        DnsCacheEntrySerializable dnsCacheEntrySerializable = (DnsCacheEntrySerializable) obj;
        Long l = this.expirationTime;
        Long l2 = dnsCacheEntrySerializable.expirationTime;
        if (l == l2 || (l != null && l.equals(l2))) {
            InetAddress inetAddress = this.inetAddress;
            InetAddress inetAddress2 = dnsCacheEntrySerializable.inetAddress;
            if (inetAddress == inetAddress2 || (inetAddress != null && inetAddress.equals(inetAddress2))) {
                Short sh = this.portNumber;
                Short sh2 = dnsCacheEntrySerializable.portNumber;
                return sh == sh2 || (sh != null && sh.equals(sh2));
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Long l = this.expirationTime;
        int hashCode = ((l != null ? l.hashCode() : 0) + 41) * 41;
        InetAddress inetAddress = this.inetAddress;
        int hashCode2 = (hashCode + (inetAddress != null ? inetAddress.hashCode() : 0)) * 41;
        Short sh = this.portNumber;
        return hashCode2 + (sh != null ? sh.hashCode() : 0);
    }

    public String toString() {
        return String.format(Locale.US, "%s:%d EXPIRE: %tc", this.inetAddress, this.portNumber, this.expirationTime);
    }
}
