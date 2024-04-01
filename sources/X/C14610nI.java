package X;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.0nI  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C14610nI {
    public static final Executor A06 = new Executor() { // from class: X.0nH
        public final Handler A00 = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.A00.post(runnable);
        }
    };
    public int A00;
    public List A01;
    public final C14570nE A03;
    public final InterfaceC15040nz A04;
    public List A02 = Collections.emptyList();
    public final Executor A05 = A06;

    public C14610nI(InterfaceC15040nz interfaceC15040nz, C14570nE c14570nE) {
        this.A04 = interfaceC15040nz;
        this.A03 = c14570nE;
    }
}
