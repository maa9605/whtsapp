package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

/* renamed from: X.0L1  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0L1 implements Runnable, InterfaceC04060Ig, C0L2 {
    public InterfaceC63142zC A00;
    public boolean A01;
    public final C3G9 A02;

    public abstract C43211x2 A00(C04020Ic c04020Ic);

    public abstract InterfaceC63142zC A02(Object obj, C0L2 c0l2);

    public abstract Object A03();

    public C0L1(Executor executor) {
        this.A02 = new C3G9(executor);
    }

    public C24V A01() {
        C24V c24v;
        try {
            InterfaceC63142zC A02 = A02(A03(), this);
            synchronized (this) {
                if (this.A01) {
                    c24v = new C24V(new C04020Ic(13));
                } else if (this.A00 != null) {
                    Log.e("Attempt to run same download multiple times");
                    c24v = new C24V(new C04020Ic(13));
                } else {
                    this.A00 = A02;
                    c24v = A02.A7S();
                }
            }
        } catch (C63122zA e) {
            c24v = new C24V(new C04020Ic(e.downloadStatus));
        }
        C04020Ic c04020Ic = c24v.A00;
        if (c04020Ic.A01 == 13) {
            this.A02.AJX(c04020Ic.A04);
            return c24v;
        }
        this.A02.AJY(c04020Ic, A00(c04020Ic));
        return c24v;
    }

    public void A04() {
        InterfaceC63142zC interfaceC63142zC;
        synchronized (this) {
            this.A01 = true;
            interfaceC63142zC = this.A00;
        }
        if (interfaceC63142zC != null) {
            interfaceC63142zC.cancel();
        }
    }

    @Override // X.InterfaceC04060Ig
    public void A59(final InterfaceC04070Ih interfaceC04070Ih) {
        C3G9 c3g9 = this.A02;
        C0CK c0ck = c3g9.A00;
        C0CG c0cg = new C0CG() { // from class: X.3G7
            @Override // X.C0CG
            public final void A54(Object obj) {
                InterfaceC04070Ih.this.AJX(((Boolean) obj).booleanValue());
            }
        };
        Executor executor = c3g9.A02;
        c0ck.A03(c0cg, executor);
        c3g9.A01.A03(new C0CG() { // from class: X.3G6
            @Override // X.C0CG
            public final void A54(Object obj) {
                Pair pair = (Pair) obj;
                InterfaceC04070Ih.this.AJY((C04020Ic) pair.first, (C43211x2) pair.second);
            }
        }, executor);
    }

    @Override // X.InterfaceC04060Ig
    public void A61(boolean z) {
        A04();
    }

    @Override // java.lang.Runnable
    public void run() {
        A01();
    }
}
