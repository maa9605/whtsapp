package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0se  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17770se {
    public C0sW A00;
    public String A01;
    public List A02 = null;
    public List A03 = null;

    public C17770se(C0sW c0sW, String str) {
        this.A00 = c0sW == null ? C0sW.DESCENDANT : c0sW;
        this.A01 = str;
    }

    public void A00(String str, EnumC17680sU enumC17680sU, String str2) {
        List list = this.A02;
        if (list == null) {
            list = new ArrayList();
            this.A02 = list;
        }
        list.add(new C17670sT(str, enumC17680sU, str2));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        C0sW c0sW = this.A00;
        if (c0sW == C0sW.CHILD) {
            sb.append("> ");
        } else if (c0sW == C0sW.FOLLOWS) {
            sb.append("+ ");
        }
        String str = this.A01;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        List<C17670sT> list = this.A02;
        if (list != null) {
            for (C17670sT c17670sT : list) {
                sb.append('[');
                sb.append(c17670sT.A01);
                int ordinal = c17670sT.A00.ordinal();
                if (ordinal == 1) {
                    sb.append('=');
                    sb.append(c17670sT.A02);
                } else if (ordinal == 2) {
                    sb.append("~=");
                    sb.append(c17670sT.A02);
                } else if (ordinal == 3) {
                    sb.append("|=");
                    sb.append(c17670sT.A02);
                }
                sb.append(']');
            }
        }
        List list2 = this.A03;
        if (list2 != null) {
            for (Object obj : list2) {
                sb.append(':');
                sb.append(obj);
            }
        }
        return sb.toString();
    }
}
