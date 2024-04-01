package X;

import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1az  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30681az implements InterfaceC227813z, AnonymousClass140 {
    public final /* synthetic */ C30611as A00;

    @Override // X.InterfaceC227813z
    public final void AIw(int i) {
    }

    public C30681az(C30611as c30611as) {
        this.A00 = c30611as;
    }

    @Override // X.InterfaceC227813z
    public final void AIu(Bundle bundle) {
        final C30611as c30611as = this.A00;
        c30611as.A05.AWQ(new BinderC35171ii(c30611as) { // from class: X.19w
            public final WeakReference A00;

            {
                this.A00 = new WeakReference(c30611as);
            }

            @Override // X.InterfaceC239218u
            public final void AWU(final C32021dK c32021dK) {
                final C30611as c30611as2 = (C30611as) this.A00.get();
                if (c30611as2 == null) {
                    return;
                }
                C39591qN c39591qN = c30611as2.A0G;
                C14L c14l = new C14L(c30611as2) { // from class: X.1ay
                    @Override // X.C14L
                    public final void A00() {
                        C30611as c30611as3 = c30611as2;
                        C32021dK c32021dK2 = c32021dK;
                        if (c30611as3.A07(0)) {
                            C30451ab c30451ab = c32021dK2.A01;
                            if (c30451ab.A02()) {
                                C31041bc c31041bc = c32021dK2.A02;
                                C30451ab c30451ab2 = c31041bc.A01;
                                if (!c30451ab2.A02()) {
                                    String valueOf = String.valueOf(c30451ab2);
                                    StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                                    sb.append("Sign-in succeeded with resolve account failure: ");
                                    sb.append(valueOf);
                                    Log.wtf("GoogleApiClientConnecting", sb.toString(), new Exception());
                                    c30611as3.A03(c30451ab2);
                                    return;
                                }
                                c30611as3.A09 = true;
                                c30611as3.A04 = c31041bc.A00();
                                c30611as3.A0A = c31041bc.A02;
                                c30611as3.A0B = c31041bc.A03;
                                c30611as3.A00();
                            } else if (c30611as3.A07 && !c30451ab.A01()) {
                                c30611as3.A02();
                                c30611as3.A00();
                            } else {
                                c30611as3.A03(c30451ab);
                            }
                        }
                    }
                };
                HandlerC30761b8 handlerC30761b8 = c39591qN.A06;
                handlerC30761b8.sendMessage(handlerC30761b8.obtainMessage(1, c14l));
            }
        });
    }

    @Override // X.AnonymousClass140
    public final void AIv(C30451ab c30451ab) {
        C30611as c30611as = this.A00;
        Lock lock = c30611as.A0K;
        lock.lock();
        try {
            if (c30611as.A07 && !c30451ab.A01()) {
                c30611as.A02();
                c30611as.A00();
            } else {
                c30611as.A03(c30451ab);
            }
        } finally {
            lock.unlock();
        }
    }
}
