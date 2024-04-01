package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientUtil;
import com.whatsapp.TellAFriendReceiver;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.0W5  reason: invalid class name */
/* loaded from: classes.dex */
public class C0W5 {
    public static volatile C0W5 A04;
    public final C018508q A00;
    public final C01B A01;
    public final AnonymousClass011 A02;
    public final C2MG A03;

    public C0W5(C018508q c018508q, C2MG c2mg, AnonymousClass011 anonymousClass011, C01B c01b) {
        this.A00 = c018508q;
        this.A03 = c2mg;
        this.A02 = anonymousClass011;
        this.A01 = c01b;
    }

    public void A00(Activity activity, Uri uri, String str, Integer num) {
        String str2;
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(uri);
        List<ResolveInfo> queryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
        if (!queryIntentActivities.isEmpty()) {
            StringBuilder A0P = C000200d.A0P("app/sms ");
            A0P.append(queryIntentActivities.size());
            Log.i(A0P.toString());
            if (Build.VERSION.SDK_INT >= 19) {
                str2 = Telephony.Sms.getDefaultSmsPackage(activity);
                if (!TextUtils.isEmpty(str2)) {
                    intent.setPackage(str2);
                } else {
                    ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
                    intent.setClassName(activityInfo.packageName, activityInfo.name);
                    str2 = activityInfo.packageName;
                }
            } else {
                ActivityInfo activityInfo2 = queryIntentActivities.get(0).activityInfo;
                intent.setClassName(activityInfo2.packageName, activityInfo2.name);
                str2 = activityInfo2.packageName;
            }
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("sms_body", str);
            }
            activity.startActivity(intent);
            if (num != null && this.A01.A0E(C01C.A1B)) {
                C36561l0 c36561l0 = new C36561l0();
                c36561l0.A00 = 3;
                c36561l0.A01 = num;
                c36561l0.A02 = str2;
                this.A02.A0B(c36561l0, null, false);
                return;
            }
            return;
        }
        Log.e("app/sms/no activities");
    }

    public void A01(Activity activity, Integer num) {
        if (num == null) {
            return;
        }
        String string = activity.getString(R.string.tell_a_friend_via);
        int i = 0;
        String string2 = activity.getString(R.string.tell_a_friend_sms, "https://whatsapp.com/dl/");
        StringBuilder sb = new StringBuilder();
        sb.append(activity.getString(R.string.tell_a_friend_email_body, "https://www.whatsapp.com/download/"));
        sb.append("\n\n");
        String obj = sb.toString();
        String string3 = activity.getString(R.string.tell_a_friend_email_subject);
        PackageManager packageManager = activity.getPackageManager();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Intent[] intentArr = {new Intent("android.intent.action.VIEW").setType("vnd.android-dir/mms-sms").putExtra("sms_body", string2), new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.EMAIL", " ").putExtra("android.intent.extra.TEXT", obj).putExtra("android.intent.extra.SUBJECT", string3)};
        Intent intent = null;
        int i2 = 0;
        do {
            Intent intent2 = intentArr[i2];
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent2, i);
            if (queryIntentActivities != null) {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    Intent intent3 = intent;
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    String str = activityInfo.name;
                    String str2 = activityInfo.applicationInfo.packageName;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("app/tell ");
                    sb2.append(i2);
                    sb2.append(" | ");
                    sb2.append(str2);
                    sb2.append(" | ");
                    sb2.append(str);
                    Log.i(sb2.toString());
                    if (!str2.contains("bluetooth") && !str2.equals("com.sec.android.app.FileTransferClient") && !str2.equals("com.sec.android.app.FileShareClient") && !str2.equals("com.sec.android.widgetapp.diotek.smemo") && !str2.equals("com.threebanana.notes") && !str2.equals("com.evernote") && !str2.equals("com.android.apps.tag") && !str2.equals("com.andrewshu.android.reddit") && !str2.equals("com.dataviz.stargate") && !str2.equals("com.dropbox.android") && !str2.equals("com.google.zxing.client.android") && !str2.equals("com.lg.valle.phone2chrome") && !str2.equals("com.motorola.blur.socialshare") && !str2.equals("com.whatsapp") && !str2.equals("com.whatsapp.w4b") && !str2.equals("la.droid.qr") && !str2.equals("com.google.android.apps.translate") && !str2.equals("com.google.android.apps.docs") && !str2.equals(SearchActionVerificationClientUtil.SEARCH_APP_PACKAGE) && !str2.equals("com.world.newspapers") && !str2.equals("lysesoft.andftp") && !str2.equals("com.klye.ime.latin") && !str2.equals("com.ideashower.readitlater.pro") && !str2.equals("com.springpad") && !str2.equals("ch.teamtasks.tasks.paid") && !str2.equals("flipboard.app") && !str2.equals("jp.naver.cafe") && !str2.equals("org.mozilla.firefox") && !str2.equals("com.linkedin.android") && !str2.equals("com.tenthbit.juliet") && !str2.equals("com.bumptech.bumpga")) {
                        intent = (Intent) intent2.clone();
                        intent.setClassName(str2, str);
                        intent.setPackage(str2);
                        if (!str2.equals("mobi.qiss.plurq") && !str2.equals("com.htc.socialnetwork.plurk") && !str2.equals("com.facebook.orca") && !str2.equals("com.google.android.apps.plus") && !str2.equals("com.google.android.apps.googlevoice") && !str2.equals("com.google.android.apps.messaging") && !str2.equals("com.thedeck.android.app") && !str2.equals("com.twitter.android") && !str2.equals("tw.anddev.aplurk")) {
                            if (str2.equals("com.facebook.katana")) {
                                intent.putExtra("android.intent.extra.TEXT", "https://www.whatsapp.com/download/");
                            }
                        } else {
                            intent.removeExtra("android.intent.extra.EMAIL");
                            intent.putExtra("android.intent.extra.TEXT", string2);
                        }
                        if (!hashSet.contains(str2)) {
                            arrayList.add(intent);
                            hashSet.add(str2);
                            if (!str.equals("com.lge.message.activity.compose.ComposeMessageActivity")) {
                            }
                        }
                    }
                    intent = intent3;
                }
            }
            i2++;
            i = 0;
        } while (i2 < 2);
        int size = arrayList.size();
        if (size == 0) {
            Log.w("app/tell/none");
            this.A00.A05(R.string.error_no_email_client, 0);
        } else {
            String A0I = C000200d.A0I(Build.MANUFACTURER.replace(' ', '_'), "-", Build.MODEL.replace(' ', '_'));
            StringBuilder sb3 = new StringBuilder("app/packagedintents/device ");
            sb3.append(A0I);
            Log.i(sb3.toString());
            if (!A0I.equals("LGE-LU2300")) {
                if (size > 1) {
                    int i3 = size - 1;
                    Object obj2 = arrayList.get(i3);
                    arrayList.remove(i3);
                    arrayList.add(0, obj2);
                }
                activity.startActivity(C02180Ae.A0H(arrayList, string, PendingIntent.getBroadcast(activity, 0, new Intent(activity, TellAFriendReceiver.class).putExtra("extra_invite_source", num), 134217728).getIntentSender()));
            } else if (intent == null) {
                Log.w("app/tell/none");
                this.A00.A05(R.string.error_no_email_client, 0);
            } else {
                Log.i("app/tell/override");
                activity.startActivity(intent);
            }
        }
        if (this.A01.A0E(C01C.A1B)) {
            C36561l0 c36561l0 = new C36561l0();
            c36561l0.A00 = 1;
            c36561l0.A01 = num;
            this.A02.A0B(c36561l0, null, false);
        }
    }
}
