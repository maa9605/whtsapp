package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0D7  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0D7 {
    public int A00;
    public int A01;
    public boolean A02;
    public final UserJid A03;
    public final ConcurrentHashMap A04;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0D7(com.whatsapp.jid.UserJid r3, int r4, boolean r5, boolean r6) {
        /*
            r2 = this;
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r3)
            if (r1 == 0) goto L13
            X.0Kd r0 = new X.0Kd
            r0.<init>(r1, r6)
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r2.<init>(r3, r0, r4, r5)
            return
        L13:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D7.<init>(com.whatsapp.jid.UserJid, int, boolean, boolean):void");
    }

    public C0D7(UserJid userJid, Set set, int i, boolean z) {
        this.A04 = new ConcurrentHashMap();
        this.A03 = userJid;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C04430Kd c04430Kd = (C04430Kd) it.next();
            this.A04.put(c04430Kd.A01, c04430Kd);
        }
        this.A01 = i;
        this.A02 = z;
    }

    public C07D A00() {
        return C07D.A01(this.A04.values());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0D7.class != obj.getClass()) {
            return false;
        }
        C0D7 c0d7 = (C0D7) obj;
        if (this.A01 == c0d7.A01 && this.A02 == c0d7.A02 && this.A03.equals(c0d7.A03)) {
            return this.A04.equals(c0d7.A04);
        }
        return false;
    }

    public int hashCode() {
        return ((((this.A04.hashCode() + (this.A03.hashCode() * 31)) * 31) + this.A01) * 31) + (this.A02 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("GroupParticipant{jid='");
        A0P.append(this.A03);
        A0P.append('\'');
        A0P.append(", rank=");
        A0P.append(this.A01);
        A0P.append(", pending=");
        A0P.append(this.A02);
        A0P.append(", participantDevices=");
        StringBuilder sb = new StringBuilder("[");
        for (Object obj : this.A04.values()) {
            sb.append(obj);
            sb.append(", ");
        }
        sb.append("]");
        A0P.append(sb.toString());
        A0P.append('}');
        return A0P.toString();
    }
}
