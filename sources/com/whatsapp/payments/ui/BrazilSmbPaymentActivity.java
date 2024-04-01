package com.whatsapp.payments.ui;

import X.ActivityC02290Ap;
import X.AnonymousClass012;
import X.C000200d;
import X.C011305p;
import X.C013306k;
import X.C013406l;
import X.C014006r;
import X.C014406v;
import X.C02620Cd;
import X.C0CD;
import X.C0CE;
import X.C3OW;
import X.C3OX;
import X.C3OY;
import X.C4AR;
import X.C4KG;
import X.C4L2;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.util.AbstractCollection;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class BrazilSmbPaymentActivity extends C4L2 {
    public AnonymousClass012 A00;
    public C013306k A01;
    public C013406l A02;
    public C4AR A03;

    public void A1h(Pair pair, String str, C014006r c014006r) {
        ArrayList arrayList;
        SharedPreferences sharedPreferences;
        if (((AbstractCollection) this.A02.A09()).isEmpty()) {
            C013306k c013306k = this.A01;
            Integer[] numArr = {106, 405};
            if (c013306k != null) {
                String A0L = C000200d.A0L(C000200d.A0P("status IN (\""), TextUtils.join("\",\"", numArr), "\")");
                c013306k.A0h();
                C0CD A03 = c013306k.A04.A03();
                try {
                    C0CE c0ce = A03.A02;
                    String str2 = c013306k.A0h() ? "pay_transaction" : "pay_transactions";
                    String[] strArr = c013306k.A0h() ? C013306k.A0A : C013306k.A09;
                    StringBuilder sb = new StringBuilder();
                    sb.append(1);
                    sb.append("");
                    Cursor A0A = c0ce.A0A(str2, strArr, A0L, null, null, sb.toString());
                    if (A0A != null) {
                        arrayList = new ArrayList(A0A.getCount());
                        while (A0A.moveToNext()) {
                            try {
                                arrayList.add(c013306k.A0K(A0A));
                            } catch (C011305p e) {
                                c013306k.A08.A08("readTransactionsByStatus/InvalidJidException - Skipped transaction with invalid JID", e);
                            }
                        }
                        C014406v c014406v = c013306k.A08;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("readTransactionsByStatus returned: ");
                        sb2.append(arrayList.size());
                        c014406v.A07(null, sb2.toString(), null);
                        A0A.close();
                    } else {
                        A03.close();
                        arrayList = new ArrayList();
                    }
                    if (!arrayList.isEmpty()) {
                        C4AR c4ar = this.A03;
                        long A05 = this.A00.A05();
                        int intValue = pair != null ? 1 + ((Number) pair.second).intValue() : 1;
                        synchronized (c4ar) {
                            sharedPreferences = c4ar.A00;
                            if (sharedPreferences == null) {
                                sharedPreferences = c4ar.A01.A01("com.whatsapp_br_payment_preferences");
                                c4ar.A00 = sharedPreferences;
                            }
                        }
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(A05);
                        sb3.append(":");
                        sb3.append(intValue);
                        edit.putString("br_payment_smb_up_sell_nudge_timestamp", sb3.toString()).apply();
                        ((ActivityC02290Ap) this).A0A.A02.post(new C3OY(this, str, c014006r));
                        return;
                    }
                } finally {
                }
            } else {
                throw null;
            }
        }
        ((ActivityC02290Ap) this).A0A.A02.post(new C3OW(this, str, c014006r));
    }

    public void A1i(String str, C014006r c014006r) {
        BrazilSmbMerchantNuxUpSellBottomSheet brazilSmbMerchantNuxUpSellBottomSheet = new BrazilSmbMerchantNuxUpSellBottomSheet();
        Bundle bundle = new Bundle();
        bundle.putParcelable("AMOUNT", c014006r);
        bundle.putString("AMOUNT_STR", str);
        brazilSmbMerchantNuxUpSellBottomSheet.A0P(bundle);
        AUh(brazilSmbMerchantNuxUpSellBottomSheet);
    }

    public void A1j(String str, C014006r c014006r) {
        super.ANx(str, c014006r);
    }

    public /* synthetic */ void A1k(String str, C014006r c014006r) {
        super.ANx(str, c014006r);
    }

    @Override // com.whatsapp.payments.ui.BrazilPaymentActivity, X.C4AG
    public void ANx(String str, C014006r c014006r) {
        SharedPreferences sharedPreferences;
        Pair pair;
        C4AR c4ar = this.A03;
        synchronized (c4ar) {
            sharedPreferences = c4ar.A00;
            if (sharedPreferences == null) {
                sharedPreferences = c4ar.A01.A01("com.whatsapp_br_payment_preferences");
                c4ar.A00 = sharedPreferences;
            }
        }
        String string = sharedPreferences.getString("br_payment_smb_up_sell_nudge_timestamp", "");
        if (!TextUtils.isEmpty(string)) {
            String[] split = string.split(":");
            if (split.length == 2) {
                pair = new Pair(Long.valueOf(Long.parseLong(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
                if (C02620Cd.A00(((Number) pair.first).longValue(), this.A00.A05()) <= 30 || ((Number) pair.second).intValue() >= 3) {
                    super.ANx(str, c014006r);
                    return;
                }
                ((C4KG) this).A0K.AS1(new C3OX(this, pair, str, c014006r));
            }
        }
        pair = null;
        ((C4KG) this).A0K.AS1(new C3OX(this, pair, str, c014006r));
    }
}
