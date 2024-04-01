package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;

/* renamed from: X.29r  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class ServiceConnectionC471229r implements ServiceConnection {
    public final /* synthetic */ ConversationsFragment A00;

    public ServiceConnectionC471229r(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ConversationsFragment conversationsFragment = this.A00;
        conversationsFragment.A0Q = ((BinderC52972bg) iBinder).A00;
        conversationsFragment.A0m = new C471429u(conversationsFragment);
        conversationsFragment.A1o.AS1(new RunnableEBaseShape2S0100000_I0_2(this, 12));
        Log.i("conversations/gdrive-service-connected");
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        ConversationsFragment conversationsFragment = this.A00;
        conversationsFragment.A0Q.A08(conversationsFragment.A0m);
        conversationsFragment.A0Q = null;
        Log.i("conversations/gdrive-service-disconnected");
    }
}
