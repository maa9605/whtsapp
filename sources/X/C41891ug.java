package X;

import android.database.Cursor;
import com.whatsapp.schedulers.work.SchedulerExperimentWorker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1ug */
/* loaded from: classes2.dex */
public class C41891ug {
    public static volatile C41891ug A02;
    public final C0OD A00;
    public final C41861ud A01;

    public C41891ug(C41861ud c41861ud, C0OD c0od) {
        this.A01 = c41861ud;
        this.A00 = c0od;
    }

    public static C41891ug A00() {
        if (A02 == null) {
            synchronized (C71173Vc.class) {
                if (A02 == null) {
                    A02 = new C41891ug(C41861ud.A00(), C0OP.A00(C001200o.A01.A00));
                }
            }
        }
        return A02;
    }

    public final C16480qT A01() {
        final C0OP c0op = (C0OP) this.A00;
        if (c0op != null) {
            AbstractRunnableC17140rc abstractRunnableC17140rc = new AbstractRunnableC17140rc() { // from class: X.1WD
                public final /* synthetic */ String A01 = "com.whatsapp.schedulers.work.PERIODIC";

                @Override // X.AbstractRunnableC17140rc
                public Object A00() {
                    InterfaceC17010rO A0B = c0op.A04.A0B();
                    String str = this.A01;
                    C1W8 c1w8 = (C1W8) A0B;
                    if (c1w8 != null) {
                        C28911Uj A00 = C28911Uj.A00("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
                        if (str == null) {
                            A00.A03[1] = 1;
                        } else {
                            A00.A02(1, str);
                        }
                        AbstractC15540ov abstractC15540ov = c1w8.A01;
                        abstractC15540ov.A02();
                        abstractC15540ov.A03();
                        try {
                            Cursor A002 = C15600p1.A00(abstractC15540ov, A00, true);
                            int A07 = C07O.A07(A002, "id");
                            int A072 = C07O.A07(A002, "state");
                            int A073 = C07O.A07(A002, "output");
                            int A074 = C07O.A07(A002, "run_attempt_count");
                            C006702y c006702y = new C006702y();
                            C006702y c006702y2 = new C006702y();
                            while (A002.moveToNext()) {
                                if (!A002.isNull(A07)) {
                                    String string = A002.getString(A07);
                                    if (((ArrayList) c006702y.get(string)) == null) {
                                        c006702y.put(string, new ArrayList());
                                    }
                                }
                                if (!A002.isNull(A07)) {
                                    String string2 = A002.getString(A07);
                                    if (((ArrayList) c006702y2.get(string2)) == null) {
                                        c006702y2.put(string2, new ArrayList());
                                    }
                                }
                            }
                            A002.moveToPosition(-1);
                            c1w8.A08(c006702y);
                            c1w8.A07(c006702y2);
                            ArrayList arrayList = new ArrayList(A002.getCount());
                            while (A002.moveToNext()) {
                                ArrayList arrayList2 = !A002.isNull(A07) ? (ArrayList) c006702y.get(A002.getString(A07)) : null;
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                ArrayList arrayList3 = !A002.isNull(A07) ? (ArrayList) c006702y2.get(A002.getString(A07)) : null;
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                C17000rN c17000rN = new C17000rN();
                                c17000rN.A03 = A002.getString(A07);
                                c17000rN.A02 = C07K.A0e(A002.getInt(A072));
                                c17000rN.A01 = C0OF.A00(A002.getBlob(A073));
                                c17000rN.A00 = A002.getInt(A074);
                                c17000rN.A05 = arrayList2;
                                c17000rN.A04 = arrayList3;
                                arrayList.add(c17000rN);
                            }
                            abstractC15540ov.A05();
                            A002.close();
                            A00.A01();
                            abstractC15540ov.A04();
                            return C0OL.A0H.A5S(arrayList);
                        } catch (Throwable th) {
                            abstractC15540ov.A04();
                            throw th;
                        }
                    }
                    throw null;
                }
            };
            ((C1WH) c0op.A06).A01.execute(abstractRunnableC17140rc);
            try {
                List list = (List) abstractRunnableC17140rc.A00.get();
                if (list != null && !list.isEmpty()) {
                    return (C16480qT) list.get(0);
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
            return null;
        }
        throw null;
    }

    public void A02() {
        C41861ud c41861ud = this.A01;
        if (c41861ud.A01() != 7) {
            return;
        }
        long A022 = c41861ud.A02();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C1VL c1vl = new C1VL(SchedulerExperimentWorker.class, A022, timeUnit, A022 / 2, timeUnit);
        c1vl.A01.add(Long.toString(A022));
        this.A00.A03("com.whatsapp.schedulers.work.PERIODIC", EnumC16390qK.KEEP, (C1VM) c1vl.A00());
    }
}
