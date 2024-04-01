package X;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: X.1XM */
/* loaded from: classes.dex */
public class C1XM {
    public static final C1XM A02 = new C1XM();
    public String A01 = "unknown";
    public int A00 = 5;

    public final void A00(int i, String str, String str2) {
        Log.println(i, C000200d.A0M(new StringBuilder(), "unknown", ":", str), str2);
    }

    public final void A01(int i, String str, String str2, Throwable th) {
        String A0M = C000200d.A0M(new StringBuilder(), "unknown", ":", str);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append('\n');
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        sb.append(stringWriter.toString());
        Log.println(i, A0M, sb.toString());
    }
}
