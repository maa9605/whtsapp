package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.05S */
/* loaded from: classes.dex */
public class C05S {
    public static volatile C05S A0A;
    public final AbstractC000600i A00;
    public final AnonymousClass012 A01;
    public final C05T A02;
    public final C05A A03;
    public final C05B A04;
    public final C05E A05;
    public final C05C A06;
    public final C05L A07;
    public final C06O A08;
    public final C05U A09;

    public C05S(AnonymousClass012 anonymousClass012, C05B c05b, C05A c05a, AbstractC000600i abstractC000600i, C05T c05t, C05U c05u, C05C c05c, C05L c05l, C06O c06o, C05E c05e) {
        this.A01 = anonymousClass012;
        this.A04 = c05b;
        this.A03 = c05a;
        this.A00 = abstractC000600i;
        this.A02 = c05t;
        this.A09 = c05u;
        this.A06 = c05c;
        this.A07 = c05l;
        this.A08 = c06o;
        this.A05 = c05e;
    }

    public static C05S A00() {
        if (A0A == null) {
            synchronized (C05S.class) {
                if (A0A == null) {
                    A0A = new C05S(AnonymousClass012.A00(), C05B.A00(), C05A.A00(), AbstractC000600i.A00(), C05T.A00(), C05U.A01(), C05C.A00(), C05L.A00(), C06O.A00(), C05E.A00());
                }
            }
        }
        return A0A;
    }

    public static AnonymousClass094 A01(Cursor cursor, AbstractC005302j abstractC005302j) {
        int columnIndex = cursor.getColumnIndex("key_id");
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("key_id");
        }
        String string = cursor.getString(columnIndex);
        int columnIndex2 = cursor.getColumnIndex("from_me");
        if (columnIndex2 < 0) {
            columnIndex2 = cursor.getColumnIndex("key_from_me");
        }
        boolean z = cursor.getInt(columnIndex2) == 1;
        if (string != null && !string.equals("-1")) {
            return new AnonymousClass094(abstractC005302j, z, string);
        }
        C000200d.A0w("CachedMessageStore/getMessage/id is null or no messages for jid=", abstractC005302j);
        return null;
    }

    public AnonymousClass092 A02(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow("key_id"));
        boolean z = cursor.getInt(cursor.getColumnIndexOrThrow("from_me")) == 1;
        AbstractC005302j A08 = this.A03.A08(cursor.getLong(cursor.getColumnIndexOrThrow("chat_row_id")));
        if (A08 == null) {
            return null;
        }
        return A03(cursor, new AnonymousClass094(A08, z, string));
    }

    public AnonymousClass092 A03(Cursor cursor, AnonymousClass094 anonymousClass094) {
        if (cursor.getColumnIndex("table_version") == -1) {
            this.A00.A09("MainMessageStore/readMessage/read directly from old table instead of view.", null, true);
            C05A c05a = this.A03;
            AbstractC005302j abstractC005302j = anonymousClass094.A00;
            if (abstractC005302j != null) {
                long A05 = c05a.A05(abstractC005302j);
                C0CD A03 = this.A05.A03();
                try {
                    C0CE c0ce = A03.A02;
                    String str = C0HD.A0k;
                    String[] strArr = new String[3];
                    strArr[0] = Long.toString(A05);
                    strArr[1] = anonymousClass094.A02 ? "1" : "0";
                    strArr[2] = anonymousClass094.A01;
                    Cursor A07 = c0ce.A07(str, strArr);
                    if (!A07.moveToNext()) {
                        A07.close();
                        A03.close();
                        return null;
                    }
                    AnonymousClass092 A052 = A05(A07, anonymousClass094);
                    A07.close();
                    A03.close();
                    return A052;
                } finally {
                }
            } else {
                throw null;
            }
        } else {
            return A05(cursor, anonymousClass094);
        }
    }

    public AnonymousClass092 A04(Cursor cursor, AnonymousClass094 anonymousClass094) {
        AnonymousClass092 A02;
        byte b = (byte) cursor.getInt(cursor.getColumnIndexOrThrow("message_type"));
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("timestamp"));
        if (C0DB.A0F(b, cursor.getInt(cursor.getColumnIndexOrThrow("status")))) {
            C06O c06o = this.A08;
            int i = cursor.getInt(cursor.getColumnIndexOrThrow("media_size"));
            if (i == 38) {
                A02 = c06o.A07.A02(anonymousClass094, j, (byte) 33);
            } else {
                A02 = C07A.A00(anonymousClass094, j, i, c06o.A00);
            }
        } else {
            A02 = this.A09.A02(anonymousClass094, j, b);
        }
        A02.A0c(this.A04, cursor);
        A02.A0b(cursor);
        return A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:555:0x0568  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.AnonymousClass092 A05(android.database.Cursor r18, X.AnonymousClass094 r19) {
        /*
            Method dump skipped, instructions count: 1411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05S.A05(android.database.Cursor, X.094):X.092");
    }

    public final void A06(AnonymousClass092 anonymousClass092, C0CF c0cf) {
        c0cf.A04(18, anonymousClass092.A0q);
        C05A c05a = this.A03;
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (abstractC005302j != null) {
            c0cf.A04(1, c05a.A05(abstractC005302j));
            c0cf.A04(2, anonymousClass094.A02 ? 1L : 0L);
            c0cf.A05(3, anonymousClass094.A01);
            AbstractC005302j A0A2 = anonymousClass092.A0A();
            c0cf.A04(4, A0A2 == null ? 0L : this.A04.A02(A0A2));
            c0cf.A04(5, anonymousClass092.A08);
            c0cf.A04(6, anonymousClass092.A0f ? 1L : 0L);
            c0cf.A04(7, anonymousClass092.A06);
            String str = anonymousClass092.A0a;
            if (str == null) {
                c0cf.A02(8);
            } else {
                c0cf.A05(8, str);
            }
            c0cf.A04(9, anonymousClass092.A07());
            c0cf.A04(10, anonymousClass092.A04);
            c0cf.A04(11, anonymousClass092.A0E);
            long j = anonymousClass092.A0C;
            if (j == 0) {
                j = this.A01.A05();
            }
            c0cf.A04(12, j);
            c0cf.A04(13, anonymousClass092.A0D);
            c0cf.A04(14, anonymousClass092.A06());
            String A16 = anonymousClass092.A16();
            if (A16 == null) {
                c0cf.A02(15);
            } else {
                c0cf.A05(15, A16);
            }
            c0cf.A04(16, anonymousClass092.A0j ? 1L : 0L);
            c0cf.A04(17, anonymousClass092.A09());
            if (anonymousClass092.A0p > 0) {
                c0cf.A04(19, anonymousClass092.A0p);
                return;
            }
            return;
        }
        throw null;
    }

    public final void A07(AnonymousClass092 anonymousClass092, C0CF c0cf) {
        c0cf.A04(1, anonymousClass092.A08);
        c0cf.A04(2, anonymousClass092.A06);
        c0cf.A04(3, anonymousClass092.A07());
        c0cf.A04(4, anonymousClass092.A04);
        c0cf.A04(5, anonymousClass092.A0E);
        long j = anonymousClass092.A0C;
        if (j == 0) {
            j = this.A01.A05();
        }
        c0cf.A04(6, j);
        c0cf.A04(7, anonymousClass092.A0D);
        c0cf.A04(8, anonymousClass092.A06());
        String A16 = anonymousClass092.A16();
        if (A16 == null) {
            c0cf.A02(9);
        } else {
            c0cf.A05(9, A16);
        }
        c0cf.A04(10, anonymousClass092.A09());
        c0cf.A04(11, anonymousClass092.A0q);
    }

    public void A08(AnonymousClass092 anonymousClass092, boolean z) {
        C0CF A01;
        C0CF A012;
        anonymousClass092.A0Z(1);
        C05E c05e = this.A05;
        C0CD A04 = c05e.A04();
        try {
            C03790Hb A00 = A04.A00();
            c05e.A05();
            if (c05e.A06.A0N()) {
                if (z) {
                    List A0P = anonymousClass092.A0P();
                    int i = 20;
                    if (A0P != null && A0P.size() >= anonymousClass092.A06) {
                        ArrayList arrayList = new ArrayList(A0P);
                        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                        arrayList.add(anonymousClass094.A00);
                        ArrayList<String> A0E = C003101m.A0E(arrayList);
                        A0E.add(anonymousClass094.A01);
                        C05L c05l = this.A07;
                        int size = A0E.size() - 1;
                        if (c05l != null) {
                            StringBuilder A0V = C000200d.A0V(" WHERE ", "key_remote_jid IN ");
                            A0V.append(C05P.A01(size));
                            A0V.append(" AND ");
                            A0V.append("key_from_me = 1");
                            A0V.append(" AND ");
                            A0V.append("key_id = ?");
                            String obj = A0V.toString();
                            StringBuilder sb = new StringBuilder("UPDATE messages SET status = ?, needs_push = ?, data = ?, raw_data = ?, timestamp = ?, media_url = ?, media_mime_type = ?, media_wa_type = ?, media_size = ?, media_name = ?, media_caption = ?, media_hash = ?, media_duration = ?, origin = ?, latitude = ?, longitude = ?, mentioned_jids = ?, thumb_image = ?, media_enc_hash = ?");
                            sb.append(obj);
                            A012 = c05l.A01(sb.toString());
                            this.A02.A07(anonymousClass092, A012);
                            for (String str : A0E) {
                                A012.A05(i, str);
                                i++;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        this.A00.A09("message-table-scan", "update-main-message-v1", true);
                        A012 = this.A07.A01("UPDATE messages SET status = ?, needs_push = ?, data = ?, raw_data = ?, timestamp = ?, media_url = ?, media_mime_type = ?, media_wa_type = ?, media_size = ?, media_name = ?, media_caption = ?, media_hash = ?, media_duration = ?, origin = ?, latitude = ?, longitude = ?, mentioned_jids = ?, thumb_image = ?, media_enc_hash = ? WHERE needs_push = 2 AND key_from_me = 1 AND key_id = ?");
                        this.A02.A07(anonymousClass092, A012);
                        A012.A05(20, anonymousClass092.A0n.A01);
                    }
                } else {
                    if (A0A() && anonymousClass092.A0C() != null && anonymousClass092.A0B <= 0) {
                        Cursor A07 = A04.A02.A07("SELECT quoted_row_id FROM messages WHERE _id = ?", new String[]{String.valueOf(anonymousClass092.A0p)});
                        if (A07.moveToLast()) {
                            anonymousClass092.A0B = A07.getLong(A07.getColumnIndex("quoted_row_id"));
                        }
                        A07.close();
                    }
                    A012 = this.A07.A01("UPDATE messages SET status=?, needs_push=?, data=?, raw_data=?, timestamp=?, media_url=?, media_mime_type=?, media_wa_type=?, media_size=?, media_name=?, media_caption=?, media_hash=?, media_duration=?, origin=?, latitude=?, longitude=?, mentioned_jids=?, thumb_image=?, edit_version=?, media_enc_hash=?, payment_transaction_id=?, forwarded=?, preview_type=?, quoted_row_id=?, lookup_tables = ? WHERE key_remote_jid=? AND key_from_me=? AND key_id=?");
                    this.A02.A06(anonymousClass092, A012);
                    AnonymousClass094 anonymousClass0942 = anonymousClass092.A0n;
                    AbstractC005302j abstractC005302j = anonymousClass0942.A00;
                    if (abstractC005302j != null) {
                        A012.A05(26, abstractC005302j.getRawString());
                        A012.A04(27, anonymousClass0942.A02 ? 1L : 0L);
                        A012.A05(28, anonymousClass0942.A01);
                    } else {
                        throw null;
                    }
                }
                A012.A00();
            }
            if (A09()) {
                int i2 = 12;
                if (z) {
                    List<AbstractC005302j> A0P2 = anonymousClass092.A0P();
                    if (A0P2 != null && A0P2.size() > 0) {
                        ArrayList arrayList2 = new ArrayList(A0P2.size() + 1);
                        C05A c05a = this.A03;
                        AnonymousClass094 anonymousClass0943 = anonymousClass092.A0n;
                        arrayList2.add(String.valueOf(c05a.A05(anonymousClass0943.A00)));
                        for (AbstractC005302j abstractC005302j2 : A0P2) {
                            arrayList2.add(String.valueOf(c05a.A05(abstractC005302j2)));
                        }
                        C05L c05l2 = this.A07;
                        int size2 = arrayList2.size();
                        if (c05l2 != null) {
                            StringBuilder A0V2 = C000200d.A0V("UPDATE message SET status = ?, recipient_count = ?, origination_flags = ?, origin = ?, timestamp = ?, received_timestamp = ?, receipt_server_timestamp = ?, message_type = ?, text_data = ?, lookup_tables = ?, sort_id = ? WHERE ", "chat_row_id IN ");
                            A0V2.append(C05P.A01(size2));
                            A0V2.append(" AND ");
                            A0V2.append("from_me = 1");
                            A0V2.append(" AND ");
                            A0V2.append("key_id = ?");
                            A01 = c05l2.A01(A0V2.toString());
                            A07(anonymousClass092, A01);
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                A01.A05(i2, (String) it.next());
                                i2++;
                            }
                            A01.A05(i2, anonymousClass0943.A01);
                        } else {
                            throw null;
                        }
                    } else {
                        A01 = this.A07.A01("UPDATE message SET status = ?, recipient_count = ?, origination_flags = ?, origin = ?, timestamp = ?, received_timestamp = ?, receipt_server_timestamp = ?, message_type = ?, text_data = ?, lookup_tables = ?, sort_id = ? WHERE broadcast = 1 AND from_me = 1 AND key_id = ?");
                        A07(anonymousClass092, A01);
                        A01.A05(12, anonymousClass092.A0n.A01);
                    }
                } else {
                    A01 = this.A07.A01("UPDATE message   SET status = ?, broadcast = ?, recipient_count = ?, participant_hash = ?, origination_flags = ?, origin = ?, timestamp = ?, received_timestamp = ?, receipt_server_timestamp = ?, message_type = ?, text_data = ?, lookup_tables = ?, sort_id = ? WHERE chat_row_id = ? AND from_me = ? AND key_id = ?");
                    C05A c05a2 = this.A03;
                    AnonymousClass094 anonymousClass0944 = anonymousClass092.A0n;
                    AbstractC005302j abstractC005302j3 = anonymousClass0944.A00;
                    if (abstractC005302j3 != null) {
                        A01.A04(14, c05a2.A05(abstractC005302j3));
                        A01.A04(15, anonymousClass0944.A02 ? 1L : 0L);
                        A01.A05(16, anonymousClass0944.A01);
                        A01.A04(1, anonymousClass092.A08);
                        A01.A04(2, anonymousClass092.A0f ? 1L : 0L);
                        A01.A04(3, anonymousClass092.A06);
                        String str2 = anonymousClass092.A0a;
                        if (str2 == null) {
                            A01.A02(4);
                        } else {
                            A01.A05(4, str2);
                        }
                        A01.A04(5, anonymousClass092.A07());
                        A01.A04(6, anonymousClass092.A04);
                        A01.A04(7, anonymousClass092.A0E);
                        long j = anonymousClass092.A0C;
                        if (j == 0) {
                            j = this.A01.A05();
                        }
                        A01.A04(8, j);
                        A01.A04(9, anonymousClass092.A0D);
                        A01.A04(10, anonymousClass092.A06());
                        String A16 = anonymousClass092.A16();
                        if (A16 == null) {
                            A01.A02(11);
                        } else {
                            A01.A05(11, A16);
                        }
                        A01.A04(12, anonymousClass092.A09());
                        A01.A04(13, anonymousClass092.A0q);
                    } else {
                        throw null;
                    }
                }
                A01.A00();
            }
            A00.A00();
            A00.close();
            A04.close();
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

    public boolean A09() {
        if (A0A()) {
            return true;
        }
        String A02 = this.A06.A02("migration_message_main_index");
        return A02 != null && Long.parseLong(A02) > 0;
    }

    public boolean A0A() {
        return this.A06.A01("main_message_ready", 0L) == 1;
    }
}
