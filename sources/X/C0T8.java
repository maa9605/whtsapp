package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.whatsapp.instrumentation.CallbackInterface;
import com.whatsapp.util.Log;

/* renamed from: X.0T8 */
/* loaded from: classes.dex */
public class C0T8 implements ServiceConnection {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final /* synthetic */ C1PN A03;

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }

    public C0T8(C1PN c1pn, String str, String str2, boolean z) {
        this.A03 = c1pn;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = z;
    }

    public static CallbackInterface A00(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.whatsapp.instrumentation.CallbackInterface");
        if (queryLocalInterface != null && (queryLocalInterface instanceof CallbackInterface)) {
            return (CallbackInterface) queryLocalInterface;
        }
        return new CallbackInterface(iBinder) { // from class: X.3D3
            public IBinder A00;

            {
                this.A00 = iBinder;
            }

            @Override // com.whatsapp.instrumentation.CallbackInterface
            public String A8O() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.whatsapp.instrumentation.CallbackInterface");
                    this.A00.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.whatsapp.instrumentation.CallbackInterface
            public void AK5(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.whatsapp.instrumentation.CallbackInterface");
                    obtain.writeString(str);
                    this.A00.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.A00;
            }
        };
    }

    public static final CallbackInterface A01(IBinder iBinder) {
        CallbackInterface A00 = A00(iBinder);
        if (A00 != null) {
            return A00;
        }
        StringBuilder sb = new StringBuilder("Cannot convert binder to interface: ");
        sb.append(iBinder);
        throw new IllegalStateException(sb.toString());
    }

    public final void A02(IBinder iBinder) {
        C001200o c001200o;
        try {
            try {
                CallbackInterface A01 = A01(iBinder);
                if (this.A02) {
                    A03(A01);
                }
                A01.AK5(this.A00);
                c001200o = this.A03.A00;
            } catch (C62082xJ e) {
                StringBuilder sb = new StringBuilder();
                sb.append("CallbackServiceProxy/failed to send request: ");
                sb.append(e.getMessage());
                Log.e(sb.toString());
                C1PN c1pn = this.A03;
                c1pn.A01.A01(this.A01);
                c001200o = c1pn.A00;
                c001200o.A00.unbindService(this);
            } catch (Throwable th) {
                Log.e("CallbackServiceProxy/failed to send request:", th);
                c001200o = this.A03.A00;
                c001200o.A00.unbindService(this);
            }
            c001200o.A00.unbindService(this);
        } catch (Throwable th2) {
            this.A03.A00.A00.unbindService(this);
            throw th2;
        }
    }

    public final void A03(CallbackInterface callbackInterface) {
        String A8O = callbackInterface.A8O();
        C07000Wb c07000Wb = this.A03.A02;
        String str = this.A01;
        if (c07000Wb.A01(str, A8O)) {
            return;
        }
        Log.w("CallbackServiceProxy/request invalid authorization token");
        throw new Exception(str) { // from class: X.2xJ
            public final String message;

            {
                this.message = C000200d.A0I("Package ", str, " not authorized");
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }
        };
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C1PN c1pn = this.A03;
        try {
            if (c1pn.A03.A02(componentName.getPackageName()).A03 && this.A01.equals(componentName.getPackageName())) {
                c1pn.A05.execute(new RunnableEBaseShape2S0200000_I0_2(this, iBinder, 30));
                return;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Log.e("CallbackServiceProxy/service component mismatch.");
        c1pn.A00.A00.unbindService(this);
    }
}
