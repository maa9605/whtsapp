package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0OP */
/* loaded from: classes.dex */
public class C0OP extends C0OD {
    public static C0OP A0A;
    public static C0OP A0B;
    public BroadcastReceiver.PendingResult A00;
    public Context A01;
    public C01e A02;
    public C1VP A03;
    public WorkDatabase A04;
    public C17090rX A05;
    public InterfaceC17300rs A06;
    public List A07;
    public boolean A08;
    public volatile AbstractC17340rw A09;
    public static final String A0D = AbstractC16430qO.A01("WorkManagerImpl");
    public static final Object A0C = new Object();

    public C0OP(Context context, C01e configuration, InterfaceC17300rs workTaskExecutor) {
        WorkDatabase A00 = WorkDatabase.A00(context.getApplicationContext(), ((C1WH) workTaskExecutor).A01, context.getResources().getBoolean(R.bool.workmanager_test_configuration));
        Context applicationContext = context.getApplicationContext();
        C1VG c1vg = new C1VG(configuration.A00);
        synchronized (AbstractC16430qO.class) {
            AbstractC16430qO.A00 = c1vg;
        }
        List asList = Arrays.asList(C16560qc.A00(applicationContext, this), new C1Vc(applicationContext, configuration, workTaskExecutor, this));
        C1VP c1vp = new C1VP(context, configuration, workTaskExecutor, A00, asList);
        Context applicationContext2 = context.getApplicationContext();
        this.A01 = applicationContext2;
        this.A02 = configuration;
        this.A06 = workTaskExecutor;
        this.A04 = A00;
        this.A07 = asList;
        this.A03 = c1vp;
        this.A05 = new C17090rX(A00);
        this.A08 = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext2.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        ((C1WH) this.A06).A01.execute(new RunnableC17060rU(applicationContext2, this));
    }

    public static C0OP A00(Context context) {
        C0OP c0op;
        synchronized (A0C) {
            c0op = A0B;
            if (c0op == null) {
                c0op = A0A;
            }
            if (c0op == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof AnonymousClass004) {
                    C01e workManagerConfiguration = ((AnonymousClass004) applicationContext).getWorkManagerConfiguration();
                    C0OP c0op2 = A0B;
                    if (c0op2 != null && A0A != null) {
                        throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                    }
                    if (c0op2 == null) {
                        Context applicationContext2 = applicationContext.getApplicationContext();
                        C0OP c0op3 = A0A;
                        if (c0op3 == null) {
                            c0op3 = new C0OP(applicationContext2, workManagerConfiguration, new C1WH(workManagerConfiguration.A08));
                            A0A = c0op3;
                        }
                        A0B = c0op3;
                    }
                    c0op = A00(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return c0op;
    }

    @Override // X.C0OD
    public C0OE A01(final String tag) {
        AbstractRunnableC17040rR abstractRunnableC17040rR = new AbstractRunnableC17040rR() { // from class: X.1WB
            {
                C0OP.this = this;
            }

            @Override // X.AbstractRunnableC17040rR
            public void A01() {
                C0OP c0op = C0OP.this;
                WorkDatabase workDatabase = c0op.A04;
                workDatabase.A03();
                try {
                    InterfaceC17010rO A0B2 = workDatabase.A0B();
                    String str = tag;
                    C1W8 c1w8 = (C1W8) A0B2;
                    C28911Uj A00 = C28911Uj.A00("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
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
                    C16560qc.A01(c0op.A04, c0op.A07);
                } catch (Throwable th) {
                    workDatabase.A04();
                    throw th;
                }
            }
        };
        ((C1WH) this.A06).A01.execute(abstractRunnableC17040rR);
        return abstractRunnableC17040rR.A00;
    }

    @Override // X.C0OD
    public C0OE A02(String uniqueWorkName) {
        C1WC c1wc = new C1WC(this, uniqueWorkName, true);
        ((C1WH) this.A06).A01.execute(c1wc);
        return ((AbstractRunnableC17040rR) c1wc).A00;
    }

    @Override // X.C0OD
    public C0OE A03(String uniqueWorkName, EnumC16390qK existingPeriodicWorkPolicy, C1VM periodicWork) {
        C0OO c0oo;
        if (existingPeriodicWorkPolicy == EnumC16390qK.KEEP) {
            c0oo = C0OO.KEEP;
        } else {
            c0oo = C0OO.REPLACE;
        }
        return new C0OR(this, uniqueWorkName, c0oo, Collections.singletonList(periodicWork), null).A02();
    }

    public void A04() {
        if (Build.VERSION.SDK_INT >= 23) {
            C29121Vl.A03(this.A01);
        }
        C1W8 c1w8 = (C1W8) this.A04.A0B();
        AbstractC15540ov abstractC15540ov = c1w8.A01;
        abstractC15540ov.A02();
        AbstractC15570oy abstractC15570oy = c1w8.A05;
        C38621oi A00 = abstractC15570oy.A00();
        abstractC15540ov.A03();
        try {
            A00.A00.executeUpdateDelete();
            abstractC15540ov.A05();
            abstractC15540ov.A04();
            if (A00 == abstractC15570oy.A02) {
                abstractC15570oy.A01.set(false);
            }
            C16560qc.A01(this.A04, this.A07);
        } catch (Throwable th) {
            abstractC15540ov.A04();
            abstractC15570oy.A02(A00);
            throw th;
        }
    }

    public void A05(String workSpecId) {
        InterfaceC17300rs interfaceC17300rs = this.A06;
        ((C1WH) interfaceC17300rs).A01.execute(new RunnableC17150rd(this, workSpecId, false));
    }
}
