package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0LD  reason: invalid class name */
/* loaded from: classes.dex */
public class C0LD {
    public static C09I A00 = C09I.A00();

    public static Intent A00(Intent intent, AnonymousClass094 anonymousClass094) {
        if (!intent.hasExtra("fMessageKeyJid") && !intent.hasExtra("fMessageKeyFromMe") && !intent.hasExtra("fMessageKeyId")) {
            return intent.putExtra("fMessageKeyId", anonymousClass094.A01).putExtra("fMessageKeyFromMe", anonymousClass094.A02).putExtra("fMessageKeyJid", C003101m.A07(anonymousClass094.A00));
        }
        throw new IllegalArgumentException("Intent already contains key.");
    }

    public static Intent A01(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(A00.A02() ? "market://details?id=com.whatsapp.w4b&utm_source=" : "https://play.google.com/store/apps/details?id=com.whatsapp.w4b&utm_source=");
        sb.append(str);
        return new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
    }

    public static AnonymousClass094 A02(Intent intent) {
        if (intent.hasExtra("fMessageKeyJid") && intent.hasExtra("fMessageKeyFromMe") && intent.hasExtra("fMessageKeyId")) {
            return new AnonymousClass094(AbstractC005302j.A02(intent.getStringExtra("fMessageKeyJid")), intent.getBooleanExtra("fMessageKeyFromMe", false), intent.getStringExtra("fMessageKeyId"));
        }
        return null;
    }

    public static AnonymousClass094 A03(Bundle bundle, String str) {
        String A0H = C000200d.A0H(str, "fMessageKeyJid");
        String A0H2 = C000200d.A0H(str, "fMessageKeyFromMe");
        String A0H3 = C000200d.A0H(str, "fMessageKeyId");
        if (bundle.containsKey(A0H) && bundle.containsKey(A0H2) && bundle.containsKey(A0H3)) {
            return new AnonymousClass094(AbstractC005302j.A02(bundle.getString(A0H)), bundle.getBoolean(A0H2, false), bundle.getString(A0H3));
        }
        return null;
    }

    public static List A04(Bundle bundle) {
        if (bundle.containsKey("fMessageKeyJidArray") && bundle.containsKey("fMessageKeyFromMeArray") && bundle.containsKey("fMessageKeyIdArray")) {
            String[] stringArray = bundle.getStringArray("fMessageKeyIdArray");
            if (stringArray != null) {
                boolean[] booleanArray = bundle.getBooleanArray("fMessageKeyFromMeArray");
                if (booleanArray != null) {
                    String[] stringArray2 = bundle.getStringArray("fMessageKeyJidArray");
                    if (stringArray2 != null) {
                        int length = stringArray.length;
                        ArrayList arrayList = new ArrayList(length);
                        for (int i = 0; i < length; i++) {
                            arrayList.add(new AnonymousClass094(AbstractC005302j.A02(stringArray2[i]), booleanArray[i], stringArray[i]));
                        }
                        return arrayList;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        return null;
    }

    public static void A05(Activity activity, String str) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", str, null));
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            activity.startActivity(new Intent("android.settings.SETTINGS"));
        }
    }

    public static void A06(Intent intent) {
        String action = intent.getAction();
        if (action == null || !action.startsWith("com.whatsapp.intent.action.") || "gigaset".equalsIgnoreCase(Build.MANUFACTURER)) {
            return;
        }
        intent.setPackage("com.whatsapp");
    }

    public static void A07(Bundle bundle, AnonymousClass094 anonymousClass094, String str) {
        String A0H = C000200d.A0H(str, "fMessageKeyJid");
        String A0H2 = C000200d.A0H(str, "fMessageKeyFromMe");
        String A0H3 = C000200d.A0H(str, "fMessageKeyId");
        if (!bundle.containsKey(A0H3) && !bundle.containsKey(A0H2) && !bundle.containsKey(A0H3)) {
            bundle.putString(A0H3, anonymousClass094.A01);
            bundle.putBoolean(A0H2, anonymousClass094.A02);
            bundle.putString(A0H, C003101m.A07(anonymousClass094.A00));
            return;
        }
        throw new IllegalArgumentException("Bundle already contains key.");
    }

    public static void A08(Bundle bundle, Collection collection) {
        if (!bundle.containsKey("fMessageKeyJidArray") && !bundle.containsKey("fMessageKeyFromMeArray") && !bundle.containsKey("fMessageKeyIdArray")) {
            String[] strArr = new String[collection.size()];
            boolean[] zArr = new boolean[collection.size()];
            String[] strArr2 = new String[collection.size()];
            int i = 0;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass094 anonymousClass094 = (AnonymousClass094) it.next();
                strArr[i] = anonymousClass094.A01;
                zArr[i] = anonymousClass094.A02;
                strArr2[i] = C003101m.A07(anonymousClass094.A00);
                i++;
            }
            bundle.putStringArray("fMessageKeyIdArray", strArr);
            bundle.putBooleanArray("fMessageKeyFromMeArray", zArr);
            bundle.putStringArray("fMessageKeyJidArray", strArr2);
            return;
        }
        throw new IllegalArgumentException("Bundle already contains list of keys.");
    }
}
