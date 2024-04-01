package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.07W  reason: invalid class name */
/* loaded from: classes.dex */
public class C07W {
    public static boolean A00(Context context) {
        return Build.VERSION.SDK_INT >= 17 && (context.getApplicationInfo().flags & 4194304) != 0 && context.getResources().getConfiguration().getLayoutDirection() == 1;
    }
}
