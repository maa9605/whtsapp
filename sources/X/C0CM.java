package X;

import java.io.Serializable;

/* renamed from: X.0CM  reason: invalid class name */
/* loaded from: classes.dex */
public class C0CM implements Serializable {
    public static final long serialVersionUID = 1;
    public final long ephemeralSettingTimestamp;
    public final int expiration;

    public C0CM(int i, long j) {
        this.expiration = i;
        this.ephemeralSettingTimestamp = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0CM.class != obj.getClass()) {
            return false;
        }
        C0CM c0cm = (C0CM) obj;
        return this.expiration == c0cm.expiration && this.ephemeralSettingTimestamp == c0cm.ephemeralSettingTimestamp;
    }

    public int hashCode() {
        long j = this.ephemeralSettingTimestamp;
        return (this.expiration * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("EphemeralInfo{expiration=");
        A0P.append(this.expiration);
        A0P.append(", ephemeralSettingTimestamp=");
        A0P.append(this.ephemeralSettingTimestamp);
        A0P.append('}');
        return A0P.toString();
    }
}
