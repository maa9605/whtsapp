package X;

import java.util.ArrayList;

/* renamed from: X.1Dq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC24991Dq implements Runnable {
    public final /* synthetic */ C09P A00;
    public final /* synthetic */ C09P A01;
    public final /* synthetic */ C021209s A02;
    public final /* synthetic */ String A03;

    public RunnableC24991Dq(String str, C021209s c021209s, C09P c09p, C09P c09p2) {
        this.A03 = str;
        this.A02 = c021209s;
        this.A00 = c09p;
        this.A01 = c09p2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            final C0AO A01 = C33311fh.A01(this.A03, this.A02);
            C0AQ.A00(new Runnable() { // from class: X.1Dp
                @Override // java.lang.Runnable
                public void run() {
                    RunnableC24991Dq runnableC24991Dq = RunnableC24991Dq.this;
                    C021209s c021209s = runnableC24991Dq.A02;
                    C09P c09p = runnableC24991Dq.A01;
                    ArrayList arrayList = new ArrayList();
                    InterfaceC020509l A0f = AnonymousClass088.A0f(A01);
                    if (arrayList.size() == 0) {
                        arrayList.add(A0f);
                        C25011Ds.A00(c09p, new C021109r(arrayList), c021209s);
                        return;
                    }
                    throw new IllegalArgumentException("arguments have to be continuous");
                }
            });
        } catch (IllegalArgumentException unused) {
            C0AQ.A00(new Runnable() { // from class: X.1Do
                @Override // java.lang.Runnable
                public void run() {
                    RunnableC24991Dq runnableC24991Dq = RunnableC24991Dq.this;
                    C25011Ds.A00(runnableC24991Dq.A00, C021109r.A01, runnableC24991Dq.A02);
                }
            });
        }
    }
}
