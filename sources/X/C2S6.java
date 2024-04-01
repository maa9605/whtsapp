package X;

import android.net.TrafficStats;
import android.os.Build;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.2S6  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2S6 {
    public static final Socket A04 = new Socket();
    public SSLSocketFactory A00;
    public boolean A01;
    public final AnonymousClass035 A02;
    public final ThreadPoolExecutor A03 = new ThreadPoolExecutor(2, 2, 30000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(2));

    public C2S6(AnonymousClass035 anonymousClass035) {
        this.A02 = anonymousClass035;
    }

    public final void A00(InetSocketAddress inetSocketAddress, int i, boolean z, C2SD c2sd) {
        try {
            try {
                TrafficStats.setThreadStatsTag(1);
                C2S7 A00 = C2SE.A00(this.A00, inetSocketAddress, i, z, "HappyEyeball");
                if (!c2sd.A00(A00.A00)) {
                    C27F.A01(A00);
                }
            } catch (IOException | ClassCastException e) {
                if ((e instanceof ClassCastException) && Build.VERSION.SDK_INT != 26) {
                    throw ((ClassCastException) e);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("HappyEyeball/connectAndCountDown/");
                sb.append(inetSocketAddress.getAddress());
                sb.append("/couldn't connect to ip");
                Log.e(sb.toString(), e);
                synchronized (this) {
                    if (this.A01) {
                        c2sd.A00(A04);
                    } else {
                        this.A01 = true;
                    }
                }
            }
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
