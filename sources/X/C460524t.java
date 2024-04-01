package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.24t  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C460524t {
    public static volatile C460524t A06;
    public final C02L A00;
    public final C05W A01;
    public final C018708s A02;
    public final C001200o A03;
    public final C002301c A04;
    public final C003401q A05;

    public C460524t(C001200o c001200o, C02L c02l, C003401q c003401q, C05W c05w, C018708s c018708s, C002301c c002301c) {
        this.A03 = c001200o;
        this.A00 = c02l;
        this.A05 = c003401q;
        this.A01 = c05w;
        this.A02 = c018708s;
        this.A04 = c002301c;
    }

    public static C460524t A00() {
        if (A06 == null) {
            synchronized (C460524t.class) {
                if (A06 == null) {
                    A06 = new C460524t(C001200o.A01, C02L.A00(), C003401q.A00(), C05W.A00(), C018708s.A00(), C002301c.A00());
                }
            }
        }
        return A06;
    }

    public final String A01(C04340Ju c04340Ju) {
        C003401q c003401q = this.A05;
        AbstractC005302j abstractC005302j = c04340Ju.A0n.A00;
        Object[] objArr = new Object[1];
        C05W c05w = this.A01;
        if (abstractC005302j != null) {
            String A08 = this.A02.A08(c05w.A0A(abstractC005302j), false);
            objArr[0] = A08 == null ? null : this.A04.A0E(A08);
            return c003401q.A03(abstractC005302j, R.string.identity_changed_name_md, objArr);
        }
        throw null;
    }

    public String A02(C04340Ju c04340Ju, String str) {
        if (this.A00.A0A(c04340Ju.A0G)) {
            C06C A0A = this.A01.A0A(c04340Ju.A0n.A00);
            if (A0A.A0C()) {
                return this.A03.A00.getString(R.string.self_device_change_group_chat_message);
            }
            if (A0A.A0D()) {
                return this.A03.A00.getString(R.string.self_device_change_list_chat_message);
            }
            return A01(c04340Ju);
        }
        AbstractC005302j abstractC005302j = c04340Ju.A0G;
        if (abstractC005302j == null) {
            return A01(c04340Ju);
        }
        return this.A05.A03(abstractC005302j, R.string.identity_changed_name_md, str);
    }
}
