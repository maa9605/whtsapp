package X;

import android.content.Context;
import java.util.regex.Pattern;

/* renamed from: X.1PY  reason: invalid class name */
/* loaded from: classes.dex */
public class C1PY {
    public static final Pattern A01 = Pattern.compile("dump\\.hprof.*");
    public final Context A00;

    public C1PY(Context context) {
        this.A00 = context.getApplicationContext();
    }
}
