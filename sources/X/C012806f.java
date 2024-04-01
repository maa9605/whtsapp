package X;

import android.database.sqlite.SQLiteConstraintException;

/* renamed from: X.06f  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C012806f {
    public static volatile C012806f A05;
    public final C02L A00;
    public final C05A A01;
    public final C05E A02;
    public final C05C A03;
    public final C05L A04;

    public C012806f(C05A c05a, C02L c02l, C05C c05c, C05L c05l, C05E c05e) {
        this.A01 = c05a;
        this.A00 = c02l;
        this.A03 = c05c;
        this.A04 = c05l;
        this.A02 = c05e;
    }

    public static C012806f A00() {
        if (A05 == null) {
            synchronized (C012806f.class) {
                if (A05 == null) {
                    A05 = new C012806f(C05A.A00(), C02L.A00(), C05C.A00(), C05L.A00(), C05E.A00());
                }
            }
        }
        return A05;
    }

    public static final void A01(long j, C0KD c0kd, C0CF c0cf) {
        c0cf.A04(1, j);
        c0cf.A03(2, c0kd.A00);
        c0cf.A03(3, c0kd.A01);
        if (c0kd instanceof C0LP) {
            C0LP c0lp = (C0LP) c0kd;
            String str = c0lp.A01;
            if (str == null) {
                c0cf.A02(4);
            } else {
                c0cf.A05(4, str);
            }
            String str2 = c0lp.A00;
            if (str2 == null) {
                c0cf.A02(5);
            } else {
                c0cf.A05(5, str2);
            }
            String str3 = c0lp.A02;
            if (str3 == null) {
                c0cf.A02(6);
            } else {
                c0cf.A05(6, str3);
            }
        } else if (c0kd instanceof C0KC) {
            c0cf.A02(4);
            c0cf.A02(5);
            c0cf.A02(6);
        }
        byte[] A08 = c0kd.A0E().A08();
        if (A08 != null) {
            c0cf.A00.bindBlob(7, A08);
        } else {
            c0cf.A02(7);
        }
    }

    public void A02(C0KD c0kd) {
        if (!A05()) {
            if (c0kd.A0p > 0) {
                long j = c0kd.A0p;
                String A02 = this.A03.A02("migration_message_location_index");
                if (j > (A02 == null ? 0L : Long.parseLong(A02))) {
                    return;
                }
            } else {
                return;
            }
        }
        boolean z = c0kd.A0p > 0;
        StringBuilder A0P = C000200d.A0P("LocationMessageStore/insertOrUpdateLocationMessage/message must have row_id set; key=");
        AnonymousClass094 anonymousClass094 = c0kd.A0n;
        C000200d.A1L(A0P, anonymousClass094, z);
        C000200d.A1L(C000200d.A0P("LocationMessageStore/insertOrUpdateLocationMessage/message in main storage; key="), anonymousClass094, c0kd.A09 == 1);
        try {
            C0CD A04 = this.A02.A04();
            C0CF A01 = this.A04.A01("INSERT INTO message_location(    message_row_id,    chat_row_id,    latitude,    longitude,    place_name,    place_address,    url,    live_location_share_duration,    live_location_sequence_number,    live_location_final_latitude,    live_location_final_longitude,    live_location_final_timestamp,    map_download_status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            A04(c0kd, A01);
            C000700j.A0A(A01.A01() == c0kd.A0p, "LocationMessageStore/insertOrUpdateLocationMessage/inserted row should have same row_id");
            A04.close();
        } catch (SQLiteConstraintException e) {
            C0CF A012 = this.A04.A01("UPDATE message_location   SET message_row_id = ?,       chat_row_id = ?,       latitude = ?,       longitude = ?,       place_name = ?,       place_address = ?,       url = ?,       live_location_share_duration = ?,       live_location_sequence_number = ?,       live_location_final_latitude = ?,       live_location_final_longitude = ?,       live_location_final_timestamp = ?,       map_download_status = ? WHERE message_row_id = ?");
            A04(c0kd, A012);
            A012.A05(14, Long.toString(c0kd.A0p));
            if (A012.A00() != 1) {
                throw e;
            }
        }
    }

    public void A03(C0KD c0kd, long j) {
        C000200d.A1L(C000200d.A0P("LocationMessageStore/insertOrUpdateQuotedLocationMessage/message in main storage; key="), c0kd.A0n, c0kd.A09 == 2);
        try {
            C0CD A04 = this.A02.A04();
            C0CF A01 = this.A04.A01("INSERT INTO message_quoted_location (    message_row_id,    latitude,    longitude,    place_name,    place_address,    url,    thumbnail) VALUES (?, ?, ?, ?, ?, ?, ?)");
            A01(j, c0kd, A01);
            C000700j.A0A(A01.A01() == j, "LocationMessageStore/insertOrUpdateQuotedLocationMessage/inserted row should have same row_id");
            A04.close();
        } catch (SQLiteConstraintException e) {
            C0CF A012 = this.A04.A01("UPDATE message_quoted_location    SET message_row_id = ?,        latitude = ?,        longitude = ?,        place_name = ?,        place_address = ?,        url = ?,        thumbnail = ? WHERE message_row_id = ?");
            A01(j, c0kd, A012);
            A012.A05(8, Long.toString(j));
            if (A012.A00() != 1) {
                throw e;
            }
        }
    }

    public final void A04(C0KD c0kd, C0CF c0cf) {
        c0cf.A04(1, c0kd.A0p);
        C05A c05a = this.A01;
        AbstractC005302j abstractC005302j = c0kd.A0n.A00;
        if (abstractC005302j != null) {
            c0cf.A04(2, c05a.A05(abstractC005302j));
            c0cf.A03(3, c0kd.A00);
            c0cf.A03(4, c0kd.A01);
            if (c0kd instanceof C0LP) {
                C0LP c0lp = (C0LP) c0kd;
                String str = c0lp.A01;
                if (str == null) {
                    c0cf.A02(5);
                } else {
                    c0cf.A05(5, str);
                }
                String str2 = c0lp.A00;
                if (str2 == null) {
                    c0cf.A02(6);
                } else {
                    c0cf.A05(6, str2);
                }
                String str3 = c0lp.A02;
                if (str3 == null) {
                    c0cf.A02(7);
                } else {
                    c0cf.A05(7, str3);
                }
                c0cf.A02(8);
                c0cf.A02(9);
                c0cf.A02(10);
                c0cf.A02(11);
                c0cf.A02(12);
            } else if (c0kd instanceof C0KC) {
                c0cf.A02(5);
                c0cf.A02(6);
                c0cf.A02(7);
                C0KC c0kc = (C0KC) c0kd;
                c0cf.A04(8, c0kc.A00);
                c0cf.A04(9, c0kc.A01);
                C0K0 c0k0 = c0kc.A02;
                if (c0k0 != null) {
                    c0cf.A03(10, c0k0.A00);
                    c0cf.A03(11, c0k0.A01);
                    c0cf.A04(12, c0k0.A05);
                } else {
                    c0cf.A02(10);
                    c0cf.A02(11);
                    c0cf.A02(12);
                }
            }
            int i = c0kd.A02;
            c0cf.A04(13, i != 1 ? i : 0);
            return;
        }
        throw null;
    }

    public boolean A05() {
        return this.A01.A0G() && this.A03.A01("location_ready", 0L) == 2;
    }
}
