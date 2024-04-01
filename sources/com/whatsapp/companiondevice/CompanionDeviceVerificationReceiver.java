package com.whatsapp.companiondevice;

import X.AbstractC40621sZ;
import X.AnonymousClass029;
import X.C000500h;
import X.C000700j;
import X.C002301c;
import X.C005102h;
import X.C005402l;
import X.C01B;
import X.C05170Np;
import X.C0C5;
import X.C0DU;
import X.C0EE;
import X.C0G5;
import X.C0JV;
import X.C20R;
import X.C41711uO;
import X.C42071uz;
import X.C47342Av;
import X.C76753h6;
import android.app.Application;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class CompanionDeviceVerificationReceiver extends BroadcastReceiver {
    public C42071uz A00;
    public C000500h A01;
    public C41711uO A02;
    public final Object A03;
    public volatile boolean A04;

    public CompanionDeviceVerificationReceiver() {
        this(0);
    }

    public CompanionDeviceVerificationReceiver(int i) {
        this.A04 = false;
        this.A03 = new Object();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        List asList;
        if (!this.A04) {
            synchronized (this.A03) {
                if (!this.A04) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A22(this);
                    this.A04 = true;
                }
            }
        }
        String string = this.A01.A00.getString("companion_device_verification_ids", null);
        if (string != null && (asList = Arrays.asList(string.split(","))) != null) {
            Iterator it = asList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                C41711uO c41711uO = this.A02;
                if (c41711uO != null) {
                    DeviceJid nullable = DeviceJid.getNullable(str);
                    if (nullable == null) {
                        throw null;
                    }
                    C0JV A03 = c41711uO.A03(nullable);
                    if (A03 != null) {
                        C42071uz c42071uz = this.A00;
                        if (c42071uz != null) {
                            C000700j.A01();
                            Iterator it2 = c42071uz.A00.iterator();
                            while (true) {
                                C0G5 c0g5 = (C0G5) it2;
                                if (!c0g5.hasNext()) {
                                    break;
                                }
                                C47342Av c47342Av = ((C76753h6) c0g5.next()).A00;
                                Application application = c47342Av.A02.A00;
                                C01B c01b = c47342Av.A00;
                                C002301c c002301c = c47342Av.A04;
                                C005102h c005102h = c47342Av.A03;
                                C0EE c0ee = c47342Av.A05;
                                String string2 = application.getString(R.string.notification_companion_device_verification_title);
                                String string3 = application.getString(R.string.notification_companion_device_verification_description, A03.A07, AbstractC40621sZ.A00(c002301c, A03.A04));
                                C005402l A00 = C0DU.A00(application);
                                A00.A0J = "other_notifications@1";
                                A00.A0B(string2);
                                A00.A0A(string2);
                                A00.A09(string3);
                                A00.A09 = PendingIntent.getActivity(application, 0, C20R.A00(application, c01b, c0ee, false), 0);
                                C05170Np c05170Np = new C05170Np();
                                c05170Np.A07(string3);
                                A00.A08(c05170Np);
                                A00.A05(16, true);
                                A00.A07.icon = R.drawable.notify_web_client_connected;
                                c005102h.A03(null, 21, A00.A01());
                            }
                        } else {
                            throw null;
                        }
                    }
                } else {
                    throw null;
                }
            }
        } else {
            Log.e("CompanionDeviceVerificationReceiver/onReceive/ deviceIds are missing from prefs");
        }
        this.A01.A0D().remove("companion_device_verification_ids");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 536870912);
        if (broadcast != null) {
            broadcast.cancel();
        }
    }
}
