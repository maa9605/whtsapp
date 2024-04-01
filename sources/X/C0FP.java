package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;

/* renamed from: X.0FP  reason: invalid class name */
/* loaded from: classes.dex */
public class C0FP {
    public static volatile C0FP A0A;
    public final C06T A00;
    public final C05Q A01;
    public final C05A A02;
    public final C05M A03;
    public final C05S A04;
    public final C05F A05;
    public final C05N A06;
    public final C05E A07;
    public final C0EB A08;
    public final C0EF A09;

    public C0FP(C05A c05a, C05M c05m, C0EB c0eb, C05S c05s, C0EF c0ef, C06T c06t, C05Q c05q, C05F c05f, C05E c05e, C05N c05n) {
        this.A02 = c05a;
        this.A03 = c05m;
        this.A08 = c0eb;
        this.A04 = c05s;
        this.A09 = c0ef;
        this.A00 = c06t;
        this.A01 = c05q;
        this.A05 = c05f;
        this.A07 = c05e;
        this.A06 = c05n;
    }

    public static C0FP A00() {
        if (A0A == null) {
            synchronized (C0FP.class) {
                if (A0A == null) {
                    C05B.A00();
                    A0A = new C0FP(C05A.A00(), C05M.A00(), C0EB.A00(), C05S.A00(), C0EF.A00(), C06T.A02, C05Q.A00(), C05F.A01, C05E.A00(), C05N.A00());
                }
            }
        }
        return A0A;
    }

    public void A01(AbstractC005302j abstractC005302j, long j) {
        StringBuilder sb = new StringBuilder("msgstore/setchatreadreceiptssent/");
        sb.append(abstractC005302j);
        sb.append(" ");
        sb.append(j);
        Log.i(sb.toString());
        final C0IT A07 = this.A03.A07(abstractC005302j);
        if (A07 == null) {
            C000200d.A0w("msgstore/setchatreadreceiptssent/no chat for ", abstractC005302j);
        } else if (j > A07.A0I) {
            A07.A0I = j;
            this.A00.A01(new Runnable() { // from class: X.1OX
                @Override // java.lang.Runnable
                public final void run() {
                    ContentValues contentValues;
                    C0FP c0fp = C0FP.this;
                    C0IT c0it = A07;
                    try {
                        C05A c05a = c0fp.A02;
                        if (!c05a.A0G()) {
                            c05a.A0J(c0it, c0it.A08());
                            return;
                        }
                        synchronized (c0it) {
                            contentValues = new ContentValues(3);
                            contentValues.put("last_read_receipt_sent_message_row_id", Long.valueOf(c0it.A0I));
                        }
                        if (c05a.A0I(c0it, contentValues)) {
                            c05a.A0J(c0it, c0it.A08());
                        }
                    } catch (SQLiteDatabaseCorruptException e) {
                        Log.e(e);
                        c0fp.A06.A03();
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
            }, 43);
        }
    }
}
