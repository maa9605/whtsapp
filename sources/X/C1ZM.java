package X;

import java.util.ArrayDeque;

/* renamed from: X.1ZM  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1ZM implements InterfaceC21620zd {
    public int A00;
    public int A01;
    public int A02;
    public C1ZK A03;
    public Exception A04;
    public boolean A05;
    public boolean A06;
    public final Thread A08;
    public final C1ZK[] A0B;
    public final C1ZL[] A0C;
    public final Object A07 = new Object();
    public final ArrayDeque A09 = new ArrayDeque();
    public final ArrayDeque A0A = new ArrayDeque();

    public abstract Exception A00(C1ZK c1zk, C1ZL c1zl, boolean z);

    public C1ZM(C1ZK[] c1zkArr, C1ZL[] c1zlArr) {
        this.A0B = c1zkArr;
        this.A00 = c1zkArr.length;
        for (int i = 0; i < this.A00; i++) {
            this.A0B[i] = new C39321pw();
        }
        this.A0C = c1zlArr;
        int length = c1zlArr.length;
        this.A01 = length;
        for (int i2 = 0; i2 < length; i2++) {
            final AbstractC39311pv abstractC39311pv = (AbstractC39311pv) this;
            c1zlArr[i2] = new AbstractC39331px(abstractC39311pv) { // from class: X.1Ay
                public final AbstractC39311pv A00;

                {
                    this.A00 = abstractC39311pv;
                }

                @Override // X.C1ZL
                public final void A02() {
                    AbstractC39311pv abstractC39311pv2 = this.A00;
                    Object obj = abstractC39311pv2.A07;
                    synchronized (obj) {
                        ((AbstractC21590za) this).A00 = 0;
                        this.A01 = null;
                        C1ZL[] c1zlArr2 = abstractC39311pv2.A0C;
                        int i3 = abstractC39311pv2.A01;
                        abstractC39311pv2.A01 = i3 + 1;
                        c1zlArr2[i3] = this;
                        if (!abstractC39311pv2.A09.isEmpty() && abstractC39311pv2.A01 > 0) {
                            obj.notify();
                        }
                    }
                }
            };
        }
        Thread thread = new Thread() { // from class: X.0zf
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Object obj;
                C1ZM c1zm = C1ZM.this;
                if (c1zm == null) {
                    throw null;
                }
                while (true) {
                    try {
                        obj = c1zm.A07;
                        synchronized (obj) {
                            while (!c1zm.A06 && (c1zm.A09.isEmpty() || c1zm.A01 <= 0)) {
                                obj.wait();
                            }
                            if (c1zm.A06) {
                                return;
                            }
                            C1ZK c1zk = (C1ZK) c1zm.A09.removeFirst();
                            C1ZL[] c1zlArr2 = c1zm.A0C;
                            int i3 = c1zm.A01 - 1;
                            c1zm.A01 = i3;
                            C1ZL c1zl = c1zlArr2[i3];
                            boolean z = c1zm.A05;
                            c1zm.A05 = false;
                            if (c1zk.A01()) {
                                ((AbstractC21590za) c1zl).A00 = 4 | ((AbstractC21590za) c1zl).A00;
                            } else {
                                if (c1zk.A00()) {
                                    ((AbstractC21590za) c1zl).A00 = Integer.MIN_VALUE | ((AbstractC21590za) c1zl).A00;
                                }
                                try {
                                    Exception A00 = c1zm.A00(c1zk, c1zl, z);
                                    c1zm.A04 = A00;
                                    if (A00 != null) {
                                        break;
                                    }
                                } catch (OutOfMemoryError e) {
                                    c1zm.A04 = new AnonymousClass115("Unexpected decode error", e);
                                } catch (RuntimeException e2) {
                                    c1zm.A04 = new AnonymousClass115("Unexpected decode error", e2);
                                }
                            }
                            synchronized (obj) {
                                if (c1zm.A05) {
                                    c1zl.A02();
                                } else if (c1zl.A00()) {
                                    c1zm.A02++;
                                    c1zl.A02();
                                } else {
                                    c1zm.A02 = 0;
                                    c1zm.A0A.addLast(c1zl);
                                }
                                c1zk.A03();
                                C1ZK[] c1zkArr2 = c1zm.A0B;
                                int i4 = c1zm.A00;
                                c1zm.A00 = i4 + 1;
                                c1zkArr2[i4] = c1zk;
                            }
                        }
                    } catch (InterruptedException e3) {
                        throw new IllegalStateException(e3);
                    }
                }
                synchronized (obj) {
                }
            }
        };
        this.A08 = thread;
        thread.start();
    }

    @Override // X.InterfaceC21620zd
    public Object A78() {
        C1ZK c1zk;
        synchronized (this.A07) {
            Exception exc = this.A04;
            if (exc == null) {
                C002701i.A1K(this.A03 == null);
                int i = this.A00;
                if (i == 0) {
                    c1zk = null;
                } else {
                    C1ZK[] c1zkArr = this.A0B;
                    int i2 = i - 1;
                    this.A00 = i2;
                    c1zk = c1zkArr[i2];
                }
                this.A03 = c1zk;
            } else {
                throw exc;
            }
        }
        return c1zk;
    }

    @Override // X.InterfaceC21620zd
    public Object A79() {
        synchronized (this.A07) {
            Exception exc = this.A04;
            if (exc == null) {
                ArrayDeque arrayDeque = this.A0A;
                if (arrayDeque.isEmpty()) {
                    return null;
                }
                return (C1ZL) arrayDeque.removeFirst();
            }
            throw exc;
        }
    }

    @Override // X.InterfaceC21620zd
    public void AR2(Object obj) {
        Object obj2 = this.A07;
        synchronized (obj2) {
            Exception exc = this.A04;
            if (exc == null) {
                C002701i.A1J(obj == this.A03);
                ArrayDeque arrayDeque = this.A09;
                arrayDeque.addLast(obj);
                if (!arrayDeque.isEmpty() && this.A01 > 0) {
                    obj2.notify();
                }
                this.A03 = null;
            } else {
                throw exc;
            }
        }
    }

    @Override // X.InterfaceC21620zd
    public final void flush() {
        synchronized (this.A07) {
            this.A05 = true;
            this.A02 = 0;
            C1ZK c1zk = this.A03;
            if (c1zk != null) {
                c1zk.A03();
                C1ZK[] c1zkArr = this.A0B;
                int i = this.A00;
                this.A00 = i + 1;
                c1zkArr[i] = c1zk;
                this.A03 = null;
            }
            while (true) {
                ArrayDeque arrayDeque = this.A09;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                C1ZK c1zk2 = (C1ZK) arrayDeque.removeFirst();
                c1zk2.A03();
                C1ZK[] c1zkArr2 = this.A0B;
                int i2 = this.A00;
                this.A00 = i2 + 1;
                c1zkArr2[i2] = c1zk2;
            }
            while (true) {
                ArrayDeque arrayDeque2 = this.A0A;
                if (!arrayDeque2.isEmpty()) {
                    ((C1ZL) arrayDeque2.removeFirst()).A02();
                }
            }
        }
    }

    @Override // X.InterfaceC21620zd
    public void release() {
        Object obj = this.A07;
        synchronized (obj) {
            this.A06 = true;
            obj.notify();
        }
        try {
            this.A08.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
