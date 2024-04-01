package X;

/* renamed from: X.3Br  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C66603Br extends C06F {
    public C3BV A00;

    public C66603Br(int i) {
        super(i);
    }

    @Override // X.C06F
    public void A09(boolean z, Object obj, Object obj2, Object obj3) {
        C3BV c3bv;
        synchronized (this) {
            c3bv = this.A00;
        }
        if (c3bv != null) {
            c3bv.A00.A05().execute(new RunnableEBaseShape2S0100000_I0_2(obj2, 49));
        }
    }
}
