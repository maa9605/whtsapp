package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0PY  reason: invalid class name */
/* loaded from: classes.dex */
public class C0PY {
    public final String A00;
    public final String A01;
    public final List A02;

    public C0PY(String str, String str2, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
    }

    public C0PY A00() {
        String str = this.A00;
        String str2 = this.A01;
        List list = this.A02;
        return new C0PY(str, str2, list != null ? new ArrayList(list) : null);
    }
}
