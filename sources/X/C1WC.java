package X;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1WC  reason: invalid class name */
/* loaded from: classes.dex */
public class C1WC extends AbstractRunnableC17040rR {
    public final /* synthetic */ C0OP A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public C1WC(final C0OP val$workManagerImpl, final String val$name, final boolean val$allowReschedule) {
        this.A00 = val$workManagerImpl;
        this.A01 = val$name;
        this.A02 = val$allowReschedule;
    }

    @Override // X.AbstractRunnableC17040rR
    public void A01() {
        C0OP c0op = this.A00;
        WorkDatabase workDatabase = c0op.A04;
        workDatabase.A03();
        try {
            InterfaceC17010rO A0B = workDatabase.A0B();
            String str = this.A01;
            C1W8 c1w8 = (C1W8) A0B;
            C28911Uj A00 = C28911Uj.A00("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
            if (str == null) {
                A00.A03[1] = 1;
            } else {
                A00.A02(1, str);
            }
            AbstractC15540ov abstractC15540ov = c1w8.A01;
            abstractC15540ov.A02();
            Cursor A002 = C15600p1.A00(abstractC15540ov, A00, false);
            ArrayList arrayList = new ArrayList(A002.getCount());
            while (A002.moveToNext()) {
                arrayList.add(A002.getString(0));
            }
            A002.close();
            A00.A01();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractRunnableC17040rR.A00(c0op, (String) it.next());
            }
            workDatabase.A05();
            workDatabase.A04();
            if (this.A02) {
                C16560qc.A01(c0op.A04, c0op.A07);
            }
        } catch (Throwable th) {
            workDatabase.A04();
            throw th;
        }
    }
}
