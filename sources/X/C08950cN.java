package X;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;

/* renamed from: X.0cN */
/* loaded from: classes.dex */
public class C08950cN {
    public Bundle A01() {
        return null;
    }

    public static C08950cN A00(Activity activity, C0FK... c0fkArr) {
        if (Build.VERSION.SDK_INT >= 21) {
            Pair[] pairArr = null;
            if (c0fkArr != null) {
                int length = c0fkArr.length;
                pairArr = new Pair[length];
                for (int i = 0; i < length; i++) {
                    C0FK c0fk = c0fkArr[i];
                    pairArr[i] = Pair.create(c0fk.A00, c0fk.A01);
                }
            }
            return new C28641Sz(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
        }
        return new C08950cN();
    }
}
