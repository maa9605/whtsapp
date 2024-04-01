package X;

import android.icu.text.UnicodeSet;
import android.os.Build;

/* renamed from: X.2tD  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C59722tD {
    public static final C59722tD A02 = new C59722tD("");
    public static final boolean A03;
    public final UnicodeSet A00;
    public final String A01;

    static {
        A03 = Build.VERSION.SDK_INT >= 24;
    }

    public C59722tD(String str) {
        this.A01 = str;
        if (!A03) {
            return;
        }
        this.A00 = str.isEmpty() ? UnicodeSet.EMPTY : new UnicodeSet(str);
    }

    public boolean A00(int i) {
        int type;
        UnicodeSet unicodeSet;
        if (A03 && (unicodeSet = this.A00) != null) {
            return unicodeSet.contains(i);
        }
        String str = this.A01;
        int hashCode = str.hashCode();
        if (hashCode == -1633268329) {
            return (!str.equals("[:^S:]") || (type = Character.getType(i)) == 26 || type == 25 || type == 27 || type == 28) ? false : true;
        } else if (hashCode == -1605334735 && str.equals("[:digit:]")) {
            return Character.isDigit(i);
        }
        return false;
    }
}
