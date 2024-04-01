package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteProgram;

/* renamed from: X.1Vv */
/* loaded from: classes.dex */
public final class C29201Vv implements InterfaceC16950rI {
    public final AbstractC28861Ue A00;
    public final AbstractC15540ov A01;
    public final AbstractC15570oy A02;

    public C29201Vv(AbstractC15540ov __db) {
        this.A01 = __db;
        this.A00 = new AbstractC28861Ue(__db) { // from class: X.1pG
            @Override // X.AbstractC15570oy
            public String A01() {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
            }

            @Override // X.AbstractC28861Ue
            public void A03(C38621oi stmt, Object value) {
                SQLiteProgram sQLiteProgram;
                C16940rH c16940rH = (C16940rH) value;
                String str = c16940rH.A01;
                if (str == null) {
                    sQLiteProgram = ((C28961Up) stmt).A00;
                    sQLiteProgram.bindNull(1);
                } else {
                    sQLiteProgram = ((C28961Up) stmt).A00;
                    sQLiteProgram.bindString(1, str);
                }
                sQLiteProgram.bindLong(2, c16940rH.A00);
            }
        };
        this.A02 = new AbstractC15570oy(__db) { // from class: X.1Vu
            @Override // X.AbstractC15570oy
            public String A01() {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
        };
    }

    public C16940rH A00(final String workSpecId) {
        C28911Uj A00 = C28911Uj.A00("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (workSpecId == null) {
            A00.A03[1] = 1;
        } else {
            A00.A02(1, workSpecId);
        }
        AbstractC15540ov abstractC15540ov = this.A01;
        abstractC15540ov.A02();
        Cursor A002 = C15600p1.A00(abstractC15540ov, A00, false);
        try {
            return A002.moveToFirst() ? new C16940rH(A002.getString(C07O.A07(A002, "work_spec_id")), A002.getInt(C07O.A07(A002, "system_id"))) : null;
        } finally {
            A002.close();
            A00.A01();
        }
    }

    public void A01(final C16940rH systemIdInfo) {
        AbstractC15540ov abstractC15540ov = this.A01;
        abstractC15540ov.A02();
        abstractC15540ov.A03();
        try {
            this.A00.A04(systemIdInfo);
            abstractC15540ov.A05();
        } finally {
            abstractC15540ov.A04();
        }
    }

    public void A02(final String workSpecId) {
        AbstractC15540ov abstractC15540ov = this.A01;
        abstractC15540ov.A02();
        AbstractC15570oy abstractC15570oy = this.A02;
        C38621oi A00 = abstractC15570oy.A00();
        if (workSpecId == null) {
            ((C28961Up) A00).A00.bindNull(1);
        } else {
            ((C28961Up) A00).A00.bindString(1, workSpecId);
        }
        abstractC15540ov.A03();
        try {
            A00.A00.executeUpdateDelete();
            abstractC15540ov.A05();
            abstractC15540ov.A04();
            if (A00 == abstractC15570oy.A02) {
                abstractC15570oy.A01.set(false);
            }
        } catch (Throwable th) {
            abstractC15540ov.A04();
            abstractC15570oy.A02(A00);
            throw th;
        }
    }
}
