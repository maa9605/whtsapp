package X;

import android.graphics.Bitmap;
import android.os.Process;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.2mT */
/* loaded from: classes2.dex */
public abstract class AbstractC55962mT {
    public boolean A00;
    public boolean A01;
    public final C018508q A02;
    public final C55922mP A03;
    public final InterfaceC55972mU A04;
    public final Stack A0A = new Stack();
    public final Stack A09 = new Stack();
    public final Map A08 = new HashMap();
    public final Object A05 = new Object();
    public final List A06 = new ArrayList(4);
    public final List A07 = new ArrayList(4);

    public AbstractC55962mT(C018508q c018508q, File file, InterfaceC55972mU interfaceC55972mU, long j) {
        this.A02 = c018508q;
        this.A03 = new C55922mP(file, j);
        this.A04 = interfaceC55972mU;
        int i = 0;
        do {
            this.A07.add(new Thread() { // from class: X.2mS
                {
                    AbstractC55962mT.this = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:225:0x00ca, code lost:
                    if (r13 == 3) goto L44;
                 */
                @Override // java.lang.Thread, java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 575
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C55952mS.run():void");
                }
            });
            this.A06.add(new Thread() { // from class: X.2mR
                {
                    AbstractC55962mT.this = this;
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    C55932mQ c55932mQ;
                    Process.setThreadPriority(10);
                    do {
                        try {
                            AbstractC55962mT abstractC55962mT = AbstractC55962mT.this;
                            Stack stack = abstractC55962mT.A09;
                            synchronized (stack) {
                                if (stack.size() == 0) {
                                    stack.wait();
                                }
                            }
                            if (stack.size() != 0) {
                                Object obj = abstractC55962mT.A05;
                                synchronized (obj) {
                                    if (stack.size() != 0) {
                                        c55932mQ = (C55932mQ) stack.pop();
                                    } else {
                                        c55932mQ = null;
                                    }
                                }
                                if (c55932mQ != null) {
                                    ConcurrentMap concurrentMap = c55932mQ.A05;
                                    if (concurrentMap.size() != 0) {
                                        String str = c55932mQ.A03;
                                        String A01 = C02A.A01(str);
                                        if (A01 != null) {
                                            C55922mP c55922mP = abstractC55962mT.A03;
                                            Bitmap A00 = c55922mP.A00(A01, c55932mQ.A01, c55932mQ.A00);
                                            if (A00 == null) {
                                                synchronized (obj) {
                                                    for (InterfaceC40241rp interfaceC40241rp : concurrentMap.values()) {
                                                        if (interfaceC40241rp.A7k()) {
                                                            if (interfaceC40241rp.getId().equals(str)) {
                                                                concurrentMap.remove(interfaceC40241rp);
                                                            }
                                                            abstractC55962mT.A02.A02.post(new RunnableEBaseShape2S0300000_I1(abstractC55962mT, null, Collections.singletonList(interfaceC40241rp), 0));
                                                        }
                                                    }
                                                    if (!c55932mQ.A06.get() && concurrentMap.size() != 0) {
                                                        Stack stack2 = abstractC55962mT.A0A;
                                                        stack2.remove(c55932mQ);
                                                        stack2.push(c55932mQ);
                                                        c55932mQ.A02 = new C63132zB((byte) 1);
                                                        synchronized (stack2) {
                                                            stack2.notify();
                                                        }
                                                    }
                                                }
                                            } else {
                                                C06F c06f = c55922mP.A02;
                                                synchronized (c06f) {
                                                    c06f.A08(str, A00);
                                                    c06f.A01();
                                                    c06f.A00();
                                                }
                                                synchronized (obj) {
                                                    abstractC55962mT.A08.remove(str);
                                                    if (concurrentMap.size() != 0) {
                                                        ArrayList arrayList = new ArrayList(concurrentMap.values());
                                                        concurrentMap.clear();
                                                        abstractC55962mT.A02.A02.post(new RunnableEBaseShape2S0300000_I1(abstractC55962mT, A00, arrayList, 0));
                                                    }
                                                }
                                            }
                                        } else {
                                            throw null;
                                        }
                                    }
                                }
                            }
                        } catch (InterruptedException unused) {
                            return;
                        }
                    } while (!Thread.interrupted());
                }
            });
            i++;
        } while (i < 4);
    }

    public void A00(InterfaceC40241rp interfaceC40241rp, boolean z) {
        InterfaceC55972mU interfaceC55972mU = this.A04;
        interfaceC55972mU.ALU(interfaceC40241rp);
        C55922mP c55922mP = this.A03;
        Bitmap bitmap = (Bitmap) c55922mP.A02.A04(interfaceC40241rp.getId());
        if (bitmap != null) {
            if (bitmap != C55922mP.A05) {
                interfaceC55972mU.ALX(interfaceC40241rp, bitmap, true);
                return;
            } else if (!z) {
                interfaceC55972mU.ALO(interfaceC40241rp);
                return;
            }
        }
        interfaceC55972mU.AHL(interfaceC40241rp);
        C000700j.A01();
        synchronized (this.A05) {
            Map map = this.A08;
            C55932mQ c55932mQ = (C55932mQ) map.get(interfaceC40241rp.getId());
            if (c55932mQ == null) {
                c55932mQ = new C55932mQ(interfaceC40241rp);
                map.put(c55932mQ.A03, c55932mQ);
            } else {
                c55932mQ.A05.put(interfaceC40241rp, interfaceC40241rp);
            }
            Stack stack = this.A09;
            stack.remove(c55932mQ);
            this.A0A.remove(c55932mQ);
            stack.push(c55932mQ);
            synchronized (stack) {
                stack.notify();
            }
        }
        if (!this.A00) {
            for (Thread thread : this.A06) {
                if (thread.getState() == Thread.State.NEW) {
                    thread.start();
                }
            }
            this.A00 = true;
        }
        if (this.A01) {
            return;
        }
        for (Thread thread2 : this.A07) {
            if (thread2.getState() == Thread.State.NEW) {
                thread2.start();
            }
        }
        this.A01 = true;
    }

    public void A01(boolean z) {
        for (Thread thread : this.A07) {
            thread.interrupt();
        }
        for (Thread thread2 : this.A06) {
            thread2.interrupt();
        }
        C55922mP c55922mP = this.A03;
        if (c55922mP != null) {
            c55922mP.A03(z);
        }
        this.A01 = false;
        this.A00 = false;
    }
}
