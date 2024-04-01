package X;

import android.os.Message;

/* renamed from: X.275  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass275 implements C0EK {
    public static volatile AnonymousClass275 A04;
    public final AnonymousClass276 A00;
    public final C0EG A01;
    public final C0EJ A02;
    public final InterfaceC002901k A03;

    @Override // X.C0EK
    public int[] AAP() {
        return new int[]{221};
    }

    public AnonymousClass275(InterfaceC002901k interfaceC002901k, C0EG c0eg, C0EJ c0ej, AnonymousClass276 anonymousClass276) {
        this.A03 = interfaceC002901k;
        this.A01 = c0eg;
        this.A02 = c0ej;
        this.A00 = anonymousClass276;
    }

    @Override // X.C0EK
    public boolean AEN(int i, Message message) {
        if (i != 221) {
            return false;
        }
        C04420Kc c04420Kc = (C04420Kc) message.obj;
        if (c04420Kc != null) {
            AbstractC05150Nn A01 = this.A02.A01(1, c04420Kc.A00);
            if (A01 != null) {
                A01.A00(3);
            }
            this.A03.AS1(new RunnableEBaseShape3S0200000_I0_3(this, c04420Kc, 24));
            return true;
        }
        throw null;
    }
}
