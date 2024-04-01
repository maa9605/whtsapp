package X;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;

/* renamed from: X.13g */
/* loaded from: classes.dex */
public class C226313g {
    public static final String[] A02 = {"com.google", "com.google.work", "cn.google"};
    public static final ComponentName A00 = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final C230615b A01 = new C230615b("Auth", "GoogleAuthUtil");

    public static Object A00(Context context, ComponentName componentName, InterfaceC226413h interfaceC226413h) {
        ServiceConnectionC226713l serviceConnectionC226713l = new ServiceConnectionC226713l();
        AnonymousClass152 A002 = AnonymousClass152.A00(context);
        if (A002 != null) {
            try {
                if (A002.A02(new AnonymousClass151(componentName), serviceConnectionC226713l, "GoogleAuthUtil")) {
                    try {
                        C07K.A1U("BlockingServiceConnection.getService() called on main thread");
                        if (!serviceConnectionC226713l.A00) {
                            serviceConnectionC226713l.A00 = true;
                            return interfaceC226413h.AX6((IBinder) serviceConnectionC226713l.A01.take());
                        }
                        throw new IllegalStateException("Cannot call get on this connection more than once");
                    } catch (RemoteException | InterruptedException e) {
                        Log.i("Auth", A01.A00("GoogleAuthUtil", "Error on service connection.", e));
                        throw new IOException("Error on service connection.", e);
                    }
                }
                throw new IOException("Could not bind to service.");
            } finally {
                A002.A01(new AnonymousClass151(componentName), serviceConnectionC226713l, "GoogleAuthUtil");
            }
        }
        throw null;
    }

    public static void A01(Account account) {
        if (!TextUtils.isEmpty(account.name)) {
            for (String str : A02) {
                if (str.equals(account.type)) {
                    return;
                }
            }
            throw new IllegalArgumentException("Account type not supported");
        }
        throw new IllegalArgumentException("Account name cannot be empty!");
    }

    public static void A02(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            C06220Rz c06220Rz = C06220Rz.A00;
            int A002 = C0CL.A00(applicationContext, 8400000);
            if (C0CL.A04(applicationContext, A002)) {
                A002 = 18;
            }
            if (A002 != 0) {
                Intent A012 = c06220Rz.A01(applicationContext, A002, "e");
                StringBuilder sb = new StringBuilder(57);
                sb.append("GooglePlayServices not available due to error ");
                sb.append(A002);
                Log.e("GooglePlayServicesUtil", sb.toString());
                if (A012 == null) {
                    throw new C226813n(A002);
                }
                throw new C30481ae(A002, A012);
            }
        } catch (C226813n e) {
            throw new C0TP(e.getMessage());
        } catch (C30481ae e2) {
            throw new C0TO(e2.zzaf, e2.getMessage(), new Intent(e2.mIntent)) { // from class: X.1q8
                public final int zzu;

                {
                    super(r2, r3);
                    this.zzu = r1;
                }
            };
        }
    }

    public static void A03(Object obj) {
        if (obj != null) {
            return;
        }
        Log.w("Auth", A01.A00("GoogleAuthUtil", "Binder call returned null."));
        throw new IOException("Service unavailable.");
    }
}
