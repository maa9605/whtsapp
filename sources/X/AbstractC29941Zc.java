package X;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1Zc */
/* loaded from: classes.dex */
public abstract class AbstractC29941Zc implements InterfaceC219210i {
    public Looper A00;
    public AbstractC21230z0 A01;
    public Object A02;
    public final ArrayList A04 = new ArrayList(1);
    public final C219410k A03 = new C219410k();

    public abstract void A00();

    public abstract void A02(C12L c12l);

    public final void A01(AbstractC21230z0 abstractC21230z0, Object obj) {
        this.A01 = abstractC21230z0;
        this.A02 = obj;
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((InterfaceC219110h) it.next()).AOn(this, abstractC21230z0, obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0007, code lost:
        if (r4 == null) goto L9;
     */
    @Override // X.InterfaceC219210i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A5B(android.os.Handler r3, X.InterfaceC219710n r4) {
        /*
            r2 = this;
            X.10k r1 = r2.A03
            if (r1 == 0) goto L18
            if (r3 == 0) goto L9
            r0 = 1
            if (r4 != 0) goto La
        L9:
            r0 = 0
        La:
            X.C002701i.A1J(r0)
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.A02
            X.10j r0 = new X.10j
            r0.<init>(r3, r4)
            r1.add(r0)
            return
        L18:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC29941Zc.A5B(android.os.Handler, X.10n):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0009, code lost:
        if (r1 == r2) goto L15;
     */
    @Override // X.InterfaceC219210i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AQq(X.InterfaceC219110h r4, X.C12L r5) {
        /*
            r3 = this;
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r1 = r3.A00
            if (r1 == 0) goto Lb
            r0 = 0
            if (r1 != r2) goto Lc
        Lb:
            r0 = 1
        Lc:
            X.C002701i.A1J(r0)
            java.util.ArrayList r0 = r3.A04
            r0.add(r4)
            android.os.Looper r0 = r3.A00
            if (r0 != 0) goto L1e
            r3.A00 = r2
            r3.A02(r5)
        L1d:
            return
        L1e:
            X.0z0 r1 = r3.A01
            if (r1 == 0) goto L1d
            java.lang.Object r0 = r3.A02
            r4.AOn(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC29941Zc.AQq(X.10h, X.12L):void");
    }

    @Override // X.InterfaceC219210i
    public final void ARF(InterfaceC219110h interfaceC219110h) {
        ArrayList arrayList = this.A04;
        arrayList.remove(interfaceC219110h);
        if (arrayList.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            A00();
        }
    }

    @Override // X.InterfaceC219210i
    public final void ARM(InterfaceC219710n interfaceC219710n) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A03.A02;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C219310j c219310j = (C219310j) it.next();
            if (c219310j.A01 == interfaceC219710n) {
                copyOnWriteArrayList.remove(c219310j);
            }
        }
    }
}
