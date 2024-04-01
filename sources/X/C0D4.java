package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.0D4  reason: invalid class name */
/* loaded from: classes.dex */
public class C0D4 {
    public int A00;
    public long A01;
    public final UserJid A02;
    public transient boolean A03;

    public C0D4(long j, UserJid userJid, int i) {
        this.A01 = j;
        this.A02 = userJid;
        this.A00 = i;
    }

    public synchronized long A00() {
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r6.A01 == (-1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean A01() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.A03     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto Le
            long r4 = r6.A01     // Catch: java.lang.Throwable -> L11
            r2 = -1
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto Lf
        Le:
            r0 = 1
        Lf:
            monitor-exit(r6)
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D4.A01():boolean");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0D4.class == obj.getClass()) {
            C0D4 c0d4 = (C0D4) obj;
            return this.A02.equals(c0d4.A02) && this.A01 == c0d4.A01 && this.A00 == c0d4.A00;
        }
        return false;
    }

    public int hashCode() {
        return ((this.A02.hashCode() + ((((int) this.A01) + 31) * 31)) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("CallLogParticipant[rowId=");
        A0P.append(this.A01);
        A0P.append(", jid=");
        A0P.append(this.A02);
        A0P.append(", callResult=");
        return C000200d.A0K(A0P, this.A00, "]");
    }
}
