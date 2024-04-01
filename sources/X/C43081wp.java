package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* renamed from: X.1wp */
/* loaded from: classes2.dex */
public class C43081wp {
    public static volatile C43081wp A0D;
    public final AnonymousClass012 A00;
    public final C002301c A01;
    public final C05A A02;
    public final C05M A03;
    public final C05D A04;
    public final C03710Gt A05;
    public final C0D5 A06;
    public final C0EO A07;
    public final C05S A08;
    public final C012406b A09;
    public final C00A A0A;
    public final C05N A0B;
    public final C05E A0C;

    public C43081wp(AnonymousClass012 anonymousClass012, C05A c05a, C05M c05m, C0EO c0eo, C002301c c002301c, C0D5 c0d5, C05S c05s, C00A c00a, C012406b c012406b, C05D c05d, C03710Gt c03710Gt, C05E c05e, C05N c05n) {
        this.A00 = anonymousClass012;
        this.A02 = c05a;
        this.A03 = c05m;
        this.A07 = c0eo;
        this.A01 = c002301c;
        this.A06 = c0d5;
        this.A08 = c05s;
        this.A0A = c00a;
        this.A04 = c05d;
        this.A05 = c03710Gt;
        this.A09 = c012406b;
        this.A0C = c05e;
        this.A0B = c05n;
    }

    public static C43081wp A00() {
        if (A0D == null) {
            synchronized (C43081wp.class) {
                if (A0D == null) {
                    A0D = new C43081wp(AnonymousClass012.A00(), C05A.A00(), C05M.A00(), C0EO.A00(), C002301c.A00(), C0D5.A00(), C05S.A00(), C00A.A00, C012406b.A00(), C05D.A00(), C03710Gt.A00(), C05E.A00(), C05N.A00());
                }
            }
        }
        return A0D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0056, code lost:
        if (r3 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long A01(X.AbstractC005302j r7) {
        /*
            r6 = this;
            X.05E r0 = r6.A0C
            X.0CD r2 = r0.A03()
            X.0CE r5 = r2.A02     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = "SELECT COUNT(*) FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND starred = 1 AND (message_type != '7')"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L68
            X.05A r0 = r6.A02     // Catch: java.lang.Throwable -> L68
            long r0 = r0.A05(r7)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L68
            r1 = 0
            r3[r1] = r0     // Catch: java.lang.Throwable -> L68
            android.database.Cursor r3 = r5.A07(r4, r3)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L40
            boolean r0 = r3.moveToNext()     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L2b
            long r0 = r3.getLong(r1)     // Catch: java.lang.Throwable -> L5f
            goto L58
        L2b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r1.<init>()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "msgstore/countStarredMessages/db no message for "
            r1.append(r0)     // Catch: java.lang.Throwable -> L5f
            r1.append(r7)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L5f
            com.whatsapp.util.Log.i(r0)     // Catch: java.lang.Throwable -> L5f
            goto L54
        L40:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r1.<init>()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "msgstore/countStarredMessages/db no cursor for "
            r1.append(r0)     // Catch: java.lang.Throwable -> L5f
            r1.append(r7)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L5f
            com.whatsapp.util.Log.i(r0)     // Catch: java.lang.Throwable -> L5f
        L54:
            r0 = 0
            if (r3 == 0) goto L5b
        L58:
            r3.close()     // Catch: java.lang.Throwable -> L68
        L5b:
            r2.close()
            return r0
        L5f:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L61
        L61:
            r0 = move-exception
            if (r3 == 0) goto L67
            r3.close()     // Catch: java.lang.Throwable -> L67
        L67:
            throw r0     // Catch: java.lang.Throwable -> L68
        L68:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L6a
        L6a:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L6e
        L6e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43081wp.A01(X.02j):long");
    }

    public Cursor A02(AbstractC005302j abstractC005302j, String str, C0HE c0he) {
        Cursor A08;
        AnonymousClass012 anonymousClass012 = this.A00;
        long A04 = anonymousClass012.A04();
        C0D5 c0d5 = this.A06;
        long A042 = c0d5.A04();
        try {
            C0CD A03 = this.A0C.A03();
            if (TextUtils.isEmpty(str)) {
                A08 = A03.A02.A08(C0HD.A04, new String[]{String.valueOf(this.A02.A05(abstractC005302j))}, c0he);
            } else {
                if (A042 == 1) {
                    A08 = A03.A02.A08(C0HD.A15, new String[]{String.valueOf(this.A02.A05(abstractC005302j)), TextUtils.isEmpty(str) ? null : c0d5.A0G(str)}, c0he);
                } else {
                    C0IU c0iu = new C0IU(this.A01);
                    c0iu.A08 = str;
                    c0iu.A03 = null;
                    c0iu.A04 = abstractC005302j;
                    A08 = A03.A02.A08(C0HD.A16, new String[]{c0d5.A0B(c0iu, c0he)}, c0he);
                }
            }
            A03.close();
            return A08;
        } finally {
            C000200d.A0e(anonymousClass012, A04, this.A04, "StarredMessageStore/getStarredMessagesForJid");
        }
    }

    public Cursor A03(String str, C0HE c0he) {
        Cursor A08;
        AnonymousClass012 anonymousClass012 = this.A00;
        long A04 = anonymousClass012.A04();
        C0D5 c0d5 = this.A06;
        long A042 = c0d5.A04();
        try {
            C0CD A03 = this.A0C.A03();
            if (TextUtils.isEmpty(str)) {
                A08 = A03.A02.A08(C0HD.A06, null, c0he);
            } else if (A042 == 1) {
                A08 = A03.A02.A08(C0HD.A17, new String[]{TextUtils.isEmpty(str) ? null : c0d5.A0G(str)}, c0he);
            } else {
                C0IU c0iu = new C0IU(this.A01);
                c0iu.A08 = str;
                c0iu.A03 = null;
                A08 = A03.A02.A08(C0HD.A18, new String[]{c0d5.A0B(c0iu, c0he)}, c0he);
            }
            A03.close();
            return A08;
        } finally {
            C000200d.A0e(anonymousClass012, A04, this.A04, "StarredMessageStore/getStarredMessages");
        }
    }

    public final void A04(Collection collection, final boolean z, boolean z2) {
        boolean z3;
        C000700j.A00();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((AnonymousClass092) it.next()).A0j = z;
        }
        AnonymousClass012 anonymousClass012 = this.A00;
        long A04 = anonymousClass012.A04();
        try {
            C0CD A042 = this.A0C.A04();
            try {
                try {
                    C03790Hb A00 = A042.A00();
                    try {
                        C05S c05s = this.A08;
                        HashSet hashSet = new HashSet();
                        C05E c05e = c05s.A05;
                        C0CD A043 = c05e.A04();
                        C03790Hb A002 = A043.A00();
                        Iterator it2 = collection.iterator();
                        while (it2.hasNext()) {
                            AnonymousClass092 anonymousClass092 = (AnonymousClass092) it2.next();
                            boolean z4 = false;
                            c05e.A05();
                            if (c05e.A06.A0N()) {
                                C0CD A044 = c05e.A04();
                                AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                                AbstractC005302j abstractC005302j = anonymousClass094.A00;
                                if (abstractC005302j != null) {
                                    String rawString = abstractC005302j.getRawString();
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("starred", Integer.valueOf(z ? 1 : 0));
                                    String[] strArr = new String[3];
                                    strArr[0] = rawString;
                                    strArr[1] = anonymousClass094.A02 ? "1" : "0";
                                    strArr[2] = anonymousClass094.A01;
                                    if (A044.A02.A00("messages", contentValues, "key_remote_jid = ? AND key_from_me = ? AND key_id = ?", strArr) == 0) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("MainMessageStore/updateMessageStarredStatus/did not update; message.key=");
                                        sb.append(anonymousClass094);
                                        Log.e(sb.toString());
                                        A044.close();
                                    } else {
                                        A044.close();
                                        z4 = true;
                                    }
                                } else {
                                    throw null;
                                }
                            }
                            if (c05s.A09()) {
                                C0CF A01 = c05s.A07.A01("UPDATE message SET starred = ? WHERE chat_row_id = ? AND from_me = ? AND key_id = ?");
                                C05A c05a = c05s.A03;
                                AnonymousClass094 anonymousClass0942 = anonymousClass092.A0n;
                                AbstractC005302j abstractC005302j2 = anonymousClass0942.A00;
                                if (abstractC005302j2 != null) {
                                    A01.A04(2, c05a.A05(abstractC005302j2));
                                    A01.A04(3, anonymousClass0942.A02 ? 1L : 0L);
                                    A01.A05(4, anonymousClass0942.A01);
                                    A01.A04(1, z ? 1L : 0L);
                                    if (A01.A00() == 0) {
                                        StringBuilder A0P = C000200d.A0P("MainMessageStore/updateMessageStarredStatusV2/update failed; message.key=");
                                        A0P.append(anonymousClass0942);
                                        Log.e(A0P.toString());
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                } else {
                                    throw null;
                                }
                            } else {
                                z3 = false;
                            }
                            if (z4 || z3) {
                                hashSet.add(anonymousClass092.A0n.A00);
                            }
                        }
                        A002.A00();
                        A002.close();
                        A043.close();
                        HashMap hashMap = z2 ? new HashMap() : null;
                        if (hashMap != null) {
                            Iterator it3 = hashSet.iterator();
                            while (it3.hasNext()) {
                                AbstractC005302j abstractC005302j3 = (AbstractC005302j) it3.next();
                                C0IT A07 = this.A03.A07(abstractC005302j3);
                                if (A07 != null) {
                                    int nextInt = new Random().nextInt(999999) + 1;
                                    A07.A08 = nextInt;
                                    if (!this.A02.A0H(A07)) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("msgstore/starmsg/chatlist/insert/failed jid=");
                                        sb2.append(abstractC005302j3);
                                        Log.e(sb2.toString());
                                    }
                                    hashMap.put(abstractC005302j3, Integer.valueOf(nextInt));
                                } else {
                                    hashMap.remove(abstractC005302j3);
                                }
                            }
                        }
                        A00.A00();
                        final long A045 = this.A06.A04();
                        Iterator it4 = collection.iterator();
                        while (it4.hasNext()) {
                            final AnonymousClass092 anonymousClass0922 = (AnonymousClass092) it4.next();
                            try {
                                this.A09.A01(new C0IV() { // from class: X.3A5
                                    {
                                        C43081wp.this = this;
                                    }

                                    @Override // X.C0IV
                                    public final void AVl(AnonymousClass092 anonymousClass0923) {
                                        C43081wp c43081wp = C43081wp.this;
                                        AnonymousClass092 anonymousClass0924 = anonymousClass0922;
                                        boolean z5 = z;
                                        long j = A045;
                                        if (anonymousClass0923.A0n.equals(anonymousClass0924.A0n)) {
                                            anonymousClass0923.A0j = z5;
                                            C0D5 c0d5 = c43081wp.A06;
                                            if (c0d5 == null) {
                                                throw null;
                                            }
                                            if (j != 1) {
                                                C0CD A046 = c0d5.A0B.A04();
                                                try {
                                                    C0CF A012 = c0d5.A0D.A01("UPDATE message_ftsv2 SET fts_namespace=? WHERE docid=?");
                                                    A012.A05(1, c0d5.A0F(anonymousClass0923));
                                                    A012.A04(2, anonymousClass0923.A0p);
                                                    A012.A00();
                                                } catch (Throwable th) {
                                                    try {
                                                        throw th;
                                                    } finally {
                                                        try {
                                                            A046.close();
                                                        } catch (Throwable unused) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                });
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        this.A07.A02.post(new RunnableEBaseShape0S0310000_I0(this, z, collection, hashMap, 1));
                        this.A04.A01("StarredMessageStore/updateMessageStarredStateInternal", anonymousClass012.A04() - A04);
                        A00.close();
                        A042.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e(e);
            this.A0B.A03();
        }
    }

    public boolean A05(final AbstractC005302j abstractC005302j) {
        C0CD A04;
        C03790Hb A00;
        C0CD A042;
        AnonymousClass012 anonymousClass012 = this.A00;
        long A043 = anonymousClass012.A04();
        Set A06 = this.A05.A06();
        if (abstractC005302j != null ? ((AbstractCollection) A06).contains(abstractC005302j) : !((AbstractCollection) A06).isEmpty()) {
            return false;
        }
        try {
            A04 = this.A0C.A04();
            A00 = A04.A00();
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e(e);
            this.A0B.A03();
        }
        try {
            C05S c05s = this.A08;
            C05E c05e = c05s.A05;
            C0CD A044 = c05e.A04();
            C03790Hb A002 = A044.A00();
            c05e.A05();
            if (c05e.A06.A0N()) {
                A042 = c05e.A04();
                try {
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("starred", (Integer) 0);
                    StringBuilder sb = new StringBuilder();
                    sb.append("starred=? AND (status IS NULL OR status!=6)");
                    sb.append(abstractC005302j != null ? " AND key_remote_jid = ?" : "");
                    int A003 = A042.A02.A00("messages", contentValues, sb.toString(), abstractC005302j != null ? new String[]{"1", abstractC005302j.getRawString()} : new String[]{"1"});
                    if (A003 != 0 && !c05s.A0A()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("MainMessageStore/unStarAllMessageV1/rowChanged=");
                        sb2.append(A003);
                        Log.i(sb2.toString());
                    }
                } finally {
                }
            }
            A042 = c05e.A04();
            try {
                ContentValues contentValues2 = new ContentValues(1);
                contentValues2.put("starred", (Integer) 0);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("starred=? AND message_type !=?");
                sb3.append(abstractC005302j != null ? " AND chat_row_id=?" : "");
                int A004 = A042.A02.A00("message", contentValues2, sb3.toString(), abstractC005302j != null ? new String[]{"1", String.valueOf(7), String.valueOf(c05s.A03.A05(abstractC005302j))} : new String[]{"1", String.valueOf(7)});
                if (A004 != 0 && c05s.A0A()) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("MainMessageStore/unStarAllMessageV1/rowChanged=");
                    sb4.append(A004);
                    Log.i(sb4.toString());
                }
                A042.close();
                A002.A00();
                A002.close();
                A044.close();
                A00.A00();
                this.A09.A01(new C0IV() { // from class: X.3A6
                    @Override // X.C0IV
                    public final void AVl(AnonymousClass092 anonymousClass092) {
                        AbstractC005302j abstractC005302j2 = abstractC005302j;
                        if (abstractC005302j2 != null) {
                            AbstractC005302j abstractC005302j3 = anonymousClass092.A0n.A00;
                            if (abstractC005302j3 == null) {
                                throw null;
                            }
                            if (!abstractC005302j3.equals(abstractC005302j2)) {
                                return;
                            }
                        }
                        anonymousClass092.A0j = false;
                    }
                });
                this.A04.A01("StarredMessageStore/unstarAll", anonymousClass012.A04() - A043);
                A00.close();
                A04.close();
                this.A07.A02.post(new RunnableEBaseShape1S0200000_I0_1(this, abstractC005302j, 47));
                return true;
            } finally {
                try {
                    throw th;
                } finally {
                    try {
                        A042.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A00.close();
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        }
    }

    public boolean A06(Collection collection, boolean z) {
        Set A06 = this.A05.A06();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
            AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
            if (((AbstractCollection) A06).contains(abstractC005302j)) {
                long j = anonymousClass092.A0p;
                C05M c05m = this.A03;
                if (abstractC005302j != null) {
                    C0IT A07 = c05m.A07(abstractC005302j);
                    if (j < (A07 == null ? -1L : A07.A0C)) {
                        return false;
                    }
                } else {
                    throw null;
                }
            }
        }
        A04(collection, false, z);
        return true;
    }
}
