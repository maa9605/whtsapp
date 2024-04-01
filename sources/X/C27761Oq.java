package X;

import android.database.sqlite.SQLiteTransactionListener;

/* renamed from: X.1Oq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C27761Oq implements SQLiteTransactionListener {
    public final /* synthetic */ Runnable A00;

    @Override // android.database.sqlite.SQLiteTransactionListener
    public void onBegin() {
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public void onRollback() {
    }

    public C27761Oq(Runnable runnable) {
        this.A00 = runnable;
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public void onCommit() {
        this.A00.run();
    }
}
