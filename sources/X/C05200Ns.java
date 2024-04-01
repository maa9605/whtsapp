package X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.0Ns */
/* loaded from: classes.dex */
public class C05200Ns implements Serializable {
    public static final long serialVersionUID = 1;
    public final int actualActors;
    public final int hostStorage;
    public final long privacyModeTs;

    public C05200Ns() {
        this.hostStorage = 0;
        this.actualActors = 0;
        this.privacyModeTs = 0L;
    }

    public C05200Ns(int i, int i2, long j) {
        this.hostStorage = i;
        this.actualActors = i2;
        this.privacyModeTs = j;
    }

    public C05200Ns(C05200Ns c05200Ns) {
        if (c05200Ns == null) {
            this.hostStorage = 0;
            this.actualActors = 0;
            this.privacyModeTs = 0L;
            return;
        }
        this.hostStorage = c05200Ns.hostStorage;
        this.actualActors = c05200Ns.actualActors;
        this.privacyModeTs = c05200Ns.privacyModeTs;
    }

    public C05200Ns(String str, String str2, String str3) {
        this.hostStorage = C40731sm.A03(str);
        this.actualActors = C40731sm.A02(str2);
        this.privacyModeTs = AnonymousClass024.A03(str3, 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C05200Ns.class != obj.getClass()) {
            return false;
        }
        C05200Ns c05200Ns = (C05200Ns) obj;
        return this.hostStorage == c05200Ns.hostStorage && this.actualActors == c05200Ns.actualActors && this.privacyModeTs == c05200Ns.privacyModeTs;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.hostStorage), Integer.valueOf(this.actualActors), Long.valueOf(this.privacyModeTs)});
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("PrivacyMode{hostStorage=");
        A0P.append(this.hostStorage);
        A0P.append(", actualActors=");
        A0P.append(this.actualActors);
        A0P.append(", privacyModeTs=");
        A0P.append(this.privacyModeTs);
        A0P.append('}');
        return A0P.toString();
    }
}
