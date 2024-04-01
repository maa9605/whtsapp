package X;

import android.os.Looper;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0ov */
/* loaded from: classes.dex */
public abstract class AbstractC15540ov {
    public InterfaceC15860pS A00;
    public List A01;
    public Executor A02;
    public boolean A03;
    public boolean A04;
    public final C15490ok A05;
    public volatile InterfaceC15820pO A08;
    public final ReentrantReadWriteLock A07 = new ReentrantReadWriteLock();
    public final ThreadLocal A06 = new ThreadLocal();

    public AbstractC15540ov() {
        new ConcurrentHashMap();
        this.A05 = new C15490ok(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    public C38621oi A00(String str) {
        A01();
        A02();
        return new C38621oi(((C28931Um) this.A00.AE5()).A00.compileStatement(str));
    }

    public void A01() {
        if (!this.A03 && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void A02() {
        if (!((C28931Um) this.A00.AE5()).A00.inTransaction() && this.A06.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void A03() {
        A01();
        InterfaceC15820pO AE5 = this.A00.AE5();
        this.A05.A00(AE5);
        ((C28931Um) AE5).A00.beginTransaction();
    }

    public void A04() {
        ((C28931Um) this.A00.AE5()).A00.endTransaction();
        if (((C28931Um) this.A00.AE5()).A00.inTransaction()) {
            return;
        }
        C15490ok c15490ok = this.A05;
        if (c15490ok.A03.compareAndSet(false, true)) {
            c15490ok.A05.A02.execute(c15490ok.A01);
        }
    }

    public void A05() {
        ((C28931Um) this.A00.AE5()).A00.setTransactionSuccessful();
    }
}
