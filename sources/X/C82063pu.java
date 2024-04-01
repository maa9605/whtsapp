package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;

/* renamed from: X.3pu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C82063pu extends AbstractC48662Ge {
    public final View A01;
    public final C3XU A02 = new C3XU();
    public final Handler A00 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.3XQ
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            C82063pu c82063pu = C82063pu.this;
            c82063pu.A02.A02();
            InterfaceC73113b7 interfaceC73113b7 = ((AbstractC48662Ge) c82063pu).A01;
            if (interfaceC73113b7 != null) {
                interfaceC73113b7.AIq(c82063pu);
                return true;
            }
            return true;
        }
    });

    public C82063pu(View view) {
        this.A01 = view;
    }
}
