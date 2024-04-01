package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.PersistableBundle;
import java.util.Arrays;

/* renamed from: X.0kC  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C12860kC {
    public final C0M2 A00;

    public C12860kC(Context context, ShortcutInfo shortcutInfo) {
        C12810k6[] c12810k6Arr;
        C0M2 c0m2 = new C0M2();
        this.A00 = c0m2;
        c0m2.A02 = context;
        c0m2.A07 = shortcutInfo.getId();
        Intent[] intents = shortcutInfo.getIntents();
        this.A00.A0B = (Intent[]) Arrays.copyOf(intents, intents.length);
        this.A00.A01 = shortcutInfo.getActivity();
        this.A00.A05 = shortcutInfo.getShortLabel();
        this.A00.A06 = shortcutInfo.getLongLabel();
        this.A00.A04 = shortcutInfo.getDisabledMessage();
        this.A00.A08 = shortcutInfo.getCategories();
        C0M2 c0m22 = this.A00;
        PersistableBundle extras = shortcutInfo.getExtras();
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            c12810k6Arr = null;
        } else {
            int i = extras.getInt("extraPersonCount");
            c12810k6Arr = new C12810k6[i];
            int i2 = 0;
            while (i2 < i) {
                StringBuilder A0P = C000200d.A0P("extraPerson_");
                int i3 = i2 + 1;
                A0P.append(i3);
                PersistableBundle persistableBundle = extras.getPersistableBundle(A0P.toString());
                C12800k5 c12800k5 = new C12800k5();
                c12800k5.A01 = persistableBundle.getString("name");
                c12800k5.A03 = persistableBundle.getString("uri");
                c12800k5.A02 = persistableBundle.getString("key");
                c12800k5.A04 = persistableBundle.getBoolean("isBot");
                c12800k5.A05 = persistableBundle.getBoolean("isImportant");
                c12810k6Arr[i2] = new C12810k6(c12800k5);
                i2 = i3;
            }
        }
        c0m22.A0C = c12810k6Arr;
        this.A00.A00 = shortcutInfo.getRank();
    }
}
