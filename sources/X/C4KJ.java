package X;

import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilDyiReportActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4KJ */
/* loaded from: classes3.dex */
public abstract class C4KJ extends C4K3 {
    public View A00;
    public FrameLayout A01;
    public FrameLayout A02;
    public C018508q A03;
    public C02L A04;
    public TextEmojiLabel A05;
    public WaImageView A06;
    public WaTextView A07;
    public WaTextView A08;
    public WaTextView A09;
    public WaTextView A0A;
    public AnonymousClass012 A0B;
    public C002301c A0C;
    public C0C9 A0D;
    public C28S A0E;
    public C0EU A0F;
    public C463026g A0G;
    public C0DW A0H;
    public C47302Ar A0I;
    public C0DV A0J;
    public C899048w A0K;
    public C899248y A0L;
    public AnonymousClass493 A0M;
    public AnonymousClass498 A0N;
    public AnonymousClass499 A0O;
    public C92074Hk A0P;
    public C4F6 A0Q;
    public C49682Lx A0R;
    public C40071rX A0S;
    public InterfaceC002901k A0T;
    public String A0U = "";

    public final void A1P(int i) {
        if (i != 1) {
            if (i == 2) {
                ARS();
                this.A0A.setText(R.string.payments_report_footer_available);
                this.A09.setText(R.string.payments_report_footer_delete);
                this.A01.setVisibility(8);
                this.A00.setVisibility(8);
                this.A02.setEnabled(true);
                this.A02.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.4DH
                    {
                        C4KJ.this = this;
                    }

                    @Override // X.AbstractView$OnClickListenerC49532Ky
                    public void A00(View view) {
                        C92074Hk c92074Hk = C4KJ.this.A0P;
                        if (c92074Hk != null) {
                            Log.i("DyiViewModel/download-report");
                            c92074Hk.A05(3);
                            c92074Hk.A02.A0A(3);
                            c92074Hk.A07.AS1(new C3RS(c92074Hk));
                            return;
                        }
                        throw null;
                    }
                });
                this.A08.setText(R.string.dyi_download_report_label);
                this.A08.setTextColor(C02160Ac.A00(this, R.color.settings_item_title_text));
                this.A07.setVisibility(0);
                this.A06.setImageDrawable(new C0We(this.A0C, C02160Ac.A03(this, R.drawable.ic_action_download)));
            } else if (i == 3) {
                this.A02.setEnabled(false);
                this.A02.setOnClickListener(null);
                this.A08.setText(R.string.dyi_downloading_report_label);
                this.A08.setTextColor(C02160Ac.A00(this, R.color.gdpr_grey));
                this.A07.setVisibility(0);
                this.A06.setImageDrawable(new C0We(this.A0C, C02160Ac.A03(this, R.drawable.ic_action_schedule)));
            } else if (i != 4) {
                this.A0A.setText(R.string.payments_report_footer_default);
                this.A09.setText(R.string.payments_report_footer_delete_default);
                this.A08.setText(R.string.request_payment_report);
                this.A08.setTextColor(C02160Ac.A00(this, R.color.settings_item_title_text));
                this.A07.setVisibility(8);
                this.A01.setVisibility(8);
                this.A00.setVisibility(8);
                this.A02.setEnabled(true);
                this.A02.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.4DK
                    {
                        C4KJ.this = this;
                    }

                    @Override // X.AbstractView$OnClickListenerC49532Ky
                    public void A00(View view) {
                        final PinBottomSheetDialogFragment pinBottomSheetDialogFragment = new PinBottomSheetDialogFragment();
                        pinBottomSheetDialogFragment.A0A = new C90834Cp();
                        FingerprintBottomSheet A00 = Build.VERSION.SDK_INT >= 23 ? FingerprintBottomSheet.A00(R.string.payment_bio_bottom_sheet_title, R.string.cancel, R.string.use_payments_pin, R.layout.pay_header) : null;
                        final C4KJ c4kj = C4KJ.this;
                        byte[] A03 = C05V.A03(c4kj.A0B, c4kj.A04, false);
                        if (A03 != null) {
                            final String A032 = C02A.A03(A03);
                            final C92074Hk c92074Hk = c4kj.A0P;
                            final String str = c4kj.A0U;
                            C4DJ c4dj = new C4DJ(c4kj.A0B, c4kj.A04, c4kj.A0G, c4kj.A0M, A032);
                            if (Build.VERSION.SDK_INT >= 23) {
                                AnonymousClass493 anonymousClass493 = ((C4FL) c92074Hk).A04;
                                if (anonymousClass493.A05() && anonymousClass493.A01() == 1) {
                                    final FingerprintBottomSheet fingerprintBottomSheet = A00;
                                    A00.A04 = new C4H7(((C4FL) c92074Hk).A02, ((C4FL) c92074Hk).A06, c4kj, fingerprintBottomSheet, c4dj, new AnonymousClass494() { // from class: X.4FK
                                        public final /* synthetic */ int A00 = R.string.register_wait_message;
                                        public final /* synthetic */ String A05 = "DYIREPORT";

                                        @Override // X.AnonymousClass494
                                        public void AOf() {
                                            C4FL c4fl = c92074Hk;
                                            int i2 = this.A00;
                                            String str2 = A032;
                                            String str3 = this.A05;
                                            ActivityC02270An activityC02270An = c4kj;
                                            String str4 = str;
                                            PinBottomSheetDialogFragment pinBottomSheetDialogFragment2 = pinBottomSheetDialogFragment;
                                            pinBottomSheetDialogFragment2.A0B = new C4FJ(c4fl, pinBottomSheetDialogFragment2, str3, str4, str2, i2, activityC02270An);
                                            activityC02270An.AUh(pinBottomSheetDialogFragment2);
                                        }

                                        @Override // X.AnonymousClass494
                                        public void APK(final byte[] bArr) {
                                            C4FL c4fl = c92074Hk;
                                            AnonymousClass498 anonymousClass498 = c4fl.A05;
                                            String str2 = this.A05;
                                            String str3 = str;
                                            String str4 = A032;
                                            final C78483jz c78483jz = new C78483jz(c4fl, 0, null, fingerprintBottomSheet, this.A00, str4, str2, c4kj, str3);
                                            anonymousClass498.A01(str3, new AnonymousClass495() { // from class: X.3iJ
                                                @Override // X.AnonymousClass495
                                                public final void AO7(C49A c49a) {
                                                    c78483jz.AO8(c49a.A00(bArr), null);
                                                }
                                            }, new AnonymousClass496() { // from class: X.3iD
                                                @Override // X.AnonymousClass496
                                                public final void AO5(C28Q c28q) {
                                                    c78483jz.AO8(null, c28q);
                                                }
                                            });
                                        }
                                    });
                                    c4kj.AUh(A00);
                                    return;
                                }
                            }
                            pinBottomSheetDialogFragment.A0B = new C4FJ(c92074Hk, pinBottomSheetDialogFragment, "DYIREPORT", str, A032, R.string.register_wait_message, c4kj);
                            c4kj.AUh(pinBottomSheetDialogFragment);
                            return;
                        }
                        throw null;
                    }
                });
                this.A06.setImageDrawable(new C0We(this.A0C, C02160Ac.A03(this, R.drawable.ic_settings_terms_policy)));
            } else {
                this.A0A.setText(R.string.payments_report_footer_available);
                this.A09.setText(R.string.payments_report_footer_delete);
                this.A02.setEnabled(true);
                this.A02.setOnClickListener(new C4DI(this));
                this.A08.setText(R.string.export_payment_report);
                this.A08.setTextColor(C02160Ac.A00(this, R.color.settings_item_title_text));
                this.A07.setVisibility(0);
                this.A06.setImageDrawable(new C0We(this.A0C, C02160Ac.A03(this, R.drawable.ic_action_share)));
                this.A02.setVisibility(0);
                this.A01.setVisibility(0);
                this.A00.setVisibility(0);
            }
        }
    }

    public void A1Q(DialogInterfaceC019408z dialogInterfaceC019408z) {
        dialogInterfaceC019408z.A02(-1).setTextColor(C02160Ac.A00(this, R.color.fb_pay_secondary_button_label));
        dialogInterfaceC019408z.A02(-2).setTextColor(C02160Ac.A00(this, R.color.fb_pay_secondary_button_label));
        dialogInterfaceC019408z.A02(-3).setTextColor(C02160Ac.A00(this, R.color.fb_pay_secondary_button_label));
    }

    public void A1R(C0FK c0fk) {
        BrazilDyiReportActivity brazilDyiReportActivity = (BrazilDyiReportActivity) this;
        brazilDyiReportActivity.ARS();
        Object obj = c0fk.A00;
        if (obj == null) {
            Log.e("BrazilDyiReportActivity/on-network-error error code is null");
            return;
        }
        Object obj2 = c0fk.A01;
        int i = obj2 != null ? ((C28Q) obj2).A00 : -1;
        int intValue = ((Number) obj).intValue();
        if (intValue == 0) {
            brazilDyiReportActivity.A1V(i, R.string.payments_request_report_error);
        } else if (3 == intValue) {
            brazilDyiReportActivity.A1V(i, R.string.payments_download_report_error);
        } else if (1 == intValue) {
            brazilDyiReportActivity.A1V(i, R.string.payments_delete_report_error);
        } else {
            brazilDyiReportActivity.A1V(i, R.string.something_went_wrong);
        }
    }

    public void A1S(C28Q c28q) {
        BrazilDyiReportActivity brazilDyiReportActivity = (BrazilDyiReportActivity) this;
        brazilDyiReportActivity.ARS();
        DialogInterfaceC019408z A03 = brazilDyiReportActivity.A02.A03(brazilDyiReportActivity, c28q.A00, null, null);
        if (A03 != null) {
            A03.show();
        } else {
            brazilDyiReportActivity.A1V(-1, R.string.something_went_wrong);
        }
    }

    public final void A1T(C898748t c898748t) {
        if (c898748t != null) {
            long j = c898748t.A00;
            if (j > 0) {
                long j2 = c898748t.A01;
                if (j2 > 0) {
                    this.A07.setText(getString(R.string.gdpr_report_info, C002501g.A0C(this.A0C, j), C02180Ae.A0k(this.A0C, j2)));
                } else {
                    this.A07.setText(C002501g.A0C(this.A0C, j));
                }
            }
        }
    }

    public void A1U(boolean z) {
        BrazilDyiReportActivity brazilDyiReportActivity = (BrazilDyiReportActivity) this;
        if (z) {
            if (brazilDyiReportActivity.A00 != null) {
                brazilDyiReportActivity.A0T.ARy(new C4BY(((C4KJ) brazilDyiReportActivity).A0J, new C76943hP(brazilDyiReportActivity)), new Void[0]);
                return;
            }
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0286, code lost:
        com.whatsapp.util.Log.e("dyiReportManager/validate-state/report-message-missing");
        r4.A09.A0D();
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x024e A[Catch: all -> 0x02d0, TryCatch #0 {, blocks: (B:100:0x020d, B:106:0x0219, B:108:0x0225, B:118:0x023e, B:120:0x024e, B:122:0x0258, B:124:0x0260, B:125:0x0280, B:127:0x0286, B:116:0x0238, B:128:0x0291), top: B:139:0x020d }] */
    /* JADX WARN: Type inference failed for: r14v1, types: [X.4F6] */
    @Override // X.C4K3, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4KJ.onCreate(android.os.Bundle):void");
    }
}
