package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.0Tr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class HandlerC06520Tr extends Handler {
    public final C03150Ej A00;
    public final C47232Ak A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC06520Tr(Looper looper, C47232Ak c47232Ak, C03150Ej c03150Ej) {
        super(looper);
        if (looper != null) {
            this.A01 = c47232Ak;
            this.A00 = c03150Ej;
            return;
        }
        throw null;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (this.A00.A00) {
            return;
        }
        this.A01.A02(true);
    }
}
