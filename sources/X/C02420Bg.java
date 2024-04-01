package X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: X.0Bg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C02420Bg {
    public final C02400Ba A01;
    public int A00 = 0;
    public final Map A02 = new C006702y();

    public C02420Bg(C02400Ba c02400Ba) {
        this.A01 = c02400Ba;
    }

    public final String A00() {
        String string;
        C02400Ba c02400Ba = this.A01;
        synchronized (c02400Ba) {
            string = c02400Ba.A01.getString("topic_operaion_queue", "");
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String[] split = string.split(",");
        if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
            return null;
        }
        return split[1];
    }
}
