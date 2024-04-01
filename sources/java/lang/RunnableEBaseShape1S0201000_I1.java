package java.lang;

import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass092;
import X.AnonymousClass095;
import X.AnonymousClass097;
import X.C000200d;
import X.C000700j;
import X.C02180Ae;
import X.C0D6;
import X.C0DB;
import X.C0M6;
import X.C2L3;
import X.C2N6;
import X.C40061rW;
import X.C55762m9;
import X.C60052tq;
import X.C639131i;
import X.C68183Ij;
import X.C82233qB;
import X.C82343qM;
import X.C82363qO;
import X.C86873yf;
import X.C86883yg;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.facebook.redex.ViewOnClickEBaseShape0S0101000_I0;
import com.facebook.redex.ViewOnClickEBaseShape0S1100000_I0;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.backup.google.GoogleDriveRestoreAnimationView;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.Collection;

/* loaded from: classes2.dex */
public class RunnableEBaseShape1S0201000_I1 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public RunnableEBaseShape1S0201000_I1(Object obj, int i, Object obj2, int i2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        String string;
        long j;
        View.OnClickListener viewOnClickEBaseShape0S0100000_I0_0;
        switch (this.A03) {
            case 0:
                int i = this.A00;
                Bundle bundle = (Bundle) this.A02;
                RestoreFromBackupActivity restoreFromBackupActivity = ((C68183Ij) this.A01).A01;
                String str = null;
                if (restoreFromBackupActivity != null) {
                    C000700j.A01();
                    StringBuilder sb = new StringBuilder("gdrive-activity-observer/display-msgstore-download-error/");
                    sb.append(C40061rW.A04(i));
                    Log.i(sb.toString());
                    String string2 = restoreFromBackupActivity.getString(R.string.retry);
                    String A0F = ((ActivityC02290Ap) restoreFromBackupActivity).A0F.A0F();
                    if (A0F != null) {
                        switch (i) {
                            case 10:
                                return;
                            case GoogleMigrateImporterActivity.A0E /* 11 */:
                            case 21:
                                str = restoreFromBackupActivity.getString(R.string.gdrive_message_store_download_error_auth_failed_summary, string2);
                                viewOnClickEBaseShape0S0100000_I0_0 = new ViewOnClickEBaseShape0S1100000_I0(restoreFromBackupActivity, A0F, 1);
                                break;
                            case 12:
                                str = restoreFromBackupActivity.getString(R.string.gdrive_message_store_download_error_account_not_present_on_the_device_anymore_summary, A0F, string2);
                                viewOnClickEBaseShape0S0100000_I0_0 = new ViewOnClickEBaseShape0S1100000_I0(restoreFromBackupActivity, A0F, 0);
                                break;
                            case 13:
                                C000200d.A0p("gdrive-activity/display-msgstore-download-error/unexpected/", i);
                                viewOnClickEBaseShape0S0100000_I0_0 = null;
                                break;
                            case 14:
                            case 17:
                            case 18:
                            case 19:
                            case 22:
                            case 25:
                                str = restoreFromBackupActivity.getString(R.string.gdrive_message_store_download_error_not_reachable_summary, string2);
                                viewOnClickEBaseShape0S0100000_I0_0 = new ViewOnClickEBaseShape0S0100000_I0_0(restoreFromBackupActivity, 4);
                                break;
                            case 15:
                                long j2 = -1;
                                if (bundle != null) {
                                    j2 = bundle.getLong("msgstore_bytes_to_be_downloaded", -1L);
                                    if (j2 > 0) {
                                        str = restoreFromBackupActivity.getString(R.string.gdrive_message_store_download_error_internal_storage_full_summary, C02180Ae.A0k(((ActivityC02310Ar) restoreFromBackupActivity).A01, j2), string2);
                                        viewOnClickEBaseShape0S0100000_I0_0 = new ViewOnClickEBaseShape0S0101000_I0(restoreFromBackupActivity, i, 0);
                                        break;
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder("gdrive-activity/display-msgstore-download-error/");
                                sb2.append(i);
                                sb2.append(" message store download size: ");
                                sb2.append(j2);
                                C000200d.A1M(sb2, " is invalid");
                                str = restoreFromBackupActivity.getString(R.string.gdrive_message_store_download_error_internal_storage_full_summary_unknown_size, string2);
                                viewOnClickEBaseShape0S0100000_I0_0 = new ViewOnClickEBaseShape0S0101000_I0(restoreFromBackupActivity, i, 0);
                            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                            case C0M6.A01 /* 20 */:
                                throw new IllegalStateException("Unexpected error");
                            case 23:
                                viewOnClickEBaseShape0S0100000_I0_0 = null;
                                break;
                            case 24:
                                str = restoreFromBackupActivity.getString(R.string.gdrive_message_store_download_error_older_version_of_app);
                                viewOnClickEBaseShape0S0100000_I0_0 = new ViewOnClickEBaseShape0S0100000_I0_0(restoreFromBackupActivity, 5);
                                string2 = restoreFromBackupActivity.getString(R.string.upgrade);
                                break;
                            default:
                                StringBuilder A0P = C000200d.A0P("gdrive-activity/display-msgstore-download-error/unhandled-error/");
                                A0P.append(C40061rW.A04(i));
                                Log.e(A0P.toString());
                                viewOnClickEBaseShape0S0100000_I0_0 = null;
                                break;
                        }
                        if (!C40061rW.A0G(restoreFromBackupActivity)) {
                            restoreFromBackupActivity.A05.setIndeterminate(false);
                            restoreFromBackupActivity.A07.setText(R.string.activity_gdrive_restore_messages_paused_message);
                            GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = restoreFromBackupActivity.A0H;
                            if (googleDriveRestoreAnimationView == null) {
                                View findViewById = restoreFromBackupActivity.findViewById(R.id.google_drive_restore_animation_view);
                                if (findViewById == null) {
                                    throw null;
                                }
                                googleDriveRestoreAnimationView = (GoogleDriveRestoreAnimationView) findViewById;
                                restoreFromBackupActivity.A0H = googleDriveRestoreAnimationView;
                            }
                            googleDriveRestoreAnimationView.A01 = 4;
                            C55762m9 c55762m9 = googleDriveRestoreAnimationView.A0A;
                            if (c55762m9 != null) {
                                c55762m9.cancel();
                            }
                            View findViewById2 = restoreFromBackupActivity.findViewById(R.id.google_drive_backup_error_info_view);
                            if (findViewById2 != null) {
                                if (str != null) {
                                    findViewById2.setVisibility(0);
                                    View findViewById3 = restoreFromBackupActivity.findViewById(R.id.google_drive_backup_error_info);
                                    if (findViewById3 != null) {
                                        ((TextView) findViewById3).setText(str);
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    findViewById2.setVisibility(8);
                                }
                                C000200d.A0c(restoreFromBackupActivity, R.id.gdrive_restore_info, 0);
                                ((ActivityC02290Ap) restoreFromBackupActivity).A0F.A00.getBoolean("gdrive_last_restore_file_is_password_protected", false);
                                restoreFromBackupActivity.A03.setVisibility(8);
                                C000200d.A0c(restoreFromBackupActivity, R.id.restore_actions_view, 0);
                                C000200d.A0c(restoreFromBackupActivity, R.id.google_drive_media_will_be_downloaded_later_notice, 8);
                                restoreFromBackupActivity.A0H.setVisibility(8);
                                restoreFromBackupActivity.A05.setVisibility(8);
                                restoreFromBackupActivity.A07.setVisibility(8);
                                View findViewById4 = restoreFromBackupActivity.findViewById(R.id.dont_restore);
                                if (findViewById4 != null) {
                                    findViewById4.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(restoreFromBackupActivity, 1));
                                    restoreFromBackupActivity.A04.setText(string2);
                                    restoreFromBackupActivity.A04.setOnClickListener(viewOnClickEBaseShape0S0100000_I0_0);
                                    return;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        StringBuilder sb3 = new StringBuilder("gdrive-activity/display-msgstore-download-error failed to display error ");
                        sb3.append(i);
                        sb3.append(" since Activity is about to finish.");
                        Log.e(sb3.toString());
                        return;
                    }
                    throw null;
                }
                throw null;
            case 1:
                int i2 = this.A00;
                Bundle bundle2 = (Bundle) this.A02;
                StringBuilder A0P2 = C000200d.A0P("settings-gdrive-observer/backup-error/");
                A0P2.append(C40061rW.A04(i2));
                Log.i(A0P2.toString());
                SettingsGoogleDrive settingsGoogleDrive = ((C639131i) this.A01).A03;
                String str2 = null;
                if (settingsGoogleDrive != null) {
                    C000700j.A01();
                    switch (i2) {
                        case 10:
                            break;
                        case GoogleMigrateImporterActivity.A0E /* 11 */:
                        case 21:
                            str2 = settingsGoogleDrive.getString(R.string.gdrive_backup_error_auth_failed_summary);
                            settingsGoogleDrive.A02 = new ViewOnClickEBaseShape0S0100000_I0_0(settingsGoogleDrive, 15);
                            break;
                        case 12:
                            str2 = settingsGoogleDrive.getString(R.string.gdrive_backup_error_account_not_present_on_the_device_anymore_summary);
                            settingsGoogleDrive.A02 = new ViewOnClickEBaseShape0S0100000_I0_0(settingsGoogleDrive, 8);
                            break;
                        case 13:
                            if (bundle2 != null) {
                                long j3 = bundle2.getLong("total_bytes_to_be_uploaded", -1L);
                                if (j3 > 0) {
                                    str2 = settingsGoogleDrive.getString(R.string.gdrive_error_full_summary, C02180Ae.A0k(((ActivityC02310Ar) settingsGoogleDrive).A01, j3));
                                    settingsGoogleDrive.A02 = new ViewOnClickEBaseShape0S0100000_I0_0(settingsGoogleDrive, 13);
                                    break;
                                }
                            }
                            str2 = settingsGoogleDrive.getString(R.string.gdrive_error_full_summary_total_upload_unknown_size);
                            settingsGoogleDrive.A02 = new ViewOnClickEBaseShape0S0100000_I0_0(settingsGoogleDrive, 13);
                        case 14:
                        case 18:
                        case C0M6.A01 /* 20 */:
                            str2 = settingsGoogleDrive.getString(R.string.gdrive_backup_error_not_reachable_summary, settingsGoogleDrive.getString(R.string.backup));
                            settingsGoogleDrive.A02 = settingsGoogleDrive.A03;
                            break;
                        case 15:
                            str2 = settingsGoogleDrive.getString(R.string.gdrive_backup_error_internal_storage_full_summary, C02180Ae.A0k(((ActivityC02310Ar) settingsGoogleDrive).A01, SearchActionVerificationClientService.MS_TO_NS));
                            break;
                        case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                            str2 = settingsGoogleDrive.getString(R.string.gdrive_error_local_backup_missing_summary, settingsGoogleDrive.getString(R.string.backup));
                            settingsGoogleDrive.A02 = settingsGoogleDrive.A03;
                            break;
                        case 17:
                        case 22:
                            Log.i("settings-gdrive/display-backup-error/unexpected-error/file-not-found");
                            str2 = settingsGoogleDrive.getString(R.string.gdrive_backup_error_not_reachable_summary, settingsGoogleDrive.getString(R.string.backup));
                            settingsGoogleDrive.A02 = settingsGoogleDrive.A03;
                            break;
                        case 19:
                            str2 = settingsGoogleDrive.getString(R.string.gdrive_backup_error_google_drive_servers_are_not_working_properly_summary);
                            settingsGoogleDrive.A02 = settingsGoogleDrive.A03;
                            break;
                        case 23:
                            str2 = settingsGoogleDrive.getString(R.string.gdrive_backup_error_storage_permission_denied_summary);
                            settingsGoogleDrive.A02 = settingsGoogleDrive.A03;
                            break;
                        case 24:
                            throw new IllegalStateException(C000200d.A0D("Unexpected error during Google Drive backup: ", i2));
                        case 25:
                            str2 = settingsGoogleDrive.getString(R.string.gdrive_backup_error_google_backup_service_disabled_summary);
                            settingsGoogleDrive.A02 = settingsGoogleDrive.A03;
                            break;
                        default:
                            StringBuilder A0P3 = C000200d.A0P("settings-gdrive/display-backup-error/unhandled-error/");
                            A0P3.append(C40061rW.A04(i2));
                            Log.e(A0P3.toString());
                            break;
                    }
                    if (!C40061rW.A0G(settingsGoogleDrive)) {
                        StringBuilder A0P4 = C000200d.A0P("settings-gdrive/display-backup-error/");
                        A0P4.append(C40061rW.A04(i2));
                        Log.i(A0P4.toString());
                        View findViewById5 = settingsGoogleDrive.findViewById(R.id.google_drive_backup_error_text_views);
                        if (findViewById5 != null) {
                            findViewById5.setOnClickListener(settingsGoogleDrive.A02);
                            View findViewById6 = settingsGoogleDrive.findViewById(R.id.cancel_error_view);
                            if (findViewById6 != null) {
                                findViewById6.setVisibility(0);
                                findViewById6.setOnClickListener(settingsGoogleDrive.A00);
                                if (settingsGoogleDrive.A02 != null) {
                                    findViewById5.setClickable(true);
                                } else {
                                    findViewById5.setClickable(false);
                                }
                                if (str2 != null) {
                                    settingsGoogleDrive.A05.setVisibility(0);
                                    View findViewById7 = settingsGoogleDrive.findViewById(R.id.google_drive_backup_error_info);
                                    if (findViewById7 != null) {
                                        ((TextView) findViewById7).setText(str2);
                                        return;
                                    }
                                    throw null;
                                }
                                settingsGoogleDrive.A05.setVisibility(8);
                                return;
                            }
                            throw null;
                        }
                        throw null;
                    } else if (i2 != 10) {
                        StringBuilder A0P5 = C000200d.A0P("settings-gdrive/display-backup-error failed to display error ");
                        A0P5.append(C40061rW.A04(i2));
                        A0P5.append(" since Activity is about to finish.");
                        Log.e(A0P5.toString());
                        return;
                    } else {
                        return;
                    }
                }
                throw null;
            case 2:
                int i3 = this.A00;
                Bundle bundle3 = (Bundle) this.A02;
                StringBuilder A0P6 = C000200d.A0P("settings-gdrive-observer/media-restore-error/");
                A0P6.append(C40061rW.A04(i3));
                Log.i(A0P6.toString());
                SettingsGoogleDrive settingsGoogleDrive2 = ((C639131i) this.A01).A03;
                View.OnClickListener onClickListener = null;
                if (settingsGoogleDrive2 != null) {
                    C000700j.A01();
                    String A0F2 = ((ActivityC02290Ap) settingsGoogleDrive2).A0F.A0F();
                    if (A0F2 != null) {
                        switch (i3) {
                            case 10:
                            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                            case 17:
                                string = null;
                                break;
                            case GoogleMigrateImporterActivity.A0E /* 11 */:
                            case 21:
                                string = settingsGoogleDrive2.getString(R.string.gdrive_media_restore_error_auth_failed_summary);
                                onClickListener = new ViewOnClickEBaseShape0S0100000_I0_0(settingsGoogleDrive2, 16);
                                break;
                            case 12:
                                string = settingsGoogleDrive2.getString(R.string.gdrive_media_restore_error_account_not_present_on_the_device_anymore_summary, A0F2);
                                onClickListener = new ViewOnClickEBaseShape0S1100000_I0(settingsGoogleDrive2, A0F2, 2);
                                break;
                            case 13:
                                StringBuilder A0P7 = C000200d.A0P("settings-gdrive/display-media-restore-error/unexpected/");
                                A0P7.append(C40061rW.A04(i3));
                                Log.e(A0P7.toString());
                                string = null;
                                break;
                            case 14:
                                string = settingsGoogleDrive2.getString(R.string.gdrive_media_restore_error_not_reachable_summary);
                                onClickListener = new ViewOnClickEBaseShape0S0100000_I0_0(settingsGoogleDrive2, 7);
                                break;
                            case 15:
                                long j4 = -1;
                                if (bundle3 != null) {
                                    j = bundle3.getLong("total_bytes_to_be_downloaded", -1L);
                                    j4 = bundle3.getLong("total_bytes_downloaded", -1L);
                                    long j5 = j - j4;
                                    if (j >= 0 && j5 > 0) {
                                        string = settingsGoogleDrive2.getString(R.string.gdrive_media_restore_error_internal_storage_full_summary, C02180Ae.A0k(((ActivityC02310Ar) settingsGoogleDrive2).A01, j5));
                                        onClickListener = new ViewOnClickEBaseShape0S0101000_I0(settingsGoogleDrive2, i3, 1);
                                        break;
                                    }
                                } else {
                                    j = -1;
                                }
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("settings-gdrive/display-media-restore-error/");
                                sb4.append(i3);
                                sb4.append(" total: ");
                                sb4.append(j);
                                sb4.append(" download: ");
                                sb4.append(j4);
                                sb4.append(" downloaded cannot be more than total.");
                                Log.e(sb4.toString());
                                string = settingsGoogleDrive2.getString(R.string.gdrive_media_restore_error_internal_storage_full_summary_unknown_size);
                                onClickListener = new ViewOnClickEBaseShape0S0101000_I0(settingsGoogleDrive2, i3, 1);
                                break;
                            case 18:
                            case 19:
                                string = settingsGoogleDrive2.getString(R.string.gdrive_media_restore_error_google_drive_servers_are_not_working_properly_summary);
                                onClickListener = new ViewOnClickEBaseShape0S0100000_I0_0(settingsGoogleDrive2, 10);
                                break;
                            case C0M6.A01 /* 20 */:
                                Log.e("settings-gdrive/display-media-restore-error/unexpected-error/failed-to-authenticate-with-whatsapp-servers");
                                string = settingsGoogleDrive2.getString(R.string.gdrive_media_restore_error_google_drive_servers_are_not_working_properly_summary);
                                onClickListener = new ViewOnClickEBaseShape0S0100000_I0_0(settingsGoogleDrive2, 10);
                                break;
                            case 22:
                                throw new IllegalStateException(C000200d.A0D("Unexpected error: ", i3));
                            case 23:
                                string = settingsGoogleDrive2.getString(R.string.gdrive_media_restore_error_storage_permission_withdrawn);
                                onClickListener = new ViewOnClickEBaseShape0S0100000_I0_0(settingsGoogleDrive2, 9);
                                break;
                            case 24:
                            default:
                                StringBuilder A0P8 = C000200d.A0P("settings-gdrive/display-media-restore-error/unhandled-error/");
                                A0P8.append(C40061rW.A04(i3));
                                Log.e(A0P8.toString());
                                string = null;
                                break;
                            case 25:
                                string = settingsGoogleDrive2.getString(R.string.gdrive_media_restore_error_google_backup_service_disabled_summary);
                                onClickListener = new ViewOnClickEBaseShape0S0100000_I0_0(settingsGoogleDrive2, 11);
                                break;
                        }
                        if (!C40061rW.A0G(settingsGoogleDrive2)) {
                            StringBuilder A0P9 = C000200d.A0P("settings-gdrive/display-media-restore-error/");
                            A0P9.append(C40061rW.A04(i3));
                            Log.i(A0P9.toString());
                            View findViewById8 = settingsGoogleDrive2.findViewById(R.id.google_drive_backup_error_text_views);
                            if (findViewById8 != null) {
                                findViewById8.setOnClickListener(onClickListener);
                                if (onClickListener != null) {
                                    findViewById8.setClickable(true);
                                } else {
                                    findViewById8.setClickable(false);
                                }
                                if (string != null) {
                                    settingsGoogleDrive2.A05.setVisibility(0);
                                    View findViewById9 = settingsGoogleDrive2.findViewById(R.id.google_drive_backup_error_info);
                                    if (findViewById9 != null) {
                                        ((TextView) findViewById9).setText(string);
                                        View findViewById10 = settingsGoogleDrive2.findViewById(R.id.cancel_error_view);
                                        if (findViewById10 != null) {
                                            findViewById10.setVisibility(0);
                                            View findViewById11 = settingsGoogleDrive2.findViewById(R.id.cancel_error_view);
                                            if (findViewById11 != null) {
                                                findViewById11.setOnClickListener(settingsGoogleDrive2.A01);
                                                return;
                                            }
                                            throw null;
                                        }
                                        throw null;
                                    }
                                    throw null;
                                }
                                settingsGoogleDrive2.A05.setVisibility(8);
                                return;
                            }
                            throw null;
                        }
                        StringBuilder A0P10 = C000200d.A0P("settings-gdrive/display-media-restore-error failed to display error ");
                        A0P10.append(C40061rW.A04(i3));
                        A0P10.append(" since Activity is about to finish.");
                        Log.i(A0P10.toString());
                        return;
                    }
                    throw null;
                }
                throw null;
            case 3:
                C60052tq c60052tq = (C60052tq) this.A02;
                int i4 = this.A00;
                for (C2N6 c2n6 : ((C2L3) this.A01).A0E) {
                    c2n6.AKH(c60052tq.A03, i4);
                }
                return;
            case 4:
                C82233qB c82233qB = (C82233qB) this.A01;
                int i5 = this.A00;
                for (AnonymousClass092 anonymousClass092 : (Collection) this.A02) {
                    c82233qB.A00.A0V.A05(anonymousClass092.A0n);
                }
                StatusPlaybackContactFragment statusPlaybackContactFragment = c82233qB.A00;
                if (i5 >= statusPlaybackContactFragment.A0S.size()) {
                    StatusPlaybackContactFragment.A00(statusPlaybackContactFragment, 4, 6);
                    return;
                }
                statusPlaybackContactFragment.A1A();
                statusPlaybackContactFragment.A00 = -1;
                statusPlaybackContactFragment.A1B(i5);
                statusPlaybackContactFragment.A1D(statusPlaybackContactFragment.A17(), 4, 6);
                return;
            case 5:
                C82343qM c82343qM = (C82343qM) this.A01;
                int i6 = this.A00;
                AnonymousClass092 anonymousClass0922 = (AnonymousClass092) this.A02;
                C86873yf c86873yf = c82343qM.A01;
                c86873yf.A0J();
                if (3 == i6) {
                    c86873yf.A07();
                    if (c82343qM.A00) {
                        return;
                    }
                    c86873yf.A0H();
                    return;
                } else if (i6 == 12) {
                    c86873yf.A07();
                    if ((anonymousClass0922 instanceof AnonymousClass095) && C0DB.A0l((AnonymousClass097) anonymousClass0922)) {
                        if (!c82343qM.A00) {
                            c86873yf.A0H();
                        }
                        c82343qM.A00 = true;
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 6:
                int i7 = this.A00;
                AnonymousClass092 anonymousClass0923 = (AnonymousClass092) this.A02;
                C86883yg c86883yg = ((C82363qO) this.A01).A00;
                if (!c86883yg.A01) {
                    c86883yg.A0Q();
                } else {
                    c86883yg.A0J();
                    if (3 == i7) {
                        c86883yg.A07();
                        c86883yg.A0H();
                    }
                }
                if (C0D6.A00(anonymousClass0923.A08, 4) > 0) {
                    c86883yg.A0S();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
