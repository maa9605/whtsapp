package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteFullException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.2tb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC59902tb extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C0IT A00;
    public final /* synthetic */ C41181tV A01;
    public final /* synthetic */ AbstractC005302j A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ RunnableC59902tb(C41181tV c41181tV, boolean z, boolean z2, AbstractC005302j abstractC005302j, C0IT c0it) {
        this.A01 = c41181tV;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = abstractC005302j;
        this.A00 = c0it;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        Set emptySet;
        C0CD A03;
        C41181tV c41181tV = this.A01;
        boolean z = this.A03;
        boolean z2 = this.A04;
        AbstractC005302j abstractC005302j = this.A02;
        C0IT c0it = this.A00;
        if (z && z2) {
            emptySet = c41181tV.A02.A0H(abstractC005302j, true);
        } else {
            emptySet = Collections.emptySet();
        }
        c41181tV.A06.A0D(c0it);
        c41181tV.A02.A0V(emptySet);
        C0FP c0fp = c41181tV.A0F;
        C0HC c0hc = new C0HC();
        c0hc.A02 = "msgstore/unsentreadreceiptsforjid";
        c0hc.A03 = true;
        c0hc.A03();
        ArrayList arrayList = new ArrayList();
        if (c0fp.A09.A01(abstractC005302j)) {
            C0IT A07 = c0fp.A03.A07(abstractC005302j);
            if (A07 == null) {
                C000200d.A0w("msgstore/unsentreadreceiptsforjid/no chat for ", abstractC005302j);
            } else if (A07.A0H != A07.A0I) {
                String[] strArr = {String.valueOf(c0fp.A02.A05(abstractC005302j)), String.valueOf(A07.A0H), String.valueOf(A07.A0I)};
                try {
                    A03 = c0fp.A07.A03();
                } catch (SQLiteDatabaseCorruptException e) {
                    Log.e(e);
                    c0fp.A06.A03();
                } catch (SQLiteFullException e2) {
                    c0fp.A05.A00(0);
                    throw e2;
                } catch (IllegalStateException e3) {
                    Log.i("msgstore/unsentreadreceiptsforjid/IllegalStateException ", e3);
                }
                try {
                    Cursor A072 = A03.A02.A07(C0HD.A1J, strArr);
                    if (A072 != null) {
                        while (A072.moveToNext()) {
                            AnonymousClass092 A032 = c0fp.A01.A03(A072, abstractC005302j);
                            if (A032 != null && A032.A0E > 1415214000000L) {
                                arrayList.add(A032);
                            }
                        }
                        A072.close();
                    }
                    A03.close();
                    StringBuilder A0P = C000200d.A0P("msgstore/unsentreadreceiptsforjid ");
                    A0P.append(arrayList.size());
                    A0P.append(" | time spent:");
                    A0P.append(c0hc.A01());
                    Log.i(A0P.toString());
                } finally {
                }
            }
        }
        c41181tV.A09.A02.post(new RunnableEBaseShape0S0300000_I0_0(c41181tV, abstractC005302j, arrayList, 13));
    }
}
