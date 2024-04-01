package X;

import android.os.Message;

/* renamed from: X.278  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass278 implements C0EK {
    public static volatile AnonymousClass278 A02;
    public final AnonymousClass035 A00;
    public final InterfaceC002901k A01;

    @Override // X.C0EK
    public int[] AAP() {
        return new int[]{101};
    }

    public AnonymousClass278(InterfaceC002901k interfaceC002901k, AnonymousClass035 anonymousClass035) {
        this.A01 = interfaceC002901k;
        this.A00 = anonymousClass035;
    }

    @Override // X.C0EK
    public boolean AEN(int i, Message message) {
        if (i != 101) {
            return false;
        }
        this.A01.AS1(new RunnableEBaseShape0S1100000_I0(this, (String) message.obj, 15));
        return true;
    }
}
