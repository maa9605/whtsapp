package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2Mg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C49762Mg {
    public static volatile C49762Mg A05;
    public Set A00;
    public final C018508q A01;
    public final C000500h A02;
    public final C0HY A03;
    public final C03340Fh A04;

    public C49762Mg(C018508q c018508q, C0HY c0hy, C000500h c000500h, C03340Fh c03340Fh) {
        this.A01 = c018508q;
        this.A03 = c0hy;
        this.A02 = c000500h;
        this.A04 = c03340Fh;
    }

    public static C49762Mg A00() {
        if (A05 == null) {
            synchronized (C03080Ec.class) {
                if (A05 == null) {
                    A05 = new C49762Mg(C018508q.A00(), C0HY.A00(), C000500h.A00(), C03340Fh.A00);
                }
            }
        }
        return A05;
    }

    public void A01() {
        if (this.A00 != null) {
            synchronized (this) {
                this.A00.clear();
                this.A02.A0D().remove("first_unseen_joinable_call").apply();
            }
            C018508q c018508q = this.A01;
            c018508q.A02.post(new RunnableEBaseShape7S0100000_I0_7(this.A04, 48));
        }
    }

    public final void A02() {
        HashSet hashSet;
        synchronized (this) {
            if (this.A00 == null) {
                long j = this.A02.A00.getLong("first_unseen_joinable_call", 0L);
                if (j > 0) {
                    C05R c05r = this.A03.A07;
                    if (c05r != null) {
                        ArrayList arrayList = new ArrayList();
                        C0CD A03 = c05r.A01.A03();
                        Cursor A07 = A03.A02.A07("SELECT _id, call_id, jid_row_id, from_me, transaction_id, timestamp, video_call, duration, call_result, bytes_transferred, group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id FROM call_log WHERE is_joinable_group_call = 1 AND _id >= ? ORDER BY _id ASC", new String[]{Long.toString(j)});
                        while (A07.moveToNext()) {
                            arrayList.add(A07.getString(A07.getColumnIndexOrThrow("call_id")));
                        }
                        A07.close();
                        A03.close();
                        hashSet = new HashSet(arrayList);
                        this.A00 = hashSet;
                    } else {
                        throw null;
                    }
                } else {
                    hashSet = new HashSet();
                    this.A00 = hashSet;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("UnseenJoinableCallsBadge/init count:");
                sb.append(hashSet.size());
                sb.append(" timestamp:");
                sb.append(j);
                Log.i(sb.toString());
            }
        }
    }

    public void A03(C0D3 c0d3) {
        A02();
        if (this.A00.isEmpty()) {
            C000200d.A0h(this.A02, "first_unseen_joinable_call", c0d3.A02());
        }
        synchronized (this) {
            this.A00.add(c0d3.A09.A02);
        }
        C018508q c018508q = this.A01;
        c018508q.A02.post(new RunnableEBaseShape7S0100000_I0_7(this.A04, 48));
    }
}
