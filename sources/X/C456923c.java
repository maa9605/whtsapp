package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.23c  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C456923c {
    public static volatile C456923c A06;
    public final C02L A00;
    public final C05Q A01;
    public final C0C9 A02;
    public final C013206j A03;
    public final C0EG A04;
    public final InterfaceC002901k A05;

    public C456923c(C02L c02l, InterfaceC002901k interfaceC002901k, C0EG c0eg, C0C9 c0c9, C05Q c05q, C013206j c013206j) {
        this.A00 = c02l;
        this.A05 = interfaceC002901k;
        this.A04 = c0eg;
        this.A02 = c0c9;
        this.A01 = c05q;
        this.A03 = c013206j;
    }

    public static C456923c A00() {
        if (A06 == null) {
            synchronized (C456923c.class) {
                if (A06 == null) {
                    A06 = new C456923c(C02L.A00(), C002801j.A00(), C0EG.A00(), C0C9.A00(), C05Q.A00(), C013206j.A00());
                }
            }
        }
        return A06;
    }

    /* JADX WARN: Finally extract failed */
    public List A01(C011005l c011005l, long j) {
        C013206j c013206j = this.A03;
        C02L c02l = this.A00;
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid == null) {
            throw null;
        }
        if (c013206j != null) {
            ArrayList arrayList = new ArrayList();
            C05B c05b = c013206j.A01;
            String[] strArr = {Long.toString(c05b.A02(c011005l)), Long.toString(c05b.A02(userJid)), Long.toString(j)};
            C0CD A03 = c013206j.A02.A03();
            try {
                Cursor A07 = A03.A02.A07("SELECT chat_row_id, message_row_id FROM message_group_invite invite INNER JOIN message_view message ON invite.message_row_id = message._id WHERE invite.group_jid_row_id = ? AND invite.admin_jid_row_id = ? AND invite.expiration > ? AND invite.expired = 0", strArr);
                while (A07.moveToNext()) {
                    arrayList.add(Long.valueOf(A07.getLong(A07.getColumnIndexOrThrow("message_row_id"))));
                }
                A07.close();
                A03.close();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(this.A01.A01(((Number) it.next()).longValue()));
                }
                return arrayList2;
            } finally {
            }
        } else {
            throw null;
        }
    }
}
