package X;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.12J  reason: invalid class name */
/* loaded from: classes.dex */
public final class C12J {
    public static final C12D A03 = new C12D(2, -9223372036854775807L);
    public static final C12D A04 = new C12D(3, -9223372036854775807L);
    public C12E A00;
    public IOException A01;
    public final ExecutorService A02 = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: X.12P
        public final /* synthetic */ String A00 = "Loader:ExtractorMediaPeriod";

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, this.A00);
        }
    });
}
