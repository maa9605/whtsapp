package X;

import android.app.Application;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.0H9  reason: invalid class name */
/* loaded from: classes.dex */
public class C0H9 {
    public static final Uri A09 = Uri.parse("");
    public static volatile C0H9 A0A;
    public C0HV A00;
    public ExecutorService A01;
    public final Handler A02;
    public final C018508q A03;
    public final C03130Eh A04;
    public final C03120Eg A05;
    public final C02E A06;
    public final C001200o A07;
    public final C0L9 A08;

    public C0H9(C001200o c001200o, C018508q c018508q, InterfaceC002901k interfaceC002901k, C02E c02e, C03130Eh c03130Eh, C0L9 c0l9, C03120Eg c03120Eg) {
        final Looper mainLooper = Looper.getMainLooper();
        this.A02 = new Handler(mainLooper) { // from class: X.0LK
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                C0H9.this.A01();
            }
        };
        this.A07 = c001200o;
        this.A03 = c018508q;
        this.A06 = c02e;
        this.A04 = c03130Eh;
        this.A08 = c0l9;
        this.A05 = c03120Eg;
        this.A01 = interfaceC002901k.A6y("AsyncAudioPlayer", 0, 1, 60L, 0, new LinkedBlockingQueue());
    }

    public static C0H9 A00() {
        if (A0A == null) {
            synchronized (C0H9.class) {
                if (A0A == null) {
                    A0A = new C0H9(C001200o.A01, C018508q.A00(), C002801j.A00(), C02E.A00(), C03130Eh.A00(), C0L9.A00(), C03120Eg.A00());
                }
            }
        }
        return A0A;
    }

    public void A01() {
        this.A01.submit(new Runnable() { // from class: X.1QT
            @Override // java.lang.Runnable
            public final void run() {
                C0H9 c0h9 = C0H9.this;
                C0HV c0hv = c0h9.A00;
                if (c0hv != null) {
                    c0hv.A05();
                    c0h9.A00 = null;
                }
            }
        });
    }

    public void A02(final Uri uri) {
        if (uri.compareTo(A09) == 0) {
            return;
        }
        Handler handler = this.A02;
        handler.removeMessages(99);
        handler.sendEmptyMessageDelayed(99, 10000L);
        A01();
        if (!this.A08.A00) {
            final Application application = this.A07.A00;
            if (this.A04.A00) {
                AudioManager A0A2 = this.A06.A0A();
                if (A0A2 == null || A0A2.getStreamVolume(5) > 0) {
                    this.A01.submit(new C1QU(this, application, uri, 3));
                    return;
                }
                return;
            }
            C018508q c018508q = this.A03;
            c018508q.A02.post(new Runnable() { // from class: X.1QV
                /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
                    if (r1.equals("Pixel 2 XL") == false) goto L17;
                 */
                /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        r6 = this;
                        X.0H9 r5 = X.C0H9.this
                        android.content.Context r4 = r2
                        android.net.Uri r3 = r3
                        X.0Eg r0 = r5.A05
                        boolean r0 = r0.A08()
                        if (r0 == 0) goto L4d
                        java.lang.String r2 = android.os.Build.MANUFACTURER
                        java.lang.String r0 = "Huawei"
                        boolean r0 = r2.equals(r0)
                        if (r0 == 0) goto L22
                        java.lang.String r1 = android.os.Build.MODEL
                        java.lang.String r0 = "Nexus 6P"
                        boolean r0 = r1.equals(r0)
                        if (r0 != 0) goto L4a
                    L22:
                        java.lang.String r0 = "Google"
                        boolean r0 = r2.equals(r0)
                        if (r0 == 0) goto L3c
                        java.lang.String r1 = android.os.Build.MODEL
                        java.lang.String r0 = "Pixel 2"
                        boolean r0 = r1.equals(r0)
                        if (r0 != 0) goto L4a
                        java.lang.String r0 = "Pixel 2 XL"
                        boolean r0 = r1.equals(r0)
                        if (r0 != 0) goto L4a
                    L3c:
                        java.lang.String r0 = "Xiaomi"
                        boolean r0 = r2.equals(r0)
                        if (r0 == 0) goto L59
                        int r1 = android.os.Build.VERSION.SDK_INT
                        r0 = 27
                        if (r1 != r0) goto L59
                    L4a:
                        r0 = 1
                    L4b:
                        if (r0 != 0) goto L58
                    L4d:
                        r2 = 5
                        java.util.concurrent.ExecutorService r1 = r5.A01
                        X.1QU r0 = new X.1QU
                        r0.<init>(r5, r4, r3, r2)
                        r1.submit(r0)
                    L58:
                        return
                    L59:
                        r0 = 0
                        goto L4b
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1QV.run():void");
                }
            });
        }
    }
}
