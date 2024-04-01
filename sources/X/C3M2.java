package X;

import java.util.List;

/* renamed from: X.3M2  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3M2 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass224 A02;
    public final /* synthetic */ List A03;

    public /* synthetic */ C3M2(AnonymousClass224 anonymousClass224, List list, int i, long j) {
        this.A02 = anonymousClass224;
        this.A03 = list;
        this.A00 = i;
        this.A01 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass224 anonymousClass224 = this.A02;
        List<AnonymousClass094> list = this.A03;
        int i = this.A00;
        long j = this.A01;
        for (AnonymousClass094 anonymousClass094 : list) {
            C0C9 c0c9 = anonymousClass224.A0O;
            AnonymousClass092 A0F = c0c9.A0F(anonymousClass094);
            if (A0F != null) {
                anonymousClass224.A05.A0D(A0F, i, c0c9.A05(A0F), j - A0F.A0E, false, false);
            }
        }
    }
}
