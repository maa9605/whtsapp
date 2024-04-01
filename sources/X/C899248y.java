package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.48y */
/* loaded from: classes3.dex */
public class C899248y {
    public static volatile C899248y A0B;
    public C2F4 A00;
    public C898748t A01;
    public final C012005w A02;
    public final C01B A03;
    public final C0EL A04;
    public final C000400f A05;
    public final AnonymousClass012 A06;
    public final C001200o A07;
    public final C04000Ia A08;
    public final C0EU A09;
    public final C0IY A0A;

    public C899248y(AnonymousClass012 anonymousClass012, C001200o c001200o, C0EL c0el, C012005w c012005w, C01B c01b, C0IY c0iy, C000400f c000400f, C0EU c0eu, C04000Ia c04000Ia) {
        this.A06 = anonymousClass012;
        this.A07 = c001200o;
        this.A04 = c0el;
        this.A02 = c012005w;
        this.A03 = c01b;
        this.A0A = c0iy;
        this.A05 = c000400f;
        this.A09 = c0eu;
        this.A08 = c04000Ia;
    }

    public static C898748t A00(byte[] bArr, long j) {
        String str;
        long j2;
        try {
            C40531sQ A0A = C40531sQ.A0A(bArr);
            if ((A0A.A00 & 64) == 64) {
                C24B A0q = A0A.A0q();
                if ((A0q.A00 & 1) == 1) {
                    str = A0q.A0I;
                    if (TextUtils.isEmpty(str)) {
                        Log.e("dyiReportManager/create-report-info failed : url is empty");
                        return null;
                    } else if (!"https".equalsIgnoreCase(Uri.parse(str).getScheme())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("dyiReportManager/create-report-info failed : invalid scheme; url =");
                        sb.append(str);
                        Log.e(sb.toString());
                        return null;
                    }
                } else {
                    str = null;
                }
                int i = A0q.A00;
                int i2 = i & 4;
                if ((i & 16) != 16) {
                    j2 = 0;
                } else {
                    j2 = A0q.A04;
                }
                return new C898748t(j2, str, j);
            }
            Log.e("dyiReportManager/create-report-info failed : invalid e2eMessage -> no document message found");
            return null;
        } catch (C0JX e) {
            Log.e("dyiReportManager/create-report-info", e);
            return null;
        }
    }

    public static C899248y A01() {
        if (A0B == null) {
            synchronized (C899248y.class) {
                if (A0B == null) {
                    A0B = new C899248y(AnonymousClass012.A00(), C001200o.A01, C0EL.A00(), C012005w.A00(), C01B.A00(), C0IY.A00(), C000400f.A00(), C0EU.A00(), C04000Ia.A00());
                }
            }
        }
        return A0B;
    }

    public synchronized int A02() {
        return this.A09.A04().getInt("payment_dyi_report_state", -1);
    }

    public synchronized C898748t A03() {
        byte[] A0F;
        if (this.A01 == null && (A0F = C02A.A0F(new File(this.A07.A00.getFilesDir(), "dyi.info"))) != null) {
            C0EU c0eu = this.A09;
            long j = c0eu.A04().getLong("payment_dyi_report_timestamp", -1L);
            c0eu.A04().getLong("payment_dyi_report_expiration_timestamp", -1L);
            this.A01 = A00(A0F, j);
        }
        return this.A01;
    }

    public synchronized void A04() {
        Log.i("dyiReportManager/reset");
        this.A01 = null;
        File file = new File(this.A07.A00.getFilesDir(), "dyi.info");
        if (file.exists() && !file.delete()) {
            Log.e("dyiReportManager/reset/failed-delete-report-info");
        }
        C012005w c012005w = this.A02;
        File A06 = c012005w.A06();
        if (A06.exists() && !A06.delete()) {
            Log.e("dyiReportManager/reset/failed-delete-report-file");
        }
        AnonymousClass024.A0T(c012005w.A09(), 0L);
        this.A09.A0D();
    }

    public synchronized void A05(final C4F4 c4f4) {
        Log.i("dyiReportManager/download-report");
        C898748t A03 = A03();
        if (A03 == null) {
            Log.e("dyiReportManager/download-report no valid report info");
            A04();
            c4f4.A00();
        } else if (A03.A02 == null) {
            Log.e("dyiReportManager/download-report no url");
            A04();
            c4f4.A00();
        } else {
            C2F4 c2f4 = new C2F4(this.A04, this.A03, this.A0A, this.A05, this.A08, new C2F5(A03.A02), this.A02.A06());
            this.A00 = c2f4;
            c2f4.A59(new InterfaceC04070Ih() { // from class: X.4CX
                {
                    C899248y.this = this;
                }

                @Override // X.InterfaceC04070Ih
                public void AJX(boolean z) {
                    C000200d.A1C("dyiReportManager/download-report/on-download-canceled transferred -> ", z);
                    if (z) {
                        return;
                    }
                    C899248y c899248y = C899248y.this;
                    File A06 = c899248y.A02.A06();
                    if (A06.exists() && !A06.delete()) {
                        Log.e("dyiReportManager/reset/failed-delete-report-file");
                    }
                    c899248y.A09.A0E(2);
                }

                @Override // X.InterfaceC04070Ih
                public void AJY(C04020Ic c04020Ic, C43211x2 c43211x2) {
                    StringBuilder A0P = C000200d.A0P("dyiReportManager/download-report/on-download-canceled success -> ");
                    boolean A02 = c04020Ic.A02();
                    A0P.append(A02);
                    Log.i(A0P.toString());
                    if (A02) {
                        C899248y c899248y = C899248y.this;
                        synchronized (c899248y) {
                            c899248y.A09.A0E(4);
                        }
                        C4F4 c4f42 = c4f4;
                        if (c4f42 != null) {
                            Log.i("DyiViewModel/download-report/on-success");
                            C92074Hk c92074Hk = c4f42.A00;
                            c92074Hk.A02.A0A(Integer.valueOf(c92074Hk.A06.A02()));
                            return;
                        }
                        return;
                    }
                    C4F4 c4f43 = c4f4;
                    if (c4f43 != null) {
                        c4f43.A00();
                    }
                    C899248y.this.A09.A0E(2);
                }
            });
            Log.i("dyiReportManager/on-report-downloading");
            this.A09.A0E(3);
            this.A00.A01();
        }
    }
}
