package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.format.DateUtils;
import android.widget.RemoteViews;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.service.BackgroundMediaControlService;

/* renamed from: X.1vi  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42421vi {
    public static volatile C42421vi A0F;
    public long A00;
    public C005402l A01;
    public AnonymousClass092 A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C02L A07;
    public final C0L7 A08;
    public final C05W A09;
    public final C018708s A0A;
    public final C0L5 A0B;
    public final C03120Eg A0C;
    public final C02E A0D;
    public final C005102h A0E;

    public C42421vi(C02L c02l, C0L5 c0l5, C0L7 c0l7, C05W c05w, C02E c02e, C018708s c018708s, C005102h c005102h, C03120Eg c03120Eg) {
        this.A07 = c02l;
        this.A0B = c0l5;
        this.A08 = c0l7;
        this.A09 = c05w;
        this.A0D = c02e;
        this.A0A = c018708s;
        this.A0E = c005102h;
        this.A0C = c03120Eg;
    }

    public static C42421vi A00() {
        if (A0F == null) {
            synchronized (C42421vi.class) {
                if (A0F == null) {
                    A0F = new C42421vi(C02L.A00(), C0L5.A01(), C0L7.A02(), C05W.A00(), C02E.A00(), C018708s.A00(), C005102h.A00(), C03120Eg.A00());
                }
            }
        }
        return A0F;
    }

    public void A01() {
        this.A06 = true;
        this.A0E.A05(null, 14);
    }

    public final void A02(Context context, RemoteViews remoteViews, boolean z) {
        String str = this.A03;
        if (str != null) {
            remoteViews.setTextViewText(R.id.ongoing_media_text, str);
        }
        Intent intent = new Intent(context, BackgroundMediaControlService.class);
        if (z) {
            intent.setAction("com.whatsapp.service.BackgroundMediaControlService.STOP");
            remoteViews.setImageViewResource(R.id.ongoing_media_control_btn, R.drawable.inline_audio_pause);
            remoteViews.setContentDescription(R.id.ongoing_media_control_btn, context.getString(R.string.pause));
        } else {
            intent.setAction("com.whatsapp.service.BackgroundMediaControlService.START");
            remoteViews.setImageViewResource(R.id.ongoing_media_control_btn, R.drawable.inline_audio_play);
            remoteViews.setContentDescription(R.id.ongoing_media_control_btn, context.getString(R.string.play));
        }
        this.A01.A05(2, z);
        this.A05 = z;
        remoteViews.setOnClickPendingIntent(R.id.ongoing_media_control_btn, PendingIntent.getService(context, 0, intent, 134217728));
        C005402l c005402l = this.A01;
        c005402l.A0E = remoteViews;
        this.A0E.A03(null, 14, c005402l.A01());
    }

    public void A03(Context context, C09560eJ c09560eJ) {
        boolean A0K = c09560eJ.A0K();
        if (!this.A04) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.ongoing_media_notification);
            int A03 = c09560eJ.A03();
            remoteViews.setProgressBar(R.id.ongoing_media_audio_seekbar, c09560eJ.A02, A03, false);
            remoteViews.setTextViewText(R.id.ongoing_media_timeLeft, DateUtils.formatElapsedTime(A03 / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
            A02(context, remoteViews, A0K);
            return;
        }
        if (!A0K ? !this.A05 : this.A05) {
            if (!this.A06) {
                return;
            }
        }
        A02(context, new RemoteViews(context.getPackageName(), (int) R.layout.ongoing_media_notification_talkback), A0K);
        this.A06 = false;
    }
}
