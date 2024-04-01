package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.06S */
/* loaded from: classes.dex */
public class C06S {
    public static volatile C06S A0C;
    public final C02L A00;
    public final C06K A01;
    public final C05W A02;
    public final C001200o A03;
    public final C002301c A04;
    public final C06T A05;
    public final C05A A06;
    public final C05M A07;
    public final C05B A08;
    public final C05N A09;
    public final C05E A0A;
    public final C05C A0B;

    public C06S(C001200o c001200o, C05B c05b, C05A c05a, C02L c02l, C05M c05m, C05W c05w, C002301c c002301c, C05C c05c, C06T c06t, C05E c05e, C06K c06k, C05N c05n) {
        this.A03 = c001200o;
        this.A08 = c05b;
        this.A06 = c05a;
        this.A00 = c02l;
        this.A07 = c05m;
        this.A02 = c05w;
        this.A04 = c002301c;
        this.A0B = c05c;
        this.A05 = c06t;
        this.A0A = c05e;
        this.A01 = c06k;
        this.A09 = c05n;
    }

    public static C06S A00() {
        if (A0C == null) {
            synchronized (C06S.class) {
                if (A0C == null) {
                    C001200o c001200o = C001200o.A01;
                    C05B A00 = C05B.A00();
                    C05A A002 = C05A.A00();
                    C02L A003 = C02L.A00();
                    C05M A004 = C05M.A00();
                    C01B.A00();
                    C05W A005 = C05W.A00();
                    C002301c A006 = C002301c.A00();
                    C05C A007 = C05C.A00();
                    C05L.A00();
                    A0C = new C06S(c001200o, A00, A002, A003, A004, A005, A006, A007, C06T.A02, C05E.A00(), C06K.A00(), C05N.A00());
                }
            }
        }
        return A0C;
    }

    public final List A01(long j, boolean z) {
        String str = z ? "SELECT vcard FROM message_quoted_vcard WHERE message_row_id = ? AND vcard IS NOT NULL AND vcard != \"\"" : "SELECT vcard FROM message_vcard WHERE message_row_id = ? AND vcard IS NOT NULL AND vcard != \"\"";
        ArrayList arrayList = new ArrayList();
        try {
            Cursor A07 = this.A0A.A03().A02.A07(str, new String[]{Long.toString(j)});
            int columnIndexOrThrow = A07.getColumnIndexOrThrow("vcard");
            while (A07.moveToNext()) {
                arrayList.add(A07.getString(columnIndexOrThrow));
            }
            A07.close();
            return arrayList;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0021, code lost:
        if (r2 > r4) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(X.C0D8 r8) {
        /*
            r7 = this;
            boolean r0 = r7.A0A()
            if (r0 != 0) goto L26
            long r1 = r8.A0p
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L23
            long r2 = r8.A0p
            X.05C r1 = r7.A0B
            java.lang.String r0 = "migration_vcard_index"
            java.lang.String r0 = r1.A02(r0)
            if (r0 == 0) goto L1e
            long r4 = java.lang.Long.parseLong(r0)
        L1e:
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L24
        L23:
            r0 = 0
        L24:
            if (r0 == 0) goto L36
        L26:
            java.lang.String r0 = r8.A0G()
            if (r0 == 0) goto L36
            java.lang.String r2 = r8.A0G()
            long r0 = r8.A0p
            r7.A07(r2, r0)
            return
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06S.A02(X.0D8):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0021, code lost:
        if (r2 > r4) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(X.C0DA r8) {
        /*
            r7 = this;
            boolean r0 = r7.A0A()
            if (r0 != 0) goto L26
            long r1 = r8.A0p
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L23
            long r2 = r8.A0p
            X.05C r1 = r7.A0B
            java.lang.String r0 = "migration_vcard_index"
            java.lang.String r0 = r1.A02(r0)
            if (r0 == 0) goto L1e
            long r4 = java.lang.Long.parseLong(r0)
        L1e:
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L24
        L23:
            r0 = 0
        L24:
            if (r0 == 0) goto L6c
        L26:
            java.util.List r0 = r8.A18()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6c
            java.util.List r1 = r8.A18()
            X.05E r0 = r7.A0A
            X.0CD r5 = r0.A04()
            X.0Hb r4 = r5.A00()     // Catch: java.lang.Throwable -> L65
            java.util.Iterator r3 = r1.iterator()     // Catch: java.lang.Throwable -> L5e
        L42:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L54
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L5e
            long r0 = r8.A0p     // Catch: java.lang.Throwable -> L5e
            r7.A07(r2, r0)     // Catch: java.lang.Throwable -> L5e
            goto L42
        L54:
            r4.A00()     // Catch: java.lang.Throwable -> L5e
            r4.close()     // Catch: java.lang.Throwable -> L65
            r5.close()
            return
        L5e:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L60
        L60:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L64
        L64:
            throw r0     // Catch: java.lang.Throwable -> L65
        L65:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L67
        L67:
            r0 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L6b
        L6b:
            throw r0
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06S.A03(X.0DA):void");
    }

    public void A04(C0DA c0da, long j) {
        List<String> A18 = c0da.A18();
        if (A18.isEmpty()) {
            return;
        }
        C0CD A04 = this.A0A.A04();
        try {
            C03790Hb A00 = A04.A00();
            for (String str : A18) {
                A06(str, j);
            }
            A00.A00();
            A00.close();
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

    public void A05(C09E c09e) {
        if (((AnonymousClass092) c09e).A04 != 7 || ((AnonymousClass097) c09e).A02 == null) {
            return;
        }
        C0CD A03 = this.A0A.A03();
        try {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("message_row_id", Long.valueOf(c09e.A0p));
            contentValues.put("count", Integer.valueOf(((AnonymousClass097) c09e).A02.A01));
            A03.A02.A04("message_media_vcard_count", contentValues);
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

    public final void A06(String str, long j) {
        C0CD A04 = this.A0A.A04();
        try {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("message_row_id", Long.valueOf(j));
            contentValues.put("vcard", str);
            A04.A02.A06("message_quoted_vcard", contentValues, 4);
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

    public final void A07(String str, long j) {
        C0CD A04 = this.A0A.A04();
        try {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("message_row_id", Long.valueOf(j));
            contentValues.put("vcard", str);
            A04.A02.A06("message_vcard", contentValues, 4);
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

    public final void A08(List list, long j) {
        List A02 = C04110Ip.A02(this.A03, this.A02, this.A04, this.A01, list);
        C0CD A04 = this.A0A.A04();
        try {
            C03790Hb A00 = A04.A00();
            Iterator it = ((AbstractCollection) A02).iterator();
            while (it.hasNext()) {
                C04120Iq c04120Iq = (C04120Iq) it.next();
                A07(c04120Iq.A00, j);
                A09(c04120Iq, j);
            }
            A00.A00();
            A00.close();
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

    public final void A09(C04120Iq c04120Iq, long j) {
        long j2;
        String str = c04120Iq.A00;
        C05E c05e = this.A0A;
        C0CD A03 = c05e.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT _id FROM message_vcard WHERE message_row_id = ? AND vcard = ?", new String[]{Long.toString(j), str});
            if (A07.moveToFirst()) {
                j2 = A07.getLong(A07.getColumnIndex("_id"));
                A07.close();
                A03.close();
            } else {
                A07.close();
                A03.close();
                j2 = -1;
            }
            List<C09010cT> list = c04120Iq.A01.A05;
            if (list != null) {
                C0CD A04 = c05e.A04();
                try {
                    C03790Hb A00 = A04.A00();
                    for (C09010cT c09010cT : list) {
                        if (c09010cT.A01 != null) {
                            ContentValues contentValues = new ContentValues(3);
                            contentValues.put("vcard_jid_row_id", Long.valueOf(this.A08.A02(c09010cT.A01)));
                            contentValues.put("vcard_row_id", Long.valueOf(j2));
                            contentValues.put("message_row_id", Long.valueOf(j));
                            A04.A02.A02("message_vcard_jid", contentValues);
                        }
                    }
                    A00.A00();
                    A00.close();
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
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    A03.close();
                } catch (Throwable unused2) {
                }
                throw th3;
            }
        }
    }

    public boolean A0A() {
        String A02;
        return this.A08.A0C() && (A02 = this.A0B.A02("new_vcards_ready")) != null && Integer.parseInt(A02) == 1;
    }
}
