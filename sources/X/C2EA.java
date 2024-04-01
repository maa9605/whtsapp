package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.report.BusinessActivityReportViewModel;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2EA */
/* loaded from: classes2.dex */
public class C2EA {
    public static volatile C2EA A0A;
    public C2F4 A00;
    public C2E9 A01;
    public final C012005w A02;
    public final C01B A03;
    public final C0EL A04;
    public final C000400f A05;
    public final AnonymousClass012 A06;
    public final C000500h A07;
    public final C04000Ia A08;
    public final C0IY A09;

    public C2EA(AnonymousClass012 anonymousClass012, C0EL c0el, C012005w c012005w, C01B c01b, C0IY c0iy, C000400f c000400f, C000500h c000500h, C04000Ia c04000Ia) {
        this.A06 = anonymousClass012;
        this.A04 = c0el;
        this.A02 = c012005w;
        this.A03 = c01b;
        this.A09 = c0iy;
        this.A05 = c000400f;
        this.A07 = c000500h;
        this.A08 = c04000Ia;
    }

    public static C2EA A00() {
        if (A0A == null) {
            synchronized (C2EA.class) {
                if (A0A == null) {
                    A0A = new C2EA(AnonymousClass012.A00(), C0EL.A00(), C012005w.A00(), C01B.A00(), C0IY.A00(), C000400f.A00(), C000500h.A00(), C04000Ia.A00());
                }
            }
        }
        return A0A;
    }

    public synchronized int A01() {
        return this.A07.A00.getInt("business_activity_report_state", 0);
    }

    public synchronized C2E9 A02() {
        C2E9 c2e9 = this.A01;
        if (c2e9 == null) {
            SharedPreferences sharedPreferences = this.A07.A00;
            String string = sharedPreferences.getString("business_activity_report_url", null);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            c2e9 = new C2E9(sharedPreferences.getLong("business_activity_report_size", 0L), string, sharedPreferences.getLong("business_activity_report_timestamp", -1L), sharedPreferences.getLong("business_activity_report_expiration_timestamp", 0L), sharedPreferences.getString("business_activity_report_name", null));
            this.A01 = c2e9;
        }
        return c2e9;
    }

    public synchronized void A03() {
        Log.i("BusinessActivityReportManager/reset");
        this.A01 = null;
        C012005w c012005w = this.A02;
        File A05 = c012005w.A05();
        if (A05.exists() && !A05.delete()) {
            Log.e("BusinessActivityReportManager/reset/failed-delete-report-file");
        }
        AnonymousClass024.A0T(c012005w.A08(), 0L);
        this.A07.A0O();
    }

    public synchronized void A04(C2E9 c2e9) {
        this.A01 = c2e9;
        C000500h c000500h = this.A07;
        c000500h.A0D().putString("business_activity_report_url", c2e9.A04).apply();
        c000500h.A0D().putString("business_activity_report_name", c2e9.A03).apply();
        c000500h.A0D().putLong("business_activity_report_size", c2e9.A02).apply();
        C000200d.A0g(c000500h, "business_activity_report_state", 2);
        c000500h.A0D().putLong("business_activity_report_timestamp", c2e9.A00).apply();
        c000500h.A0D().putLong("business_activity_report_expiration_timestamp", c2e9.A01).apply();
    }

    public synchronized void A05(final C2F3 c2f3) {
        Log.i("BusinessActivityReportManager/download-report");
        C2E9 A02 = A02();
        if (A02 != null && A02.A04 != null) {
            C2F4 c2f4 = new C2F4(this.A04, this.A03, this.A09, this.A05, this.A08, new C2F5(A02.A04), this.A02.A05());
            this.A00 = c2f4;
            c2f4.A59(new InterfaceC04070Ih() { // from class: X.2F6
                {
                    C2EA.this = this;
                }

                @Override // X.InterfaceC04070Ih
                public void AJX(boolean z) {
                    C000200d.A1C("BusinessActivityReportManager/download-report/on-download-canceled transferred -> ", z);
                    if (!z) {
                        C2EA c2ea = C2EA.this;
                        File A05 = c2ea.A02.A05();
                        if (A05.exists() && !A05.delete()) {
                            Log.e("BusinessActivityReportManager/reset/failed-delete-report-file");
                        }
                        C000200d.A0g(c2ea.A07, "business_activity_report_state", 2);
                    }
                }

                @Override // X.InterfaceC04070Ih
                public void AJY(C04020Ic c04020Ic, C43211x2 c43211x2) {
                    StringBuilder A0P = C000200d.A0P("BusinessActivityReportManager/download-report/on-download-completed success -> ");
                    boolean A022 = c04020Ic.A02();
                    A0P.append(A022);
                    Log.i(A0P.toString());
                    if (A022) {
                        C2EA c2ea = C2EA.this;
                        synchronized (c2ea) {
                            C000200d.A0g(c2ea.A07, "business_activity_report_state", 4);
                        }
                        C2F3 c2f32 = c2f3;
                        if (c2f32 != null) {
                            Log.i("BusinessActivityReportViewModel/download-report/on-success");
                            BusinessActivityReportViewModel businessActivityReportViewModel = c2f32.A00;
                            businessActivityReportViewModel.A02.A0A(Integer.valueOf(businessActivityReportViewModel.A05.A01()));
                            return;
                        }
                        return;
                    }
                    C2F3 c2f33 = c2f3;
                    if (c2f33 != null) {
                        Log.i("BusinessActivityReportViewModel/download-report/on-error");
                        BusinessActivityReportViewModel businessActivityReportViewModel2 = c2f33.A00;
                        BusinessActivityReportViewModel.A00(businessActivityReportViewModel2);
                        businessActivityReportViewModel2.A01.A0A(5);
                    }
                    C000200d.A0g(C2EA.this.A07, "business_activity_report_state", 2);
                }
            });
            Log.i("BusinessActivityReportManager/on-report-downloading");
            C000200d.A0g(this.A07, "business_activity_report_state", 3);
            this.A00.A01();
            return;
        }
        Log.e("BusinessActivityReportManager/download-report no valid report info");
        Log.i("BusinessActivityReportViewModel/download-report/on-error");
        BusinessActivityReportViewModel businessActivityReportViewModel = c2f3.A00;
        BusinessActivityReportViewModel.A00(businessActivityReportViewModel);
        businessActivityReportViewModel.A01.A0A(5);
        A03();
    }
}
