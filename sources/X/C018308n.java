package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.08n */
/* loaded from: classes.dex */
public class C018308n implements C08o {
    public static volatile C018308n A02;
    public final C018508q A00;
    public final AnonymousClass012 A01;

    public C018308n(AnonymousClass012 anonymousClass012, C018508q c018508q) {
        this.A01 = anonymousClass012;
        this.A00 = c018508q;
    }

    public static Activity A00(Context context) {
        Activity A0F = C02180Ae.A0F(context);
        if (A0F != null) {
            return A0F;
        }
        throw new IllegalStateException("The Context is not an Activity.");
    }

    public static Activity A01(Context context, Class cls) {
        Activity A00 = A00(context);
        if (cls.isAssignableFrom(A00.getClass())) {
            return A00;
        }
        StringBuilder A0P = C000200d.A0P("The Context is not assignable from class ");
        A0P.append(cls.getSimpleName());
        throw new IllegalStateException(A0P.toString());
    }

    public static C018308n A02() {
        if (A02 == null) {
            synchronized (C018308n.class) {
                if (A02 == null) {
                    A02 = new C018308n(AnonymousClass012.A00(), C018508q.A00());
                }
            }
        }
        return A02;
    }

    public static void A03(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static void A04(View view, WindowManager windowManager) {
        int identifier;
        if (Build.VERSION.SDK_INT < 19 || view == null) {
            return;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i = 0;
        Resources resources = view.getContext().getResources();
        if (C0K7.A05() && resources.getConfiguration().orientation == 2 && (identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
            i = resources.getDimensionPixelSize(identifier);
        }
        view.getLayoutParams().width = point.x - i;
    }

    public static void A05(Window window) {
        if (Build.VERSION.SDK_INT >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x000f, code lost:
        if ((r6.getFlags() & 268435456) != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A06(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            android.app.Activity r0 = X.C02180Ae.A0F(r5)
            r3 = 0
            if (r0 != 0) goto L11
            int r2 = r6.getFlags()
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r0
            r1 = 0
            if (r2 == 0) goto L12
        L11:
            r1 = 1
        L12:
            java.lang.String r0 = "Need to use activity context or FLAG_ACTIVITY_NEW_TASK flag"
            X.C000700j.A09(r1, r0)
            r5.startActivity(r6)     // Catch: android.content.ActivityNotFoundException -> L1b
            goto L2a
        L1b:
            r1 = move-exception
            java.lang.String r0 = "app/start-activity "
            com.whatsapp.util.Log.e(r0, r1)
            X.08q r1 = r4.A00
            r0 = 2131886168(0x7f120058, float:1.9406907E38)
            r1.A07(r0, r3)
            return
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018308n.A06(android.content.Context, android.content.Intent):void");
    }

    public void A07(Context context, Intent intent) {
        A08(context, intent, context.getClass().getSimpleName());
    }

    public void A08(Context context, Intent intent, String str) {
        C000700j.A09(context != null, "Context must not be null");
        C000700j.A09(intent != null, "Intent cannot be null to launch the activity");
        C002701i.A1C(intent, str, this.A01);
        A06(context, intent);
    }

    public boolean A09(Activity activity, Intent intent, int i) {
        try {
            activity.startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException e) {
            Log.e("app/start-activity-for-result ", e);
            this.A00.A07(R.string.activity_not_found, 0);
            return false;
        }
    }

    @Override // X.C08o
    public void AS7(Context context, Uri uri) {
        if (uri == null) {
            Log.e("activity-utils/start-activity/uri-is-null");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        intent.putExtra("create_new_tab", true);
        A06(context, intent);
    }
}
