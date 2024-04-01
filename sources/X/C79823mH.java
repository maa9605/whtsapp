package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.search.verification.client.R;
import com.whatsapp.registration.VerifySms;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.3mH  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C79823mH extends BroadcastReceiver {
    public boolean A00;
    public final C000500h A01;
    public final C2DT A02;
    public final C79903mP A03;
    public final AbstractC465527h A04;
    public final InterfaceC002901k A05;
    public final WeakReference A07;
    public volatile boolean A08 = false;
    public final Object A06 = new Object();

    public C79823mH(VerifySms verifySms, InterfaceC002901k interfaceC002901k, C000500h c000500h, AbstractC465527h abstractC465527h, C2DT c2dt, C79903mP c79903mP) {
        this.A07 = new WeakReference(verifySms);
        this.A05 = interfaceC002901k;
        this.A01 = c000500h;
        this.A04 = abstractC465527h;
        this.A02 = c2dt;
        this.A03 = c79903mP;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C000500h c000500h;
        if (!this.A08) {
            synchronized (this.A06) {
                if (!this.A08) {
                    AnonymousClass029.A0Y(context);
                    this.A08 = true;
                }
            }
        }
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Log.i("smsretrieverreceiver/text/intent");
            if (this.A00) {
                Log.i("smsretrieverreceiver/already received");
                return;
            }
            VerifySms verifySms = (VerifySms) this.A07.get();
            if (verifySms == null) {
                Log.i("receivedtextreceiver/activity is null");
            } else if (verifySms.AFE()) {
                Log.i("smsretrieverreceiver/destroyed");
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    Log.e("smsretrieverreceiver/bundle-null");
                    return;
                }
                Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                if (status == null) {
                    Log.e("smsretrieverreceiver/status-null");
                    return;
                }
                int i = status.A01;
                String str = null;
                if (i != 0) {
                    if (i == 15) {
                        C000500h c000500h2 = this.A01;
                        final int i2 = c000500h2.A00.getInt("sms_retriever_retry_count", 0);
                        if (i2 < 2) {
                            C0AC A01 = new C39701qa((Activity) verifySms).A01(new C39711qb());
                            C0AH c0ah = new C0AH() { // from class: X.3lz
                                @Override // X.C0AH
                                public final void APH(Object obj) {
                                    C79823mH c79823mH = C79823mH.this;
                                    int i3 = i2;
                                    Log.i("verifysms/smsretriever/re-registered sms retriever client");
                                    C000200d.A0g(c79823mH.A01, "sms_retriever_retry_count", i3 + 1);
                                }
                            };
                            if (A01 != null) {
                                Executor executor = C0AI.A00;
                                A01.A02(executor, c0ah);
                                A01.A01(executor, new C0AG() { // from class: X.3ly
                                    @Override // X.C0AG
                                    public final void AKE(Exception exc) {
                                        C79823mH c79823mH = C79823mH.this;
                                        Log.e("verifysms/smsretriever/failure registering sms retriever client/ ", exc);
                                        C000500h c000500h3 = c79823mH.A01;
                                        C28E.A0H(c000500h3, "timeout-waiting-for-sms");
                                        C000200d.A0g(c000500h3, "sms_retriever_retry_count", 0);
                                    }
                                });
                                return;
                            }
                            throw null;
                        }
                        C28E.A0H(c000500h2, "timeout-waiting-for-sms");
                        C000200d.A0g(c000500h2, "sms_retriever_retry_count", 0);
                        return;
                    }
                    return;
                }
                String string = extras.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                if (string == null) {
                    C28E.A0H(this.A01, "null-sms-message");
                    return;
                }
                String string2 = verifySms.getString(R.string.localized_app_name);
                StringBuilder A0P = C000200d.A0P("(?:WhatsApp|");
                A0P.append(Pattern.quote(string2));
                A0P.append(").*?([0-9]{3})-([0-9]{3})");
                Matcher matcher = Pattern.compile(A0P.toString()).matcher(string);
                if (matcher.find()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(matcher.group(1));
                    sb.append(matcher.group(2));
                    str = sb.toString();
                }
                if (AnonymousClass024.A01(str, -1) != -1) {
                    this.A00 = true;
                    verifySms.A1t(str);
                    verifySms.A00 = 0;
                    InterfaceC002901k interfaceC002901k = this.A05;
                    c000500h = this.A01;
                    interfaceC002901k.ARy(new C79833mI(c000500h.A0H(), c000500h.A0J(), "sms", C3Z0.AUTO_DETECTED, verifySms, c000500h, this.A02, this.A03), str);
                } else {
                    Log.w("verifysms/smsretriever/no-code");
                    c000500h = this.A01;
                    C28E.A0H(c000500h, "server-send-mismatch-empty");
                }
                C000200d.A0g(c000500h, "sms_retriever_retry_count", 0);
            }
        }
    }
}
