package X;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0KG  reason: invalid class name */
/* loaded from: classes.dex */
public class C0KG {
    public ServiceConnectionC226713l A00;
    public C16S A01;
    public boolean A02;
    public final long A03;
    public final Context A04;
    public final Object A05 = new Object();
    public final boolean A06;

    public C0KG(Context context, boolean z, boolean z2) {
        Context applicationContext;
        C07K.A1P(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.A04 = context;
        this.A02 = false;
        this.A03 = -1L;
        this.A06 = z2;
    }

    public final void A02() {
        C07K.A1U("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            Context context = this.A04;
            if (context == null || this.A00 == null) {
                return;
            }
            if (this.A02) {
                C231815n A00 = C231815n.A00();
                ServiceConnectionC226713l serviceConnectionC226713l = this.A00;
                if (A00 == null) {
                    throw null;
                }
                context.unbindService(serviceConnectionC226713l);
            }
            this.A02 = false;
            this.A01 = null;
            this.A00 = null;
        }
    }

    public void finalize() {
        A02();
        super.finalize();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(3:2|3|(1:5)(1:124))|6|7|8|(4:(20:10|11|12|13|(1:15)|17|18|19|(1:21)(1:114)|22|23|24|5e|60|ea|77|119|80|81|82)|23|24|5e)|121|11|12|13|(0)|17|18|19|(0)(0)|22|(2:(0)|(1:110))) */
    /* JADX WARN: Can't wrap try/catch for region: R(22:1|2|3|(1:5)(1:124)|6|7|8|(20:10|11|12|13|(1:15)|17|18|19|(1:21)(1:114)|22|23|24|5e|60|ea|77|119|80|81|82)|121|11|12|13|(0)|17|18|19|(0)(0)|22|23|24|5e|(2:(0)|(1:110))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        android.util.Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
        android.util.Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", r0);
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #13 {all -> 0x003a, blocks: (B:17:0x0031, B:19:0x0035), top: B:131:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #5 {all -> 0x004b, blocks: (B:23:0x0040, B:26:0x0046), top: B:122:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f A[Catch: all -> 0x0176, TRY_ENTER, TryCatch #11 {all -> 0x0179, blocks: (B:30:0x0055, B:31:0x005e, B:65:0x00e7, B:66:0x00ea, B:79:0x0117, B:80:0x0119, B:82:0x011b, B:81:0x011a, B:32:0x005f, B:34:0x0063, B:35:0x0066, B:36:0x006a, B:37:0x0073, B:43:0x0087, B:44:0x008e, B:49:0x0097, B:54:0x00b3, B:63:0x00e1, B:64:0x00e6, B:99:0x014f, B:100:0x0154, B:101:0x0155, B:102:0x015c, B:103:0x015d, B:104:0x0164, B:110:0x016e, B:111:0x0175, B:50:0x00a6, B:52:0x00ad, B:106:0x0166, B:55:0x00b5, B:57:0x00c2, B:59:0x00cf, B:61:0x00d9, B:62:0x00dc, B:94:0x013e, B:95:0x0145, B:96:0x0146, B:97:0x014d, B:67:0x00eb, B:69:0x00ef, B:70:0x00f1, B:75:0x00fc, B:76:0x00fd, B:77:0x0107, B:78:0x0116, B:89:0x012c, B:90:0x013a), top: B:128:0x0055 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C0KH A00(android.content.Context r15) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KG.A00(android.content.Context):X.0KH");
    }

    public static final void A01(C0KH c0kh, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > f) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("app_context", z ? "1" : "0");
        if (c0kh != null) {
            hashMap.put("limit_ad_tracking", c0kh.A01 ? "1" : "0");
            String str2 = c0kh.A00;
            if (str2 != null) {
                hashMap.put("ad_id_size", Integer.toString(str2.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new Thread() { // from class: X.139
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                String message;
                StringBuilder sb;
                String str3;
                Map map = hashMap;
                Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                for (String str4 : map.keySet()) {
                    buildUpon.appendQueryParameter(str4, (String) map.get(str4));
                }
                String obj = buildUpon.build().toString();
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(obj).openConnection();
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 65);
                            sb2.append("Received non-success response code ");
                            sb2.append(responseCode);
                            sb2.append(" from pinging URL: ");
                            sb2.append(obj);
                            Log.w("HttpUrlPinger", sb2.toString());
                        }
                    } finally {
                        httpURLConnection.disconnect();
                    }
                } catch (IOException e) {
                    e = e;
                    message = e.getMessage();
                    sb = new StringBuilder(C000200d.A00(message, C000200d.A00(obj, 27)));
                    str3 = "Error while pinging URL: ";
                    Log.w("HttpUrlPinger", C000200d.A0N(sb, str3, obj, ". ", message), e);
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    message = e.getMessage();
                    sb = new StringBuilder(C000200d.A00(message, C000200d.A00(obj, 32)));
                    str3 = "Error while parsing ping URL: ";
                    Log.w("HttpUrlPinger", C000200d.A0N(sb, str3, obj, ". ", message), e);
                } catch (RuntimeException e3) {
                    e = e3;
                    message = e.getMessage();
                    sb = new StringBuilder(C000200d.A00(message, C000200d.A00(obj, 27)));
                    str3 = "Error while pinging URL: ";
                    Log.w("HttpUrlPinger", C000200d.A0N(sb, str3, obj, ". ", message), e);
                }
            }
        }.start();
    }
}
