package X;

import java.util.Map;

/* renamed from: X.2nb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC56592nb extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C45T A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    public /* synthetic */ RunnableC56592nb(C45T c45t, String str, Map map) {
        this.A00 = c45t;
        this.A01 = str;
        this.A02 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A02(this.A01, this.A02);
    }
}
