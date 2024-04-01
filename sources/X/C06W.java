package X;

import android.database.sqlite.SQLiteConstraintException;

/* renamed from: X.06W  reason: invalid class name */
/* loaded from: classes.dex */
public class C06W {
    public static volatile C06W A03;
    public final C05E A00;
    public final C05C A01;
    public final C05L A02;

    public C06W(C05C c05c, C05L c05l, C05E c05e) {
        this.A01 = c05c;
        this.A02 = c05l;
        this.A00 = c05e;
    }

    public static C06W A00() {
        if (A03 == null) {
            synchronized (C06W.class) {
                if (A03 == null) {
                    C01B.A00();
                    A03 = new C06W(C05C.A00(), C05L.A00(), C05E.A00());
                }
            }
        }
        return A03;
    }

    public static final void A01(AnonymousClass092 anonymousClass092) {
        boolean z = anonymousClass092.A0p > 0;
        StringBuilder A0P = C000200d.A0P("FutureMessageStore/validateMessage/message must have row_id set; key=");
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        C000200d.A1L(A0P, anonymousClass094, z);
        C000200d.A1L(C000200d.A0P("FutureMessageStore/validateMessage/message in main storage; key="), anonymousClass094, anonymousClass092.A09 == 1);
    }

    public void A02(C0KT c0kt) {
        if (!A03()) {
            if (c0kt.A0p > 0) {
                long j = c0kt.A0p;
                String A02 = this.A01.A02("migration_message_future_index");
                if (j > (A02 != null ? Long.parseLong(A02) : 0L)) {
                    return;
                }
            } else {
                return;
            }
        }
        A01(c0kt);
        try {
            C0CD A04 = this.A00.A04();
            C0CF A01 = this.A02.A01("INSERT INTO message_future(    message_row_id,    version,    data) VALUES (?, ?, ?)");
            A01.A04(1, c0kt.A0p);
            A01.A04(2, c0kt.A00);
            byte[] A15 = c0kt.A15();
            if (A15 == null) {
                A01.A02(3);
            } else {
                A01.A00.bindBlob(3, A15);
            }
            C000700j.A0A(A01.A01() == c0kt.A0p, "FutureMessageStore/insertOrUpdateFutureMessage/inserted row should have same row_id");
            A04.close();
        } catch (SQLiteConstraintException e) {
            C0CF A012 = this.A02.A01("UPDATE message_future   SET message_row_id = ?,       version = ?,       data = ? WHERE message_row_id = ?");
            A012.A04(1, c0kt.A0p);
            A012.A04(2, c0kt.A00);
            byte[] A152 = c0kt.A15();
            if (A152 == null) {
                A012.A02(3);
            } else {
                A012.A00.bindBlob(3, A152);
            }
            A012.A05(4, Long.toString(c0kt.A0p));
            if (A012.A00() != 1) {
                throw e;
            }
        }
    }

    public final boolean A03() {
        return this.A01.A01("future_ready", 0L) == 1;
    }
}
