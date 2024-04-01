package X;

import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.4FL */
/* loaded from: classes3.dex */
public abstract class C4FL extends C0MU {
    public final C0HK A00 = new C0HK();
    public final C0HK A01 = new C0HK();
    public final AnonymousClass012 A02;
    public final C899048w A03;
    public final AnonymousClass493 A04;
    public final AnonymousClass498 A05;
    public final AnonymousClass499 A06;

    public C4FL(AnonymousClass012 anonymousClass012, AnonymousClass498 anonymousClass498, AnonymousClass499 anonymousClass499, AnonymousClass493 anonymousClass493, C899048w c899048w) {
        this.A02 = anonymousClass012;
        this.A05 = anonymousClass498;
        this.A06 = anonymousClass499;
        this.A04 = anonymousClass493;
        this.A03 = c899048w;
    }

    public /* synthetic */ void A02(int i, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, FingerprintBottomSheet fingerprintBottomSheet, int i2, String str, String str2, ActivityC02270An activityC02270An, String str3, C02590Ca c02590Ca, C28Q c28q) {
        if (c28q != null) {
            if (i == 1 && pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A1C();
            }
            this.A01.A0A(c28q);
            return;
        }
        if (i == 0 && fingerprintBottomSheet != null) {
            fingerprintBottomSheet.A11();
        }
        C92074Hk c92074Hk = (C92074Hk) this;
        Log.i("DyiViewModel/request-report/on-pin-node-ready");
        if (str2.hashCode() == 620512392 && str2.equals("DYIREPORT")) {
            if (i == 0) {
                activityC02270An.A12(i2);
            }
            final C4F3 c4f3 = new C4F3(c92074Hk, i, pinBottomSheetDialogFragment, activityC02270An, str3);
            Log.i("DyiViewModel/request-report");
            c92074Hk.A05(0);
            C899248y c899248y = c92074Hk.A06;
            long A05 = ((C4FL) c92074Hk).A02.A05();
            synchronized (c899248y) {
                Log.i("dyiReportManager/on-report-requested");
                c899248y.A09.A04().edit().putLong("payment_dyi_report_timestamp", A05).apply();
            }
            c92074Hk.A02.A0A(1);
            C48I c48i = c92074Hk.A05;
            c48i.A06.A0E("get", new C02590Ca("account", new C04P[]{new C04P("action", "generate-payments-dyi-report", null, (byte) 0), new C04P("version", "1", null, (byte) 0), new C04P("nonce", str, null, (byte) 0)}, c02590Ca), new C28V(c48i.A00, c48i.A01, c48i.A02, c48i.A04) { // from class: X.4Gh
                @Override // X.C28V
                public void A02(C28Q c28q2) {
                    C4F3 c4f32 = c4f3;
                    if (c4f32 != null) {
                        c4f32.A00(c28q2);
                    }
                }

                @Override // X.C28V
                public void A03(C28Q c28q2) {
                    C4F3 c4f32 = c4f3;
                    if (c4f32 != null) {
                        c4f32.A00(c28q2);
                    }
                }

                @Override // X.C28V
                public void A04(C02590Ca c02590Ca2) {
                    C4F3 c4f32 = c4f3;
                    if (c4f32 != null) {
                        try {
                            C02590Ca A0D = c02590Ca2.A0D("account");
                            C28Q A00 = C28Q.A00(A0D);
                            if (A00 != null) {
                                if (c4f32 != null) {
                                    c4f32.A00(A00);
                                    return;
                                }
                                return;
                            }
                            C02590Ca A0D2 = A0D.A0D("document");
                            if (A0D2 == null) {
                                if (c4f32 != null) {
                                    c4f32.A00(new C28Q(500));
                                    return;
                                }
                                return;
                            }
                            long A07 = A0D2.A07("creation", 0L) * 1000;
                            long A072 = A0D2.A07("expiration", 0L) * 1000;
                            byte[] bArr = A0D2.A01;
                            Log.i("DyiViewModel/request-report/on-success");
                            C92074Hk c92074Hk2 = c4f32.A03;
                            C899248y c899248y2 = c92074Hk2.A06;
                            synchronized (c899248y2) {
                                Log.i("dyiReportManager/on-report-available");
                                try {
                                    C02A.A07(bArr, new File(c899248y2.A07.A00.getFilesDir(), "dyi.info"));
                                    C898748t A002 = C899248y.A00(bArr, A07);
                                    c899248y2.A01 = A002;
                                    if (A002 == null) {
                                        Log.e("dyiReportManager/on-report-available/cannot-create-message");
                                    } else {
                                        C0EU c0eu = c899248y2.A09;
                                        c0eu.A04().edit().putLong("payment_dyi_report_timestamp", A07).apply();
                                        c0eu.A04().edit().putLong("payment_dyi_report_expiration_timestamp", A072).apply();
                                        c0eu.A0E(2);
                                    }
                                } catch (IOException e) {
                                    Log.e("dyiReportManager/on-report-available/cannot-save", e);
                                }
                            }
                            if (c899248y2.A03() == null) {
                                Log.i("DyiViewModel/request-report/on-error :: invalid report info");
                                c92074Hk2.A02.A0A(0);
                                c92074Hk2.A03.A0A(new C0FK(0, new C28Q(500)));
                            } else {
                                c92074Hk2.A01.A0A(c899248y2.A03());
                                c92074Hk2.A02.A0A(Integer.valueOf(c899248y2.A02()));
                            }
                            if (c4f32.A00 == 1) {
                                PinBottomSheetDialogFragment pinBottomSheetDialogFragment2 = c4f32.A02;
                                if (pinBottomSheetDialogFragment2 != null) {
                                    pinBottomSheetDialogFragment2.A11();
                                    return;
                                }
                                return;
                            }
                            c4f32.A01.ARS();
                        } catch (Exception unused) {
                            Log.e("Pay: requestDyiReport -> error parsing the response");
                        }
                    }
                }
            });
            return;
        }
        Log.e("DyiViewModel/request-report/on-pin-node-ready :: no matching actions");
    }
}
