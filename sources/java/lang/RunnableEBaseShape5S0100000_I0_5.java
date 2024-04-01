package java.lang;

import X.ActivityC02290Ap;
import X.AnonymousClass009;
import X.AnonymousClass024;
import X.AnonymousClass029;
import X.AnonymousClass220;
import X.AnonymousClass255;
import X.AnonymousClass282;
import X.C000200d;
import X.C000500h;
import X.C002701i;
import X.C012005w;
import X.C01C;
import X.C02A;
import X.C02L;
import X.C06C;
import X.C0DV;
import X.C0G5;
import X.C0HA;
import X.C0HS;
import X.C0KF;
import X.C0KG;
import X.C0KH;
import X.C0KI;
import X.C0M6;
import X.C0MA;
import X.C1u5;
import X.C20X;
import X.C22G;
import X.C22H;
import X.C25C;
import X.C26H;
import X.C26I;
import X.C2EA;
import X.C2Oy;
import X.C2S5;
import X.C40731sm;
import X.C41711uO;
import X.C454021u;
import X.C454321z;
import X.C47392Ba;
import X.C53772hU;
import X.C53882hf;
import X.C53892hg;
import X.C53902hh;
import X.C53912hi;
import X.InterfaceC002901k;
import X.InterfaceC004201y;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.google.android.search.verification.client.R;
import com.whatsapp.Me;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.profile.ProfileInfoActivity;
import com.whatsapp.profile.ProfilePhotoReminder;
import com.whatsapp.qrcode.AuthenticationActivity;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.qrcode.QrEducationDialogFragment;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;
import com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment;
import com.whatsapp.registration.ChangeNumber;
import com.whatsapp.registration.ChangeNumberOverview;
import com.whatsapp.registration.EULA;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.registration.VerifySms;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.report.BusinessActivityReportViewModel;
import com.whatsapp.report.ReportActivity;
import com.whatsapp.service.GcmFGService;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes2.dex */
public class RunnableEBaseShape5S0100000_I0_5 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableEBaseShape5S0100000_I0_5(C454021u c454021u) {
        this.A01 = 24;
        this.A00 = c454021u;
    }

    public RunnableEBaseShape5S0100000_I0_5(VerifyTwoFactorAuth verifyTwoFactorAuth, int i) {
        this.A01 = i;
        switch (i) {
            case 36:
            case 37:
                this.A00 = verifyTwoFactorAuth;
                return;
            default:
                this.A00 = verifyTwoFactorAuth;
                return;
        }
    }

    public RunnableEBaseShape5S0100000_I0_5(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.3mL, X.0HS] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A01) {
            case 0:
                ((ProfileInfoActivity) this.A00).A1Q();
                return;
            case 1:
                ProfilePhotoReminder profilePhotoReminder = (ProfilePhotoReminder) this.A00;
                if (profilePhotoReminder.A0D.A01()) {
                    profilePhotoReminder.A0D.A00(true);
                    return;
                }
                return;
            case 2:
                ProfilePhotoReminder profilePhotoReminder2 = (ProfilePhotoReminder) this.A00;
                C06C c06c = profilePhotoReminder2.A0B;
                if (c06c.A02 == 0 && c06c.A01 == 0) {
                    profilePhotoReminder2.A02.setVisibility(4);
                    return;
                }
                return;
            case 3:
                ((Activity) this.A00).finish();
                return;
            case 4:
                C0HA c0ha = ((AnonymousClass220) this.A00).A0B;
                C000500h c000500h = c0ha.A07;
                if (c000500h.A00.getBoolean("pref_wam_advertisement_id_reporting_done", false) || !c0ha.A03.A0E(C01C.A2A)) {
                    return;
                }
                try {
                    C0KH A00 = C0KG.A00(c0ha.A06.A00);
                    if (!A00.A01) {
                        C0KI c0ki = new C0KI();
                        c0ki.A00 = A00.A00;
                        c0ha.A0B.A0B(c0ki, null, true);
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    C000200d.A0j(c000500h, "pref_wam_advertisement_id_reporting_done", true);
                    throw th;
                }
                C000200d.A0j(c000500h, "pref_wam_advertisement_id_reporting_done", true);
                return;
            case 5:
                C22G c22g = (C22G) this.A00;
                c22g.A0C.A03();
                c22g.A0N.AS1(new RunnableEBaseShape5S0100000_I0_5(c22g, 6));
                return;
            case 6:
                ((C22G) this.A00).A0B.A07(C22H.A04, false, true, true, true, true, true, true);
                return;
            case 7:
                ((AnonymousClass255) this.A00).A02.A0F(new HashSet(), null);
                return;
            case 8:
                C000200d.A0p("LinkPreviewViewModel/CTWAListener/errorCode/", 422);
                return;
            case 9:
                Log.e("LinkPreviewViewModel/CTWAListener/onDeliveryFailure");
                return;
            case 10:
                ((AnonymousClass282) this.A00).A01.A00.A07(R.string.info_retrieve_failed, 0);
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                C1u5 c1u5 = (C1u5) this.A00;
                c1u5.A1K.A02(c1u5.A0M.A00, GcmFGService.class);
                return;
            case 12:
                C1u5 c1u52 = (C1u5) this.A00;
                if (c1u52.A06.A0E(C01C.A28)) {
                    RunnableEBaseShape5S0100000_I0_5 runnableEBaseShape5S0100000_I0_5 = new RunnableEBaseShape5S0100000_I0_5(c1u52, 13);
                    Handler handler = c1u52.A0Q.A01;
                    Message obtain = Message.obtain(handler, runnableEBaseShape5S0100000_I0_5);
                    obtain.arg1 = 14;
                    handler.sendMessage(obtain);
                    return;
                }
                c1u52.A01();
                return;
            case 13:
                ((C1u5) this.A00).A01();
                return;
            case 14:
                ((C20X) this.A00).A1P();
                return;
            case 15:
                DevicePairQrScannerActivity devicePairQrScannerActivity = (DevicePairQrScannerActivity) this.A00;
                if (devicePairQrScannerActivity.A1E()) {
                    ((C20X) devicePairQrScannerActivity).A05 = null;
                    return;
                }
                String str = ((C20X) devicePairQrScannerActivity).A05;
                if (str != null) {
                    devicePairQrScannerActivity.A04.ANk(str);
                    devicePairQrScannerActivity.A0G.A00().AEJ(((C20X) devicePairQrScannerActivity).A05);
                    return;
                }
                devicePairQrScannerActivity.A0M.A01();
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                ((DevicePairQrScannerActivity) this.A00).A0C.A06();
                return;
            case 17:
                DevicePairQrScannerActivity devicePairQrScannerActivity2 = (DevicePairQrScannerActivity) this.A00;
                devicePairQrScannerActivity2.A04.AG4(2);
                devicePairQrScannerActivity2.A0H.AS1(new RunnableEBaseShape5S0100000_I0_5(devicePairQrScannerActivity2, 16));
                if (devicePairQrScannerActivity2.AFE()) {
                    return;
                }
                devicePairQrScannerActivity2.AUj(R.string.error_log_in_device);
                devicePairQrScannerActivity2.A1S();
                ((C20X) devicePairQrScannerActivity2).A05 = null;
                return;
            case 18:
                ((C20X) this.A00).A03.A01.ARd();
                return;
            case 19:
                ((DevicePairQrScannerActivity) this.A00).A01.A07(R.string.scan_qr_code_again, 1);
                return;
            case C0M6.A01 /* 20 */:
                ((AuthenticationActivity) this.A00).A1G();
                return;
            case 21:
                QrScanCodeFragment qrScanCodeFragment = (QrScanCodeFragment) this.A00;
                qrScanCodeFragment.A0B = false;
                qrScanCodeFragment.A10();
                return;
            case 22:
                QrScanCodeFragment qrScanCodeFragment2 = (QrScanCodeFragment) this.A00;
                if (qrScanCodeFragment2.A0Z()) {
                    AnonymousClass029.A1C(qrScanCodeFragment2.A0B(), new QrEducationDialogFragment());
                    qrScanCodeFragment2.A08 = true;
                }
                qrScanCodeFragment2.A0A = true;
                return;
            case 23:
                ScannedCodeDialogFragment scannedCodeDialogFragment = (ScannedCodeDialogFragment) this.A00;
                scannedCodeDialogFragment.A09.A02(new C0MA(scannedCodeDialogFragment.A0L, scannedCodeDialogFragment.A0R, scannedCodeDialogFragment.A0T));
                return;
            case 24:
                InterfaceC004201y interfaceC004201y = ((C454021u) this.A00).A00;
                interfaceC004201y.A7e((short) 630, true);
                interfaceC004201y.A7d((short) 113, 300000);
                return;
            case 25:
                C02L c02l = ((ChangeNumber) this.A00).A08;
                c02l.A05();
                Me me = c02l.A00;
                c02l.A05();
                c02l.A08(me, "me_old");
                return;
            case 26:
                ChangeNumberOverview changeNumberOverview = (ChangeNumberOverview) this.A00;
                C0DV c0dv = changeNumberOverview.A04;
                c0dv.A04();
                ((ActivityC02290Ap) changeNumberOverview).A0A.A0G(new RunnableEBaseShape0S0110000_I0(changeNumberOverview, ((AbstractCollection) c0dv.A07.A0V(1)).size() > 0, 13));
                return;
            case 27:
                ((VerifySms) this.A00).A1e();
                return;
            case 28:
                ((EULA) this.A00).A1P();
                return;
            case 29:
                Log.i("DeviceMigration/unsupported build");
                ((C2Oy) this.A00).A01.A00.edit().putBoolean("google_migrate_has_whatsapp_data", false).commit();
                return;
            case 30:
                RegisterName registerName = (RegisterName) this.A00;
                if (C0KF.A02() && C0KF.A03(registerName.A0R.A00, registerName.A0Q, ((ActivityC02290Ap) registerName).A0F)) {
                    new C454321z(registerName.A0Q, registerName.A0R, registerName.A1G, registerName.A0i, ((ActivityC02290Ap) registerName).A0F).A00();
                    return;
                }
                return;
            case 31:
                Log.i("registername/dialog/initprogress/removedialog");
                C002701i.A18((Activity) this.A00, 0);
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                RegisterName registerName2 = (RegisterName) this.A00;
                if (registerName2.A0Z.A01()) {
                    registerName2.A0Z.A00(true);
                    return;
                }
                return;
            case 33:
                RegisterPhone registerPhone = (RegisterPhone) this.A00;
                Log.i("register/phone/whats-my-number/link-clicked");
                registerPhone.A0R.A00 = 1;
                if (!registerPhone.A0F.A08()) {
                    RequestPermissionActivity.A03(registerPhone);
                    return;
                } else {
                    registerPhone.A1V();
                    return;
                }
            case 34:
                C41711uO c41711uO = (C41711uO) this.A00;
                c41711uO.A0I.execute(new RunnableEBaseShape2S0100000_I0_2(c41711uO, 38));
                return;
            case 35:
                Log.i("verifysms/edit");
                ((VerifySms) this.A00).A1e();
                return;
            case 36:
                VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) this.A00;
                int A1P = verifyTwoFactorAuth.A1P();
                long j = verifyTwoFactorAuth.A01;
                VerifyTwoFactorAuth.ConfirmResetCode confirmResetCode = new VerifyTwoFactorAuth.ConfirmResetCode();
                Bundle bundle = new Bundle();
                bundle.putInt("wipeStatus", A1P);
                bundle.putLong("timeToWaitInMillis", ((verifyTwoFactorAuth.A03 * 1000) + j) - verifyTwoFactorAuth.A0B.A05());
                confirmResetCode.A0P(bundle);
                verifyTwoFactorAuth.AUg(confirmResetCode, "forgotPinDialogTag");
                return;
            case 37:
                VerifyTwoFactorAuth verifyTwoFactorAuth2 = (VerifyTwoFactorAuth) this.A00;
                verifyTwoFactorAuth2.A0M.A0A();
                verifyTwoFactorAuth2.startActivity(new Intent(verifyTwoFactorAuth2, RegisterPhone.class));
                verifyTwoFactorAuth2.finish();
                return;
            case 38:
                StringBuilder sb = new StringBuilder();
                VerifyTwoFactorAuth verifyTwoFactorAuth3 = (VerifyTwoFactorAuth) this.A00;
                sb.append(verifyTwoFactorAuth3.A0U);
                sb.append(verifyTwoFactorAuth3.A0V);
                byte[] A0E = C02A.A0E(verifyTwoFactorAuth3.getApplicationContext(), C40731sm.A0S(sb.toString()));
                if (A0E != null) {
                    byte[] A04 = C0KF.A04(verifyTwoFactorAuth3.getApplicationContext(), verifyTwoFactorAuth3.A0V);
                    InterfaceC002901k interfaceC002901k = verifyTwoFactorAuth3.A0T;
                    ?? r2 = new C0HS(((ActivityC02290Ap) verifyTwoFactorAuth3).A0F, verifyTwoFactorAuth3.A0L, verifyTwoFactorAuth3.A0U, verifyTwoFactorAuth3.A0V, A0E, A04, verifyTwoFactorAuth3, verifyTwoFactorAuth3.A0C) { // from class: X.3mL
                        public final C001200o A00;
                        public final C000500h A01;
                        public final C2DT A02;
                        public final String A03;
                        public final String A04;
                        public final WeakReference A05;
                        public final byte[] A06;
                        public final byte[] A07;

                        {
                            this.A01 = r2;
                            this.A02 = r3;
                            this.A03 = r4;
                            this.A04 = r5;
                            this.A07 = A0E;
                            this.A06 = A04;
                            this.A05 = new WeakReference(verifyTwoFactorAuth3);
                            this.A00 = r9;
                        }

                        @Override // X.C0HS
                        public Object A07(Object[] objArr) {
                            try {
                                C000500h c000500h2 = this.A01;
                                int i = c000500h2.A00.getInt("reg_attempts_check_exist", 0) + 1;
                                C000200d.A0g(c000500h2, "reg_attempts_check_exist", i);
                                C2DX c2dx = new C2DX(i);
                                Application application = this.A00.A00;
                                String str2 = this.A04;
                                return this.A02.A01(this.A03, str2, this.A07, C3VN.A00(application, str2), "-1", this.A06, null, c2dx);
                            } catch (Exception e) {
                                Log.e("verifytwofactorauth/checkifexists/error", e);
                                return null;
                            }
                        }

                        @Override // X.C0HS
                        public void A09(Object obj) {
                            C47902Da c47902Da = (C47902Da) obj;
                            VerifyTwoFactorAuth verifyTwoFactorAuth4 = (VerifyTwoFactorAuth) this.A05.get();
                            if (verifyTwoFactorAuth4 != null) {
                                verifyTwoFactorAuth4.A0O = null;
                                if (c47902Da != null) {
                                    if (c47902Da.A0D == C3Z2.OK) {
                                        Log.i("verifytwofactorauth/checkifexists ok");
                                        verifyTwoFactorAuth4.A1U(true);
                                        C000200d.A0j(((ActivityC02290Ap) verifyTwoFactorAuth4).A0F, "new_jid", c47902Da.A0F);
                                        verifyTwoFactorAuth4.A1T(null, c47902Da.A0E);
                                        return;
                                    }
                                    long j2 = c47902Da.A03;
                                    long j3 = c47902Da.A02;
                                    if (j2 + j3 < verifyTwoFactorAuth4.A00) {
                                        verifyTwoFactorAuth4.A0a.postDelayed(verifyTwoFactorAuth4.A0c, Math.max(j3 * 1000, 5000L));
                                        return;
                                    }
                                    verifyTwoFactorAuth4.A1U(true);
                                    return;
                                }
                                if ((verifyTwoFactorAuth4.A01 - (verifyTwoFactorAuth4.A02 * 1000)) + (verifyTwoFactorAuth4.A00 * 1000) >= verifyTwoFactorAuth4.A0B.A05()) {
                                    verifyTwoFactorAuth4.A0a.postDelayed(verifyTwoFactorAuth4.A0c, 5000L);
                                } else {
                                    verifyTwoFactorAuth4.A1U(true);
                                }
                            }
                        }
                    };
                    verifyTwoFactorAuth3.A0O = r2;
                    interfaceC002901k.ARy(r2, new Void[0]);
                    return;
                }
                throw null;
            case 39:
                C26I c26i = (C26I) this.A00;
                c26i.A06(c26i.A05.A00.getInt("migrate_from_other_app_attempt_count", 0), 4);
                c26i.A05(4);
                c26i.A03();
                C2S5 c2s5 = c26i.A09.A00;
                if (c2s5 != null) {
                    c2s5.A05(true);
                    return;
                }
                return;
            case 40:
                C25C c25c = (C25C) this.A00;
                Iterator it = ((AnonymousClass009) c25c).A00.iterator();
                while (true) {
                    C0G5 c0g5 = (C0G5) it;
                    if (c0g5.hasNext()) {
                        int i = c25c.A00;
                        int i2 = c25c.A01;
                        C26I c26i2 = ((C26H) c0g5.next()).A00;
                        c26i2.A04.A0A(new int[]{i, i2});
                        c26i2.A03();
                        c26i2.A04();
                    } else {
                        c25c.A03.A02.postDelayed(c25c.A02, 500L);
                        return;
                    }
                }
            case 41:
                BusinessActivityReportViewModel businessActivityReportViewModel = (BusinessActivityReportViewModel) this.A00;
                C2EA c2ea = businessActivityReportViewModel.A05;
                String obj = UUID.randomUUID().toString();
                synchronized (c2ea) {
                    C012005w c012005w = c2ea.A02;
                    AnonymousClass024.A0T(c012005w.A08(), 0L);
                    File A05 = c012005w.A05();
                    File A0I = c012005w.A0I(obj);
                    try {
                        FileInputStream fileInputStream = new FileInputStream(A05);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(A0I);
                            AnonymousClass024.A0V(fileInputStream, fileOutputStream);
                            fileOutputStream.close();
                            if (!A0I.setLastModified(c2ea.A06.A05())) {
                                Log.e("BusinessActivityReportManager/prepare-report-for-export/failed to update report file");
                                Log.i("BusinessActivityReportViewModel/export-report/on-error");
                                businessActivityReportViewModel.A01.A0A(6);
                                return;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("BusinessActivityReportViewModel/export-report/on-ready-to-export :: ");
                            sb2.append(obj);
                            Log.i(sb2.toString());
                            businessActivityReportViewModel.A00.A0A(obj);
                            return;
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } finally {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                    } catch (IOException e) {
                        Log.e("BusinessActivityReportManager/prepare-report-for-export/can't prepare report file", e);
                        Log.i("BusinessActivityReportViewModel/export-report/on-error");
                        businessActivityReportViewModel.A01.A0A(6);
                        return;
                    }
                }
            case 42:
                ((C47392Ba) this.A00).A05();
                return;
            case 43:
                ReportActivity reportActivity = ((C53772hU) this.A00).A00;
                if (reportActivity.AFE()) {
                    return;
                }
                reportActivity.A1Q();
                return;
            case 44:
                ((ActivityC02290Ap) this.A00).A0A.A07(R.string.gdpr_report_failed_delete, 0);
                return;
            case 45:
                ((C53882hf) this.A00).A00.A07(R.string.gdpr_report_failed_delete, 0);
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                ((C53892hg) this.A00).A00.A07(R.string.gdpr_report_failed_request, 0);
                return;
            case 47:
                BusinessActivityReportViewModel businessActivityReportViewModel2 = ((C53902hh) this.A00).A00.A00;
                BusinessActivityReportViewModel.A00(businessActivityReportViewModel2);
                businessActivityReportViewModel2.A01.A0B(0);
                return;
            case 48:
                BusinessActivityReportViewModel businessActivityReportViewModel3 = ((C53902hh) this.A00).A00.A00;
                BusinessActivityReportViewModel.A00(businessActivityReportViewModel3);
                businessActivityReportViewModel3.A01.A0B(3);
                return;
            case 49:
                C53912hi c53912hi = ((C53902hh) this.A00).A00;
                BusinessActivityReportViewModel.A00(c53912hi.A00);
                c53912hi.A00.A01.A0B(3);
                return;
            default:
                return;
        }
    }
}
