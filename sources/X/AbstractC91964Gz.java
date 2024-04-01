package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.AddPaymentMethodBottomSheet;
import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.BrazilFbPayHubActivity;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilViralityLinkVerifierActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.whatsapp.payments.ui.IndiaUpiResetPinActivity;
import com.whatsapp.payments.ui.IndiaUpiVpaContactInfoActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;

/* renamed from: X.4Gz */
/* loaded from: classes3.dex */
public abstract class AbstractC91964Gz implements C0DX {
    public final C0DV A00;

    @Override // X.C0DX
    public int A9N(String str) {
        return SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
    }

    @Override // X.C0DX
    public Class ABX(Bundle bundle) {
        return null;
    }

    @Override // X.C0DY
    public C0N3 AEq() {
        return null;
    }

    public AbstractC91964Gz(C0DV c0dv) {
        this.A00 = c0dv;
    }

    @Override // X.C0DX
    public boolean A5y() {
        return !(this instanceof C92304Ij);
    }

    @Override // X.C0DX
    public Class A8H() {
        if (!(this instanceof C92304Ij)) {
            return BrazilPayBloksActivity.class;
        }
        return IndiaUpiPaymentsAccountSetupActivity.class;
    }

    @Override // X.C0DX
    public InterfaceC03670Gp A9C() {
        if (this instanceof C92304Ij) {
            return ((C92304Ij) this).A08;
        }
        return null;
    }

    @Override // X.C0DX
    public C47Z A9G() {
        if (this instanceof C92294Ii) {
            return ((C92294Ii) this).A08;
        }
        return null;
    }

    @Override // X.C0DX
    public AbstractC27991Pp A9Z() {
        if (this instanceof C92304Ij) {
            C92304Ij c92304Ij = (C92304Ij) this;
            return new C4CZ(c92304Ij.A00, c92304Ij.A01, c92304Ij.A0K, c92304Ij.A0J, ((AbstractC91964Gz) c92304Ij).A00, c92304Ij.A0I, c92304Ij.A02, c92304Ij.A0B, c92304Ij.A0F, c92304Ij.A0C, c92304Ij.A0D, c92304Ij.A0E);
        }
        return null;
    }

    @Override // X.C0DX
    public C02590Ca ABU(C466327p c466327p) {
        return new C02590Ca("money", new C04P[]{new C04P("value", c466327p.A01()), new C04P("offset", c466327p.A00), new C04P("currency", c466327p.A01.A9K(), null, (byte) 0)}, null, null);
    }

    @Override // X.C0DX
    public C02590Ca ABw(AnonymousClass094 anonymousClass094, AnonymousClass093 anonymousClass093) {
        C466327p c466327p;
        C0K8 c0k8 = anonymousClass093.A09;
        if (anonymousClass093.A0O() || c0k8 == null || (c466327p = c0k8.A00) == null) {
            return null;
        }
        return new C02590Ca("amount", new C04P[0], ABU(c466327p));
    }

    @Override // X.C0DX
    public List ABx(AnonymousClass094 anonymousClass094, AnonymousClass093 anonymousClass093) {
        C0DX c0dx;
        C47Z c47z;
        C0N0 c0n0;
        String str;
        String str2;
        C04P c04p = null;
        if (anonymousClass093.A0O()) {
            ArrayList arrayList = new ArrayList();
            C000200d.A1A("type", "request", arrayList);
            if (C003101m.A0U(anonymousClass094.A00)) {
                UserJid userJid = anonymousClass093.A0C;
                if (userJid != null) {
                    arrayList.add(new C04P("sender", userJid));
                } else {
                    throw null;
                }
            }
            String str3 = anonymousClass093.A0I;
            if (str3 != null) {
                C000200d.A1A("request-id", str3, arrayList);
            }
            C0K8 c0k8 = anonymousClass093.A09;
            if (c0k8 != null) {
                arrayList.add(new C04P("expiry-ts", Long.toString(c0k8.A07() / 1000), null, (byte) 0));
            }
            if (!TextUtils.isEmpty(anonymousClass093.A0E)) {
                String str4 = anonymousClass093.A0E;
                arrayList.add(new C04P("country", str4, null, (byte) 0));
                arrayList.add(new C04P("version", AnonymousClass093.A01(str4)));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C04P("type", "send", null, (byte) 0));
        arrayList2.add(new C04P("transaction-type", anonymousClass093.A02 == 100 ? "p2m" : "p2p", null, (byte) 0));
        if (C003101m.A0U(anonymousClass094.A00)) {
            UserJid userJid2 = anonymousClass093.A0B;
            if (userJid2 != null) {
                arrayList2.add(new C04P("receiver", userJid2));
            } else {
                throw null;
            }
        }
        ArrayList arrayList3 = anonymousClass093.A0L;
        if (arrayList3 != null && arrayList3.size() == 1) {
            arrayList2.add(new C04P("credential-id", ((C468128j) arrayList3.get(0)).A01.A07, null, (byte) 0));
        }
        C0K8 c0k82 = anonymousClass093.A09;
        if (c0k82 != null) {
            c0k82.A02(0, arrayList2);
        }
        if (AnonymousClass093.A0A(anonymousClass093.A0I)) {
            String str5 = anonymousClass093.A0I;
            if (str5 != null) {
                arrayList2.add(new C04P("id", str5, null, (byte) 0));
            } else {
                throw null;
            }
        }
        if (anonymousClass093.A0K != null) {
            C0DV c0dv = this.A00;
            c0dv.A04();
            AnonymousClass093 A0P = c0dv.A07.A0P(anonymousClass093.A0K, null);
            if (A0P != null && (str2 = A0P.A0I) != null) {
                C000200d.A1A("request-id", str2, arrayList2);
            }
        }
        if (!TextUtils.isEmpty(anonymousClass093.A0E)) {
            String str6 = anonymousClass093.A0E;
            arrayList2.add(new C04P("country", str6, null, (byte) 0));
            arrayList2.add(new C04P("version", String.valueOf(AnonymousClass093.A01(str6)), null, (byte) 0));
        }
        InterfaceC03590Gh A02 = this.A00.A02(anonymousClass093.A0E);
        if (A02 != null) {
            c0dx = A02.ACJ(anonymousClass093.A0G);
        } else {
            c0dx = null;
        }
        if (c0dx != null) {
            c47z = c0dx.A9G();
        } else {
            c47z = null;
        }
        if (c47z != null) {
            C0N7 c0n7 = (C0N7) c47z.A00.A08(anonymousClass093.A0F);
            if (c0n7 != null && (c0n0 = c0n7.A06) != null) {
                C92224Ib c92224Ib = (C92224Ib) c0n0;
                String A01 = c47z.A02.A01(c0n7.A01);
                if ("VISA".equals(c92224Ib.A03)) {
                    C47Y c47y = c47z.A01;
                    String str7 = c92224Ib.A06;
                    if (c47y != null) {
                        try {
                            str = c47y.A04(c47y.A05(A01, true), C47Y.A01(A01, null, str7));
                        } catch (JSONException e) {
                            Log.w("PAY: generateTrustedDeviceInfoJwsToken threw creating json string: ", e);
                            str = null;
                        }
                        if (str != null) {
                            c04p = new C04P("trusted-device-info", str, null, (byte) 0);
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
        if (c04p != null) {
            arrayList2.add(c04p);
        }
        return arrayList2;
    }

    @Override // X.C0DX
    public C3ZU ABz(C002301c c002301c) {
        return new AnonymousClass396(c002301c);
    }

    @Override // X.C0DX
    public Class AC4() {
        if (this instanceof C92294Ii) {
            return BrazilFbPayHubActivity.class;
        }
        return null;
    }

    @Override // X.C0DX
    public Class AC6() {
        return PaymentTransactionHistoryActivity.class;
    }

    @Override // X.C0DX
    public int AC8() {
        if (this instanceof C92304Ij) {
            return R.string.india_upi_payment_id_name;
        }
        return 0;
    }

    @Override // X.C0DX
    public Pattern AC9() {
        if (this instanceof C92304Ij) {
            return C4AU.A02;
        }
        return null;
    }

    @Override // X.C0DX
    public C3NU ACB() {
        if (this instanceof C92304Ij) {
            return new C3NU() { // from class: X.4Bj
                @Override // X.C3NU
                public int ACI() {
                    return 3;
                }

                @Override // X.C3NU
                public DialogFragment ACA(ArrayList arrayList, boolean z) {
                    PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
                    IndiaUpiPaymentInviteFragment indiaUpiPaymentInviteFragment = new IndiaUpiPaymentInviteFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("payment_service", 3);
                    bundle.putParcelableArrayList("user_jids", arrayList);
                    bundle.putBoolean("requires_sync", z);
                    indiaUpiPaymentInviteFragment.A0P(bundle);
                    paymentBottomSheet.A01 = indiaUpiPaymentInviteFragment;
                    return paymentBottomSheet;
                }
            };
        }
        return null;
    }

    @Override // X.C0DX
    public Class ACE() {
        if (this instanceof C92304Ij) {
            return IndiaUpiVpaContactInfoActivity.class;
        }
        return null;
    }

    @Override // X.C0DX
    public int ACF() {
        if (this instanceof C92304Ij) {
            return R.string.india_upi_payment_pin_name;
        }
        return 0;
    }

    @Override // X.C0DX
    public C3NW ACG() {
        if (this instanceof C92304Ij) {
            return new C90554Bl(((C92304Ij) this).A0A);
        }
        return null;
    }

    @Override // X.C0DX
    public Class ACM() {
        if (this instanceof C92294Ii) {
            return BrazilViralityLinkVerifierActivity.class;
        }
        return null;
    }

    @Override // X.C0DX
    public Class ACO() {
        if (this instanceof C92304Ij) {
            return IndiaUpiResetPinActivity.class;
        }
        return null;
    }

    @Override // X.C0DX
    public C27801Ov ADl(UserJid userJid, C0TN c0tn) {
        if (!(this instanceof C92294Ii) || c0tn == null || TextUtils.isEmpty(c0tn.A04)) {
            return null;
        }
        return new C27801Ov(userJid, new Pair(Boolean.TRUE, c0tn.A04), new HashMap());
    }

    @Override // X.C0DY
    public C0N8 AEm() {
        if (this instanceof C92294Ii) {
            return new C92224Ib();
        }
        return null;
    }

    @Override // X.C0DY
    public AbstractC466427q AEo() {
        if (this instanceof C92294Ii) {
            return new C92234Ic();
        }
        return null;
    }

    @Override // X.C0DX
    public void AGt(Context context, C0B5 c0b5, AnonymousClass092 anonymousClass092) {
        if (!(this instanceof C92294Ii)) {
            if (anonymousClass092.A0F != null) {
                Intent intent = new Intent(context, A8H());
                intent.putExtra("extra_setup_mode", 2);
                intent.putExtra("extra_receive_nux", true);
                if (anonymousClass092.A0F.A09 != null && !TextUtils.isEmpty(null)) {
                    intent.putExtra("extra_onboarding_provider", (String) null);
                }
                context.startActivity(intent);
                return;
            }
            throw null;
        }
        C92294Ii c92294Ii = (C92294Ii) this;
        String A02 = c92294Ii.A0E.A02(true);
        if (A02 != null) {
            Intent intent2 = new Intent(context, BrazilPayBloksActivity.class);
            intent2.putExtra("screen_name", A02);
            C47V.A00(intent2, "get_started");
            C90854Cr c90854Cr = new C90854Cr(intent2, null, c92294Ii.A06.A06(R.string.accept_payment_add_debit_bottom_sheet_desc), null);
            AddPaymentMethodBottomSheet addPaymentMethodBottomSheet = new AddPaymentMethodBottomSheet();
            addPaymentMethodBottomSheet.A0P(new Bundle());
            addPaymentMethodBottomSheet.A04 = c90854Cr;
            addPaymentMethodBottomSheet.A05 = new C3O2(addPaymentMethodBottomSheet);
            c0b5.AUh(addPaymentMethodBottomSheet);
            return;
        }
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A01 = new BrazilConfirmReceivePaymentFragment();
        c0b5.AUh(paymentBottomSheet);
    }

    @Override // X.C0DX
    public boolean AUP() {
        return this instanceof C92294Ii;
    }
}
