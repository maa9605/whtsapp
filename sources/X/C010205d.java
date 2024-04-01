package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.05d */
/* loaded from: classes.dex */
public class C010205d {
    public static volatile C010205d A0C;
    public final AbstractC000600i A02;
    public final C009905a A03;
    public final C010105c A04;
    public final C05Z A05;
    public final HandlerC010505g A06;
    public final Object A08 = new Object();
    public final Map A0B = new HashMap();
    public final Map A0A = new HashMap();
    public int A00 = 0;
    public final SparseIntArray A01 = new SparseIntArray();
    public final List A09 = new ArrayList();
    public final InterfaceC010405f A07 = new InterfaceC010405f() { // from class: X.05e
        @Override // X.InterfaceC010405f
        public void AJI(String str) {
        }

        @Override // X.InterfaceC010405f
        public void AJx(String str, C02590Ca c02590Ca) {
        }

        @Override // X.InterfaceC010405f
        public void APJ(String str, C02590Ca c02590Ca) {
        }
    };

    /* JADX WARN: Type inference failed for: r0v8, types: [X.05g] */
    public C010205d(AbstractC000600i abstractC000600i, C05Z c05z, C009905a c009905a, C010105c c010105c) {
        this.A02 = abstractC000600i;
        this.A05 = c05z;
        this.A03 = c009905a;
        this.A04 = c010105c;
        HandlerThread handlerThread = new HandlerThread("XmppMessageRouter", 1);
        handlerThread.start();
        this.A06 = new Handler(handlerThread.getLooper()) { // from class: X.05g
            {
                C010205d.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:137:0x001b, code lost:
                if (r5 >= r2.A09.size()) goto L20;
             */
            @Override // android.os.Handler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void handleMessage(android.os.Message r11) {
                /*
                    Method dump skipped, instructions count: 514
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.HandlerC010505g.handleMessage(android.os.Message):void");
            }
        };
    }

    public static C010205d A00() {
        if (A0C == null) {
            synchronized (C010205d.class) {
                if (A0C == null) {
                    A0C = new C010205d(AbstractC000600i.A00(), C05Z.A01, C009905a.A02, C010105c.A00());
                }
            }
        }
        return A0C;
    }

    public static void A01(C010205d c010205d, String str, boolean z) {
        InterfaceC010405f interfaceC010405f;
        if (z) {
            C009905a c009905a = c010205d.A03;
            C000700j.A04(str, "Can't remove message with null id");
            List list = c009905a.A00;
            synchronized (list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (str.equals(((C0QW) it.next()).A01)) {
                        it.remove();
                    }
                }
            }
        }
        synchronized (c010205d.A08) {
            interfaceC010405f = (InterfaceC010405f) c010205d.A0B.remove(str);
            if (interfaceC010405f == null) {
                interfaceC010405f = (InterfaceC010405f) c010205d.A0A.remove(str);
            }
        }
        if (interfaceC010405f != null) {
            interfaceC010405f.AJI(str);
        } else {
            C000200d.A14("xmppIncomingMessageRouter/ignoring failure due to missing callback for iqId:", str);
        }
    }

    public void A02(C0EK c0ek) {
        int[] AAP = c0ek.AAP();
        List list = this.A09;
        int size = list.size();
        list.add(c0ek);
        for (int i : AAP) {
            SparseIntArray sparseIntArray = this.A01;
            if (sparseIntArray.get(i, -1) == -1) {
                sparseIntArray.put(i, size);
            } else {
                throw new IllegalArgumentException(C000200d.A0D("Already have registered handler for recv message type:", i));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0010, code lost:
        if (r2 == r4.A07) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A08
            monitor-enter(r3)
            java.util.Map r0 = r4.A0B     // Catch: java.lang.Throwable -> L18
            java.lang.Object r2 = r0.remove(r5)     // Catch: java.lang.Throwable -> L18
            X.05f r2 = (X.InterfaceC010405f) r2     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L12
            X.05f r1 = r4.A07     // Catch: java.lang.Throwable -> L18
            r0 = 0
            if (r2 != r1) goto L13
        L12:
            r0 = 1
        L13:
            X.C000700j.A07(r0)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C010205d.A03(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0030, code lost:
        if (r1 == r6.A07) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(java.lang.String r7, X.InterfaceC010405f r8, long r9, boolean r11) {
        /*
            r6 = this;
            java.lang.Object r3 = r6.A08
            monitor-enter(r3)
            java.util.Map r0 = r6.A0A     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r0.containsKey(r7)     // Catch: java.lang.Throwable -> L5c
            r5 = 1
            r4 = 0
            r2 = 0
            if (r0 != 0) goto Lf
            r2 = 1
        Lf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r1.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = "Pending iq-callback for id:"
            r1.append(r0)     // Catch: java.lang.Throwable -> L5c
            r1.append(r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L5c
            X.C000700j.A0A(r2, r0)     // Catch: java.lang.Throwable -> L5c
            java.util.Map r0 = r6.A0B     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r1 = r0.put(r7, r8)     // Catch: java.lang.Throwable -> L5c
            X.05f r1 = (X.InterfaceC010405f) r1     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L32
            X.05f r0 = r6.A07     // Catch: java.lang.Throwable -> L5c
            r2 = 0
            if (r1 != r0) goto L33
        L32:
            r2 = 1
        L33:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r1.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = "Pending request for id:"
            r1.append(r0)     // Catch: java.lang.Throwable -> L5c
            r1.append(r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L5c
            X.C000700j.A0A(r2, r0)     // Catch: java.lang.Throwable -> L5c
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5a
            X.05g r1 = r6.A06     // Catch: java.lang.Throwable -> L5c
            r0 = 4
            if (r11 != 0) goto L53
            r5 = 0
        L53:
            android.os.Message r0 = r1.obtainMessage(r0, r5, r4, r7)     // Catch: java.lang.Throwable -> L5c
            r1.sendMessageDelayed(r0, r9)     // Catch: java.lang.Throwable -> L5c
        L5a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5c
            return
        L5c:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C010205d.A04(java.lang.String, X.05f, long, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0013, code lost:
        if (r4.A0A.isEmpty() == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(boolean r5) {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A08
            monitor-enter(r3)
            java.util.Map r0 = r4.A0B     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2e
            r2 = 0
            if (r0 == 0) goto L15
            java.util.Map r0 = r4.A0A     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2e
            r0 = 0
            if (r1 != 0) goto L16
        L15:
            r0 = 1
        L16:
            if (r5 != 0) goto L22
            if (r0 != 0) goto L22
            r4.A00 = r2     // Catch: java.lang.Throwable -> L30
            X.05g r1 = r4.A06     // Catch: java.lang.Throwable -> L30
            r0 = 4
            r1.removeMessages(r0)     // Catch: java.lang.Throwable -> L30
        L22:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L30
            X.05g r1 = r4.A06
            r0 = 3
            android.os.Message r0 = r1.obtainMessage(r0)
            r0.sendToTarget()
            return
        L2e:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L30
        L30:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L30
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C010205d.A05(boolean):void");
    }
}
