package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteProgram;

/* renamed from: X.1Vt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29181Vt implements InterfaceC16930rG {
    public final AbstractC28861Ue A00;
    public final AbstractC15540ov A01;

    public C29181Vt(final AbstractC15540ov __db) {
        this.A01 = __db;
        this.A00 = new AbstractC28861Ue(__db) { // from class: X.1pF
            @Override // X.AbstractC15570oy
            public String A01() {
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            }

            @Override // X.AbstractC28861Ue
            public void A03(C38621oi stmt, Object value) {
                SQLiteProgram sQLiteProgram;
                C16920rF c16920rF = (C16920rF) value;
                String str = c16920rF.A01;
                if (str == null) {
                    sQLiteProgram = ((C28961Up) stmt).A00;
                    sQLiteProgram.bindNull(1);
                } else {
                    sQLiteProgram = ((C28961Up) stmt).A00;
                    sQLiteProgram.bindString(1, str);
                }
                Long l = c16920rF.A00;
                if (l == null) {
                    sQLiteProgram.bindNull(2);
                } else {
                    sQLiteProgram.bindLong(2, l.longValue());
                }
            }
        };
    }

    public Long A00(final String key) {
        C28911Uj A00 = C28911Uj.A00("SELECT long_value FROM Preference where `key`=?", 1);
        if (key == null) {
            A00.A03[1] = 1;
        } else {
            A00.A02(1, key);
        }
        AbstractC15540ov abstractC15540ov = this.A01;
        abstractC15540ov.A02();
        Long l = null;
        Cursor A002 = C15600p1.A00(abstractC15540ov, A00, false);
        try {
            if (A002.moveToFirst() && !A002.isNull(0)) {
                l = Long.valueOf(A002.getLong(0));
            }
            return l;
        } finally {
            A002.close();
            A00.A01();
        }
    }

    public void A01(final C16920rF preference) {
        AbstractC15540ov abstractC15540ov = this.A01;
        abstractC15540ov.A02();
        abstractC15540ov.A03();
        try {
            this.A00.A04(preference);
            abstractC15540ov.A05();
        } finally {
            abstractC15540ov.A04();
        }
    }
}
