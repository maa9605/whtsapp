package X;

import android.database.sqlite.SQLiteProgram;

/* renamed from: X.1Vw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29211Vw implements InterfaceC16970rK {
    public final AbstractC28861Ue A00;
    public final AbstractC15540ov A01;

    public C29211Vw(final AbstractC15540ov __db) {
        this.A01 = __db;
        this.A00 = new AbstractC28861Ue(__db) { // from class: X.1pH
            @Override // X.AbstractC15570oy
            public String A01() {
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            }

            @Override // X.AbstractC28861Ue
            public void A03(C38621oi stmt, Object value) {
                SQLiteProgram sQLiteProgram;
                C16960rJ c16960rJ = (C16960rJ) value;
                String str = c16960rJ.A00;
                if (str == null) {
                    sQLiteProgram = ((C28961Up) stmt).A00;
                    sQLiteProgram.bindNull(1);
                } else {
                    sQLiteProgram = ((C28961Up) stmt).A00;
                    sQLiteProgram.bindString(1, str);
                }
                String str2 = c16960rJ.A01;
                if (str2 == null) {
                    sQLiteProgram.bindNull(2);
                } else {
                    sQLiteProgram.bindString(2, str2);
                }
            }
        };
    }
}
