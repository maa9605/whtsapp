package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Wd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29281Wd implements InterfaceC17920st {
    public float A00;
    public float A01;
    public boolean A05;
    public final /* synthetic */ C18130tE A08;
    public List A04 = new ArrayList();
    public C18100tB A03 = null;
    public boolean A07 = false;
    public boolean A06 = true;
    public int A02 = -1;

    public C29281Wd(C18130tE c18130tE, C29251Wa c29251Wa) {
        this.A08 = c18130tE;
        if (c29251Wa == null) {
            return;
        }
        c29251Wa.A02(this);
        if (this.A05) {
            this.A04.get(-1);
            throw null;
        }
    }

    @Override // X.InterfaceC17920st
    public void A5Y(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.A07 = true;
        this.A06 = false;
        C18100tB c18100tB = this.A03;
        C18130tE.A04(c18100tB.A02, c18100tB.A03, f, f2, f3, z, z2, f4, f5, this);
        this.A06 = true;
        this.A05 = false;
    }

    @Override // X.InterfaceC17920st
    public void A71(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.A06 || this.A07) {
            C18100tB c18100tB = this.A03;
            c18100tB.A00(f, f2);
            this.A04.add(c18100tB);
            this.A07 = false;
        }
        this.A03 = new C18100tB(f5, f6, f5 - f3, f6 - f4);
        this.A05 = false;
    }

    @Override // X.InterfaceC17920st
    public void AG0(float f, float f2) {
        C18100tB c18100tB = this.A03;
        c18100tB.A00(f, f2);
        this.A04.add(c18100tB);
        C18100tB c18100tB2 = this.A03;
        this.A03 = new C18100tB(f, f2, f - c18100tB2.A02, f2 - c18100tB2.A03);
        this.A05 = false;
    }

    @Override // X.InterfaceC17920st
    public void AGY(float f, float f2) {
        if (this.A05) {
            this.A03.A01((C18100tB) this.A04.get(this.A02));
            this.A04.set(this.A02, this.A03);
            this.A05 = false;
        }
        C18100tB c18100tB = this.A03;
        if (c18100tB != null) {
            this.A04.add(c18100tB);
        }
        this.A00 = f;
        this.A01 = f2;
        this.A03 = new C18100tB(f, f2, 0.0f, 0.0f);
        this.A02 = this.A04.size();
    }

    @Override // X.InterfaceC17920st
    public void AQz(float f, float f2, float f3, float f4) {
        C18100tB c18100tB = this.A03;
        c18100tB.A00(f, f2);
        this.A04.add(c18100tB);
        this.A03 = new C18100tB(f3, f4, f3 - f, f4 - f2);
        this.A05 = false;
    }

    @Override // X.InterfaceC17920st
    public void close() {
        this.A04.add(this.A03);
        AG0(this.A00, this.A01);
        this.A05 = true;
    }
}
