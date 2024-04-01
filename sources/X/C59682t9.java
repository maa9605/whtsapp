package X;

import java.util.regex.Matcher;

/* renamed from: X.2t9 */
/* loaded from: classes2.dex */
public class C59682t9 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C59682t9(String str, boolean z) {
        Matcher matcher = C2RW.A0B.matcher(str);
        matcher.find();
        this.A00 = matcher.group();
        if (z) {
            int indexOf = str.indexOf(164);
            this.A01 = str.substring(0, indexOf);
            this.A02 = str.substring(indexOf + 1);
            this.A03 = matcher.start() > indexOf;
            return;
        }
        this.A02 = "";
        this.A01 = "";
    }
}
