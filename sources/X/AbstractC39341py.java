package X;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: X.1py  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39341py implements InterfaceC30051Zo {
    public long A00;
    public long A01;
    public C24421As A02;
    public final ArrayDeque A03 = new ArrayDeque();
    public final ArrayDeque A04;
    public final PriorityQueue A05;

    public abstract AnonymousClass114 A00();

    public abstract void A01(C39321pw c39321pw);

    public abstract boolean A02();

    @Override // X.InterfaceC21620zd
    public void release() {
    }

    public AbstractC39341py() {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            this.A03.add(new C24421As(null));
        }
        this.A04 = new ArrayDeque();
        do {
            this.A04.add(new AbstractC39331px() { // from class: X.1Ar
                @Override // X.C1ZL
                public final void A02() {
                    AbstractC39341py abstractC39341py = AbstractC39341py.this;
                    if (abstractC39341py != null) {
                        ((AbstractC21590za) this).A00 = 0;
                        this.A01 = null;
                        abstractC39341py.A04.add(this);
                        return;
                    }
                    throw null;
                }
            });
            i++;
        } while (i < 2);
        this.A05 = new PriorityQueue();
    }

    @Override // X.InterfaceC21620zd
    public Object A78() {
        C002701i.A1K(this.A02 == null);
        ArrayDeque arrayDeque = this.A03;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C24421As c24421As = (C24421As) arrayDeque.pollFirst();
        this.A02 = c24421As;
        return c24421As;
    }

    @Override // X.InterfaceC21620zd
    public Object A79() {
        ArrayDeque arrayDeque = this.A04;
        if (!arrayDeque.isEmpty()) {
            while (true) {
                PriorityQueue priorityQueue = this.A05;
                if (priorityQueue.isEmpty() || ((C1ZK) priorityQueue.peek()).A00 > this.A00) {
                    break;
                }
                C39321pw c39321pw = (C39321pw) priorityQueue.poll();
                if (c39321pw.A01()) {
                    AbstractC21590za abstractC21590za = (AbstractC21590za) arrayDeque.pollFirst();
                    abstractC21590za.A00 = 4 | abstractC21590za.A00;
                    c39321pw.A03();
                    this.A03.add(c39321pw);
                    return abstractC21590za;
                }
                A01(c39321pw);
                if (A02()) {
                    AnonymousClass114 A00 = A00();
                    if (!c39321pw.A00()) {
                        AbstractC39331px abstractC39331px = (AbstractC39331px) arrayDeque.pollFirst();
                        long j = ((C1ZK) c39321pw).A00;
                        ((C1ZL) abstractC39331px).A00 = j;
                        abstractC39331px.A01 = A00;
                        abstractC39331px.A00 = j;
                        c39321pw.A03();
                        this.A03.add(c39321pw);
                        return abstractC39331px;
                    }
                }
                c39321pw.A03();
                this.A03.add(c39321pw);
            }
        }
        return null;
    }

    @Override // X.InterfaceC21620zd
    public void AR2(Object obj) {
        AbstractC21590za abstractC21590za = (AbstractC21590za) obj;
        C002701i.A1J(abstractC21590za == this.A02);
        if (abstractC21590za.A00()) {
            C24421As c24421As = this.A02;
            c24421As.A03();
            this.A03.add(c24421As);
        } else {
            C24421As c24421As2 = this.A02;
            long j = this.A01;
            this.A01 = 1 + j;
            c24421As2.A00 = j;
            this.A05.add(c24421As2);
        }
        this.A02 = null;
    }

    @Override // X.InterfaceC30051Zo
    public void ATg(long j) {
        this.A00 = j;
    }

    @Override // X.InterfaceC21620zd
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.A05;
            if (priorityQueue.isEmpty()) {
                break;
            }
            C1ZK c1zk = (C1ZK) priorityQueue.poll();
            c1zk.A03();
            this.A03.add(c1zk);
        }
        C24421As c24421As = this.A02;
        if (c24421As != null) {
            c24421As.A03();
            this.A03.add(c24421As);
            this.A02 = null;
        }
    }
}
