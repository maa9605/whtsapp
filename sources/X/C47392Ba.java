package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.2Ba */
/* loaded from: classes2.dex */
public class C47392Ba {
    public static volatile C47392Ba A0L;
    public C09E A00;
    public final AbstractC000600i A01;
    public final C012005w A02;
    public final C018508q A03;
    public final C02L A04;
    public final C01B A05;
    public final C06K A06;
    public final C05W A07;
    public final C018708s A08;
    public final C000400f A09;
    public final AnonymousClass012 A0A;
    public final C001200o A0B;
    public final C005102h A0C;
    public final C000500h A0D;
    public final C002301c A0E;
    public final C013606n A0F;
    public final C003701t A0G;
    public final AnonymousClass011 A0H;
    public final C42451vl A0I;
    public final C0DV A0J;
    public final C05U A0K;

    public C47392Ba(C001200o c001200o, AnonymousClass012 anonymousClass012, C003701t c003701t, C018508q c018508q, AbstractC000600i abstractC000600i, C02L c02l, C012005w c012005w, AnonymousClass011 anonymousClass011, C01B c01b, C05W c05w, C018708s c018708s, C002301c c002301c, C05U c05u, C0DV c0dv, C000400f c000400f, C000500h c000500h, C42451vl c42451vl, C005102h c005102h, C06K c06k, C013606n c013606n) {
        this.A0B = c001200o;
        this.A0A = anonymousClass012;
        this.A0G = c003701t;
        this.A03 = c018508q;
        this.A01 = abstractC000600i;
        this.A04 = c02l;
        this.A02 = c012005w;
        this.A0H = anonymousClass011;
        this.A05 = c01b;
        this.A07 = c05w;
        this.A08 = c018708s;
        this.A0E = c002301c;
        this.A0K = c05u;
        this.A0J = c0dv;
        this.A09 = c000400f;
        this.A0D = c000500h;
        this.A0I = c42451vl;
        this.A0C = c005102h;
        this.A06 = c06k;
        this.A0F = c013606n;
    }

    public static C09E A00(C003701t c003701t, C001200o c001200o, AbstractC000600i abstractC000600i, C05W c05w, C002301c c002301c, C06K c06k, C02L c02l, C01B c01b, C05U c05u, C0DV c0dv, C013606n c013606n, byte[] bArr) {
        try {
            C40531sQ A0A = C40531sQ.A0A(bArr);
            return (C09E) C0Ho.A07(c001200o, abstractC000600i, c002301c, c05w, c06k, c02l, c003701t, c01b, c05u, c0dv, A0A, C0Ho.A03(A0A), c013606n, null, new AnonymousClass094(C0PB.A00, false, ""), null, 0L, false, false, false, 0);
        } catch (C0JX | C22W e) {
            Log.e("gdpr/create-gdpr-message", e);
            return null;
        }
    }

    public static C47392Ba A01() {
        if (A0L == null) {
            synchronized (C47392Ba.class) {
                if (A0L == null) {
                    A0L = new C47392Ba(C001200o.A01, AnonymousClass012.A00(), C003701t.A00(), C018508q.A00(), AbstractC000600i.A00(), C02L.A00(), C012005w.A00(), AnonymousClass011.A00(), C01B.A00(), C05W.A00(), C018708s.A00(), C002301c.A00(), C05U.A01(), C0DV.A00(), C000400f.A00(), C000500h.A00(), C42451vl.A00(), C005102h.A00(), C06K.A00(), C013606n.A03());
                }
            }
        }
        return A0L;
    }

    public synchronized int A02() {
        return this.A0D.A00.getInt("gdpr_report_state", 0);
    }

    public synchronized long A03() {
        return this.A0D.A00.getLong("gdpr_report_timestamp", -1L);
    }

    public C09E A04() {
        if (this.A00 == null) {
            C001200o c001200o = this.A0B;
            byte[] A0F = C02A.A0F(new File(c001200o.A00.getFilesDir(), "gdpr.info"));
            if (A0F != null) {
                this.A00 = A00(this.A0G, c001200o, this.A01, this.A07, this.A0E, this.A06, this.A04, this.A05, this.A0K, this.A0J, this.A0F, A0F);
            }
        }
        return this.A00;
    }

    public synchronized void A05() {
        Log.i("gdpr/on-report-deleted");
        A06();
    }

    public synchronized void A06() {
        Log.i("gdpr/reset");
        this.A00 = null;
        File file = new File(this.A0B.A00.getFilesDir(), "gdpr.info");
        if (file.exists() && !file.delete()) {
            Log.e("gdpr/reset/failed-delete-report-info");
        }
        AnonymousClass024.A0T(this.A02.A0A(), 0L);
        this.A0D.A0P();
    }

    public synchronized void A07(long j) {
        Log.i("gdpr/on-report-requested");
        C000500h c000500h = this.A0D;
        C000200d.A0g(c000500h, "gdpr_report_state", 1);
        c000500h.A0D().putLong("gdpr_report_timestamp", j).apply();
    }

    public synchronized void A08(long j, byte[] bArr, long j2) {
        Log.i("gdpr/on-report-available");
        try {
            C001200o c001200o = this.A0B;
            C02A.A07(bArr, new File(c001200o.A00.getFilesDir(), "gdpr.info"));
            C09E A00 = A00(this.A0G, c001200o, this.A01, this.A07, this.A0E, this.A06, this.A04, this.A05, this.A0K, this.A0J, this.A0F, bArr);
            this.A00 = A00;
            if (A00 == null) {
                Log.e("gdpr/on-report-available/cannot-create-message");
                return;
            }
            C000500h c000500h = this.A0D;
            C000200d.A0g(c000500h, "gdpr_report_state", 2);
            c000500h.A0D().putLong("gdpr_report_timestamp", j).apply();
            c000500h.A0D().putLong("gdpr_report_expiration_timestamp", j2).apply();
        } catch (IOException e) {
            Log.e("gdpr/on-report-available/cannot-save", e);
        }
    }
}
