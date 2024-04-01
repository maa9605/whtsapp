package X;

import java.lang.ref.WeakReference;

/* renamed from: X.39S  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39S extends C0HS {
    public C018608r A00;
    public WeakReference A01;
    public final long A02;
    public final AbstractC005302j A03;
    public final boolean A04;
    public final boolean A05;

    public C39S(C018608r c018608r, Runnable runnable, long j, AbstractC005302j abstractC005302j, boolean z, boolean z2) {
        this.A00 = c018608r;
        this.A01 = new WeakReference(runnable);
        this.A03 = abstractC005302j;
        this.A05 = z;
        this.A04 = z2;
        this.A02 = j;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        this.A00.A0O(this.A03, this.A05, this.A04, true);
        ActivityC02290Ap.A06(this.A02, 300L);
        return null;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        Runnable runnable;
        WeakReference weakReference = this.A01;
        if (weakReference == null || (runnable = (Runnable) weakReference.get()) == null) {
            return;
        }
        runnable.run();
    }
}
