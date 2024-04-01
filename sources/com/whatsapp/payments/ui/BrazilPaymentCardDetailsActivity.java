package com.whatsapp.payments.ui;

import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass012;
import X.AnonymousClass493;
import X.AnonymousClass498;
import X.AnonymousClass499;
import X.C013606n;
import X.C02620Cd;
import X.C02A;
import X.C02L;
import X.C05V;
import X.C0DV;
import X.C0DW;
import X.C0N2;
import X.C0N7;
import X.C0N8;
import X.C28Q;
import X.C28S;
import X.C3OL;
import X.C3QX;
import X.C3QY;
import X.C463026g;
import X.C47W;
import X.C47Y;
import X.C49682Lx;
import X.C49G;
import X.C49I;
import X.C4AB;
import X.C4BZ;
import X.C4D8;
import X.C4DA;
import X.C4DB;
import X.C4H7;
import X.C4KP;
import X.C4Kv;
import X.C4L0;
import X.C896447w;
import X.C899048w;
import X.C90454Bb;
import X.C90804Cm;
import X.C90834Cp;
import X.C92194Hx;
import X.C92204Hy;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.util.Log;

/* loaded from: classes3.dex */
public class BrazilPaymentCardDetailsActivity extends C4L0 {
    public C02L A00;
    public AnonymousClass012 A01;
    public C013606n A02;
    public C4BZ A03;
    public C47W A04;
    public C90454Bb A05;
    public C47Y A06;
    public C28S A07;
    public C463026g A08;
    public C0DW A09;
    public C0DV A0A;
    public C899048w A0B;
    public AnonymousClass493 A0C;
    public AnonymousClass498 A0D;
    public AnonymousClass499 A0E;
    public C49G A0F;
    public C49I A0G;
    public C49682Lx A0H;

    public static void A00(BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C28Q c28q) {
        if (brazilPaymentCardDetailsActivity != null) {
            int i = c28q.A00;
            if (i == 1441) {
                brazilPaymentCardDetailsActivity.A0E.A03(c28q.A02);
                pinBottomSheetDialogFragment.A1F(c28q.A02 * 1000, true);
                return;
            } else if (i == 1440) {
                pinBottomSheetDialogFragment.A1E(c28q.A01);
                return;
            } else {
                if (i == 1448) {
                    brazilPaymentCardDetailsActivity.A0B.A04("FB", "PIN", c28q);
                }
                pinBottomSheetDialogFragment.A11();
                brazilPaymentCardDetailsActivity.A05.A01(brazilPaymentCardDetailsActivity, c28q.A00, R.string.payment_method_cannot_be_removed).show();
                return;
            }
        }
        throw null;
    }

    @Override // X.C4Kv, X.C4KP
    public void A1U(C0N2 c0n2, boolean z) {
        super.A1U(c0n2, z);
        if (z) {
            findViewById(R.id.payment_method_details_container).setVisibility(8);
            C92204Hy c92204Hy = new C92204Hy(this);
            ((C4Kv) this).A0B = c92204Hy;
            c92204Hy.setCard((C0N7) ((C4KP) this).A07);
            ((ViewGroup) findViewById(R.id.payment_method_container)).addView(((C4Kv) this).A0B, 0);
        }
        C0N8 c0n8 = (C0N8) c0n2.A06;
        if (c0n8 != null) {
            if (((C4Kv) this).A0B != null) {
                this.A0F.A02(((C4KP) this).A07, (ImageView) findViewById(R.id.card_view_background), new C4AB(getBaseContext()), true);
                ((C4Kv) this).A0B.setCardNameTextViewVisibility(8);
                ((C4Kv) this).A0B.setCardNetworkIconVisibility(8);
                ((C4Kv) this).A0B.setCardNumberTextColor(getResources().getColor(R.color.card_art_default_label_color));
                String str = c0n8.A0D;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        C92204Hy c92204Hy2 = ((C4Kv) this).A0B;
                        if (str.charAt(0) == '0' && (str.charAt(1) == 'x' || str.charAt(1) == 'X')) {
                            long parseLong = Long.parseLong(str.substring(2), 16);
                            int length = str.length();
                            if (length == 8) {
                                parseLong |= -16777216;
                            } else if (length != 10) {
                                throw new IllegalArgumentException("Unknown color");
                            }
                            c92204Hy2.setCardNumberTextColor((int) parseLong);
                        } else {
                            throw new IllegalArgumentException("Unknown color");
                        }
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder("PAY: Could not apply label color: ");
                        sb.append(str);
                        Log.w(sb.toString(), e);
                    }
                }
            }
            if (!c0n8.A0R) {
                ((C4KP) this).A01.setVisibility(8);
            }
            String str2 = c0n8.A0I;
            switch (str2.hashCode()) {
                case -1757659853:
                    if (!str2.equals("VOIDED")) {
                        return;
                    }
                    break;
                case -591252731:
                    if (!str2.equals("EXPIRED")) {
                        return;
                    }
                    break;
                case 1124965819:
                    if (!str2.equals("SUSPENDED")) {
                        return;
                    }
                    A1X(3);
                    C92194Hx c92194Hx = ((C4Kv) this).A0A;
                    if (c92194Hx == null) {
                        return;
                    }
                    c92194Hx.setAlertButtonClickListener(new C3QY(this));
                    return;
                case 1925346054:
                    if (!str2.equals("ACTIVE")) {
                        return;
                    }
                    if ("REQUIRES_VERIFICATION".equals(c0n8.A0M)) {
                        A1X(4);
                        C92194Hx c92194Hx2 = ((C4Kv) this).A0A;
                        if (c92194Hx2 == null) {
                            return;
                        }
                        c92194Hx2.setAlertButtonClickListener(new C3OL(this, ((C4KP) this).A07.A07));
                        return;
                    } else if (!c0n8.A0X && c0n8.A0W) {
                        A1X(1);
                        C92194Hx c92194Hx3 = ((C4Kv) this).A0A;
                        if (c92194Hx3 == null) {
                            return;
                        }
                        c92194Hx3.setAlertButtonClickListener(new C3OL(this, ((C4KP) this).A07.A07));
                        return;
                    } else if (c0n8.A07 == null || C02620Cd.A00(this.A01.A05(), c0n8.A07.longValue()) > 30) {
                        return;
                    } else {
                        A1X(2);
                        c0n8.A07 = 0L;
                        this.A0A.A01().A02(((C4KP) this).A07, null);
                        return;
                    }
                default:
                    return;
            }
            A1X(0);
            C92194Hx c92194Hx4 = ((C4Kv) this).A0A;
            if (c92194Hx4 == null) {
                return;
            }
            c92194Hx4.setAlertButtonClickListener(new C3QX(this));
        }
    }

    @Override // X.C4KP
    public void A1V(boolean z) {
        if (Build.VERSION.SDK_INT >= 23 && this.A0C.A05() && this.A0C.A01() == 1) {
            FingerprintBottomSheet A00 = FingerprintBottomSheet.A00(R.string.payment_bio_bottom_sheet_title, R.string.cancel, R.string.use_payments_pin, R.layout.pay_header);
            byte[] A03 = C05V.A03(this.A01, this.A00, false);
            if (A03 != null) {
                String A032 = C02A.A03(A03);
                A00.A04 = new C4H7(this.A01, this.A0E, this, A00, new C90804Cm(this.A01, this.A00, this.A08, this.A0C, A032, ((C4KP) this).A07.A07), new C4DA(this, A00, A032));
                AUh(A00);
                return;
            }
            throw null;
        }
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = new PinBottomSheetDialogFragment();
        pinBottomSheetDialogFragment.A0A = new C90834Cp();
        pinBottomSheetDialogFragment.A0B = new C4D8(this, pinBottomSheetDialogFragment);
        AUh(pinBottomSheetDialogFragment);
    }

    public /* synthetic */ void A1Z(String str) {
        A12(R.string.payment_get_verify_card_data);
        new C896447w(this.A01, this, ((ActivityC02290Ap) this).A0A, this.A00, this.A0H, this.A0A, ((ActivityC02290Ap) this).A0D, this.A08, ((C4Kv) this).A09, this.A02, this.A06, this.A07, str).A01(new C4DB(this));
    }

    @Override // X.C4L0, X.C4Kv, X.C4Ki, X.C4KP, X.C4K9, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A05 = new C90454Bb(((ActivityC02310Ar) this).A01, this.A09);
    }
}
