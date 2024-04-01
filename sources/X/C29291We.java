package X;

import android.graphics.Path;

/* renamed from: X.1We  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29291We implements InterfaceC17920st {
    public float A00;
    public float A01;
    public Path A02 = new Path();

    public C29291We(C29251Wa c29251Wa) {
        if (c29251Wa == null) {
            return;
        }
        c29251Wa.A02(this);
    }

    @Override // X.InterfaceC17920st
    public void A5Y(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        C18130tE.A04(this.A00, this.A01, f, f2, f3, z, z2, f4, f5, this);
        this.A00 = f4;
        this.A01 = f5;
    }

    @Override // X.InterfaceC17920st
    public void A71(float f, float f2, float f3, float f4, float f5, float f6) {
        this.A02.cubicTo(f, f2, f3, f4, f5, f6);
        this.A00 = f5;
        this.A01 = f6;
    }

    @Override // X.InterfaceC17920st
    public void AG0(float f, float f2) {
        this.A02.lineTo(f, f2);
        this.A00 = f;
        this.A01 = f2;
    }

    @Override // X.InterfaceC17920st
    public void AGY(float f, float f2) {
        this.A02.moveTo(f, f2);
        this.A00 = f;
        this.A01 = f2;
    }

    @Override // X.InterfaceC17920st
    public void AQz(float f, float f2, float f3, float f4) {
        this.A02.quadTo(f, f2, f3, f4);
        this.A00 = f3;
        this.A01 = f4;
    }

    @Override // X.InterfaceC17920st
    public void close() {
        this.A02.close();
    }
}
