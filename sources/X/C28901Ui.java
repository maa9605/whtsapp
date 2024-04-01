package X;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.1Ui  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28901Ui extends AbstractC15830pP {
    public C15440od A00;
    public final AbstractC15550ow A01;
    public final String A02;
    public final String A03;

    public C28901Ui(C15440od c15440od, AbstractC15550ow abstractC15550ow) {
        super(abstractC15550ow.A00);
        this.A00 = c15440od;
        this.A01 = abstractC15550ow;
        this.A02 = "cf029002fffdcadf079e8d0a1c9a70ac";
        this.A03 = "8aff2efc47fafe870c738f727dfcfc6e";
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r4 != 0) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f1 A[EDGE_INSN: B:91:0x00f1->B:60:0x00f1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    @Override // X.AbstractC15830pP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(X.InterfaceC15820pO r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28901Ui.A01(X.0pO, int, int):void");
    }

    public final void A02(InterfaceC15820pO interfaceC15820pO) {
        SQLiteDatabase sQLiteDatabase = ((C28931Um) interfaceC15820pO).A00;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        sQLiteDatabase.execSQL(C000200d.A0I("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '", this.A02, "')"));
    }
}
