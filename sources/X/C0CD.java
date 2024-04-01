package X;

import com.whatsapp.util.Log;
import java.io.Closeable;
import java.util.AbstractMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0CD */
/* loaded from: classes.dex */
public class C0CD implements Closeable {
    public boolean A00 = false;
    public final C04l A01;
    public final C0CE A02;
    public final ReentrantReadWriteLock.ReadLock A03;

    public C0CD(ReentrantReadWriteLock.ReadLock readLock, C04k c04k, boolean z) {
        this.A03 = readLock;
        this.A01 = c04k.ABg();
        if (readLock != null) {
            readLock.lock();
            Thread.currentThread().getId();
        }
        try {
            if (z) {
                this.A02 = c04k.AE6();
            } else {
                this.A02 = c04k.ACk();
            }
        } catch (Exception e) {
            Log.e("DatabaseSession/failed to get database", e);
            close();
            throw e;
        }
    }

    public C03790Hb A00() {
        C000700j.A00();
        return new C03790Hb(this.A02, this.A01, null);
    }

    public C03790Hb A01() {
        return new C03790Hb(this.A02, this.A01, null);
    }

    public void A02(Runnable runnable) {
        C000700j.A07(this.A02.A00.inTransaction());
        C04l c04l = this.A01;
        Object obj = new Object();
        C27761Oq c27761Oq = new C27761Oq(runnable);
        Object obj2 = c04l.A01.get();
        if (obj2 != null) {
            ((AbstractMap) obj2).put(obj, c27761Oq);
            return;
        }
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.A00) {
            return;
        }
        ReentrantReadWriteLock.ReadLock readLock = this.A03;
        if (readLock != null) {
            Thread.currentThread().getId();
            readLock.unlock();
        }
        this.A00 = true;
    }
}
