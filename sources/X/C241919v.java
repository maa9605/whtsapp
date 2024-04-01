package X;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.19v  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C241919v {
    public final Map A00 = new HashMap();

    public final void A00(IBinder iBinder) {
        Map map = this.A00;
        synchronized (map) {
            if (iBinder != null) {
                if (!(iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService") instanceof InterfaceC241819u)) {
                    new C32421e0(iBinder);
                }
            }
            new BinderC33091fL() { // from class: X.16g
                @Override // X.BinderC33091fL, X.InterfaceC241619s
                public final void AWn(Status status) {
                }
            };
            for (Map.Entry entry : map.entrySet()) {
                entry.getValue();
                try {
                    new C32241di();
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    break;
                } catch (RemoteException unused) {
                    String valueOf = String.valueOf(entry.getKey());
                    String valueOf2 = String.valueOf((Object) null);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 32 + valueOf2.length());
                    sb.append("onPostInitHandler: Didn't add: ");
                    sb.append(valueOf);
                    sb.append("/");
                    sb.append(valueOf2);
                    Log.w("WearableClient", sb.toString());
                }
            }
        }
    }
}
