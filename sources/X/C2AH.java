package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2AH  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2AH {
    public final long A00;
    public final C07E A01;
    public final C07E A02;
    public final UserJid A03;
    public final C04420Kc A04;
    public final String A05;
    public final String A06;
    public final byte[] A07;

    public C2AH(UserJid userJid, String str, C04420Kc c04420Kc, C07E c07e, C07E c07e2, byte[] bArr, long j) {
        this.A03 = userJid;
        this.A05 = str;
        this.A06 = null;
        this.A04 = c04420Kc;
        this.A01 = c07e;
        this.A02 = c07e2;
        this.A07 = bArr;
        this.A00 = j;
    }

    public C2AH(String str, C04420Kc c04420Kc) {
        this.A03 = null;
        this.A05 = null;
        this.A06 = str;
        C07E c07e = C07E.A01;
        this.A01 = c07e;
        this.A02 = c07e;
        this.A04 = c04420Kc;
        this.A07 = null;
        this.A00 = 0L;
    }
}
