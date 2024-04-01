package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3i7  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC77383i7 {
    public Map A00 = new HashMap();

    public void A00(C0DX c0dx, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(str)) {
                this.A00.put(str.toUpperCase(Locale.US), c0dx);
            }
        }
    }
}
