package X;

import android.database.Cursor;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1vY */
/* loaded from: classes2.dex */
public class C42321vY {
    public static volatile C42321vY A0G;
    public final AbstractC000600i A00;
    public final C02L A01;
    public final C01B A02;
    public final C06K A03;
    public final C05W A04;
    public final AnonymousClass012 A05;
    public final C001200o A06;
    public final C002301c A07;
    public final C05M A08;
    public final C0C9 A09;
    public final C013606n A0A;
    public final C003701t A0B;
    public final C451520p A0C;
    public final C0DV A0D;
    public final AnonymousClass247 A0E;
    public final C05U A0F;

    public C42321vY(AnonymousClass012 anonymousClass012, C003701t c003701t, AbstractC000600i abstractC000600i, C02L c02l, C001200o c001200o, C05M c05m, C01B c01b, C05W c05w, C002301c c002301c, C05U c05u, C0DV c0dv, C451520p c451520p, C0C9 c0c9, AnonymousClass247 anonymousClass247, C06K c06k, C013606n c013606n) {
        this.A05 = anonymousClass012;
        this.A0B = c003701t;
        this.A00 = abstractC000600i;
        this.A01 = c02l;
        this.A06 = c001200o;
        this.A08 = c05m;
        this.A02 = c01b;
        this.A04 = c05w;
        this.A07 = c002301c;
        this.A0F = c05u;
        this.A0D = c0dv;
        this.A0C = c451520p;
        this.A09 = c0c9;
        this.A0E = anonymousClass247;
        this.A0A = c013606n;
        this.A03 = c06k;
    }

    public static C42321vY A00() {
        if (A0G == null) {
            synchronized (C42321vY.class) {
                if (A0G == null) {
                    A0G = new C42321vY(AnonymousClass012.A00(), C003701t.A00(), AbstractC000600i.A00(), C02L.A00(), C001200o.A01, C05M.A00(), C01B.A00(), C05W.A00(), C002301c.A00(), C05U.A01(), C0DV.A00(), C451520p.A00(), C0C9.A00(), AnonymousClass247.A00(), C06K.A00(), C013606n.A03());
                }
            }
        }
        return A0G;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0035, code lost:
        if (new X.AnonymousClass094(X.AbstractC005302j.A02(r10.A03), r10.A04, r10.A01).A00 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.AnonymousClass248 A01(X.C452821e r38) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42321vY.A01(X.21e):X.248");
    }

    public Map A02(Cursor cursor) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            AnonymousClass092 A02 = this.A09.A0H.A02(cursor);
            if (A02 != null) {
                AbstractC005302j abstractC005302j = A02.A0n.A00;
                C455022i c455022i = (C455022i) linkedHashMap.get(abstractC005302j);
                if (c455022i == null) {
                    c455022i = (C455022i) C455222k.A0H.AVX();
                    if (abstractC005302j != null) {
                        String rawString = abstractC005302j.getRawString();
                        c455022i.A02();
                        C455222k c455222k = (C455222k) c455022i.A00;
                        if (rawString != null) {
                            c455222k.A01 |= 1;
                            c455222k.A09 = rawString;
                            String A0A = this.A08.A0A(abstractC005302j);
                            if (A0A != null) {
                                c455022i.A02();
                                C455222k c455222k2 = (C455222k) c455022i.A00;
                                c455222k2.A01 |= 2048;
                                c455222k2.A0A = A0A;
                            }
                            linkedHashMap.put(abstractC005302j, c455022i);
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                }
                A03(c455022i, A02);
            }
        }
        return linkedHashMap;
    }

    public void A03(C455022i c455022i, AnonymousClass092 anonymousClass092) {
        C0KA A02;
        if (anonymousClass092 == null) {
            A02 = null;
        } else {
            this.A0E.A01(anonymousClass092);
            C20v A022 = this.A0C.A02(anonymousClass092, null, false, true);
            A02 = A022 == null ? null : A022.A02();
        }
        if (A02 == null) {
            return;
        }
        C0CT AVX = C24E.A04.AVX();
        AVX.A02();
        C24E c24e = (C24E) AVX.A00;
        if (c24e != null) {
            c24e.A03 = (C452821e) A02.A01();
            c24e.A01 |= 1;
            long j = anonymousClass092.A0p;
            AVX.A02();
            C24E c24e2 = (C24E) AVX.A00;
            c24e2.A01 |= 2;
            c24e2.A02 = j;
            C0AZ A01 = AVX.A01();
            c455022i.A02();
            C455222k c455222k = (C455222k) c455022i.A00;
            if (A01 != null) {
                C0CX c0cx = c455222k.A08;
                if (!((C0CY) c0cx).A00) {
                    c0cx = C0AZ.A05(c0cx);
                    c455222k.A08 = c0cx;
                }
                c0cx.add(A01);
                return;
            }
            throw null;
        }
        throw null;
    }
}
