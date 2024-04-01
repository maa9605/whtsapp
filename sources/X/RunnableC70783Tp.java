package X;

/* renamed from: X.3Tp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC70783Tp extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C50692Su A00;
    public final /* synthetic */ C40711sk A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ RunnableC70783Tp(C50692Su c50692Su, C40711sk c40711sk, String str, String str2) {
        this.A00 = c50692Su;
        this.A01 = c40711sk;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C50692Su c50692Su = this.A00;
        C40711sk c40711sk = this.A01;
        c50692Su.A07.A02(new C0MA(c40711sk.A02, this.A02, this.A03));
    }
}
