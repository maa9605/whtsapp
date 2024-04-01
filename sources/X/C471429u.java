package X;

import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;

/* renamed from: X.29u */
/* loaded from: classes2.dex */
public class C471429u implements InterfaceC470229f {
    public int A00;
    public int A01;
    public long A02 = -1;
    public boolean A03;
    public final /* synthetic */ ConversationsFragment A04;

    @Override // X.InterfaceC470229f
    public final void AGu(boolean z) {
    }

    @Override // X.InterfaceC470229f
    public final void AHk() {
    }

    @Override // X.InterfaceC470229f
    public final void AHl(boolean z) {
    }

    @Override // X.InterfaceC470229f
    public final void AHm(long j, long j2) {
    }

    @Override // X.InterfaceC470229f
    public final void AHn(long j, long j2) {
    }

    @Override // X.InterfaceC470229f
    public final void AHo(long j, long j2) {
    }

    @Override // X.InterfaceC470229f
    public final void AHp(long j, long j2) {
    }

    @Override // X.InterfaceC470229f
    public final void AHq(long j, long j2) {
    }

    @Override // X.InterfaceC470229f
    public final void AHr(int i) {
    }

    @Override // X.InterfaceC470229f
    public final void AHs() {
    }

    @Override // X.InterfaceC470229f
    public final void AHt(long j, long j2) {
    }

    @Override // X.InterfaceC470229f
    public final void AHu() {
    }

    @Override // X.InterfaceC470229f
    public final void AK1(int i, Bundle bundle) {
    }

    @Override // X.InterfaceC470229f
    public final void AK3(int i, Bundle bundle) {
    }

    @Override // X.InterfaceC470229f
    public final void AMC(boolean z) {
    }

    @Override // X.InterfaceC470229f
    public final void AMD(long j, long j2) {
    }

    @Override // X.InterfaceC470229f
    public final void AME() {
    }

    @Override // X.InterfaceC470229f
    public final void AOM() {
    }

    @Override // X.InterfaceC470229f
    public final void AQ8() {
    }

    public C471429u(ConversationsFragment conversationsFragment) {
        this.A04 = conversationsFragment;
    }

    public final void A00(int i, String str, String str2, int i2, boolean z) {
        ActivityC02330At A09;
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0W() && (A09 = conversationsFragment.A09()) != null) {
            if (i == 1) {
                if (this.A00 != 1 && !A09.isFinishing()) {
                    conversationsFragment.A0I.A02.post(new RunnableEBaseShape2S0100000_I0_2(this, 16));
                    this.A00 = 1;
                }
                if (!A09.isFinishing()) {
                    conversationsFragment.A0I.A02.post(new RunnableEBaseShape0S2100000_I0(this, str2, str, 3));
                }
            } else if (i == 2) {
                throw new IllegalStateException("unexpected state");
            } else {
                if (i != 3) {
                    if (i == 4) {
                        if (str2 != null) {
                            if (this.A00 != 4) {
                                Log.i("conversations-gdrive-observer/set-message/show-indeterminate");
                                if (!A09.isFinishing()) {
                                    conversationsFragment.A0I.A02.post(new RunnableEBaseShape2S0100000_I0_2(this, 17));
                                    this.A00 = 4;
                                }
                            }
                            if (!A09.isFinishing()) {
                                conversationsFragment.A0I.A02.post(new RunnableEBaseShape0S2100000_I0(this, str2, str, 2));
                            }
                        } else {
                            throw null;
                        }
                    }
                } else if (str2 != null) {
                    if (this.A00 != 3 && !A09.isFinishing()) {
                        conversationsFragment.A0I.A02.post(new RunnableEBaseShape2S0100000_I0_2(this, 18));
                        this.A00 = 3;
                    }
                    if (!A09.isFinishing()) {
                        conversationsFragment.A0I.A02.post(new RunnableC59512ss(this, str2, i2, str));
                    }
                } else {
                    throw null;
                }
            }
            if (z == this.A03 || A09.isFinishing()) {
                return;
            }
            conversationsFragment.A0I.A02.post(new RunnableEBaseShape0S0110000_I0(this, z, 6));
            this.A03 = z;
        }
    }

    @Override // X.InterfaceC470229f
    public void AK2(int i, Bundle bundle) {
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0W()) {
            this.A01 = 2;
            if (i != 10) {
                StringBuilder A0P = C000200d.A0P("conversations-gdrive-observer/error-during-restore/");
                A0P.append(C40061rW.A04(i));
                Log.i(A0P.toString());
                A00(1, conversationsFragment.A0F(R.string.gdrive_media_restore_title_failed), conversationsFragment.A0F(R.string.gdrive_backup_notification_string_finished), 0, false);
                conversationsFragment.A0R.A02();
            }
        }
    }

    @Override // X.InterfaceC470229f
    public void ALq() {
        ActivityC02330At A09;
        Log.i("conversations-gdrive-observer/restore-cancelled");
        ConversationsFragment conversationsFragment = this.A04;
        if (!conversationsFragment.A0W() || (A09 = conversationsFragment.A09()) == null || A09.isFinishing()) {
            return;
        }
        conversationsFragment.A0I.A02.post(new RunnableEBaseShape1S0200000_I0_1(this, A09, 27));
    }

    @Override // X.InterfaceC470229f
    public void ALr(boolean z, long j, long j2) {
        ActivityC02330At A09;
        String string;
        C000200d.A1C("conversations-gdrive-observer/restore-end ", z);
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0W() && (A09 = conversationsFragment.A09()) != null) {
            this.A01 = 8;
            this.A02 = -1L;
            if (j > 0) {
                string = A09.getString(R.string.gdrive_media_restore_notification_string_finished_with_failures, C02180Ae.A0k(conversationsFragment.A0z, j2 - j), C02180Ae.A0k(conversationsFragment.A0z, j));
            } else {
                string = A09.getString(R.string.gdrive_media_restore_notification_string_finished_no_failures, C02180Ae.A0k(conversationsFragment.A0z, j2));
            }
            if (j2 > 0) {
                A00(3, A09.getString(R.string.gdrive_media_restore_title_finished), string, 100, false);
            } else if (j2 == 0) {
                Log.i("conversations-gdrive-observer/restore-end/nothing-to-restore");
                if (A09.isFinishing()) {
                    return;
                }
                conversationsFragment.A0I.A02.post(new RunnableEBaseShape1S0200000_I0_1(this, A09, 26));
            } else {
                StringBuilder A0S = C000200d.A0S("conversations-gdrive-observer/restore-end total: ", j2, " failed: ");
                A0S.append(j);
                A0S.append(" result: ");
                A0S.append(z);
                Log.e(A0S.toString());
            }
        }
    }

    @Override // X.InterfaceC470229f
    public void ALs(long j, long j2) {
        int i;
        Log.i("conversations-gdrive-observer/restore-paused/no-data-connection");
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0W()) {
            this.A01 = 4;
            String A0F = conversationsFragment.A0F(R.string.gdrive_media_restore_notification_string_paused_for_data_connection);
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            A00(3, conversationsFragment.A0F(R.string.gdrive_media_restore_title_paused), A0F, i, false);
        }
    }

    @Override // X.InterfaceC470229f
    public void ALt(long j, long j2) {
        int i;
        Log.i("conversations-gdrive-observer/restore-paused/low-battery");
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0W()) {
            this.A01 = 5;
            String A0F = conversationsFragment.A0F(R.string.gdrive_media_restore_notification_string_paused_for_battery);
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            A00(3, conversationsFragment.A0F(R.string.gdrive_media_restore_title_paused), A0F, i, false);
        }
    }

    @Override // X.InterfaceC470229f
    public void ALu(long j, long j2) {
        int i;
        Log.i("conversations-gdrive-observer/restore-paused/sdcard-missing");
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0W()) {
            this.A01 = 7;
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            A00(4, conversationsFragment.A0F(R.string.gdrive_media_restore_title_paused), conversationsFragment.A0F(R.string.gdrive_restore_error_sdcard_missing_summary), i, false);
        }
    }

    @Override // X.InterfaceC470229f
    public void ALv(long j, long j2) {
        int i;
        Log.i("conversations-gdrive-observer/restore-paused/sdcard-unmounted");
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0W()) {
            this.A01 = 6;
            String A0F = conversationsFragment.A0F(R.string.msg_store_backup_skipped_due_to_unmounted_sdcard_title);
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            A00(3, conversationsFragment.A0F(R.string.gdrive_media_restore_title_paused), A0F, i, false);
        }
    }

    @Override // X.InterfaceC470229f
    public void ALw(long j, long j2) {
        int i;
        Log.i("conversations-gdrive-observer/restore-paused/no-wifi");
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0W()) {
            this.A01 = 3;
            String A0F = conversationsFragment.A0F(R.string.gdrive_media_restore_notification_string_paused_for_wifi);
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            A00(3, conversationsFragment.A0F(R.string.gdrive_media_restore_title_paused), A0F, i, false);
        }
    }

    @Override // X.InterfaceC470229f
    public void ALx(int i) {
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0W() && i > 0) {
            this.A01 = 10;
            A00(4, conversationsFragment.A0F(R.string.gdrive_media_restore_title_running), conversationsFragment.A0G(R.string.gdrive_media_restore_notification_string_preparation_message_with_percentage_placeholder, conversationsFragment.A0z.A0H().format(i / 100.0d)), i, true);
        }
    }

    @Override // X.InterfaceC470229f
    public void ALy() {
        Log.i("conversations-gdrive-observer/restore-start");
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A0W()) {
            this.A01 = 9;
            A00(4, conversationsFragment.A0F(R.string.gdrive_media_restore_title_running), conversationsFragment.A0F(R.string.gdrive_media_restore_notification_string_preparation_message), -1, true);
        }
    }

    @Override // X.InterfaceC470229f
    public void ALz(long j, long j2, long j3) {
        ConversationsFragment conversationsFragment = this.A04;
        if (!conversationsFragment.A0W() || conversationsFragment.A09() == null) {
            return;
        }
        String A0k = C02180Ae.A0k(conversationsFragment.A0z, j);
        if (this.A01 == 1 && A0k.equals(C02180Ae.A0k(conversationsFragment.A0z, this.A02))) {
            return;
        }
        this.A02 = j;
        A00(3, conversationsFragment.A0F(R.string.gdrive_media_restore_title_running), conversationsFragment.A0G(R.string.gdrive_media_restore_notification_string_no_failures_with_placeholder, A0k, C02180Ae.A0k(conversationsFragment.A0z, j3), conversationsFragment.A0z.A0H().format(j / j3)), (int) ((j * 100) / j3), true);
        this.A01 = 1;
    }
}
