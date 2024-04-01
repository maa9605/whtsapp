package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.05L */
/* loaded from: classes.dex */
public class C05L {
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final String[] A06;
    public static volatile C05L A07;
    public final C05E A00;
    public final ThreadLocal A01 = new ThreadLocal();
    public final AtomicInteger A02 = new AtomicInteger(0);

    static {
        String[] strArr = {"chat_row_id", "from_me", "key_id", "sender_jid_row_id", "status", "broadcast", "recipient_count", "participant_hash", "origination_flags", "origin", "timestamp", "received_timestamp", "receipt_server_timestamp", "message_type", "text_data", "starred", "lookup_tables", "sort_id"};
        A06 = strArr;
        String join = TextUtils.join(",", strArr);
        A05 = join;
        StringBuilder A0P = C000200d.A0P("INSERT INTO message(");
        C000200d.A1T(A0P, join, "    , _id ", ") VALUES (");
        A0P.append(TextUtils.join(",", Collections.nCopies(A06.length + 1, "?")));
        A0P.append(")");
        A04 = A0P.toString();
        StringBuilder A0P2 = C000200d.A0P("INSERT INTO message(");
        A0P2.append(A05);
        A0P2.append(") VALUES (");
        A0P2.append(TextUtils.join(",", Collections.nCopies(A06.length, "?")));
        A0P2.append(")");
        A03 = A0P2.toString();
    }

    public C05L(C05E c05e) {
        this.A00 = c05e;
    }

    public static C05L A00() {
        if (A07 == null) {
            synchronized (C05L.class) {
                if (A07 == null) {
                    A07 = new C05L(C05E.A00());
                }
            }
        }
        return A07;
    }

    public C0CF A01(String str) {
        ThreadLocal threadLocal = this.A01;
        C27781Ot c27781Ot = (C27781Ot) threadLocal.get();
        if (c27781Ot == null) {
            c27781Ot = new C27781Ot(this.A02.get(), this.A00);
            threadLocal.set(c27781Ot);
        }
        int i = this.A02.get();
        if (i != c27781Ot.A00) {
            c27781Ot.A00();
            c27781Ot.A00 = i;
        }
        Map map = c27781Ot.A02;
        if (!map.containsKey(str)) {
            try {
                map.put(str, c27781Ot.A01.A03().A02.A0B(str));
            } finally {
            }
        }
        C0CF c0cf = (C0CF) map.get(str);
        c0cf.A00.clearBindings();
        return c0cf;
    }

    public void A02() {
        Log.i("statementsmanager/resetstatements");
        this.A02.incrementAndGet();
        C27781Ot c27781Ot = (C27781Ot) this.A01.get();
        if (c27781Ot != null) {
            c27781Ot.A00();
        }
    }
}
