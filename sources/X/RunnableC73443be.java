package X;

/* renamed from: X.3be  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class RunnableC73443be extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C73453bf A00;

    public RunnableC73443be(C73453bf c73453bf) {
        this.A00 = c73453bf;
    }

    @Override // java.lang.Runnable
    public void run() {
        C73453bf c73453bf = this.A00;
        if (c73453bf.A0f) {
            c73453bf.A0m.postDelayed(this, 1000L);
        } else if (!c73453bf.A0S()) {
        } else {
            c73453bf.A0b.A04(300L, new RunnableEBaseShape9S0100000_I1_1(this, 27));
        }
    }
}
