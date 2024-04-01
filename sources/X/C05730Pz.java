package X;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Pz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C05730Pz extends AbstractC05100Nh implements InterfaceC05660Pp {
    public final C06Z A00;
    public final C013206j A01;
    public final C012806f A02;
    public final C05S A03;
    public final C06J A04;
    public final C012306a A05;
    public final C013106i A06;
    public final C06R A07;
    public final C014606x A08;
    public final C012706e A09;
    public final C05C A0A;
    public final C06Y A0B;
    public final C06Q A0C;
    public final C06S A0D;
    public final C013006h A0E;

    @Override // X.AbstractC05100Nh
    public String A0B() {
        return "quoted_message_ready";
    }

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 2048;
    }

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "migration_message_quoted_retry";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "migration_message_quoted_index";
    }

    public C05730Pz(C05S c05s, C06Q c06q, C06R c06r, C05C c05c, C06Y c06y, C06S c06s, C06Z c06z, C012706e c012706e, C012306a c012306a, C012806f c012806f, C013006h c013006h, C06J c06j, C013106i c013106i, C013206j c013206j, C014606x c014606x, C05670Pr c05670Pr) {
        super("message_quoted", 2, c05670Pr);
        this.A03 = c05s;
        this.A0C = c06q;
        this.A07 = c06r;
        this.A0A = c05c;
        this.A0B = c06y;
        this.A0D = c06s;
        this.A00 = c06z;
        this.A09 = c012706e;
        this.A05 = c012306a;
        this.A02 = c012806f;
        this.A0E = c013006h;
        this.A04 = c06j;
        this.A06 = c013106i;
        this.A01 = c013206j;
        this.A08 = c014606x;
    }

    @Override // X.AbstractC05100Nh
    public long A05() {
        return super.A09.A03();
    }

    @Override // X.AbstractC05100Nh
    public Pair A0T(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("parent_row_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("parent_key_remote_jid");
        C0CD A04 = super.A05.A04();
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            try {
                j = cursor.getLong(columnIndexOrThrow);
                AbstractC005302j A02 = AbstractC005302j.A02(cursor.getString(columnIndexOrThrow2));
                if (A02 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("QuotedMessageStore/QuotedMessageDatabaseMigration/processBatch/missing chatJid; rowId=");
                    sb.append(j);
                    Log.e(sb.toString());
                } else {
                    AnonymousClass092 A022 = this.A03.A02(cursor);
                    if (A022 == null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("QuotedMessageStore/QuotedMessageDatabaseMigration/processBatch/missing quotedMessage; rowId=");
                        sb2.append(j);
                        Log.e(sb2.toString());
                    } else {
                        A022.A0Z(2);
                        try {
                            C06Y c06y = this.A0B;
                            c06y.A05(A022, j);
                            A04.A02.A05("message_quoted", c06y.A01(A022, j, A02));
                            if (A022.A0E() != null) {
                                A022.A0E().A02(A022.A0E().A07());
                            }
                            if (A022 instanceof C04160Iu) {
                                this.A09.A01((C04160Iu) A022, j);
                            }
                            if (A022 instanceof C10040fC) {
                                this.A00.A01((C10040fC) A022, j);
                            }
                            if (A022 instanceof C04570Ky) {
                                this.A01.A06((C04570Ky) A022, j);
                            }
                            if (A022 instanceof C0LN) {
                                this.A07.A03((C0LN) A022, j);
                            }
                            if (A022 instanceof C0LU) {
                                this.A06.A07((C0LU) A022, j);
                            }
                            if (A022.A11()) {
                                this.A06.A03(A022.A0D().A00, j, "message_quoted_ui_elements");
                            }
                            if (A022 instanceof C0LV) {
                                this.A06.A09((C0LV) A022, j, "message_quoted_ui_elements_reply");
                            }
                            if (A022 instanceof C05510Pa) {
                                this.A06.A05((C05510Pa) A022, j, "message_quoted_ui_elements_reply");
                            }
                            if (A022 instanceof C0KD) {
                                this.A02.A03((C0KD) A022, j);
                            }
                            if (A022 instanceof AnonymousClass097) {
                                this.A04.A0C((AnonymousClass097) A022, j);
                            }
                            if (A022 instanceof C09C) {
                                C013006h c013006h = this.A0E;
                                C09C c09c = (C09C) A022;
                                if (c013006h != null) {
                                    c013006h.A02(j, c09c.ADw(), c013006h.A01.A01("INSERT OR REPLACE INTO message_quoted_view_once_media (message_row_id, state) VALUES (?, ?)"));
                                } else {
                                    throw null;
                                }
                            }
                            if (A022.A12()) {
                                this.A05.A02(A022, j);
                            }
                            if (A022 instanceof C0D8) {
                                C06S c06s = this.A0D;
                                C0D8 c0d8 = (C0D8) A022;
                                if (c06s != null) {
                                    String A18 = c0d8.A18();
                                    if (!TextUtils.isEmpty(A18)) {
                                        c06s.A06(A18, j);
                                    }
                                } else {
                                    throw null;
                                }
                            } else if (A022 instanceof C0DA) {
                                this.A0D.A04((C0DA) A022, j);
                            }
                            if (A022 instanceof C0JJ) {
                                this.A0C.A02(A022, j, false);
                            }
                            if (A022 instanceof C0LT) {
                                this.A08.A02((C0LT) A022, "SELECT message_row_id, service, expiration_timestamp FROM message_quoted_payment_invite WHERE message_row_id = ?");
                            }
                            i++;
                        } catch (IllegalArgumentException | IllegalStateException unused) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("QuotedMessageStore/QuotedMessageDatabaseMigration/processBatch/missing information, skipping; rowId=");
                            sb3.append(j);
                            Log.e(sb3.toString());
                        }
                    }
                }
            } finally {
            }
        }
        A04.close();
        return Pair.create(Long.valueOf(j), Integer.valueOf(i));
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return AbstractC60072ts.A03;
    }

    @Override // X.AbstractC05100Nh
    public Set A0X() {
        HashSet hashSet = new HashSet();
        hashSet.add("migration_jid_store");
        hashSet.add("migration_chat_store");
        return hashSet;
    }

    @Override // X.AbstractC05100Nh
    public boolean A0b() {
        return this.A0B.A07();
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        C0CD A04 = super.A05.A04();
        try {
            C03790Hb A00 = A04.A00();
            C0CE c0ce = A04.A02;
            c0ce.A01("message_quoted", null, null);
            c0ce.A01("message_quoted_location", null, null);
            c0ce.A01("message_quoted_media", null, null);
            c0ce.A01("message_quoted_mentions", null, null);
            c0ce.A01("message_quoted_vcard", null, null);
            c0ce.A01("message_quoted_text", null, null);
            c0ce.A01("message_quoted_group_invite", null, null);
            c0ce.A01("message_quoted_product", null, null);
            c0ce.A01("message_quoted_order", null, null);
            c0ce.A01("message_quoted_ui_elements", null, null);
            c0ce.A01("message_quoted_ui_elements_reply", null, null);
            c0ce.A0C("DELETE FROM message_quoted_ui_elements_reply_legacy");
            C05C c05c = this.A0A;
            c05c.A03("quoted_message_ready");
            c05c.A03("migration_message_quoted_index");
            c05c.A03("migration_message_quoted_retry");
            A00.A00();
            A00.close();
            A04.close();
            Log.i("QuotedMessageStore/resetDatabaseMigration/done");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }
}
