package X;

import java.util.List;

/* renamed from: X.1wP */
/* loaded from: classes2.dex */
public abstract class AbstractC42841wP {
    public String A00;

    public String toString() {
        String obj;
        if (this instanceof C42911wX) {
            return "web-status-seen";
        }
        if (this instanceof C43041wk) {
            C43041wk c43041wk = (C43041wk) this;
            StringBuilder A0P = C000200d.A0P("qr_response type: ");
            A0P.append(c43041wk.A00);
            A0P.append(" id: ");
            A0P.append(c43041wk.A03);
            A0P.append(" #details: ");
            List list = c43041wk.A04;
            A0P.append(list != null ? Integer.valueOf(list.size()) : "-");
            return A0P.toString();
        } else if (this instanceof C42901wW) {
            StringBuilder A0P2 = C000200d.A0P("qr_msg_recv ");
            A0P2.append(((C42901wW) this).A02);
            return A0P2.toString();
        } else if (this instanceof C462325s) {
            StringBuilder A0P3 = C000200d.A0P("web_identity_changed/");
            A0P3.append(((C462325s) this).A00);
            return A0P3.toString();
        } else if (this instanceof C462425t) {
            return "web-frequent-contacts";
        } else {
            if (this instanceof C42861wS) {
                C42861wS c42861wS = (C42861wS) this;
                StringBuilder sb = new StringBuilder();
                for (AnonymousClass092 anonymousClass092 : c42861wS.A03) {
                    sb.append(" ");
                    sb.append(anonymousClass092.A0n);
                }
                StringBuilder A0P4 = C000200d.A0P("qr_del_msgs ");
                A0P4.append(c42861wS.A01);
                A0P4.append((Object) sb);
                A0P4.append(" ");
                A0P4.append(c42861wS.A00);
                return A0P4.toString();
            } else if (this instanceof C42921wY) {
                return ((C42921wY) this).A01.toString();
            } else {
                if (this instanceof C42871wT) {
                    C42871wT c42871wT = (C42871wT) this;
                    StringBuilder A0P5 = C000200d.A0P("qr_chat_seen/");
                    A0P5.append(c42871wT.A00);
                    A0P5.append("/");
                    A0P5.append(c42871wT.A02);
                    return A0P5.toString();
                } else if (this instanceof C42831wO) {
                    StringBuilder A0P6 = C000200d.A0P("qr_bclist_recipients ");
                    A0P6.append(((C42831wO) this).A00);
                    return A0P6.toString();
                } else if (this instanceof C25u) {
                    C25u c25u = (C25u) this;
                    StringBuilder A0P7 = C000200d.A0P("qr_star_msgs ");
                    A0P7.append(c25u.A01);
                    A0P7.append(' ');
                    A0P7.append(c25u.A04);
                    A0P7.append(' ');
                    A0P7.append(c25u.A00);
                    for (AnonymousClass092 anonymousClass0922 : c25u.A03) {
                        A0P7.append(" ");
                        A0P7.append(anonymousClass0922.A0n);
                    }
                    return A0P7.toString();
                } else if (!(this instanceof C43051wl)) {
                    C25v c25v = (C25v) this;
                    StringBuilder A0P8 = C000200d.A0P("qr_contacts count: ");
                    A0P8.append(c25v.A02.size());
                    A0P8.append(" checksum: ");
                    A0P8.append(c25v.A01);
                    return A0P8.toString();
                } else {
                    C43051wl c43051wl = (C43051wl) this;
                    String str = c43051wl.A04;
                    if (str == null) {
                        obj = "most recent msgs";
                    } else {
                        StringBuilder A0P9 = C000200d.A0P("msg query id: ");
                        A0P9.append(str);
                        obj = A0P9.toString();
                    }
                    StringBuilder A0W = C000200d.A0W("qr_msgs/", obj, "/fwdType:");
                    A0W.append(c43051wl.A00);
                    A0W.append("/qryType:");
                    A0W.append(c43051wl.A01);
                    A0W.append("/firstUnread:");
                    A0W.append(c43051wl.A03);
                    A0W.append("/#msgs:");
                    A0W.append(c43051wl.A05.size());
                    return A0W.toString();
                }
            }
        }
    }
}
