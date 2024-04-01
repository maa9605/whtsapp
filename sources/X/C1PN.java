package X;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: X.1PN  reason: invalid class name */
/* loaded from: classes.dex */
public class C1PN {
    public static volatile C1PN A06;
    public final C001200o A00;
    public final C00Y A01;
    public final C07000Wb A02;
    public final C00G A03;
    public final C1PT A04;
    public final ExecutorService A05;

    public C1PN(C001200o c001200o, C07000Wb c07000Wb, ExecutorService executorService, C00G c00g, C1PT c1pt, C00Y c00y) {
        this.A00 = c001200o;
        this.A02 = c07000Wb;
        this.A05 = executorService;
        this.A03 = c00g;
        this.A04 = c1pt;
        this.A01 = c00y;
    }

    public final void A00(String str, String str2, boolean z) {
        try {
            if (this.A03.A02(str2).A03) {
                Intent intent = new Intent("com.whatsapp.action.INSTRUMENTATION_CALLBACK_SERVICE").setPackage(str2);
                try {
                    List<ResolveInfo> queryIntentServices = this.A04.A00.queryIntentServices(intent, 0);
                    if (!queryIntentServices.isEmpty()) {
                        if (queryIntentServices.size() <= 1) {
                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                            if (serviceInfo == null || !"com.whatsapp.permission.BROADCAST".equals(serviceInfo.permission)) {
                                throw new SecurityException(C000200d.A0H("Service not protected by permission ", "com.whatsapp.permission.BROADCAST"));
                            }
                        } else {
                            StringBuilder A0P = C000200d.A0P("Multiple services can handle this intent ");
                            A0P.append(intent.getAction());
                            throw new SecurityException(A0P.toString());
                        }
                    }
                    if (this.A00.A00.bindService(intent, new C0T8(this, str, str2, z), 1)) {
                        return;
                    }
                    Log.w("CallbackServiceProxy/Failed to bind to stella service");
                    return;
                } catch (Throwable th) {
                    Log.e("CallbackServiceProxy/Failed to bind to stella service", th);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Log.w("CallbackServiceProxy/verification failed, dropping event");
    }
}
