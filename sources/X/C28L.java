package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.28L */
/* loaded from: classes2.dex */
public class C28L {
    public static volatile C28L A02;
    public C07E A00;
    public final C00J A01;

    public C28L(C00J c00j) {
        this.A01 = c00j;
    }

    public static C28L A00() {
        if (A02 == null) {
            synchronized (C28L.class) {
                if (A02 == null) {
                    A02 = new C28L(C007203d.A00(new InterfaceC007103c() { // from class: X.2Dm
                        @Override // X.InterfaceC007103c
                        public final Object get() {
                            if (C05670Pr.A0u == null) {
                                synchronized (C05670Pr.class) {
                                    if (C05670Pr.A0u == null) {
                                        AnonymousClass012 A002 = AnonymousClass012.A00();
                                        C003701t A003 = C003701t.A00();
                                        C05B A004 = C05B.A00();
                                        C05A A005 = C05A.A00();
                                        AbstractC000600i A006 = AbstractC000600i.A00();
                                        C02L A007 = C02L.A00();
                                        C05M A008 = C05M.A00();
                                        C05O A009 = C05O.A00();
                                        AnonymousClass011 A0010 = AnonymousClass011.A00();
                                        C01B A0011 = C01B.A00();
                                        C0EB A0012 = C0EB.A00();
                                        C05R A0013 = C05R.A00();
                                        C0GU A0014 = C0GU.A00();
                                        C0D5 A0015 = C0D5.A00();
                                        C03690Gr A0016 = C03690Gr.A00();
                                        C05S A0017 = C05S.A00();
                                        C42781wJ A0018 = C42781wJ.A00();
                                        C06Q A0019 = C06Q.A00();
                                        C0HY A0020 = C0HY.A00();
                                        C000400f A0021 = C000400f.A00();
                                        C28L A0022 = C28L.A00();
                                        C06R A0023 = C06R.A00();
                                        C05C A0024 = C05C.A00();
                                        C48072Dr A0025 = C48072Dr.A00();
                                        C05L A0026 = C05L.A00();
                                        C06S A0027 = C06S.A00();
                                        C05Q A0028 = C05Q.A00();
                                        C06W A0029 = C06W.A00();
                                        C06X A0030 = C06X.A00();
                                        C06Y A0031 = C06Y.A00();
                                        C0E9 A0032 = C0E9.A00();
                                        C06O A0033 = C06O.A00();
                                        C06Z A0034 = C06Z.A00();
                                        C012706e A0035 = C012706e.A00();
                                        C012306a A0036 = C012306a.A00();
                                        C05E A0037 = C05E.A00();
                                        if (C48082Ds.A05 == null) {
                                            synchronized (C48082Ds.class) {
                                                if (C48082Ds.A05 == null) {
                                                    C48082Ds.A05 = new C48082Ds(AnonymousClass012.A00(), C003701t.A00(), C0EG.A00());
                                                }
                                            }
                                        }
                                        C48082Ds c48082Ds = C48082Ds.A05;
                                        C014706y A0038 = C014706y.A00();
                                        C0G2 A0039 = C0G2.A00();
                                        C03730Gv A0040 = C03730Gv.A00();
                                        C012806f A0041 = C012806f.A00();
                                        C0F3 A0042 = C0F3.A00();
                                        C42791wK A0043 = C42791wK.A00();
                                        C013006h A0044 = C013006h.A00();
                                        AnonymousClass070.A01();
                                        C06J A01 = C06J.A01();
                                        C0H0 A0045 = C0H0.A00();
                                        C06I A0046 = C06I.A00();
                                        C013106i A012 = C013106i.A01();
                                        C47962Dg A0047 = C47962Dg.A00();
                                        C013206j A0048 = C013206j.A00();
                                        C0FE A0049 = C0FE.A00();
                                        C013306k A07 = C013306k.A07();
                                        if (C0QI.A06 == null) {
                                            synchronized (C0QI.class) {
                                                if (C0QI.A06 == null) {
                                                    C0QI.A06 = new C0QI(new C48092Dt(null));
                                                }
                                            }
                                        }
                                        C0QI c0qi = C0QI.A06;
                                        if (C0Q1.A03 == null) {
                                            synchronized (C0Q1.class) {
                                                if (C0Q1.A03 == null) {
                                                    C0Q1.A03 = new C0Q1(C05B.A00(), AbstractC000600i.A00(), C05U.A01());
                                                }
                                            }
                                        }
                                        C0Q1 c0q1 = C0Q1.A03;
                                        C02O.A00();
                                        C03020Dv.A00();
                                        C42431vj A0050 = C42431vj.A00();
                                        C014606x A0051 = C014606x.A00();
                                        AnonymousClass079.A00();
                                        C05670Pr.A0u = new C05670Pr(A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028, A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, A0037, c48082Ds, A0038, A0039, A0040, A0041, A0042, A0043, A0044, A01, A0045, A0046, A012, A0047, A0048, A0049, A07, c0qi, c0q1, A0050, A0051);
                                    }
                                }
                            }
                            return C05670Pr.A0u;
                        }
                    }));
                }
            }
        }
        return A02;
    }

    public static void A01(Map map, AbstractC05100Nh abstractC05100Nh) {
        String str = abstractC05100Nh.A0B;
        if (str != null) {
            if (map.containsKey(str)) {
                C000200d.A15("MigrationRegistry/addMigration/duplicate; name=", str);
            }
            map.put(str, abstractC05100Nh);
            return;
        }
        throw null;
    }

    public C07E A02() {
        synchronized (this) {
            if (this.A00 == null) {
                C05670Pr c05670Pr = (C05670Pr) this.A01.get();
                HashMap hashMap = new HashMap();
                C05B c05b = c05670Pr.A0G;
                C0GU c0gu = c05670Pr.A0H;
                C05C c05c = c05670Pr.A0Y;
                C05L c05l = c05670Pr.A0g;
                A01(hashMap, new C0Ps(c05b, c0gu, c05c, c05l, c05670Pr));
                A01(hashMap, new C05680Pt(c05c, c05670Pr.A0D, c05670Pr));
                A01(hashMap, new C05690Pu(c05670Pr.A0I, c05c, c05l, c05670Pr));
                C05R c05r = c05670Pr.A07;
                C05S c05s = c05670Pr.A0K;
                A01(hashMap, new C0Pq(c05r, c05s, c05c, c05l, c05670Pr));
                AbstractC000600i abstractC000600i = c05670Pr.A00;
                C02L c02l = c05670Pr.A01;
                C42781wJ c42781wJ = c05670Pr.A0b;
                C05Q c05q = c05670Pr.A06;
                C05E c05e = c05670Pr.A0O;
                A01(hashMap, new C48032Dn(c05b, abstractC000600i, c02l, c42781wJ, c05c, c05q, c05e, c05670Pr.A0c, c05670Pr));
                C05A c05a = c05670Pr.A0A;
                C06Q c06q = c05670Pr.A0j;
                C06I c06i = c05670Pr.A0k;
                A01(hashMap, new C0Pv(c05a, c06q, c05c, c05l, c06i, c05670Pr));
                C06S c06s = c05670Pr.A0l;
                A01(hashMap, new C05700Pw(c05c, c06s, c05670Pr));
                A01(hashMap, new C05710Px(c05c, c05l, c05670Pr.A0E, c05670Pr));
                A01(hashMap, new AbstractC05100Nh(c05s, c05q, c05670Pr.A0R, c05670Pr) { // from class: X.0Py
                    public final C05Q A00;
                    public final C05S A01;
                    public final C06X A02;

                    @Override // X.AbstractC05100Nh
                    public int A0R() {
                        return 25;
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0V() {
                        return "migration_missed_calls_log_retry";
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0W() {
                        return "migration_missed_calls_log_index";
                    }

                    {
                        super("missed_calls", EditorInfoCompat.IME_FLAG_FORCE_ASCII, c05670Pr);
                        this.A01 = c05s;
                        this.A00 = c05q;
                        this.A02 = r5;
                    }

                    @Override // X.AbstractC05100Nh
                    public long A05() {
                        return this.A09.A03();
                    }

                    @Override // X.AbstractC05100Nh
                    public Pair A0T(Cursor cursor) {
                        C04280Jo c04280Jo;
                        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
                        long j = -1;
                        int i = 0;
                        while (cursor.moveToNext()) {
                            j = cursor.getLong(columnIndexOrThrow);
                            try {
                                c04280Jo = (C04280Jo) this.A00.A02(cursor);
                            } catch (SQLException e) {
                                throw e;
                            } catch (Exception e2) {
                                StringBuilder sb = new StringBuilder("MissedCallsLogDatabaseMigration/processBatch/failed to read message with id = ");
                                sb.append(j);
                                Log.e(sb.toString(), e2);
                                c04280Jo = null;
                            }
                            if (c04280Jo != null) {
                                this.A02.A02(c04280Jo);
                                c04280Jo.A0o(null);
                                try {
                                    this.A01.A08(c04280Jo, false);
                                } catch (IOException unused) {
                                    Log.e("MissedCallsLogDatabaseMigration/processBatch/failed to update missed call message in main message store.");
                                }
                                i++;
                            }
                        }
                        return Pair.create(Long.valueOf(j), Integer.valueOf(i));
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0U() {
                        return AbstractC60072ts.A02;
                    }

                    @Override // X.AbstractC05100Nh
                    public Set A0X() {
                        HashSet hashSet = new HashSet();
                        hashSet.add("migration_jid_store");
                        hashSet.add("migration_chat_store");
                        return hashSet;
                    }

                    @Override // X.AbstractC05100Nh
                    public void A0Y() {
                        super.A0Y();
                        this.A06.A04("missed_calls_ready", 1);
                    }

                    @Override // X.AbstractC05100Nh
                    public boolean A0b() {
                        String A022 = this.A06.A02("missed_calls_ready");
                        return A022 != null && Integer.parseInt(A022) == 1;
                    }
                });
                C06R c06r = c05670Pr.A0S;
                C06Y c06y = c05670Pr.A0Z;
                C06Z c06z = c05670Pr.A09;
                C012706e c012706e = c05670Pr.A0X;
                C012306a c012306a = c05670Pr.A0M;
                C012806f c012806f = c05670Pr.A0J;
                C013006h c013006h = c05670Pr.A0m;
                C06J c06j = c05670Pr.A0L;
                A01(hashMap, new C05730Pz(c05s, c06q, c06r, c05c, c06y, c06s, c06z, c012706e, c012306a, c012806f, c013006h, c06j, c05670Pr.A0Q, c05670Pr.A0F, c05670Pr.A0V, c05670Pr));
                A01(hashMap, new C0Q0(c05670Pr));
                A01(hashMap, new C0Q2(c05c, c05670Pr.A0i, c05670Pr.A0P, c05670Pr));
                A01(hashMap, new C0Q3(c05c, c012306a, c05b, c05670Pr));
                A01(hashMap, new C0Q4(c05c, c05l, c05670Pr.A0d, c05670Pr));
                A01(hashMap, new C0Q5(c05b, c05c, c05l, c05670Pr.A0C, c05670Pr));
                A01(hashMap, new C0Q6(c05a, c05c, c05l, c012806f, c05670Pr));
                C05M c05m = c05670Pr.A0B;
                C0F3 c0f3 = c05670Pr.A0U;
                A01(hashMap, new C0Q7(c02l, c05m, c05c, c0f3, c05670Pr));
                A01(hashMap, new AbstractC05100Nh(c05b, c02l, c05c, c0f3, c05670Pr) { // from class: X.0Q8
                    public final C02L A00;
                    public final C05B A01;
                    public final C0F3 A02;
                    public final C05C A03;

                    @Override // X.AbstractC05100Nh
                    public int A0R() {
                        return 200;
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0U() {
                        return "SELECT group_participant_user._id, group_jid_row_id FROM group_participant_user LEFT JOIN jid ON group_jid_row_id = jid._id WHERE group_participant_user._id > ?  AND type = 3 GROUP BY group_jid_row_id ORDER BY group_participant_user._id LIMIT ? ";
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0V() {
                        return "migration_broadcast_me_jid_retry";
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0W() {
                        return "migration_broadcast_me_jid_index";
                    }

                    {
                        super("broadcast_me_jid", EditorInfoCompat.IME_FLAG_FORCE_ASCII, c05670Pr);
                        this.A01 = c05b;
                        this.A00 = c02l;
                        this.A03 = c05c;
                        this.A02 = c0f3;
                    }

                    @Override // X.AbstractC05100Nh
                    public boolean A0L() {
                        C02L c02l2 = this.A00;
                        c02l2.A05();
                        return c02l2.A03 != null;
                    }

                    @Override // X.AbstractC05100Nh
                    public int A0Q() {
                        return super.A02.A07(C01C.A2s) >= 2 ? 3 : 2;
                    }

                    @Override // X.AbstractC05100Nh
                    public Pair A0T(Cursor cursor) {
                        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
                        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("group_jid_row_id");
                        long j = -1;
                        int i = 0;
                        while (cursor.moveToNext()) {
                            j = cursor.getLong(columnIndexOrThrow);
                            i++;
                            AbstractC011205o abstractC011205o = (AbstractC011205o) this.A01.A07(C0I1.class, cursor.getInt(columnIndexOrThrow2));
                            if (abstractC011205o == null) {
                                StringBuilder A0P = C000200d.A0P("broadcast-me-jid-migration/process-batch: groupJidRowId=");
                                A0P.append(cursor.getInt(columnIndexOrThrow2));
                                A0P.append(", rowId=");
                                A0P.append(j);
                                A0P.append(" SKIP Due to invalid BroadcastListJid");
                                Log.w(A0P.toString());
                            } else {
                                C0F3 c0f32 = this.A02;
                                String valueOf = String.valueOf(c0f32.A07.A02(abstractC011205o));
                                C02L c02l2 = c0f32.A01;
                                c02l2.A05();
                                UserJid userJid = c02l2.A03;
                                if (userJid != null) {
                                    try {
                                        Cursor A07 = c0f32.A08.A03().A02.A07("SELECT _id FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?", new String[]{valueOf, String.valueOf(c0f32.A01(userJid))});
                                        boolean moveToNext = A07.moveToNext();
                                        A07.close();
                                        if (moveToNext) {
                                            StringBuilder A0P2 = C000200d.A0P("broadcast-me-jid-migration/process-batch: groupJidRowId=");
                                            A0P2.append(cursor.getInt(columnIndexOrThrow2));
                                            A0P2.append(", rowId=");
                                            A0P2.append(j);
                                            A0P2.append(" SKIP since it already has me jid");
                                            Log.i(A0P2.toString());
                                        } else {
                                            C02L c02l3 = this.A00;
                                            c02l3.A05();
                                            UserJid userJid2 = c02l3.A03;
                                            if (userJid2 != null) {
                                                c0f32.A08(abstractC011205o, new C0D7(userJid2, 2, false, false));
                                            } else {
                                                throw null;
                                            }
                                        }
                                    } finally {
                                    }
                                } else {
                                    throw null;
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
                        hashSet.add("participant_user");
                        return hashSet;
                    }

                    @Override // X.AbstractC05100Nh
                    public void A0Y() {
                        super.A0Y();
                        this.A03.A04("broadcast_me_jid_ready", 2);
                    }

                    @Override // X.AbstractC05100Nh
                    public boolean A0b() {
                        String A022 = this.A03.A02("broadcast_me_jid_ready");
                        return A022 != null && Integer.parseInt(A022) == 2;
                    }
                });
                A01(hashMap, new C0QA(c05l, c05670Pr) { // from class: X.0Q9
                    public final C05L A00;

                    @Override // X.AbstractC05100Nh
                    public int A0R() {
                        return 100;
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0U() {
                        return "SELECT message_row_id, duration, expire_timestamp FROM message_ephemeral WHERE message_row_id>? ORDER BY message_row_id ASC LIMIT ?";
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super("message_ephemeral", "message_ephemeral_remove_column", c05670Pr);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("start_timestamp", "INTEGER");
                        hashMap2.put("chat_duration", "INTEGER");
                        this.A00 = c05l;
                    }

                    @Override // X.AbstractC05100Nh
                    public int A0Q() {
                        return this.A02.A07(C01C.A2x) >= 2 ? 3 : 2;
                    }

                    @Override // X.AbstractC05100Nh
                    public Pair A0T(Cursor cursor) {
                        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("message_row_id");
                        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("duration");
                        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("expire_timestamp");
                        long j = -1;
                        int i = 0;
                        while (cursor.moveToNext()) {
                            C05L c05l2 = this.A00;
                            if (c05l2 != null) {
                                C0CF A01 = c05l2.A01(C1P2.A06);
                                j = cursor.getInt(columnIndexOrThrow);
                                int i2 = cursor.getInt(columnIndexOrThrow2);
                                long j2 = cursor.getLong(columnIndexOrThrow3);
                                A01.A04(1, j);
                                A01.A04(2, i2);
                                A01.A04(3, j2);
                                A01.A01();
                                i++;
                            } else {
                                throw null;
                            }
                        }
                        return Pair.create(Long.valueOf(j), Integer.valueOf(i));
                    }

                    @Override // X.AbstractC05100Nh
                    public boolean A0b() {
                        C05E c05e2 = this.A05;
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("start_timestamp", "INTEGER");
                        hashMap2.put("chat_duration", "INTEGER");
                        return C0QA.A02(c05e2, "message_ephemeral", hashMap2);
                    }

                    @Override // X.C0QA
                    public String A0c() {
                        return C1P2.A02;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.C0QA
                    public List A0d() {
                        C05E c05e2 = this.A05;
                        c05e2.A05();
                        return Arrays.asList(c05e2.A06.A0H("message_ephemeral").second, C1P2.A01);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.C0QA
                    public List A0e() {
                        return Arrays.asList(C05J.A03("message_ephemeral", "message_ephemeral_remove_column", "INSERT INTO message_ephemeral_remove_column(message_row_id, duration, expire_timestamp) VALUES (new.message_row_id, new.duration, new.expire_timestamp)").second, C05J.A01().second, C05J.A02("message_ephemeral", "message_ephemeral_remove_column", "message_row_id=old.message_row_id").second);
                    }

                    @Override // X.C0QA
                    public List A0f() {
                        return Collections.singletonList(C1P2.A00);
                    }

                    @Override // X.C0QA
                    public List A0g() {
                        return Collections.singletonList(C1P2.A04);
                    }

                    @Override // X.C0QA
                    public List A0h() {
                        C05E c05e2 = this.A05;
                        c05e2.A05();
                        return Arrays.asList(C000200d.A0H("DROP TRIGGER IF EXISTS ", (String) c05e2.A06.A0H("message_ephemeral").first), C000200d.A0H("DROP TRIGGER IF EXISTS ", (String) C05J.A03("message_ephemeral", "message_ephemeral_remove_column", "INSERT INTO message_ephemeral_remove_column(message_row_id, duration, expire_timestamp) VALUES (new.message_row_id, new.duration, new.expire_timestamp)").first), C000200d.A0H("DROP TRIGGER IF EXISTS ", (String) C05J.A01().first), C000200d.A0H("DROP TRIGGER IF EXISTS ", (String) C05J.A02("message_ephemeral", "message_ephemeral_remove_column", "message_row_id=old.message_row_id").first));
                    }
                });
                A01(hashMap, new C0QB(c05a, c05c, c05l, c06j, c05670Pr));
                A01(hashMap, new C0QC(c05a, c05c, c05l, c06j, c05670Pr));
                A01(hashMap, new C0QD(c05c, c05l, c05670Pr.A0f, c05670Pr));
                A01(hashMap, new C0QE(c06i, c05c, c05670Pr));
                A01(hashMap, new C0QF(c05b, c05c, c05l, c05670Pr.A0W, c05670Pr));
                A01(hashMap, new AbstractC05100Nh(c05670Pr) { // from class: X.2Do
                    public final AbstractC000600i A00;
                    public final C05B A01;

                    @Override // X.AbstractC05100Nh
                    public boolean A0J() {
                        return false;
                    }

                    @Override // X.AbstractC05100Nh
                    public int A0Q() {
                        return 3;
                    }

                    @Override // X.AbstractC05100Nh
                    public int A0R() {
                        return 0;
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0U() {
                        return "";
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0V() {
                        return "migration_jid_store_retry_count";
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0W() {
                        return "migration_jid_store_start_index";
                    }

                    {
                        super("migration_jid_store", EditorInfoCompat.IME_FLAG_FORCE_ASCII, c05670Pr);
                        C05B c05b2 = c05670Pr.A0G;
                        if (c05b2 != null) {
                            this.A01 = c05b2;
                            AbstractC000600i abstractC000600i2 = c05670Pr.A00;
                            if (abstractC000600i2 == null) {
                                throw null;
                            }
                            this.A00 = abstractC000600i2;
                            return;
                        }
                        throw null;
                    }

                    @Override // X.AbstractC05100Nh
                    public boolean A0P(C47982Di c47982Di) {
                        this.A00.A09("jid-store-migration-pending", null, false);
                        C05B c05b2 = this.A01;
                        C05E c05e2 = c05b2.A01;
                        long A022 = c05e2.A02();
                        StringBuilder sb = new StringBuilder("JidStore/populateJidTable/start/db size=");
                        sb.append(A022);
                        Log.i(sb.toString());
                        C0HC c0hc = new C0HC("JidStore/populate");
                        try {
                            C0CD A04 = c05e2.A04();
                            C03790Hb A00 = A04.A00();
                            C0CE c0ce = A04.A02;
                            Cursor A07 = c0ce.A07("SELECT DISTINCT key_remote_jid FROM chat_list", new String[0]);
                            c05b2.A0B(A07);
                            A07.close();
                            Cursor A072 = c0ce.A07("SELECT DISTINCT key_remote_jid FROM messages", new String[0]);
                            c05b2.A0B(A072);
                            A072.close();
                            Cursor A073 = c0ce.A07("SELECT DISTINCT remote_resource FROM messages", new String[0]);
                            c05b2.A0B(A073);
                            A073.close();
                            Cursor A074 = c0ce.A07("SELECT DISTINCT remote_resource FROM messages WHERE needs_push=2", new String[0]);
                            c05b2.A0B(A074);
                            A074.close();
                            Cursor A075 = c0ce.A07("SELECT DISTINCT mentioned_jids FROM messages WHERE mentioned_jids IS NOT NULL", new String[0]);
                            c05b2.A0B(A075);
                            A075.close();
                            Cursor A076 = c0ce.A07("SELECT DISTINCT jid FROM group_participants", new String[0]);
                            c05b2.A0B(A076);
                            A076.close();
                            Cursor A077 = c0ce.A07("SELECT DISTINCT jid FROM group_participants_history", new String[0]);
                            c05b2.A0B(A077);
                            A077.close();
                            c05b2.A02.A04("jid_ready", 1);
                            A00.A00();
                            A00.close();
                            A04.close();
                        } catch (SQLException e) {
                            Log.e("JidStore/populateJidTable/Error populating jid table", e);
                            c05b2.A00.A09("JidStore/populateJidTable", "JidStore/populateJidTable/error", true);
                        }
                        StringBuilder A0P = C000200d.A0P("JidStore/populateJidTable/time spent=");
                        A0P.append(c0hc.A01());
                        A0P.append("; count=");
                        A0P.append(c05b2.A04.size());
                        Log.i(A0P.toString());
                        long A023 = c05e2.A02();
                        StringBuilder A0S = C000200d.A0S("JidStore/populateJidTable/end/db size=", A023, "; increase=");
                        A0S.append(A023 / A022);
                        Log.i(A0S.toString());
                        return A0b();
                    }

                    @Override // X.AbstractC05100Nh
                    public Pair A0T(Cursor cursor) {
                        return new Pair(0L, 0);
                    }

                    @Override // X.AbstractC05100Nh
                    public boolean A0b() {
                        return this.A01.A0C();
                    }
                });
                A01(hashMap, new AbstractC05100Nh(c05670Pr) { // from class: X.2Dp
                    public final AbstractC000600i A00;
                    public final C05A A01;

                    @Override // X.AbstractC05100Nh
                    public boolean A0J() {
                        return false;
                    }

                    @Override // X.AbstractC05100Nh
                    public int A0Q() {
                        return 3;
                    }

                    @Override // X.AbstractC05100Nh
                    public int A0R() {
                        return 0;
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0U() {
                        return "";
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0V() {
                        return "migration_chat_store_retry_count";
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0W() {
                        return "migration_chat_store_start_index";
                    }

                    {
                        super("migration_chat_store", EditorInfoCompat.IME_FLAG_FORCE_ASCII, c05670Pr);
                        C05A c05a2 = c05670Pr.A0A;
                        if (c05a2 != null) {
                            this.A01 = c05a2;
                            AbstractC000600i abstractC000600i2 = c05670Pr.A00;
                            if (abstractC000600i2 == null) {
                                throw null;
                            }
                            this.A00 = abstractC000600i2;
                            return;
                        }
                        throw null;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:243:0x02d1, code lost:
                        if (r0 == 0) goto L43;
                     */
                    @Override // X.AbstractC05100Nh
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public boolean A0P(X.C47982Di r40) {
                        /*
                            Method dump skipped, instructions count: 1202
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C48052Dp.A0P(X.2Di):boolean");
                    }

                    @Override // X.AbstractC05100Nh
                    public Pair A0T(Cursor cursor) {
                        return new Pair(0L, 0);
                    }

                    @Override // X.AbstractC05100Nh
                    public Set A0X() {
                        return Collections.singleton("migration_jid_store");
                    }

                    @Override // X.AbstractC05100Nh
                    public boolean A0b() {
                        return this.A01.A0G();
                    }
                });
                A01(hashMap, new C48062Dq(c05b, c02l, c05670Pr.A02, c05670Pr.A0h, c05c, c05670Pr));
                A01(hashMap, new C0QA(c05l, c05670Pr) { // from class: X.0QG
                    public final C05L A00;

                    @Override // X.AbstractC05100Nh
                    public int A0R() {
                        return 100;
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0U() {
                        return "SELECT message_row_id, setting_duration FROM message_ephemeral_setting WHERE message_row_id>? ORDER BY message_row_id ASC LIMIT ?";
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super("message_ephemeral_setting", "message_ephemeral_setting_remove_column", c05670Pr);
                        Collections.singletonMap("ephemerality_enabled", "BOOLEAN");
                        this.A00 = c05l;
                    }

                    @Override // X.AbstractC05100Nh
                    public int A0Q() {
                        return this.A02.A07(C01C.A2x) >= 1 ? 3 : 2;
                    }

                    @Override // X.AbstractC05100Nh
                    public Pair A0T(Cursor cursor) {
                        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("message_row_id");
                        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("setting_duration");
                        long j = -1;
                        int i = 0;
                        while (cursor.moveToNext()) {
                            C05L c05l2 = this.A00;
                            if (c05l2 != null) {
                                C0CF A01 = c05l2.A01(C1P1.A03);
                                j = cursor.getInt(columnIndexOrThrow);
                                int i2 = cursor.getInt(columnIndexOrThrow2);
                                A01.A04(1, j);
                                A01.A04(2, i2);
                                A01.A01();
                                i++;
                            } else {
                                throw null;
                            }
                        }
                        return Pair.create(Long.valueOf(j), Integer.valueOf(i));
                    }

                    @Override // X.AbstractC05100Nh
                    public boolean A0b() {
                        return C0QA.A02(this.A05, "message_ephemeral_setting", Collections.singletonMap("ephemerality_enabled", "BOOLEAN"));
                    }

                    @Override // X.C0QA
                    public String A0c() {
                        return C1P1.A00;
                    }

                    @Override // X.C0QA
                    public List A0d() {
                        C05E c05e2 = this.A05;
                        c05e2.A05();
                        return Collections.singletonList(c05e2.A06.A0H("message_ephemeral_setting").second);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.C0QA
                    public List A0e() {
                        return Arrays.asList(C05J.A02("message_ephemeral_setting", "message_ephemeral_setting_remove_column", "message_row_id=old.message_row_id").second, C05J.A03("message_ephemeral_setting", "message_ephemeral_setting_remove_column", "INSERT or REPLACE INTO message_ephemeral_setting_remove_column (message_row_id, setting_duration) VALUES (new.message_row_id, new.setting_duration)").second);
                    }

                    @Override // X.C0QA
                    public List A0f() {
                        return Collections.emptyList();
                    }

                    @Override // X.C0QA
                    public List A0g() {
                        return Collections.emptyList();
                    }

                    @Override // X.C0QA
                    public List A0h() {
                        C05E c05e2 = this.A05;
                        c05e2.A05();
                        return Arrays.asList(C000200d.A0H("DROP TRIGGER IF EXISTS ", (String) c05e2.A06.A0H("message_ephemeral_setting").first), C000200d.A0H("DROP TRIGGER IF EXISTS ", (String) C05J.A02("message_ephemeral_setting", "message_ephemeral_setting_remove_column", "message_row_id=old.message_row_id").first), C000200d.A0H("DROP TRIGGER IF EXISTS ", (String) C05J.A03("message_ephemeral_setting", "message_ephemeral_setting_remove_column", "INSERT or REPLACE INTO message_ephemeral_setting_remove_column (message_row_id, setting_duration) VALUES (new.message_row_id, new.setting_duration)").first));
                    }
                });
                A01(hashMap, new AbstractC05100Nh(c05670Pr.A08, c05r, c05670Pr) { // from class: X.0QH
                    public C05R A00;
                    public C0HY A01;

                    @Override // X.AbstractC05100Nh
                    public int A0Q() {
                        return 3;
                    }

                    @Override // X.AbstractC05100Nh
                    public int A0R() {
                        return 0;
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0V() {
                        return "call_log_retry_count";
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0W() {
                        return "call_log_start_index";
                    }

                    {
                        super("call_log", EditorInfoCompat.IME_FLAG_FORCE_ASCII, c05670Pr);
                        this.A01 = r3;
                        this.A00 = c05r;
                    }

                    @Override // X.AbstractC05100Nh
                    public boolean A0P(C47982Di c47982Di) {
                        this.A01.A07();
                        return A0b();
                    }

                    @Override // X.AbstractC05100Nh
                    public Pair A0T(Cursor cursor) {
                        throw new UnsupportedOperationException();
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0U() {
                        throw new UnsupportedOperationException();
                    }

                    @Override // X.AbstractC05100Nh
                    public boolean A0b() {
                        return this.A00.A08();
                    }
                });
                A01(hashMap, new C0QJ(c02l, c05670Pr.A0e, c05q, c05e, c05670Pr.A0r, c05670Pr));
                A01(hashMap, new AbstractC05100Nh(c05670Pr) { // from class: X.0QK
                    @Override // X.AbstractC05100Nh
                    public String A0B() {
                        return "legacy_quoted_order_message_ready";
                    }

                    @Override // X.AbstractC05100Nh
                    public int A0Q() {
                        return 2;
                    }

                    @Override // X.AbstractC05100Nh
                    public int A0R() {
                        return 1;
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0U() {
                        return "SELECT 1";
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0V() {
                        return "legacy_quoted_order_message_retry_count";
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0W() {
                        return "legacy_quoted_order_message_start_index";
                    }

                    @Override // X.AbstractC05100Nh
                    public Pair A0T(Cursor cursor) {
                        return Pair.create(-1L, 0);
                    }

                    @Override // X.AbstractC05100Nh
                    public boolean A0b() {
                        String A022;
                        C05E c05e2 = this.A05;
                        c05e2.A05();
                        return !c05e2.A06.A0N() || ((A022 = this.A06.A02("legacy_quoted_order_message_ready")) != null && Long.parseLong(A022) == 1);
                    }
                });
                C003701t c003701t = c05670Pr.A0s;
                A01(hashMap, new AbstractC05100Nh(c003701t, c05670Pr) { // from class: X.0QL
                    public final C003701t A00;

                    @Override // X.AbstractC05100Nh
                    public String A0B() {
                        return "quoted_order_message_ready";
                    }

                    @Override // X.AbstractC05100Nh
                    public int A0R() {
                        return 512;
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0U() {
                        return "SELECT messages._id AS _id, quoted_message_order.order_id AS order_id, quoted_message_order.thumbnail AS thumbnail, quoted_message_order.order_title AS order_title, quoted_message_order.item_count AS item_count, quoted_message_order.status AS status, quoted_message_order.surface AS surface, quoted_message_order.message AS message, quoted_message_order.seller_jid AS seller_jid, quoted_message_order.token AS token, quoted_message_order.currency_code AS currency_code, quoted_message_order.total_amount_1000 AS total_amount_1000 FROM (SELECT messages._id, messages.quoted_row_id FROM messages WHERE messages.quoted_row_id != 0 AND messages.media_wa_type = 0 AND messages.timestamp > 1598925600000) messages INNER JOIN (SELECT messages_quotes._id FROM messages_quotes WHERE messages_quotes.media_wa_type = 44) messages_quotes ON messages_quotes._id = messages.quoted_row_id INNER JOIN quoted_message_order ON quoted_message_order.message_row_id = messages.quoted_row_id WHERE messages._id > ? ORDER BY messages._id LIMIT ?";
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0V() {
                        return "quoted_order_message_retry_count";
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0W() {
                        return "quoted_order_message_start_index";
                    }

                    {
                        super("quoted_order_message", 1, c05670Pr);
                        this.A00 = c003701t;
                    }

                    @Override // X.AbstractC05100Nh
                    public int A0Q() {
                        return (A08() <= 0 || !this.A00.A0C(438)) ? 2 : 3;
                    }

                    @Override // X.AbstractC05100Nh
                    public Pair A0T(Cursor cursor) {
                        ContentValues contentValues;
                        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
                        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("order_id");
                        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("thumbnail");
                        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("order_title");
                        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("item_count");
                        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("status");
                        int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("surface");
                        int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow("message");
                        int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow("seller_jid");
                        int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow("token");
                        int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow("currency_code");
                        int columnIndexOrThrow12 = cursor.getColumnIndexOrThrow("total_amount_1000");
                        C0CD A04 = this.A05.A04();
                        try {
                            C03790Hb A00 = A04.A00();
                            long j = -1;
                            int i = 0;
                            while (cursor.moveToNext()) {
                                try {
                                    try {
                                        j = cursor.getLong(columnIndexOrThrow);
                                        contentValues = new ContentValues(12);
                                        try {
                                            contentValues.put("message_row_id", Long.valueOf(j));
                                            contentValues.put("order_id", cursor.getString(columnIndexOrThrow2));
                                            contentValues.put("thumbnail", cursor.getBlob(columnIndexOrThrow3));
                                            contentValues.put("order_title", cursor.getString(columnIndexOrThrow4));
                                            contentValues.put("item_count", Long.valueOf(cursor.getLong(columnIndexOrThrow5)));
                                            contentValues.put("status", Long.valueOf(cursor.getLong(columnIndexOrThrow6)));
                                            contentValues.put("surface", Long.valueOf(cursor.getLong(columnIndexOrThrow7)));
                                            contentValues.put("message", cursor.getString(columnIndexOrThrow8));
                                            contentValues.put("seller_jid", Long.valueOf(cursor.getLong(columnIndexOrThrow9)));
                                            contentValues.put("token", cursor.getString(columnIndexOrThrow10));
                                            contentValues.put("currency_code", cursor.getString(columnIndexOrThrow11));
                                            contentValues.put("total_amount_1000", Long.valueOf(cursor.getLong(columnIndexOrThrow12)));
                                        } catch (Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    try {
                                        A04.A02.A02("message_quoted_order", contentValues);
                                        i++;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    try {
                                        throw th;
                                    } catch (Throwable th5) {
                                        try {
                                            A04.close();
                                        } catch (Throwable unused) {
                                        }
                                        throw th5;
                                    }
                                }
                            }
                            A00.A00();
                            A00.close();
                            A04.close();
                            return Pair.create(Long.valueOf(j), Integer.valueOf(i));
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    }

                    @Override // X.AbstractC05100Nh
                    public boolean A0b() {
                        String A022;
                        C05E c05e2 = this.A05;
                        c05e2.A05();
                        return !c05e2.A06.A0N() || ((A022 = this.A06.A02("quoted_order_message_ready")) != null && Long.parseLong(A022) == 1) || A08() <= 0;
                    }
                });
                A01(hashMap, new AbstractC05100Nh(c003701t, c05670Pr) { // from class: X.0QM
                    public final C003701t A00;

                    @Override // X.AbstractC05100Nh
                    public String A0B() {
                        return "quoted_order_message_v2_migration_ready";
                    }

                    @Override // X.AbstractC05100Nh
                    public int A0R() {
                        return 512;
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0U() {
                        return "SELECT message_row_id, order_id, thumbnail, order_title, item_count, status, surface, message, seller_jid, token, currency_code,total_amount_1000 FROM message_quoted_order WHERE message_row_id > ? ORDER BY message_row_id LIMIT ?";
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0V() {
                        return "quoted_order_message_v2_retry_count";
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0W() {
                        return "quoted_order_message_v2_start_index";
                    }

                    {
                        super("quoted_order_message_v2", 1, c05670Pr);
                        this.A00 = c003701t;
                    }

                    @Override // X.AbstractC05100Nh
                    public int A0Q() {
                        return this.A00.A0C(438) ? 3 : 2;
                    }

                    /* JADX WARN: Can't wrap try/catch for region: R(3:(10:7|8|9|10|(3:12|13|14)(2:56|57)|15|(6:17|18|19|20|(4:22|(1:24)|25|26)(2:39|40)|(6:32|33|34|35|36|31)(1:28))(1:55)|29|30|31)|4|5) */
                    /* JADX WARN: Code restructure failed: missing block: B:167:0x01cd, code lost:
                        r0 = th;
                     */
                    @Override // X.AbstractC05100Nh
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public android.util.Pair A0T(android.database.Cursor r42) {
                        /*
                            Method dump skipped, instructions count: 477
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C0QM.A0T(android.database.Cursor):android.util.Pair");
                    }

                    @Override // X.AbstractC05100Nh
                    public Set A0X() {
                        HashSet hashSet = new HashSet();
                        hashSet.add("quoted_order_message");
                        return hashSet;
                    }

                    @Override // X.AbstractC05100Nh
                    public boolean A0b() {
                        String A022;
                        C05E c05e2 = this.A05;
                        c05e2.A05();
                        return !c05e2.A06.A0N() || ((A022 = this.A06.A02("quoted_order_message_v2_migration_ready")) != null && Long.parseLong(A022) == 1);
                    }
                });
                A01(hashMap, new AbstractC05100Nh(c05670Pr) { // from class: X.0QN
                    public final C003701t A00;

                    @Override // X.AbstractC05100Nh
                    public String A0B() {
                        return "quoted_ui_elements_reply_message_migration_ready";
                    }

                    @Override // X.AbstractC05100Nh
                    public int A0R() {
                        return 512;
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0U() {
                        return "SELECT message_row_id, element_type, reply_values, reply_description FROM message_quoted_ui_elements_reply WHERE message_row_id > ? ORDER BY message_row_id LIMIT ?";
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0V() {
                        return "quoted_ui_elements_reply_message_retry_count";
                    }

                    @Override // X.AbstractC05100Nh
                    public String A0W() {
                        return "quoted_ui_elements_reply_message_start_index";
                    }

                    {
                        super("quoted_ui_elements_reply_message", 1, c05670Pr);
                        this.A00 = c05670Pr.A0s;
                    }

                    @Override // X.AbstractC05100Nh
                    public int A0Q() {
                        return this.A00.A0C(473) ? 3 : 2;
                    }

                    /* JADX WARN: Finally extract failed */
                    @Override // X.AbstractC05100Nh
                    public Pair A0T(Cursor cursor) {
                        long j;
                        boolean z;
                        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("message_row_id");
                        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("element_type");
                        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("reply_values");
                        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("reply_description");
                        C05E c05e2 = this.A05;
                        C0CD A04 = c05e2.A04();
                        try {
                            C03790Hb A00 = A04.A00();
                            long j2 = -1;
                            int i = 0;
                            while (cursor.moveToNext()) {
                                j2 = cursor.getLong(columnIndexOrThrow);
                                C0CD A03 = c05e2.A03();
                                try {
                                    C0CE c0ce = A03.A02;
                                    String l = Long.toString(j2);
                                    Cursor A07 = c0ce.A07("SELECT _id, quoted_row_id FROM messages WHERE _id = ?", new String[]{l});
                                    if (A07.moveToNext()) {
                                        j = A07.getLong(A07.getColumnIndexOrThrow("quoted_row_id"));
                                        A07.close();
                                        A03.close();
                                    } else {
                                        A07.close();
                                        A03.close();
                                        j = 0;
                                    }
                                    if (j != 0) {
                                        A03 = c05e2.A03();
                                        try {
                                            Cursor A072 = A03.A02.A07("SELECT media_wa_type FROM messages_quotes WHERE _id = ?", new String[]{Long.toString(j)});
                                            if (A072.moveToNext()) {
                                                z = A072.getInt(A072.getColumnIndexOrThrow("media_wa_type")) == 46;
                                                A072.close();
                                                A03.close();
                                            } else {
                                                A072.close();
                                                A03.close();
                                                z = false;
                                            }
                                            if (z) {
                                                ContentValues contentValues = new ContentValues(4);
                                                contentValues.put("message_row_id", Long.valueOf(j));
                                                contentValues.put("element_type", cursor.getString(columnIndexOrThrow2));
                                                contentValues.put("reply_values", cursor.getBlob(columnIndexOrThrow3));
                                                contentValues.put("reply_description", cursor.getString(columnIndexOrThrow4));
                                                A04.A02.A02("message_quoted_ui_elements_reply_legacy", contentValues);
                                                i++;
                                            }
                                        } finally {
                                        }
                                    }
                                    A04.A02.A0D("DELETE FROM message_quoted_ui_elements_reply WHERE message_row_id = ?", new String[]{l});
                                } finally {
                                    try {
                                        throw th;
                                    } catch (Throwable th) {
                                        try {
                                            A03.close();
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }
                            }
                            A00.A00();
                            A00.close();
                            A04.close();
                            return Pair.create(Long.valueOf(j2), Integer.valueOf(i));
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                try {
                                    A04.close();
                                } catch (Throwable unused2) {
                                }
                                throw th3;
                            }
                        }
                    }

                    @Override // X.AbstractC05100Nh
                    public boolean A0b() {
                        String A022;
                        C05E c05e2 = this.A05;
                        c05e2.A05();
                        return !c05e2.A06.A0N() || ((A022 = this.A06.A02("quoted_ui_elements_reply_message_migration_ready")) != null && Long.parseLong(A022) == 1);
                    }
                });
                this.A00 = C07E.A00(hashMap);
            }
        }
        return this.A00;
    }

    public final AbstractC05100Nh A03(String str) {
        return (AbstractC05100Nh) A02().A00.get(str);
    }
}
