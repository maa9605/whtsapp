package com.whatsapp.contact.sync;

import X.AbstractC000600i;
import X.C37N;
import X.C468928r;
import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.IBinder;
import com.whatsapp.contact.sync.ContactsSyncAdapterService;
import com.whatsapp.util.Log;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public class ContactsSyncAdapterService extends C37N {
    public static AbstractThreadedSyncAdapter A02;
    public static final Object A03 = new Object();
    public AbstractC000600i A00;
    public C468928r A01;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return A02.getSyncAdapterBinder();
    }

    @Override // X.C37N, android.app.Service
    public void onCreate() {
        super.onCreate();
        synchronized (A03) {
            if (A02 == null) {
                final Context applicationContext = getApplicationContext();
                A02 = new AbstractThreadedSyncAdapter(applicationContext) { // from class: X.2qa
                    @Override // android.content.AbstractThreadedSyncAdapter
                    public void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
                        C468428m c468428m = new C468428m(C22H.A02);
                        c468428m.A05 = true;
                        c468428m.A06 = true;
                        c468428m.A02();
                        C468528n A01 = c468428m.A01();
                        C469028s c469028s = new C469028s(true);
                        A01.A03.add(c469028s);
                        ContactsSyncAdapterService contactsSyncAdapterService = ContactsSyncAdapterService.this;
                        C468928r c468928r = contactsSyncAdapterService.A01;
                        c468928r.A0O.execute(new RunnableEBaseShape1S0200000_I0_1(c468928r, A01, 9));
                        try {
                            c469028s.get();
                        } catch (InterruptedException unused) {
                        } catch (ExecutionException e) {
                            Log.e(e);
                            Log.e("ContactsSyncAdapterService/onCreate", e);
                            contactsSyncAdapterService.A00.A09("ContactsSyncAdapterService/onCreate", e.getMessage(), true);
                        }
                    }
                };
            }
        }
    }
}
