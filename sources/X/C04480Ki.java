package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.0Ki  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04480Ki {
    public static final C04480Ki A01 = new C04480Ki();
    public final Handler A00;

    public C04480Ki() {
        HandlerThread handlerThread = new HandlerThread("db_write", 10);
        handlerThread.start();
        this.A00 = new Handler(handlerThread.getLooper());
    }
}
