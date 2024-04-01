package X;

import android.database.sqlite.SQLiteTransactionListener;
import java.util.AbstractMap;
import java.util.LinkedHashMap;

/* renamed from: X.04l */
/* loaded from: classes.dex */
public class C04l implements SQLiteTransactionListener {
    public final ThreadLocal A01 = new ThreadLocal() { // from class: X.04m
        @Override // java.lang.ThreadLocal
        public Object initialValue() {
            return new LinkedHashMap(16, 0.75f, true);
        }
    };
    public final ThreadLocal A00 = new ThreadLocal() { // from class: X.04n
        @Override // java.lang.ThreadLocal
        public Object initialValue() {
            return Boolean.FALSE;
        }
    };

    @Override // android.database.sqlite.SQLiteTransactionListener
    public void onBegin() {
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public void onCommit() {
        Object obj = this.A01.get();
        if (obj != null) {
            AbstractMap abstractMap = (AbstractMap) obj;
            try {
                for (SQLiteTransactionListener sQLiteTransactionListener : abstractMap.values()) {
                    sQLiteTransactionListener.onCommit();
                }
                return;
            } finally {
                abstractMap.clear();
                this.A00.set(Boolean.FALSE);
            }
        }
        throw null;
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public void onRollback() {
        Object obj = this.A01.get();
        if (obj != null) {
            AbstractMap abstractMap = (AbstractMap) obj;
            try {
                for (SQLiteTransactionListener sQLiteTransactionListener : abstractMap.values()) {
                    sQLiteTransactionListener.onRollback();
                }
                return;
            } finally {
                abstractMap.clear();
                this.A00.set(Boolean.FALSE);
            }
        }
        throw null;
    }
}
