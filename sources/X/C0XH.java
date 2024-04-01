package X;

import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: X.0XH  reason: invalid class name */
/* loaded from: classes.dex */
public class C0XH implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C0XF A01;
    public final /* synthetic */ Callable A02;

    public C0XH(Callable callable, Handler handler, C0XF c0xf) {
        this.A02 = callable;
        this.A00 = handler;
        this.A01 = c0xf;
    }

    @Override // java.lang.Runnable
    public void run() {
        final Object obj;
        try {
            obj = this.A02.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.A00.post(new Runnable() { // from class: X.0kQ
            @Override // java.lang.Runnable
            public void run() {
                C0XH.this.A01.ANs(obj);
            }
        });
    }
}
