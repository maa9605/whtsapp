package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;

/* renamed from: X.0FN  reason: invalid class name */
/* loaded from: classes.dex */
public class C0FN {
    public static volatile C0FN A04;
    public final C06T A00;
    public final C05A A01;
    public final C05M A02;
    public final C05N A03;

    public C0FN(C05A c05a, C05M c05m, C06T c06t, C05N c05n) {
        this.A01 = c05a;
        this.A02 = c05m;
        this.A00 = c06t;
        this.A03 = c05n;
    }

    public boolean A00(AbstractC005302j abstractC005302j, int i) {
        final C0IT A07 = this.A02.A07(abstractC005302j);
        if (A07 == null || A07.A02 == i) {
            return false;
        }
        A07.A02 = i;
        this.A00.A01(new Runnable() { // from class: X.1OT
            @Override // java.lang.Runnable
            public final void run() {
                ContentValues contentValues;
                C0FN c0fn = C0FN.this;
                C0IT c0it = A07;
                try {
                    C05A c05a = c0fn.A01;
                    if (!c05a.A0G()) {
                        c05a.A02(c0it.A0A(), c0it.A0U);
                        return;
                    }
                    synchronized (c0it) {
                        contentValues = new ContentValues(2);
                        contentValues.put("spam_detection", Integer.valueOf(c0it.A02));
                    }
                    AbstractC005302j abstractC005302j2 = c0it.A0U;
                    if (c05a.A01(contentValues, abstractC005302j2) > 0) {
                        c05a.A02(c0it.A0A(), abstractC005302j2);
                    }
                } catch (SQLiteDatabaseCorruptException e) {
                    Log.e(e);
                    c0fn.A03.A03();
                } catch (Error e2) {
                    e = e2;
                    Log.e(e);
                    throw e;
                } catch (RuntimeException e3) {
                    e = e3;
                    Log.e(e);
                    throw e;
                }
            }
        }, 34);
        return true;
    }
}
