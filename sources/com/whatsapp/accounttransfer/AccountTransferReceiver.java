package com.whatsapp.accounttransfer;

import X.AnonymousClass024;
import X.AnonymousClass029;
import X.C0C5;
import X.InterfaceC002901k;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class AccountTransferReceiver extends BroadcastReceiver {
    public InterfaceC002901k A00;
    public final Object A01;
    public volatile boolean A02;

    public AccountTransferReceiver() {
        this(0);
    }

    public AccountTransferReceiver(int i) {
        this.A02 = false;
        this.A01 = new Object();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, Intent intent) {
        KeyguardManager keyguardManager;
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A1z(this);
                    this.A02 = true;
                }
            }
        }
        String action = intent.getAction();
        StringBuilder sb = new StringBuilder("AccountTransferReceiver/onReceive/action=");
        sb.append(action);
        Log.i(sb.toString());
        if (AnonymousClass024.A0j(action)) {
            Log.i("AccountTransferReceiver/onReceive/action is empty");
        } else if (Build.VERSION.SDK_INT >= 23 && (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) != null && keyguardManager.isDeviceSecure() && AnonymousClass029.A1L(context)) {
            if (action.equals("com.google.android.gms.auth.START_ACCOUNT_EXPORT")) {
                this.A00.AS1(new Runnable() { // from class: X.1M0
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte[] A0F;
                        Context context2 = context;
                        if (C0KF.A02()) {
                            File A00 = C0KF.A00(context2);
                            if (A00.exists()) {
                                synchronized (C0KF.A00) {
                                    A0F = C02A.A0F(A00);
                                }
                                if (A0F != null && A0F.length != 0) {
                                    Log.i("AccountTransferBroadcastReceiver/onReceive/exporting");
                                    C30361aO c30361aO = new C30361aO(context2);
                                    C07K.A1P("com.whatsapp");
                                    C07K.A1P(A0F);
                                    final C31441cH c31441cH = new C31441cH(A0F);
                                    try {
                                        AnonymousClass088.A0n(c30361aO.A01(new AbstractC39451q9() { // from class: X.1AE
                                            @Override // X.AbstractC30351aN
                                            public final void A01(InterfaceC234016m interfaceC234016m) {
                                                interfaceC234016m.AWu(((AbstractC39451q9) this).A00, C31441cH.this);
                                            }
                                        }), 10L, TimeUnit.SECONDS);
                                        C07K.A1P("com.whatsapp");
                                        final C31421cF c31421cF = new C31421cF(1);
                                        c30361aO.A01(new AbstractC39451q9() { // from class: X.1AD
                                            @Override // X.AbstractC30351aN
                                            public final void A01(InterfaceC234016m interfaceC234016m) {
                                                interfaceC234016m.AWs(((AbstractC39451q9) this).A00, C31421cF.this);
                                            }
                                        });
                                        Log.i("AccountTransferBroadcastReceiver/onReceive/exported successfully");
                                        return;
                                    } catch (InterruptedException | ExecutionException | TimeoutException e) {
                                        C07K.A1P("com.whatsapp");
                                        final C31421cF c31421cF2 = new C31421cF(2);
                                        c30361aO.A01(new AbstractC39451q9() { // from class: X.1AD
                                            @Override // X.AbstractC30351aN
                                            public final void A01(InterfaceC234016m interfaceC234016m) {
                                                interfaceC234016m.AWs(((AbstractC39451q9) this).A00, C31421cF.this);
                                            }
                                        });
                                        Log.e("AccountTransferBroadcastReceiver/exception during export", e);
                                        return;
                                    }
                                }
                            }
                        }
                        Log.i("AccountTransferReceiver/onReceive/encoded backup token is not present");
                    }
                });
            }
        } else {
            Log.i("AccountTransferReceiver/onReceive/disabled");
        }
    }
}
