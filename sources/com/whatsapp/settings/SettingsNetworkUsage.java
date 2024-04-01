package com.whatsapp.settings;

import X.AnonymousClass024;
import X.AnonymousClass029;
import X.C000700j;
import X.C002301c;
import X.C002501g;
import X.C019208x;
import X.C02180Ae;
import X.C0EL;
import X.C0U1;
import X.C2PM;
import X.C40931t6;
import X.C469829b;
import X.HandlerC05430Os;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I0_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.Statistics$Data;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.settings.SettingsNetworkUsage;
import com.whatsapp.util.Log;
import java.text.NumberFormat;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public class SettingsNetworkUsage extends C2PM {
    public Handler A00;
    public C0EL A01;
    public C469829b A02;
    public C002301c A03;
    public TimerTask A04;
    public final Timer A05 = new Timer("refresh-network-usage");

    public final void A1P(long j, long j2, long j3, int i, int i2, int i3) {
        TextView textView = (TextView) findViewById(i);
        String A0l = C02180Ae.A0l(this.A03, j);
        textView.setText(A0l);
        textView.setContentDescription(getString(R.string.settings_data_network_usage_amount_sent, this.A03.A0E(A0l)));
        TextView textView2 = (TextView) findViewById(i2);
        String A0l2 = C02180Ae.A0l(this.A03, j2);
        textView2.setText(A0l2);
        textView2.setContentDescription(getString(R.string.settings_data_network_usage_amount_received, this.A03.A0E(A0l2)));
        ((RoundCornerProgressBar) findViewById(i3)).setProgress(j3 > 0 ? (int) ((((float) (j + j2)) * 100.0f) / ((float) j3)) : 0);
    }

    public final void A1Q(boolean z) {
        String string;
        if (z) {
            C0EL c0el = this.A01;
            if (c0el != null) {
                Log.i("statistics/reset");
                HandlerC05430Os handlerC05430Os = c0el.A00;
                C000700j.A07(handlerC05430Os != null);
                handlerC05430Os.sendEmptyMessage(9);
            } else {
                throw null;
            }
        }
        Statistics$Data A01 = this.A01.A01();
        NumberFormat numberFormat = NumberFormat.getInstance(this.A03.A0I());
        long j = A01.tx_media_bytes + A01.tx_message_service_bytes + A01.tx_voip_bytes + A01.tx_google_drive_bytes + A01.tx_status_bytes;
        long j2 = A01.rx_media_bytes + A01.rx_message_service_bytes + A01.rx_voip_bytes + A01.rx_google_drive_bytes + A01.rx_status_bytes;
        long j3 = j + j2;
        C40931t6 A0c = C02180Ae.A0c(this.A03, j3);
        StringBuilder sb = new StringBuilder();
        String str = A0c.A01;
        sb.append(str);
        sb.append(A0c.A02);
        String str2 = A0c.A00;
        sb.append(str2);
        SpannableString spannableString = new SpannableString(sb.toString());
        if (!str.isEmpty()) {
            spannableString.setSpan(new AbsoluteSizeSpan(16, true), 0, str.length(), 33);
        }
        if (!str2.isEmpty()) {
            spannableString.setSpan(new AbsoluteSizeSpan(16, true), spannableString.length() - str2.length(), spannableString.length(), 33);
        }
        ((TextView) findViewById(R.id.total_network_usage)).setText(spannableString);
        ((TextView) findViewById(R.id.total_network_usage_sent)).setText(C02180Ae.A0l(this.A03, j));
        ((TextView) findViewById(R.id.total_network_usage_received)).setText(C02180Ae.A0l(this.A03, j2));
        A1P(A01.tx_voip_bytes, A01.rx_voip_bytes, j3, R.id.call_data_sent, R.id.call_data_received, R.id.calls_data_bar);
        long j4 = A01.tx_voip_calls;
        long j5 = A01.rx_voip_calls;
        C002301c c002301c = this.A03;
        ((TextView) findViewById(R.id.calls_info)).setText(AnonymousClass024.A0B(c002301c, c002301c.A0A(R.plurals.settings_network_usage_calls_info_outgoing, j4, numberFormat.format(j4)), this.A03.A0A(R.plurals.settings_network_usage_calls_info_incoming, j5, numberFormat.format(j5))));
        A1P(A01.tx_media_bytes, A01.rx_media_bytes, j3, R.id.media_data_sent, R.id.media_data_received, R.id.media_data_bar);
        long j6 = A01.tx_google_drive_bytes;
        long j7 = A01.rx_google_drive_bytes;
        if (!this.A02.A07() && j6 <= 0 && j7 <= 0) {
            findViewById(R.id.gdrive_row).setVisibility(8);
        } else {
            A1P(j6, j7, j3, R.id.gdrive_data_sent, R.id.gdrive_data_received, R.id.gdrive_data_bar);
        }
        A1P(A01.tx_message_service_bytes, A01.rx_message_service_bytes, j3, R.id.messages_data_sent, R.id.messages_data_received, R.id.messages_data_bar);
        long j8 = A01.tx_text_msgs + A01.tx_media_msgs;
        long j9 = A01.rx_text_msgs + A01.rx_media_msgs;
        C002301c c002301c2 = this.A03;
        ((TextView) findViewById(R.id.messages_info)).setText(AnonymousClass024.A0B(c002301c2, c002301c2.A0A(R.plurals.settings_network_usage_messages_info_sent, j8, numberFormat.format(j8)), this.A03.A0A(R.plurals.settings_network_usage_messages_info_received, j9, numberFormat.format(j9))));
        A1P(A01.tx_status_bytes, A01.rx_status_bytes, j3, R.id.status_data_sent, R.id.status_data_received, R.id.status_data_bar);
        long j10 = A01.tx_statuses;
        long j11 = A01.rx_statuses;
        C002301c c002301c3 = this.A03;
        ((TextView) findViewById(R.id.status_info)).setText(AnonymousClass024.A0B(c002301c3, c002301c3.A0A(R.plurals.settings_network_usage_status_info_sent, j10, numberFormat.format(j10)), this.A03.A0A(R.plurals.settings_network_usage_status_info_received, j11, numberFormat.format(j11))));
        A1P(A01.tx_roaming_bytes, A01.rx_roaming_bytes, j3, R.id.roaming_data_sent, R.id.roaming_data_received, R.id.roaming_data_bar);
        long j12 = A01.last_reset;
        if (j12 != Long.MIN_VALUE) {
            findViewById(R.id.last_updated_date).setVisibility(0);
            string = getString(R.string.network_usage_last_reset_time, AnonymousClass029.A0h(this.A03, j12));
            ((TextView) findViewById(R.id.last_updated_date)).setText(getString(R.string.settings_network_usages_time_since_refresh_date, C002501g.A0D(this.A03, j12)));
        } else {
            string = getString(R.string.network_usage_last_reset_time, getString(R.string.never));
            findViewById(R.id.last_updated_date).setVisibility(8);
        }
        ((TextView) findViewById(R.id.last_usage_reset)).setText(string);
    }

    public void lambda$onCreate$2343$SettingsNetworkUsage(View view) {
        ResetUsageConfirmationDialog resetUsageConfirmationDialog = new ResetUsageConfirmationDialog();
        resetUsageConfirmationDialog.A0P(new Bundle());
        AUh(resetUsageConfirmationDialog);
    }

    @Override // X.C2PM, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.settings_network_usage);
        setContentView(R.layout.preferences_network_usage);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            findViewById(R.id.reset_network_usage_row).setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 37));
            this.A00 = new Handler(Looper.myLooper());
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A05.cancel();
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        this.A04.cancel();
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        TimerTask timerTask = new TimerTask() { // from class: X.3WH
            {
                SettingsNetworkUsage.this = this;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                SettingsNetworkUsage settingsNetworkUsage = SettingsNetworkUsage.this;
                settingsNetworkUsage.A00.post(new RunnableEBaseShape9S0100000_I1_1(settingsNetworkUsage, 16));
            }
        };
        this.A04 = timerTask;
        this.A05.scheduleAtFixedRate(timerTask, 0L, 1000L);
    }

    /* loaded from: classes2.dex */
    public class ResetUsageConfirmationDialog extends Hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog {
        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            C019208x c019208x = new C019208x(A00());
            c019208x.A02(R.string.settings_network_usage_reset_prompt);
            c019208x.A06(R.string.reset, new DialogInterface.OnClickListener() { // from class: X.3WC
                {
                    SettingsNetworkUsage.ResetUsageConfirmationDialog.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    SettingsNetworkUsage settingsNetworkUsage = (SettingsNetworkUsage) SettingsNetworkUsage.ResetUsageConfirmationDialog.this.A09();
                    if (settingsNetworkUsage != null) {
                        settingsNetworkUsage.A1Q(true);
                    }
                }
            });
            c019208x.A04(R.string.cancel, null);
            return c019208x.A00();
        }
    }
}
