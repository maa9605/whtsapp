package java.lang;

import X.AnonymousClass094;
import X.AnonymousClass097;
import X.C003701t;
import X.C05670Pr;
import X.C09H;
import X.C0DC;
import X.C0ET;
import X.C0IY;
import X.C28K;
import X.C36491kt;
import X.C42451vl;
import X.C471029p;
import X.C47982Di;
import X.C48002Dk;
import X.C48082Ds;
import X.C60192u4;
import X.InterfaceC44251yl;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.facebook.redex.ViewOnClickEBaseShape0S0300000_I0;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S0301000_I0 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public RunnableEBaseShape0S0301000_I0(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.A04 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        C60192u4 c60192u4;
        switch (this.A04) {
            case 0:
                C471029p c471029p = (C471029p) this.A01;
                int i = this.A00;
                Object obj = this.A02;
                Object obj2 = this.A03;
                ConversationsFragment conversationsFragment = c471029p.A0F;
                conversationsFragment.A1E(conversationsFragment.A01().getQuantityString(R.plurals.bulk_conversations_archived_confirmation, i, Integer.valueOf(i)), conversationsFragment.A0F(R.string.undo), new ViewOnClickEBaseShape0S0300000_I0(c471029p, obj, obj2, 6));
                return;
            case 1:
                ((C0ET) this.A01).A07((AnonymousClass094) this.A02, this.A00, (InterfaceC44251yl) this.A03);
                return;
            case 2:
                Log.i("DatabaseMigrationAsyncTask/run/execute async task");
                try {
                    C05670Pr c05670Pr = (C05670Pr) this.A01;
                    C48082Ds c48082Ds = c05670Pr.A0o;
                    C003701t c003701t = c48082Ds.A01;
                    if (c003701t.A03(200) > 0) {
                        if (!c48082Ds.A00()) {
                            c48082Ds.A02.A03();
                            long uptimeMillis = SystemClock.uptimeMillis() + C48082Ds.A03;
                            while (!Thread.currentThread().isInterrupted()) {
                                if (!c48082Ds.A00()) {
                                    if (uptimeMillis > SystemClock.uptimeMillis()) {
                                        SystemClock.sleep(100L);
                                    } else {
                                        c60192u4 = new C60192u4(null);
                                    }
                                }
                            }
                            c60192u4 = new C60192u4(null);
                        }
                        c60192u4 = new C60192u4(Boolean.valueOf(c003701t.A0C(201)));
                    } else {
                        c60192u4 = new C60192u4(Boolean.FALSE);
                    }
                    Boolean bool = c60192u4.A00;
                    if (bool != null && !bool.booleanValue()) {
                        if (!c05670Pr.A0A.A0G()) {
                            Log.i("DatabaseMigrationAsyncTask/run; migration skipped because chat store is not ready.");
                            if (conditionVariable != null) {
                                return;
                            }
                            return;
                        }
                        C28K c28k = (C28K) this.A02;
                        c28k.A07(7, new C47982Di(new C48002Dk(c05670Pr.A03, c05670Pr.A05)), c28k.A0B.A02().A02().A02(), 0);
                        c28k.A07.A00.edit().putLong("db_last_all_migrations_attempt_timestamp", c28k.A06.A05()).apply();
                        if (c05670Pr.A0s.A0C(424)) {
                            c28k.A06(this.A00);
                        }
                        ConditionVariable conditionVariable2 = (ConditionVariable) this.A03;
                        if (conditionVariable2 != null) {
                            conditionVariable2.open();
                            return;
                        }
                        return;
                    }
                    C36491kt c36491kt = new C36491kt();
                    c36491kt.A01 = c60192u4.toString();
                    c36491kt.A00 = Long.valueOf(Math.max(TimeUnit.MILLISECONDS.convert(c48082Ds.A01.A03(200), TimeUnit.MINUTES), C48082Ds.A04));
                    c05670Pr.A0t.A0B(c36491kt, null, false);
                    Log.i("DatabaseMigrationAsyncTask/run; migration skipped due to kill switch.");
                    ConditionVariable conditionVariable3 = (ConditionVariable) this.A03;
                    if (conditionVariable3 != null) {
                        conditionVariable3.open();
                        return;
                    }
                    return;
                } finally {
                    conditionVariable = (ConditionVariable) this.A03;
                    if (conditionVariable != null) {
                        conditionVariable.open();
                    }
                }
            case 3:
                AnonymousClass097 anonymousClass097 = (AnonymousClass097) this.A02;
                int i2 = this.A00;
                C0IY c0iy = ((C42451vl) this.A01).A0Z;
                String str = C0DC.A02(anonymousClass097).A02;
                String str2 = anonymousClass097.A05;
                String str3 = ((C09H) this.A03).A0G;
                int i3 = i2 == 0 ? 2 : 1;
                if (c0iy != null) {
                    if (str != null) {
                        c0iy.A0B(str, str2, str3, i3);
                        return;
                    } else {
                        c0iy.A0B("image", str2, str3, i3);
                        return;
                    }
                }
                throw null;
            default:
                return;
        }
    }
}
