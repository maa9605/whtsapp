package X;

import com.whatsapp.notification.DirectReplyService;

/* renamed from: X.3N1  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3N1 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C06C A00;
    public final /* synthetic */ C76783h9 A01;
    public final /* synthetic */ DirectReplyService A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C3N1(DirectReplyService directReplyService, C76783h9 c76783h9, C06C c06c, String str, String str2) {
        this.A02 = directReplyService;
        this.A01 = c76783h9;
        this.A00 = c06c;
        this.A03 = str;
        this.A04 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A03(this.A01, this.A00, this.A03, this.A04);
    }
}
