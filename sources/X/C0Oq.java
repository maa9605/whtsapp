package X;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.0Oq  reason: invalid class name */
/* loaded from: classes.dex */
public class C0Oq extends BroadcastReceiver {
    public final /* synthetic */ C05230Nv A00;

    public C0Oq(C05230Nv c05230Nv) {
        this.A00 = c05230Nv;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, Intent intent) {
        this.A00.A05.AS1(new Runnable() { // from class: X.1Lx
            @Override // java.lang.Runnable
            public final void run() {
                C0Oq c0Oq = C0Oq.this;
                Context context2 = context;
                C05230Nv c05230Nv = c0Oq.A00;
                synchronized (c05230Nv) {
                    if (!c05230Nv.A01.A03()) {
                        Log.i("androidcontactssync/skipping updating Android contact action items due to permissions denied");
                    } else {
                        Account A03 = c05230Nv.A03(context2);
                        if (A03 != null) {
                            c05230Nv.A06(context2, A03);
                        } else {
                            Log.w("androidcontactssync/skipping updating Android contact action items due to null account");
                        }
                    }
                }
            }
        });
    }
}
