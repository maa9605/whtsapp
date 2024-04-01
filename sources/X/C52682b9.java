package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.2b9  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52682b9 {
    public Handler A00 = new Handler(Looper.getMainLooper());
    public Executor A01;

    public C52682b9(Executor executor) {
        this.A01 = executor;
    }
}
