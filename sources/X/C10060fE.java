package X;

import java.util.regex.Pattern;

/* renamed from: X.0fE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C10060fE {
    public C10070fF A00;

    public C10060fE(int i) {
        this.A00 = new C10070fF(i);
    }

    public Pattern A00(String str) {
        Object obj;
        C10070fF c10070fF = this.A00;
        synchronized (c10070fF) {
            obj = c10070fF.A01.get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern == null) {
            pattern = Pattern.compile(str);
            C10070fF c10070fF2 = this.A00;
            synchronized (c10070fF2) {
                c10070fF2.A01.put(str, pattern);
            }
        }
        return pattern;
    }
}
