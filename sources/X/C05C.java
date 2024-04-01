package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.05C */
/* loaded from: classes.dex */
public class C05C {
    public static volatile C05C A06;
    public final AnonymousClass012 A00;
    public final C05D A01;
    public final C05E A02;
    public final InterfaceC002901k A03;
    public final Object A04 = new Object();
    public final Map A05 = new HashMap();

    public C05C(AnonymousClass012 anonymousClass012, InterfaceC002901k interfaceC002901k, C05D c05d, C05E c05e) {
        this.A00 = anonymousClass012;
        this.A03 = interfaceC002901k;
        this.A01 = c05d;
        this.A02 = c05e;
    }

    public static C05C A00() {
        if (A06 == null) {
            synchronized (C05C.class) {
                if (A06 == null) {
                    A06 = new C05C(AnonymousClass012.A00(), C002801j.A00(), C05D.A00(), C05E.A00());
                }
            }
        }
        return A06;
    }

    public long A01(String str, long j) {
        String A02 = A02(str);
        return A02 == null ? j : Long.parseLong(A02);
    }

    public String A02(String str) {
        AnonymousClass012 anonymousClass012 = this.A00;
        long A04 = anonymousClass012.A04();
        Object obj = this.A04;
        synchronized (obj) {
            Map map = this.A05;
            if (map.containsKey(str)) {
                return (String) map.get(str);
            }
            C0CD A03 = this.A02.A03();
            Cursor A07 = A03.A02.A07("SELECT value FROM props WHERE key = ?", new String[]{str});
            String string = A07.moveToNext() ? A07.getString(0) : null;
            A07.close();
            A03.close();
            synchronized (obj) {
                map.put(str, string);
            }
            C000200d.A0e(anonymousClass012, A04, this.A01, "PropsMessageStore/getProp");
            return string;
        }
    }

    /* JADX WARN: Finally extract failed */
    public void A03(String str) {
        C0CD A04 = this.A02.A04();
        try {
            A04.A02.A01("props", "key = ?", new String[]{str});
            A04.close();
            synchronized (this.A04) {
                this.A05.remove(str);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public void A04(String str, int i) {
        A06(str, String.valueOf(i));
    }

    public void A05(String str, long j) {
        A06(str, String.valueOf(j));
    }

    /* JADX WARN: Finally extract failed */
    public void A06(String str, String str2) {
        AnonymousClass012 anonymousClass012 = this.A00;
        long A04 = anonymousClass012.A04();
        C0CD A042 = this.A02.A04();
        try {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("key", str);
            contentValues.put("value", str2);
            A042.A02.A05("props", contentValues);
            A042.close();
            synchronized (this.A04) {
                this.A05.put(str, str2);
            }
            C000200d.A0e(anonymousClass012, A04, this.A01, "PropsMessageStore/setProp");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A042.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }
}
