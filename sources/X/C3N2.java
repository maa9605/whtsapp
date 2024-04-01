package X;

import android.content.Intent;
import com.whatsapp.notification.DirectReplyService;

/* renamed from: X.3N2  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3N2 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ C06C A01;
    public final /* synthetic */ C76783h9 A02;
    public final /* synthetic */ DirectReplyService A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C3N2(DirectReplyService directReplyService, C76783h9 c76783h9, String str, C06C c06c, Intent intent) {
        this.A03 = directReplyService;
        this.A02 = c76783h9;
        this.A04 = str;
        this.A01 = c06c;
        this.A00 = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A03.A04(this.A02, this.A04, this.A01, this.A00);
    }
}
