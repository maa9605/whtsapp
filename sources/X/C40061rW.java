package X;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1rW */
/* loaded from: classes2.dex */
public final class C40061rW {
    public static final Executor A00 = C02180Ae.A0s(0, 2, TimeUnit.SECONDS, "Google Drive Write Worker #");

    public static int A00(int i) {
        switch (i) {
            case 10:
                return 1;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                return 6;
            case 12:
                return 15;
            case 13:
                return 3;
            case 14:
                return 5;
            case 15:
                return 8;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                return 9;
            case 17:
                return 10;
            case 18:
                return 11;
            case 19:
                return 12;
            case C0M6.A01 /* 20 */:
                return 13;
            case 21:
                return 14;
            case 22:
            default:
                return 2;
            case 23:
                return 16;
            case 24:
                return 18;
            case 25:
                return 17;
        }
    }

    public static long A01(List list) {
        long j;
        Iterator it = list.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file.exists()) {
                j = 1;
                if (!file.isDirectory()) {
                    if (file.length() > 0) {
                    }
                } else {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(file);
                    j = 0;
                    while (linkedList.peek() != null) {
                        Object poll = linkedList.poll();
                        if (poll != null) {
                            File[] listFiles = ((File) poll).listFiles();
                            if (listFiles != null) {
                                for (File file2 : listFiles) {
                                    if (file2.exists()) {
                                        if (file2.isDirectory()) {
                                            linkedList.add(file2);
                                        } else {
                                            j += file2.length() > 0 ? 1L : 0L;
                                        }
                                    }
                                }
                            }
                        } else {
                            throw null;
                        }
                    }
                    continue;
                }
                j2 += j;
            }
            j = 0;
            j2 += j;
        }
        return j2;
    }

    public static Dialog A02(final int i, final Activity activity, final int i2, final DialogInterface.OnCancelListener onCancelListener, boolean z) {
        StringBuilder A0P = C000200d.A0P("gdrive-util/get-error-dialog creating dialog for ");
        A0P.append(A03(i));
        Log.i(A0P.toString());
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.2lh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = i;
                Activity activity2 = activity;
                int i5 = i2;
                try {
                    PendingIntent A03 = C06220Rz.A00.A03(activity2, i4, i5);
                    if (A03 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("gdrive-util/get-error-dialog starting resolution for ");
                        sb.append(C40061rW.A03(i4));
                        Log.e(sb.toString());
                        if (i4 != 0) {
                            activity2.startIntentSenderForResult(A03.getIntentSender(), i5, null, 0, 0, 0);
                            return;
                        }
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("gdrive-util/get-error-dialog pending intent is null for error code: ");
                    sb2.append(C40061rW.A03(i4));
                    Log.e(sb2.toString());
                } catch (IntentSender.SendIntentException e) {
                    Log.e("gdrive-util/get-error-dialog", e);
                }
            }
        };
        C019208x c019208x = new C019208x(activity);
        c019208x.A01.A0J = false;
        c019208x.A04(R.string.skip, new DialogInterface.OnClickListener() { // from class: X.2li
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                DialogInterface.OnCancelListener onCancelListener2 = onCancelListener;
                if (onCancelListener2 != null) {
                    onCancelListener2.onCancel(dialogInterface);
                }
            }
        });
        if (i != 0) {
            if (i == 1) {
                int i3 = R.string.google_drive_error_google_play_services_are_missing_message_at_restore_time;
                if (z) {
                    i3 = R.string.google_drive_error_google_play_services_are_missing_message_at_backup_time;
                }
                c019208x.A03(R.string.google_drive_error_google_play_services_are_missing_title);
                c019208x.A02(i3);
                c019208x.A06(R.string.google_drive_error_google_play_services_are_missing_positive_button_label, onClickListener);
                return c019208x.A00();
            } else if (i == 2) {
                int i4 = R.string.google_drive_error_google_play_services_updation_required_message_at_restore_time;
                if (z) {
                    i4 = R.string.google_drive_error_google_play_services_updation_required_message_at_backup_time;
                }
                c019208x.A03(R.string.google_drive_error_google_play_services_updation_required_title);
                c019208x.A02(i4);
                c019208x.A06(R.string.google_drive_error_google_play_services_update_required_positive_button_label, onClickListener);
                return c019208x.A00();
            } else if (i != 3) {
                if (C0CL.A04(activity, i)) {
                    i = 18;
                }
                return C06210Ry.A00.A04(activity, i, i2, onCancelListener);
            } else {
                int i5 = R.string.google_drive_error_google_play_services_disabled_message_at_restore_time;
                if (z) {
                    i5 = R.string.google_drive_error_google_play_services_disabled_message_at_backup_time;
                }
                c019208x.A03(R.string.google_drive_error_google_play_services_disabled_title);
                c019208x.A02(i5);
                c019208x.A06(R.string.google_drive_error_google_play_services_disabled_positive_button_label, onClickListener);
                return c019208x.A00();
            }
        }
        return null;
    }

    public static String A03(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 9 ? i != 18 ? C000200d.A0D("unexpected-return-code: ", i) : "service-updating" : "service-invalid" : "service-disabled" : "service-version-update-required" : "service-missing" : "success";
    }

    public static String A04(int i) {
        switch (i) {
            case 10:
                return "none";
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                return "auth-failed";
            case 12:
                return "account-missing";
            case 13:
                return "google-drive-full";
            case 14:
                return "google-drive-not-reachable";
            case 15:
                return "local-storage-full";
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                return "local-chat-backup-missing";
            case 17:
                return "file-not-found";
            case 18:
                return "base-folder-does-not-exist";
            case 19:
                return "gdrive-servers-are-not-working-properly";
            case C0M6.A01 /* 20 */:
                return "failed-to-authenticate-with-whatsapp-servers";
            case 21:
                return "gps-unavailable";
            case 22:
                return "local-gdrive-file-map-is-missing";
            case 23:
                return "read-external-storage-permission-is-missing";
            case 24:
                return "backup-generated-using-newer-version-of-app";
            case 25:
                return "service-disabled";
            default:
                throw new IllegalArgumentException(C000200d.A0D("unexpected error: ", i));
        }
    }

    public static String A05(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return "manual";
                        }
                        throw new IllegalArgumentException(C000200d.A0D("Unexpected backup frequency: ", i));
                    }
                    return "monthly";
                }
                return "weekly";
            }
            return "daily";
        }
        return "off";
    }

    public static String A06(AbstractC000600i abstractC000600i, AnonymousClass034 anonymousClass034, String str, Context context) {
        String replace;
        boolean startsWith = str.startsWith("_INTERNAL_FILES_");
        if (!startsWith && !str.startsWith("_INTERNAL_DATABASES_")) {
            return anonymousClass034.A06(str).getAbsolutePath();
        }
        if ("_INTERNAL_DATABASES_/chatsettings.db".equals(str)) {
            C000200d.A14("gdrive-util/convert-upload-title-to-local-path/ignored-file-skipped-from-backup ", str);
            return null;
        }
        try {
            if (startsWith) {
                replace = str.replace("_INTERNAL_FILES_", context.getFilesDir().getAbsolutePath());
            } else if (str.startsWith("_INTERNAL_DATABASES_")) {
                replace = str.replace("_INTERNAL_DATABASES_", context.getDatabasePath("dummy.db").getParentFile().getAbsolutePath());
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("gdrive-util/upload-title-to-local-path/unexpected-title: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            String canonicalPath = new File(replace).getCanonicalPath();
            AbstractCollection abstractCollection = (AbstractCollection) A0E(context);
            HashSet hashSet = new HashSet(abstractCollection.size());
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                hashSet.add(new File(((File) it.next()).getCanonicalPath()));
            }
            if (hashSet.contains(new File(canonicalPath))) {
                return canonicalPath;
            }
            StringBuilder A0W = C000200d.A0W("gdrive-util/convert-upload-title-to-local-path/local-path-unexpected/return-null ", canonicalPath, " not in [");
            A0W.append(TextUtils.join(" ", hashSet));
            A0W.append("]");
            Log.e(A0W.toString());
            abstractC000600i.A09("gdrive-util/convert-upload-title-to-local-path", "gdrive: upload title maps to invalid local path", true);
            return null;
        } catch (IOException e) {
            Log.e("gdrive-util/upload-title-to-local-path", e);
            return null;
        }
    }

    public static String A07(AnonymousClass034 anonymousClass034, Context context, File file) {
        String absolutePath = file.getAbsolutePath();
        if (anonymousClass034.A08(file)) {
            StringBuilder sb = new StringBuilder();
            sb.append(anonymousClass034.A03.getAbsolutePath());
            sb.append("/");
            String replace = absolutePath.replace(sb.toString(), "");
            if (replace.startsWith("_INTERNAL_FILES_") || replace.startsWith("_INTERNAL_DATABASES_")) {
                C000200d.A13("gdrive-util/local-path-to-upload-title/malicious-file-name: ", replace);
                return null;
            }
            return replace;
        }
        String absolutePath2 = context.getFilesDir().getAbsolutePath();
        if (absolutePath.startsWith(absolutePath2)) {
            String replace2 = absolutePath.replace(absolutePath2, "_INTERNAL_FILES_");
            String.format(Locale.ENGLISH, "gdrive-util/local-path-to-upload-title %s -> %s", absolutePath, replace2);
            return replace2;
        }
        String absolutePath3 = context.getDatabasePath("dummy.db").getParentFile().getAbsolutePath();
        if (absolutePath.startsWith(absolutePath3)) {
            String replace3 = absolutePath.replace(absolutePath3, "_INTERNAL_DATABASES_");
            String.format(Locale.ENGLISH, "gdrive-util/local-path-to-upload-title %s -> %s", absolutePath, replace3);
            return replace3;
        }
        throw new IllegalArgumentException(C000200d.A0H("Unexpected file: ", absolutePath));
    }

    public static String A08(AnonymousClass034 anonymousClass034, C02F c02f, File file) {
        return A09(anonymousClass034, c02f, file, file.length());
    }

    public static String A09(AnonymousClass034 anonymousClass034, C02F c02f, File file, long j) {
        try {
            try {
                return AnonymousClass024.A0C(file, j, MessageDigest.getInstance("MD5"));
            } catch (IOException e) {
                if (anonymousClass034.A08(file) && !c02f.A06()) {
                    throw new C2GT(e);
                }
                Log.e("gdrive-util/get-message-digest", e);
                return null;
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String A0A(C0S0 c0s0) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[10];
        Integer num = c0s0.A0B;
        if (num != null) {
            str = num.toString();
        } else {
            str = "undefined";
        }
        objArr[0] = str;
        Double d = c0s0.A06;
        if (d != null) {
            i = (int) d.doubleValue();
        } else {
            i = -1;
        }
        objArr[1] = Integer.valueOf(i);
        Double d2 = c0s0.A02;
        if (d2 != null) {
            i2 = (int) d2.doubleValue();
        } else {
            i2 = -1;
        }
        objArr[2] = Integer.valueOf(i2);
        Double d3 = c0s0.A04;
        if (d3 != null) {
            i3 = (int) d3.doubleValue();
        } else {
            i3 = -1;
        }
        objArr[3] = Integer.valueOf(i3);
        Double d4 = c0s0.A03;
        if (d4 != null) {
            i4 = (int) d4.doubleValue();
        } else {
            i4 = -1;
        }
        objArr[4] = Integer.valueOf(i4);
        objArr[5] = c0s0.A0F;
        objArr[6] = c0s0.A00;
        objArr[7] = c0s0.A0D;
        objArr[8] = c0s0.A0A;
        objArr[9] = c0s0.A09;
        return String.format(locale, "api:%s, total size:%d, chat size:%d, media size:%d, media files count:%d retryCount:%d includeVideos:%b wifi-on-finish:%b failure-stage:%d result:%d", objArr);
    }

    public static String A0B(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf("@");
        if (indexOf > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.charAt(0));
            sb.append("***");
            sb.append(str.substring(indexOf - 1));
            return sb.toString();
        }
        return str;
    }

    public static String A0C(String str, Map map) {
        if (map == null || map.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }

    public static String A0D(String str, String... strArr) {
        int length = strArr.length;
        if (length != 0) {
            if (length % 2 != 0) {
                StringBuilder A0P = C000200d.A0P("gdrive-util/append-query-parameters/odd number of params - ");
                A0P.append(length);
                Log.e(A0P.toString());
            }
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            for (int i = 0; i < length; i += 2) {
                buildUpon.appendQueryParameter(strArr[i], strArr[i + 1]);
            }
            return buildUpon.build().toString();
        }
        return str;
    }

    public static Set A0E(Context context) {
        HashSet hashSet = new HashSet();
        hashSet.add(context.getDatabasePath("chatsettingsbackup.db"));
        hashSet.add(AbstractC40441sG.A02(context));
        StringBuilder sb = new StringBuilder("gdrive-util/get-internal-files-for-restore [");
        sb.append(TextUtils.join(", ", hashSet));
        sb.append("]");
        Log.i(sb.toString());
        return hashSet;
    }

    public static void A0F(Context context, Intent intent) {
        intent.setClass(context, GoogleBackupService.class);
        C02160Ac.A06(context, intent);
    }

    public static boolean A0G(Activity activity) {
        if (C002701i.A1P(activity)) {
            return true;
        }
        if ((activity instanceof RestoreFromBackupActivity) && ((RestoreFromBackupActivity) activity).A0d) {
            return true;
        }
        return (activity instanceof SettingsGoogleDrive) && ((SettingsGoogleDrive) activity).A0Z;
    }

    public static boolean A0H(C000500h c000500h) {
        return c000500h.A06() == 1;
    }

    public static boolean A0I(C000500h c000500h) {
        return c000500h.A06() == 2;
    }

    public static boolean A0J(File file, C012005w c012005w) {
        try {
            return c012005w.A0R(file);
        } catch (IOException e) {
            C000200d.A12("gdrive-util/in-media-folder ", file, e);
            return false;
        }
    }

    public static boolean A0K(File file, C000500h c000500h, C01B c01b, C012005w c012005w) {
        boolean z;
        boolean z2;
        try {
            z = file.getCanonicalPath().startsWith(c012005w.A04().A0N.getCanonicalPath());
        } catch (IOException e) {
            C000200d.A12("gdrive-util/should-backup/in-video-folder ", file, e);
            z = false;
        }
        if (c000500h.A00.getBoolean("gdrive_include_videos_in_backup", false) || !z) {
            long A07 = (c01b.A07(C01C.A3Y) << 1) * 1048576;
            long A072 = (c01b.A07(C01C.A2w) << 1) * 1048576;
            try {
            } catch (IOException e2) {
                C000200d.A12("gdrive-util/should-backup-in-document-folder ", file, e2);
                z2 = false;
            }
            if (c012005w != null) {
                z2 = file.getCanonicalPath().startsWith(c012005w.A04().A02.getCanonicalPath());
                long length = file.length();
                if (z2) {
                    A07 = A072;
                }
                if (length > A07) {
                    file.getAbsolutePath();
                    file.length();
                    return false;
                }
                String name = file.getName();
                int lastIndexOf = name.lastIndexOf(".");
                if (lastIndexOf == -1 || lastIndexOf == name.length() - 1) {
                    file.getAbsolutePath();
                    return false;
                }
                return true;
            }
            throw null;
        }
        return false;
    }

    public static boolean A0L(File file, boolean z, String str, C0CC c0cc) {
        EnumC03450Ft A02;
        if (file != null && file.exists() && z) {
            if (file.length() == 0) {
                Log.i("gdrive-util/validate local msgstore exists but is empty.");
                return false;
            }
            if (str != null && (A02 = C0CC.A02(file.getName())) != null) {
                try {
                    if (!C0HH.A00(A02, c0cc.A0W, c0cc.A06, c0cc.A0F, c0cc.A08, c0cc.A0A, c0cc.A0V, file).A07(str)) {
                        return true;
                    }
                } catch (IOException e) {
                    Log.e("msgstore/has-jid-mismatch/failed to read backup footer", e);
                    return true;
                }
            }
            Log.i("gdrive-util/validate local msgstore exists but for a different jid.");
            return false;
        }
        Log.i("gdrive-util/validate local msgstore does not exist or is unusable");
        return false;
    }

    public static boolean A0M(List list, File file, C469829b c469829b) {
        if (!c469829b.A0J.block(86400000L)) {
            Log.e("gdrive-conditions-manager/sdcard-wait 86400000 milliseconds, giving up now.");
            C000200d.A0o(file, C000200d.A0P("gdrive-util/get-files-in-folder/timeout "));
            return false;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        while (linkedList.peek() != null) {
            Object poll = linkedList.poll();
            if (poll != null) {
                File file2 = (File) poll;
                if (file2.exists()) {
                    if (file2.isDirectory()) {
                        File[] listFiles = file2.listFiles();
                        if (listFiles != null) {
                            for (File file3 : listFiles) {
                                if (file3.exists()) {
                                    if (file3.isDirectory()) {
                                        linkedList.add(file3);
                                    } else if (file3.length() > 0) {
                                        list.add(file3);
                                    }
                                } else {
                                    StringBuilder A0P = C000200d.A0P("gdrive-util/get-files-in-folder/does-not-exist ");
                                    A0P.append(file3.getAbsolutePath());
                                    Log.w(A0P.toString());
                                }
                            }
                        }
                    } else if (file2.length() > 0) {
                        list.add(file2);
                    }
                } else {
                    StringBuilder A0P2 = C000200d.A0P("gdrive-util/get-files-in-folder/does-not-exist ");
                    A0P2.append(file2.getAbsolutePath());
                    Log.w(A0P2.toString());
                }
                list.size();
            } else {
                throw null;
            }
        }
        return true;
    }
}
