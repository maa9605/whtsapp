package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: X.18X */
/* loaded from: classes.dex */
public class C18X {
    public static Context A00;
    public static C18Z A01;

    public static Context A00(Context context) {
        Context context2;
        Context context3 = A00;
        if (context3 != null) {
            return context3;
        }
        try {
            context2 = C16F.A01(context, C16F.A08, "com.google.android.gms.maps_dynamite").A00;
        } catch (Exception e) {
            Log.e("zzbz", "Failed to load maps module, use legacy", e);
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
        }
        A00 = context2;
        return context2;
    }

    public static C18Z A01(Context context) {
        C18Z c31831d1;
        C07K.A1P(context);
        C18Z c18z = A01;
        if (c18z != null) {
            return c18z;
        }
        int A002 = C0CL.A00(context, 13400000);
        if (A002 == 0) {
            Log.i("zzbz", "Making Creator dynamically");
            ClassLoader classLoader = A00(context).getClassLoader();
            try {
                C07K.A1P(classLoader);
                Class<?> loadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
                try {
                    IBinder iBinder = (IBinder) loadClass.newInstance();
                    if (iBinder == null) {
                        c31831d1 = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                        if (queryLocalInterface instanceof C18Z) {
                            c31831d1 = (C18Z) queryLocalInterface;
                        } else {
                            c31831d1 = new C31831d1(iBinder);
                        }
                    }
                    A01 = c31831d1;
                    try {
                        c31831d1.AWq(new BinderC06190Rw(A00(context).getResources()), 12451000);
                        return A01;
                    } catch (RemoteException e) {
                        throw new C09Y(e);
                    }
                } catch (IllegalAccessException unused) {
                    String name = loadClass.getName();
                    throw new IllegalStateException(name.length() != 0 ? "Unable to call the default constructor of ".concat(name) : new String("Unable to call the default constructor of "));
                } catch (InstantiationException unused2) {
                    String name2 = loadClass.getName();
                    throw new IllegalStateException(name2.length() != 0 ? "Unable to instantiate the dynamic class ".concat(name2) : new String("Unable to instantiate the dynamic class "));
                }
            } catch (ClassNotFoundException unused3) {
                throw new IllegalStateException("com.google.android.gms.maps.internal.CreatorImpl".length() != 0 ? "Unable to find dynamic class ".concat("com.google.android.gms.maps.internal.CreatorImpl") : new String("Unable to find dynamic class "));
            }
        }
        throw new C226813n(A002);
    }
}
