package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.0Hr */
/* loaded from: classes.dex */
public class C0Hr {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public AnonymousClass092 A08;
    public final AnonymousClass012 A09;
    public final UserJid A0A;

    public C0Hr(AnonymousClass012 anonymousClass012, C0Hr c0Hr) {
        this(anonymousClass012, c0Hr.A0A, c0Hr.A06, c0Hr.A04, c0Hr.A05, c0Hr.A03, c0Hr.A02, c0Hr.A07, c0Hr.A01, c0Hr.A00);
        this.A08 = c0Hr.A08;
    }

    public C0Hr(AnonymousClass012 anonymousClass012, UserJid userJid, long j, long j2, long j3, long j4, long j5, long j6, int i, int i2) {
        this.A06 = 1L;
        this.A09 = anonymousClass012;
        this.A0A = userJid;
        this.A06 = j;
        this.A04 = j2;
        this.A05 = j3;
        this.A03 = j4;
        this.A02 = Math.max(j5, j4);
        this.A07 = j6;
        this.A01 = i;
        this.A00 = i2;
    }

    public static void A00(AnonymousClass092 anonymousClass092) {
        StringBuilder A0P = C000200d.A0P("[id=");
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        A0P.append(anonymousClass094.A01);
        A0P.append(", from_me=");
        A0P.append(anonymousClass094.A02);
        A0P.append(", remote_resource=");
        A0P.append(anonymousClass092.A0A());
        A0P.append("]");
        A0P.toString();
    }

    public synchronized C0Hr A01() {
        return new C0Hr(this.A09, this);
    }

    public synchronized C0Hr A02(AnonymousClass092 anonymousClass092) {
        int i;
        if (this.A00 <= 1) {
            A00(anonymousClass092);
            return null;
        }
        if (C011405q.A03(this.A0A)) {
            if (anonymousClass092.A0p == this.A06) {
                this.A06 = -1L;
                A00(anonymousClass092);
                return this;
            }
        } else if (anonymousClass092.A0p == this.A04 || ((anonymousClass092.A0p >= this.A03 && anonymousClass092.A0p <= this.A02) || anonymousClass092.A0p == this.A05 || anonymousClass092.A0p == this.A06)) {
            this.A06 = -1L;
            A00(anonymousClass092);
            return this;
        }
        this.A00--;
        if (anonymousClass092.A0p > this.A04 && (i = this.A01) > 0) {
            this.A01 = i - 1;
        }
        A00(anonymousClass092);
        return A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0018, code lost:
        if ((r6.A09.A05() - r6.A07) <= 86400000) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean A03() {
        /*
            r6 = this;
            monitor-enter(r6)
            com.whatsapp.jid.UserJid r0 = r6.A0A     // Catch: java.lang.Throwable -> L1d
            boolean r0 = X.C003101m.A0Y(r0)     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L1a
            X.012 r0 = r6.A09     // Catch: java.lang.Throwable -> L1d
            long r4 = r0.A05()     // Catch: java.lang.Throwable -> L1d
            long r0 = r6.A07     // Catch: java.lang.Throwable -> L1d
            long r4 = r4 - r0
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L1b
        L1a:
            r0 = 0
        L1b:
            monitor-exit(r6)
            return r0
        L1d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Hr.A03():boolean");
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("StatusInfo[jid=");
        sb.append(this.A0A);
        sb.append(", msgId=");
        sb.append(this.A06);
        sb.append(", lastRead=");
        sb.append(this.A04);
        sb.append(", lastSent=");
        sb.append(this.A05);
        sb.append(", firstUnread=");
        sb.append(this.A03);
        sb.append(", autoDownloadLimit=");
        sb.append(this.A02);
        sb.append(", ts=");
        sb.append(this.A07);
        sb.append(", unreadCount=");
        sb.append(this.A01);
        sb.append(", total=");
        sb.append(this.A00);
        sb.append(" ]");
        return sb.toString();
    }
}
