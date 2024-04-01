package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.0IU */
/* loaded from: classes.dex */
public class C0IU {
    public int A00;
    public int A01;
    public int A02;
    public C0FK A03;
    public AbstractC005302j A04;
    public C28021Ps A05;
    public CharSequence A08;
    public List A09;
    public List A0B;
    public List A0C;
    public Map A0D;
    public final C002301c A0G;
    public List A0A = null;
    public Boolean A07 = null;
    public Boolean A06 = null;
    public boolean A0F = true;
    public boolean A0E = true;
    public final Object A0H = new Object();

    public C0IU(C002301c c002301c) {
        this.A0G = c002301c;
    }

    public final C0FK A00() {
        C0FK A00;
        if (TextUtils.isEmpty(this.A08)) {
            A00 = new C0FK(new ArrayList(), new ArrayList());
        } else {
            A00 = C09940f2.A00(A02(), false, this.A0G);
        }
        this.A03 = A00;
        return A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0009, code lost:
        if (r1 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Boolean A01() {
        /*
            r2 = this;
            java.lang.Boolean r0 = r2.A07
            if (r0 == 0) goto Lb
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IU.A01():java.lang.Boolean");
    }

    public String A02() {
        if (this.A08 == null) {
            C0FK c0fk = this.A03;
            if (c0fk == null) {
                return "";
            }
            Object obj = c0fk.A01;
            if (obj == null) {
                throw null;
            }
            if (((List) obj).isEmpty()) {
                return "";
            }
        }
        CharSequence charSequence = this.A08;
        if (charSequence == null) {
            return TextUtils.join(" ", A04());
        }
        return charSequence.toString();
    }

    public List A03() {
        List list;
        C0FK c0fk = this.A03;
        if (c0fk == null || (list = (List) c0fk.A00) == null || list.isEmpty()) {
            Object obj = A00().A00;
            if (obj != null) {
                return (List) obj;
            }
            throw null;
        }
        return list;
    }

    public List A04() {
        List list;
        C0FK c0fk = this.A03;
        if (c0fk == null || (list = (List) c0fk.A01) == null || list.isEmpty()) {
            Object obj = A00().A01;
            if (obj != null) {
                return (List) obj;
            }
            throw null;
        }
        return list;
    }

    public void A05(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        if (this.A03 == null) {
            this.A03 = new C0FK(new ArrayList(), list);
        }
        this.A08 = null;
    }

    public boolean A06() {
        return !A04().isEmpty();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n\tnormal: \"");
        sb.append(A02());
        sb.append("\";\ttokens: ");
        sb.append(A04());
        sb.append("\n\tlabel: \"");
        Object obj = this.A0C;
        if (obj == null) {
            obj = new ArrayList();
        }
        sb.append(obj);
        sb.append("\";\tjid: ");
        sb.append(this.A04);
        sb.append("\";\tstarred: ");
        sb.append(A01());
        sb.append("\n\tpage: ");
        sb.append(this.A00);
        sb.append("; pageSize: ");
        sb.append(this.A01);
        sb.append("\n\tcontact filters:");
        sb.append(this.A09);
        sb.append("\n\tcontact prefilters:");
        sb.append(this.A0A);
        sb.append("\n\tmapping: ");
        sb.append(A03());
        return sb.toString();
    }
}
