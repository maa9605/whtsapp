package X;

import java.io.File;

/* renamed from: X.1x2  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43211x2 {
    public int A00;
    public int A01;
    public C04020Ic A02;
    public File A03;
    public Boolean A04;
    public Boolean A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Long A0D;
    public Long A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public byte[] A0J;
    public byte[] A0K;
    public boolean A0I = false;
    public Boolean A05 = Boolean.FALSE;

    public C43211x2() {
        Boolean bool = Boolean.TRUE;
        this.A06 = bool;
        this.A04 = bool;
        this.A01 = 0;
    }

    public synchronized int A00() {
        return this.A01;
    }

    public synchronized C04020Ic A01() {
        return this.A02;
    }

    public synchronized C43211x2 A02() {
        C43211x2 c43211x2;
        c43211x2 = new C43211x2();
        c43211x2.A05 = this.A05;
        c43211x2.A06 = this.A06;
        c43211x2.A04 = this.A04;
        c43211x2.A0I = this.A0I;
        c43211x2.A02 = this.A02;
        c43211x2.A01 = this.A01;
        c43211x2.A03 = this.A03;
        c43211x2.A0E = this.A0E;
        c43211x2.A0F = this.A0F;
        c43211x2.A0K = this.A0K;
        c43211x2.A0J = this.A0J;
        c43211x2.A0C = this.A0C;
        c43211x2.A0B = this.A0B;
        c43211x2.A09 = this.A09;
        c43211x2.A0A = this.A0A;
        c43211x2.A0D = this.A0D;
        c43211x2.A00 = this.A00;
        c43211x2.A0H = this.A0H;
        c43211x2.A0G = this.A0G;
        c43211x2.A07 = this.A07;
        return c43211x2;
    }

    public synchronized File A03() {
        return this.A03;
    }

    public synchronized Boolean A04() {
        return this.A05;
    }

    public synchronized void A05() {
        this.A04 = false;
    }

    public synchronized void A06() {
        this.A0I = true;
    }

    public synchronized void A07(int i) {
        this.A01 = i;
    }

    public synchronized void A08(long j) {
        this.A0D = Long.valueOf(j);
    }

    public synchronized void A09(File file) {
        this.A03 = file;
    }

    public synchronized void A0A(boolean z, C04020Ic c04020Ic, int i) {
        this.A05 = Boolean.valueOf(z);
        this.A06 = Boolean.FALSE;
        this.A02 = c04020Ic;
        this.A00 = i;
    }

    public synchronized byte[] A0B() {
        return this.A0J;
    }
}
