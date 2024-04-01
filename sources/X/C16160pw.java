package X;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0pw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16160pw {
    public View A00;
    public final Map A02 = new HashMap();
    public final ArrayList A01 = new ArrayList();

    public boolean equals(Object obj) {
        if (obj instanceof C16160pw) {
            C16160pw c16160pw = (C16160pw) obj;
            return this.A00 == c16160pw.A00 && this.A02.equals(c16160pw.A02);
        }
        return false;
    }

    public int hashCode() {
        return this.A02.hashCode() + (this.A00.hashCode() * 31);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("TransitionValues@");
        A0P.append(Integer.toHexString(hashCode()));
        A0P.append(":\n");
        StringBuilder A0V = C000200d.A0V(A0P.toString(), "    view = ");
        A0V.append(this.A00);
        A0V.append("\n");
        String A0H = C000200d.A0H(A0V.toString(), "    values:");
        Map map = this.A02;
        for (String str : map.keySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(A0H);
            sb.append("    ");
            sb.append(str);
            sb.append(": ");
            sb.append(map.get(str));
            sb.append("\n");
            A0H = sb.toString();
        }
        return A0H;
    }
}
