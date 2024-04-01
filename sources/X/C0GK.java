package X;

import android.database.Cursor;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.0GK */
/* loaded from: classes.dex */
public class C0GK {
    public static volatile C0GK A02;
    public final C0GL A00;
    public final C05E A01;

    public C0GK(C05E c05e) {
        Collections.synchronizedMap(new C04W(200));
        this.A00 = new C0GL();
        this.A01 = c05e;
    }

    public static C0GK A00() {
        if (A02 == null) {
            synchronized (C0GK.class) {
                if (A02 == null) {
                    C05B.A00();
                    AbstractC000600i.A00();
                    C05C.A00();
                    C05E A00 = C05E.A00();
                    C05P.A00();
                    C05N.A00();
                    A02 = new C0GK(A00);
                }
            }
        }
        return A02;
    }

    public C27641Oe A01(long j) {
        C0GL c0gl = this.A00;
        Map map = c0gl.A03;
        Long valueOf = Long.valueOf(j);
        C27641Oe c27641Oe = (C27641Oe) map.get(valueOf);
        c0gl.A01.incrementAndGet();
        if (c27641Oe == null) {
            c0gl.A00.incrementAndGet();
            String valueOf2 = String.valueOf(j);
            C0CD A03 = this.A01.A03();
            try {
                Cursor A07 = A03.A02.A07("SELECT _id, label_name, predefined_id, color_id FROM labels WHERE _id=?", new String[]{valueOf2});
                if (A07.moveToNext()) {
                    String string = A07.getString(1);
                    if (!A07.isNull(2)) {
                        A07.getLong(2);
                    }
                    A07.getInt(3);
                    c27641Oe = new C27641Oe(j, string);
                    map.put(valueOf, c27641Oe);
                } else {
                    map.remove(valueOf);
                }
                A07.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        A03.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return c27641Oe;
    }

    public void A02() {
        C0GL c0gl = this.A00;
        synchronized (c0gl) {
            for (C27641Oe c27641Oe : c0gl.A03.values()) {
                c27641Oe.A00 = -1;
            }
        }
    }
}
