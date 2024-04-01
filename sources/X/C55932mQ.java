package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2mQ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C55932mQ {
    public int A00;
    public int A01;
    public C63132zB A02;
    public final String A03;
    public final String A04;
    public final ConcurrentMap A05;
    public volatile AtomicBoolean A06 = new AtomicBoolean();

    public C55932mQ(InterfaceC40241rp interfaceC40241rp) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.A05 = concurrentHashMap;
        concurrentHashMap.put(interfaceC40241rp, interfaceC40241rp);
        this.A03 = interfaceC40241rp.getId();
        this.A04 = interfaceC40241rp.ADk();
        this.A00 = interfaceC40241rp.AB5();
        this.A01 = interfaceC40241rp.AB7();
    }
}
