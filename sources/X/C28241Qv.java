package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1Qv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28241Qv {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final UserJid A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    public C28241Qv(UserJid userJid, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i2, int i3, int i4, int i5, boolean z10, boolean z11, int i6, boolean z12, boolean z13) {
        this.A06 = userJid;
        this.A01 = i;
        this.A0E = z;
        this.A0B = z2;
        this.A09 = z3;
        this.A0C = z4;
        this.A0A = z5;
        this.A0J = z6;
        this.A0I = z7;
        this.A0H = z8;
        this.A0G = z9;
        this.A04 = i2;
        this.A05 = i3;
        this.A02 = i4;
        this.A03 = i5;
        this.A07 = z10;
        this.A08 = z11;
        this.A00 = i6;
        this.A0F = z12;
        this.A0D = z13;
    }

    public boolean A00() {
        int i = this.A01;
        return i == 2 || i == 3;
    }

    public boolean A01() {
        return this.A04 == 3;
    }

    public boolean A02() {
        return this.A04 == 6;
    }
}
