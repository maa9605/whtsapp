package X;

import android.os.SystemClock;

/* renamed from: X.2F8  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2F8 {
    public static volatile C2F8 A06;
    public long A02;
    public final AnonymousClass011 A03;
    public final AnonymousClass057 A04;
    public final InterfaceC002901k A05;
    public int A01 = -1;
    public int A00 = 1;

    public C2F8(InterfaceC002901k interfaceC002901k, AnonymousClass011 anonymousClass011, AnonymousClass057 anonymousClass057) {
        this.A05 = interfaceC002901k;
        this.A03 = anonymousClass011;
        this.A04 = anonymousClass057;
    }

    public static C2F8 A00() {
        if (A06 == null) {
            synchronized (C2F8.class) {
                if (A06 == null) {
                    A06 = new C2F8(C002801j.A00(), AnonymousClass011.A00(), AnonymousClass057.A00);
                }
            }
        }
        return A06;
    }

    public void A01() {
        if (this.A01 != 1) {
            return;
        }
        this.A01 = 0;
        this.A00 = 1;
    }

    public void A02(String str) {
        if (this.A01 != 1) {
            this.A01 = -1;
            return;
        }
        C0RG c0rg = new C0RG();
        c0rg.A01 = Long.valueOf(SystemClock.elapsedRealtime() - this.A02);
        c0rg.A02 = str;
        c0rg.A00 = Integer.valueOf(this.A00);
        this.A03.A08(c0rg, 650);
        this.A01 = -1;
        this.A00 = 1;
    }
}
