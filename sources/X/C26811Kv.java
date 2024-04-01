package X;

import android.content.Context;
import android.os.Build;
import com.google.android.search.verification.client.R;

/* renamed from: X.1Kv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C26811Kv {
    public static final int[] A03;
    public final Context A00;
    public final C000500h A01;
    public final C002301c A02;

    static {
        A03 = Build.VERSION.SDK_INT >= 29 ? new int[]{R.string.settings_theme_follow_system, R.string.settings_theme_light, R.string.settings_theme_dark} : new int[]{R.string.settings_theme_light, R.string.settings_theme_dark};
    }

    public C26811Kv(Context context, C002301c c002301c, C000500h c000500h) {
        this.A00 = context;
        this.A02 = c002301c;
        this.A01 = c000500h;
    }

    public final int A00() {
        int A07 = this.A01.A07();
        if (Build.VERSION.SDK_INT < 29) {
            return A07 != 2 ? 0 : 1;
        } else if (A07 != 1) {
            return A07 == 2 ? 2 : 0;
        } else {
            return 1;
        }
    }
}
