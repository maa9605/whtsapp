package X;

import com.whatsapp.util.Log;
import java.io.PrintStream;

/* renamed from: X.3MZ */
/* loaded from: classes2.dex */
public class C3MZ {
    public static AbstractC68823Mb A00 = new AbstractC68823Mb() { // from class: X.3gL
    };

    public static void A00(EnumC68813Ma enumC68813Ma, String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        AbstractC68823Mb abstractC68823Mb = A00;
        String obj = stackTrace[2].toString();
        if (!(abstractC68823Mb instanceof C85323vD)) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder();
            sb.append(enumC68813Ma);
            sb.append(": ");
            sb.append(obj);
            sb.append(" : ");
            sb.append(str);
            printStream.println(sb.toString());
            return;
        }
        int ordinal = enumC68813Ma.ordinal();
        if (ordinal == 2) {
            C000200d.A18(obj, " :", str);
        } else if (ordinal == 3) {
            C000200d.A19(obj, " :", str);
        } else if (ordinal == 4) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(" :");
            sb2.append(str);
            Log.e(sb2.toString());
        } else if (ordinal != 5) {
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append(" :");
            sb3.append(str);
            Log.a(sb3.toString());
        }
    }
}
