package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService;
import com.whatsapp.util.Log;

/* renamed from: X.3W0 */
/* loaded from: classes2.dex */
public class C3W0 implements ServiceConnection {
    public IInterface A00;
    public C81083oK A01;
    public final Context A03;
    public final AbstractC000600i A04;
    public final C81073oJ A05;
    public final String A07;
    public final Object A06 = new Object();
    public EnumC71403Vz A02 = EnumC71403Vz.NEW;

    public C3W0(Context context, AbstractC000600i abstractC000600i, String str, C81073oJ c81073oJ, C81083oK c81083oK) {
        this.A03 = context;
        this.A04 = abstractC000600i;
        this.A07 = str;
        this.A05 = c81073oJ;
        this.A01 = c81083oK;
    }

    public void A00(String str) {
        StringBuilder A0P = C000200d.A0P("svc-connection/detach-binder; service=");
        A0P.append(this.A07);
        String obj = A0P.toString();
        C000200d.A18(obj, ", reason=", str);
        synchronized (this.A06) {
            EnumC71403Vz enumC71403Vz = this.A02;
            if (enumC71403Vz != EnumC71403Vz.CONNECTING && enumC71403Vz != EnumC71403Vz.CONNECTED) {
                StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append(", reason=");
                sb.append(str);
                sb.append(", detached while in wrong state=");
                sb.append(enumC71403Vz);
                Log.e(sb.toString());
                AbstractC000600i abstractC000600i = this.A04;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("reason=");
                sb2.append(str);
                sb2.append(", unexpected state=");
                sb2.append(this.A02);
                abstractC000600i.A09("svc-connection-detach-binder-failure", sb2.toString(), false);
            }
        }
        A01(true);
    }

    public void A01(boolean z) {
        EnumC71403Vz enumC71403Vz = EnumC71403Vz.CLOSED;
        StringBuilder A0P = C000200d.A0P("svc-connection/close; service=");
        A0P.append(this.A07);
        String obj = A0P.toString();
        Log.i(obj);
        Object obj2 = this.A06;
        synchronized (obj2) {
            if (this.A02 == enumC71403Vz) {
                return;
            }
            C81083oK c81083oK = this.A01;
            this.A01 = null;
            this.A02 = enumC71403Vz;
            obj2.notifyAll();
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(" -> state=");
            sb.append(this.A02);
            Log.i(sb.toString());
            this.A03.unbindService(this);
            if (z && c81083oK != null) {
                AbstractC42231vP abstractC42231vP = c81083oK.A00;
                synchronized (abstractC42231vP) {
                    if (abstractC42231vP.A01 != this) {
                        AbstractC000600i abstractC000600i = abstractC42231vP.A03;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("name=");
                        sb2.append(abstractC42231vP.A04);
                        abstractC000600i.A09("svc-client-close-unexpected-connection", sb2.toString(), false);
                        return;
                    }
                    abstractC42231vP.A01 = null;
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        A00("binder-died");
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        A00("binder-null");
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z;
        IInterface queryLocalInterface;
        if (iBinder != null) {
            StringBuilder A0P = C000200d.A0P("svc-connection/attach-binder; service=");
            A0P.append(this.A07);
            String obj = A0P.toString();
            Log.i(obj);
            Object obj2 = this.A06;
            synchronized (obj2) {
                EnumC71403Vz enumC71403Vz = this.A02;
                z = false;
                if (enumC71403Vz == EnumC71403Vz.CONNECTING) {
                    if (iBinder == null) {
                        queryLocalInterface = null;
                    } else {
                        queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof IAppDataReaderService)) {
                            queryLocalInterface = new IAppDataReaderService(iBinder) { // from class: X.1Z3
                                public IBinder A00;

                                {
                                    this.A00 = iBinder;
                                }

                                @Override // com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService
                                public void A75(String str) {
                                    Parcel obtain = Parcel.obtain();
                                    Parcel obtain2 = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService");
                                        obtain.writeString(str);
                                        this.A00.transact(3, obtain, obtain2, 0);
                                        obtain2.readException();
                                    } finally {
                                        obtain2.recycle();
                                        obtain.recycle();
                                    }
                                }

                                @Override // com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService
                                public ParcelFileDescriptor AAD() {
                                    Parcel obtain = Parcel.obtain();
                                    Parcel obtain2 = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService");
                                        this.A00.transact(1, obtain, obtain2, 0);
                                        obtain2.readException();
                                        return obtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
                                    } finally {
                                        obtain2.recycle();
                                        obtain.recycle();
                                    }
                                }

                                @Override // com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService
                                public ParcelFileDescriptor ACj(String str) {
                                    Parcel obtain = Parcel.obtain();
                                    Parcel obtain2 = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService");
                                        obtain.writeString(str);
                                        this.A00.transact(2, obtain, obtain2, 0);
                                        obtain2.readException();
                                        return obtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
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
                    }
                    this.A00 = queryLocalInterface;
                    this.A02 = EnumC71403Vz.CONNECTED;
                    obj2.notifyAll();
                    StringBuilder sb = new StringBuilder();
                    sb.append(obj);
                    sb.append(" -> state=");
                    sb.append(this.A02);
                    Log.i(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(obj);
                    sb2.append(", attached while in a wrong state=");
                    sb2.append(enumC71403Vz);
                    Log.e(sb2.toString());
                    AbstractC000600i abstractC000600i = this.A04;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("unexpected state=");
                    sb3.append(this.A02);
                    abstractC000600i.A09("svc-connection-attach-binder-failure", sb3.toString(), false);
                    z = true;
                }
            }
            if (z) {
                A01(true);
                return;
            }
            return;
        }
        A00("binder-null-on-connect");
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        A00("disconnected");
    }
}
