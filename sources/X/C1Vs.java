package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteProgram;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Vs  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Vs implements InterfaceC16910rE {
    public final AbstractC28861Ue A00;
    public final AbstractC15540ov A01;

    public C1Vs(final AbstractC15540ov __db) {
        this.A01 = __db;
        this.A00 = new AbstractC28861Ue(__db) { // from class: X.1pE
            @Override // X.AbstractC15570oy
            public String A01() {
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }

            @Override // X.AbstractC28861Ue
            public void A03(C38621oi stmt, Object value) {
                SQLiteProgram sQLiteProgram;
                C16900rD c16900rD = (C16900rD) value;
                String str = c16900rD.A01;
                if (str == null) {
                    sQLiteProgram = ((C28961Up) stmt).A00;
                    sQLiteProgram.bindNull(1);
                } else {
                    sQLiteProgram = ((C28961Up) stmt).A00;
                    sQLiteProgram.bindString(1, str);
                }
                String str2 = c16900rD.A00;
                if (str2 == null) {
                    sQLiteProgram.bindNull(2);
                } else {
                    sQLiteProgram.bindString(2, str2);
                }
            }
        };
    }

    public List A00(final String id) {
        C28911Uj A00 = C28911Uj.A00("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (id == null) {
            A00.A03[1] = 1;
        } else {
            A00.A02(1, id);
        }
        AbstractC15540ov abstractC15540ov = this.A01;
        abstractC15540ov.A02();
        Cursor A002 = C15600p1.A00(abstractC15540ov, A00, false);
        try {
            ArrayList arrayList = new ArrayList(A002.getCount());
            while (A002.moveToNext()) {
                arrayList.add(A002.getString(0));
            }
            return arrayList;
        } finally {
            A002.close();
            A00.A01();
        }
    }
}
