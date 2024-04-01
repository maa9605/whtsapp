package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import com.whatsapp.util.Log;
import java.io.Closeable;
import java.util.AbstractMap;

/* renamed from: X.0Hb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03790Hb implements Closeable {
    public boolean A00 = false;
    public boolean A01;
    public final C0CE A02;

    public C03790Hb(C0CE c0ce, C04l c04l, SQLiteTransactionListener sQLiteTransactionListener) {
        this.A02 = c0ce;
        ThreadLocal threadLocal = c04l.A00;
        Object obj = threadLocal.get();
        if (obj != null) {
            if (!((Boolean) obj).booleanValue()) {
                SQLiteDatabase sQLiteDatabase = c0ce.A00;
                C000700j.A08(!sQLiteDatabase.inTransaction(), "OuterTransactionManager/already-in-transaction");
                sQLiteDatabase.beginTransactionWithListener(c04l);
                threadLocal.set(Boolean.TRUE);
            } else {
                c0ce.A00.beginTransaction();
            }
            if (sQLiteTransactionListener != null) {
                Object obj2 = new Object();
                Object obj3 = c04l.A01.get();
                if (obj3 != null) {
                    ((AbstractMap) obj3).put(obj2, sQLiteTransactionListener);
                    sQLiteTransactionListener.onBegin();
                    return;
                }
                throw null;
            }
            return;
        }
        throw null;
    }

    public void A00() {
        this.A01 = true;
        this.A02.A00.setTransactionSuccessful();
    }

    public boolean A01() {
        return (!this.A02.A00.inTransaction() || this.A00 || this.A01) ? false : true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.A00) {
            return;
        }
        if (!this.A01) {
            Log.w("DatabaseTransaction/close/was not set successful");
        }
        this.A02.A00.endTransaction();
        this.A00 = true;
    }
}
