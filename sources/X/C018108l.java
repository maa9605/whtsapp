package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.08l  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C018108l {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final UserJid A06;
    public final String A07;
    public final String A08;
    public final byte[] A09;

    public C018108l(UserJid userJid, long j, String str, String str2, int i, byte[] bArr, int i2, C05200Ns c05200Ns) {
        this.A06 = userJid;
        this.A05 = j;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = i;
        this.A09 = bArr;
        this.A02 = i2;
        this.A01 = c05200Ns.hostStorage;
        this.A00 = c05200Ns.actualActors;
        this.A04 = c05200Ns.privacyModeTs;
    }

    public C05200Ns A00() {
        return new C05200Ns(this.A01, this.A00, this.A04);
    }

    public boolean A01() {
        String str = this.A07;
        return str != null && str.startsWith("ent:");
    }

    public boolean A02() {
        String str = this.A07;
        return str != null && str.startsWith("smb:");
    }
}
