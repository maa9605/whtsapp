package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.29M  reason: invalid class name */
/* loaded from: classes2.dex */
public class C29M {
    public long A00;
    public long A01;
    public C27801Ov A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final C06C A0F;
    public final UserJid A0G;
    public final String A0H;

    public C29M(C06C c06c) {
        this.A0F = c06c;
        this.A0G = (UserJid) c06c.A03(UserJid.class);
        C04460Kg c04460Kg = c06c.A08;
        if (c04460Kg != null) {
            this.A0H = c04460Kg.A01;
        } else {
            this.A0H = null;
        }
        if (c06c.A0X) {
            this.A01 = c06c.A07;
        } else {
            this.A01 = -1L;
        }
    }

    public C29M(UserJid userJid, String str) {
        this.A0F = null;
        this.A0G = userJid;
        this.A0H = str;
        this.A01 = 0L;
        this.A0A = false;
    }
}
