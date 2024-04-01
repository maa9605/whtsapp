package X;

import android.content.Context;
import android.net.Uri;
import android.util.LogPrinter;
import java.lang.Thread;

/* renamed from: X.13H */
/* loaded from: classes.dex */
public final class C13H {
    public static volatile C13H A04;
    public Thread.UncaughtExceptionHandler A00;
    public final Context A01;
    public final C13E A02;
    public volatile C31601cX A03;

    public C13H(Context context) {
        Context applicationContext = context.getApplicationContext();
        C07K.A1P(applicationContext);
        this.A01 = applicationContext;
        this.A02 = new C13E(this);
        new Object() { // from class: X.13D
            public static final Uri A00;

            {
                new LogPrinter(4, "GA/LogCatTransport");
            }

            static {
                Uri.Builder builder = new Uri.Builder();
                builder.scheme("uri");
                builder.authority("local");
                A00 = builder.build();
            }
        };
    }

    public static void A00() {
        if (!(Thread.currentThread() instanceof C13G)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }
}
