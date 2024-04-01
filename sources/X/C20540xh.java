package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0xh */
/* loaded from: classes.dex */
public class C20540xh {
    public static final AtomicInteger A0E = new AtomicInteger(0);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C08S A05;
    public C08S A06;
    public C08R A07;
    public InterfaceC20520xf A08;
    public C1YZ A09;
    public final Context A0A;
    public final HandlerC20530xg A0B = new Handler(Looper.getMainLooper()) { // from class: X.0xg
        {
            C20540xh.this = this;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 99) {
                C20540xh.this.A00();
                return;
            }
            StringBuilder A0P = C000200d.A0P("Unknown message: ");
            A0P.append(i);
            throw new RuntimeException(A0P.toString());
        }
    };
    public final C33371fn A0C;
    public final Object A0D;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0xg] */
    public C20540xh(Context context, C33371fn c33371fn, Object obj) {
        A0E.incrementAndGet();
        this.A01 = -1;
        this.A03 = 0;
        this.A00 = -1;
        this.A04 = -1;
        this.A02 = -1;
        this.A0A = context;
        this.A0C = c33371fn;
        this.A0D = obj;
    }

    public final void A00() {
        C08S c08s;
        synchronized (this) {
            C33371fn c33371fn = this.A0C;
            C08T c08t = this.A05.A02;
            C25041Dv c25041Dv = (C25041Dv) this.A05.A04;
            C020209i c020209i = c33371fn.A00;
            Map map = c25041Dv.A01;
            AbstractC016907v abstractC016907v = c25041Dv.A00;
            if (c020209i != null) {
                C0AQ.A01("Committing Variables and Bound tree is only supported from the UI Thread");
                c020209i.A06 = map;
                c020209i.A02 = abstractC016907v;
                c08s = this.A05;
                this.A06 = c08s;
            } else {
                throw null;
            }
        }
        C1YZ c1yz = this.A09;
        if (c1yz != null) {
            c1yz.A00(c08s.A02);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0029, code lost:
        if (X.C07K.A1h(r5.A00, r19, r3.height()) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0073, code lost:
        if (X.C07K.A1h(r5.A00, r19, r3.height()) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(int r18, int r19, int[] r20) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20540xh.A01(int, int, int[]):void");
    }

    public void A02(InterfaceC20520xf interfaceC20520xf) {
        int i;
        boolean z;
        synchronized (this) {
            if (this.A01 <= -1) {
                C08S c08s = this.A05;
                this.A01 = -1;
                this.A08 = interfaceC20520xf;
                int i2 = this.A04;
                if (i2 == -1 || (i = this.A02) == -1) {
                    return;
                }
                int i3 = this.A03;
                this.A03 = i3 + 1;
                C08R c08r = new C08R(this.A0A, interfaceC20520xf, this.A0D, c08s, i3, i2, i);
                this.A07 = c08r;
                C08S A00 = c08r.A00();
                synchronized (this) {
                    if (i3 > this.A00) {
                        this.A00 = i3;
                        this.A05 = A00;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.A07 == c08r) {
                        this.A07 = null;
                    }
                }
                if (z) {
                    if (this.A0C != null) {
                        if (C0AQ.A02()) {
                            A00();
                            return;
                        }
                        HandlerC20530xg handlerC20530xg = this.A0B;
                        if (handlerC20530xg.hasMessages(99)) {
                            return;
                        }
                        handlerC20530xg.sendEmptyMessage(99);
                        return;
                    }
                    throw null;
                }
                return;
            }
            throw new IllegalStateException("Setting an unversioned tree after calling setVersionedTree is not supported. If this RenderState takes its version from a parent tree make sure to always call setVersionedTree");
        }
    }
}
