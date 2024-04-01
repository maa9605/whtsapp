package X;

import android.webkit.JavascriptInterface;

/* renamed from: X.3b4  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C73083b4 {
    public final /* synthetic */ C84053t7 A00;

    public C73083b4(C84053t7 c84053t7) {
        this.A00 = c84053t7;
    }

    @JavascriptInterface
    public void postPlayerEvent(int i, int i2) {
        if (i2 < 0 || i2 >= 2147483) {
            return;
        }
        C018508q c018508q = this.A00.A0B;
        c018508q.A02.post(new RunnableEBaseShape1S0102000_I1(this, i2, i, 2));
    }
}
