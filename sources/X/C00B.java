package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteFullException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.00B */
/* loaded from: classes.dex */
public class C00B {
    public static volatile C00B A0A;
    public final AnonymousClass012 A00;
    public final C05Q A01;
    public final C05A A02;
    public final C012406b A03;
    public final C05F A04;
    public final C05N A05;
    public final C05E A06;
    public final C05O A07;
    public final Map A08;
    public final AtomicBoolean A09;

    public C00B(AnonymousClass012 anonymousClass012, C05A c05a, C05O c05o, C05Q c05q, C05F c05f, C012406b c012406b, C05E c05e, C05N c05n) {
        this.A00 = anonymousClass012;
        this.A07 = c05o;
        this.A02 = c05a;
        this.A01 = c05q;
        this.A04 = c05f;
        this.A03 = c012406b;
        this.A06 = c05e;
        this.A05 = c05n;
        this.A08 = c012406b.A02;
        this.A09 = c012406b.A03;
    }

    public static C00B A00() {
        if (A0A == null) {
            synchronized (C00B.class) {
                if (A0A == null) {
                    A0A = new C00B(AnonymousClass012.A00(), C05A.A00(), C05O.A00(), C05Q.A00(), C05F.A01, C012406b.A00(), C05E.A00(), C05N.A00());
                }
            }
        }
        return A0A;
    }

    public int A01(AbstractC005302j abstractC005302j) {
        int i = 0;
        if (abstractC005302j != null) {
            Iterator it = A02().iterator();
            while (it.hasNext()) {
                if (abstractC005302j.equals(((AnonymousClass092) it.next()).A0n.A00)) {
                    i++;
                }
            }
        }
        return i;
    }

    public ArrayList A02() {
        long A05 = this.A00.A05();
        if (!this.A09.get()) {
            A03();
        }
        Map map = this.A03.A02;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((AnonymousClass092) ((Map.Entry) it.next()).getValue()).A0E + 86400000 < A05) {
                it.remove();
            }
        }
        StringBuilder A0P = C000200d.A0P("msgstore/unsendmessages/cached:");
        A0P.append(map.size());
        Log.i(A0P.toString());
        ArrayList arrayList = new ArrayList(map.size());
        for (Object obj : map.values()) {
            arrayList.add(obj);
        }
        Collections.sort(arrayList, C12610jl.A00);
        return arrayList;
    }

    public final void A03() {
        C0CD A03;
        int i;
        AtomicBoolean atomicBoolean = this.A09;
        synchronized (atomicBoolean) {
            if (atomicBoolean.get()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            C0HC c0hc = new C0HC();
            c0hc.A02 = "unsentmsgstore/unsendmessages";
            c0hc.A03 = true;
            c0hc.A03();
            long A05 = this.A07.A05(this.A00.A05() - 86400000);
            try {
                try {
                    A03 = this.A06.A03();
                } catch (SQLiteDatabaseCorruptException e) {
                    Log.e(e);
                    this.A05.A03();
                } catch (SQLiteFullException e2) {
                    this.A04.A00(0);
                    throw e2;
                }
            } catch (IllegalStateException e3) {
                Log.i("unsentmsgstore/unsent/IllegalStateException ", e3);
            }
            try {
                Cursor A07 = A03.A02.A07(C0HD.A1G, new String[]{String.valueOf(A05)});
                if (A07 == null) {
                    return;
                }
                int columnIndexOrThrow = A07.getColumnIndexOrThrow("chat_row_id");
                while (A07.moveToNext()) {
                    AbstractC005302j A08 = this.A02.A08(A07.getInt(columnIndexOrThrow));
                    if (A08 == null) {
                        Log.w("unsentmsgstore/unsent/jid is null!");
                    } else {
                        AnonymousClass092 A032 = this.A01.A03(A07, A08);
                        if (A032 == null) {
                            Log.w("unsentmsgstore/unsent/can't read message from cursor.");
                        } else {
                            byte b = A032.A0m;
                            if (b != 8 && b != 10 && b != 7 && ((i = A032.A08) != 7 || !C003101m.A0U(A032.A0n.A00))) {
                                if (!A032.A0f || C003101m.A0P(A08)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("unsentmsgstore/unsent/add key=");
                                    sb.append(A032.A0n.A01);
                                    sb.append(" type=");
                                    sb.append((int) b);
                                    sb.append(" status=");
                                    sb.append(i);
                                    Log.i(sb.toString());
                                    arrayList.add(A032);
                                }
                            }
                        }
                    }
                }
                A07.close();
                A03.close();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unsentmsgstore/unsent ");
                sb2.append(arrayList.size());
                sb2.append(" | time spent:");
                sb2.append(c0hc.A01());
                Log.i(sb2.toString());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
                    this.A08.put(anonymousClass092.A0n, anonymousClass092);
                }
                if (!atomicBoolean.compareAndSet(false, true)) {
                    Log.e("unsent messages cache initialization failed to change the related flag");
                }
            } finally {
            }
        }
    }

    public boolean A04() {
        if (!this.A09.get()) {
            A03();
        }
        C012406b c012406b = this.A03;
        long A05 = this.A00.A05();
        Map map = c012406b.A02;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((AnonymousClass092) ((Map.Entry) it.next()).getValue()).A0E + 86400000 < A05) {
                it.remove();
            }
        }
        return !map.isEmpty();
    }
}
