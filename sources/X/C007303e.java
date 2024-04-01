package X;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* renamed from: X.03e */
/* loaded from: classes.dex */
public class C007303e {
    public static volatile C007303e A06;
    public final C003701t A00;
    public final C03X A01;
    public volatile Boolean A02;
    public volatile Boolean A03;
    public volatile Long A04;
    public volatile ConcurrentHashMap A05;

    public C007303e(C003701t c003701t, C03X c03x) {
        this.A00 = c003701t;
        this.A01 = c03x;
    }

    public static C007303e A00() {
        if (A06 == null) {
            synchronized (C007303e.class) {
                if (A06 == null) {
                    A06 = new C007303e(C003701t.A00(), C03W.A00());
                }
            }
        }
        return A06;
    }

    public long A01(int i) {
        A02();
        C1QA c1qa = (C1QA) this.A05.get(Integer.valueOf(i));
        if (c1qa == null) {
            return 0L;
        }
        return c1qa.A01;
    }

    public final void A02() {
        if (this.A05 == null) {
            synchronized (this) {
                if (this.A05 == null) {
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    try {
                        JSONArray jSONArray = this.A00.A06(226).getJSONArray("sampling");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                            int i2 = jSONArray2.getInt(0);
                            int i3 = jSONArray2.getInt(1);
                            long max = Math.max(jSONArray2.getLong(2), 0L);
                            long optLong = jSONArray2.optLong(3);
                            boolean z = false;
                            if (3 == i3) {
                                z = true;
                            }
                            concurrentHashMap.put(Integer.valueOf(i2), new C1QA(max, z, optLong));
                        }
                    } catch (Exception e) {
                        this.A01.A01(15, "errorString:%s", e.getMessage());
                        concurrentHashMap.clear();
                    }
                    this.A05 = concurrentHashMap;
                }
            }
        }
    }

    public final void A03() {
        if (this.A03 == null || this.A04 == null) {
            synchronized (this) {
                if (this.A03 == null || this.A04 == null) {
                    C003701t c003701t = this.A00;
                    this.A03 = Boolean.valueOf(c003701t.A0C(397));
                    this.A04 = Long.valueOf(c003701t.A03(398));
                }
            }
        }
    }

    public boolean A04() {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    this.A02 = Boolean.valueOf(this.A00.A0C(212));
                }
            }
        }
        return this.A02.booleanValue();
    }
}
