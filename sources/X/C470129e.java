package X;

import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.util.Log;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.29e */
/* loaded from: classes2.dex */
public final class C470129e implements InterfaceC470229f, InterfaceC001000m {
    public static volatile C470129e A0M;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public BroadcastReceiver A04;
    public BroadcastReceiver A05;
    public BroadcastReceiver A06;
    public BroadcastReceiver A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final C469829b A0C;
    public final C000800k A0D;
    public final C0E7 A0E;
    public final C001200o A0F;
    public final C005102h A0G;
    public final C000500h A0H;
    public final C002301c A0I;
    public final InterfaceC002901k A0J;
    public final AtomicReference A0K = new AtomicReference(10);
    public volatile Notification A0L;

    @Override // X.InterfaceC470229f
    public void AGu(boolean z) {
    }

    @Override // X.InterfaceC470229f
    public void AMC(boolean z) {
    }

    @Override // X.InterfaceC470229f
    public void AMD(long j, long j2) {
    }

    @Override // X.InterfaceC470229f
    public void AME() {
    }

    @Override // X.InterfaceC470229f
    public void AQ8() {
    }

    public C470129e(C001200o c001200o, InterfaceC002901k interfaceC002901k, C002301c c002301c, C0E7 c0e7, C000500h c000500h, C005102h c005102h, C000800k c000800k, C469829b c469829b) {
        this.A0F = c001200o;
        this.A0J = interfaceC002901k;
        this.A0I = c002301c;
        this.A0E = c0e7;
        this.A0H = c000500h;
        this.A0G = c005102h;
        this.A0D = c000800k;
        this.A0C = c469829b;
    }

    public final PendingIntent A00(String str) {
        Intent intent = new Intent(str);
        intent.setPackage("com.whatsapp");
        return PendingIntent.getBroadcast(this.A0F.A00, 0, intent, 0);
    }

    public final C005402l A01() {
        C001200o c001200o = this.A0F;
        C005402l A00 = C0DU.A00(c001200o.A00);
        A00.A0J = "chat_history_backup@1";
        Application application = c001200o.A00;
        A00.A09 = PendingIntent.getActivity(application, 0, new Intent(application, SettingsGoogleDrive.class), 0);
        A00.A07.icon = R.drawable.notifybar;
        if (Build.VERSION.SDK_INT >= 21) {
            A00.A06 = 1;
        }
        return A00;
    }

    public void A02() {
        this.A0L = null;
        this.A0G.A05(null, 5);
    }

    public final void A03(String str, String str2, int i, int i2, boolean z, boolean z2, C07940aL c07940aL) {
        this.A08 = str2;
        if (this.A09) {
            A02();
        }
        C005402l A01 = A01();
        if (i == 1) {
            A01.A05 = 0;
            A01.A04 = 0;
            A01.A0T = false;
        } else if (i == 2) {
            A01.A05 = 100;
            A01.A04 = i2;
            A01.A0T = true;
        } else if (i == 3) {
            A01.A05 = 100;
            A01.A04 = i2;
            A01.A0T = false;
        } else {
            throw new IllegalStateException(C000200d.A0D("unexpected value for progress bar style", i));
        }
        A01.A05(16, z2);
        A01.A05(2, z);
        A01.A0A(str);
        A01.A09(str2);
        this.A0A = z;
        this.A09 = c07940aL != null;
        if (c07940aL != null) {
            A01.A0N.add(c07940aL);
        }
        Notification A012 = A01.A01();
        this.A0L = A012;
        this.A0G.A03(null, 5, A012);
    }

    @Override // X.InterfaceC470229f
    public void AHk() {
        A02();
    }

    @Override // X.InterfaceC470229f
    public void AHl(boolean z) {
        if (((Number) this.A0K.getAndSet(23)).intValue() == 23) {
            return;
        }
        Log.i("gdrive-notification-manager/backup-end");
        this.A00 = 0;
        C002301c c002301c = this.A0I;
        int i = R.string.gdrive_backup_notification_title_finished_failed;
        if (z) {
            i = R.string.gdrive_backup_notification_title_finished_success;
        }
        A03(c002301c.A06(i), c002301c.A06(R.string.gdrive_backup_notification_string_finished), 1, -1, false, true, null);
    }

    @Override // X.InterfaceC470229f
    public void AHm(long j, long j2) {
        int i;
        Log.i("gdrive-notification-manager/backup-paused-for-data-connection");
        if (((Number) this.A0K.getAndSet(17)).intValue() == 17) {
            return;
        }
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        C002301c c002301c = this.A0I;
        A03(c002301c.A06(R.string.gdrive_backup_title_paused), c002301c.A06(R.string.gdrive_media_restore_notification_string_paused_for_data_connection), 3, i, false, false, null);
    }

    @Override // X.InterfaceC470229f
    public void AHn(long j, long j2) {
        int i;
        Log.i("gdrive-notification-manager/backup-paused-for-low-battery");
        if (((Number) this.A0K.getAndSet(18)).intValue() == 18) {
            return;
        }
        if (this.A05 == null) {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: X.2hP
                {
                    C470129e.this = this;
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Log.i("gdrive-notification-manager/user-decided-to-restore-over-low-battery");
                    C470129e c470129e = C470129e.this;
                    C469829b c469829b = c470129e.A0C;
                    c469829b.A08 = true;
                    c469829b.A05(c469829b.A0N.A00);
                    c469829b.A02();
                    c470129e.A0F.A00.unregisterReceiver(this);
                    c470129e.A02();
                }
            };
            this.A05 = broadcastReceiver;
            this.A0F.A00.registerReceiver(broadcastReceiver, new IntentFilter("enable_backup_over_low_battery"));
        }
        C002301c c002301c = this.A0I;
        C07940aL c07940aL = new C07940aL(R.drawable.ic_action_refresh, c002301c.A06(R.string.gdrive_media_restore_notification_resume_now), A00("enable_backup_over_low_battery"));
        if (j2 > 0) {
            i = (int) ((100 * j) / j2);
        } else {
            i = -1;
        }
        A03(c002301c.A06(R.string.gdrive_backup_title_paused), c002301c.A06(R.string.gdrive_media_restore_notification_string_paused_for_battery), 3, i, false, false, c07940aL);
    }

    @Override // X.InterfaceC470229f
    public void AHo(long j, long j2) {
        int i;
        if (((Number) this.A0K.getAndSet(20)).intValue() == 20) {
            return;
        }
        Log.i("gdrive-notification-manager/backup-paused-for-sdcard-missing");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        C002301c c002301c = this.A0I;
        A03(c002301c.A06(R.string.gdrive_backup_title_paused), c002301c.A06(R.string.msg_store_backup_skipped_due_to_missing_sdcard_title), 3, i, false, false, null);
    }

    @Override // X.InterfaceC470229f
    public void AHp(long j, long j2) {
        int i;
        if (((Number) this.A0K.getAndSet(19)).intValue() == 19) {
            return;
        }
        Log.i("gdrive-notification-manager/backup-paused-for-sdcard-unmounted");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        C002301c c002301c = this.A0I;
        A03(c002301c.A06(R.string.gdrive_backup_title_paused), c002301c.A06(R.string.msg_store_backup_skipped_due_to_unmounted_sdcard_title), 3, i, false, false, null);
    }

    @Override // X.InterfaceC470229f
    public void AHq(long j, long j2) {
        int i;
        if (((Number) this.A0K.getAndSet(16)).intValue() == 16) {
            return;
        }
        Log.i("gdrive-notification-manager/backup-paused-wifi-unavailable");
        if (this.A04 == null) {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: X.2hQ
                {
                    C470129e.this = this;
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Log.i("gdrive-notification-manager/user-decided-to-backup-over-data-connection");
                    C470129e c470129e = C470129e.this;
                    C001200o c001200o = c470129e.A0F;
                    Intent intent2 = new Intent(c001200o.A00, SettingsGoogleDrive.class);
                    intent2.setAction("action_perform_backup_over_cellular");
                    intent2.setFlags(335544320);
                    c001200o.A00.startActivity(intent2);
                    c001200o.A00.unregisterReceiver(this);
                    c470129e.A02();
                }
            };
            this.A04 = broadcastReceiver;
            this.A0F.A00.registerReceiver(broadcastReceiver, new IntentFilter("enable_backup_over_cellular"));
        }
        C07940aL c07940aL = this.A0E.A03(true) == 2 ? new C07940aL(R.drawable.ic_action_refresh, this.A0I.A06(R.string.gdrive_media_restore_notification_resume_now), A00("enable_backup_over_cellular")) : null;
        if (j2 > 0) {
            i = (int) ((100 * j) / j2);
        } else {
            i = -1;
        }
        C002301c c002301c = this.A0I;
        A03(c002301c.A06(R.string.gdrive_backup_title_paused), c002301c.A06(R.string.gdrive_media_restore_notification_string_paused_for_wifi), 3, i, false, false, c07940aL);
    }

    @Override // X.InterfaceC470229f
    public void AHr(int i) {
        AtomicReference atomicReference = this.A0K;
        boolean z = ((Number) atomicReference.get()).intValue() != 12;
        if (((Number) atomicReference.getAndSet(12)).intValue() != 12 || System.currentTimeMillis() - this.A03 >= 200) {
            this.A03 = System.currentTimeMillis();
            C002301c c002301c = this.A0I;
            String A06 = c002301c.A06(R.string.gdrive_backup_title);
            if (i >= 0 || z) {
                A03(A06, c002301c.A0D(R.string.gdrive_backup_notification_string_preparation_message_with_percentage_placeholder, c002301c.A0H().format(i / 100.0d)), 2, -1, true, false, null);
            }
        }
    }

    @Override // X.InterfaceC470229f
    public void AHs() {
        if (((Number) this.A0K.getAndSet(11)).intValue() == 11) {
            return;
        }
        Log.i("gdrive-notification-manager/backup-prep-start");
        C002301c c002301c = this.A0I;
        A03(c002301c.A06(R.string.gdrive_backup_title), c002301c.A06(R.string.gdrive_backup_notification_string_preparation_message), 2, -1, true, false, null);
    }

    @Override // X.InterfaceC470229f
    public void AHt(long j, long j2) {
        int i;
        AtomicReference atomicReference = this.A0K;
        boolean z = ((Number) atomicReference.get()).intValue() != 14;
        if (((Number) atomicReference.getAndSet(14)).intValue() != 14 || System.currentTimeMillis() - this.A03 >= 200) {
            this.A03 = System.currentTimeMillis();
            if (j2 > 0) {
                i = (int) ((100 * j) / j2);
            } else {
                i = 0;
            }
            if (i - this.A00 > 0 || z) {
                Log.i(String.format(Locale.ENGLISH, "gdrive-notification-manager/backup-progress %d/%d (%d)", Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
                this.A00 = i;
                C002301c c002301c = this.A0I;
                String A06 = c002301c.A06(R.string.gdrive_backup_title);
                String A0D = c002301c.A0D(R.string.settings_gdrive_backup_progress_message_with_percentage, C02180Ae.A0k(c002301c, j), C02180Ae.A0k(c002301c, j2), c002301c.A0H().format(i / 100.0d));
                if (A0D.equals(this.A08)) {
                    return;
                }
                A03(A06, A0D, 3, i, true, false, null);
            }
        }
    }

    @Override // X.InterfaceC470229f
    public void AHu() {
        this.A0K.getAndSet(13);
    }

    @Override // X.InterfaceC001000m
    public void AIx(C05050Nc c05050Nc) {
        this.A0J.AS1(new RunnableEBaseShape0S0100000_I0_0(this, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC470229f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AK1(int r19, android.os.Bundle r20) {
        /*
            r18 = this;
            r0 = 10
            r3 = r19
            if (r3 != r0) goto L7
            return
        L7:
            r10 = r18
            java.util.concurrent.atomic.AtomicReference r2 = r10.A0K
            r1 = 15
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r2.getAndSet(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r1) goto L1e
            return
        L1e:
            java.lang.String r0 = "gdrive-notification-manager/backup-error/"
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            java.lang.String r0 = X.C40061rW.A04(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            boolean r0 = r10.A0B
            r5 = 1
            if (r0 == 0) goto L57
            java.lang.String r0 = "gdrive-notification-manager/backup-error/backup-user-initiated/true"
            com.whatsapp.util.Log.i(r0)
        L3c:
            X.01c r1 = r10.A0I
            r0 = 2131887585(0x7f1205e1, float:1.9409781E38)
            java.lang.String r11 = r1.A06(r0)
            r0 = 2131887582(0x7f1205de, float:1.9409775E38)
            java.lang.String r12 = r1.A06(r0)
            r13 = 1
            r14 = -1
            r15 = 0
            r17 = 0
            r16 = r13
            r10.A03(r11, r12, r13, r14, r15, r16, r17)
        L56:
            return
        L57:
            X.00h r4 = r10.A0H
            int r7 = r4.A03()
            r8 = 5184000000(0x134fd9000, double:2.561236308E-314)
            r3 = 2
            if (r7 == 0) goto Ld0
            if (r7 == r5) goto Lcb
            if (r7 == r3) goto Lc7
            r0 = 3
            if (r7 == r0) goto L74
            r0 = 4
            if (r7 == r0) goto Ld0
            java.lang.String r0 = "gdrive-notification-manager/backup-error/unexpected-frequency/"
            X.C000200d.A0p(r0, r7)
        L74:
            android.content.SharedPreferences r2 = r4.A00
            java.lang.String r1 = "gdrive_successive_backup_failed_count"
            r0 = 0
            int r6 = r2.getInt(r1, r0)
            int r0 = r6 + 1
            int r0 = r0 % r3
            r1 = 1
            if (r0 == 0) goto Lc5
            r1 = 0
            java.lang.String r0 = r4.A0F()
            if (r0 == 0) goto Lc0
            long r3 = r4.A0A(r0)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r3
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto L98
            r5 = 0
        L98:
            java.lang.String r0 = "gdrive-notification-manager/backup-error/frequency="
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            java.lang.String r0 = X.C40061rW.A05(r7)
            r1.append(r0)
            java.lang.String r0 = "/success-backup-fail-count="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "/show-notification="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            if (r5 == 0) goto L56
            goto L3c
        Lc0:
            java.lang.String r0 = "gdrive-notification-manager/backup-error/google-account-is-null/unexpected"
            com.whatsapp.util.Log.e(r0)
        Lc5:
            r5 = r1
            goto L98
        Lc7:
            r8 = 1209600000(0x48190800, double:5.97621805E-315)
            goto L74
        Lcb:
            r3 = 5
            r8 = 432000000(0x19bfcc00, double:2.13436359E-315)
            goto L74
        Ld0:
            r3 = 1
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C470129e.AK1(int, android.os.Bundle):void");
    }

    @Override // X.InterfaceC470229f
    public void AK2(int i, Bundle bundle) {
        if (i == 10 || ((Number) this.A0K.getAndSet(27)).intValue() == 27) {
            return;
        }
        StringBuilder A0P = C000200d.A0P("gdrive-notification-manager/media-restore-error/");
        A0P.append(C40061rW.A04(i));
        Log.i(A0P.toString());
        C002301c c002301c = this.A0I;
        A03(c002301c.A06(R.string.gdrive_media_restore_title_failed), c002301c.A06(R.string.gdrive_backup_notification_string_finished), 1, -1, false, true, null);
    }

    @Override // X.InterfaceC470229f
    public void AK3(int i, Bundle bundle) {
        StringBuilder A0P = C000200d.A0P("gdrive-notification-manager/msgstore-restore-error/");
        A0P.append(C40061rW.A04(i));
        Log.i(A0P.toString());
    }

    @Override // X.InterfaceC470229f
    public void ALq() {
        A02();
    }

    @Override // X.InterfaceC470229f
    public void ALr(boolean z, long j, long j2) {
        String A0D;
        if (((Number) this.A0K.getAndSet(33)).intValue() != 33) {
            StringBuilder A0P = C000200d.A0P("gdrive-notification-manager/restore-end/");
            A0P.append(z ? "success" : "failed");
            A0P.append(" total: ");
            A0P.append(j2);
            A0P.append(" failed: ");
            A0P.append(j);
            Log.i(A0P.toString());
        }
        if (j2 == 0) {
            A02();
            return;
        }
        C002301c c002301c = this.A0I;
        String A06 = c002301c.A06(R.string.gdrive_media_restore_title_finished);
        if (j > 0) {
            A0D = c002301c.A0D(R.string.gdrive_media_restore_notification_string_finished_with_failures, C02180Ae.A0k(c002301c, j2 - j), C02180Ae.A0k(c002301c, j));
        } else {
            A0D = c002301c.A0D(R.string.gdrive_media_restore_notification_string_finished_no_failures, C02180Ae.A0k(c002301c, j2));
        }
        A03(A06, A0D, 1, -1, false, true, null);
    }

    @Override // X.InterfaceC470229f
    public void ALs(long j, long j2) {
        int i;
        if (((Number) this.A0K.getAndSet(29)).intValue() == 29) {
            return;
        }
        Log.i("gdrive-notification-manager/restore-paused-data-unavailable");
        C002301c c002301c = this.A0I;
        String A06 = c002301c.A06(R.string.gdrive_media_restore_title_paused);
        String A062 = c002301c.A06(R.string.gdrive_media_restore_notification_string_paused_for_data_connection);
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        A03(A06, A062, 3, i, false, true, null);
    }

    @Override // X.InterfaceC470229f
    public void ALt(long j, long j2) {
        int i;
        if (((Number) this.A0K.getAndSet(30)).intValue() == 30) {
            return;
        }
        Log.i("gdrive-notification-manager/restore-paused-for-battery");
        if (this.A07 == null) {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: X.2hR
                {
                    C470129e.this = this;
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Log.i("gdrive-notification-manager/user-decided-to-restore-over-low-battery");
                    C470129e c470129e = C470129e.this;
                    C469829b c469829b = c470129e.A0C;
                    c469829b.A08 = true;
                    c469829b.A05(c469829b.A0N.A00);
                    c469829b.A02();
                    c470129e.A0F.A00.unregisterReceiver(this);
                    c470129e.A02();
                }
            };
            this.A07 = broadcastReceiver;
            this.A0F.A00.registerReceiver(broadcastReceiver, new IntentFilter("enable_restore_over_low_battery"));
        }
        C002301c c002301c = this.A0I;
        C07940aL c07940aL = new C07940aL(R.drawable.ic_action_refresh, c002301c.A06(R.string.gdrive_media_restore_notification_resume_now), A00("enable_restore_over_low_battery"));
        String A06 = c002301c.A06(R.string.gdrive_media_restore_title_paused);
        String A062 = c002301c.A06(R.string.gdrive_media_restore_notification_string_paused_for_battery);
        if (j2 > 0) {
            i = (int) ((100 * j) / j2);
        } else {
            i = -1;
        }
        A03(A06, A062, 3, i, false, true, c07940aL);
    }

    @Override // X.InterfaceC470229f
    public void ALu(long j, long j2) {
        int i;
        if (((Number) this.A0K.getAndSet(32)).intValue() == 32) {
            return;
        }
        Log.i("gdrive-notification-manager/restore-paused-sdcard-missing");
        C002301c c002301c = this.A0I;
        String A06 = c002301c.A06(R.string.gdrive_media_restore_title_paused);
        String A062 = c002301c.A06(R.string.msg_store_backup_skipped_due_to_missing_sdcard_title);
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        A03(A06, A062, 3, i, false, true, null);
    }

    @Override // X.InterfaceC470229f
    public void ALv(long j, long j2) {
        int i;
        if (((Number) this.A0K.getAndSet(31)).intValue() == 31) {
            return;
        }
        Log.i("gdrive-notification-manager/restore-paused-sdcard-unmounted");
        A02();
        C002301c c002301c = this.A0I;
        String A06 = c002301c.A06(R.string.gdrive_media_restore_title_paused);
        String A062 = c002301c.A06(R.string.msg_store_backup_skipped_due_to_unmounted_sdcard_title);
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        A03(A06, A062, 3, i, false, true, null);
    }

    @Override // X.InterfaceC470229f
    public void ALw(long j, long j2) {
        int i;
        if (((Number) this.A0K.getAndSet(28)).intValue() == 28) {
            return;
        }
        Log.i("gdrive-notification-manager/restore-paused-wifi-unavailable");
        if (this.A06 == null) {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: X.2hS
                {
                    C470129e.this = this;
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Log.i("gdrive-notification-manager/user-decided-to-restore-over-data-connection");
                    C470129e c470129e = C470129e.this;
                    C001200o c001200o = c470129e.A0F;
                    Intent intent2 = new Intent(c001200o.A00, SettingsGoogleDrive.class);
                    intent2.setAction("action_perform_media_restore_over_cellular");
                    intent2.setFlags(335544320);
                    c001200o.A00.startActivity(intent2);
                    c001200o.A00.unregisterReceiver(this);
                    c470129e.A02();
                }
            };
            this.A06 = broadcastReceiver;
            this.A0F.A00.registerReceiver(broadcastReceiver, new IntentFilter("enable_restore_over_cellular"));
        }
        C07940aL c07940aL = this.A0E.A03(true) == 2 ? new C07940aL(R.drawable.ic_action_refresh, this.A0I.A06(R.string.gdrive_media_restore_notification_resume_now), A00("enable_restore_over_cellular")) : null;
        C002301c c002301c = this.A0I;
        String A06 = c002301c.A06(R.string.gdrive_media_restore_title_paused);
        String A062 = c002301c.A06(R.string.gdrive_media_restore_notification_string_paused_for_wifi);
        if (j2 > 0) {
            i = (int) ((100 * j) / j2);
        } else {
            i = -1;
        }
        A03(A06, A062, 3, i, false, true, c07940aL);
    }

    @Override // X.InterfaceC470229f
    public void ALx(int i) {
        C002301c c002301c = this.A0I;
        String A06 = c002301c.A06(R.string.gdrive_media_restore_title_running);
        AtomicReference atomicReference = this.A0K;
        if (((Number) atomicReference.get()).intValue() != 25 || System.currentTimeMillis() - this.A02 >= 200) {
            this.A02 = System.currentTimeMillis();
            boolean z = ((Number) atomicReference.getAndSet(25)).intValue() != 25;
            if (i > 0 || z) {
                A03(A06, c002301c.A0D(R.string.gdrive_media_restore_notification_string_preparation_message_with_percentage_placeholder, c002301c.A0H().format(i / 100.0d)), 2, i, true, false, null);
            }
        }
    }

    @Override // X.InterfaceC470229f
    public void ALy() {
        C002301c c002301c = this.A0I;
        String A06 = c002301c.A06(R.string.gdrive_media_restore_title_running);
        if (((Number) this.A0K.getAndSet(24)).intValue() != 24) {
            Log.i("gdrive-notification-manager/restore-prep-start");
        }
        A03(A06, c002301c.A06(R.string.gdrive_media_restore_notification_string_preparation_message), 2, -1, true, false, null);
    }

    @Override // X.InterfaceC470229f
    public synchronized void ALz(long j, long j2, long j3) {
        int i;
        String A0D;
        String A06 = this.A0I.A06(R.string.gdrive_media_restore_title_running);
        if (((Integer) this.A0K.get()).intValue() != 26 || System.currentTimeMillis() - this.A03 >= 200) {
            this.A03 = System.currentTimeMillis();
            if (((Integer) this.A0K.getAndSet(26)).intValue() != 26) {
                StringBuilder sb = new StringBuilder();
                sb.append("gdrive-notification-manager/restore-progress ");
                sb.append(j);
                sb.append("/");
                sb.append(j3);
                sb.append(" bytes (");
                sb.append(j2);
                sb.append(" bytes failed).");
                Log.i(sb.toString());
            }
            if (j3 <= 0) {
                i = -1;
            } else {
                i = (int) ((100 * j) / j3);
            }
            this.A01 = i;
            if (j2 > 0) {
                C002301c c002301c = this.A0I;
                Object[] objArr = new Object[3];
                objArr[0] = C02180Ae.A0k(this.A0I, j);
                objArr[1] = C02180Ae.A0k(this.A0I, j3);
                NumberFormat A0H = this.A0I.A0H();
                double d = this.A01;
                Double.isNaN(d);
                objArr[2] = A0H.format(d / 100.0d);
                A0D = c002301c.A0D(R.string.gdrive_media_restore_notification_string_with_failures_and_percentage, objArr);
            } else {
                C002301c c002301c2 = this.A0I;
                Object[] objArr2 = new Object[3];
                objArr2[0] = C02180Ae.A0k(this.A0I, j);
                objArr2[1] = C02180Ae.A0k(this.A0I, j3);
                NumberFormat A0H2 = this.A0I.A0H();
                double d2 = this.A01;
                Double.isNaN(d2);
                objArr2[2] = A0H2.format(d2 / 100.0d);
                A0D = c002301c2.A0D(R.string.gdrive_media_restore_notification_string_no_failures_with_placeholder, objArr2);
            }
            if (!A0D.equals(this.A08)) {
                A03(A06, A0D, 3, this.A01, true, false, null);
            }
        }
    }

    @Override // X.InterfaceC470229f
    public void AOM() {
        if (((Number) this.A0K.getAndSet(21)).intValue() == 21) {
            return;
        }
        Log.i("gdrive-notification-manager/backup-scrub-start");
        C002301c c002301c = this.A0I;
        A03(c002301c.A06(R.string.gdrive_backup_title), c002301c.A06(R.string.settings_gdrive_backup_finishing_message), 2, -1, true, false, null);
    }
}
