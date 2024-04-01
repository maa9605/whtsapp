package com.whatsapp;

import X.AbstractC005302j;
import X.C000200d;
import X.C002301c;
import X.C003101m;
import X.C005402l;
import X.C018608r;
import X.C02180Ae;
import X.C03070Ea;
import X.C09H;
import X.C0C5;
import X.C0DU;
import X.C0E2;
import X.C0US;
import X.C41491u0;
import X.C41961un;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.VoiceMessagingService;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes.dex */
public class VoiceMessagingService extends SearchActionVerificationClientService {
    public C0E2 A00;
    public C018608r A01;
    public C002301c A02;
    public C41491u0 A03;
    public C03070Ea A04;
    public C41961un A05;
    public final Handler A06 = new Handler(Looper.getMainLooper());

    public /* synthetic */ void A00(AbstractC005302j abstractC005302j, C09H c09h) {
        this.A01.A0X(this.A03.A07(abstractC005302j, c09h, (byte) 2, 1, null, false));
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        C0C5 c0c5 = (C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class);
        this.A04 = c0c5.A1g();
        this.A01 = c0c5.A0R();
        this.A03 = c0c5.A1E();
        this.A05 = c0c5.A1n();
        this.A02 = c0c5.A0h();
        C0E2 A0L = c0c5.A0L();
        this.A00 = A0L;
        super.attachBaseContext(new C0US(context, this.A02, A0L));
    }

    @Override // com.google.android.search.verification.client.SearchActionVerificationClientService
    public void performAction(Intent intent, boolean z, Bundle bundle) {
        Uri uri;
        if (!z) {
            Log.w("VoiceMessagingService/ignoring unverified voice message");
        } else if (!this.A04.A05()) {
            Log.i("VoiceMessagingService/ignoring voice message due to ToS update state");
        } else {
            String stringExtra = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID");
            final AbstractC005302j A02 = AbstractC005302j.A02(stringExtra);
            if (!C003101m.A0b(A02) && !C003101m.A0P(A02) && !C003101m.A0U(A02)) {
                C000200d.A15("VoiceMessagingService/ignoring voice message directed at invalid jid; jid=", stringExtra);
                return;
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                if (clipData.getItemCount() == 1) {
                    ClipData.Item itemAt = clipData.getItemAt(0);
                    if (itemAt != null && (uri = itemAt.getUri()) != null) {
                        try {
                            final C09H c09h = new C09H();
                            c09h.A0F = this.A05.A0c(uri);
                            StringBuilder sb = new StringBuilder();
                            sb.append("VoiceMessagingService/sending verified voice message (voice); jid=");
                            sb.append(A02);
                            Log.i(sb.toString());
                            this.A06.post(new Runnable() { // from class: X.1Ja
                                {
                                    VoiceMessagingService.this = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    VoiceMessagingService.this.A00(A02, c09h);
                                }
                            });
                            return;
                        } catch (IOException e) {
                            Log.w("VoiceMessagingService/IO Exception while trying to send voice message", e);
                            return;
                        }
                    }
                } else if (clipData.getItemCount() > 1 || clipData.getItemCount() < 0) {
                    StringBuilder A0P = C000200d.A0P("VoiceMessagingService/ignoring voice message with unexpected item count; itemCount=");
                    A0P.append(clipData.getItemCount());
                    Log.w(A0P.toString());
                    return;
                }
            }
            final String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
            if (TextUtils.isEmpty(stringExtra2)) {
                StringBuilder sb2 = new StringBuilder("VoiceMessagingService/ignoring voice message with empty contents; jid=");
                sb2.append(A02);
                sb2.append("; text=");
                sb2.append(stringExtra2);
                Log.w(sb2.toString());
                return;
            }
            C000200d.A0v("VoiceMessagingService/sending verified voice message (text); jid=", A02);
            this.A06.post(new Runnable() { // from class: X.1Jb
                {
                    VoiceMessagingService.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    VoiceMessagingService voiceMessagingService = VoiceMessagingService.this;
                    AbstractC005302j abstractC005302j = A02;
                    voiceMessagingService.A01.A0d(Collections.singletonList(abstractC005302j), stringExtra2, null, null, null, false, false);
                }
            });
        }
    }

    @Override // com.google.android.search.verification.client.SearchActionVerificationClientService
    public void postForegroundNotification() {
        C005402l A00 = C0DU.A00(this);
        A00.A0J = "other_notifications@1";
        A00.A0A(getString(R.string.sending_message));
        A00.A09 = PendingIntent.getActivity(this, 1, new Intent(this, HomeActivity.class), 0);
        A00.A03 = -2;
        A00.A07.icon = R.drawable.notifybar;
        Notification A01 = A00.A01();
        StringBuilder sb = new StringBuilder("VoiceMessagingService/posting assistant notif:");
        sb.append(A01);
        Log.i(sb.toString());
        startForeground(19, A01);
    }
}
