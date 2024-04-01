package X;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.0QJ */
/* loaded from: classes.dex */
public class C0QJ extends AbstractC05650Po implements InterfaceC05660Pp {
    public static final C3AF A06 = new C3AF(null);
    public C3AF A00;
    public final C02L A01;
    public final C05Q A02;
    public final C05E A03;
    public final C05O A04;
    public final C0QI A05;

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "message_main_verification_retry_count";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "message_main_verification_start_index";
    }

    public C0QJ(C02L c02l, C05O c05o, C05Q c05q, C05E c05e, C0QI c0qi, C05670Pr c05670Pr) {
        super(c05670Pr);
        this.A00 = A06;
        this.A01 = c02l;
        this.A04 = c05o;
        this.A02 = c05q;
        this.A03 = c05e;
        this.A05 = c0qi;
    }

    @Override // X.AbstractC05100Nh
    public boolean A0L() {
        C05E c05e = this.A03;
        C0CD A03 = c05e.A03();
        try {
            c05e.A05();
            return c05e.A06.A0P(A03);
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A03.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // X.AbstractC05650Po, X.AbstractC05100Nh
    public Pair A0T(Cursor cursor) {
        Pair A0T = super.A0T(cursor);
        if (this.A00 != null) {
            return A0T;
        }
        throw null;
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return C60372uN.A00;
    }

    @Override // X.AbstractC05100Nh
    public Set A0X() {
        HashSet hashSet = new HashSet();
        hashSet.add("message_main");
        return hashSet;
    }

    @Override // X.AbstractC05650Po, X.AbstractC05100Nh
    public void A0Y() {
        super.A0Y();
        this.A06.A04("message_main_verification_done", 1);
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.AbstractC05650Po, X.AbstractC05100Nh
    public void A0Z() {
        A0f();
        Set set = ((AbstractC05650Po) this).A01;
        if (set != null && set.size() > 0) {
            A0e();
        }
        C0CD A04 = this.A03.A04();
        try {
            C03790Hb A00 = A04.A00();
            A04.A02.A0C("DROP VIEW IF EXISTS message_view_old_schema");
            A00.A00();
            A00.close();
            A04.close();
            if (this.A00 == null) {
                throw null;
            }
        } finally {
        }
    }

    @Override // X.AbstractC05650Po, X.AbstractC05100Nh
    public void A0a() {
        super.A0a();
        C0CD A04 = this.A03.A04();
        try {
            A04.A02.A0C("CREATE VIEW IF NOT EXISTS message_view_old_schema AS SELECT messages._id AS _id, messages._id AS sort_id, chat._id AS chat_row_id, key_from_me AS from_me, key_id, -1 AS sender_jid_row_id, remote_resource AS sender_jid_raw_string, status, needs_push AS broadcast, recipient_count, participant_hash, forwarded AS origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, CAST (CASE WHEN (messages.media_wa_type = 0 AND messages.status=6) THEN 7 ELSE messages.media_wa_type END AS INTEGER) AS message_type, '' as text_data, starred, lookup_tables, data, media_url, media_mime_type, media_size, media_name, media_caption, media_hash, media_duration, latitude, longitude, thumb_image, raw_data, quoted_row_id, mentioned_jids, multicast_id, edit_version, media_enc_hash, payment_transaction_id, preview_type, receipt_device_timestamp, read_device_timestamp, played_device_timestamp, 1 AS table_version FROM messages JOIN jid AS chat_jid ON messages.key_remote_jid= chat_jid.raw_string JOIN chat AS chat ON chat.jid_row_id = chat_jid._id");
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // X.AbstractC05100Nh
    public boolean A0b() {
        String A02 = this.A06.A02("message_main_verification_done");
        return A02 != null && Integer.parseInt(A02) == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:0x007c, code lost:
        if (((r4.A0t & 2) == 2) != false) goto L159;
     */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0296 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC05650Po
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A0c(android.database.Cursor r19) {
        /*
            Method dump skipped, instructions count: 867
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QJ.A0c(android.database.Cursor):java.lang.String");
    }

    public final void A0g(AnonymousClass092 anonymousClass092, AnonymousClass092 anonymousClass0922) {
        AnonymousClass092 A0C;
        C0KC c0kc;
        C0K0 c0k0;
        if (anonymousClass092.A03() != anonymousClass0922.A03()) {
            anonymousClass092.A01 = anonymousClass0922.A01;
        }
        if (anonymousClass0922.A03() == 0) {
            if (anonymousClass0922.A0G() == null) {
                anonymousClass092.A0l(null);
            }
        } else if (anonymousClass0922.A15() == null) {
            anonymousClass092.A0w(null);
        }
        if (anonymousClass092 instanceof C0JJ) {
            C0JJ c0jj = (C0JJ) anonymousClass092;
            if (TextUtils.isEmpty(c0jj.A02)) {
                c0jj.A02 = null;
            }
            C0JJ c0jj2 = (C0JJ) anonymousClass0922;
            if (TextUtils.isEmpty(c0jj2.A02)) {
                c0jj2.A02 = null;
            }
            if (TextUtils.isEmpty(c0jj.A04)) {
                c0jj.A04 = null;
            }
            if (TextUtils.isEmpty(c0jj2.A04)) {
                c0jj2.A04 = null;
            }
            if (TextUtils.isEmpty(c0jj.A05)) {
                c0jj.A05 = null;
            }
            if (TextUtils.isEmpty(c0jj2.A05)) {
                c0jj2.A05 = null;
            }
        }
        if (anonymousClass092 instanceof C0DA) {
            C0DA c0da = (C0DA) anonymousClass092;
            c0da.A18();
            anonymousClass092.A0w(null);
            anonymousClass0922.A0w(null);
            List A18 = c0da.A18();
            List A182 = ((C0DA) anonymousClass0922).A18();
            if (!A18.equals(A182) && !A18.isEmpty() && A18.size() == A182.size()) {
                Collections.sort(A18);
                Collections.sort(A182);
            }
        }
        if (anonymousClass092 instanceof C03890Hn) {
            anonymousClass092.A00 = 7;
        }
        if ((anonymousClass092 instanceof C0KC) && anonymousClass092.A0n.A02 && (c0k0 = (c0kc = (C0KC) anonymousClass092).A02) != null) {
            UserJid userJid = c0k0.A06;
            C02L c02l = this.A01;
            c02l.A05();
            UserJid userJid2 = c02l.A03;
            if (userJid2 != null && !userJid.equals(userJid2)) {
                C0K0 c0k02 = new C0K0(userJid2);
                c0k02.A00 = c0k0.A00;
                c0k02.A01 = c0k0.A01;
                c0k02.A03 = c0k0.A03;
                c0k02.A02 = c0k0.A02;
                c0k02.A04 = c0k0.A04;
                c0k02.A05 = c0k0.A05;
                c0kc.A02 = c0k02;
            }
        }
        anonymousClass092.A0C = anonymousClass0922.A0C;
        List list = anonymousClass092.A0c;
        if (list != null) {
            ArrayList arrayList = new ArrayList(new HashSet(list));
            Collections.sort(arrayList);
            anonymousClass092.A0v(arrayList);
        }
        List list2 = anonymousClass0922.A0c;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(new HashSet(list2));
            Collections.sort(arrayList2);
            anonymousClass0922.A0v(arrayList2);
        }
        anonymousClass0922.A0B = anonymousClass092.A0B;
        if ((anonymousClass092 instanceof C04390Jz) && (anonymousClass0922 instanceof C04390Jz) && ((C04390Jz) anonymousClass092).A00 == null) {
            C04390Jz c04390Jz = (C04390Jz) anonymousClass0922;
            if (c04390Jz.A00 != null) {
                c04390Jz.A00 = null;
            }
        }
        if ((anonymousClass092 instanceof C09E) && (anonymousClass0922 instanceof C09E)) {
            AnonymousClass097 anonymousClass097 = (AnonymousClass097) anonymousClass092;
            anonymousClass097.A08 = anonymousClass097.A1B();
            AnonymousClass097 anonymousClass0972 = (AnonymousClass097) anonymousClass0922;
            anonymousClass0972.A08 = anonymousClass0972.A1B();
        }
        AnonymousClass092 A0C2 = anonymousClass092.A0C();
        if (A0C2 == null || (A0C = anonymousClass0922.A0C()) == null) {
            return;
        }
        A0C2.A0p = A0C.A0p;
        anonymousClass092.A0C().A0q = anonymousClass0922.A0C().A0q;
        anonymousClass092.A0C().A0Q();
        anonymousClass0922.A0C().A0Q();
        AnonymousClass092 A0C3 = anonymousClass092.A0C();
        AnonymousClass092 A0C4 = anonymousClass0922.A0C();
        A0C3.A0a = A0C4.A0a;
        A0C3.A0C = A0C4.A0C;
        A0C3.A06 = A0C4.A06;
        A0C3.A0X(A0C4.A05());
        A0C3.A0m(A0C4.A0H());
        AnonymousClass092 A0C5 = anonymousClass092.A0C();
        A0C5.A05 = (A0C5.A07() ^ (-1)) & A0C5.A05;
        AnonymousClass092 A0C6 = anonymousClass092.A0C();
        A0C6.A0f = false;
        A0C6.A0d(anonymousClass0922.A0C().A0A());
        AnonymousClass092 A0C7 = anonymousClass092.A0C();
        if (A0C7 instanceof C0JJ) {
            C0JJ c0jj3 = (C0JJ) A0C7;
            C0JJ c0jj4 = (C0JJ) anonymousClass0922.A0C();
            c0jj3.A02 = c0jj4.A02;
            c0jj3.A04 = c0jj4.A04;
            c0jj3.A05 = c0jj4.A05;
            c0jj3.A1C(c0jj4.A1D());
            byte[] A1D = c0jj3.A1D();
            c0jj3.A1A(null);
            c0jj3.A1C(A1D);
        }
        if (A0C7 instanceof AnonymousClass097) {
            C09H c09h = ((AnonymousClass097) A0C7).A02;
            C09H c09h2 = ((AnonymousClass097) anonymousClass0922.A0C()).A02;
            if (c09h != null && c09h2 != null) {
                c09h.A0Q = c09h2.A0Q;
                c09h.A0S = c09h2.A0S;
                c09h.A0T = c09h2.A0T;
                c09h.A00 = c09h2.A00;
                c09h.A0C = c09h2.A0C;
                c09h.A0L = c09h2.A0L;
                c09h.A09 = c09h2.A09;
                c09h.A0V = c09h2.A0V;
                c09h.A0O = c09h2.A0O;
                c09h.A0M = c09h2.A0M;
                c09h.A05 = c09h2.A05;
                c09h.A02 = c09h2.A02;
                c09h.A03 = c09h2.A03;
                c09h.A0D = c09h2.A0D;
                c09h.A0E = c09h2.A0E;
                c09h.A07 = c09h2.A07;
            }
        }
        if (A0C7 instanceof C0KD) {
            ((C0KD) A0C7).A02 = ((C0KD) anonymousClass0922.A0C()).A02;
        }
        if (A0C7 instanceof C0KC) {
            C0KC c0kc2 = (C0KC) A0C7;
            C0KC c0kc3 = (C0KC) anonymousClass0922.A0C();
            if (c0kc3 != null) {
                c0kc2.A01 = c0kc3.A01;
                c0kc2.A00 = c0kc3.A00;
                c0kc2.A02 = c0kc3.A02;
            }
        }
        if (A0C7 instanceof C03890Hn) {
            ((C03890Hn) A0C7).A00 = ((C03890Hn) anonymousClass0922.A0C()).A00;
        }
        if (A0C7 instanceof C0KT) {
            ((C0KT) A0C7).A00 = ((C0KT) anonymousClass0922.A0C()).A00;
        }
        A0g(A0C7, anonymousClass0922.A0C());
    }

    @Override // X.AbstractC05650Po, X.InterfaceC05660Pp
    public void onRollback() {
        A0d();
        C0CD A04 = this.A03.A04();
        try {
            A04.A02.A0C("DROP VIEW IF EXISTS message_view_old_schema");
            this.A06.A03("message_main_verification_done");
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
