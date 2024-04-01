package X;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Q7  reason: invalid class name */
/* loaded from: classes.dex */
public class C0Q7 extends AbstractC05100Nh implements InterfaceC05660Pp {
    public final C02L A00;
    public final C05M A01;
    public final C0F3 A02;
    public final C05C A03;

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 200;
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return "SELECT _id, gjid, jid, admin, pending, sent_sender_key FROM group_participants WHERE _id > ?  ORDER BY _id ASC LIMIT ?";
    }

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "migration_participant_user_retry";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "migration_participant_user_index";
    }

    public C0Q7(C02L c02l, C05M c05m, C05C c05c, C0F3 c0f3, C05670Pr c05670Pr) {
        super("participant_user", EditorInfoCompat.IME_FLAG_FORCE_ASCII, c05670Pr);
        this.A00 = c02l;
        this.A01 = c05m;
        this.A03 = c05c;
        this.A02 = c0f3;
    }

    @Override // X.AbstractC05100Nh
    public boolean A0I() {
        String A02 = this.A03.A02("participant_user_ready");
        return (A02 != null && Integer.parseInt(A02) == 1) || super.A0I();
    }

    @Override // X.AbstractC05100Nh
    public boolean A0L() {
        C02L c02l = this.A00;
        c02l.A05();
        return c02l.A03 != null;
    }

    @Override // X.AbstractC05100Nh
    public int A0Q() {
        return super.A02.A07(C01C.A2t) >= 2 ? 3 : 2;
    }

    @Override // X.AbstractC05100Nh
    public Pair A0T(Cursor cursor) {
        UserJid nullable;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("gjid");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("jid");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("admin");
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("pending");
        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("sent_sender_key");
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            j = cursor.getLong(columnIndexOrThrow);
            i++;
            int i2 = cursor.getInt(columnIndexOrThrow4);
            boolean z = cursor.getInt(columnIndexOrThrow5) != 0;
            boolean z2 = cursor.getInt(columnIndexOrThrow6) != 0;
            String A07 = C002501g.A07(cursor, columnIndexOrThrow2);
            AbstractC011205o A05 = AbstractC011205o.A05(A07);
            if (A05 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("participant-user-db-migration/process-batch: groupJid=");
                sb.append(A07);
                sb.append(", rowId=");
                sb.append(j);
                C000200d.A1O(sb, " SKIP Due to invalid MultipleParticipantJid.");
            } else if (z && this.A01.A07(A05) == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("participant-user-db-migration/process-batch: groupJid=");
                sb2.append(A07);
                sb2.append(", rowId=");
                sb2.append(j);
                C000200d.A1O(sb2, " SKIP Due to pending group which no longer exists.");
            } else {
                String A072 = C002501g.A07(cursor, columnIndexOrThrow3);
                if (TextUtils.isEmpty(A072)) {
                    C02L c02l = this.A00;
                    c02l.A05();
                    nullable = c02l.A03;
                } else {
                    nullable = UserJid.getNullable(A072);
                }
                if (nullable == null) {
                    StringBuilder sb3 = new StringBuilder("participant-user-db-migration/process-batch: participantUserJid=");
                    sb3.append(A072);
                    sb3.append(", rowId=");
                    sb3.append(j);
                    C000200d.A1O(sb3, " SKIP Due to invalid UserJid.");
                } else {
                    this.A02.A08(A05, new C0D7(nullable, i2, z, z2));
                }
            }
        }
        return Pair.create(Long.valueOf(j), Integer.valueOf(i));
    }

    @Override // X.AbstractC05100Nh
    public Set A0X() {
        HashSet hashSet = new HashSet();
        hashSet.add("migration_jid_store");
        hashSet.add("migration_chat_store");
        hashSet.add("blank_me_jid");
        return hashSet;
    }

    @Override // X.AbstractC05100Nh
    public void A0Y() {
        super.A0Y();
        this.A03.A04("participant_user_ready", 2);
    }

    @Override // X.AbstractC05100Nh
    public boolean A0b() {
        return this.A02.A0D();
    }

    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        this.A02.A05();
    }
}
