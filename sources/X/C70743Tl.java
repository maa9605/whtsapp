package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Tl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C70743Tl {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final AbstractC005302j A06;
    public final UserJid A07;
    public final UserJid A08;
    public final AnonymousClass094 A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C70743Tl(AnonymousClass094 anonymousClass094, AbstractC005302j abstractC005302j, UserJid userJid, UserJid userJid2, boolean z, boolean z2, long j, boolean z3, int i, int i2, boolean z4, long j2, int i3, long j3) {
        this.A09 = anonymousClass094;
        if (anonymousClass094 != null) {
            AbstractC005302j abstractC005302j2 = anonymousClass094.A00;
            if (abstractC005302j2 != null) {
                boolean equals = abstractC005302j.equals(abstractC005302j2);
                StringBuilder sb = new StringBuilder("key=");
                sb.append(anonymousClass094);
                sb.append("; jid=");
                sb.append(abstractC005302j);
                C000700j.A0A(equals, sb.toString());
            } else {
                throw null;
            }
        }
        this.A06 = abstractC005302j;
        this.A08 = userJid;
        this.A07 = userJid2;
        this.A0B = z;
        this.A04 = j;
        this.A0A = z2;
        this.A0D = z3;
        this.A02 = i;
        this.A00 = i2;
        this.A0C = z4;
        this.A05 = j2;
        this.A01 = i3;
        this.A03 = j3;
    }
}
