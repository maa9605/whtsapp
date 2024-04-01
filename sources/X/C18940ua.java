package X;

import java.util.Arrays;

/* renamed from: X.0ua  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18940ua {
    public C18930uZ A00;
    public final C18930uZ A01;
    public final String A02;

    public C18940ua(String str) {
        C18930uZ c18930uZ = new C18930uZ();
        this.A01 = c18930uZ;
        this.A00 = c18930uZ;
        this.A02 = str;
    }

    public final void A00(String str, Object obj) {
        C18930uZ c18930uZ = new C18930uZ();
        this.A00.A00 = c18930uZ;
        this.A00 = c18930uZ;
        c18930uZ.A01 = obj;
        if (str != null) {
            c18930uZ.A02 = str;
            return;
        }
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.A02);
        sb.append('{');
        String str = "";
        for (C18930uZ c18930uZ = this.A01.A00; c18930uZ != null; c18930uZ = c18930uZ.A00) {
            Object obj = c18930uZ.A01;
            sb.append(str);
            String str2 = c18930uZ.A02;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
