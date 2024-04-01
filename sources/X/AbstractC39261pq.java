package X;

import android.os.Handler;
import java.util.HashMap;

/* renamed from: X.1pq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39261pq extends AbstractC29941Zc {
    public Handler A00;
    public C12L A01;
    public final HashMap A02 = new HashMap();

    public abstract void A03(Object obj, InterfaceC219210i interfaceC219210i, AbstractC21230z0 abstractC21230z0, Object obj2);

    @Override // X.AbstractC29941Zc
    public void A00() {
        HashMap hashMap = this.A02;
        for (C218610b c218610b : hashMap.values()) {
            InterfaceC219210i interfaceC219210i = c218610b.A01;
            interfaceC219210i.ARF(c218610b.A00);
            interfaceC219210i.ARM(c218610b.A02);
        }
        hashMap.clear();
    }

    @Override // X.InterfaceC219210i
    public void AGU() {
        for (C218610b c218610b : this.A02.values()) {
            c218610b.A01.AGU();
        }
    }
}
