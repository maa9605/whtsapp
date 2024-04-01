package X;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.dialogs.RoomsNUXBottomSheetDialogFragment;
import com.whatsapp.dialogs.RoomsRedirectDialogFragment;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.0Vu */
/* loaded from: classes.dex */
public class C06950Vu {
    public static final Uri A06 = Uri.parse("fb-messenger://meetup_create");
    public static final Uri A07 = Uri.parse("https://www.messenger.com/groupcall/create");
    public static volatile C06950Vu A08;
    public final C018508q A00;
    public final C01B A01;
    public final C001200o A02;
    public final C000500h A03;
    public final C003701t A04;
    public final AnonymousClass011 A05;

    public C06950Vu(C003701t c003701t, C001200o c001200o, C018508q c018508q, AnonymousClass011 anonymousClass011, C01B c01b, C000500h c000500h) {
        this.A04 = c003701t;
        this.A02 = c001200o;
        this.A00 = c018508q;
        this.A05 = anonymousClass011;
        this.A01 = c01b;
        this.A03 = c000500h;
    }

    public static final boolean A00(Intent intent, PackageManager packageManager) {
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        return queryIntentActivities != null && queryIntentActivities.size() > 0;
    }

    public static final boolean A01(PackageManager packageManager, String str, int i) {
        try {
            return Integer.parseInt(packageManager.getPackageInfo(str, 0).versionName.split("\\.")[0]) >= i;
        } catch (PackageManager.NameNotFoundException | NumberFormatException e) {
            Log.e("Cannot get application version", e);
            return false;
        }
    }

    public final Uri A02(AbstractC005302j abstractC005302j, boolean z, int i) {
        String str;
        Uri.Builder appendQueryParameter = A07.buildUpon().appendQueryParameter("source", "whatsapp");
        if (abstractC005302j != null) {
            String A0g = C02180Ae.A0g(5);
            C000500h c000500h = this.A03;
            C000200d.A0i(c000500h, "return_chat_id", A0g);
            C000200d.A0i(c000500h, "return_chat_jid", abstractC005302j.getRawString());
            appendQueryParameter.appendQueryParameter("ref", A0g);
        }
        if (z && this.A04.A0C(179)) {
            appendQueryParameter.appendQueryParameter("upgrade", "1");
        }
        if (i == 0) {
            str = "3";
        } else if (i != 1) {
            if (i == 2) {
                str = "1";
            }
            return appendQueryParameter.build();
        } else {
            str = "2";
        }
        appendQueryParameter.appendQueryParameter("ep", str);
        return appendQueryParameter.build();
    }

    public final DialogFragment A03(AbstractC005302j abstractC005302j, int i) {
        RoomsRedirectDialogFragment A00;
        RoomsNUXBottomSheetDialogFragment A002;
        SharedPreferences sharedPreferences = this.A03.A00;
        if (sharedPreferences.getBoolean("rooms_nux_shown", false) || (A002 = RoomsNUXBottomSheetDialogFragment.A00(abstractC005302j, i)) == null) {
            if ((sharedPreferences.getInt("rooms_dialogs_shown", 0) < 5 || (sharedPreferences.getInt("rooms_redirect_shown", 0) & (1 << i)) == 0) && (A00 = RoomsRedirectDialogFragment.A00(abstractC005302j, i)) != null) {
                return A00;
            }
            return null;
        }
        return A002;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(X.AbstractC005302j r18, int r19) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06950Vu.A04(X.02j, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002c, code lost:
        if (A00(new android.content.Intent("android.intent.action.VIEW").setData(A02(null, false, 1)), r5.A02.A00.getApplicationContext().getPackageManager()) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A05() {
        /*
            r5 = this;
            X.01t r3 = r5.A04
            r0 = 178(0xb2, float:2.5E-43)
            boolean r0 = r3.A0C(r0)
            java.lang.String r2 = "android.intent.action.VIEW"
            r4 = 1
            r1 = 0
            if (r0 == 0) goto L2e
            r0 = 0
            android.net.Uri r1 = r5.A02(r0, r1, r4)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2)
            android.content.Intent r1 = r0.setData(r1)
            X.00o r0 = r5.A02
            android.app.Application r0 = r0.A00
            android.content.Context r0 = r0.getApplicationContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            boolean r0 = A00(r1, r0)
            if (r0 != 0) goto L6b
        L2e:
            r0 = 177(0xb1, float:2.48E-43)
            boolean r0 = r3.A0C(r0)
            if (r0 == 0) goto L6c
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2)
            java.lang.String r0 = "com.facebook.orca"
            android.content.Intent r1 = r1.setPackage(r0)
            android.net.Uri r0 = X.C06950Vu.A06
            android.content.Intent r1 = r1.setData(r0)
            X.00o r0 = r5.A02
            android.app.Application r0 = r0.A00
            android.content.Context r0 = r0.getApplicationContext()
            android.content.pm.PackageManager r3 = r0.getPackageManager()
            boolean r0 = A00(r1, r3)
            if (r0 == 0) goto L6c
            java.lang.String r2 = r1.getPackage()
            X.01B r1 = r5.A01
            X.039 r0 = X.C01C.A42
            int r0 = r1.A07(r0)
            boolean r0 = A01(r3, r2, r0)
            if (r0 == 0) goto L6c
        L6b:
            return r4
        L6c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06950Vu.A05():boolean");
    }
}
