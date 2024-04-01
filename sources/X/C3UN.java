package X;

import java.util.HashMap;

/* renamed from: X.3UN  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3UN extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C2P1 A00;
    public final /* synthetic */ String A01 = "2fa";
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C3UN(C2P1 c2p1, String str, String str2) {
        this.A00 = c2p1;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2P1 c2p1 = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        String str3 = this.A03;
        C2DT c2dt = (C2DT) c2p1.A00.get();
        C00J c00j = c2p1.A01;
        String A0H = ((C000500h) c00j.get()).A0H();
        String A0J = ((C000500h) c00j.get()).A0J();
        String str4 = str2 != null ? str2 : "unknown";
        String str5 = str3 != null ? str3 : "unknown";
        byte[] A09 = c2dt.A09(A0H, A0J);
        C2DW c2dw = c2dt.A0F;
        HashMap hashMap = new HashMap();
        C05630Pm c05630Pm = c2dt.A00;
        if (c2dw != null) {
            C2DZ.A00(new C85273v8(c05630Pm, A0H, A0J, A09, str, str4, str5, hashMap));
            return;
        }
        throw null;
    }
}
