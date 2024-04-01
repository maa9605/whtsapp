package X;

/* renamed from: X.2t8  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C59672t8 {
    public final C59682t9 A00;
    public final C59682t9 A01;
    public final boolean A02;

    public C59672t8(String str, boolean z) {
        this.A02 = z;
        int indexOf = str.indexOf(59);
        if (indexOf == -1) {
            C59682t9 c59682t9 = new C59682t9(str, z);
            this.A00 = c59682t9;
            this.A01 = c59682t9;
            return;
        }
        this.A01 = new C59682t9(str.substring(0, indexOf), z);
        this.A00 = new C59682t9(str.substring(indexOf + 1), z);
    }

    public String A00() {
        String str = this.A01.A00;
        String str2 = this.A00.A00;
        if (str.equals(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(";");
        sb.append(str2);
        return sb.toString();
    }
}
