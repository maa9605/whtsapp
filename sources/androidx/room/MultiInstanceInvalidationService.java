package androidx.room;

import X.BinderC38611oh;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {
    public int A00 = 0;
    public final HashMap A03 = new HashMap();
    public final RemoteCallbackList A01 = new RemoteCallbackList() { // from class: X.0oq
        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(IInterface iInterface, Object obj) {
            MultiInstanceInvalidationService.this.A03.remove(Integer.valueOf(((Number) obj).intValue()));
        }
    };
    public final BinderC38611oh A02 = new BinderC38611oh(this);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.A02;
    }
}
