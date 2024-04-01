package org.npci.commonlibrary;

import X.C02160Ac;
import X.C02180Ae;
import X.C4B3;
import X.C4B7;
import X.C4BA;
import X.C4BB;
import X.C4BK;
import X.C4BR;
import X.C4GF;
import X.C4GH;
import X.C90404Aw;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class PinFragment extends NPCIFragment implements C4BR {
    public int A00 = 0;
    public Boolean A01 = null;
    public final HashMap A03 = new HashMap();
    public boolean A02 = false;

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.npci_fragment_pin, viewGroup, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
        if (r0.booleanValue() != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014f, code lost:
        if (r12.equals("OTP") != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0156, code lost:
        if (r12.equals("SMS") != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015d, code lost:
        if (r12.equals("HOTP") != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0170, code lost:
        if (r12.equals("TOTP") != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0177, code lost:
        if (r12.equals("EMAIL") != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0179, code lost:
        r0 = ((org.npci.commonlibrary.NPCIFragment) r21).A0B.A06(com.google.android.search.verification.client.R.string.npci_otp_title);
        ((org.npci.commonlibrary.NPCIFragment) r21).A00 = r3;
     */
    @Override // org.npci.commonlibrary.NPCIFragment, X.C0BA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0w(android.view.View r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.commonlibrary.PinFragment.A0w(android.view.View, android.os.Bundle):void");
    }

    public final void A12() {
        C4BA c4ba;
        C4GH c4gh;
        String inputValue;
        int i = ((NPCIFragment) this).A00;
        if (i != -1) {
            ArrayList arrayList = ((NPCIFragment) this).A0C;
            if ((arrayList.get(i) instanceof C4GH) && ((inputValue = (c4gh = (C4GH) arrayList.get(i)).getInputValue()) == null || inputValue.length() != c4gh.A00)) {
                A10(c4gh, ((NPCIFragment) this).A0B.A06(R.string.npci_invalid_otp));
                return;
            }
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = ((NPCIFragment) this).A0C;
            if (i2 < arrayList2.size()) {
                if (arrayList2.get(i2) instanceof C4GH) {
                    C4GH c4gh2 = (C4GH) arrayList2.get(i2);
                    if (c4gh2.getInputValue().length() != c4gh2.A00) {
                        A10(c4gh2, ((NPCIFragment) this).A0B.A06(R.string.npci_component_message));
                        return;
                    }
                }
                i2++;
            } else if (this.A02) {
                return;
            } else {
                this.A02 = true;
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    try {
                        JSONObject jSONObject = (JSONObject) ((C4BK) arrayList2.get(i3)).getFormDataTag();
                        String string = jSONObject.getString("type");
                        String string2 = jSONObject.getString("subtype");
                        ((NPCIFragment) this).A09.put("credential", ((C4BK) arrayList2.get(i3)).getInputValue());
                        String A00 = ((GetCredential) ((NPCIFragment) this).A01).A0A.A04.A00(((NPCIFragment) this).A09);
                        C90404Aw c90404Aw = ((GetCredential) ((NPCIFragment) this).A01).A0A;
                        C4B7 c4b7 = c90404Aw.A01;
                        if (c4b7 == null && (c4ba = c90404Aw.A05) != null) {
                            C4B3 c4b3 = c4ba.A03;
                            c90404Aw.A00 = c4b3;
                            c4b7 = new C4B7(c4b3, c4ba.A00);
                            c90404Aw.A01 = c4b7;
                        }
                        C4BB A002 = c4b7.A00(A0a(), A00, string, string2, ((NPCIFragment) this).A09);
                        if (A002 != null) {
                            HashMap hashMap = this.A03;
                            StringBuilder sb = new StringBuilder();
                            C02180Ae.A1C(A002, sb);
                            hashMap.put(string2, sb.toString());
                        }
                    } catch (JSONException e) {
                        throw new RuntimeException(e);
                    }
                }
                Intent intent = new Intent();
                intent.putExtra("credBlocks", this.A03);
                ((Activity) ((NPCIFragment) this).A01).setResult(250, intent);
                ((Activity) ((NPCIFragment) this).A01).finish();
                return;
            }
        }
    }

    @Override // X.C4BR
    public void AKb(int i) {
        if (((NPCIFragment) this).A0C.get(i) instanceof C4GF) {
            return;
        }
        this.A00 = i;
    }

    @Override // X.C4BR
    public void AKc(int i, String str) {
        int i2 = ((NPCIFragment) this).A00;
        if (i2 != -1 && i2 == i) {
            ArrayList arrayList = ((NPCIFragment) this).A0C;
            if (arrayList.get(i2) instanceof C4GH) {
                ((C4GH) arrayList.get(((NPCIFragment) this).A00)).A02(false);
                ((C4GH) arrayList.get(((NPCIFragment) this).A00)).A01("", false);
                C4GH c4gh = (C4GH) arrayList.get(((NPCIFragment) this).A00);
                Drawable A03 = C02160Ac.A03(A09(), R.drawable.ic_tick_ok);
                if (A03 != null) {
                    c4gh.A03.setImageDrawable(A03);
                }
                c4gh.A00(c4gh.A03, true);
            }
        }
    }

    @Override // X.C4BR
    public void AKd(View view, String str) {
        A10(view, str);
    }
}
